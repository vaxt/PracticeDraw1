package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    Paint paint;

    public Practice5DrawOvalView(Context context) {
        super(context);
        paint = new Paint();
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        int leftRadius = 300;
        int topRadius = 100;

        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        float left = getMeasuredWidth() / 2 - leftRadius;
        float top = getMeasuredHeight() / 4 - topRadius;
        float right = getMeasuredWidth() / 2 + leftRadius;
        float bottom = getMeasuredHeight() / 4 + topRadius;
        canvas.drawOval(left, top, right, bottom, paint);

    }
}
