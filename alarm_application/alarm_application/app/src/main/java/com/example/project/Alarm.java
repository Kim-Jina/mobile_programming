package com.example.project;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alarm extends Activity implements OnDateChangedListener {
    private Document doc=null;
    private RadioButton rdoCal, rdoTime, rdorTime, rdoSub;
    private AlarmManager m_Manager;
    private GregorianCalendar m_Calendar;
    private DatePicker m_Date;
    private TimePicker m_Time;
    private NotificationManager m_Notification;
    private Button m_set, m_reset;
    private TextView m_rTime, m_start, m_end;
    private EditText m_trTime, m_tstart, m_tend;
    private String p_start, p_end;
    int hour, minute;
    int s_time,r_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("지각 방지");
        setContentView(R.layout.activity_alarm);
        rdoCal=(RadioButton)findViewById(R.id.rdoCal);
        rdoTime=(RadioButton)findViewById(R.id.rdoTime);
        rdorTime=(RadioButton)findViewById(R.id.rdorTime);
        rdoSub=(RadioButton)findViewById(R.id.rdoSub);
        m_Time=(TimePicker)findViewById(R.id.time_picker);
        m_Date=(DatePicker)findViewById(R.id.date_picker);
        m_rTime=(TextView)findViewById(R.id.r_time);
        m_trTime=(EditText)findViewById(R.id.t_r_time);
        m_start=(TextView)findViewById(R.id.start);
        m_end=(TextView)findViewById(R.id.end);
        m_tstart=(EditText)findViewById(R.id.t_start);
        m_tend=(EditText)findViewById(R.id.t_end);
        m_Notification=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        m_Manager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
        m_Calendar=new GregorianCalendar();
        Log.i("HelloAlarmActivity",m_Calendar.getTime().toString());
        m_set=(Button)findViewById(R.id.set);
        m_reset=(Button)findViewById(R.id.reset);
        m_Time.setVisibility(View.INVISIBLE);
        m_rTime.setVisibility(View.INVISIBLE);
        m_trTime.setVisibility(View.INVISIBLE);
        m_Date.setVisibility(View.INVISIBLE);
        m_start.setVisibility(View.INVISIBLE);
        m_end.setVisibility(View.INVISIBLE);
        m_tstart.setVisibility(View.INVISIBLE);
        m_tend.setVisibility(View.INVISIBLE);
        rdoCal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                m_Time.setVisibility(View.INVISIBLE);
                m_rTime.setVisibility(View.INVISIBLE);
                m_trTime.setVisibility(View.INVISIBLE);
                m_Date.setVisibility(View.VISIBLE);
                m_start.setVisibility(View.INVISIBLE);
                m_end.setVisibility(View.INVISIBLE);
                m_tstart.setVisibility(View.INVISIBLE);
                m_tend.setVisibility(View.INVISIBLE);
            }
        });
        rdoTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                m_Time.setVisibility(View.VISIBLE);
                m_rTime.setVisibility(View.INVISIBLE);
                m_trTime.setVisibility(View.INVISIBLE);
                m_Date.setVisibility(View.INVISIBLE);
                m_start.setVisibility(View.INVISIBLE);
                m_end.setVisibility(View.INVISIBLE);
                m_tstart.setVisibility(View.INVISIBLE);
                m_tend.setVisibility(View.INVISIBLE);
            }
        });
        rdorTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                m_Time.setVisibility(View.INVISIBLE);
                m_rTime.setVisibility(View.VISIBLE);
                m_trTime.setVisibility(View.VISIBLE);
                m_Date.setVisibility(View.INVISIBLE);
                m_start.setVisibility(View.INVISIBLE);
                m_end.setVisibility(View.INVISIBLE);
                m_tstart.setVisibility(View.INVISIBLE);
                m_tend.setVisibility(View.INVISIBLE);
            }
        });
        rdoSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                m_Time.setVisibility(View.INVISIBLE);
                m_rTime.setVisibility(View.INVISIBLE);
                m_trTime.setVisibility(View.INVISIBLE);
                m_Date.setVisibility(View.INVISIBLE);
                m_start.setVisibility(View.VISIBLE);
                m_end.setVisibility(View.VISIBLE);
                m_tstart.setVisibility(View.VISIBLE);
                m_tend.setVisibility(View.VISIBLE);
            }
        });
        m_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setAlarm();
            }
        });
        m_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAlarm();
            }
        });
        m_Date.init(m_Calendar.get(Calendar.YEAR), m_Calendar.get(Calendar.MONTH), m_Calendar.get(Calendar.DAY_OF_MONTH), this);
        m_Time.setCurrentHour(m_Calendar.get(Calendar.HOUR_OF_DAY));
        m_Time.setCurrentMinute(m_Calendar.get(Calendar.MINUTE));
        m_Time.setOnTimeChangedListener(new OnTimeChangedListener(){
            public void onTimeChanged(TimePicker view,int c_hour,int c_minute){
                m_Calendar.set(m_Date.getYear(),m_Date.getMonth(),m_Date.getDayOfMonth(),hour,minute);
                hour=c_hour;
                minute=c_minute;
                Log.i("TimeChanged",m_Calendar.getTime().toString());
            }
        });
        if(Build.VERSION.SDK_INT>9){
            StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
    }

    public void xmlParsing(){
        String tagName="";
        try{
            String s_point= URLEncoder.encode(p_start,"UTF-8");
            String e_point=URLEncoder.encode(p_end,"UTF-8");
            URL url=new URL("http://swopenapi.seoul.go.kr/api/subway/4a504c73496b696d3130384265615550/xml/shortestRoute/0/5/" + s_point + "/" + e_point);
            XmlPullParserFactory factory=XmlPullParserFactory.newInstance();
            XmlPullParser parser=factory.newPullParser();
            parser.setInput(url.openStream(),"euc-kr");
            int eventType=parser.getEventType();
            boolean isItemTag=false;
            while(eventType!=XmlPullParser.END_DOCUMENT){
                tagName=parser.getName();
                if(eventType==XmlPullParser.START_TAG){
                    if (tagName.equals("shtTravelTm"))
                        isItemTag=true;
                }else if(eventType==XmlPullParser.TEXT) {
                    if(isItemTag==true){
                        s_time = Integer.parseInt(parser.getText());
                        break;
                    }
                }
                else if(eventType==XmlPullParser.END_TAG)
                    s_time=0;
                eventType=parser.next();
            }
        } catch (Exception e){
            Toast.makeText(Alarm.this,e.toString(),Toast.LENGTH_LONG).show();
        }
    }

    private void setAlarm(){
        int t_time,t_hour,t_minute;
        p_start=m_tstart.getText().toString();
        p_end=m_tend.getText().toString();
        xmlParsing();
        r_time=Integer.parseInt(m_trTime.getText().toString());
        Intent intent=new Intent(getApplicationContext(),AlarmReceiver.class);
        PendingIntent sender=PendingIntent.getBroadcast(Alarm.this,0,intent,0);
        AlarmManager am=(AlarmManager)getSystemService(ALARM_SERVICE);
        t_time=hour*60+minute-r_time-s_time;
        t_hour=t_time/60;
        t_minute=t_time%60;
        m_Calendar.set(Calendar.HOUR_OF_DAY,t_hour);
        m_Calendar.set(Calendar.MINUTE,t_minute);
        m_Calendar.set(Calendar.SECOND,0);
        am.setRepeating(AlarmManager.RTC_WAKEUP, m_Calendar.getTimeInMillis(), 0, sender);
        String ring_hour=t_hour+"";
        String ring_min=t_minute+"";
        Toast.makeText(Alarm.this,ring_hour+":"+ring_min,Toast.LENGTH_LONG).show();
        Log.i("AlarmSet",m_Calendar.getTime().toString());
    }

    private void resetAlarm(){
        Intent intent=new Intent();
        Toast.makeText(Alarm.this,"ALARM OFF",Toast.LENGTH_SHORT).show();
        m_Manager.cancel(pendingIntent());
    }

    private PendingIntent pendingIntent(){
        Intent i=new Intent(getApplicationContext(),Alarm.class);
        PendingIntent pi=PendingIntent.getActivity(this,0,i,0);
        return pi;
    }

    public void onDateChanged(DatePicker view, int year, int month, int day){
        m_Calendar.set(year,month,day,m_Time.getCurrentHour(),m_Time.getCurrentMinute());
        Log.i("DataChanged",m_Calendar.getTime().toString());
    }
}
