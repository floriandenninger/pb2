package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asa implements plg {
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public asa(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        pse.e(iArr.length == uriArr.length);
        this.a = 0L;
        this.b = i;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
        this.f = 0L;
        this.g = false;
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asa asaVar = (asa) obj;
            if (this.b == asaVar.b && Arrays.equals(this.c, asaVar.c) && Arrays.equals(this.d, asaVar.d) && Arrays.equals(this.e, asaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 961;
    }
}
