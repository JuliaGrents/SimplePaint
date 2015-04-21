package ee.juliagrents.simplepaint;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by user_45 on 16.04.2015.
 */
public class Draw2D extends View {
    public Draw2D(Context context) {
        super(context);

        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.cat_bottom);
    }

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);

        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(950, 30, 25, mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(20, 650, 950, 680, mPaint);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        canvas.drawText("Лужайка только для котов", 30, 648, mPaint);
        int x = 210;
        int y = 190;

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        canvas.drawCircle( 255, 182, 193, mPaint);



        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(27);
        String str2rotate = "Лучик солнца!";

        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());

// Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x, y, mPaint);

// восстанавливаем холст
        canvas.restore();
        canvas.drawBitmap(mBitmap, 450, 530, mPaint);

    }
}