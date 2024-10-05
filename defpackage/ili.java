package defpackage;

import android.util.SparseBooleanArray;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ili {
    public final SparseBooleanArray a = new SparseBooleanArray();
    private final ainy b;
    private final Optional c;
    private final aaea d;
    private int e;
    private final iji f;

    public ili(ainy ainyVar, Optional optional, iji ijiVar, aaea aaeaVar) {
        this.b = ainyVar;
        this.c = optional;
        this.f = ijiVar;
        this.d = aaeaVar;
    }

    private final boolean e() {
        return !this.c.isPresent() || ((fla) this.c.get()).b == fkw.REEL;
    }

    public final int a() {
        int i;
        int i2;
        if (!e()) {
            return 0;
        }
        this.b.a();
        synchronized (this.a) {
            do {
                i = this.e + 1;
                this.e = i;
                if (i == Integer.MAX_VALUE) {
                    this.e = 1;
                    i = 1;
                }
            } while (this.a.get(i));
            this.a.put(this.e, true);
            i2 = this.e;
        }
        return i2;
    }

    public final int b() {
        aujs aujsVar = this.d.a().u;
        if (aujsVar == null) {
            aujsVar = aujs.a;
        }
        aujz aujzVar = aujsVar.d;
        if (aujzVar == null) {
            aujzVar = aujz.a;
        }
        if (aujzVar.E && ((Boolean) this.f.a.a().map(ham.r).orElse(false)).booleanValue()) {
            return 0;
        }
        return a();
    }

    public final void c(int i) {
        synchronized (this.a) {
            if (i != 0) {
                if (this.a.get(i)) {
                    this.a.delete(i);
                    if (this.a.size() == 0 && e()) {
                        this.b.b();
                    }
                }
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.a.size() > 0;
        }
        return z;
    }
}
