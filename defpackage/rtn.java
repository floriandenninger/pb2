package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rtn extends ce {
    public static final amyi a = rwh.k();
    public static final rtc b;
    public static final rtc c;
    public static final amrz d;
    public static final amrz e;
    public rtd ae;
    public rsv af;
    public boolean ag;
    private String ah;
    private boolean ai;

    static {
        rtc c2 = rtc.c(2, 106);
        b = c2;
        c = rtc.b(109);
        amrw h = amrz.h();
        h.g("invalid_request", rtc.b(101));
        h.g("unauthorized_client", rtc.b(102));
        h.g("access_denied", rtc.c(2, 103));
        h.g("unsupported_response_type", rtc.b(104));
        h.g("invalid_scope", rtc.b(105));
        h.g("server_error", c2);
        h.g("temporarily_unavailable", rtc.c(2, 107));
        d = h.c();
        amrw h2 = amrz.h();
        h2.g("invalid_request", aoru.EVENT_APP_AUTH_INVALID_REQUEST);
        h2.g("unauthorized_client", aoru.EVENT_APP_AUTH_UNAUTHORIZED_CLIENT);
        h2.g("access_denied", aoru.EVENT_APP_AUTH_ACCESS_DENIED);
        h2.g("unsupported_response_type", aoru.EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE);
        h2.g("invalid_scope", aoru.EVENT_APP_AUTH_INVALID_SCOPE);
        h2.g("server_error", aoru.EVENT_APP_AUTH_SERVER_ERROR);
        h2.g("temporarily_unavailable", aoru.EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE);
        e = h2.c();
    }

    public static rtn a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("auth_url", str);
        bundle.putBoolean("need_one_time_auth_code", z);
        rtn rtnVar = new rtn();
        rtnVar.af(bundle);
        return rtnVar;
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        super.T(i, i2, intent);
        this.af.f(aoru.EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT);
        ((amyf) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onActivityResult", 167, "WebOAuthFragment.java")).q("WebOAuthFragment received onActivityResult()");
        new Handler().postDelayed(new Runnable() { // from class: rtm
            @Override // java.lang.Runnable
            public final void run() {
                rtn rtnVar = rtn.this;
                if (rtnVar.ag) {
                    rtnVar.ag = false;
                    return;
                }
                ((amyf) rtn.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "lambda$onActivityResult$0", 172, "WebOAuthFragment.java")).q("Custom Tab is closed by user");
                rtnVar.af.f(aoru.EVENT_APP_AUTH_DISMISS);
                rtnVar.ae.a(rtc.b(110));
            }
        }, 20L);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        Intent intent;
        super.mR(bundle);
        al(true);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        String string = bundle2.getString("auth_url");
        string.getClass();
        this.ah = string;
        this.ai = bundle2.getBoolean("need_one_time_auth_code");
        this.ae = (rtd) eq.c(C()).a(rtd.class);
        rsv rsvVar = (rsv) eq.c(C()).a(rsv.class);
        this.af = rsvVar;
        rsvVar.g(aorv.STATE_APP_AUTH);
        String u = ayeq.u(qR());
        if (u == null) {
            this.af.f(aoru.EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER);
            ((amyf) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "getCustomTabsPackage", 263, "WebOAuthFragment.java")).q("WebOAuth flow cannot be started because no custom tabs supported web browser is found on this device");
        }
        if (u != null) {
            String str = this.ah;
            intent = new acu().a().a;
            intent.setPackage(u);
            intent.setData(Uri.parse(str));
            if (!this.ai) {
                intent.setFlags(1073741824);
            }
            ((amyf) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 127, "WebOAuthFragment.java")).q("WebOAuthFragment is starting CustomTabs.");
        } else {
            ammv a2 = rtl.a(qR());
            if (!a2.h()) {
                this.af.f(aoru.EVENT_APP_AUTH_NO_BROWSER_FOUND);
                this.ae.a(rtc.b(108));
                ((amyf) ((amyf) a.g()).i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 139, "WebOAuthFragment.java")).q("WebOAuth flow cannot be started because no web browser is found on this device");
                return;
            }
            String str2 = (String) a2.c();
            String str3 = this.ah;
            intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(str2);
            intent.setData(Uri.parse(str3));
            if (!this.ai) {
                intent.setFlags(1073741824);
            }
            ((amyf) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 143, "WebOAuthFragment.java")).q("WebOAuthFragment is starting Browser.");
        }
        this.ag = false;
        startActivityForResult(intent, 1001);
    }
}
