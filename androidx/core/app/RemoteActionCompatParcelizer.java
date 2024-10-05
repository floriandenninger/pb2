package androidx.core.app;

import android.app.PendingIntent;
import android.support.v4.app.RemoteActionCompat;
import android.support.v4.graphics.drawable.IconCompat;
import defpackage.bxx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bxx bxxVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bxxVar.t(remoteActionCompat.a);
        remoteActionCompat.b = bxxVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = bxxVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) bxxVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = bxxVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = bxxVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bxx bxxVar) {
        bxxVar.u(remoteActionCompat.a);
        bxxVar.g(remoteActionCompat.b, 2);
        bxxVar.g(remoteActionCompat.c, 3);
        bxxVar.i(remoteActionCompat.d, 4);
        bxxVar.f(remoteActionCompat.e, 5);
        bxxVar.f(remoteActionCompat.f, 6);
    }
}
