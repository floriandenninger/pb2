package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfx {
    public ammv a;
    public ammv b;
    public ammv c;
    public ammv d;
    private ammv e;
    private ammv f;
    private Integer g;
    private ammv h;

    public sfx(sfy sfyVar) {
        this.a = amlr.a;
        this.b = amlr.a;
        this.c = amlr.a;
        this.e = amlr.a;
        this.f = amlr.a;
        this.h = amlr.a;
        this.d = amlr.a;
        this.a = sfyVar.a;
        this.b = sfyVar.b;
        this.c = sfyVar.c;
        this.e = sfyVar.d;
        this.f = sfyVar.e;
        this.g = Integer.valueOf(sfyVar.f);
        this.h = sfyVar.g;
        this.d = sfyVar.h;
    }

    public sfx(byte[] bArr) {
        this.a = amlr.a;
        this.b = amlr.a;
        this.c = amlr.a;
        this.e = amlr.a;
        this.f = amlr.a;
        this.h = amlr.a;
        this.d = amlr.a;
    }

    public final sfy a() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("Missing required properties: inputModality");
        }
        return new sfy(this.a, this.b, this.c, this.e, this.f, num.intValue(), this.h, this.d);
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public sfx() {
    }
}
