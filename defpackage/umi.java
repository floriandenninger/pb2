package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class umi implements Runnable {
    public final Activity a;
    public final ump b;
    private final Account c;
    private final String d;
    private final Runnable e;
    private Runnable f;

    public umi(Activity activity, Account account, String str, ump umpVar, Runnable runnable) {
        this.a = activity;
        this.c = account;
        this.d = str;
        this.b = umpVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            CookieManager cookieManager = CookieManager.getInstance();
            final String str = null;
            if (cookieManager != null) {
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
            }
            try {
                String valueOf = String.valueOf(Uri.encode(this.d));
                String concat = valueOf.length() != 0 ? "weblogin:continue=".concat(valueOf) : new String("weblogin:continue=");
                String valueOf2 = String.valueOf(concat);
                if (valueOf2.length() != 0) {
                    "Getting authToken for authTokenType = ".concat(valueOf2);
                }
                final String e = qde.e(this.a, this.c, concat);
                if (TextUtils.isEmpty(e)) {
                    Log.w("ParentToolsAuthTokenTask", "Could not retrieve a non-empty authToken");
                } else {
                    String valueOf3 = String.valueOf(e);
                    if (valueOf3.length() != 0) {
                        "Loading auth'ed page from authToken = ".concat(valueOf3);
                    }
                }
                final int i = 1;
                this.f = new Runnable(this) { // from class: umh
                    public final /* synthetic */ umi a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i != 0) {
                            umi umiVar = this.a;
                            AccountManager.get(umiVar.a).invalidateAuthToken("com.google", e);
                        } else {
                            umi umiVar2 = this.a;
                            umiVar2.b.a.c.loadUrl(e);
                        }
                    }
                };
                str = e;
            } catch (Throwable th) {
                Log.e("ParentToolsAuthTokenTask", "An error happened when getting authToken.", th);
            }
            if (TextUtils.isEmpty(str)) {
                this.e.run();
                return;
            }
            final int i2 = 0;
            this.a.runOnUiThread(new Runnable(this) { // from class: umh
                public final /* synthetic */ umi a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 != 0) {
                        umi umiVar = this.a;
                        AccountManager.get(umiVar.a).invalidateAuthToken("com.google", str);
                    } else {
                        umi umiVar2 = this.a;
                        umiVar2.b.a.c.loadUrl(str);
                    }
                }
            });
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot get auth token on the UI thread");
    }
}
