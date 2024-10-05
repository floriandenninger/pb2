package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aluz extends ecp implements IInterface {
    public aluz(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    public final void a(String str, IBinder iBinder) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeStrongBinder(iBinder);
        pp(1, pn);
    }
}
