package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uir {
    public ammv a;
    public ammv b;
    public Boolean c;
    private ammv d;
    private ammv e;
    private ammv f;
    private ammv g;

    public uir(uis uisVar) {
        this.d = amlr.a;
        this.e = amlr.a;
        this.f = amlr.a;
        this.a = amlr.a;
        this.b = amlr.a;
        this.g = amlr.a;
        this.d = uisVar.a;
        this.e = uisVar.b;
        this.f = uisVar.c;
        this.a = uisVar.d;
        this.b = uisVar.e;
        this.g = uisVar.f;
        this.c = Boolean.valueOf(uisVar.g);
    }

    public uir(byte[] bArr) {
        this.d = amlr.a;
        this.e = amlr.a;
        this.f = amlr.a;
        this.a = amlr.a;
        this.b = amlr.a;
        this.g = amlr.a;
    }

    public final uis a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: supportAccountSwitching");
        }
        return new uis(this.d, this.e, this.f, this.a, this.b, this.g, bool.booleanValue());
    }

    public final void b(uio uioVar) {
        this.g = ammv.j(uioVar);
    }

    public uir() {
    }
}
