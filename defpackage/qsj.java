package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsj implements ServiceConnection, qsl {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final qsh e;
    public ComponentName f;
    final /* synthetic */ qsi g;

    public qsj(qsi qsiVar, qsh qshVar) {
        this.g = qsiVar;
        this.e = qshVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 3
            r9.b = r1
            qsi r1 = r9.g
            qtj r2 = r1.f
            android.content.Context r3 = r1.d
            qsh r1 = r9.e
            java.lang.String r4 = r1.b
            if (r4 == 0) goto L8c
            boolean r4 = r1.f
            r5 = 0
            if (r4 == 0) goto L7c
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = r1.b
            java.lang.String r7 = "serviceActionBundleKey"
            r4.putString(r7, r6)
            android.content.ContentResolver r6 = r3.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f
            android.net.Uri r7 = defpackage.qsh.a     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r4 = r6.call(r7, r8, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            goto L53
        L2f:
            r4 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 34
            r7.<init>(r6)
            java.lang.String r6 = "Dynamic intent resolution failed: "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.w(r0, r4)
            r4 = r5
        L53:
            if (r4 != 0) goto L56
            goto L5f
        L56:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r4.getParcelable(r5)
            android.content.Intent r4 = (android.content.Intent) r4
            r5 = r4
        L5f:
            if (r5 != 0) goto L7c
            java.lang.String r4 = r1.b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            int r7 = r4.length()
            if (r7 == 0) goto L74
            java.lang.String r4 = r6.concat(r4)
            goto L79
        L74:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L79:
            android.util.Log.w(r0, r4)
        L7c:
            if (r5 != 0) goto L98
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = r1.b
            r0.<init>(r4)
            java.lang.String r1 = r1.c
            android.content.Intent r0 = r0.setPackage(r1)
            goto L97
        L8c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = r1.d
            android.content.Intent r0 = r0.setComponent(r1)
        L97:
            r5 = r0
        L98:
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r10
            r6 = r9
            boolean r10 = r2.d(r3, r4, r5, r6, r7)
            r9.c = r10
            if (r10 == 0) goto Lb9
            qsi r10 = r9.g
            android.os.Handler r10 = r10.e
            qsh r0 = r9.e
            r1 = 1
            android.os.Message r10 = r10.obtainMessage(r1, r0)
            qsi r0 = r9.g
            android.os.Handler r1 = r0.e
            long r2 = r0.g
            r1.sendMessageDelayed(r10, r2)
            return
        Lb9:
            r10 = 2
            r9.b = r10
            qsi r10 = r9.g     // Catch: java.lang.IllegalArgumentException -> Lc5
            qtj r0 = r10.f     // Catch: java.lang.IllegalArgumentException -> Lc5
            android.content.Context r10 = r10.d     // Catch: java.lang.IllegalArgumentException -> Lc5
            r0.b(r10, r9)     // Catch: java.lang.IllegalArgumentException -> Lc5
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsj.d(java.lang.String):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
