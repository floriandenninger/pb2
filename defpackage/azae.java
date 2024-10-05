package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azae extends AtomicReference implements aypq, ayqx {
    static final azaa[] a = new azaa[0];
    static final azaa[] b = new azaa[0];
    private static final long serialVersionUID = 7224554242710036740L;
    boolean c;
    long g;
    long h;
    final ayzz i;
    final AtomicInteger f = new AtomicInteger();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public azae(ayzz ayzzVar) {
        this.i = ayzzVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (!this.c) {
            this.c = true;
            ayzz ayzzVar = this.i;
            Object b2 = azqm.b(th);
            long j = ayzzVar.c + 1;
            ayzzVar.c = j;
            ayzzVar.a(new azab(b2, j));
            ayzzVar.c();
            for (azaa azaaVar : (azaa[]) this.d.getAndSet(b)) {
                this.i.b(azaaVar);
            }
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        ayzz ayzzVar = this.i;
        azqm azqmVar = azqm.a;
        long j = ayzzVar.c + 1;
        ayzzVar.c = j;
        ayzzVar.a(new azab(obj, j));
        ayzzVar.d();
        for (azaa azaaVar : (azaa[]) this.d.get()) {
            this.i.b(azaaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.f.getAndIncrement() == 0) {
            int i = 1;
            while (!e()) {
                azaa[] azaaVarArr = (azaa[]) this.d.get();
                long j = this.g;
                long j2 = j;
                for (azaa azaaVar : azaaVarArr) {
                    j2 = Math.max(j2, azaaVar.d.get());
                }
                long j3 = this.h;
                banx banxVar = (banx) get();
                long j4 = j2 - j;
                if (j4 != 0) {
                    this.g = j2;
                    if (banxVar == null) {
                        long j5 = j3 + j4;
                        if (j5 < 0) {
                            j5 = Long.MAX_VALUE;
                        }
                        this.h = j5;
                    } else if (j3 != 0) {
                        this.h = 0L;
                        banxVar.sj(j3 + j4);
                    } else {
                        banxVar.sj(j4);
                    }
                } else if (j3 != 0 && banxVar != null) {
                    this.h = 0L;
                    banxVar.sj(j3);
                }
                i = this.f.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.get() == b;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this, banxVar)) {
            d();
            for (azaa azaaVar : (azaa[]) this.d.get()) {
                this.i.b(azaaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(azaa azaaVar) {
        azaa[] azaaVarArr;
        azaa[] azaaVarArr2;
        do {
            azaaVarArr = (azaa[]) this.d.get();
            int length = azaaVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azaaVarArr[i].equals(azaaVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azaaVarArr2 = a;
            } else {
                azaa[] azaaVarArr3 = new azaa[length - 1];
                System.arraycopy(azaaVarArr, 0, azaaVarArr3, 0, i);
                System.arraycopy(azaaVarArr, i + 1, azaaVarArr3, i, (length - i) - 1);
                azaaVarArr2 = azaaVarArr3;
            }
        } while (!this.d.compareAndSet(azaaVarArr, azaaVarArr2));
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d.set(b);
        azqb.f(this);
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.c) {
            return;
        }
        this.c = true;
        ayzz ayzzVar = this.i;
        azqm azqmVar = azqm.a;
        long j = ayzzVar.c + 1;
        ayzzVar.c = j;
        ayzzVar.a(new azab(azqmVar, j));
        ayzzVar.c();
        for (azaa azaaVar : (azaa[]) this.d.getAndSet(b)) {
            this.i.b(azaaVar);
        }
    }
}
