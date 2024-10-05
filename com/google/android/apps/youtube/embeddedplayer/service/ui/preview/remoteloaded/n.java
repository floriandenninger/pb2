package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import defpackage.aii;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n {
    public final TouchImageView a;
    private int b = 0;
    private Bitmap c;

    public n(TouchImageView touchImageView) {
        this.a = touchImageView;
    }

    public final void a(int i) {
        if (i == this.b) {
            return;
        }
        this.b = i;
        if (i == 0) {
            TouchImageView touchImageView = this.a;
            touchImageView.setImageDrawable(aii.a(touchImageView.getContext(), R.drawable.youtube_lozenge_logo));
            return;
        }
        if (this.c == null) {
            this.c = BitmapFactory.decodeResource(this.a.getContext().getResources(), R.drawable.youtube_lozenge_logo_dni);
        }
        Bitmap bitmap = this.c;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float red = Color.red(i);
        float green = Color.green(i);
        float blue = Color.blue(i);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{(255.0f - red) / 255.0f, 0.0f, 0.0f, 0.0f, red, 0.0f, (255.0f - green) / 255.0f, 0.0f, 0.0f, green, 0.0f, 0.0f, (255.0f - blue) / 255.0f, 0.0f, blue, 0.0f, 0.0f, 0.0f, Color.alpha(i) / 255.0f, 0.0f})));
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        this.a.setImageBitmap(createBitmap);
    }
}
