package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntp extends ajtz implements nrg {
    public List a;
    public final boolean b;
    private final ntt c;
    private boolean d;

    public ntp(aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar, ntt nttVar, aadw aadwVar) {
        super(aasmVar, ypaVar, zawVar, acraVar);
        this.c = nttVar;
        apxs apxsVar = aadwVar.b().z;
        this.b = (apxsVar == null ? apxs.a : apxsVar).i;
    }

    @Override // defpackage.nrg
    public final void d() {
        f();
    }

    public final void f() {
        if (this.b) {
            this.c.p();
            this.c.r();
            aa();
            B();
        }
    }

    @Override // defpackage.nrg
    public final void h() {
        this.c.o();
        List list = this.a;
        if (list != null) {
            k(list);
        }
    }

    public final void i() {
        if (this.b) {
            this.d = true;
            aa();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            askf askfVar = (askf) it.next();
            if ((askfVar.b & 8) != 0 && !this.d) {
                avgs avgsVar = askfVar.f;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                this.c.t = avgsVar.c - 500;
                ajce o = ahbj.o(avgsVar);
                if (o != null) {
                    ag(o, new Timer());
                    arrayList.add(o);
                }
            }
        }
        lu(arrayList);
    }

    public final void l() {
        if (this.b) {
            this.d = false;
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        auov auovVar = (auov) obj;
        if (auovVar == null || ajcdVar != ajcd.TIMED) {
            return;
        }
        ntt nttVar = this.c;
        if (nttVar.r) {
            return;
        }
        auor auorVar = auovVar.n;
        if (auorVar == null) {
            auorVar = auor.a;
        }
        aulq aulqVar = auorVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        apxf apxfVar = apmgVar.p;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        nttVar.q = ((PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand) apxfVar.pX(PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.prependNewerCommentsCommand)).b;
        nttVar.s = !nttVar.q.isEmpty();
        if ((apmgVar.b & 256) != 0) {
            aqyg aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            nttVar.j = ammv.j(ajcq.b(aqygVar));
            nttVar.l = ammv.j(new acqx(apmgVar.t));
            if (nttVar.l.h()) {
                nttVar.k.D((acsa) nttVar.l.c());
            }
            nttVar.n("");
            Timer timer = nttVar.n;
            if (timer != null) {
                timer.cancel();
            }
            nttVar.n = new Timer();
            nttVar.n.schedule(new nts(nttVar), nttVar.t);
        }
        if (auovVar.d.size() <= 1 || (((auoy) auovVar.d.get(1)).b & 16) == 0) {
            return;
        }
        askd askdVar = ((auoy) auovVar.d.get(1)).j;
        if (askdVar == null) {
            askdVar = askd.a;
        }
        aony aonyVar = askdVar.f;
        this.a = aonyVar;
        k((List) aonyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        return (auov) aulpVar.pX(auov.b);
    }

    @Override // defpackage.nrg
    public final void oS() {
        f();
    }

    @Override // defpackage.nrg
    public final void oT() {
        if (this.b) {
            this.c.p();
            ntt nttVar = this.c;
            nttVar.r = false;
            nttVar.r();
            aa();
            B();
            this.a = null;
        }
    }

    @Override // defpackage.nrg
    public final /* synthetic */ void oX() {
    }
}
