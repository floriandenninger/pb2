package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pyu extends puz {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;
    private final pyt f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        defpackage.qbi.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        defpackage.qbi.d(r0);
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        defpackage.qbi.d(r3);
        r0 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0021, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0022, code lost:
    
        defpackage.qbi.d(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pyu(defpackage.pyt r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.f = r3
            r0 = 0
            qvf r3 = r3.i()     // Catch: android.os.RemoteException -> L13
            if (r3 == 0) goto L17
            java.lang.Object r3 = defpackage.qve.b(r3)     // Catch: android.os.RemoteException -> L13
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3     // Catch: android.os.RemoteException -> L13
            goto L18
        L13:
            r3 = move-exception
            defpackage.qbi.d(r3)
        L17:
            r3 = r0
        L18:
            r2.a = r3
            pyt r3 = r2.f     // Catch: android.os.RemoteException -> L21
            android.net.Uri r0 = r3.h()     // Catch: android.os.RemoteException -> L21
            goto L25
        L21:
            r3 = move-exception
            defpackage.qbi.d(r3)
        L25:
            r2.b = r0
            pyt r3 = r2.f     // Catch: android.os.RemoteException -> L2e
            double r0 = r3.a()     // Catch: android.os.RemoteException -> L2e
            goto L34
        L2e:
            r3 = move-exception
            defpackage.qbi.d(r3)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L34:
            r2.c = r0
            r3 = -1
            pyt r0 = r2.f     // Catch: android.os.RemoteException -> L3e
            int r0 = r0.g()     // Catch: android.os.RemoteException -> L3e
            goto L43
        L3e:
            r0 = move-exception
            defpackage.qbi.d(r0)
            r0 = -1
        L43:
            r2.d = r0
            pyt r0 = r2.f     // Catch: android.os.RemoteException -> L4c
            int r3 = r0.f()     // Catch: android.os.RemoteException -> L4c
            goto L50
        L4c:
            r0 = move-exception
            defpackage.qbi.d(r0)
        L50:
            r2.e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.<init>(pyt):void");
    }

    @Override // defpackage.puz
    public final double a() {
        return this.c;
    }

    @Override // defpackage.puz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.puz
    public final int c() {
        return this.d;
    }

    @Override // defpackage.puz
    public final Drawable d() {
        return this.a;
    }

    @Override // defpackage.puz
    public final Uri e() {
        return this.b;
    }
}
