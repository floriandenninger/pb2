package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwk extends ecp implements pwm {
    public pwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.pwm
    public final void a(AdRequestParcel adRequestParcel) {
        Parcel pn = pn();
        ecr.g(pn, adRequestParcel);
        pp(1, pn);
    }
}
