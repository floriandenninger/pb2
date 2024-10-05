package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adce {
    private static final String d = zga.a("MDX.DiscoveryController");
    private final axpg e;
    private final axpg f;
    private final axpg g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final ji k = new ji();
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Object c = new Object();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());

    public adce(axpg axpgVar, axpg axpgVar2, axpg axpgVar3) {
        this.e = axpgVar;
        this.f = axpgVar2;
        this.g = axpgVar3;
    }

    private final void c(boolean z) {
        ((bpw) this.e.get()).q((bph) this.f.get(), this.k, true != z ? 4 : 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj) {
        yjk.f();
        synchronized (this.c) {
            boolean remove = this.a.remove(obj);
            this.b.remove(obj);
            if (!remove) {
                String str = d;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("cancelDiscoveryRequest ignored requester ");
                sb.append(valueOf);
                zga.m(str, sb.toString());
                return;
            }
            if (this.i) {
                if (this.a.isEmpty()) {
                    ((bpw) this.e.get()).r(this.k);
                    this.i = false;
                    this.j = false;
                } else if (this.j && this.b.isEmpty()) {
                    c(false);
                    this.j = false;
                }
            }
        }
    }

    public final void b(Object obj, boolean z) {
        yjk.f();
        if (!this.h) {
            bpd bpdVar = (bpd) this.g.get();
            if (bpdVar == null) {
                throw new IllegalArgumentException("providerInstance must not be null");
            }
            bpw.c();
            bpw.a().g(bpdVar);
            this.h = true;
        }
        synchronized (this.c) {
            if (this.a.add(obj)) {
                if (z) {
                    this.b.add(obj);
                }
                if (!this.i || (z && !this.j)) {
                    c(z);
                    this.i = true;
                    this.j = z;
                }
            }
        }
    }
}
