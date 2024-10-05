package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sog extends dha {
    public static final /* synthetic */ int A = 0;

    @dnt(a = 14)
    private sof B;

    @dnt(a = 13)
    sxc a;

    @dnt(a = 3)
    boolean b;

    @dnt(a = 13)
    azrw c;

    @dnt(a = 13)
    azrw d;

    @dnt(a = 3)
    boolean e;

    @dnt(a = 13)
    aypy f;

    @dnt(a = 13)
    syd g;

    @dnt(a = 13)
    szh v;

    @dnt(a = 13)
    sow w;

    @dnt(a = 13)
    ayqw x;

    @dnt(a = 13)
    sxk y;

    @dnt(a = 13)
    sxt z;

    public sog() {
        super("ComponentType");
        this.B = new sof();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        sox.c(dheVar, baqlVar, this.z, this.x, this.y, this.w, this.f, this.a, this.g, this.b, this.e);
        this.B.b = (spy) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        sof sofVar = (sof) dlqVar;
        sof sofVar2 = (sof) dlqVar2;
        sofVar2.a = sofVar.a;
        sofVar2.b = sofVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void aq() {
        sox.b(this.a, this.w, this.c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void au(amsj amsjVar) {
        if (amsjVar == null) {
            return;
        }
        this.x = (ayqw) amsjVar.v(ayqw.class);
        this.y = (sxk) amsjVar.v(sxk.class);
        this.z = (sxt) amsjVar.v(sxt.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        sof sofVar = this.B;
        spy spyVar = sofVar.b;
        int i = sofVar.a;
        return sox.a(dheVar, spyVar, this.x, this.w, this.f, this.a, this.g, this.v, this.b, this.e);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        sog sogVar = (sog) super.j();
        sogVar.B = new sof();
        return sogVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.B;
    }
}
