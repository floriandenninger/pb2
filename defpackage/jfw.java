package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jfw {
    protected final int a;
    final int b;
    final int c;
    final float d;
    final float e;
    final float f;
    protected final View g;

    public jfw(View view, int i, int i2, float f, float f2) {
        view.getClass();
        boolean z = i <= i2;
        StringBuilder sb = new StringBuilder(50);
        sb.append("position start:");
        sb.append(i);
        sb.append(" position end");
        sb.append(i2);
        amkq.O(z, sb.toString());
        this.g = view;
        this.a = i;
        this.b = i2;
        this.c = i2 - i;
        this.d = f;
        this.e = f2;
        this.f = Math.abs(f2 - f);
    }

    protected abstract void a(float f);

    public final void b(int i) {
        float f;
        if (i <= this.a) {
            f = this.d;
        } else {
            if (i >= this.b) {
                f = this.e;
            } else {
                float f2 = ((r0 - i) / this.c) * this.f;
                float f3 = this.d;
                float f4 = this.e;
                f = f3 > f4 ? f2 + f4 : f4 - f2;
            }
        }
        a(f);
    }
}
