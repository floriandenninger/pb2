package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfs extends ajpc implements wgi {
    private final Spanned A;
    private final View B;
    private final ImageView C;
    private final TextView D;
    public final Context a;
    public final Resources b;
    public final wed c;
    public final Handler d;
    public final ImageView e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public int j;
    public boolean k;
    private AccountIdentity l;
    private final ajyf m;
    private final aahd n;
    private final afsy o;
    private final wdm p;
    private final ajjz q;
    private final weh r;
    private final TextView s;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final TextView x;
    private final CheckBox y;
    private final Spanned z;

    public wfs(Context context, final wgj wgjVar, afsy afsyVar, wdm wdmVar, ajjz ajjzVar, weh wehVar, Activity activity, ajyg ajygVar, aahd aahdVar, Handler handler, wed wedVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = wedVar;
        this.l = (AccountIdentity) afsyVar.c();
        this.d = handler;
        this.o = afsyVar;
        this.p = wdmVar;
        this.q = ajjzVar;
        this.r = wehVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_password_auth_layout, viewGroup, false);
        this.f = inflate;
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.reauth_opt_out);
        this.y = checkBox;
        checkBox.setOnCheckedChangeListener(new wfq(wedVar, 0));
        inflate.findViewById(R.id.close_button).setOnClickListener(new wel(wedVar, 5));
        this.s = (TextView) inflate.findViewById(R.id.title);
        this.t = (TextView) inflate.findViewById(R.id.description);
        this.u = (TextView) inflate.findViewById(R.id.other_methods_field);
        this.g = (TextView) inflate.findViewById(R.id.password_title);
        TextView textView = (TextView) inflate.findViewById(R.id.password_field);
        this.h = textView;
        this.v = (TextView) inflate.findViewById(R.id.account_email_field);
        this.x = (TextView) inflate.findViewById(R.id.forgot_password_field);
        this.B = inflate.findViewById(R.id.account_container);
        this.C = (ImageView) inflate.findViewById(R.id.account_thumbnail);
        this.D = (TextView) inflate.findViewById(R.id.email);
        this.e = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.i = (TextView) inflate.findViewById(R.id.error_message_field);
        ajyf a = ajygVar.a((TextView) inflate.findViewById(R.id.confirm_button));
        this.m = a;
        a.c = new ajyc() { // from class: wfn
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                wfs.this.f(wgjVar);
            }
        };
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wfl
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                wfs wfsVar = wfs.this;
                wgj wgjVar2 = wgjVar;
                if (i != 6) {
                    return false;
                }
                wfsVar.f(wgjVar2);
                return true;
            }
        });
        this.n = aahdVar;
        this.z = o(R.string.other_methods_suffix);
        this.A = o(R.string.use_fingerprint_suffix);
    }

    private final Spanned o(int i) {
        String string = this.b.getString(i);
        String string2 = this.b.getString(R.string.password_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new wfr(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final void p() {
        this.g.setTextColor(wbs.W(this.a, R.attr.ytThemedBlue).orElse(0));
        this.h.setText("");
        whu.I(this.i, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        p();
        whu.I(this.i, false);
        this.j = 0;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        n((PasswordAuthRendererOuterClass$PasswordAuthRenderer) obj);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((PasswordAuthRendererOuterClass$PasswordAuthRenderer) obj).i.I();
    }

    public final void f(wgj wgjVar) {
        String charSequence = this.h.getText().toString();
        if (charSequence.length() > 0) {
            wgjVar.a(charSequence, this.l, this);
        }
    }

    @Override // defpackage.wgi
    public final void g() {
        this.c.j(2);
    }

    @Override // defpackage.wgi
    public final void h() {
        this.d.post(new Runnable() { // from class: wfo
            @Override // java.lang.Runnable
            public final void run() {
                wfs wfsVar = wfs.this;
                if (!wfsVar.k || wfsVar.j > 0) {
                    wfsVar.g.setTextColor(wbs.W(wfsVar.a, R.attr.ytBrandRed).orElse(0));
                    wfsVar.h.setText("");
                    whu.G(wfsVar.i, wfsVar.b.getString(R.string.retry_password));
                    if (wfsVar.k) {
                        wfsVar.j--;
                        return;
                    }
                    return;
                }
                wfsVar.c.j(2);
            }
        });
    }

    @Override // defpackage.wgi
    public final void j() {
    }

    @Override // defpackage.wgi
    public final void k() {
        this.c.j(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        weh wehVar = this.r;
        int aV = anaf.aV(passwordAuthRendererOuterClass$PasswordAuthRenderer.m);
        if (aV == 0) {
            aV = 1;
        }
        anhy a = wehVar.a(aV);
        if (a != null) {
            ynm.k(a, angq.a, lra.i, new ynl() { // from class: wfm
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    final wfs wfsVar = wfs.this;
                    final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer2 = passwordAuthRendererOuterClass$PasswordAuthRenderer;
                    final AccountIdentity accountIdentity = (AccountIdentity) obj;
                    wfsVar.d.post(new Runnable() { // from class: wfp
                        @Override // java.lang.Runnable
                        public final void run() {
                            wfs.this.m(passwordAuthRendererOuterClass$PasswordAuthRenderer2, accountIdentity);
                        }
                    });
                }
            });
        } else {
            m(passwordAuthRendererOuterClass$PasswordAuthRenderer, null);
        }
    }

    public final void m(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer, AccountIdentity accountIdentity) {
        AccountIdentity accountIdentity2;
        aqyg aqygVar;
        aqyg aqygVar2;
        SpannableStringBuilder spannableStringBuilder;
        aqyg aqygVar3;
        aova aovaVar;
        String str;
        aami aamiVar;
        if (accountIdentity != null) {
            accountIdentity2 = accountIdentity;
        } else if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0) {
            apud apudVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.k;
            if (apudVar == null) {
                apudVar = apud.b;
            }
            accountIdentity2 = AccountIdentity.m(apudVar);
        } else {
            accountIdentity2 = (AccountIdentity) this.o.c();
        }
        this.l = accountIdentity2;
        wdk b = this.p.b(accountIdentity2);
        if (b == null) {
            b = wdk.a;
        }
        TextView textView = this.s;
        avgg avggVar = null;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 1) != 0) {
            aqygVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        CheckBox checkBox = this.y;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 128) != 0) {
            aqygVar2 = passwordAuthRendererOuterClass$PasswordAuthRenderer.j;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(checkBox, aahk.a(aqygVar2, this.n, false));
        TextView textView2 = this.t;
        aony<aqyg> aonyVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.d;
        if (aonyVar.isEmpty()) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (aqyg aqygVar4 : aonyVar) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) aahk.a(aqygVar4, this.n, true));
                z = false;
            }
        }
        whu.G(textView2, spannableStringBuilder);
        TextView textView3 = this.x;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 8) != 0) {
            aqygVar3 = passwordAuthRendererOuterClass$PasswordAuthRenderer.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, aahk.a(aqygVar3, this.n, false));
        this.j = passwordAuthRendererOuterClass$PasswordAuthRenderer.e - 1;
        this.k = (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 2) != 0;
        aqyg aqygVar5 = passwordAuthRendererOuterClass$PasswordAuthRenderer.h;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        aong aongVar = (aong) apmg.a.createBuilder();
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        aqygVar5.getClass();
        apmgVar.i = aqygVar5;
        apmgVar.b |= 256;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.d = 2;
        apmgVar2.c = 1;
        this.m.b((apmg) aongVar.build(), null);
        p();
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 512) != 0) {
            aulq aulqVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aovaVar = (aova) aulqVar.pX(AccountsListRenderer.accountItemRenderer);
        } else {
            aovaVar = null;
        }
        if (aovaVar != null) {
            aqyg aqygVar6 = aovaVar.d;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            str = ajcq.b(aqygVar6).toString();
        } else {
            str = b.b;
        }
        this.v.setText(str);
        avgg e = ((accountIdentity == null && (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) == 0) || (aamiVar = b.e) == null || !aamiVar.f()) ? null : b.e.e();
        if (e != null) {
            avggVar = e;
        } else if (aovaVar != null && (avggVar = aovaVar.f) == null) {
            avggVar = avgg.a;
        }
        if (avggVar != null) {
            this.q.h(this.C, avggVar);
            this.D.setText(str);
            whu.I(this.B, true);
            whu.I(this.v, false);
        }
        if (this.c.l()) {
            whu.G(this.u, passwordAuthRendererOuterClass$PasswordAuthRenderer.f ? this.z : this.A);
        } else if (accountIdentity != null || (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0 || avggVar != null) {
            whu.I(this.u, false);
        } else {
            whu.G(this.u, this.b.getString(R.string.use_password_only));
        }
    }
}
