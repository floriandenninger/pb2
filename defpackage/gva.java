package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gva implements aahd {
    private static final gvb a = new gvb();
    private final Activity b;
    private final ypa c;
    private final azrw d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final LoggingUrlsPingController h;
    private final boolean i;

    public gva(Activity activity, ypa ypaVar, azrw azrwVar, Map map, Map map2, Map map3, LoggingUrlsPingController loggingUrlsPingController, ajhe ajheVar) {
        this.b = activity;
        this.c = ypaVar;
        this.d = azrwVar;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = loggingUrlsPingController;
        this.i = ajheVar.g;
    }

    private static aaha f(Class cls, Map map) {
        azrw azrwVar = (azrw) map.get(cls);
        if (azrwVar != null) {
            return (aaha) azrwVar.get();
        }
        return null;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity.class.isInstance(r8.b) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r6 = r4 instanceof defpackage.ewk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if ((((java.lang.Integer) defpackage.yjj.t(r10, "com.google.android.apps.youtube.app.endpoint.flags", 0)).intValue() & 1) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r6 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        ((defpackage.gji) r8.d.get()).q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r8.h.h(new java.util.ArrayList(r9.d), r10);
        r4.kE(r9, r10);
        r8.c.f(defpackage.gva.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return;
     */
    @Override // defpackage.aahd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.apxf r9, java.util.Map r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to process the Command"
            if (r9 != 0) goto L5
            return
        L5:
            r1 = 1
            r2 = 25
            r3 = 2
            r4 = 0
            java.lang.Object r5 = defpackage.aahe.a(r9)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L12
            goto L17
        Lf:
            r9 = move-exception
            goto L9c
        L12:
            r5 = move-exception
            defpackage.afsi.c(r3, r2, r0, r5)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r5 = r4
        L17:
            if (r5 != 0) goto L1a
            goto L49
        L1a:
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            boolean r6 = r8.i     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r6 != 0) goto L2f
            java.lang.String r6 = "com.google.protos.youtube.elements.CommandOuterClass.Command"
            java.lang.String r7 = r5.getCanonicalName()     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            boolean r6 = r6.equals(r7)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r6 == 0) goto L2f
            goto L49
        L2f:
            java.util.Map r4 = r8.e     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            aaha r4 = f(r5, r4)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r4 == 0) goto L38
            goto L49
        L38:
            java.util.Map r4 = r8.f     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            aaha r4 = f(r5, r4)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r4 == 0) goto L41
            goto L49
        L41:
            java.util.Map r4 = r8.g     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            aaha r4 = f(r5, r4)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r4 == 0) goto L8f
        L49:
            if (r4 == 0) goto L8e
            java.lang.Class<com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity> r5 = com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity.class
            android.app.Activity r6 = r8.b     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            boolean r5 = r5.isInstance(r6)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r5 == 0) goto L78
            java.lang.String r5 = "com.google.android.apps.youtube.app.endpoint.flags"
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            java.lang.Object r5 = defpackage.yjj.t(r10, r5, r6)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            int r5 = r5.intValue()     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r5 = r5 & r1
            boolean r6 = r4 instanceof defpackage.ewk     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            if (r5 == 0) goto L78
            if (r6 != 0) goto L78
            azrw r5 = r8.d     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            java.lang.Object r5 = r5.get()     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            gji r5 = (defpackage.gji) r5     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r5.q()     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
        L78:
            com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController r5 = r8.h     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            aony r7 = r9.d     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r6.<init>(r7)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r5.h(r6, r10)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r4.kE(r9, r10)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            ypa r9 = r8.c     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            gvb r10 = defpackage.gva.a     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            r9.f(r10)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
        L8e:
            return
        L8f:
            aahm r9 = new aahm     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            java.lang.String r10 = "Unknown Command encountered"
            r9.<init>(r10)     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
            throw r9     // Catch: defpackage.aahm -> Lf java.lang.IllegalStateException -> L97
        L97:
            r9 = move-exception
            defpackage.afsi.c(r3, r2, r0, r9)
            return
        L9c:
            android.app.Activity r10 = r8.b
            java.lang.String r9 = r9.getMessage()
            defpackage.whu.L(r10, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.c(apxf, java.util.Map):void");
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
