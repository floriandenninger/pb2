package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anui {
    public int a;
    private final Set b;
    private final Set c;
    private int d;
    private anul e;
    private Set f;

    @SafeVarargs
    public anui(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.a = 0;
        this.f = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            aocz.af(cls2, "Null interface");
        }
        Collections.addAll(this.b, clsArr);
    }

    public final anuj a() {
        aocz.ad(this.e != null, "Missing required property: factory.");
        return new anuj(new HashSet(this.b), new HashSet(this.c), this.d, this.a, this.e, this.f);
    }

    public final void b(anuu anuuVar) {
        if (!this.b.contains(anuuVar.a)) {
            this.c.add(anuuVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final void c(anul anulVar) {
        aocz.af(anulVar, "Null factory");
        this.e = anulVar;
    }

    public final void d(int i) {
        aocz.ad(this.d == 0, "Instantiation type has already been set.");
        this.d = i;
    }

    public final void e() {
        d(1);
    }
}
