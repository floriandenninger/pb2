package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvz extends AtomicReference implements aypq {
    private static final long serialVersionUID = -8730235182291002949L;
    final ayvy a;
    final int b;
    final int c;
    final int d;
    int e;

    public ayvz(ayvy ayvyVar, int i, int i2) {
        this.a = ayvyVar;
        this.b = i;
        this.c = i2;
        this.d = i2 - (i2 >> 2);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        ayvy ayvyVar = this.a;
        if (azqi.e(ayvyVar.l, th)) {
            ayvyVar.b();
            ayvyVar.k = true;
            ayvyVar.f();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.g(this.b, obj);
    }

    public final void d() {
        int i = this.e + 1;
        if (i != this.d) {
            this.e = i;
        } else {
            this.e = 0;
            ((banx) get()).sj(i);
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.k(this, banxVar, this.c);
    }

    @Override // defpackage.banw
    public final void sh() {
        ayvy ayvyVar = this.a;
        int i = this.b;
        synchronized (ayvyVar) {
            Object[] objArr = ayvyVar.e;
            if (objArr[i] != null) {
                int i2 = ayvyVar.h + 1;
                if (i2 != objArr.length) {
                    ayvyVar.h = i2;
                    return;
                }
                ayvyVar.k = true;
            } else {
                ayvyVar.k = true;
            }
            ayvyVar.f();
        }
    }
}
