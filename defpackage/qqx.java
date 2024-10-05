package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqx extends ror implements qod, qoe {
    private static final qar h = roo.d;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final qrz d;
    public rop e;
    public qpx f;
    public final qar g;

    public qqx(Context context, Handler handler, qrz qrzVar) {
        qar qarVar = h;
        this.a = context;
        this.b = handler;
        this.d = qrzVar;
        this.c = qrzVar.b;
        this.g = qarVar;
    }

    @Override // defpackage.qpj
    public final void a(int i) {
        this.e.l();
    }

    @Override // defpackage.qpj
    public final void b() {
        qqx qqxVar;
        GoogleSignInAccount googleSignInAccount;
        Object obj = this.e;
        try {
            Account account = ((rou) obj).a.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            try {
                if ("<<default account>>".equals(account.name)) {
                    try {
                        Context context = ((qrx) obj).q;
                        qee.a.lock();
                        try {
                            if (qee.b == null) {
                                qee.b = new qee(context.getApplicationContext());
                            }
                            qee qeeVar = qee.b;
                            qee.a.unlock();
                            String a = qeeVar.a("defaultGoogleSignInAccount");
                            if (!TextUtils.isEmpty(a)) {
                                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
                                sb.append("googleSignInAccount");
                                sb.append(":");
                                sb.append(a);
                                String a2 = qeeVar.a(sb.toString());
                                if (a2 != null) {
                                    if (!TextUtils.isEmpty(a2)) {
                                        JSONObject jSONObject = new JSONObject(a2);
                                        String optString = jSONObject.optString("photoUrl");
                                        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                                        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                                        HashSet hashSet = new HashSet();
                                        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                        int i = 0;
                                        for (int length = jSONArray.length(); i < length; length = length) {
                                            hashSet.add(new Scope(jSONArray.getString(i)));
                                            i++;
                                        }
                                        String optString2 = jSONObject.optString("id");
                                        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                        Long valueOf = Long.valueOf(parseLong);
                                        String string = jSONObject.getString("obfuscatedIdentifier");
                                        long longValue = valueOf.longValue();
                                        qip.ax(string);
                                        googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
                                        googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                        Integer num = ((rou) obj).b;
                                        qip.an(num);
                                        ResolveAccountRequest resolveAccountRequest = new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount);
                                        ros rosVar = (ros) ((qrx) obj).D();
                                        SignInRequest signInRequest = new SignInRequest(1, resolveAccountRequest);
                                        Parcel pn = rosVar.pn();
                                        ecr.g(pn, signInRequest);
                                        qqxVar = this;
                                        ecr.i(pn, qqxVar);
                                        rosVar.pp(12, pn);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            qee.a.unlock();
                            throw th;
                        }
                    } catch (RemoteException e) {
                        e = e;
                        qqxVar = this;
                        Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                        try {
                            qqxVar.c(new SignInResponse(1, new ConnectionResult(8, null), null));
                            return;
                        } catch (RemoteException unused) {
                            Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                            return;
                        }
                    }
                }
                ecr.i(pn, qqxVar);
                rosVar.pp(12, pn);
                return;
            } catch (RemoteException e2) {
                e = e2;
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                qqxVar.c(new SignInResponse(1, new ConnectionResult(8, null), null));
                return;
            }
            googleSignInAccount = null;
            Integer num2 = ((rou) obj).b;
            qip.an(num2);
            ResolveAccountRequest resolveAccountRequest2 = new ResolveAccountRequest(2, account, num2.intValue(), googleSignInAccount);
            ros rosVar2 = (ros) ((qrx) obj).D();
            SignInRequest signInRequest2 = new SignInRequest(1, resolveAccountRequest2);
            Parcel pn2 = rosVar2.pn();
            ecr.g(pn2, signInRequest2);
            qqxVar = this;
        } catch (RemoteException e3) {
            e = e3;
            qqxVar = this;
        }
    }

    @Override // defpackage.ror
    public final void c(SignInResponse signInResponse) {
        this.b.post(new qqw(this, signInResponse));
    }

    @Override // defpackage.qqp
    public final void i(ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }
}
