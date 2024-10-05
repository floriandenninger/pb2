package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidb {
    public int a;
    public float b;
    public final Set c = new CopyOnWriteArraySet();

    public final void a(aida aidaVar) {
        this.c.add(aidaVar);
    }

    public final void b(aida aidaVar) {
        this.c.remove(aidaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(float f, boolean z) {
        this.b = f;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aida) it.next()).nW(f, z);
        }
    }

    public final boolean d() {
        return this.a == 2;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final boolean g() {
        return f() || d();
    }
}
