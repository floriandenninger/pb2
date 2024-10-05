package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxw {
    public final TimeUnit a;
    public int b = -1;
    private final int c = 5000;

    public amxw(TimeUnit timeUnit) {
        anaf.d(timeUnit, "time unit");
        this.a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amxw) {
            amxw amxwVar = (amxw) obj;
            int i = amxwVar.c;
            if (this.a == amxwVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 185000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("5000 ");
        sb.append(this.a);
        if (this.b > 0) {
            sb.append(" [skipped: ");
            sb.append(this.b);
            sb.append(']');
        }
        return sb.toString();
    }
}
