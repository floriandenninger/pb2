package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btx {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public btx(String str, List list) {
        this(str, false, list, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btx)) {
            return false;
        }
        btx btxVar = (btx) obj;
        if (this.b != btxVar.b || !this.c.equals(btxVar.c) || !this.d.equals(btxVar.d)) {
            return false;
        }
        if (this.a.startsWith("index_")) {
            return btxVar.a.startsWith("index_");
        }
        return this.a.equals(btxVar.a);
    }

    public final int hashCode() {
        return ((((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + '}';
    }

    public btx(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), "ASC") : list2;
    }
}
