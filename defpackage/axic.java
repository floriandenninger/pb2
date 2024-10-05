package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axic extends ecp implements axie {
    public axic(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    @Override // defpackage.axie
    public final axih getRootView() {
        throw null;
    }

    @Override // defpackage.axie
    public final boolean isEnabled() {
        throw null;
    }

    @Override // defpackage.axie
    public final void setCloseButtonListener(axih axihVar) {
        Parcel pn = pn();
        ecr.i(pn, axihVar);
        pp(5, pn);
    }

    @Override // defpackage.axie
    public final void setEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.axie
    public final void setSettingsButtonEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.axie
    public final void setSettingsButtonListener(axih axihVar) {
        throw null;
    }

    @Override // defpackage.axie
    public final void setTransitionViewEnabled(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(6, pn);
    }

    @Override // defpackage.axie
    public final void setTransitionViewListener(axih axihVar) {
        throw null;
    }

    @Override // defpackage.axie
    public final void setViewerName(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pp(10, pn);
    }
}
