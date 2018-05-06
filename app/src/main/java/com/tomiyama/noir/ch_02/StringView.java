package com.tomiyama.noir.ch_02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class StringView extends View {

    public StringView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        // 描画オブジェクトの生成
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        // 文字サイズと文字色の指定  float: set the paint's text size in pixel units.
        paint.setTextSize(48);
        paint.setColor(Color.rgb(0,0,0));

        // 画面サイズの取得
        canvas.drawText("画面サイズ" + getWidth() + "×" + getHeight(), 0, 60,paint);

        // 文字幅の取得
        canvas.drawText("文字幅" + paint.measureText("A"),0,60 * 2,paint);

        // アセント・ディセントの取得
        canvas.drawText("アセント" + paint.ascent(),0,60 * 3,paint);
        canvas.drawText("ディセント" + paint.descent(), 0,60*4,paint);

        // 24pixelの文字列の表示
        paint.setTextSize(24);
        paint.setColor(Color.rgb(255,0,0));
        canvas.drawText("24pixel",0,60 * 5,paint);

        // 32pixelの文字列の表示
        paint.setTextSize(32);
        paint.setColor(Color.rgb(0,255,0));
        canvas.drawText("32pixel",0,60 * 6,paint);

        // 48pixelの文字列の表示
        paint.setTextSize(48);
        paint.setColor(Color.rgb(0,0,255));
        canvas.drawText("48pixel",0,60 * 7,paint);

    }
}
