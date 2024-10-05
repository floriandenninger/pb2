package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yys {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final azrw d;
    public final shf e;
    public final yyw f;
    public final Queue g;
    public final Queue h;
    public final azrw i;
    public final azrw j;
    public final azrw k;
    public final nbq l;
    public final whl m;
    private final AtomicReferenceArray n;
    private final azrw o;
    private final int[] p;

    public yys(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, shf shfVar, whl whlVar, yxx yxxVar, nbq nbqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.o = azrwVar;
        this.d = azrwVar2;
        this.i = azrwVar3;
        this.j = azrwVar4;
        this.k = azrwVar5;
        this.e = shfVar;
        this.m = whlVar;
        int f = (int) yxxVar.f(yxx.H);
        this.b = (yxxVar.f(yxx.E) & 4194304) != 0;
        boolean z = f > ThreadLocalRandom.current().nextInt(127);
        this.a = z;
        this.c = new ArrayList();
        this.p = new int[]{0, 1, 0, 0, 1, 1, 1};
        this.n = new AtomicReferenceArray(12);
        this.l = nbqVar;
        if (z) {
            this.f = new yyw();
            this.g = new ConcurrentLinkedQueue();
            this.h = new ConcurrentLinkedQueue();
        } else {
            this.f = null;
            nbqVar.c();
            this.g = null;
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return this.p[i];
    }

    public final synchronized yyr b(String str) {
        yyr yyrVar;
        yyrVar = new yyr(this, str);
        this.c.add(yyrVar);
        return yyrVar;
    }

    public final Executor c() {
        return (Executor) this.o.get();
    }

    public final void d(int i) {
        Object obj = this.n.get(i);
        if (obj == null || obj == this || !this.n.compareAndSet(i, obj, this) || !this.a) {
            return;
        }
        yyp yypVar = (yyp) obj;
        yypVar.d.a();
        yyr.j(yypVar);
        this.g.add(yypVar);
    }

    public final void e(int i) {
        f(i, null);
    }

    public final void f(int i, Throwable th) {
        Object obj = this.n.get(i);
        if (obj == null || obj == this || !this.n.compareAndSet(i, obj, this) || !this.a) {
            return;
        }
        yyx yyxVar = (yyx) obj;
        yyxVar.a();
        if (th != null) {
            yyxVar.g = th;
        }
        this.h.add(yyxVar);
    }

    public final boolean g(int i) {
        if (this.n.get(i) != null) {
            return false;
        }
        yyx yyxVar = new yyx(i, this.e, 4);
        if (!this.n.compareAndSet(i, null, yyxVar)) {
            return false;
        }
        if (!this.a) {
            return true;
        }
        yyxVar.b();
        return true;
    }

    public final void h(int i) {
        if (this.n.get(i) != null) {
            return;
        }
        yyp yypVar = new yyp(i, this.e);
        if (this.n.compareAndSet(i, null, yypVar) && this.a) {
            yypVar.d.b();
            yyr.k(yypVar);
        }
    }
}
