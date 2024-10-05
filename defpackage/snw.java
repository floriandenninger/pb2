package defpackage;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snw extends dha {

    @dnt(a = 13)
    stk A;

    @dnt(a = 13)
    ayqw B;

    @dnt(a = 13)
    sxk C;

    @dnt(a = 13)
    sxt D;

    @dnt(a = 13)
    sod E;

    @dnt(a = 14)
    private final snv F;

    @dnt(a = 6)
    List a;

    @dnt(a = 13)
    axol b;

    @dnt(a = 13)
    sww c;

    @dnt(a = 13)
    sxc d;

    @dnt(a = 13)
    String e;

    @dnt(a = 13)
    axou f;

    @dnt(a = 3)
    boolean g;

    @dnt(a = 13)
    szx v;

    @dnt(a = 13)
    szx w;

    @dnt(a = 13)
    szx x;

    @dnt(a = 13)
    AtomicReference y;

    @dnt(a = 13)
    azrw z;

    public snw() {
        super("Collection");
        this.F = new snv();
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        int i = diyVar.b;
        if (i == -1048037474) {
            N((dhe) diyVar.c[0], (diw) obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        dji djiVar = diyVar.a;
        View view = ((dmy) obj).a;
        snw snwVar = (snw) djiVar;
        axol axolVar = snwVar.b;
        AtomicReference atomicReference = snwVar.y;
        snv snvVar = snwVar.F;
        soc.e(axolVar, atomicReference, snvVar.f, snvVar.d);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        baql baqlVar6 = new baql();
        soc.f(dheVar, this.z, this.f, this.b, baqlVar, baqlVar2, baqlVar3, baqlVar4, baqlVar5, baqlVar6);
        snv snvVar = this.F;
        snvVar.f = (dsz) baqlVar.a;
        snvVar.c = (syu) baqlVar2.a;
        snvVar.d = (AtomicBoolean) baqlVar3.a;
        snvVar.b = (AtomicBoolean) baqlVar4.a;
        snvVar.a = (swt) baqlVar5.a;
        snvVar.e = (taq) baqlVar6.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        snv snvVar = (snv) dlqVar;
        snv snvVar2 = (snv) dlqVar2;
        snvVar2.a = snvVar.a;
        snvVar2.f = snvVar.f;
        snvVar2.b = snvVar.b;
        snvVar2.c = snvVar.c;
        snvVar2.d = snvVar.d;
        snvVar2.e = snvVar.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final void ao() {
        String str = this.e;
        snv snvVar = this.F;
        soc.c(str, snvVar.f, snvVar.b);
    }

    @Override // defpackage.dhk
    public final void ap() {
        soc.d(this.e, this.F.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void au(amsj amsjVar) {
        if (amsjVar == null) {
            return;
        }
        this.B = (ayqw) amsjVar.v(ayqw.class);
        this.C = (sxk) amsjVar.v(sxk.class);
        this.D = (sxt) amsjVar.v(sxt.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        sxt sxtVar = this.D;
        sxk sxkVar = this.C;
        ayqw ayqwVar = this.B;
        sxc sxcVar = this.d;
        axol axolVar = this.b;
        List list = this.a;
        sww swwVar = this.c;
        snv snvVar = this.F;
        return soc.b(dheVar, sxtVar, sxkVar, ayqwVar, sxcVar, axolVar, list, swwVar, snvVar.f, snvVar.b, snvVar.c, this.g, this.y, this.w, this.v, this.x, this.E, snvVar.a, snvVar.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.F;
    }
}
