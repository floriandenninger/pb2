package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ef implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public ef(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(ee eeVar) {
        if (eeVar.b) {
            this.b.unbindService(this);
            eeVar.b = false;
        }
        eeVar.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r10.b != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.ee r10) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbf
            boolean r0 = r10.b
            java.lang.String r1 = "NotifManCompat"
            r2 = 0
            if (r0 == 0) goto L10
            goto L4b
        L10:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.<init>(r3)
            android.content.ComponentName r3 = r10.a
            android.content.Intent r0 = r0.setComponent(r3)
            android.content.Context r3 = r9.b
            r4 = 33
            boolean r0 = r3.bindService(r0, r9, r4)
            r10.b = r0
            if (r0 == 0) goto L2c
            r10.d = r2
            goto L47
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unable to bind to listener "
            r0.append(r3)
            android.content.ComponentName r3 = r10.a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            android.content.Context r0 = r9.b
            r0.unbindService(r9)
        L47:
            boolean r0 = r10.b
            if (r0 == 0) goto Lbc
        L4b:
            dr r0 = r10.e
            if (r0 == 0) goto Lbc
        L4f:
            java.util.ArrayDeque r0 = r10.c
            java.lang.Object r0 = r0.peek()
            ec r0 = (defpackage.ec) r0
            if (r0 != 0) goto L5a
            goto Lb0
        L5a:
            dr r3 = r10.e     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            java.lang.String r4 = r0.a     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            int r5 = r0.b     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            java.lang.String r6 = r0.c     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            android.app.Notification r0 = r0.d     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            java.lang.String r8 = "android.support.v4.app.INotificationSideChannel"
            r7.writeInterfaceToken(r8)     // Catch: java.lang.Throwable -> L92
            r7.writeString(r4)     // Catch: java.lang.Throwable -> L92
            r7.writeInt(r5)     // Catch: java.lang.Throwable -> L92
            r7.writeString(r6)     // Catch: java.lang.Throwable -> L92
            r4 = 1
            if (r0 == 0) goto L80
            r7.writeInt(r4)     // Catch: java.lang.Throwable -> L92
            r0.writeToParcel(r7, r2)     // Catch: java.lang.Throwable -> L92
            goto L83
        L80:
            r7.writeInt(r2)     // Catch: java.lang.Throwable -> L92
        L83:
            android.os.IBinder r0 = r3.a     // Catch: java.lang.Throwable -> L92
            r3 = 0
            r0.transact(r4, r7, r3, r4)     // Catch: java.lang.Throwable -> L92
            r7.recycle()     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            java.util.ArrayDeque r0 = r10.c     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            r0.remove()     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            goto L4f
        L92:
            r0 = move-exception
            r7.recycle()     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
            throw r0     // Catch: android.os.RemoteException -> L97 android.os.DeadObjectException -> Laf
        L97:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "RemoteException communicating with "
            r2.append(r3)
            android.content.ComponentName r3 = r10.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r1, r2, r0)
            goto Lb0
        Laf:
        Lb0:
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbb
            r9.c(r10)
        Lbb:
            return
        Lbc:
            r9.c(r10)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef.b(ee):void");
    }

    private final void c(ee eeVar) {
        if (this.a.hasMessages(3, eeVar.a)) {
            return;
        }
        int i = eeVar.d + 1;
        eeVar.d = i;
        if (i > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + eeVar.c.size() + " tasks to " + eeVar.a + " after " + eeVar.d + " retries");
            eeVar.c.clear();
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(3, eeVar.a), (1 << (i - 1)) * 1000);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        dr drVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ee eeVar = (ee) this.d.get((ComponentName) message.obj);
                    if (eeVar != null) {
                        a(eeVar);
                    }
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                ee eeVar2 = (ee) this.d.get((ComponentName) message.obj);
                if (eeVar2 != null) {
                    b(eeVar2);
                }
                return true;
            }
            ed edVar = (ed) message.obj;
            ComponentName componentName = edVar.a;
            IBinder iBinder = edVar.b;
            ee eeVar3 = (ee) this.d.get(componentName);
            if (eeVar3 != null) {
                if (iBinder == null) {
                    drVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof dr)) {
                        drVar = new dr(iBinder);
                    } else {
                        drVar = (dr) queryLocalInterface;
                    }
                }
                eeVar3.e = drVar;
                eeVar3.d = 0;
                b(eeVar3);
            }
            return true;
        }
        ec ecVar = (ec) message.obj;
        Set b = eg.b(this.b);
        if (!b.equals(this.e)) {
            this.e = b;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (b.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName2 = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet) {
                if (!this.d.containsKey(componentName3)) {
                    this.d.put(componentName3, new ee(componentName3));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    a((ee) entry.getValue());
                    it.remove();
                }
            }
        }
        for (ee eeVar4 : this.d.values()) {
            eeVar4.c.add(ecVar);
            b(eeVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new ed(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
