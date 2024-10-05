package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcf extends aasw implements abcp {
    private final afsy a;
    private final aasp b;
    private final aasp c;
    private final ysy g;
    private final yxn h;
    private final azrw i;

    public abcf(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, ysy ysyVar, yxn yxnVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(asbb.a, aarmVar, abce.a, abax.j);
        this.c = c(asay.a, aarmVar, abce.b, abax.i);
        ysyVar.getClass();
        this.g = ysyVar;
        yxnVar.getClass();
        this.h = yxnVar;
        this.i = azrwVar;
    }

    @Override // defpackage.abcp
    public final abcg a(String str) {
        abcg abcgVar = new abcg(this.f, this.a.c(), str, this.g, this.h, null, null, null);
        abcgVar.k = (String) this.i.get();
        return abcgVar;
    }

    @Override // defpackage.abcp
    public final abco b() {
        abco abcoVar = new abco(this.f, this.a.c(), null, null, null);
        abcoVar.k = (String) this.i.get();
        return abcoVar;
    }

    @Override // defpackage.abcp
    public final anhy d(abcg abcgVar) {
        return anfq.h(this.c.a(abcgVar), aard.i, angq.a);
    }

    @Override // defpackage.abcp
    public final anhy e(aaru aaruVar) {
        return this.b.a(aaruVar);
    }
}
