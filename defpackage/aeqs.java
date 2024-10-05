package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeqs implements afgj {
    public static final afgj b = new aeqs("rqs");
    public static final afgj c = new aeqs("manifestless");
    public final String d;

    public aeqs(String str) {
        this.d = str;
    }

    @Override // defpackage.afgj
    public String a(long j) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeqs) {
            return this.d.equals(((aeqs) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
