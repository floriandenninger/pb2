package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bake implements baka {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        baka bakaVar = (baka) obj;
        if (this == bakaVar) {
            return 0;
        }
        long st = bakaVar.st();
        long st2 = st();
        if (st2 == st) {
            return 0;
        }
        return st2 < st ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baka)) {
            return false;
        }
        baka bakaVar = (baka) obj;
        return st() == bakaVar.st() && aynu.B(su(), bakaVar.su());
    }

    public final int hashCode() {
        return ((int) (st() ^ (st() >>> 32))) + su().hashCode();
    }

    public final bajn k() {
        return su().z();
    }

    public final int l() {
        return su().f().a(st());
    }

    public final int m() {
        return su().k().a(st());
    }

    public final int n() {
        return su().p().a(st());
    }

    public final int o() {
        return su().q().a(st());
    }

    public final int p() {
        return su().w().a(st());
    }

    public String toString() {
        return bamy.d.a(this);
    }
}
