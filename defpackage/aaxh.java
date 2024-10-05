package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxh {
    public final arss a;

    public aaxh(arss arssVar) {
        this.a = arssVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaxh) {
            return this.a.equals(((aaxh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
