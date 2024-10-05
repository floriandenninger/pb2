package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qqc extends ecq implements qqd {
    public qqc() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Status) ecr.a(parcel, Status.CREATOR));
        return true;
    }
}
