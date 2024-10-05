package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcs {
    public final String a;

    public amcs(String str) {
        if (str == null) {
            throw new NullPointerException("Null uniquenessKey");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof amcs) && this.a.equals(((amcs) obj).a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 58);
        sb.append("UniqueWorkSpec{uniquenessKey=");
        sb.append(str);
        sb.append(", existingWorkPolicy=REPLACE}");
        return sb.toString();
    }

    public amcs() {
    }
}
