package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadd {
    public final cnd a;
    public final Executor b;
    public boolean c;
    private final afsy d;
    private final shf e;
    private final aadf f;
    private final aarr g;

    public aadd(afsy afsyVar, cnd cndVar, shf shfVar, Executor executor, aadf aadfVar, aarr aarrVar) {
        this.d = afsyVar;
        this.a = cndVar;
        this.e = shfVar;
        this.b = executor;
        this.f = aadfVar;
        this.g = aarrVar;
    }

    public final void a(final String str) {
        if (!b()) {
            zga.l("Couldn't remove entry due to uninitialized disk cache");
        } else {
            this.b.execute(new Runnable() { // from class: aadb
                @Override // java.lang.Runnable
                public final void run() {
                    aadd aaddVar = aadd.this;
                    String str2 = str;
                    synchronized (aaddVar) {
                        aaddVar.a.e(str2);
                    }
                }
            });
        }
    }

    public final synchronized boolean b() {
        if (this.c) {
            return true;
        }
        try {
            this.a.c();
            this.c = true;
            return true;
        } catch (RuntimeException e) {
            afsi.c(2, 5, "Couldn't initialize disk cache", e);
            zga.d("Couldn't initialize disk cache", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.aadg c() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L14
            java.lang.String r0 = "Couldn't fetch browse response due to uninitialized disk cache"
            defpackage.zga.l(r0)     // Catch: java.lang.Throwable -> La1
            arjv r0 = defpackage.arjv.a     // Catch: java.lang.Throwable -> La1
            aadg r0 = defpackage.aadg.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L14:
            java.lang.String r0 = "FElibrary"
            cnd r1 = r6.a     // Catch: java.lang.Throwable -> La1
            cnc r1 = r1.a(r0)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto L26
            arjv r0 = defpackage.arjv.a     // Catch: java.lang.Throwable -> La1
            aadg r0 = defpackage.aadg.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L26:
            java.util.Map r2 = r1.g     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "Identity-Id"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La1
            afsy r3 = r6.d     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.t()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L49
            afsy r3 = r6.d     // Catch: java.lang.Throwable -> La1
            afsx r3 = r3.c()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> La1
            boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L4f
            goto L57
        L49:
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto L57
        L4f:
            arjv r0 = defpackage.arjv.a     // Catch: java.lang.Throwable -> La1
            aadg r0 = defpackage.aadg.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L57:
            arjv r2 = defpackage.arjv.a     // Catch: java.lang.Throwable -> La1
            aarr r3 = r6.g     // Catch: java.lang.Throwable -> La1
            byte[] r4 = r1.a     // Catch: java.lang.Throwable -> La1
            aooy r3 = r3.a(r4, r2)     // Catch: java.lang.Throwable -> La1
            r4 = 1
            if (r3 != 0) goto L80
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La1
            r1 = 0
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> La1
            r0[r1] = r2     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Failed to deserialize %s from cache"
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> La1
            defpackage.zga.b(r0)     // Catch: java.lang.Throwable -> La1
            aadg r0 = defpackage.aadg.a()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        L80:
            aadf r2 = r6.f     // Catch: java.lang.Throwable -> La1
            aade r1 = r2.a(r1)     // Catch: java.lang.Throwable -> La1
            r2 = r1
            aadh r2 = (defpackage.aadh) r2     // Catch: java.lang.Throwable -> La1
            aadj r2 = r2.b     // Catch: java.lang.Throwable -> La1
            aadj r5 = defpackage.aadj.EXPIRED     // Catch: java.lang.Throwable -> La1
            if (r2 != r5) goto L9a
            r6.a(r0)     // Catch: java.lang.Throwable -> La1
            r0 = r1
            aadh r0 = (defpackage.aadh) r0     // Catch: java.lang.Throwable -> La1
            anhy r0 = r0.a     // Catch: java.lang.Throwable -> La1
            r0.cancel(r4)     // Catch: java.lang.Throwable -> La1
        L9a:
            aadg r0 = new aadg     // Catch: java.lang.Throwable -> La1
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            return r0
        La1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadd.c():aadg");
    }

    public final synchronized void d(aooy aooyVar) {
        if (TextUtils.isEmpty("FElibrary")) {
            throw new IllegalArgumentException("Invalid cache key: FElibrary");
        }
        if (aooyVar == null) {
            return;
        }
        if (b()) {
            if (((arjv) aooyVar).t <= 0 && ((arjv) aooyVar).u <= 0) {
                a("FElibrary");
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.d.t()) {
                hashMap.put("Identity-Id", this.d.c().d());
            }
            byte[] byteArray = aooyVar.toByteArray();
            arnd arndVar = ((arjv) aooyVar).c;
            if (arndVar == null) {
                arndVar = arnd.a;
            }
            final cnc dy = adyu.dy(byteArray, hashMap, arndVar);
            if (dy == null) {
                dy = null;
            } else {
                long c = this.e.c() + TimeUnit.SECONDS.toMillis(((arjv) aooyVar).t);
                dy.e = TimeUnit.SECONDS.toMillis(((arjv) aooyVar).u) + c;
                dy.f = c;
                dy.d = this.e.c();
            }
            if (dy == null) {
                zga.l("Failed to generate cache entry for browse response");
                return;
            } else {
                this.b.execute(new Runnable() { // from class: aadc
                    @Override // java.lang.Runnable
                    public final void run() {
                        aadd aaddVar = aadd.this;
                        cnc cncVar = dy;
                        synchronized (aaddVar) {
                            aaddVar.a.d("FElibrary", cncVar);
                        }
                    }
                });
                return;
            }
        }
        zga.l("Couldn't store browse response due to uninitialized disk cache");
    }
}
