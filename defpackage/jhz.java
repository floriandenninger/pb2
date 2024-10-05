package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jhz {
    private final String a;
    private final jhy b;

    public jhz(jhy jhyVar, String str) {
        zhq.m(str);
        this.a = str;
        this.b = jhyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jhz)) {
            return false;
        }
        jhz jhzVar = (jhz) obj;
        return amkq.b(this.a, jhzVar.a) && amkq.b(this.b, jhzVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.b == jhy.PLAYLIST ? "PLAYLIST" : "VIDEO";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
