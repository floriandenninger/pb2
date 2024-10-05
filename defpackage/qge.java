package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qge extends ecp implements qgf {
    public qge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // defpackage.qgf
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel pn = pn();
        ecr.g(pn, applicationMetadata);
        pn.writeString(str);
        pn.writeString(str2);
        ecr.e(pn, z);
        pp(4, pn);
    }

    @Override // defpackage.qgf
    public final void f(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(5, pn);
    }

    @Override // defpackage.qgf
    public final void g(ConnectionResult connectionResult) {
        Parcel pn = pn();
        ecr.g(pn, connectionResult);
        pp(3, pn);
    }

    @Override // defpackage.qgf
    public final void h(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(2, pn);
    }

    @Override // defpackage.qgf
    public final void i(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(7, pn);
    }

    @Override // defpackage.qgf
    public final void j(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pn.writeInt(0);
        pp(6, pn);
    }

    @Override // defpackage.qgf
    public final void k() {
        Parcel pn = pn();
        ecr.g(pn, null);
        pp(1, pn);
    }
}
