package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xjh extends CountDownTimer {
    final /* synthetic */ xji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjh(xji xjiVar, int i) {
        super(i, 1000L);
        this.a = xjiVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        xji xjiVar = this.a;
        xjiVar.a.d(xjiVar.e.c.g, xjiVar.a());
        xjiVar.g = null;
        xjiVar.h();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
