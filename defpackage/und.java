package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class und {
    public final String a;

    public und(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof und) {
            return this.a.equals(((und) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
