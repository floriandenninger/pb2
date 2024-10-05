package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdy {
    public final long a;
    public final long b;

    public bdy(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdy)) {
            return false;
        }
        bdy bdyVar = (bdy) obj;
        return this.a == bdyVar.a && this.b == bdyVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
