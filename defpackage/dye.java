package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dye implements dyn {
    private final boolean a;

    public dye(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.dyn
    public final dyn d() {
        return new dye(Boolean.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dye) && this.a == ((dye) obj).a;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.dyn
    public final Double h() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        if (!"toString".equals(str)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
        }
        return new dyq(i());
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
