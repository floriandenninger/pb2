package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnv implements plg {
    public static final /* synthetic */ int b = 0;
    public final psn a;

    static {
        muf.E(new psm());
    }

    public pnv(psn psnVar) {
        this.a = psnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pnv) {
            return this.a.equals(((pnv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
