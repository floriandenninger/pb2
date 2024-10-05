package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjt extends res {
    final /* synthetic */ rju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjt(rju rjuVar, rhh rhhVar) {
        super(rhhVar);
        this.b = rjuVar;
    }

    @Override // defpackage.res
    public final void b() {
        rju rjuVar = this.b;
        rjuVar.d.n();
        rjuVar.d.Q();
        rjuVar.b(false, false, SystemClock.elapsedRealtime());
        rdt g = rjuVar.d.g();
        rjuVar.d.Q();
        g.e(SystemClock.elapsedRealtime());
    }
}
