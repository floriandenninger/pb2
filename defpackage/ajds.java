package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajds {
    public final aqrf a;
    public final byte[] b;

    private ajds(aqrf aqrfVar) {
        aqrfVar.getClass();
        this.a = aqrfVar;
        this.b = ajdx.a(aqrfVar);
    }

    public static ajds a(aqrf aqrfVar) {
        return new ajds(aqrfVar);
    }

    public final aqrg b() {
        aqrg aqrgVar = this.a.d;
        return aqrgVar == null ? aqrg.a : aqrgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajds) {
            return Objects.equals(this.a, ((ajds) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
