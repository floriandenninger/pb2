package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zzn {
    public final zzm a = new zzm();
    public final StringBuilder b = new StringBuilder();
    public final Paint c;
    public int d;
    public int e;
    public final wcy f;
    private final Path g;

    public zzn() {
        Paint paint = new Paint();
        this.c = paint;
        this.g = new Path();
        this.f = new wcy();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public static float a(EditText editText) {
        return editText.getTextSize() * 0.2f;
    }

    private static float c(EditText editText, int i) {
        return editText.getLayout().getLineBottom(i) + editText.getPaddingTop();
    }

    private static float d(EditText editText, int i) {
        return editText.getLayout().getLineTop(i) + editText.getPaddingTop();
    }

    public final Path b(EditText editText, int i, int i2) {
        this.g.reset();
        ammv a = this.a.a(i);
        if (a.h()) {
            this.g.moveTo(((zzl) a.c()).b, d(editText, i));
        }
        for (int i3 = i; i3 <= i2; i3++) {
            ammv a2 = this.a.a(i3);
            if (a2.h()) {
                this.g.lineTo(((zzl) a2.c()).c, d(editText, i3));
                this.g.lineTo(((zzl) a2.c()).c, c(editText, i3));
            }
        }
        while (i2 >= i) {
            ammv a3 = this.a.a(i2);
            if (a3.h()) {
                this.g.lineTo(((zzl) a3.c()).b, c(editText, i2));
                this.g.lineTo(((zzl) a3.c()).b, d(editText, i2));
            }
            i2--;
        }
        this.g.close();
        return this.g;
    }
}
