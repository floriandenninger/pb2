package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnx {
    private final psn a;

    public pnx(psn psnVar) {
        this.a = psnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pnx) {
            return this.a.equals(((pnx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
