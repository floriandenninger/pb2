package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class voi {
    public ammv a;
    public int b;
    private ammv c;

    public voi() {
    }

    public voi(byte[] bArr) {
        this.a = amlr.a;
        this.c = amlr.a;
    }

    public final voj a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: state");
        }
        return new voj(this.a, i, this.c);
    }

    public final void b(aoff aoffVar) {
        this.c = ammv.j(aoffVar);
    }
}
