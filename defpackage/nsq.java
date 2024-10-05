package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nsq {
    protected final ntt a;
    protected final nuj b;
    public boolean c;
    public boolean d;
    private final boolean e;

    public nsq(nuj nujVar, ntt nttVar, aadw aadwVar) {
        this.b = nujVar;
        this.a = nttVar;
        apxs apxsVar = aadwVar.b().z;
        this.e = (apxsVar == null ? apxs.a : apxsVar).i;
        apxs apxsVar2 = aadwVar.b().z;
        nttVar.u = (apxsVar2 == null ? apxs.a : apxsVar2).j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aypn a() {
        return this.b.n.B().i(aypg.LATEST);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = false;
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(aqts aqtsVar) {
        auov auovVar;
        aqtq aqtqVar = aqtsVar.g;
        if (aqtqVar == null) {
            aqtqVar = aqtq.a;
        }
        if (aqtqVar.b == 49399797) {
            auovVar = (auov) aqtqVar.c;
        } else {
            auovVar = auov.a;
        }
        auor auorVar = auovVar.n;
        if (auorVar == null) {
            auorVar = auor.a;
        }
        int bE = aobq.bE(auorVar.d);
        if (bE == 0) {
            bE = 1;
        }
        if (bE == 2) {
            if (this.e) {
                b();
            }
        } else if (bE == 3) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(FrameLayout frameLayout, RecyclerView recyclerView) {
        if (this.d) {
            this.a.j(frameLayout, recyclerView);
        } else if (this.c) {
            this.b.j(frameLayout, recyclerView);
        }
    }

    public final void f(int i) {
        this.b.l(i);
        this.a.l(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(aqts aqtsVar) {
        auov auovVar;
        if (!this.c || (aqtsVar.c & 16) == 0) {
            return;
        }
        aqtq aqtqVar = aqtsVar.g;
        if (aqtqVar == null) {
            aqtqVar = aqtq.a;
        }
        if (aqtqVar.b == 49399797) {
            aqtq aqtqVar2 = aqtsVar.g;
            if (aqtqVar2 == null) {
                aqtqVar2 = aqtq.a;
            }
            if (aqtqVar2.b == 49399797) {
                auovVar = (auov) aqtqVar2.c;
            } else {
                auovVar = auov.a;
            }
            h(auovVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(auov auovVar) {
        ammv ammvVar;
        if (this.c) {
            final nuj nujVar = this.b;
            if (auovVar != null && (auovVar.c & 32768) != 0) {
                ammvVar = ammv.j(aalt.f(asyt.b.a(), auovVar.p));
            } else {
                ammvVar = amlr.a;
            }
            nujVar.p = ammvVar;
            nujVar.q.c();
            if (nujVar.p.h()) {
                nujVar.q.d(nujVar.o.c().h((String) nujVar.p.c(), true).ab(ayqr.a()).ax(new ayrs() { // from class: nui
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        nuj nujVar2 = nuj.this;
                        aakz aakzVar = (aakz) obj;
                        aakt aaktVar = aakzVar.c;
                        if (aaktVar instanceof asyr) {
                            asyr asyrVar = (asyr) aaktVar;
                            boolean z = asyrVar.h() && !asyrVar.getSyncEnabled().booleanValue();
                            nujVar2.r = z;
                            if (!z) {
                                if (((Boolean) nujVar2.n.aO()).booleanValue()) {
                                    aakt aaktVar2 = aakzVar.c;
                                    if (aaktVar2 instanceof asyr) {
                                        asyr asyrVar2 = (asyr) aaktVar2;
                                        if (asyrVar2.f() && asyrVar2.getCurrentSyncMode() == asyu.SYNC_MODE_USER_BROWSING) {
                                            aakt aaktVar3 = aakzVar.b;
                                            if (aaktVar3 instanceof asyr) {
                                                asyr asyrVar3 = (asyr) aaktVar3;
                                                if (!asyrVar3.f() || asyrVar3.getCurrentSyncMode() == asyu.SYNC_MODE_USER_BROWSING) {
                                                    return;
                                                }
                                            }
                                            nujVar2.n.c(false);
                                            nujVar2.n(nujVar2.a.getString(R.string.sync_to_video));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                nujVar2.m(true);
                                return;
                            }
                        } else {
                            nujVar2.r = true;
                        }
                        nujVar2.m(false);
                    }
                }));
            }
            nujVar.j = amlr.a;
            if (auovVar == null || (auovVar.c & 8192) == 0) {
                return;
            }
            auor auorVar = auovVar.n;
            if (auorVar == null) {
                auorVar = auor.a;
            }
            if ((auorVar.b & 1) != 0) {
                auor auorVar2 = auovVar.n;
                if (auorVar2 == null) {
                    auorVar2 = auor.a;
                }
                aulq aulqVar = auorVar2.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    auor auorVar3 = auovVar.n;
                    if (auorVar3 == null) {
                        auorVar3 = auor.a;
                    }
                    aulq aulqVar2 = auorVar3.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    if ((apmgVar.b & 256) != 0) {
                        nujVar.l = ammv.j(new acqx(apmgVar.t));
                        nujVar.k.D((acsa) nujVar.l.c());
                        aqyg aqygVar = apmgVar.i;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        nujVar.j = ammv.j(ajcq.b(aqygVar));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (this.c) {
            this.b.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (this.c) {
            this.b.p();
        } else if (this.d) {
            this.a.p();
        }
    }
}
