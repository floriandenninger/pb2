package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkz {
    public final Set a;
    public final Set b;
    public final Set c;
    public apxf d;
    public final String e;

    public akkz() {
        new HashSet();
        new ArrayList();
        new HashMap();
        this.a = new HashSet();
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.c = Collections.newSetFromMap(new WeakHashMap());
        new HashMap();
        new ArrayList();
        this.e = "";
    }

    public final void a(akky akkyVar) {
        yjk.f();
        this.c.add(akkyVar);
        b(akkyVar);
    }

    public final void b(akky akkyVar) {
        akkyVar.a(this);
    }

    public final void c(akky akkyVar) {
        yjk.f();
        this.c.remove(akkyVar);
    }
}
