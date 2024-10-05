package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlz extends azly {
    private static final long serialVersionUID = -5737965195918321883L;

    public azlz(banw banwVar, int i, int i2) {
        super(banwVar, i, i2);
    }

    @Override // defpackage.azly
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        h();
    }

    @Override // defpackage.azly
    public final void d() {
        this.f.decrementAndGet();
        b();
    }

    @Override // defpackage.azly
    public final void f(Throwable th) {
        azqi.e(this.c, th);
        this.f.decrementAndGet();
        b();
    }

    @Override // defpackage.azly
    public final void g(azlx azlxVar, Object obj) {
        if (get() != 0 || !compareAndSet(0, 1)) {
            if (!azlxVar.d().k(obj) && azqb.f(azlxVar)) {
                azqi.e(this.c, new ayrg("Queue full?!"));
                this.f.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        } else {
            if (this.d.get() != 0) {
                this.a.c(obj);
                if (this.d.get() != Long.MAX_VALUE) {
                    this.d.decrementAndGet();
                }
                long j = azlxVar.d + 1;
                if (j >= azlxVar.c) {
                    azlxVar.d = 0L;
                    ((banx) azlxVar.get()).sj(j);
                } else {
                    azlxVar.d = j;
                }
            } else if (!azlxVar.d().k(obj)) {
                azqb.f(azlxVar);
                azqi.e(this.c, new ayrg("Queue full?!"));
                this.f.decrementAndGet();
                h();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r10 != r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r20.e == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        r1 = r20.f.get();
        r2 = r19;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r4 >= r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r8 = r18[r4].e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r8 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r8.j() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r1 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r12 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (((java.lang.Throwable) r20.c.get()) == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        r3.b(defpackage.azqi.d(r20.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r3.sh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r10 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
    
        if (r6 == Long.MAX_VALUE) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        r20.d.addAndGet(-r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        r1 = get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r1 != r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        if (r5 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006a, code lost:
    
        r18 = r1;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x006e, code lost:
    
        if (r13 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0070, code lost:
    
        if (r15 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007a, code lost:
    
        if (((java.lang.Throwable) r20.c.get()) == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x007c, code lost:
    
        r3.b(defpackage.azqi.d(r20.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0086, code lost:
    
        r3.sh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x008a, code lost:
    
        if (r15 == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlz.h():void");
    }
}
