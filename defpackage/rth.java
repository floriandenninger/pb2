package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rth extends rtb {
    public Account ag;
    public rtd ah;
    public WebView ai;
    public qdj aj;
    private rsv al;
    private anib am;
    private final List an = new ArrayList();
    private int ao;
    public static final amyi e = rwh.k();
    public static final amsx ae = amsx.s("https://myaccount.google.com/embedded/accountlinking/info", "https://myaccount.google.com/embedded/accountlinking/usagenotice");
    private static final amrz ak = amrz.o(aoct.ERROR_CODE_UNSPECIFIED, 408, aoct.ERROR_CODE_INVALID_REQUEST, 404, aoct.ERROR_CODE_RPC_ERROR, 405, aoct.ERROR_CODE_INTERNAL_ERROR, 406, aoct.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 407);
    public static final String af = "4";

    private final void o(final String str) {
        anaf.Y(this.am.submit(new Callable() { // from class: rtf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rth rthVar = rth.this;
                return rthVar.aj.c(rthVar.ag, str);
            }
        }), new rtg(this, str), new ruj(new Handler(Looper.getMainLooper()), 0));
    }

    @Override // defpackage.rtb
    public final void a() {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserCancellingFlow", 214, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: User hits back button.");
        this.al.f(aoru.EVENT_SYSTEM_ACTION_USER_CANCEL);
        this.al.e();
        this.ah.a(rtc.c(1, 403));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rtb
    public final void d(String str) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onWebViewLoadingError", 193, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: Failed to load data usage notice url: %s", str);
        this.ah.a(rtc.c(1, 401));
    }

    @Override // defpackage.rtb, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ao = 0;
        Bundle bundle2 = this.m;
        bundle2.getClass();
        Account account = (Account) bundle2.getParcelable("account");
        account.getClass();
        this.ag = account;
        String[] stringArray = bundle2.getStringArray("data_usage_notice_urls");
        stringArray.getClass();
        amqp f = amqp.e(stringArray).f(mjy.u);
        List list = this.an;
        list.getClass();
        Iterable h = f.h();
        if (h instanceof Collection) {
            list.addAll((Collection) h);
        } else {
            Iterator it = h.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
        }
        this.ah = (rtd) eq.c(C()).a(rtd.class);
        this.al = (rsv) eq.c(C()).a(rsv.class);
        amqp d = amqp.d(this.an);
        mjw mjwVar = mjw.s;
        Iterator it2 = d.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (!mjwVar.a(it2.next())) {
                this.ah.a(rtc.c(1, 408));
                break;
            }
        }
        this.am = ((rue) ((ruh) eq.c(C()).a(ruh.class)).b).b;
        this.aj = qdj.a(qR());
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onCreate", 114, "DataUsageNoticeFragment.java")).q("DataUsageNotice: onCreate");
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onStart", 120, "DataUsageNoticeFragment.java")).q("DataUsageNotice: onStart");
        WebView webView = this.d;
        this.ai = webView;
        webView.addJavascriptInterface(this, "GAL");
        o((String) this.an.get(this.ao));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rtb
    public final void n(String str) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onWebViewLoadingHttpError", 204, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: HTTP error when loading url: %s", str);
        this.ah.a(rtc.c(1, 401));
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onError", 156, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: received error from JavaScript bridge with errorMessage %s ", str);
        this.ah.a(rtc.c(1, ((Integer) ak.getOrDefault(aoct.a(i2), 408)).intValue()));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUiEvent", 186, "DataUsageNoticeFragment.java")).s("DataUsageNotice: onUiEvent %s ", aoru.a(i));
        this.al.f(aoru.a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUiStateChange", 178, "DataUsageNoticeFragment.java")).s("DataUsageNotice: onUiStateChange %s ", aorv.b(i));
        this.al.g(aorv.b(i));
    }

    @JavascriptInterface
    public void onUserCancelLinking() {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserCancelLinking", 143, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: user clicks the Cancel button");
        this.ah.a(rtc.c(1, 407));
    }

    @JavascriptInterface
    public void onUserConsent(String str) {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserConsent", 170, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: User clicks the AgreeAndContinue button");
        this.ah.a(rtc.a(1, str));
    }

    @JavascriptInterface
    public void onUserContinueLinking() {
        ((amyf) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserContinueLinking", 130, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: user clicks the Continue button");
        if (this.an.size() > 1) {
            int i = this.ao + 1;
            this.ao = i;
            o((String) this.an.get(i));
            return;
        }
        this.ah.a(rtc.a(1, "continue_linking"));
    }
}
