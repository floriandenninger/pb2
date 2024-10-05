package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adso implements adsj {
    public static final String a = zga.a("MDX.PermissionsController");
    protected View b;
    protected WebView c;
    public final adsq d;
    public final acra e;
    public final ce f;
    protected final qdj g;
    public ScreenId h;
    private final anib i;
    private final afsy j;
    private final boolean k;
    private final adsn l;
    private final ainy m;
    private final adlt n;

    public adso(adsq adsqVar, acra acraVar, ce ceVar, anib anibVar, afsy afsyVar, acun acunVar, Context context, ainy ainyVar, adlt adltVar) {
        CookieManager.getInstance().setAcceptCookie(true);
        this.d = adsqVar;
        this.e = acraVar;
        this.f = ceVar;
        this.i = anibVar;
        this.j = afsyVar;
        this.k = acunVar.r;
        this.l = new adsn(this);
        this.m = ainyVar;
        this.n = adltVar;
        this.g = qdj.a(context);
    }

    @Override // defpackage.adsj
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_permissions_fragment, viewGroup, false);
        this.b = inflate.findViewById(R.id.loading);
        this.c = (WebView) inflate.findViewById(R.id.webview);
        return inflate;
    }

    @Override // defpackage.adsj
    public final void b(final String str, final String str2, ScreenId screenId) {
        if (this.n.g() == null) {
            this.m.a();
        }
        this.e.d(acsb.b(36387), null, null);
        this.d.a(screenId, "started");
        this.h = screenId;
        final int i = 1;
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.addJavascriptInterface(this.l, "approvalJsInterface");
        this.c.setWebViewClient(new adsm(this));
        final int i2 = 0;
        ynm.n(this.f, this.i.submit(new Callable() { // from class: adsl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                adso.this.g.c(new Account(str, "com.google"), "https://accounts.google.com");
                return null;
            }
        }), new zfi(this) { // from class: adsk
            public final /* synthetic */ adso a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.d(str2);
                    return;
                }
                adso adsoVar = this.a;
                String str3 = str2;
                zga.f(adso.a, "Error while setting up account cookies", (Throwable) obj);
                adsoVar.d(str3);
            }
        }, new zfi(this) { // from class: adsk
            public final /* synthetic */ adso a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.d(str2);
                    return;
                }
                adso adsoVar = this.a;
                String str3 = str2;
                zga.f(adso.a, "Error while setting up account cookies", (Throwable) obj);
                adsoVar.d(str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError", str);
        }
        ci C = this.f.C();
        if (C == null) {
            return;
        }
        C.setResult(-1, intent);
        C.finish();
    }

    public final void d(String str) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("X-Identity-Oauth2-Device-Usercode", str);
        if (this.k) {
            hashMap.put("pageId", this.j.c().e());
            this.c.loadUrl("https://accounts.google.com/o/oauth2/device/usercode?", hashMap);
        } else {
            this.c.loadUrl("https://accounts.google.com/o/oauth2/device/usercode?pageId=none", hashMap);
        }
    }
}
