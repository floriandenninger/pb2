package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kqz extends CountDownTimer {
    final /* synthetic */ kra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqz(kra kraVar, long j) {
        super(j, 1000L);
        this.a = kraVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        kra kraVar = this.a;
        kraVar.d = 0L;
        kraVar.a(xce.ENDCAP_ENDED);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.d = j;
    }
}
