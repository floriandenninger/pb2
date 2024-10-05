package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ash {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ash(ash ashVar) {
        this.a = ashVar.a;
        this.b = ashVar.b;
        this.c = ashVar.c;
        this.d = ashVar.d;
        this.e = ashVar.e;
    }

    public ash(Object obj) {
        this(obj, -1, -1, -1L, -1);
    }

    public ash(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final ash b(Object obj) {
        return new ash(!this.a.equals(obj) ? new ash(obj, this.b, this.c, this.d, this.e) : this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ash)) {
            return false;
        }
        ash ashVar = (ash) obj;
        return this.a.equals(ashVar.a) && this.b == ashVar.b && this.c == ashVar.c && this.d == ashVar.d && this.e == ashVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public ash(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public ash(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
