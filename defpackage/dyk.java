package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dyk implements dyn, dyj {
    public final Map a = new HashMap();

    @Override // defpackage.dyn
    public final dyn d() {
        dyk dykVar = new dyk();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof dyj) {
                dykVar.a.put((String) entry.getKey(), (dyn) entry.getValue());
            } else {
                dykVar.a.put((String) entry.getKey(), ((dyn) entry.getValue()).d());
            }
        }
        return dykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dyk) {
            return this.a.equals(((dyk) obj).a);
        }
        return false;
    }

    @Override // defpackage.dyj
    public final dyn f(String str) {
        return this.a.containsKey(str) ? (dyn) this.a.get(str) : f;
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
        return this.a.hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        return "[object Object]";
    }

    @Override // defpackage.dyn
    public dyn ks(String str, dxk dxkVar, List list) {
        if ("toString".equals(str)) {
            return new dyq(toString());
        }
        return esv.q(this, new dyq(str), dxkVar, list);
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return esv.r(this.a);
    }

    @Override // defpackage.dyj
    public final void r(String str, dyn dynVar) {
        if (dynVar == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, dynVar);
        }
    }

    @Override // defpackage.dyj
    public final boolean t(String str) {
        return this.a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
