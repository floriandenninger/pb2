package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class sbg {
    private final String a;

    public sbg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((sbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 31;
    }
}
