package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eux {
    final String a;
    final Class b;
    private int c;

    public eux(String str, Class cls) {
        this.a = ammx.d(str);
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eux)) {
            return false;
        }
        eux euxVar = (eux) obj;
        return this.a.equals(euxVar.a) && this.b.equals(euxVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }
}
