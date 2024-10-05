package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qcr extends ecq implements IInterface {
    protected qpc a;

    public qcr() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public void a(Status status) {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Status) ecr.a(parcel, Status.CREATOR));
        } else if (i == 2) {
        } else {
            if (i != 4) {
                return false;
            }
        }
        return true;
    }
}
