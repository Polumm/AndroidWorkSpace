package com.example.demo1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;
import androidx.appcompat.app.AppCompatActivity;
//注意import开发所需的库

public class MainActivity extends AppCompatActivity {
    //首先，需要MapView指针随时调用我们的地图
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化上下文
        SDKInitializer.initialize(getApplicationContext());
        //初始化坐标系
        SDKInitializer.setCoordType(CoordType.BD09LL);
        //设置布局
        setContentView(R.layout.activity_main);
        mMapView = (MapView) findViewById(R.id.bmapView);
    }
}
