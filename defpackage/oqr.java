package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oqr {
    public final boolean a;

    public oqr() {
    }

    public oqr(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof oqr) && this.a == ((oqr) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(33);
        sb.append("ActivityArguments{forcedOn=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
