package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyk extends azyh {
    public final azvk b;
    private final ReentrantLock c = new ReentrantLock();
    private Object[] d;
    private int e;

    public azyk() {
        int min = Math.min(10, 8);
        Object[] objArr = new Object[min];
        aype.i(objArr, azyi.a, 0, min);
        this.d = objArr;
        this.b = azth.p();
    }

    @Override // defpackage.azyh
    protected final Object a() {
        azzt azztVar;
        azzt j;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.b.a;
            if (i == 0) {
                Object f = f();
                if (f == null) {
                    f = azyi.d;
                }
                return f;
            }
            Object[] objArr = this.d;
            int i2 = this.e;
            Object obj = objArr[i2];
            objArr[i2] = null;
            azvk azvkVar = this.b;
            int i3 = azvn.a;
            azvkVar.a = i - 1;
            baac baacVar = azyi.d;
            if (i == 10) {
                azzq azzqVar = this.a;
                while (true) {
                    azztVar = (azzt) azzqVar.g();
                    if (azztVar == azzqVar || !(azztVar instanceof azyr)) {
                        break;
                    }
                    if (((((azyr) azztVar) instanceof azyr) && !azztVar.sr()) || (j = azztVar.j()) == null) {
                        break;
                    }
                    j.l();
                }
                azztVar = null;
                if (((azyr) azztVar) != null) {
                    throw null;
                }
                i = 10;
            }
            if (baacVar != azyi.d) {
                this.b.a = i;
                Object[] objArr2 = this.d;
                objArr2[(this.e + i) % objArr2.length] = baacVar;
            }
            this.e = (this.e + 1) % this.d.length;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.azyh
    protected final boolean c(azyo azyoVar) {
        boolean z;
        int f;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            azzt azztVar = this.a;
            azyg azygVar = new azyg(azyoVar, this);
            do {
                azzt i = azztVar.i();
                z = true;
                if (!(i instanceof azyr)) {
                    f = i.f(azyoVar, azztVar, azygVar);
                    if (f == 1) {
                        break;
                    }
                } else {
                    break;
                }
            } while (f != 2);
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r1 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r5 = (defpackage.azzt) r1.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r5 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if ((r5 instanceof defpackage.azyq) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if ((((defpackage.azyq) r5) instanceof defpackage.azyr) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r5.sr() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r5 = (defpackage.azyq) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r5 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof defpackage.azyr) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r5.d() == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r1 = defpackage.azwq.a;
        r1 = r10.b;
        r2 = defpackage.azvn.a;
        r1.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r0.unlock();
        r5.b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        r11 = r10.b;
        r1 = defpackage.azvn.a;
        r11.a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        r6 = r5.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0042, code lost:
    
        if (r6 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        r6.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0029, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0075, code lost:
    
        if (r1 >= 10) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:
    
        r3 = r10.d.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        if (r1 < r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007c, code lost:
    
        r2 = java.lang.Math.min(r3 + r3, 10);
        r3 = new java.lang.Object[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r1 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        r6 = r5 + 1;
        r7 = r10.d;
        r3[r5] = r7[(r10.e + r5) % r7.length];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r6 < r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0098, code lost:
    
        defpackage.aype.i(r3, defpackage.azyi.a, r1, r2);
        r10.d = r3;
        r10.e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r2 = r10.d;
        r2[(r10.e + r1) % r2.length] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        return defpackage.azyi.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r2 = defpackage.azwq.a;
        r2 = r10.d;
        r4 = r10.e;
        r5 = r2.length;
        r2[r4 % r5] = null;
        r2[(r1 + r4) % r5] = r11;
        r10.e = (r4 + 1) % r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r1 == 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [azzt] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.azyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object d(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyk.d(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.azyj
    protected final String e() {
        return "(buffer:capacity=10,size=" + this.b.a + ')';
    }
}
