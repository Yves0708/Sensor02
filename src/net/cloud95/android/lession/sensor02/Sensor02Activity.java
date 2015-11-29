package net.cloud95.android.lession.sensor02;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.SeekBar;
import android.widget.TextView;

public class Sensor02Activity extends Activity {

    private TextView direction_text;
    private SeekBar horizontal_value, vertical_value;
    
    private SensorManager manager;
    private Sensor sMagentic, sAccelerometer;
    private MySensorEventListener listener;
    
    // 記錄地磁與加速度資訊的陣列物件
    private float[] magenticValues = new float[3];
    private float[] accelerometerValues = new float[3];
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor02);
        
        direction_text = (TextView)findViewById(R.id.direction_text);
        horizontal_value = (SeekBar)findViewById(R.id.horizontal_value);
        vertical_value = (SeekBar)findViewById(R.id.vertical_value);
        
        // 註冊觸控監聽事件，讓SeekBar不能操作

        // 取得感應器設備管理員物件
        // 取得加速度感應器設備
        // 取得磁場感應器設備
        // 建立感應器設備改變監聽物件
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 註冊感應器設備改變監聽事件，兩種感應器共用同一個監聽物件
    }
    
    @Override
    protected void onPause() {
        // 移除感應器設備改變監聽事件
        super.onPause();
    }
    
    // 感應器設備改變監聽類別
    private class MySensorEventListener implements SensorEventListener {
    
        @Override
        public void onAccuracyChanged(Sensor sensor, int value) {
            
        }
    
        @Override
        public void onSensorChanged(SensorEvent event) {
            // 取得感應設備種類
                // 取得加速度感應器資訊
                // 取得磁場感應器資訊
            // 準備轉換資料用的陣列變數
            // 儲存轉換後資料
            // 儲存轉換為角度的資料
            // 先取得裝置旋轉資訊
            // 轉換為方向與傾斜度資訊
            // 轉換為角度整數
            // 顯示方向，0：北、90：東、180與-180：南、-90：西
            // 設定SeekBar元件顯示前後傾斜度
            // 設定SeekBar元件顯示左右傾斜度
        }
        
    }
    
    // 讓SeekBar不能操作的觸控監聽類別
    private class NoTouchListener implements OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
        }
    }
    
}
