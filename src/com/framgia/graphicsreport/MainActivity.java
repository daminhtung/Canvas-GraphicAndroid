package com.framgia.graphicsreport;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Paint paint = new Paint();
//        paint.setColor(Color.parseColor("#CD5CD5"));
//        Bitmap bg = Bitmap.createBitmap(300,300, Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas(bg); 
//        int left = 100;
//        int top = left;
//        int right = 200;
//        int bottom = right;
//        canvas.drawRect(left, top, right, bottom, paint); 
//        LinearLayout ll = (LinearLayout) findViewById(R.id.drawer);
//        ll.setBackgroundDrawable(new BitmapDrawable(bg));  
        
        setContentView(new DrawView(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public class DrawView extends View {
        public DrawView(Context context) {
             super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
           // TODO Auto-generated method stub
           super.onDraw(canvas);
           Paint paint = new Paint();
           paint.setStyle(Paint.Style.FILL);
           paint.setColor(Color.WHITE);
           canvas.drawPaint(paint);
           
           int left = 100;
           int top = left;
           int right = 200;
           int bottom = right;
           paint.setColor(Color.parseColor("#CD5C5C"));
           canvas.drawRect(new Rect(left, top, right, bottom), paint);
           
           canvas.drawCircle(0, 0, 50, paint);
       }
    }
}
