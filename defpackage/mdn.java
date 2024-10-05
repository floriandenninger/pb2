package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdn implements amml {
    public final /* synthetic */ gad a;
    public final /* synthetic */ ci b;
    public final /* synthetic */ wjt c;
    public final /* synthetic */ wju d;
    public final /* synthetic */ afsy e;
    public final /* synthetic */ wjz f;
    public final /* synthetic */ rxm g;
    public final /* synthetic */ trp h;
    private final /* synthetic */ int i;

    public /* synthetic */ mdn(gad gadVar, ci ciVar, rxm rxmVar, trp trpVar, wjt wjtVar, wju wjuVar, afsy afsyVar, wjz wjzVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = i;
        this.a = gadVar;
        this.b = ciVar;
        this.g = rxmVar;
        this.h = trpVar;
        this.c = wjtVar;
        this.d = wjuVar;
        this.e = afsyVar;
        this.f = wjzVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.i == 0) {
            gad gadVar = this.a;
            ci ciVar = this.b;
            rxm rxmVar = this.g;
            trp trpVar = this.h;
            wjt wjtVar = this.c;
            wju wjuVar = this.d;
            afsy afsyVar = this.e;
            wjz wjzVar = this.f;
            amsv amsvVar = (amsv) obj;
            amsvVar.j(gadVar.a.c);
            amsvVar.c(new lmv(ciVar, rxmVar, trpVar, wjtVar, wjuVar, afsyVar, wjzVar, null, null, null));
            amsvVar.c(new mae(ciVar));
            return amsvVar;
        }
        fzf fzfVar = (fzf) obj;
        fzfVar.e(new mdn(this.a, this.b, this.g, this.h, this.c, this.d, this.e, this.f, 0, null, null, null));
        return fzfVar;
    }
}
