package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nia {
    public apoj a;

    public nia(apoj apojVar) {
        apojVar.getClass();
        this.a = apojVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nia) {
            return this.a.equals(((nia) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 29;
    }
}
