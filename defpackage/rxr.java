package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxr {
    public int b;
    public int c;
    public final TextPaint g;
    public final Paint h;
    public final Paint i;
    public rzc a = rzc.a();
    public dsm k = dsm.f();
    public final int j = 2;
    public float d = 0.0f;
    public final int e = 20;
    public final boolean f = true;

    public rxr(Context context) {
        rzm rzmVar = rwp.a;
        if (rzmVar.a == null) {
            rzmVar.a = new Paint();
            rzmVar.a.setAntiAlias(true);
            rzmVar.a.setColor(Color.parseColor("#707070"));
            rzmVar.a.setTextSize(rwq.b(null, 10.0f));
        }
        TextPaint textPaint = new TextPaint(rzmVar.a);
        this.g = textPaint;
        this.h = new Paint(rwp.a.a());
        rzm rzmVar2 = rwp.a;
        if (rzmVar2.b == null) {
            rzmVar2.b = new Paint(rzmVar2.a());
            rzmVar2.b.setColor(Color.parseColor("#DCDCDC"));
        }
        this.i = new Paint(rzmVar2.b);
        this.b = (int) rwq.b(context, 3.0f);
        this.c = (int) rwq.b(context, 5.0f);
        if (context != null) {
            textPaint.setTextSize(textPaint.getTextSize() * context.getResources().getConfiguration().fontScale);
        }
    }

    public final void a() {
        this.i.setStrokeWidth(0.0f);
    }

    public final void b(int i) {
        this.g.setColor(i);
    }

    public final void c(float f) {
        this.g.setTextSize(f);
    }

    public final void d(rzc rzcVar) {
        sbt.g(rzcVar, "rangeBandConfig");
        this.a = rzcVar;
    }

    public final void e(int i) {
        this.h.setColor(i);
    }

    public final void f() {
        this.b = 0;
    }
}
