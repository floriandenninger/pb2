package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class roq implements qnu {
    public static final roq a = new roq();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof roq)) {
            return false;
        }
        roq roqVar = (roq) obj;
        boolean z = roqVar.b;
        boolean z2 = roqVar.c;
        String str = roqVar.d;
        if (qar.j(null, null)) {
            boolean z3 = roqVar.e;
            boolean z4 = roqVar.i;
            String str2 = roqVar.g;
            if (qar.j(null, null)) {
                String str3 = roqVar.h;
                if (qar.j(null, null)) {
                    Long l = roqVar.j;
                    if (qar.j(null, null)) {
                        Long l2 = roqVar.k;
                        if (qar.j(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
