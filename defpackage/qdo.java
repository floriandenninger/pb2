package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface qdo extends IInterface {
    void a(qqd qqdVar, ClearTokenRequest clearTokenRequest);

    void f(qdm qdmVar, AccountChangeEventsRequest accountChangeEventsRequest);

    void g(qdm qdmVar, GetAccountsRequest getAccountsRequest);

    void h(qdm qdmVar, Account account, String str, Bundle bundle);

    void i(qdm qdmVar, HasCapabilitiesRequest hasCapabilitiesRequest);

    void j(qdm qdmVar, String str);
}
