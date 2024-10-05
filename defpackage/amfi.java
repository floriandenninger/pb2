package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfi {
    public final amhe a;

    public amfi(amhe amheVar) {
        this.a = amheVar;
    }

    public final String a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof amfi) && this.a.b.equals(((amfi) obj).a.b);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", a());
    }
}
