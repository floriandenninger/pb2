package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aluy extends ecp implements IInterface {
    public aluy(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IAsyncResultCallback");
    }

    public final void a(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(2, pn);
    }
}
