package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class shd {
    public final String a;
    public final act b;
    public final amnv c;

    public shd(ComponentName componentName, act actVar) {
        this.c = amkq.x(new shb(this));
        this.a = componentName.getPackageName();
        this.b = actVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.shc a() {
        /*
            r9 = this;
            she r0 = new she
            r0.<init>()
            act r1 = r9.b
            ax r2 = new ax
            r3 = 0
            r2.<init>(r0, r3)
            az r4 = r1.b     // Catch: android.os.RemoteException -> L48
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L48
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L48
            java.lang.String r7 = "android.support.customtabs.ICustomTabsService"
            r5.writeInterfaceToken(r7)     // Catch: java.lang.Throwable -> L40
            r5.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L40
            android.os.IBinder r4 = r4.a     // Catch: java.lang.Throwable -> L40
            r7 = 3
            r8 = 0
            r4.transact(r7, r5, r6, r8)     // Catch: java.lang.Throwable -> L40
            r6.readException()     // Catch: java.lang.Throwable -> L40
            int r4 = r6.readInt()     // Catch: java.lang.Throwable -> L40
            r6.recycle()     // Catch: android.os.RemoteException -> L48
            r5.recycle()     // Catch: android.os.RemoteException -> L48
            if (r4 != 0) goto L36
            goto L48
        L36:
            acx r4 = new acx
            az r5 = r1.b
            android.content.ComponentName r1 = r1.a
            r4.<init>(r2, r1)
            goto L49
        L40:
            r1 = move-exception
            r6.recycle()     // Catch: android.os.RemoteException -> L48
            r5.recycle()     // Catch: android.os.RemoteException -> L48
            throw r1     // Catch: android.os.RemoteException -> L48
        L48:
            r4 = r3
        L49:
            if (r4 != 0) goto L4c
            return r3
        L4c:
            shc r1 = new shc
            r1.<init>(r9, r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shd.a():shc");
    }

    public shd() {
    }
}
