package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvs implements cvp {
    public final Map b;
    public volatile Map c;

    public cvs(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cvs) {
            return this.b.equals(((cvs) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
