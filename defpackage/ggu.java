package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggu implements ghc {
    final /* synthetic */ ggy a;
    private final /* synthetic */ int b;

    public ggu(ggy ggyVar, int i) {
        this.b = i;
        this.a = ggyVar;
    }

    public /* synthetic */ ggu(ggy ggyVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ggyVar;
    }

    @Override // defpackage.ghc
    public final void a(asno asnoVar, asni asniVar) {
        if (this.b == 0) {
            if (this.a.b.isPresent() && asnoVar == this.a.b.get()) {
                this.a.j(asnoVar, (aong) asniVar.toBuilder());
                return;
            }
            return;
        }
        ggy ggyVar = this.a;
        if (!ggyVar.a || ggy.g(asniVar)) {
            return;
        }
        ggyVar.j(asnoVar, (aong) asniVar.toBuilder());
    }
}
