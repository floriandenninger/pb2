package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbc {
    private final String[] a;
    private final int[] b;
    private final String[] c;
    private final int d;

    public pbc(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public final String a(String str, int i, int i2, long j) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.d;
            if (i3 < i4) {
                sb.append(this.a[i3]);
                int i5 = this.b[i3];
                if (i5 == 1) {
                    sb.append(str);
                } else if (i5 == 2) {
                    sb.append(String.format(Locale.US, this.c[i3], Integer.valueOf(i)));
                } else if (i5 == 3) {
                    sb.append(String.format(Locale.US, this.c[i3], Integer.valueOf(i2)));
                } else if (i5 == 4) {
                    sb.append(String.format(Locale.US, this.c[i3], Long.valueOf(j)));
                }
                i3++;
            } else {
                sb.append(this.a[i4]);
                return sb.toString();
            }
        }
    }
}
