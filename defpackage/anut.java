package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anut {
    public final boolean a;
    private final Class b;

    public anut(Class cls, boolean z) {
        this.b = cls;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anut) {
            anut anutVar = (anut) obj;
            if (anutVar.b.equals(this.b) && anutVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
