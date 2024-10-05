package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfn implements pfq {
    private final byte[] a;
    private int b;
    private int c;

    public pfn(byte[] bArr) {
        opn.h(bArr);
        opn.i(bArr.length > 0);
        this.a = bArr;
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.a, this.b, bArr, i, min);
        this.b += min;
        this.c -= min;
        return min;
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        long j = pfsVar.d;
        int i = (int) j;
        this.b = i;
        long j2 = pfsVar.e;
        int length = (int) (j2 == -1 ? this.a.length - j : j2);
        this.c = length;
        if (length > 0 && i + length <= this.a.length) {
            return length;
        }
        int length2 = this.a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // defpackage.pfq
    public final void c() {
    }
}
