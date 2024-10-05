package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iij {
    public final ion a;
    public final ihl b;
    public final azrw c;
    public final ifw d;
    public final shf e;
    public final Executor f;
    public final Object g = new Object();
    public ReelSequenceController$PendingContinuation h = new ReelSequenceController$PendingContinuation();
    public ReelSequenceController$PendingContinuation i = new ReelSequenceController$PendingContinuation();
    public final List j = new ArrayList();
    public boolean k;
    public boolean l;

    public iij(ion ionVar, azrw azrwVar, ifw ifwVar, shf shfVar, Executor executor, ihl ihlVar) {
        this.a = ionVar;
        this.b = ihlVar;
        this.c = azrwVar;
        this.d = ifwVar;
        this.e = shfVar;
        this.f = executor;
    }

    public final void a(ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, ioo iooVar, int i) {
        synchronized (this.g) {
            if (reelSequenceController$PendingContinuation.a) {
                return;
            }
            reelSequenceController$PendingContinuation.a = true;
            long d = this.e.d();
            ion ionVar = this.a;
            ionVar.c.e(iooVar, new iih(this, reelSequenceController$PendingContinuation, i, iooVar, d));
        }
    }

    public final void b() {
        String str;
        synchronized (this.g) {
            str = this.i.b;
        }
        if (ammx.e(str)) {
            return;
        }
        ioo a = this.a.a();
        a.a = str;
        a(this.i, a, 2);
    }

    public final boolean c(iii iiiVar) {
        synchronized (this.g) {
            if (!this.i.a && !this.h.a) {
                return false;
            }
            this.j.add(iiiVar);
            return true;
        }
    }

    public final boolean d() {
        boolean a;
        synchronized (this.g) {
            a = this.h.a();
        }
        return a;
    }
}
