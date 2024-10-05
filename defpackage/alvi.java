package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvi extends ecp implements IInterface {
    public alvi(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
    }

    public final void a(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pp(6, pn);
    }
}
