package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lxu extends ajtz implements ajth {
    private final ajvb a;
    protected final ViewGroup b;
    protected final ajwi c;
    protected RecyclerView d;
    protected lxt e;
    protected View f;
    public boolean g;
    public boolean h;
    public aone i;
    private final ajoy j;
    private auoo k;
    private boolean l;
    private ajpd m;
    private ajox n;
    private ajun o;

    public lxu(ViewGroup viewGroup, ajwi ajwiVar, ajoy ajoyVar, ajvb ajvbVar, aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(aasmVar, ypaVar, zawVar, acraVar);
        viewGroup.getClass();
        this.b = viewGroup;
        ajvbVar.getClass();
        this.a = ajvbVar;
        this.c = ajwiVar;
        ajoyVar.getClass();
        this.j = ajoyVar;
        ajvbVar.a(auoo.class);
    }

    protected abstract void c(ajpd ajpdVar, auok auokVar, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f("is_drawer_context", true);
        ajokVar.f("avatar_selection_listener", this.e);
        ajokVar.f("avatar_selection_controller", this.o);
        ajokVar.f("sectionListController", this.c);
        ajxd.c(ajokVar, this);
        if (i == 0) {
            ajokVar.f("is_first_drawer_list", true);
        }
    }

    protected abstract void k();

    protected void l(ajox ajoxVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        auok auokVar = (auok) obj;
        super.lB(auokVar, ajcdVar);
        if (auokVar == null || ajcdVar != ajcd.RELOAD) {
            return;
        }
        c(this.m, auokVar, true);
    }

    @Override // defpackage.ajth
    public final /* synthetic */ void ll(aulm aulmVar, zfi zfiVar, ajug ajugVar, apxf apxfVar) {
        throw null;
    }

    @Override // defpackage.ajth
    public final void lz(aulm aulmVar, apxf apxfVar) {
        lt(ahbj.o(aulmVar));
    }

    protected final void n(auoo auooVar) {
        for (auon auonVar : auooVar.b) {
            int i = auonVar.b;
            if (i == 106506504) {
                c(this.m, (auok) auonVar.c, false);
            } else if (i == 117271479) {
                this.m.add((atlv) auonVar.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(auok.b)) {
            return null;
        }
        return (auok) aulpVar.pX(auok.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ajos, java.lang.Object] */
    public final void o() {
        if (this.g) {
            return;
        }
        if (this.k == null) {
            this.l = true;
            return;
        }
        this.f = this.b.findViewById(R.id.section_list_refresher);
        ((ViewStub) this.b.findViewById(R.id.drawer_stub)).inflate();
        this.d = (RecyclerView) this.b.findViewById(R.id.drawer_results);
        k();
        ajox a = this.j.a(this.a.get());
        this.n = a;
        this.d.ac(a);
        l(this.n);
        ajpd ajpdVar = new ajpd();
        this.m = ajpdVar;
        this.n.h(ajpdVar);
        this.o = new ajun((char[]) null, (byte[]) null, (byte[]) null);
        lxt lxtVar = new lxt(this);
        this.e = lxtVar;
        this.n.rU(lxtVar);
        n(this.k);
        this.g = true;
    }

    public final void p(auoo auooVar) {
        if (amkq.b(this.k, auooVar)) {
            return;
        }
        this.k = auooVar;
        if (!this.g) {
            if (this.l) {
                o();
            }
        } else {
            this.i = null;
            this.m = new ajpd();
            n(auooVar);
            this.n.h(this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(auoi auoiVar, boolean z) {
        if (auoiVar != null) {
            this.i = auoiVar.toBuilder();
        }
        this.h = z;
    }

    public void r(int i) {
    }

    public void s(aone aoneVar) {
        auoj auojVar;
        auoj auojVar2;
        aulm aulmVar;
        ajun ajunVar = this.o;
        aone aoneVar2 = this.i;
        if (aoneVar2 != null) {
            lxs lxsVar = (lxs) ajunVar.a.get(aoneVar2.build());
            if (lxsVar != null) {
                lxsVar.c((auoi) aoneVar2.build(), false);
            }
            aoneVar2.copyOnWrite();
            auoi auoiVar = (auoi) aoneVar2.instance;
            auoi auoiVar2 = auoi.a;
            auoiVar.b |= 1024;
            auoiVar.l = false;
        }
        if (aoneVar != null) {
            lxs lxsVar2 = (lxs) ajunVar.a.get(aoneVar.build());
            if (lxsVar2 != null) {
                lxsVar2.c((auoi) aoneVar.build(), true);
            }
            aoneVar.copyOnWrite();
            auoi auoiVar3 = (auoi) aoneVar.instance;
            auoi auoiVar4 = auoi.a;
            auoiVar3.b |= 1024;
            auoiVar3.l = true;
        }
        this.i = aoneVar;
        if (aoneVar != null) {
            auoi auoiVar5 = (auoi) aoneVar.instance;
            if (auoiVar5.e == 11) {
                auojVar = (auoj) auoiVar5.f;
            } else {
                auojVar = auoj.a;
            }
            if (auojVar.b == 60487319) {
                this.c.h();
                ajwi ajwiVar = this.c;
                auoi auoiVar6 = (auoi) aoneVar.instance;
                if (auoiVar6.e == 11) {
                    auojVar2 = (auoj) auoiVar6.f;
                } else {
                    auojVar2 = auoj.a;
                }
                if (auojVar2.b == 60487319) {
                    aulmVar = (aulm) auojVar2.c;
                } else {
                    aulmVar = aulm.a;
                }
                ajwiVar.lt(ahbj.o(aulmVar));
            }
        }
    }
}
