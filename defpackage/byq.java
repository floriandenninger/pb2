package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byq {
    public final Set a = new HashSet();

    public final int a() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((byq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
