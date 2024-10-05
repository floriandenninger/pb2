package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aepy implements aeqf {
    private final arpe a;
    private final amru b;
    private final Map c;

    public aepy(arpe arpeVar) {
        afki.a(arpeVar);
        this.a = arpeVar;
        if (arpeVar.g.size() == 0) {
            this.b = amru.q();
            this.c = Collections.emptyMap();
            return;
        }
        amrp f = amru.f();
        this.c = new HashMap();
        for (arpc arpcVar : arpeVar.g) {
            int i = 1;
            f.h(Integer.valueOf((aocz.bd(arpcVar.b) == 0 ? 1 : r2) - 1));
            Map map = this.c;
            String f2 = aear.f(arpcVar.c.I());
            int bd = aocz.bd(arpcVar.b);
            if (bd != 0) {
                i = bd;
            }
            map.put(f2, Integer.valueOf(i - 1));
        }
        this.b = f.g();
    }

    @Override // defpackage.aeqf
    public final amru a() {
        return this.b;
    }

    @Override // defpackage.aeqf
    public final String b() {
        return this.a.d;
    }

    @Override // defpackage.aeqf
    public final boolean c() {
        return this.a.h;
    }

    @Override // defpackage.aeqf
    public final boolean d() {
        afki.d(!e());
        return this.a.e;
    }

    public final boolean e() {
        int bc = aocz.bc(this.a.c);
        return bc != 0 && bc == 2;
    }

    @Override // defpackage.aeqf
    public final byte[] f() {
        return this.a.f.I();
    }

    public final String toString() {
        return "";
    }
}
