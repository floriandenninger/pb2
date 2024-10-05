package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbf implements pbg {
    private final pbe a;

    public pbf(pbe pbeVar) {
        this.a = pbeVar;
    }

    @Override // defpackage.pbg
    public final pbe a(UUID uuid) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return pgz.p(this.a, ((pbf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
