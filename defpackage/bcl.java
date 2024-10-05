package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcl {
    public final int a;
    public final boolean b;

    public bcl(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bcl bclVar = (bcl) obj;
            if (this.a == bclVar.a && this.b == bclVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
