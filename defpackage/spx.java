package defpackage;

import android.os.Looper;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class spx extends azqr {
    public final sow a;
    public final Object b = new Object();
    public volatile dha c;
    public volatile boolean d;

    public spx(sow sowVar) {
        this.a = sowVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        throw azqi.b(th);
    }

    @Override // defpackage.ayqd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Pair pair = (Pair) obj;
        if (e()) {
            return;
        }
        synchronized (this.b) {
            this.c = (dha) pair.first;
            if (this.d && !e()) {
                dhe dheVar = (dhe) pair.second;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    int i = sog.A;
                    if (dheVar.f != null) {
                        dheVar.h(new dlp(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                } else {
                    int i2 = sog.A;
                    if (dheVar.f != null) {
                        dheVar.g(new dlp(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                }
            }
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
    }
}
