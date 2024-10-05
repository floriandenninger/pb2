package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhm extends ecp implements qhn {
    public qhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // defpackage.qhn
    public final void a(String str, Bundle bundle) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        pp(1, pn);
    }

    @Override // defpackage.qhn
    public final void f(String str, Bundle bundle) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        pp(2, pn);
    }

    @Override // defpackage.qhn
    public final void g(String str, Bundle bundle) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        pp(3, pn);
    }

    @Override // defpackage.qhn
    public final void h(String str, Bundle bundle) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        pp(4, pn);
    }

    @Override // defpackage.qhn
    public final void i(String str, Bundle bundle, int i) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        pn.writeInt(i);
        pp(6, pn);
    }
}
