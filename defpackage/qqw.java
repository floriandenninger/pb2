package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qqw implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ qqx b;

    public qqw(qqx qqxVar, SignInResponse signInResponse) {
        this.b = qqxVar;
        this.a = signInResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qqx qqxVar = this.b;
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.c()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            qip.an(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.c()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                qqxVar.f.b(connectionResult2);
                qqxVar.e.l();
                return;
            }
            qpx qpxVar = qqxVar.f;
            qsp a = resolveAccountResponse.a();
            Set set = qqxVar.c;
            if (a == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                qpxVar.b(new ConnectionResult(4));
            } else {
                qpxVar.f = a;
                qpxVar.c = set;
                qpxVar.c();
            }
        } else {
            qqxVar.f.b(connectionResult);
        }
        qqxVar.e.l();
    }
}
