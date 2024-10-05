package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dyh implements dyn, dyj {
    public final String d;
    protected final Map e = new HashMap();

    public dyh(String str) {
        this.d = str;
    }

    public abstract dyn a(dxk dxkVar, List list);

    @Override // defpackage.dyn
    public dyn d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyh)) {
            return false;
        }
        dyh dyhVar = (dyh) obj;
        String str = this.d;
        if (str != null) {
            return str.equals(dyhVar.d);
        }
        return false;
    }

    @Override // defpackage.dyj
    public final dyn f(String str) {
        return this.e.containsKey(str) ? (dyn) this.e.get(str) : f;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.dyn
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.dyn
    public final String i() {
        return this.d;
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        if ("toString".equals(str)) {
            return new dyq(this.d);
        }
        return esv.q(this, new dyq(str), dxkVar, list);
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return esv.r(this.e);
    }

    @Override // defpackage.dyj
    public final void r(String str, dyn dynVar) {
        if (dynVar == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, dynVar);
        }
    }

    @Override // defpackage.dyj
    public final boolean t(String str) {
        return this.e.containsKey(str);
    }
}
