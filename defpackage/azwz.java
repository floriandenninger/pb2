package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azwz extends azwy {
    public final azvm e = azth.o(null);
    public final azvm f = azth.o(null);
    private final azvj b = azth.m(false);

    @Override // defpackage.azwy
    protected final void g() {
        azxw azxwVar = azxw.a;
        azxw.b.set(null);
        this.b.c();
        boolean z = azwq.a;
        azvm azvmVar = this.e;
        while (true) {
            Object obj = azvmVar.a;
            if (obj == null) {
                if (this.e.c(null, azxa.a)) {
                    break;
                }
            } else if (!(obj instanceof azzw)) {
                if (obj == azxa.a) {
                    break;
                }
                azzw azzwVar = new azzw(8, true);
                azzwVar.a((Runnable) obj);
                if (this.e.c(obj, azzwVar)) {
                    break;
                }
            } else {
                ((azzw) obj).d();
                break;
            }
        }
        do {
        } while (k() <= 0);
        System.nanoTime();
        badf badfVar = (badf) this.f.a;
        if (badfVar == null) {
            return;
        }
        synchronized (badfVar) {
            throw null;
        }
    }

    public final long k() {
        if (i()) {
            return 0L;
        }
        Runnable runnable = null;
        if (((badf) this.f.a) != null) {
            throw null;
        }
        azvm azvmVar = this.e;
        while (true) {
            Object obj = azvmVar.a;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof azzw)) {
                if (obj == azxa.a) {
                    break;
                }
                if (this.e.c(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                azzw azzwVar = (azzw) obj;
                Object b = azzwVar.b();
                if (b != azzw.a) {
                    runnable = (Runnable) b;
                    break;
                }
                this.e.c(obj, azzwVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        azzi azziVar = this.d;
        if (((azziVar == null || azziVar.a()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = this.e.a;
        if (obj2 != null) {
            if (!(obj2 instanceof azzw)) {
                if (obj2 != azxa.a) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((azzw) obj2).e()) {
                return 0L;
            }
        }
        badf badfVar = (badf) this.f.a;
        if (badfVar != null) {
            synchronized (badfVar) {
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        defpackage.azwr.b.l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Runnable r6) {
        /*
            r5 = this;
            azvm r0 = r5.e
        L2:
            java.lang.Object r1 = r0.a
            azvj r2 = r5.b
            boolean r2 = r2.a()
            if (r2 == 0) goto Ld
            goto L5e
        Ld:
            if (r1 != 0) goto L19
            azvm r1 = r5.e
            r2 = 0
            boolean r1 = r1.c(r2, r6)
            if (r1 == 0) goto L2
            goto L50
        L19:
            boolean r2 = r1 instanceof defpackage.azzw
            r3 = 1
            if (r2 == 0) goto L34
            r2 = r1
            azzw r2 = (defpackage.azzw) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L50
            if (r4 == r3) goto L2a
            goto L5e
        L2a:
            azvm r3 = r5.e
            azzw r2 = r2.c()
            r3.c(r1, r2)
            goto L2
        L34:
            baac r2 = defpackage.azxa.a
            if (r1 == r2) goto L5e
            azzw r2 = new azzw
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
            azvm r3 = r5.e
            boolean r1 = r3.c(r1, r2)
            if (r1 == 0) goto L2
        L50:
            java.lang.Thread r6 = r5.c()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L5d
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L5d:
            return
        L5e:
            azwr r0 = defpackage.azwr.b
            r0.l(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azwz.l(java.lang.Runnable):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean m() {
        azzi azziVar = this.d;
        if (azziVar != null && !azziVar.a()) {
            return false;
        }
        if (((badf) this.f.a) == null) {
            Object obj = this.e.a;
            if (obj == null) {
                return true;
            }
            return obj instanceof azzw ? ((azzw) obj).e() : obj == azxa.a;
        }
        throw null;
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        l(runnable);
    }
}
