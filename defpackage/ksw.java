package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ksw implements aida {
    final /* synthetic */ ksx a;

    public ksw(ksx ksxVar) {
        this.a = ksxVar;
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
        if (this.a.h) {
            float d = 1.0f - aii.d(f);
            aidx d2 = this.a.d();
            if (Build.VERSION.SDK_INT >= 22) {
                d2.c.setCurrentFraction(d);
            } else {
                d2.c.setCurrentPlayTime(d * ((float) r3.getDuration()));
            }
        }
    }
}
