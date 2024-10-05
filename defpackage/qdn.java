package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdn extends ecp implements qdo {
    public qdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    @Override // defpackage.qdo
    public final void a(qqd qqdVar, ClearTokenRequest clearTokenRequest) {
        Parcel pn = pn();
        ecr.i(pn, qqdVar);
        ecr.g(pn, clearTokenRequest);
        pp(2, pn);
    }

    @Override // defpackage.qdo
    public final void f(qdm qdmVar, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel pn = pn();
        ecr.i(pn, qdmVar);
        ecr.g(pn, accountChangeEventsRequest);
        pp(4, pn);
    }

    @Override // defpackage.qdo
    public final void g(qdm qdmVar, GetAccountsRequest getAccountsRequest) {
        Parcel pn = pn();
        ecr.i(pn, qdmVar);
        ecr.g(pn, getAccountsRequest);
        pp(5, pn);
    }

    @Override // defpackage.qdo
    public final void h(qdm qdmVar, Account account, String str, Bundle bundle) {
        Parcel pn = pn();
        ecr.i(pn, qdmVar);
        ecr.g(pn, account);
        pn.writeString(str);
        ecr.g(pn, bundle);
        pp(1, pn);
    }

    @Override // defpackage.qdo
    public final void i(qdm qdmVar, HasCapabilitiesRequest hasCapabilitiesRequest) {
        Parcel pn = pn();
        ecr.i(pn, qdmVar);
        ecr.g(pn, hasCapabilitiesRequest);
        pp(7, pn);
    }

    @Override // defpackage.qdo
    public final void j(qdm qdmVar, String str) {
        Parcel pn = pn();
        ecr.i(pn, qdmVar);
        pn.writeString(str);
        pp(3, pn);
    }
}
