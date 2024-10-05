package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rtk extends rtb {
    public Account ae;
    public String af;
    public rtd ag;
    public WebView ah;
    private rsv al;
    public static final amyi e = rwh.k();
    private static final amsx ai = amsx.r("https://myaccount.google.com/embedded/accountlinking/create");
    private static final amrz aj = amrz.o(aoct.ERROR_CODE_UNSPECIFIED, 208, aoct.ERROR_CODE_INVALID_REQUEST, 204, aoct.ERROR_CODE_RPC_ERROR, 205, aoct.ERROR_CODE_INTERNAL_ERROR, 206, aoct.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 207);
    private static final String ak = "4";

    @Override // defpackage.rtb
    public final void a() {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUserCancellingFlow", 184, "StreamlineFragment.java")).q("StreamlinedFragment: User hits back button.");
        this.al.f(aoru.EVENT_SYSTEM_ACTION_USER_CANCEL);
        this.al.e();
        this.ag.a(rtc.c(2, 203));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rtb
    public final void d(String str) {
        ((amyf) ((amyf) e.g()).i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onWebViewLoadingError", 162, "StreamlineFragment.java")).s("Failed to load streamlined url: %s", str);
        this.ag.a(rtc.b(201));
    }

    @Override // defpackage.rtb, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        Account account = (Account) bundle2.getParcelable("account");
        account.getClass();
        this.ae = account;
        String string = bundle2.getString("flow_url");
        string.getClass();
        this.af = Uri.parse(string).buildUpon().appendQueryParameter("result_channel", ak).build().toString();
        this.ag = (rtd) eq.c(C()).a(rtd.class);
        rsv rsvVar = (rsv) eq.c(C()).a(rsv.class);
        this.al = rsvVar;
        rsvVar.g(aorv.STATE_ACCOUNT_SELECTION);
        amxd listIterator = ai.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                if (this.af.startsWith((String) listIterator.next())) {
                    break;
                }
            } else {
                ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onCreate", 89, "StreamlineFragment.java")).q("invalid streamlined flow url.");
                this.ag.a(rtc.b(208));
                break;
            }
        }
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onCreate", 94, "StreamlineFragment.java")).q("StreamlinedFragment: onCreate");
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onStart", 100, "StreamlineFragment.java")).q("StreamlinedFragment: onStart");
        WebView webView = this.d;
        this.ah = webView;
        webView.addJavascriptInterface(this, "GAL");
        anaf.Y(((rue) ((ruh) eq.c(C()).a(ruh.class)).b).b.submit(new Callable() { // from class: rti
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rtk rtkVar = rtk.this;
                return qdj.a(rtkVar.qR()).c(rtkVar.ae, rtkVar.af);
            }
        }), new rtj(this), new ruj(new Handler(Looper.getMainLooper()), 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rtb
    public final void n(String str) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onWebViewLoadingHttpError", 172, "StreamlineFragment.java")).s("HTTP error when loading url: %s", str);
        this.ag.a(rtc.b(201));
    }

    @JavascriptInterface
    public void onSuccess(String str) {
        this.ag.a(rtc.a(2, str));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUiEvent", 155, "StreamlineFragment.java")).s("StreamlinedFragment: onUiEvent %s ", aoru.a(i));
        this.al.f(aoru.a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUiStateChange", 147, "StreamlineFragment.java")).s("StreamlinedFragment: onUiStateChange %s ", aorv.b(i));
        this.al.g(aorv.b(i));
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        rtc c;
        if (i != 2) {
            ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onError", 130, "StreamlineFragment.java")).s("StreamlinedFragment: received recoverable error from JavaScript bridge with errorMessage %s ", str);
            c = rtc.b(((Integer) aj.getOrDefault(aoct.a(i2), 208)).intValue());
        } else {
            ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onError", 119, "StreamlineFragment.java")).s("StreamlinedFragment: received unrecoverable error from JavaScript bridge with errorMessage %s ", str);
            c = rtc.c(2, ((Integer) aj.getOrDefault(aoct.a(i2), 208)).intValue());
        }
        this.ag.a(c);
    }
}
