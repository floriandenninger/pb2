package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xit extends CountDownTimer {
    final /* synthetic */ xiu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xit(xiu xiuVar, int i) {
        super(i, 1000L);
        this.a = xiuVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        xiu xiuVar = this.a;
        xiuVar.a.d(xiuVar.d.c.g, xiuVar.a());
        xiuVar.f = null;
        xiuVar.h();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
