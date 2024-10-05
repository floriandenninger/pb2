package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obr implements obs {
    public final aypn a;
    private final azqv d;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    public int b = 0;

    public obr() {
        azqv aq = azqv.aq(0);
        this.d = aq;
        this.a = aq.J().ah().b(0);
    }

    public final void a(obq obqVar) {
        this.c.add(obqVar);
    }

    public final void b(obq obqVar) {
        this.c.remove(obqVar);
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b == 3;
    }

    @Override // defpackage.obs
    public final boolean e() {
        return this.b == 1;
    }

    @Override // defpackage.obs
    public final boolean f() {
        return this.b == 2;
    }

    @Override // defpackage.obs
    public final boolean g() {
        return muf.B(this.b);
    }

    public final boolean h(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((obq) it.next()).o(i);
        }
        this.d.c(Integer.valueOf(i));
        return true;
    }
}
