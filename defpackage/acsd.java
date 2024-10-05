package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsd implements syg {
    public final acra a;
    public final SparseArray b;
    public final SparseIntArray c;
    public acsa d;

    public acsd(acra acraVar, aqrf aqrfVar) {
        this(acraVar, aqrfVar, null);
    }

    public static int c(awpj awpjVar) {
        asuh cf = adyu.cf(f(awpjVar));
        if (cf == null || (cf.c & 8) == 0) {
            return -1;
        }
        apvd apvdVar = cf.h;
        if (apvdVar == null) {
            apvdVar = apvd.a;
        }
        if ((apvdVar.b & 1) == 0) {
            return -1;
        }
        apvd apvdVar2 = cf.h;
        if (apvdVar2 == null) {
            apvdVar2 = apvd.a;
        }
        return apvdVar2.c;
    }

    public static awfr f(awpj awpjVar) {
        awpl awplVar = awpjVar.c;
        if (awplVar == null) {
            awplVar = awpl.a;
        }
        return (awfr) awplVar.pX(awfr.b);
    }

    public static boolean g(awpj awpjVar) {
        asuh asuhVar = f(awpjVar).e;
        if (asuhVar == null) {
            asuhVar = asuh.b;
        }
        apvd apvdVar = asuhVar.h;
        if (apvdVar == null) {
            apvdVar = apvd.a;
        }
        return (apvdVar.b & 2) != 0;
    }

    public static boolean h(awpj awpjVar) {
        asuh cf = adyu.cf(f(awpjVar));
        return (cf == null || (cf.c & 8) == 0) ? false : true;
    }

    @Override // defpackage.syg
    public final void a(awpj awpjVar, int i) {
        if (i == 2 && j(awpjVar)) {
            acsa d = d(awpjVar);
            if (!f(awpjVar).d || d == null) {
                return;
            }
            this.a.I(3, d, null);
        }
    }

    @Override // defpackage.syg
    public final void b(amru amruVar, int i) {
        acsa d;
        int i2 = ((amvj) amruVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            awpj awpjVar = (awpj) amruVar.get(i3);
            if (j(awpjVar) && (d = d(awpjVar)) != null) {
                if (i != 2) {
                    this.a.q(d, null);
                } else {
                    this.a.u(d, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x0015, B:12:0x001b, B:14:0x0021, B:16:0x0025, B:17:0x0027, B:19:0x002b, B:20:0x002d, B:23:0x0035, B:26:0x007b, B:32:0x003e, B:34:0x0044, B:36:0x004a, B:37:0x004c, B:38:0x0071, B:39:0x0030), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.acsa d(defpackage.awpj r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r7.d     // Catch: java.lang.Throwable -> L86
            acsa r0 = r6.e(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return r0
        Lb:
            awfr r0 = f(r7)     // Catch: java.lang.Throwable -> L86
            boolean r1 = r6.i()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            boolean r1 = h(r7)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            boolean r1 = g(r7)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            asuh r1 = r0.e     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L27
            asuh r1 = defpackage.asuh.b     // Catch: java.lang.Throwable -> L86
        L27:
            apvd r1 = r1.h     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L2d
            apvd r1 = defpackage.apvd.a     // Catch: java.lang.Throwable -> L86
        L2d:
            int r1 = r1.d     // Catch: java.lang.Throwable -> L86
            goto L32
        L30:
            int r1 = r7.d     // Catch: java.lang.Throwable -> L86
        L32:
            r2 = 0
            if (r0 != 0) goto L3e
            java.lang.String r0 = "INTERACTIONLOGGINGBUG->"
            java.lang.String r1 = "LoggingProperties is null when creating visual element container!"
            defpackage.zga.m(r0, r1)     // Catch: java.lang.Throwable -> L86
        L3c:
            r3 = r2
            goto L79
        L3e:
            int r3 = r0.c     // Catch: java.lang.Throwable -> L86
            r3 = r3 & 2
            if (r3 == 0) goto L71
            acqx r3 = new acqx     // Catch: java.lang.Throwable -> L86
            asuh r0 = r0.e     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L4c
            asuh r0 = defpackage.asuh.b     // Catch: java.lang.Throwable -> L86
        L4c:
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L86
            awav r0 = r3.a     // Catch: java.lang.Throwable -> L86
            aone r0 = r0.toBuilder()     // Catch: java.lang.Throwable -> L86
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L86
            r0.copyOnWrite()     // Catch: java.lang.Throwable -> L86
            aonm r4 = r0.instance     // Catch: java.lang.Throwable -> L86
            awav r4 = (defpackage.awav) r4     // Catch: java.lang.Throwable -> L86
            int r5 = r4.b     // Catch: java.lang.Throwable -> L86
            r5 = r5 | 8
            r4.b = r5     // Catch: java.lang.Throwable -> L86
            r4.f = r1     // Catch: java.lang.Throwable -> L86
            aonm r0 = r0.build()     // Catch: java.lang.Throwable -> L86
            awav r0 = (defpackage.awav) r0     // Catch: java.lang.Throwable -> L86
            r3.a = r0     // Catch: java.lang.Throwable -> L86
            goto L79
        L71:
            java.lang.String r0 = "INTERACTIONLOGGINGBUG->"
            java.lang.String r1 = "LoggingProperties is missing LoggingDirectives when creating visual element container!"
            defpackage.zga.m(r0, r1)     // Catch: java.lang.Throwable -> L86
            goto L3c
        L79:
            if (r3 == 0) goto L84
            android.util.SparseArray r0 = r6.b     // Catch: java.lang.Throwable -> L86
            int r7 = r7.d     // Catch: java.lang.Throwable -> L86
            r0.put(r7, r3)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r6)
            return r3
        L84:
            monitor-exit(r6)
            return r2
        L86:
            r7 = move-exception
            monitor-exit(r6)
            goto L8a
        L89:
            throw r7
        L8a:
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsd.d(awpj):acsa");
    }

    public final synchronized acsa e(int i) {
        return (acsa) this.b.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        Boolean bool;
        if (this.a.a() != null) {
            aqvj aqvjVar = this.a.a().a.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45357300L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45357300L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45357300L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(awpj awpjVar) {
        awpl awplVar = awpjVar.c;
        if (awplVar == null) {
            awplVar = awpl.a;
        }
        if (awplVar.pY(awfr.b)) {
            return true;
        }
        int i = awpjVar.e;
        while (true) {
            int i2 = this.c.get(i, -1);
            if (i2 == -1) {
                break;
            }
            i = i2;
        }
        if (this.b.get(i) == null) {
            return false;
        }
        this.c.put(awpjVar.d, i);
        return false;
    }

    public acsd(acra acraVar, aqrf aqrfVar, acsa acsaVar) {
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.a = acraVar;
        if (acsaVar != null) {
            this.d = acsaVar;
        } else {
            this.d = (aqrfVar == null || acraVar.a() == null || !acraVar.a().a() || (aqrfVar.b & 8) == 0 || aqrfVar.e.d() <= 0) ? null : new acqx(aqrfVar.e);
        }
    }
}
