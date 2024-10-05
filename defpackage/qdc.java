package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdc implements qdd {
    final /* synthetic */ String a;

    public qdc(String str) {
        this.a = str;
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
        Parcel pn = owoVar.pn();
        pn.writeString(str);
        Parcel po = owoVar.po(8, pn);
        Bundle bundle = (Bundle) ecr.a(po, Bundle.CREATOR);
        po.recycle();
        qde.k(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        qef a = qef.a(string);
        if (qef.SUCCESS.equals(a)) {
            return true;
        }
        if (qef.b(a)) {
            rvm rvmVar = qde.d;
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            rvmVar.b("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new qcw(string);
    }
}
