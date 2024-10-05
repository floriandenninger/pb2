package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aliq extends aljd {
    private int c;
    private float d;
    private float e;
    private float f;

    public aliq(aliw aliwVar) {
        super(aliwVar);
        this.c = 1;
    }

    private final int g() {
        aliw aliwVar = (aliw) this.a;
        int i = aliwVar.g;
        int i2 = aliwVar.h;
        return i + i2 + i2;
    }

    private final void h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // defpackage.aljd
    public final int a() {
        return g();
    }

    @Override // defpackage.aljd
    public final int b() {
        return g();
    }

    @Override // defpackage.aljd
    public final void c(Canvas canvas, float f) {
        aliw aliwVar = (aliw) this.a;
        float f2 = (aliwVar.g / 2.0f) + aliwVar.h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        aliw aliwVar2 = (aliw) this.a;
        this.c = aliwVar2.i == 0 ? 1 : -1;
        this.d = aliwVar2.a * f;
        this.e = aliwVar2.b * f;
        this.f = (aliwVar2.g - r0) / 2.0f;
        if ((!this.b.g() || ((aliw) this.a).e != 2) && (!this.b.f() || ((aliw) this.a).f != 1)) {
            if ((this.b.g() && ((aliw) this.a).e == 1) || (this.b.f() && ((aliw) this.a).f == 2)) {
                this.f -= ((1.0f - f) * ((aliw) this.a).a) / 2.0f;
                return;
            }
            return;
        }
        this.f += ((1.0f - f) * ((aliw) this.a).a) / 2.0f;
    }

    @Override // defpackage.aljd
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.d, this.e, f4);
        h(canvas, paint, this.d, this.e, f4 + f5);
    }

    @Override // defpackage.aljd
    public final void e(Canvas canvas, Paint paint) {
        int q = akwg.q(((aliw) this.a).d, this.b.i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(q);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
