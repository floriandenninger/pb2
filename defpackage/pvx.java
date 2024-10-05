package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pvx {
    private static final pwz a;

    static {
        pwz pwzVar;
        pwz pwzVar2 = null;
        try {
            Object newInstance = pvw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                qbi.f("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof pwz) {
                        pwzVar = (pwz) queryLocalInterface;
                    } else {
                        pwzVar = new pwz(iBinder);
                    }
                    pwzVar2 = pwzVar;
                }
            }
        } catch (Exception unused) {
            qbi.f("Failed to instantiate ClientApi class.");
        }
        a = pwzVar2;
    }

    private final Object e() {
        pwz pwzVar = a;
        if (pwzVar == null) {
            qbi.f("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(pwzVar);
        } catch (RemoteException e) {
            qbi.g("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object f() {
        try {
            return b();
        } catch (RemoteException e) {
            qbi.g("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b();

    protected abstract Object c(pwz pwzVar);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r6) {
        /*
            r5 = this;
            defpackage.pvy.c()
            qmz r0 = defpackage.qmz.d
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.h(r6, r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r0 = 0
            goto L18
        L12:
            java.lang.String r0 = "Google Play Services is not available."
            defpackage.qbi.b(r0)
            r0 = 1
        L18:
            java.lang.String r3 = "com.google.android.gms.ads.dynamite"
            int r4 = defpackage.qvu.a(r6, r3)
            int r3 = defpackage.qvu.b(r6, r3)
            if (r4 <= r3) goto L26
            r3 = 0
            goto L27
        L26:
            r3 = 1
        L27:
            r3 = r3 ^ r2
            r0 = r0 | r3
            defpackage.pyi.b(r6)
            yxw r3 = defpackage.pyk.a
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3c
        L3a:
            r0 = 0
            goto L4f
        L3c:
            yxw r3 = defpackage.pyk.b
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4d
            r0 = 1
            r1 = 1
            goto L4f
        L4d:
            r1 = r0
            goto L3a
        L4f:
            if (r1 == 0) goto L5e
            java.lang.Object r6 = r5.e()
            if (r6 != 0) goto L9f
            if (r0 != 0) goto L9f
            java.lang.Object r6 = r5.f()
            goto L9f
        L5e:
            java.lang.Object r0 = r5.f()
            if (r0 != 0) goto L97
            yxw r1 = defpackage.pyo.a
            java.lang.Object r1 = r1.a()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            pvy r3 = defpackage.pvy.a
            java.util.Random r3 = r3.b
            int r1 = r3.nextInt(r1)
            if (r1 != 0) goto L97
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "action"
            java.lang.String r4 = "dynamite_load"
            r1.putString(r3, r4)
            java.lang.String r3 = "is_missing"
            r1.putInt(r3, r2)
            defpackage.pvy.c()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = defpackage.pvy.b()
            java.lang.String r2 = r2.a
            defpackage.qbg.i(r6, r2, r1)
        L97:
            if (r0 != 0) goto L9e
            java.lang.Object r6 = r5.e()
            goto L9f
        L9e:
            r6 = r0
        L9f:
            if (r6 != 0) goto La5
            java.lang.Object r6 = r5.a()
        La5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvx.d(android.content.Context):java.lang.Object");
    }
}
