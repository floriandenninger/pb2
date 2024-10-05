package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdb implements qdd {
    final /* synthetic */ AccountChangeEventsRequest a;

    public qdb(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a = accountChangeEventsRequest;
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
        AccountChangeEventsRequest accountChangeEventsRequest = this.a;
        Parcel pn = owoVar.pn();
        ecr.g(pn, accountChangeEventsRequest);
        Parcel po = owoVar.po(3, pn);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) ecr.a(po, AccountChangeEventsResponse.CREATOR);
        po.recycle();
        qde.k(accountChangeEventsResponse);
        return accountChangeEventsResponse.b;
    }
}
