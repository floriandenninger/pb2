package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsf {
    public ammv a;
    private amru b;

    public hsf() {
    }

    public hsf(byte[] bArr) {
        this.a = amlr.a;
    }

    public final hsg a() {
        amru amruVar = this.b;
        if (amruVar == null) {
            throw new IllegalStateException("Missing required properties: thumbnailList");
        }
        return new hsg(amruVar, this.a);
    }

    public final void b(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null thumbnailList");
        }
        this.b = amruVar;
    }
}
