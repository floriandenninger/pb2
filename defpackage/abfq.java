package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfq implements afxj {
    private final abfj a;
    private final abfp b;
    private final ajbh c;

    public abfq(abfj abfjVar, abfp abfpVar, ajbh ajbhVar, byte[] bArr, byte[] bArr2) {
        this.a = abfjVar;
        this.b = abfpVar;
        this.c = ajbhVar;
    }

    @Override // defpackage.afxj
    public final void a(String str) {
        int i = this.c.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.a.a(str);
        } else {
            if (i2 != 2) {
                return;
            }
            this.b.a(str);
        }
    }
}
