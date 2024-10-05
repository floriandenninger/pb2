package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axzj {
    public static final axzj a = new axzj(Collections.emptyMap());
    public final Map b;

    public axzj(Map map) {
        this.b = map;
    }

    public static axzh a() {
        return new axzh(a);
    }

    public final axzh b() {
        return new axzh(this);
    }

    public final Object c(axzi axziVar) {
        return this.b.get(axziVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axzj axzjVar = (axzj) obj;
        if (this.b.size() != axzjVar.b.size()) {
            return false;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            if (!axzjVar.b.containsKey(entry.getKey()) || !amkq.b(entry.getValue(), axzjVar.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
