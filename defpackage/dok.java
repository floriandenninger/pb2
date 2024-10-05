package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dok extends dop {
    private final TimeInterpolator e;

    public dok(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dop
    public final float a(long j) {
        return this.e.getInterpolation(f("default_input").c);
    }
}
