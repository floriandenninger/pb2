package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajts {
    public final boolean a;

    public ajts() {
    }

    public ajts(boolean z) {
        this.a = z;
    }

    public static ajts a() {
        return new ajts(false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ajts) && this.a == ((ajts) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(39);
        sb.append("ContinuationContext{wasScheduled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
