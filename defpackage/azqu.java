package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqu extends AtomicLong implements banx, azqc {
    private static final long serialVersionUID = 3293175281126227086L;
    final banw a;
    final azqv b;
    boolean c;
    boolean d;
    azqd e;
    boolean f;
    volatile boolean g;
    long h;

    public azqu(banw banwVar, azqv azqvVar) {
        this.a = banwVar;
        this.b = azqvVar;
    }

    @Override // defpackage.azqc, defpackage.ayrw
    public final boolean a(Object obj) {
        if (this.g) {
            return true;
        }
        if (azqm.g(obj)) {
            this.a.sh();
            return true;
        }
        if (azqm.h(obj)) {
            this.a.b(azqm.d(obj));
            return true;
        }
        long j = get();
        if (j != 0) {
            this.a.c(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
        sd();
        this.a.b(new ayrg("Could not deliver value due to lack of requests"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    azqd azqdVar = this.e;
                    if (azqdVar == null) {
                        azqdVar = new azqd();
                        this.e = azqdVar;
                    }
                    azqdVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.as(this);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this, j);
        }
    }
}
