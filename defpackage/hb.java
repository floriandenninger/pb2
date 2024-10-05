package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hb implements gz {
    public final MediaController a;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public hb(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // android.os.ResultReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                protected final void onReceiveResult(int r7, android.os.Bundle r8) {
                    /*
                        r6 = this;
                        java.lang.ref.WeakReference r7 = r6.a
                        java.lang.Object r7 = r7.get()
                        hb r7 = (defpackage.hb) r7
                        if (r7 == 0) goto Lba
                        if (r8 != 0) goto Le
                        goto Lba
                    Le:
                        java.lang.Object r0 = r7.b
                        monitor-enter(r0)
                        android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.e     // Catch: java.lang.Throwable -> Lb7
                        java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                        android.os.IBinder r2 = r8.getBinder(r2)     // Catch: java.lang.Throwable -> Lb7
                        r3 = 0
                        if (r2 != 0) goto L1e
                        r4 = r3
                        goto L32
                    L1e:
                        java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                        android.os.IInterface r4 = r2.queryLocalInterface(r4)     // Catch: java.lang.Throwable -> Lb7
                        if (r4 == 0) goto L2d
                        boolean r5 = r4 instanceof defpackage.gv     // Catch: java.lang.Throwable -> Lb7
                        if (r5 == 0) goto L2d
                        gv r4 = (defpackage.gv) r4     // Catch: java.lang.Throwable -> Lb7
                        goto L32
                    L2d:
                        gt r4 = new gt     // Catch: java.lang.Throwable -> Lb7
                        r4.<init>(r2)     // Catch: java.lang.Throwable -> Lb7
                    L32:
                        java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> Lb7
                        monitor-enter(r2)     // Catch: java.lang.Throwable -> Lb7
                        r1.c = r4     // Catch: java.lang.Throwable -> Lb4
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb4
                        android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.e     // Catch: java.lang.Throwable -> Lb7
                        java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                        android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        android.os.Bundle r8 = (android.os.Bundle) r8     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        if (r8 != 0) goto L45
                        goto L65
                    L45:
                        java.lang.Class<bxw> r2 = defpackage.bxw.class
                        java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        r8.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        java.lang.String r2 = "a"
                        android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        boolean r2 = r8 instanceof androidx.versionedparcelable.ParcelImpl     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        if (r2 == 0) goto L5d
                        androidx.versionedparcelable.ParcelImpl r8 = (androidx.versionedparcelable.ParcelImpl) r8     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        bxy r8 = r8.a     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        goto L66
                    L5d:
                        java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        java.lang.String r2 = "Invalid parcel"
                        r8.<init>(r2)     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                        throw r8     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lb7
                    L65:
                        r8 = r3
                    L66:
                        java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> Lb7
                        monitor-enter(r2)     // Catch: java.lang.Throwable -> Lb7
                        r1.d = r8     // Catch: java.lang.Throwable -> Lb1
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb1
                        android.support.v4.media.session.MediaSessionCompat$Token r8 = r7.e     // Catch: java.lang.Throwable -> Lb7
                        gv r8 = r8.a()     // Catch: java.lang.Throwable -> Lb7
                        if (r8 != 0) goto L75
                        goto Laf
                    L75:
                        java.util.List r8 = r7.c     // Catch: java.lang.Throwable -> Lb7
                        java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb7
                    L7b:
                        boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb7
                        if (r1 == 0) goto Laa
                        java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lb7
                        gy r1 = (defpackage.gy) r1     // Catch: java.lang.Throwable -> Lb7
                        ha r2 = new ha     // Catch: java.lang.Throwable -> Lb7
                        r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
                        java.util.HashMap r4 = r7.d     // Catch: java.lang.Throwable -> Lb7
                        r4.put(r1, r2)     // Catch: java.lang.Throwable -> Lb7
                        r1.c = r2     // Catch: java.lang.Throwable -> Lb7
                        android.support.v4.media.session.MediaSessionCompat$Token r4 = r7.e     // Catch: android.os.RemoteException -> La2 java.lang.Throwable -> Lb7
                        gv r4 = r4.a()     // Catch: android.os.RemoteException -> La2 java.lang.Throwable -> Lb7
                        r4.b(r2)     // Catch: android.os.RemoteException -> La2 java.lang.Throwable -> Lb7
                        r2 = 13
                        r1.d(r2, r3, r3)     // Catch: java.lang.Throwable -> Lb7
                        goto L7b
                    La2:
                        r8 = move-exception
                        java.lang.String r1 = "MediaControllerCompat"
                        java.lang.String r2 = "Dead object in registerCallback."
                        android.util.Log.e(r1, r2, r8)     // Catch: java.lang.Throwable -> Lb7
                    Laa:
                        java.util.List r7 = r7.c     // Catch: java.lang.Throwable -> Lb7
                        r7.clear()     // Catch: java.lang.Throwable -> Lb7
                    Laf:
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb7
                        return
                    Lb1:
                        r7 = move-exception
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb1
                        throw r7     // Catch: java.lang.Throwable -> Lb7
                    Lb4:
                        r7 = move-exception
                        monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb4
                        throw r7     // Catch: java.lang.Throwable -> Lb7
                    Lb7:
                        r7 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb7
                        throw r7
                    Lba:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
                }
            });
        }
    }
}
