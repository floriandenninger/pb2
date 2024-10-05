package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzm {
    public Paint a;
    public Paint b;
    private Paint c;

    public static final void b(rxk rxkVar) {
        rxkVar.e = 3;
        rwk rwkVar = new rwk(-1, -2, (byte) 16, -10);
        rwkVar.c();
        rxkVar.setLayoutParams(rwkVar);
    }

    public static final void c(rxk rxkVar) {
        rxkVar.e = 4;
        rwk rwkVar = new rwk(-2, -1, (byte) 1, -10);
        rwkVar.c();
        rxkVar.setLayoutParams(rwkVar);
    }

    public static final ryu d() {
        return new ryu(ryt.a);
    }

    public static final float e(int i) {
        return i > 1 ? 0.7f : 0.65f;
    }

    public final Paint a() {
        if (this.c == null) {
            Paint paint = new Paint();
            this.c = paint;
            paint.setColor(Color.parseColor("#EFEFEF"));
            this.c.setStrokeWidth(rwq.b(null, 1.0f));
        }
        return this.c;
    }
}
