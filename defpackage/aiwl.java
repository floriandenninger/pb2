package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwl {
    public final ypa a;
    public final Set b;
    private final banw c;
    private final banw d;
    private final banw e;
    private final banw f;

    public aiwl(ypa ypaVar, Set set, banw banwVar, banw banwVar2, banw banwVar3, banw banwVar4) {
        ypaVar.getClass();
        this.a = ypaVar;
        set.getClass();
        this.b = set;
        banwVar.getClass();
        this.c = banwVar;
        banwVar2.getClass();
        this.d = banwVar2;
        banwVar3.getClass();
        this.e = banwVar3;
        banwVar4.getClass();
        this.f = banwVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void w(ahda ahdaVar, ajbl ajblVar) {
        ajblVar.aa().c(ahdaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void x(ahde ahdeVar, ajbl ajblVar) {
        ajblVar.aq().c(ahdeVar);
    }

    public static final void y(PlayerResponseModel playerResponseModel, ajbl ajblVar) {
        ajblVar.as().c(new ahdp(playerResponseModel, ajblVar.Z()));
    }

    public static final void z(ahdi ahdiVar, ajbl ajblVar) {
        ajblVar.at().c(ahdiVar);
    }

    public final void a() {
        this.f.c(ahel.a);
        this.e.c(ahel.a);
    }

    public final void b(ajbl ajblVar) {
        this.e.c(new ahel(ajblVar));
    }

    public final void c(afih afihVar, ajbl ajblVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).n(afihVar, ajblVar.Z());
        }
        ajblVar.ag().c(afihVar);
    }

    public final void d(ahco ahcoVar, ajbl ajblVar) {
        ajblVar.ai().c(ahcoVar);
        for (ajbh ajbhVar : this.b) {
            if (ahcoVar.c()) {
                ajbhVar.g(ahcoVar.b(), ajblVar.Z());
            } else {
                ajbhVar.k(ahcoVar.b(), ajblVar.Z());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).q(str);
        }
    }

    public final void f(ajbl ajblVar) {
        this.f.c(new ahel(ajblVar));
    }

    public final void g(aiew aiewVar, ajbl ajblVar) {
        for (ajbh ajbhVar : this.b) {
        }
        ajblVar.aw().c(aiewVar);
    }

    public final void h(ajbl ajblVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).o(ajblVar.Z(), ajblVar.g());
        }
        this.a.g(ajblVar.i());
        this.c.c(new ahem(ajblVar));
    }

    public final void i(ajbl ajblVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).p(ajblVar.Z());
        }
        ajblVar.as().sh();
        ajblVar.aE().sh();
        ajblVar.ad().sh();
        ajblVar.aD().sh();
        ajblVar.av().sh();
        ajblVar.ac().sh();
        ajblVar.aa().sh();
        ajblVar.ag().sh();
        ajblVar.ai().sh();
        ajblVar.al().sh();
        ajblVar.aq().sh();
        ajblVar.aj().sh();
        ajblVar.at().sh();
        ajblVar.aw().sh();
        ajblVar.az().sh();
        ajblVar.aC().sh();
        ajblVar.aG().sh();
        ajblVar.af().sh();
        ajblVar.ap().sh();
        ajblVar.ar().sh();
        ajblVar.ao().sh();
        ajblVar.Y().sc(new ahcq());
        this.d.c(new ahen(ajblVar));
    }

    public final void j() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).b();
        }
    }

    public final void k(ahef ahefVar, ajbl ajblVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).aj(ahefVar);
        }
        if (ajblVar != null) {
            ajblVar.aD().c(ahefVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(ahcv ahcvVar, ajbl ajblVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).c(ajblVar.Z());
        }
        ajblVar.ar().c(ahcvVar);
    }

    public final void m(ahej ahejVar, ajbl ajblVar) {
        v(ahejVar, 4, ajblVar);
    }

    public final void n(aeqq aeqqVar, String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).h(aeqqVar, str);
        }
        this.a.d(aeqqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(aheg ahegVar) {
        for (ajbh ajbhVar : this.b) {
            if (ajbhVar.G()) {
                ajbhVar.e(ahegVar);
            }
        }
    }

    public final void p(ahef ahefVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).aj(ahefVar);
        }
        this.a.d(ahefVar);
    }

    public final void q(aheg ahegVar) {
        for (ajbh ajbhVar : this.b) {
            if (!ajbhVar.G()) {
                ajbhVar.e(ahegVar);
            }
        }
        this.a.d(ahegVar);
    }

    public final void r(ahej ahejVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).v(ahejVar);
        }
        this.a.d(ahejVar);
    }

    public final void s(ajbl ajblVar, aheg ahegVar, int i) {
        for (ajbh ajbhVar : this.b) {
            if (ajbhVar.G()) {
                ajbhVar.e(ahegVar);
            }
        }
        if (i == 4) {
            ajblVar.ae().c(ahegVar);
        }
    }

    public final void t(aigr aigrVar, ajbl ajblVar, int i) {
        if (i == 4) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ajbh) it.next()).r(aigrVar);
            }
        }
        ajblVar.ap().c(aigrVar);
    }

    public final void u(ajbl ajblVar, aheg ahegVar, int i) {
        for (ajbh ajbhVar : this.b) {
            if (!ajbhVar.G()) {
                ajbhVar.e(ahegVar);
            }
        }
        if (i == 4) {
            ajblVar.aE().c(ahegVar);
        }
    }

    public final void v(ahej ahejVar, int i, ajbl ajblVar) {
        if (i == 2 || i == 4) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ajbh) it.next()).v(ahejVar);
            }
        }
        if (i == 3 || i == 4) {
            if (ajblVar != null) {
                ajblVar.aG().c(ahejVar);
            } else {
                this.a.d(ahejVar);
            }
        }
    }
}
