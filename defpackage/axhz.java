package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhz extends ecp implements axib {
    public axhz(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }

    @Override // defpackage.axib
    public final boolean enableAsyncReprojection(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        Parcel po = po(9, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.axib
    public final boolean enableCardboardTriggerEmulation(axih axihVar) {
        throw null;
    }

    @Override // defpackage.axib
    public final long getNativeGvrContext() {
        Parcel po = po(2, pn());
        long readLong = po.readLong();
        po.recycle();
        return readLong;
    }

    @Override // defpackage.axib
    public final axih getRootView() {
        axih axifVar;
        Parcel po = po(3, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            axifVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            if (queryLocalInterface instanceof axih) {
                axifVar = (axih) queryLocalInterface;
            } else {
                axifVar = new axif(readStrongBinder);
            }
        }
        po.recycle();
        return axifVar;
    }

    @Override // defpackage.axib
    public final axie getUiLayout() {
        Parcel po = po(4, pn());
        axie asInterface = axid.asInterface(po.readStrongBinder());
        po.recycle();
        return asInterface;
    }

    @Override // defpackage.axib
    public final void onBackPressed() {
        throw null;
    }

    @Override // defpackage.axib
    public final void onPause() {
        pp(5, pn());
    }

    @Override // defpackage.axib
    public final void onResume() {
        pp(6, pn());
    }

    @Override // defpackage.axib
    public final boolean setOnDonNotNeededListener(axih axihVar) {
        throw null;
    }

    @Override // defpackage.axib
    public final void setPresentationView(axih axihVar) {
        Parcel pn = pn();
        ecr.i(pn, axihVar);
        pp(8, pn);
    }

    @Override // defpackage.axib
    public final void setReentryIntent(axih axihVar) {
        throw null;
    }

    @Override // defpackage.axib
    public final void setStereoModeEnabled(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(11, pn);
    }

    @Override // defpackage.axib
    public final void shutdown() {
        pp(7, pn());
    }
}
