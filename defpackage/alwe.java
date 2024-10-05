package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwe implements alwg {
    boolean b;
    protected final Map a = new HashMap();
    boolean c = true;

    @Override // defpackage.alwg
    public final alwf a() {
        if (this.a.isEmpty()) {
            return this.b ? alwf.b : alwf.a;
        }
        return new alwf(new HashMap(this.a), this.b);
    }

    public final alwi b() {
        return a().g();
    }

    public final void c(alwi alwiVar) {
        boolean z = alwiVar.d;
        if (!this.c) {
            throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        this.b = z;
        Iterator it = alwiVar.c.iterator();
        while (it.hasNext()) {
            this.a.put(Integer.valueOf(((Integer) it.next()).intValue()), alwf.b);
        }
        for (alwh alwhVar : alwiVar.b) {
            Map map = this.a;
            Integer valueOf = Integer.valueOf(alwhVar.b);
            alwi alwiVar2 = alwhVar.c;
            if (alwiVar2 == null) {
                alwiVar2 = alwi.a;
            }
            map.put(valueOf, alwf.d(alwiVar2));
        }
    }

    public final void d(int... iArr) {
        for (int i : iArr) {
            e(i, alwf.b);
        }
    }

    public final void e(int i, alwf alwfVar) {
        if (this.b) {
            alwfVar = alwfVar.f();
        }
        if (!alwf.a.equals(alwfVar)) {
            this.a.put(Integer.valueOf(i), alwfVar);
        } else {
            this.a.remove(Integer.valueOf(i));
        }
        this.c = false;
    }
}
