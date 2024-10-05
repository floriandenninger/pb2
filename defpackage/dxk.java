package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxk {
    public final dxk a;
    final dyu b;
    final Map c = new HashMap();
    final Map d = new HashMap();

    public dxk(dxk dxkVar, dyu dyuVar) {
        this.a = dxkVar;
        this.b = dyuVar;
    }

    public final dxk a() {
        return new dxk(this, this.b);
    }

    public final dyn b(dyn dynVar) {
        return this.b.a(this, dynVar);
    }

    public final dyn c(dyd dydVar) {
        dyn dynVar = dyn.f;
        Iterator k = dydVar.k();
        while (k.hasNext()) {
            dynVar = this.b.a(this, dydVar.e(((Integer) k.next()).intValue()));
            if (dynVar instanceof dyf) {
                break;
            }
        }
        return dynVar;
    }

    public final dyn d(String str) {
        if (this.c.containsKey(str)) {
            return (dyn) this.c.get(str);
        }
        dxk dxkVar = this.a;
        if (dxkVar == null) {
            throw new IllegalArgumentException(String.format("%s is not defined", str));
        }
        return dxkVar.d(str);
    }

    public final void e(String str, dyn dynVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (dynVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, dynVar);
        }
    }

    public final void f(String str, dyn dynVar) {
        e(str, dynVar);
        this.d.put(str, true);
    }

    public final void g(String str, dyn dynVar) {
        dxk dxkVar;
        if (this.c.containsKey(str) || (dxkVar = this.a) == null || !dxkVar.h(str)) {
            if (this.d.containsKey(str)) {
                return;
            }
            if (dynVar == null) {
                this.c.remove(str);
                return;
            } else {
                this.c.put(str, dynVar);
                return;
            }
        }
        this.a.g(str, dynVar);
    }

    public final boolean h(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        dxk dxkVar = this.a;
        if (dxkVar != null) {
            return dxkVar.h(str);
        }
        return false;
    }
}
