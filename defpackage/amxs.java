package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amxs implements amxt {
    public static final amxs a = new amxq();

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(b());
        sb.append(", method=");
        sb.append(d());
        sb.append(", line=");
        sb.append(a());
        if (c() != null) {
            sb.append(", file=");
            sb.append(c());
        }
        sb.append(" }");
        return sb.toString();
    }
}
