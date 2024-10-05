package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ijs implements ijr {
    private final Set a = Collections.synchronizedSet(new HashSet());
    private final axpg b;
    private final acqz c;
    private ijq d;

    public ijs(axpg axpgVar, acqz acqzVar) {
        this.b = axpgVar;
        this.c = acqzVar;
    }

    private static aukv i(ihm ihmVar) {
        aulq aulqVar = ihmVar.a().p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aukv aukvVar = (aukv) aulqVar.pX(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
        aukvVar.getClass();
        return aukvVar;
    }

    private final void j(aukv aukvVar) {
        k(aukvVar.d);
    }

    private final void k(String str) {
        this.a.add(str);
    }

    @Override // defpackage.ijr
    public final void a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        int A;
        acra mM;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null || (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 32768) == 0) {
            return;
        }
        aulq aulqVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aukv aukvVar = (aukv) aulqVar.pX(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
        if (this.a.contains(aukvVar.d)) {
            return;
        }
        ihl ihlVar = (ihl) this.b.get();
        ihm E = ihlVar.n.E(reelWatchEndpointOuterClass$ReelWatchEndpoint, ihlVar.y);
        if (E == null) {
            return;
        }
        long f = ihlVar.f();
        igu iguVar = ihlVar.n;
        long j = E.g;
        boolean z = true;
        boolean z2 = false;
        if (j != Long.MIN_VALUE && iguVar.B(j) == -1) {
            ihm ihmVar = new ihm(j, E.d, null, true, true);
            int B = iguVar.B(E.a);
            amkq.E(B != -1);
            synchronized (iguVar.d) {
                int w = iguVar.w(B);
                if (w >= 0 && w < iguVar.d.size()) {
                    z2 = true;
                }
                amkq.E(z2);
                int i = w + 1;
                iguVar.d.add(i, ihmVar);
                A = iguVar.A(i);
            }
            iguVar.od(A);
        } else {
            z = false;
        }
        int B2 = ihlVar.n.B(f);
        if (B2 != -1) {
            ihlVar.y = B2;
        }
        if (!z || (aukvVar.b & 4) == 0 || (mM = this.c.mM()) == null) {
            return;
        }
        mM.D(new acqx(aukvVar.e));
    }

    @Override // defpackage.ijr
    public final void b() {
        ((ijo) this.d).aQ();
    }

    @Override // defpackage.ijr
    public final void c(String str) {
        k(str);
        ijo ijoVar = (ijo) this.d;
        ijoVar.C().runOnUiThread(new iix(ijoVar, str, 0));
    }

    @Override // defpackage.ijr
    public final void d(ihm ihmVar) {
        acra mM;
        aukv i = i(ihmVar);
        j(i);
        if ((i.b & 4) != 0 && (mM = this.c.mM()) != null) {
            mM.q(new acqx(i.e), null);
        }
        ((ihl) this.b.get()).n(ihmVar);
    }

    @Override // defpackage.ijr
    public final void e(ihm ihmVar) {
        acra mM;
        aukv i = i(ihmVar);
        j(i);
        if ((i.b & 4) == 0 || (mM = this.c.mM()) == null) {
            return;
        }
        mM.u(new acqx(i.e), null);
    }

    @Override // defpackage.ijr
    public final void f(String str) {
        k(str);
        ijo ijoVar = (ijo) this.d;
        ijoVar.C().runOnUiThread(new iix(ijoVar, str, 2));
    }

    @Override // defpackage.ijr
    public final void g(ihm ihmVar, boolean z) {
        aukv i = i(ihmVar);
        ((ihl) this.b.get()).n(ihmVar);
        if (z) {
            j(i);
        }
    }

    @Override // defpackage.ijr
    public final void h(ijq ijqVar) {
        this.d = ijqVar;
    }
}
