package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wmk extends CountDownTimer {
    final /* synthetic */ wmm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmk(wmm wmmVar, long j) {
        super(j, 1000L);
        this.a = wmmVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        wml wmlVar = this.a.b;
        if (wmlVar != null) {
            wmlVar.aV();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.a = j;
    }
}
