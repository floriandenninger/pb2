package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgh {
    int a;
    int b;
    int c;
    int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dgh dghVar = (dgh) obj;
        return this.c == dghVar.c && this.b == dghVar.b && this.d == dghVar.d && this.a == dghVar.a;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
