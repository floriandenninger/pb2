package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xii extends CountDownTimer {
    final /* synthetic */ xik a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xii(xik xikVar, long j) {
        super(j, 1000L);
        this.a = xikVar;
        xikVar.i = j;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        xik xikVar = this.a;
        xikVar.i = 0L;
        xikVar.g(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        xik xikVar = this.a;
        xikVar.i = j;
        xikVar.g(j);
    }
}
