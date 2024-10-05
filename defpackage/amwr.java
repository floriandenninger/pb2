package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class amwr extends amws implements amup {
    private static final long serialVersionUID = 0;
    transient Map a;

    public amwr(amup amupVar) {
        super(amupVar, null);
    }

    public amup b() {
        return (amup) this.f;
    }

    @Override // defpackage.amup
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = b().equals(obj);
        }
        return equals;
    }

    @Override // defpackage.amup
    public final int g() {
        throw null;
    }

    @Override // defpackage.amup
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.amup
    public final void m() {
        throw null;
    }

    @Override // defpackage.amup
    public final boolean o(Object obj) {
        boolean o;
        synchronized (this.g) {
            o = b().o(obj);
        }
        return o;
    }

    @Override // defpackage.amup
    public final boolean p(Object obj, Object obj2) {
        boolean p;
        synchronized (this.g) {
            p = b().p(obj, obj2);
        }
        return p;
    }

    @Override // defpackage.amup
    public final Collection q() {
        throw null;
    }

    @Override // defpackage.amup
    public final Map r() {
        Map map;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new amwh(b().r(), this.g);
            }
            map = this.a;
        }
        return map;
    }

    @Override // defpackage.amup
    public final Set s() {
        throw null;
    }
}
