package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import defpackage.anaf;
import defpackage.anhy;
import defpackage.aoqa;
import defpackage.aora;
import defpackage.aorx;
import defpackage.aorz;
import defpackage.baju;
import defpackage.bakc;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static final bakc a = bakc.g(61);
    private final Executor b;
    private baju c;
    private anhy d;
    private boolean e;
    private final g f;

    public b(g gVar, Executor executor) {
        this.f = gVar;
        this.b = executor;
    }

    public final synchronized anhy b(e eVar) {
        this.e = false;
        this.d = null;
        this.c = null;
        return anaf.N(eVar);
    }

    public final synchronized anhy c(aorx aorxVar) {
        aorz aorzVar;
        String str;
        aorz aorzVar2;
        this.e = false;
        aoqa aoqaVar = aorxVar.e;
        if (aoqaVar == null) {
            aoqaVar = aoqa.a;
        }
        this.c = new baju(aora.b(aoqaVar));
        c cVar = new c();
        cVar.a(aorz.a);
        String str2 = aorxVar.d;
        if (str2 != null) {
            cVar.a = str2;
            if (aorxVar.b == 4) {
                aorzVar = (aorz) aorxVar.c;
            } else {
                aorzVar = aorz.a;
            }
            cVar.a(aorzVar);
            str = cVar.a;
            if (str != null && (aorzVar2 = cVar.b) != null) {
            }
            StringBuilder sb = new StringBuilder();
            if (cVar.a == null) {
                sb.append(" token");
            }
            if (cVar.b == null) {
                sb.append(" apiAccess");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        throw new NullPointerException("Null token");
        return anaf.O(new d(str, aorzVar2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
    
        if (r1.g < r2.g) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.anhy a() {
        /*
            r4 = this;
            monitor-enter(r4)
            anhy r0 = r4.d     // Catch: java.lang.Throwable -> L55
            baju r1 = r4.c     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L8
            goto L1f
        L8:
            baju r2 = defpackage.baju.c()     // Catch: java.lang.Throwable -> L55
            bakc r1 = defpackage.bakc.h(r2, r1)     // Catch: java.lang.Throwable -> L55
            bakc r2 = com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b.a     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L19
            int r1 = r1.g     // Catch: java.lang.Throwable -> L55
            if (r1 < 0) goto L1f
            goto L50
        L19:
            int r1 = r1.g     // Catch: java.lang.Throwable -> L55
            int r2 = r2.g     // Catch: java.lang.Throwable -> L55
            if (r1 >= r2) goto L50
        L1f:
            boolean r1 = r4.e     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L4b
            r0 = 1
            r4.e = r0     // Catch: java.lang.Throwable -> L55
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g r1 = r4.f     // Catch: java.lang.Throwable -> L55
            anhy r1 = r1.a()     // Catch: java.lang.Throwable -> L55
            anht r1 = defpackage.anht.q(r1)     // Catch: java.lang.Throwable -> L55
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a r2 = new com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a     // Catch: java.lang.Throwable -> L55
            r3 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L55
            anhy r1 = defpackage.anfq.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L55
            com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a r2 = new com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a     // Catch: java.lang.Throwable -> L55
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.Class<com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e> r0 = com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e.class
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L55
            anhy r0 = defpackage.aney.i(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L55
            r4.d = r0     // Catch: java.lang.Throwable -> L55
        L4b:
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return r0
        L50:
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return r0
        L55:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b.a():anhy");
    }
}
