package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjp extends yji implements akdd, ydl {
    private ajkj aA;
    public Activity ae;
    public aahd af;
    public afsy ag;
    public ajjs ah;
    public aben ai;
    public zaw aj;
    public aftn ak;
    public ajut al;
    public ypa am;
    public acqz an;
    public ydn ao;
    public apxf ap;
    public LoadingFrameLayout aq;
    public yju ar;
    public boolean as;
    private ygy at;
    private LoadingFrameLayout au;
    private AlertDialog av;
    private TextView aw;
    private TextView ax;
    private TextView ay;
    private TextView az;

    public static awhq aH(asgc asgcVar) {
        asfp asfpVar = asgcVar.c;
        if (asfpVar == null) {
            asfpVar = asfp.a;
        }
        if (asfpVar.b != 65500215) {
            return null;
        }
        asfp asfpVar2 = asgcVar.c;
        if (asfpVar2 == null) {
            asfpVar2 = asfp.a;
        }
        if (asfpVar2.b == 65500215) {
            return (awhq) asfpVar2.c;
        }
        return awhq.a;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.am.d(new yjj());
    }

    @Override // defpackage.ydl
    public final void a() {
    }

    public final void aI() {
        this.aq.a();
        this.aq.c();
        apxf apxfVar = this.ap;
        if (apxfVar == null || !apxfVar.pY(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint)) {
            zga.b("Invalid navigation endpoint provided.");
            dismiss();
            return;
        }
        aben abenVar = this.ai;
        abek abekVar = new abek(abenVar.f, abenVar.c.c(), null, null, null);
        YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint = (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint) this.ap.pX(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint);
        ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.getClass();
        abekVar.a = abek.i(ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.b);
        apxf apxfVar2 = this.ap;
        if ((apxfVar2.b & 1) == 0) {
            abekVar.k();
        } else {
            abekVar.l(apxfVar2.c);
        }
        aben abenVar2 = this.ai;
        abenVar2.h.e(abekVar, new yjn(this));
    }

    public final void aJ(boolean z) {
        this.as = z;
        yju yjuVar = this.ar;
        if (!z) {
            yjuVar.b();
        }
        yjuVar.o = z;
        if (z) {
            this.au.c();
        } else {
            this.au.a();
        }
    }

    public final void aK(CharSequence charSequence) {
        if (this.at == null) {
            this.at = new ygy(this.ae, this.aj);
        }
        this.at.a(charSequence);
    }

    @Override // defpackage.ydl
    public final void b() {
        aJ(false);
    }

    @Override // defpackage.ydl
    public final void c(CharSequence charSequence) {
        aJ(false);
        aK(charSequence);
    }

    @Override // defpackage.ydl
    public final void d(abeh abehVar) {
        String str;
        awhn a = this.ar.a();
        if ((a.b & 128) == 0 || !a.pY(awho.d)) {
            return;
        }
        if ((a.b & 128) != 0) {
            awhi awhiVar = a.j;
            if (awhiVar == null) {
                awhiVar = awhi.a;
            }
            if ((awhiVar.b & 1) != 0) {
                awhi awhiVar2 = a.j;
                if (awhiVar2 == null) {
                    awhiVar2 = awhi.a;
                }
                str = awhiVar2.c;
                abehVar.s = abeh.i(str);
                abehVar.t = abeh.i((String) a.pX(awho.d));
            }
        }
        str = "";
        abehVar.s = abeh.i(str);
        abehVar.t = abeh.i((String) a.pX(awho.d));
    }

    @Override // defpackage.ydl
    public final void e(asfw asfwVar) {
        awhd awhdVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        if ((asfwVar.b & 16) != 0) {
            this.an.mM().D(new acqx(asfwVar.g.I()));
        }
        aJ(false);
        asfo asfoVar = asfwVar.d;
        if (asfoVar == null) {
            asfoVar = asfo.a;
        }
        aqyg aqygVar5 = null;
        if (asfoVar.b == 65097874) {
            asfo asfoVar2 = asfwVar.d;
            if (asfoVar2 == null) {
                asfoVar2 = asfo.a;
            }
            if (asfoVar2.b == 65097874) {
                awhdVar = (awhd) asfoVar2.c;
            } else {
                awhdVar = awhd.a;
            }
        } else {
            awhdVar = null;
        }
        if (awhdVar != null) {
            awhe awheVar = awhdVar.c;
            if (awheVar == null) {
                awheVar = awhe.a;
            }
            if ((awheVar.b & 1) != 0) {
                awgy awgyVar = awheVar.c;
                if (awgyVar == null) {
                    awgyVar = awgy.a;
                }
                if (this.av == null) {
                    View inflate = View.inflate(this.ae, R.layout.ypc_post_tip_text_screen, null);
                    this.aA = new ajkj(this.ah, (ImageView) inflate.findViewById(R.id.viewer_thumbnail));
                    this.aw = (TextView) inflate.findViewById(R.id.thank_you_message_header);
                    this.ax = (TextView) inflate.findViewById(R.id.thank_you_message);
                    this.ay = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
                    this.az = (TextView) inflate.findViewById(R.id.confirmation_msg);
                    AlertDialog.Builder cancelable = new AlertDialog.Builder(this.ae).setCancelable(false);
                    if ((awgyVar.b & 32) != 0) {
                        aqygVar4 = awgyVar.h;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                    } else {
                        aqygVar4 = null;
                    }
                    this.av = cancelable.setPositiveButton(ajcq.b(aqygVar4), new yjo(this)).setView(inflate).create();
                }
                if (awgyVar != null) {
                    avgg avggVar = awgyVar.e;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    if (ahbw.L(avggVar)) {
                        ajkj ajkjVar = this.aA;
                        avgg avggVar2 = awgyVar.e;
                        if (avggVar2 == null) {
                            avggVar2 = avgg.a;
                        }
                        ajkjVar.k(avggVar2);
                    }
                    TextView textView = this.aw;
                    if ((awgyVar.b & 1) != 0) {
                        aqygVar = awgyVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView.setText(ajcq.b(aqygVar));
                    TextView textView2 = this.ax;
                    if ((awgyVar.b & 2) != 0) {
                        aqygVar2 = awgyVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    textView2.setText(ajcq.b(aqygVar2));
                    TextView textView3 = this.ay;
                    if ((awgyVar.b & 8) != 0) {
                        aqygVar3 = awgyVar.f;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                    } else {
                        aqygVar3 = null;
                    }
                    textView3.setText(ajcq.b(aqygVar3));
                    TextView textView4 = this.az;
                    if ((awgyVar.b & 16) != 0 && (aqygVar5 = awgyVar.g) == null) {
                        aqygVar5 = aqyg.a;
                    }
                    textView4.setText(ajcq.b(aqygVar5));
                    this.av.show();
                }
            } else {
                awgz awgzVar = awheVar.d;
                if (awgzVar == null) {
                    awgzVar = awgz.a;
                }
                if ((awgzVar.b & 1) != 0) {
                    aahd aahdVar = this.af;
                    awgz awgzVar2 = awheVar.d;
                    if (awgzVar2 == null) {
                        awgzVar2 = awgz.a;
                    }
                    apxf apxfVar = awgzVar2.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                }
            }
            aqyg aqygVar6 = awhdVar.b;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar6);
            if (!TextUtils.isEmpty(b)) {
                this.aj.d(b.toString());
            }
        }
        dismiss();
    }

    @Override // defpackage.ydl
    public final void f() {
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, R.style.Theme_YouTube_YpcTipJar);
        this.am.d(new yjk());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        if (!this.ag.t()) {
            this.d.hide();
            this.ak.c(this.ae, null, new yjm(this));
        } else {
            aI();
        }
        this.an.mM().d(acsb.b(8197), this.ap, null);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        if (this.ap == null) {
            if (bundle == null) {
                bundle = this.m;
            }
            this.ap = aahg.b(bundle.getByteArray("navigation_endpoint"));
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.ypc_tip_jar_dialog, (ViewGroup) null);
        this.aq = loadingFrameLayout;
        loadingFrameLayout.f(this);
        Activity activity = this.ae;
        this.ar = new yju(activity, this.ah, this.al, (InputMethodManager) activity.getSystemService("input_method"), this.aq.findViewById(R.id.ypc_tip_screen));
        LoadingFrameLayout loadingFrameLayout2 = (LoadingFrameLayout) this.aq.findViewById(R.id.next);
        this.au = loadingFrameLayout2;
        loadingFrameLayout2.setOnClickListener(new yjl(this));
        this.ao.j = this;
        return this.aq;
    }

    @Override // defpackage.akdd
    public final void qJ() {
        aI();
    }
}
