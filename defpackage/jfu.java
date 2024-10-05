package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfu extends jfw {
    public jfu(View view, int i, int i2, float f, float f2) {
        super(view, i, i2, f, f2);
        amkq.N(f >= 0.0f && f <= 1.0f);
        amkq.N(f2 >= 0.0f && f2 <= 1.0f);
    }

    @Override // defpackage.jfw
    protected final void a(float f) {
        this.g.setAlpha(f);
    }
}
