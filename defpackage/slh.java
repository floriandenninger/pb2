package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slh extends dha {

    @dnt(a = 13)
    ayqw a;

    @dnt(a = 13)
    sxk b;

    @dnt(a = 10)
    dha c;

    @dnt(a = 13)
    sxt d;

    @dnt(a = 13)
    szf e;

    public slh() {
        super("ElementsRootFlat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final amsj at(dhe dheVar, amsj amsjVar) {
        amsj D = amsj.D(amsjVar);
        D.w(sxt.class, this.d);
        D.w(sxk.class, this.b);
        D.w(ayqw.class, this.a);
        D.w(szf.class, this.e);
        return D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        return this.c;
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        slh slhVar = (slh) super.j();
        dha dhaVar = slhVar.c;
        slhVar.c = dhaVar != null ? dhaVar.j() : null;
        return slhVar;
    }
}
