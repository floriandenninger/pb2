package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyr implements dyn {
    @Override // defpackage.dyn
    public final dyn d() {
        return dyn.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof dyr;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return false;
    }

    @Override // defpackage.dyn
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.dyn
    public final String i() {
        return "undefined";
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }
}
