package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bty {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public bty(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0291 A[Catch: all -> 0x02bb, TryCatch #3 {all -> 0x02bb, all -> 0x02a1, blocks: (B:47:0x0196, B:52:0x01af, B:53:0x01b4, B:55:0x01ba, B:62:0x01c6, B:65:0x01d4, B:90:0x0282, B:92:0x0291, B:96:0x0286, B:99:0x02a2, B:100:0x02a5, B:67:0x01ec, B:73:0x0211, B:74:0x021b, B:76:0x0221, B:79:0x0227, B:83:0x0248, B:89:0x0259), top: B:46:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bty a(defpackage.buo r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bty.a(buo, java.lang.String):bty");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bty)) {
            return false;
        }
        bty btyVar = (bty) obj;
        if (!this.a.equals(btyVar.a)) {
            return false;
        }
        Map map = this.b;
        if (map == null ? btyVar.b != null : !map.equals(btyVar.b)) {
            return false;
        }
        Set set2 = this.c;
        if (set2 == null ? btyVar.c != null : !set2.equals(btyVar.c)) {
            return false;
        }
        Set set3 = this.d;
        if (set3 == null || (set = btyVar.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
