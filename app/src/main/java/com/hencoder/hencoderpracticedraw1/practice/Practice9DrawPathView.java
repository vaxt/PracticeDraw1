package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class Practice9DrawPathView extends View {

    Paint paint = new Paint();
    Path path = new Path();

    {
        path.addArc(100, 100, 200, 200, -225, 225);
        path.arcTo(200, 100, 300, 200, -180, 225, false);
        path.lineTo(200, 270);
    }

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        paint.setAntiAlias(true);
        canvas.drawPath(path,paint);
    }
}
