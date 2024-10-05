package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidq {
    private aesf a = null;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private String d;

    private final synchronized void d() {
        aesf aesfVar = this.a;
        if (aesfVar != null) {
            aesfVar.b();
            this.a = null;
            this.d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002b, code lost:
    
        if (r2 != 2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0009, B:11:0x0019, B:13:0x001e, B:16:0x002d, B:18:0x0033, B:20:0x003d, B:22:0x0045, B:24:0x004d, B:26:0x0055, B:28:0x0059, B:31:0x0060, B:32:0x0062, B:35:0x0065, B:36:0x0075, B:37:0x0076, B:38:0x007b, B:45:0x007e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.ahcl r9, defpackage.ajbv r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            ahcj r0 = r9.d()     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L9
            monitor-exit(r8)
            return
        L9:
            aesh r1 = r0.a     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Cuepoint-Identifier"
            java.lang.String r1 = r1.d(r2)     // Catch: java.lang.Throwable -> L83
            aeqn r0 = r0.a()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L7e
            int r2 = r0.b     // Catch: java.lang.Throwable -> L83
            r3 = 0
            if (r2 != 0) goto L27
            long r4 = r0.c     // Catch: java.lang.Throwable -> L83
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r2 = 0
        L27:
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 != r0) goto L7e
        L2d:
            ahck r9 = r9.e()     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L7c
            java.util.Map r9 = r10.e     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L83
            ajbv r9 = (defpackage.ajbv) r9     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L76
            java.util.Set r9 = r8.b     // Catch: java.lang.Throwable -> L83
            boolean r9 = r9.contains(r1)     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L65
            java.util.Set r9 = r8.b     // Catch: java.lang.Throwable -> L83
            boolean r9 = r9.contains(r1)     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L63
            java.lang.String r9 = r8.d     // Catch: java.lang.Throwable -> L83
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L63
            aesf r9 = r8.a     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L63
            boolean r9 = r9.c()     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L60
            goto L63
        L60:
            aesf r9 = r8.a     // Catch: java.lang.Throwable -> L83
            throw r9     // Catch: java.lang.Throwable -> L83
        L63:
            monitor-exit(r8)
            return
        L65:
            java.util.Set r9 = r8.b     // Catch: java.lang.Throwable -> L83
            r9.add(r1)     // Catch: java.lang.Throwable -> L83
            aesf r9 = new aesf     // Catch: java.lang.Throwable -> L83
            r10 = 5000(0x1388, float:7.006E-42)
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L83
            r8.a = r9     // Catch: java.lang.Throwable -> L83
            r8.d = r1     // Catch: java.lang.Throwable -> L83
            throw r9     // Catch: java.lang.Throwable -> L83
        L76:
            aesf r9 = new aesf     // Catch: java.lang.Throwable -> L83
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L83
            throw r9     // Catch: java.lang.Throwable -> L83
        L7c:
            monitor-exit(r8)
            return
        L7e:
            r8.d()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r8)
            return
        L83:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidq.a(ahcl, ajbv):void");
    }

    public final synchronized void b() {
        String str;
        aesf aesfVar = this.a;
        if (aesfVar != null) {
            if (!aesfVar.c() && (str = this.d) != null && this.b.contains(str)) {
                this.c.add(this.d);
            }
            d();
        }
    }

    public final synchronized boolean c(String str) {
        return this.c.contains(str);
    }
}
