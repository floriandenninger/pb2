package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljg extends aljd {
    private float c;
    private float d;
    private float e;

    public aljg(aljo aljoVar) {
        super(aljoVar);
        this.c = 300.0f;
    }

    @Override // defpackage.aljd
    public final int a() {
        return ((aljo) this.a).a;
    }

    @Override // defpackage.aljd
    public final int b() {
        return -1;
    }

    @Override // defpackage.aljd
    public final void c(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        float f2 = ((aljo) this.a).a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((aljo) this.a).a) / 2.0f));
        if (((aljo) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.g() && ((aljo) this.a).e == 1) || (this.b.f() && ((aljo) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.g() || this.b.f()) {
            canvas.translate(0.0f, (((aljo) this.a).a * ((-1.0f) + f)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        aljo aljoVar = (aljo) this.a;
        this.d = aljoVar.a * f;
        this.e = aljoVar.b * f;
    }

    @Override // defpackage.aljd
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = (-f3) / 2.0f;
        float f5 = this.e;
        float f6 = f5 + f5;
        float f7 = f3 - f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f8 = this.d;
        RectF rectF = new RectF((f * f7) + f4, (-f8) / 2.0f, f4 + (f2 * f7) + f6, f8 / 2.0f);
        float f9 = this.e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // defpackage.aljd
    public final void e(Canvas canvas, Paint paint) {
        int q = akwg.q(((aljo) this.a).d, this.b.i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(q);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
