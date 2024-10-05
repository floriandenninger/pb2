package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zaq implements Runnable {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Set b = new HashSet();
    public boolean c = true;
    public int d = -1;
    private final Context e;
    private final WindowManager f;
    private boolean g;

    public zaq(Context context, WindowManager windowManager) {
        this.e = context;
        this.f = windowManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r0 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r1 = r0;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003e, code lost:
    
        if (r0 != 3) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            boolean r0 = r6.c
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2e
            android.content.Context r0 = r6.e
            android.view.WindowManager r4 = r6.f
            int r5 = defpackage.zas.b
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getRotation()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r4 == 0) goto L27
            if (r4 != r1) goto L24
            goto L27
        L24:
            if (r0 != r3) goto L2b
            goto L29
        L27:
            if (r0 != r1) goto L2b
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r6.g = r0
        L2e:
            int r0 = r6.d
            boolean r4 = r6.g
            int r5 = defpackage.zas.b
            if (r4 == 0) goto L3b
            if (r0 == 0) goto L44
            if (r0 != r1) goto L41
            goto L45
        L3b:
            if (r0 == r3) goto L44
            r1 = 3
            if (r0 != r1) goto L41
            goto L44
        L41:
            r1 = r0
            r3 = 0
            goto L45
        L44:
            r1 = r0
        L45:
            java.util.Set r0 = r6.b
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r0.next()
            zar r4 = (defpackage.zar) r4
            boolean r5 = r6.c
            if (r5 == 0) goto L5f
            r4.lJ(r3, r1)
            goto L4b
        L5f:
            r4.lI(r3, r1)
            goto L4b
        L63:
            r6.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zaq.run():void");
    }
}
