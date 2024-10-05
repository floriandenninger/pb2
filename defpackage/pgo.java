package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgo {
    public int a;
    private long[] b = new long[32];

    public final long a(int i) {
        if (i < 0 || i >= this.a) {
            int i2 = this.a;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Invalid size ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.b[i];
    }

    public final void b(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
