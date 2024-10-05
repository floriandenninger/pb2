package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwn extends ecp implements pwp {
    public pwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.pwp
    public final pwm a() {
        pwm pwkVar;
        Parcel po = po(1, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            pwkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof pwm) {
                pwkVar = (pwm) queryLocalInterface;
            } else {
                pwkVar = new pwk(readStrongBinder);
            }
        }
        po.recycle();
        return pwkVar;
    }

    @Override // defpackage.pwp
    public final void f(String str, pzg pzgVar, pzd pzdVar) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.i(pn, pzgVar);
        ecr.i(pn, pzdVar);
        pp(5, pn);
    }

    @Override // defpackage.pwp
    public final void g(pzk pzkVar) {
        Parcel pn = pn();
        ecr.i(pn, pzkVar);
        pp(10, pn);
    }

    @Override // defpackage.pwp
    public final void h(pwg pwgVar) {
        Parcel pn = pn();
        ecr.i(pn, pwgVar);
        pp(2, pn);
    }

    @Override // defpackage.pwp
    public final void i(NativeAdOptionsParcel nativeAdOptionsParcel) {
        Parcel pn = pn();
        ecr.g(pn, nativeAdOptionsParcel);
        pp(6, pn);
    }
}
