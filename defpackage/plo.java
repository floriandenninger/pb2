package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class plo implements plg {
    public final int a = 0;
    public final int b;
    public final int c;

    static {
        new plo(0, 0);
    }

    public plo(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plo)) {
            return false;
        }
        plo ploVar = (plo) obj;
        int i = ploVar.a;
        return this.b == ploVar.b && this.c == ploVar.c;
    }

    public final int hashCode() {
        return ((this.b + 16337) * 31) + this.c;
    }
}
