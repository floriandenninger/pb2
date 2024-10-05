package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyf implements dyn {
    public final dyn a;
    public final String b;

    public dyf() {
        dyn dynVar = f;
        throw null;
    }

    public dyf(String str) {
        this.a = f;
        this.b = str;
    }

    public dyf(String str, dyn dynVar) {
        this.a = dynVar;
        this.b = str;
    }

    @Override // defpackage.dyn
    public final dyn d() {
        return new dyf(this.b, this.a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dyf)) {
            return false;
        }
        dyf dyfVar = (dyf) obj;
        return this.b.equals(dyfVar.b) && this.a.equals(dyfVar.a);
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.dyn
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }
}
