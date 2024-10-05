package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jaq implements abdr {
    private final boolean a;
    private final boolean b;
    private final axpg c;
    private final axpg d;

    public jaq(aadw aadwVar, axpg axpgVar, wju wjuVar, axpg axpgVar2, byte[] bArr) {
        this.a = evr.aL(aadwVar);
        this.b = wjuVar.b();
        this.c = axpgVar;
        this.d = axpgVar2;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        aone createBuilder = asen.a.createBuilder();
        boolean z = true;
        if (this.a) {
            boolean b = ((gzf) this.c.get()).b();
            createBuilder.copyOnWrite();
            asen asenVar = (asen) createBuilder.instance;
            asenVar.b = 1 | asenVar.b;
            asenVar.c = b;
            z = false;
        }
        if (this.b) {
            boolean c = ((gxd) this.d.get()).c();
            createBuilder.copyOnWrite();
            asen asenVar2 = (asen) createBuilder.instance;
            asenVar2.b |= 2;
            asenVar2.d = c;
        } else if (z) {
            return;
        }
        abduVar.A = (asen) createBuilder.build();
    }
}
