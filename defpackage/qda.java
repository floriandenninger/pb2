package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qda implements qdd {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public qda(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.qdd
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        owo owoVar;
        if (iBinder == null) {
            owoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof owo) {
                owoVar = (owo) queryLocalInterface;
            } else {
                owoVar = new owo(iBinder);
            }
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel pn = owoVar.pn();
        pn.writeString(str);
        ecr.g(pn, bundle);
        Parcel po = owoVar.po(2, pn);
        Bundle bundle2 = (Bundle) ecr.a(po, Bundle.CREATOR);
        po.recycle();
        qde.k(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new qcw(string);
    }
}
