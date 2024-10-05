package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pjq {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final pms f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final pjr[] k;

    public pjq(int i, int i2, long j, long j2, long j3, pms pmsVar, int i3, pjr[] pjrVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = pmsVar;
        this.g = i3;
        this.k = pjrVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public pjq(int i, int i2, long j, long j2, long j3, pms pmsVar, int i3, pjr[] pjrVarArr, int i4, long[] jArr, long[] jArr2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = pmsVar;
        this.g = i3;
        this.k = pjrVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final pjr a(int i) {
        pjr[] pjrVarArr = this.k;
        if (pjrVarArr == null) {
            return null;
        }
        return pjrVarArr[i];
    }

    public final pjr b(int i) {
        pjr[] pjrVarArr = this.k;
        if (pjrVarArr == null) {
            return null;
        }
        return pjrVarArr[i];
    }
}
