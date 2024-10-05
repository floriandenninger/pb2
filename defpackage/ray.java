package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ray extends ecq implements raz {
    private final qql a;

    public ray() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public final synchronized void a() {
        this.a.a();
    }

    public ray(qql qqlVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.a = qqlVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.b(new rbn((LocationResult) ecr.a(parcel, LocationResult.CREATOR)));
        } else {
            if (i != 2) {
                return false;
            }
            this.a.b(new rbo((LocationAvailability) ecr.a(parcel, LocationAvailability.CREATOR)));
        }
        return true;
    }
}
