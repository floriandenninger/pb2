package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class balj implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected bajf b() {
        throw null;
    }

    public abstract bajh c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().k(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof balj)) {
            return false;
        }
        balj baljVar = (balj) obj;
        return d() == baljVar.d() && g().equals(baljVar.g()) && aynu.B(b(), baljVar.b());
    }

    public final String f(Locale locale) {
        return c().m(a(), locale);
    }

    public final bajj g() {
        return c().o();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        String n = c().n();
        StringBuilder sb = new StringBuilder(n.length() + 10);
        sb.append("Property[");
        sb.append(n);
        sb.append("]");
        return sb.toString();
    }
}
