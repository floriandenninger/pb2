package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvr extends nve implements itj, iti, itk {
    private final itm d;
    private final acra e;
    private final nvf f;
    private itl g;

    public nvr(itm itmVar, nvf nvfVar, acra acraVar) {
        this.d = itmVar;
        this.f = nvfVar;
        this.e = acraVar;
    }

    private final void w() {
        itl itlVar = this.g;
        if (itlVar == null) {
            return;
        }
        this.d.b(itlVar.l);
        this.g = null;
    }

    @Override // defpackage.iti
    public final void a(aqrf aqrfVar) {
        aone createBuilder = aqrm.a.createBuilder();
        if (aqrfVar != null) {
            aong aongVar = (aong) aulq.a.createBuilder();
            aongVar.e(ElementRendererOuterClass.elementRenderer, aqrfVar);
            aulq aulqVar = (aulq) aongVar.build();
            createBuilder.copyOnWrite();
            aqrm aqrmVar = (aqrm) createBuilder.instance;
            aulqVar.getClass();
            aqrmVar.c = aulqVar;
            aqrmVar.b |= 1;
        }
        this.f.H((aqrm) createBuilder.build());
    }

    @Override // defpackage.nrg
    public final void d() {
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
        nvf nvfVar = this.f;
        aone createBuilder2 = aqtr.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqtr aqtrVar = (aqtr) createBuilder2.instance;
        aqtu aqtuVar4 = (aqtu) createBuilder.build();
        aqtuVar4.getClass();
        aqtrVar.c = aqtuVar4;
        aqtrVar.b = 138681548;
        ((npr) nvfVar).e((aqtr) createBuilder2.build());
    }

    @Override // defpackage.itk
    public final void g() {
        LoadingFrameLayout loadingFrameLayout = ((npr) this.f).g;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.a();
        }
    }

    @Override // defpackage.nrg
    public final void h() {
    }

    @Override // defpackage.itk
    public final void i() {
        LoadingFrameLayout loadingFrameLayout = ((npr) this.f).g;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
    }

    @Override // defpackage.nve, defpackage.nvg
    public final /* bridge */ /* synthetic */ void k(Object obj, boolean z) {
        aqxd aqxdVar = (aqxd) obj;
        super.k(aqxdVar, z);
        w();
        if (aqxdVar == null) {
            return;
        }
        this.g = this.d.a(aqxdVar, this, this, Optional.of(this), this.e);
    }

    @Override // defpackage.nvg, defpackage.ajxa
    public final void lo() {
    }

    @Override // defpackage.nvg
    public final View m() {
        itl itlVar = this.g;
        itlVar.getClass();
        return itlVar.a();
    }

    @Override // defpackage.nvg
    public final ammv n() {
        return amlr.a;
    }

    @Override // defpackage.nvg
    public final ammv o() {
        return amlr.a;
    }

    @Override // defpackage.nrg
    public final void oS() {
    }

    @Override // defpackage.nrg
    public final void oT() {
        w();
    }

    @Override // defpackage.nvg
    public final void p(ajce ajceVar) {
    }

    @Override // defpackage.nvg
    public final void q() {
    }

    @Override // defpackage.nvg
    public final void r() {
    }

    @Override // defpackage.nvg
    public final void s() {
    }

    @Override // defpackage.nvg
    public final boolean t() {
        return false;
    }

    @Override // defpackage.nvg
    public final boolean u() {
        return false;
    }

    @Override // defpackage.ajwo
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }
}
