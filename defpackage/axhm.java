package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axhm extends ecq implements axhn {
    public axhm() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    @Override // defpackage.ecq
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        onTransitionComplete();
        return true;
    }
}
