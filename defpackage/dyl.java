package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyl implements dyn {
    @Override // defpackage.dyn
    public final dyn d() {
        return dyn.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof dyl;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return false;
    }

    @Override // defpackage.dyn
    public final Double h() {
        return Double.valueOf(0.0d);
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.dyn
    public final String i() {
        return "null";
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }
}
