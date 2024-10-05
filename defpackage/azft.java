package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azft extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = 8567835998786448817L;
    final ayqd a;
    final ayrv b;
    final azfs[] c;
    Object[] d;
    final azoh e;
    volatile boolean f;
    volatile boolean g;
    final azqf h = new azqf();
    int i;
    int j;

    public azft(ayqd ayqdVar, ayrv ayrvVar, int i, int i2) {
        this.a = ayqdVar;
        this.b = ayrvVar;
        this.d = new Object[i];
        azfs[] azfsVarArr = new azfs[i];
        for (int i3 = 0; i3 < i; i3++) {
            azfsVarArr[i3] = new azfs(this, i3);
        }
        this.c = azfsVarArr;
        this.e = new azoh(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        for (azfs azfsVar : this.c) {
            ayrz.c(azfsVar);
        }
    }

    final void c(azoh azohVar) {
        synchronized (this) {
            this.d = null;
        }
        azohVar.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        azoh azohVar = this.e;
        ayqd ayqdVar = this.a;
        int i = 1;
        while (!this.f) {
            if (this.h.get() == null) {
                boolean z = this.g;
                Object[] objArr = (Object[]) azohVar.sg();
                try {
                    if (z) {
                        if (objArr == null) {
                            c(azohVar);
                            Throwable d = azqi.d(this.h);
                            if (d == null) {
                                ayqdVar.sh();
                                return;
                            } else {
                                ayqdVar.b(d);
                                return;
                            }
                        }
                    } else if (objArr == null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    Object a = this.b.a(objArr);
                    aysw.b(a, "The combiner returned a null value");
                    ayqdVar.c(a);
                } catch (Throwable th) {
                    aynu.c(th);
                    azqi.e(this.h, th);
                    a();
                    c(azohVar);
                    ayqdVar.b(azqi.d(this.h));
                    return;
                }
            } else {
                a();
                c(azohVar);
                ayqdVar.b(azqi.d(this.h));
                return;
            }
        }
        c(azohVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, Object obj) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.d;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = this.i;
            if (obj2 == null) {
                i2++;
                this.i = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                this.e.k((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d();
            }
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        if (getAndIncrement() == 0) {
            c(this.e);
        }
    }
}
