package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhj {
    public static final ajhj a = a().a();
    public final boolean b;

    public ajhj() {
    }

    public ajhj(boolean z) {
        this.b = z;
    }

    public static ajhi a() {
        ajhi ajhiVar = new ajhi();
        ajhiVar.b(false);
        return ajhiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ajhj) && this.b == ((ajhj) obj).b;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(47);
        sb.append("LocalElementsConfig{swipeToCameraEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
