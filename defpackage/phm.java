package defpackage;

import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class phm {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public phr d;
    public boolean e;

    public phm(int i, String str, phr phrVar) {
        this.a = i;
        this.b = str;
        this.d = phrVar;
    }

    public final phz a(long j) {
        phz phzVar = new phz(this.b, j, -1L, -9223372036854775807L, null);
        phz phzVar2 = (phz) this.c.floor(phzVar);
        if (phzVar2 != null && phzVar2.b + phzVar2.c > j) {
            return phzVar2;
        }
        phz phzVar3 = (phz) this.c.ceiling(phzVar);
        return phzVar3 == null ? phz.d(this.b, j) : new phz(this.b, j, phzVar3.b - j, -9223372036854775807L, null);
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            phm phmVar = (phm) obj;
            if (this.a == phmVar.a && this.b.equals(phmVar.b) && this.c.equals(phmVar.c) && this.d.equals(phmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
