package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aclz extends CountDownTimer {
    final /* synthetic */ acma a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclz(acma acmaVar) {
        super(1000L, 1000L);
        this.a = acmaVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
