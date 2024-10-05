package defpackage;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdt implements mdq {
    public azrl a = azrl.e();
    private final ViewGroup b;
    private apqv c;
    private boolean d;
    private aamd e;
    private acra f;
    private ajwx g;
    private final ajos h;
    private ayqx i;
    private ete j;

    public mdt(ajos ajosVar, ViewGroup viewGroup) {
        this.b = viewGroup;
        this.h = ajosVar;
    }

    @Override // defpackage.fzo
    public final void a() {
        apqv apqvVar = this.c;
        if (apqvVar != null) {
            this.f.u(new acqx(apqvVar.g), null);
        }
    }

    @Override // defpackage.mdq
    public final ajxe b() {
        if (!i()) {
            return null;
        }
        aamd aamdVar = this.e;
        ete eteVar = this.j;
        return new mds(aamdVar, new etd(eteVar.e, eteVar.c.n.P()));
    }

    @Override // defpackage.mdq
    public final aypy c() {
        return this.a;
    }

    @Override // defpackage.mdq
    public final CharSequence d() {
        int intValue;
        apqt apqtVar;
        apqt apqtVar2;
        if (!i()) {
            return null;
        }
        ete eteVar = this.j;
        if (!eteVar.e.h() || eteVar.f.e.size() <= (intValue = ((Integer) eteVar.e.c()).intValue()) || ((apqw) eteVar.f.e.get(intValue)).b != 48474525) {
            return null;
        }
        apqw apqwVar = (apqw) eteVar.f.e.get(intValue);
        if (apqwVar.b == 48474525) {
            apqtVar = (apqt) apqwVar.c;
        } else {
            apqtVar = apqt.a;
        }
        if ((apqtVar.b & 256) == 0) {
            return null;
        }
        apqw apqwVar2 = (apqw) eteVar.f.e.get(intValue);
        if (apqwVar2.b == 48474525) {
            apqtVar2 = (apqt) apqwVar2.c;
        } else {
            apqtVar2 = apqt.a;
        }
        aqyg aqygVar = apqtVar2.j;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.mdq
    public final void e() {
        f();
        azrl azrlVar = this.a;
        if (azrlVar != null) {
            azrlVar.sh();
            this.a = null;
        }
    }

    @Override // defpackage.mdq
    public final void f() {
        this.c = null;
        this.e = null;
        this.d = false;
        ete eteVar = this.j;
        if (eteVar != null) {
            this.b.removeView(eteVar.b);
            this.j = null;
        }
        Object obj = this.i;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.i = null;
        }
    }

    @Override // defpackage.mdq
    public final void g(boolean z) {
        if (h()) {
            return;
        }
        this.d = z;
    }

    @Override // defpackage.mdq
    public final boolean h() {
        ete eteVar;
        if (!i() || (eteVar = this.j) == null) {
            return false;
        }
        return eteVar.e.h();
    }

    @Override // defpackage.mdq
    public final boolean i() {
        return this.c != null;
    }

    @Override // defpackage.mdq
    public final boolean j() {
        if (i() && h()) {
            return this.j.j();
        }
        return false;
    }

    @Override // defpackage.mdq
    public final boolean k(aamd aamdVar, ajwx ajwxVar, acra acraVar) {
        if (!i() || mcy.D(aamdVar)) {
            if (!h() && this.d) {
                boolean i = i();
                this.d = false;
                l(aamdVar, ajwxVar, acraVar);
                if (i != i()) {
                    return true;
                }
            }
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.mdq
    public final void l(aamd aamdVar, ajwx ajwxVar, acra acraVar) {
        atlx atlxVar;
        apqv apqvVar;
        this.d = false;
        acraVar.getClass();
        this.f = acraVar;
        this.g = ajwxVar;
        this.e = aamdVar;
        if (mcy.D(aamdVar)) {
            auou auouVar = aamdVar.a.g;
            if (auouVar == null) {
                auouVar = auou.a;
            }
            if (auouVar.b == 256220752) {
                atlxVar = (atlx) auouVar.c;
            } else {
                atlxVar = atlx.a;
            }
            aulq aulqVar = atlxVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apqvVar = (apqv) aulqVar.pX(ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer);
        } else {
            apqvVar = null;
        }
        this.c = apqvVar;
        if (apqvVar == null) {
            return;
        }
        if (this.j == null) {
            ajom r = ahbw.r(this.h, apqvVar, this.b);
            this.b.addView(r.a());
            if (r instanceof ete) {
                ete eteVar = (ete) r;
                this.j = eteVar;
                this.i = eteVar.d.ax(new ayrs() { // from class: mdr
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        etb etbVar = (etb) obj;
                        azrl azrlVar = mdt.this.a;
                        if (azrlVar != null) {
                            azrlVar.c(Boolean.valueOf(etbVar.c()));
                        }
                    }
                });
            }
        }
        ajok ajokVar = new ajok();
        ajokVar.f("sectionListController", this.g);
        ajokVar.a(this.f);
        this.j.oB(ajokVar, apqvVar);
    }

    @Override // defpackage.mdq
    public final void m(ajxe ajxeVar, ajwx ajwxVar, acra acraVar) {
        if (ajxeVar instanceof mds) {
            mds mdsVar = (mds) ajxeVar;
            l(mdsVar.a, ajwxVar, acraVar);
            ete eteVar = this.j;
            if (eteVar != null) {
                ajxe ajxeVar2 = mdsVar.b;
                if (eteVar.f != null) {
                    etd etdVar = (etd) ajxeVar2;
                    eteVar.e = etdVar.a;
                    Parcelable parcelable = etdVar.b;
                    if (parcelable != null) {
                        eteVar.c.n.Y(parcelable);
                    }
                }
            }
        }
    }
}
