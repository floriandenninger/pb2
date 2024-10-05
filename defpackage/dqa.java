package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqa {
    public final int a;
    public final int b;
    public final dqd c;
    public int d;
    public int e;
    public final esv f;

    @Deprecated
    public dqa() {
        int i = dpz.g;
        throw null;
    }

    @Deprecated
    public dqa(int i, int i2, dqd dqdVar, esv esvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = Integer.MAX_VALUE;
        this.e = 1;
        if (i != 1 || i2 == Integer.MIN_VALUE || i2 == -1) {
            this.a = i;
            this.b = i2;
            this.c = dqdVar == null ? dpz.a : dqdVar;
            this.f = esvVar == null ? dpz.e : esvVar;
            return;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
