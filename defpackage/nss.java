package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nss extends nop implements itj, iti, itk {
    public nqa d;
    public itl e;
    private final Context f;
    private final azrw g;
    private final itm h;
    private final acra i;
    private nqb j;
    private LoadingFrameLayout k;
    private final ajyw l;

    public nss(Context context, azrw azrwVar, ajyw ajywVar, itm itmVar, acra acraVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        super(acraVar, aaeaVar);
        this.f = context;
        this.g = azrwVar;
        this.l = ajywVar;
        this.h = itmVar;
        this.i = acraVar;
    }

    private final nqa c(aqrm aqrmVar, asht ashtVar) {
        npz i = this.l.i(this.a, ashtVar, new npy() { // from class: nsr
            @Override // defpackage.npy
            public final void a() {
                itl itlVar;
                nss nssVar = nss.this;
                nqa nqaVar = nssVar.d;
                if (nqaVar == null || (itlVar = nssVar.e) == null) {
                    return;
                }
                View a = itlVar.a();
                a.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), ((npz) nqaVar).a.getHeight());
            }
        });
        i.a(aqrmVar);
        return i;
    }

    private final nrx d(aqtu aqtuVar) {
        nqb nqbVar;
        nqb nqbVar2 = this.j;
        if (nqbVar2 instanceof nrx) {
            ((nrx) nqbVar2).q(aqtuVar);
            nqbVar = nqbVar2;
        } else {
            nrx nrxVar = (nrx) this.g.get();
            nrxVar.q(aqtuVar);
            nrxVar.h = this.a;
            this.j = nrxVar;
            nqbVar = nrxVar;
        }
        return (nrx) nqbVar;
    }

    private final LoadingFrameLayout e() {
        if (this.k == null) {
            this.k = new LoadingFrameLayout(this.f);
        }
        return this.k;
    }

    private final void h(nqa nqaVar) {
        nqa nqaVar2 = this.d;
        if (nqaVar2 != null) {
            nqaVar2.oT();
        }
        this.d = nqaVar;
    }

    @Override // defpackage.nqg
    public final void B() {
        itl itlVar = this.e;
        if (itlVar != null) {
            this.h.b(itlVar.l);
            this.e = null;
        }
        nqa nqaVar = this.d;
        if (nqaVar != null) {
            nqaVar.oT();
        }
    }

    @Override // defpackage.nqg
    public final void C() {
        nqa nqaVar = this.d;
        if (nqaVar != null) {
            nqaVar.d();
        }
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        nqa nqaVar = this.d;
        if (nqaVar != null) {
            ((npz) nqaVar).f();
        }
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.iti
    public final void a(aqrf aqrfVar) {
        nqa nqaVar;
        LoadingFrameLayout loadingFrameLayout = this.k;
        if (loadingFrameLayout != null && (nqaVar = this.d) != null) {
            loadingFrameLayout.removeView(((npz) nqaVar).a);
        }
        if (aqrfVar == null) {
            h(null);
            return;
        }
        aone createBuilder = aqrm.a.createBuilder();
        aong aongVar = (aong) aulq.a.createBuilder();
        aongVar.e(ElementRendererOuterClass.elementRenderer, aqrfVar);
        aulq aulqVar = (aulq) aongVar.build();
        createBuilder.copyOnWrite();
        aqrm aqrmVar = (aqrm) createBuilder.instance;
        aulqVar.getClass();
        aqrmVar.c = aulqVar;
        aqrmVar.b |= 1;
        nqa c = c((aqrm) createBuilder.build(), null);
        h(c);
        LoadingFrameLayout loadingFrameLayout2 = this.k;
        if (loadingFrameLayout2 != null) {
            npz npzVar = (npz) c;
            loadingFrameLayout2.addView(npzVar.a);
            npzVar.f();
        }
    }

    @Override // defpackage.nqg
    public final nqb b() {
        nqb nqbVar = this.j;
        return nqbVar == null ? d(aqtu.a) : nqbVar;
    }

    @Override // defpackage.itj
    public final void f(aqxk aqxkVar) {
        aone createBuilder = aqtu.a.createBuilder();
        aqyg aqygVar = aqxkVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        createBuilder.copyOnWrite();
        aqtu aqtuVar = (aqtu) createBuilder.instance;
        aqygVar.getClass();
        aqtuVar.c = aqygVar;
        aqtuVar.b |= 1;
        if ((aqxkVar.b & 4) != 0) {
            aulq aulqVar = aqxkVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            createBuilder.copyOnWrite();
            aqtu aqtuVar2 = (aqtu) createBuilder.instance;
            aulqVar.getClass();
            aqtuVar2.n = aulqVar;
            aqtuVar2.b |= 524288;
        }
        if (aqxkVar.e.size() > 0) {
            aulq aulqVar2 = (aulq) aqxkVar.e.get(0);
            createBuilder.copyOnWrite();
            aqtu aqtuVar3 = (aqtu) createBuilder.instance;
            aulqVar2.getClass();
            aqtuVar3.h = aulqVar2;
            aqtuVar3.b |= 32;
        }
        d((aqtu) createBuilder.build());
    }

    @Override // defpackage.itk
    public final void g() {
        LoadingFrameLayout loadingFrameLayout = this.k;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.a();
        }
    }

    @Override // defpackage.itk
    public final void i() {
        LoadingFrameLayout loadingFrameLayout = this.k;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
    }

    @Override // defpackage.nqg
    public final void n() {
        nqa nqaVar = this.d;
        if (nqaVar != null) {
            ((npz) nqaVar).d();
        }
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        LoadingFrameLayout e = e();
        itl itlVar = this.e;
        if (itlVar != null) {
            e.removeAllViews();
            e.addView(itlVar.a());
            nqa nqaVar = this.d;
            if (nqaVar != null) {
                e.addView(((npz) nqaVar).a);
            }
        }
    }

    @Override // defpackage.nqg
    public final View oO() {
        return e();
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void q(aqts aqtsVar, asht ashtVar) {
        aqtu aqtuVar;
        aqxd aqxdVar;
        if (aqtsVar != null) {
            aqtq aqtqVar = aqtsVar.g;
            if (aqtqVar == null) {
                aqtqVar = aqtq.a;
            }
            if (aqtqVar.b == 371777145) {
                super.q(aqtsVar, ashtVar);
                aqtr aqtrVar = aqtsVar.f;
                if (aqtrVar == null) {
                    aqtrVar = aqtr.a;
                }
                if (aqtrVar.b == 138681548) {
                    aqtuVar = (aqtu) aqtrVar.c;
                } else {
                    aqtuVar = aqtu.a;
                }
                d(aqtuVar);
                itl itlVar = this.e;
                if (itlVar != null) {
                    this.h.b(itlVar.l);
                }
                itm itmVar = this.h;
                aqtq aqtqVar2 = aqtsVar.g;
                if (aqtqVar2 == null) {
                    aqtqVar2 = aqtq.a;
                }
                if (aqtqVar2.b == 371777145) {
                    aqxdVar = (aqxd) aqtqVar2.c;
                } else {
                    aqxdVar = aqxd.a;
                }
                itl a = itmVar.a(aqxdVar, this, this, Optional.of(this), this.i);
                this.e = a;
                aulq aulqVar = aqtsVar.h;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                    aulq aulqVar2 = aqtsVar.h;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    h(c((aqrm) aulqVar2.pX(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer), ashtVar));
                } else {
                    h(null);
                }
                LoadingFrameLayout loadingFrameLayout = this.k;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.removeAllViews();
                    this.k.addView(a.a());
                    nqa nqaVar = this.d;
                    if (nqaVar != null) {
                        npz npzVar = (npz) nqaVar;
                        this.k.addView(npzVar.a);
                        npzVar.f();
                    }
                }
            }
        }
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean w(aqts aqtsVar, apxf apxfVar) {
        q(aqtsVar, null);
        return true;
    }
}
