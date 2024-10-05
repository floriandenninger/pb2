package defpackage;

import android.os.CountDownTimer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjg extends CountDownTimer {
    final /* synthetic */ xji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjg(xji xjiVar, int i) {
        super(i, 1000L);
        this.a = xjiVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.d(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.d(j);
    }
}
