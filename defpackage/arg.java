package defpackage;

import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class arg implements Runnable {
    final /* synthetic */ arj a;
    final /* synthetic */ ark b;
    private final /* synthetic */ int c;

    public arg(arj arjVar, ark arkVar, int i) {
        this.c = i;
        this.a = arjVar;
        this.b = arkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            IBinder a = this.b.a();
            aqp aqpVar = (aqp) this.a.a.c.remove(a);
            if (aqpVar != null) {
                a.unlinkToDeath(aqpVar, 0);
                return;
            }
            return;
        }
        aqp aqpVar2 = (aqp) this.a.a.c.remove(this.b.a());
        if (aqpVar2 != null) {
            aqpVar2.f.a().unlinkToDeath(aqpVar2, 0);
        }
    }
}
