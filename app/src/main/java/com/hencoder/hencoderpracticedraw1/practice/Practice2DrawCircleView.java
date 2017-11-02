package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {


    Paint paint;

    public Practice2DrawCircleView(Context context) {
        super(context);
        paint = new Paint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        paint.setAntiAlias(true);
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        float radius = (width / 6.5f);
        float x = width / 3;
        float y = height / 2 - radius - 10;
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x, y, radius, paint);

        paint.setColor(Color.BLUE);
        paint.setAlpha((int) (255 * 0.6));
        y = height / 2 + radius + 10;
        canvas.drawCircle(x, y, radius, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setColor(Color.BLACK);
        x = width / 3 * 2;
        y = height / 2 - radius - 10;
        canvas.drawCircle(x, y, radius, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        y = height / 2 + radius + 10;
        canvas.drawCircle(x, y, radius, paint);

    }
}
