package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyo implements dyn {
    public final String a;
    public final ArrayList b;

    public dyo(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.dyn
    public final dyn d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyo)) {
            return false;
        }
        dyo dyoVar = (dyo) obj;
        String str = this.a;
        if (str == null ? dyoVar.a == null : str.equals(dyoVar.a)) {
            return this.b.equals(dyoVar.b);
        }
        return false;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.dyn
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }
}
