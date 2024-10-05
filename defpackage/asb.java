package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asb implements plg {
    public static final asb a = new asb(new asa[0]);
    private static final asa e;
    private final asa[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        asa asaVar = new asa(-1, new int[0], new Uri[0], new long[0]);
        int[] iArr = asaVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = asaVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        e = new asa(0, copyOf, (Uri[]) Arrays.copyOf(asaVar.c, 0), copyOf2);
    }

    private asb(asa[] asaVarArr) {
        this.f = asaVarArr;
    }

    public final asa a(int i) {
        return i < 0 ? e : this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asb asbVar = (asb) obj;
            if (pts.R(null, null) && Arrays.equals(this.f, asbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
