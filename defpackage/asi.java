package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asi implements plg {
    public final int a;
    public final pms[] b;
    private int c;

    public asi(pms... pmsVarArr) {
        int length = pmsVarArr.length;
        int i = 1;
        pse.e(length > 0);
        this.b = pmsVarArr;
        this.a = length;
        String c = c(pmsVarArr[0].e);
        int b = b(pmsVarArr[0].g);
        while (true) {
            pms[] pmsVarArr2 = this.b;
            if (i >= pmsVarArr2.length) {
                return;
            }
            if (c.equals(c(pmsVarArr2[i].e))) {
                if (b != b(this.b[i].g)) {
                    d("role flags", Integer.toBinaryString(this.b[0].g), Integer.toBinaryString(this.b[i].g), i);
                    return;
                }
                i++;
            } else {
                pms[] pmsVarArr3 = this.b;
                d("languages", pmsVarArr3[0].e, pmsVarArr3[i].e, i);
                return;
            }
        }
    }

    private static int b(int i) {
        return i | 16384;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        prh.j("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final pms a(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asi asiVar = (asi) obj;
            if (this.a == asiVar.a && Arrays.equals(this.b, asiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b) + 527;
        this.c = hashCode;
        return hashCode;
    }
}
