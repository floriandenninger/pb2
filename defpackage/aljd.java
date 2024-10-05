package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aljd {
    final alip a;
    protected aljc b;

    public aljd(alip alipVar) {
        this.a = alipVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(Canvas canvas, float f);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract void e(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Canvas canvas, float f) {
        this.a.a();
        c(canvas, f);
    }
}
