package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class umw extends ce {
    public String a;
    public View ae;
    private String af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private boolean ak;
    private ExecutorService al;
    private Future am;
    public String b;
    public WebView c;
    public View d;
    public View e;

    public final void a() {
        d("");
    }

    public final void d(String str) {
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.ae.setVisibility(0);
        this.c.setVisibility(8);
        ums umsVar = (ums) C();
        if (umsVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            umsVar.d(4, str);
        } else {
            umsVar.d(5, "");
        }
    }

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        Future future = this.am;
        if (future != null) {
            future.cancel(true);
            this.am = null;
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (!(C() instanceof ums)) {
            Log.wtf("ParentToolsFragment", "host activity must implement ParentToolsFragmentListener");
            return;
        }
        if (bundle2 == null) {
            Log.e("ParentToolsFragment", "getArguments() returned null! Arguments are required.");
            ((ums) C()).d(1, "");
            p();
            return;
        }
        this.al = Executors.newSingleThreadExecutor();
        this.af = bundle2.getString("parent_tools_url", "https://families.youtube.com");
        this.a = bundle2.getString("parent_account_name", "");
        this.ag = bundle2.getString("client_name", "");
        this.ah = bundle2.getString("client_version", "");
        this.ai = bundle2.getString("child_obfuscated_gaia_id", "");
        this.b = bundle2.getString("end_url", "https://www.youtube.com/closeParentTools");
        this.aj = bundle2.getString("tool_bar_title", "");
        this.ak = bundle2.getBoolean("should_block_system_back_button", false);
        if (TextUtils.isEmpty(this.ag) || TextUtils.isEmpty(this.ah)) {
            Log.e("ParentToolsFragment", "Close parent tools because either client name or client version is not set");
            ((ums) C()).d(1, "");
            p();
        }
        WebView.setWebContentsDebuggingEnabled(true);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.parent_tools_fragment, viewGroup, false);
        this.d = inflate.findViewById(R.id.control_container);
        this.e = inflate.findViewById(R.id.loading_spinner_container);
        this.ae = inflate.findViewById(R.id.error_page_container);
        WebView webView = (WebView) inflate.findViewById(R.id.web_view);
        this.c = webView;
        webView.setWebViewClient(new umv(this));
        this.c.setWebChromeClient(new umu(this));
        WebSettings settings = this.c.getSettings();
        final int i2 = 1;
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.loading_spinner_lottie_holder);
        cfq.j(qR().getResources().openRawResource(R.raw.loading_spinner_grey), "2131951682").e(new cgb() { // from class: umo
            @Override // defpackage.cgb
            public final void a(Object obj) {
                ImageView imageView2 = imageView;
                cfz cfzVar = new cfz();
                cfzVar.setCallback(imageView2);
                cfzVar.r((cfj) obj);
                cfzVar.p(-1);
                imageView2.setImageDrawable(null);
                imageView2.setImageDrawable(cfzVar);
                cfzVar.start();
            }
        });
        inflate.findViewById(R.id.error_button).setOnClickListener(new View.OnClickListener(this) { // from class: umn
            public final /* synthetic */ umw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    this.a.C().onBackPressed();
                    return;
                }
                umw umwVar = this.a;
                umwVar.d.setVisibility(0);
                umwVar.e.setVisibility(0);
                umwVar.ae.setVisibility(8);
                umwVar.c.setVisibility(8);
                umwVar.n();
            }
        });
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.requestFocus();
        if (TextUtils.isEmpty(this.aj)) {
            toolbar.setVisibility(8);
        } else {
            toolbar.x(this.aj);
            toolbar.setContentDescription(this.aj);
            if (!this.ak) {
                toolbar.q(nz.b(toolbar.getContext(), R.drawable.quantum_gm_ic_arrow_back_gm_grey_24));
                toolbar.p(O(R.string.accessibility_parent_tools_toolbar_back));
                toolbar.r(new View.OnClickListener(this) { // from class: umn
                    public final /* synthetic */ umw a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (i == 0) {
                            this.a.C().onBackPressed();
                            return;
                        }
                        umw umwVar = this.a;
                        umwVar.d.setVisibility(0);
                        umwVar.e.setVisibility(0);
                        umwVar.ae.setVisibility(8);
                        umwVar.c.setVisibility(8);
                        umwVar.n();
                    }
                });
            } else {
                toolbar.q(null);
            }
        }
        n();
        return inflate;
    }

    public final void n() {
        Uri parse = Uri.parse(this.af);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!queryParameterNames.contains("host_name")) {
            buildUpon.appendQueryParameter("host_name", this.ag);
        }
        if (!queryParameterNames.contains("host_version")) {
            buildUpon.appendQueryParameter("host_version", this.ah);
        }
        if (!queryParameterNames.contains("profile_id") && !TextUtils.isEmpty(this.ai)) {
            buildUpon.appendQueryParameter("profile_id", this.ai);
        }
        if (!queryParameterNames.contains("feature")) {
            buildUpon.appendQueryParameter("feature", "parent_tools");
        }
        buildUpon.appendQueryParameter("return_url", this.b);
        buildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        buildUpon.appendQueryParameter("override_hl", "");
        final String uri = buildUpon.build().toString();
        this.am = this.al.submit(new Runnable() { // from class: umr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Account account;
                final umw umwVar = umw.this;
                String str = uri;
                final int i = 0;
                try {
                    for (Account account2 : qde.m(umwVar.qR())) {
                        if (TextUtils.equals(account2.name, umwVar.a)) {
                            account = account2;
                            break;
                        }
                    }
                } catch (RemoteException | qnk | qnl e) {
                    Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e);
                }
                account = null;
                if (account != null) {
                    new umi(umwVar.C(), account, str, new ump(umwVar), new Runnable() { // from class: umq
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i == 0) {
                                ums umsVar = (ums) umwVar.C();
                                if (umsVar != null) {
                                    umsVar.d(3, "");
                                    return;
                                }
                                return;
                            }
                            umwVar.p();
                        }
                    }).run();
                    return;
                }
                ci C = umwVar.C();
                if (C != 0) {
                    ((ums) C).d(2, "");
                    final int i2 = 1;
                    C.runOnUiThread(new Runnable() { // from class: umq
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i2 == 0) {
                                ums umsVar = (ums) umwVar.C();
                                if (umsVar != null) {
                                    umsVar.d(3, "");
                                    return;
                                }
                                return;
                            }
                            umwVar.p();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(ParentToolsResult parentToolsResult, int i) {
        ums umsVar = (ums) C();
        if (umsVar != null) {
            umsVar.c(parentToolsResult, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        umx c = ParentToolsResult.c();
        c.b(2);
        o(c.a(), 3);
    }
}
