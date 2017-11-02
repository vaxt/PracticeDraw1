package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {
    Paint paint;

    public Practice3DrawRectView(Context context) {
        super(context);
        paint = new Paint();
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形
        paint.setColor(Color.BLACK);
        int radius = getMeasuredWidth() / 5;
        int left = getMeasuredWidth() / 2 - radius;
        int right = getMeasuredWidth() / 2 + radius;
        int top = getMeasuredHeight() / 4 - radius + 30;
        int bottom = getMeasuredHeight() / 4 + radius+ 30;
        canvas.drawRect(left, top, right, bottom, paint);

    }
}
