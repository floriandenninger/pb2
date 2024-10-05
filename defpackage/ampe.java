package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ampe implements amvh {
    @Override // defpackage.amvh
    public void a(amvf amvfVar) {
        throw null;
    }

    @Override // defpackage.amvh
    public void b(amvf amvfVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amvh) {
            return c().equals(((amvh) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c().toString();
    }
}
