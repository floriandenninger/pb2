package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amrn implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public amrn(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new amro(this.a);
    }
}
