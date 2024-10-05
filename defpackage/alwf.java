package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwf implements alwg {
    public static final alwf a = new alwf(Collections.emptyMap(), false);
    public static final alwf b = new alwf(Collections.emptyMap(), true);
    public final Map c;
    public final boolean d;

    public alwf(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public static alwe b() {
        return new alwe();
    }

    public static alwf d(alwi alwiVar) {
        alwe b2 = b();
        b2.c(alwiVar);
        return b2.a();
    }

    @Override // defpackage.alwg
    public final alwf a() {
        throw null;
    }

    public final alwe c() {
        alwe b2 = b();
        b2.c(g());
        return b2;
    }

    public final alwf e(int i) {
        alwf alwfVar = (alwf) this.c.get(Integer.valueOf(i));
        if (alwfVar == null) {
            alwfVar = a;
        }
        return this.d ? alwfVar.f() : alwfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            alwf alwfVar = (alwf) obj;
            if (amkq.b(this.c, alwfVar.c) && amkq.b(Boolean.valueOf(this.d), Boolean.valueOf(alwfVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final alwf f() {
        if (this.c.isEmpty()) {
            return this.d ? a : b;
        }
        return new alwf(this.c, !this.d);
    }

    public final alwi g() {
        aone createBuilder = alwi.a.createBuilder();
        boolean z = this.d;
        createBuilder.copyOnWrite();
        ((alwi) createBuilder.instance).d = z;
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            alwf alwfVar = (alwf) this.c.get(Integer.valueOf(intValue));
            if (alwfVar.equals(b)) {
                createBuilder.copyOnWrite();
                alwi alwiVar = (alwi) createBuilder.instance;
                aonu aonuVar = alwiVar.c;
                if (!aonuVar.c()) {
                    alwiVar.c = aonm.mutableCopy(aonuVar);
                }
                alwiVar.c.g(intValue);
            } else {
                aone createBuilder2 = alwh.a.createBuilder();
                createBuilder2.copyOnWrite();
                ((alwh) createBuilder2.instance).b = intValue;
                alwi g = alwfVar.g();
                createBuilder2.copyOnWrite();
                alwh alwhVar = (alwh) createBuilder2.instance;
                g.getClass();
                alwhVar.c = g;
                alwh alwhVar2 = (alwh) createBuilder2.build();
                createBuilder.copyOnWrite();
                alwi alwiVar2 = (alwi) createBuilder.instance;
                alwhVar2.getClass();
                aony aonyVar = alwiVar2.b;
                if (!aonyVar.c()) {
                    alwiVar2.b = aonm.mutableCopy(aonyVar);
                }
                alwiVar2.b.add(alwhVar2);
            }
        }
        return (alwi) createBuilder.build();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        if (equals(a)) {
            Y.a("empty()");
        } else if (equals(b)) {
            Y.a("all()");
        } else {
            Y.b("fields", this.c);
            Y.g("inverted", this.d);
        }
        return Y.toString();
    }
}
