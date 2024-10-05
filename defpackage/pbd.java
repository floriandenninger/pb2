package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbd implements pbg {
    private final Map a = new HashMap();

    @Override // defpackage.pbg
    public final pbe a(UUID uuid) {
        return (pbe) this.a.get(uuid);
    }

    public final void b(UUID uuid, pbe pbeVar) {
        this.a.put(uuid, pbeVar);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pbd pbdVar = (pbd) obj;
        if (this.a.size() != pbdVar.a.size()) {
            return false;
        }
        for (UUID uuid : this.a.keySet()) {
            if (!pgz.p(this.a.get(uuid), pbdVar.a.get(uuid))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
