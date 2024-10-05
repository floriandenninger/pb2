package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wam extends waz implements DialogInterface, View.OnClickListener, wbg, wao, wds {
    static final String ae;
    private TextView aA;
    private TextView aB;
    private TextView aC;
    private TextView aD;
    private Context aE;
    public appn af;
    public wbf ag;
    public aaea ah;
    public ajdw ai;
    public wan aj;
    public aahd ak;
    public zaw al;
    public ajjs am;
    public wbc an;
    public aarr ao;
    public aahv ap;
    public wdt aq;
    public acra ar;
    public apxf as;
    public abdl at;
    private RelativeLayout au;
    private View av;
    private View aw;
    private View ax;
    private View ay;
    private TextView az;

    static {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(37);
        sb.append("channel_creation_renderers");
        sb.append(myPid);
        ae = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wam aL(byte[] bArr, int i, acra acraVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("source", i - 1);
        bundle.putByteArray("token", bArr);
        bundle.putInt("style", 0);
        bundle.putInt("account_icon", 0);
        bundle.putBoolean("hide_toast", false);
        bundle.putInt("ok_button_style", 0);
        wam wamVar = new wam();
        wamVar.af(bundle);
        wamVar.ar = acraVar;
        return wamVar;
    }

    private final void aO() {
        dismiss();
        this.aj.d();
        apxf apxfVar = this.as;
        if (apxfVar != null) {
            this.ak.a(apxfVar);
        }
    }

    private final void aP(atvp atvpVar, String str, Uri uri) {
        apph aF = aF();
        if (atvpVar != null) {
            aone aoneVar = aF.a;
            aoneVar.copyOnWrite();
            appk appkVar = (appk) aoneVar.instance;
            appk appkVar2 = appk.a;
            appkVar.g = atvpVar.d;
            appkVar.c |= 8;
        }
        if (str != null) {
            aone aoneVar2 = aF.a;
            aoneVar2.copyOnWrite();
            appk appkVar3 = (appk) aoneVar2.instance;
            appk appkVar4 = appk.a;
            appkVar3.c |= 32;
            appkVar3.i = str;
        }
        if (uri != null) {
            String uri2 = uri.toString();
            aone aoneVar3 = aF.a;
            aoneVar3.copyOnWrite();
            appk appkVar5 = (appk) aoneVar3.instance;
            appk appkVar6 = appk.a;
            uri2.getClass();
            appkVar5.c |= 16;
            appkVar5.h = uri2;
        }
        aaio c = ((aaih) this.ap.c()).c();
        c.k(aF);
        c.b().Q();
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        appn appnVar = this.af;
        if (appnVar == null) {
            int aE = anaf.aE(this.m.getInt("source"));
            if (aE == 0) {
                aE = 1;
            }
            byte[] byteArray = this.m.getByteArray("token");
            abdl abdlVar = this.at;
            boolean aK = aK();
            wak wakVar = new wak(this, bundle);
            aaun aaunVar = new aaun(abdlVar.f, abdlVar.a.c(), null, null, null);
            aaunVar.a = byteArray;
            aaunVar.c = aE;
            aaunVar.b = aK;
            new aaul(abdlVar, null, null, null).i(aaunVar, wakVar);
            return;
        }
        aH(appnVar, bundle);
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.ai.b(null);
    }

    public final apph aF() {
        String f = aalt.f(appk.b.a(), "channel_creation_form_status");
        appj appjVar = (appj) this.ap.c().f(f).g(appj.class).X();
        if (appjVar == null) {
            f.getClass();
            amkq.O(!f.isEmpty(), "key cannot be empty");
            aone createBuilder = appk.a.createBuilder();
            createBuilder.copyOnWrite();
            appk appkVar = (appk) createBuilder.instance;
            appkVar.c |= 1;
            appkVar.d = f;
            return new apph(createBuilder);
        }
        return new apph(appjVar.b.toBuilder());
    }

    @Override // defpackage.wao
    public final void aG(apxf apxfVar) {
        aaum b = this.at.b();
        b.a = ((ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apxfVar.pX(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint)).c;
        wbf wbfVar = this.ag;
        if (wbfVar != null) {
            b.b = wbfVar.e.getText().toString();
            b.c = wbfVar.f.getText().toString();
            if (!wbfVar.k) {
                if (!TextUtils.isEmpty(wbfVar.i.d)) {
                    b.u = wbfVar.i.d;
                }
                b.d = wbfVar.b.get(5);
                b.s = wbfVar.b.get(2) + 1;
                if (!wbfVar.j) {
                    b.t = wbfVar.b.get(1);
                }
            }
        }
        this.aj.c();
        this.at.d(b, new wal(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aH(appn appnVar, Bundle bundle) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        final apmg apmgVar;
        aqyg aqygVar4;
        aqyg aqygVar5;
        apmg apmgVar2;
        CharSequence charSequence;
        aqyg aqygVar6;
        if (ar()) {
            aJ(false);
            if (aK()) {
                if ((appnVar.b & 8) == 0) {
                    aO();
                    return;
                }
                aqrf aqrfVar = appnVar.e;
                if (aqrfVar == null) {
                    aqrfVar = aqrf.a;
                }
                ajok ajokVar = new ajok();
                acra acraVar = this.ar;
                if (acraVar != null) {
                    ajokVar.a(acraVar);
                }
                this.ai.oB(ajokVar, ajds.a(aqrfVar));
                this.au.addView(this.ai.a());
                return;
            }
            int i = appnVar.b;
            aqyg aqygVar7 = null;
            aqyg aqygVar8 = null;
            if ((i & 1) == 0) {
                if ((i & 2) == 0) {
                    aO();
                    return;
                }
                final aqdt aqdtVar = appnVar.d;
                if (aqdtVar == null) {
                    aqdtVar = aqdt.a;
                }
                TextView textView = this.az;
                if ((aqdtVar.b & 1) != 0) {
                    aqygVar = aqdtVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                TextView textView2 = this.aC;
                if ((aqdtVar.b & 2097152) != 0) {
                    aqygVar2 = aqdtVar.p;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                textView2.setText(ajcq.b(aqygVar2));
                this.aC.setOnClickListener(new View.OnClickListener() { // from class: waj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        wam wamVar = wam.this;
                        aqdt aqdtVar2 = aqdtVar;
                        if ((aqdtVar2.b & 33554432) != 0) {
                            aahd aahdVar = wamVar.ak;
                            apxf apxfVar = aqdtVar2.t;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.a(apxfVar);
                        }
                        wamVar.aj.mG();
                        wamVar.dismiss();
                    }
                });
                if ((aqdtVar.b & 4194304) != 0) {
                    aqygVar3 = aqdtVar.q;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                if (!TextUtils.isEmpty(ajcq.b(aqygVar3))) {
                    this.aD.setVisibility(0);
                    TextView textView3 = this.aD;
                    if ((aqdtVar.b & 4194304) != 0 && (aqygVar7 = aqdtVar.q) == null) {
                        aqygVar7 = aqyg.a;
                    }
                    textView3.setText(ajcq.b(aqygVar7));
                }
                this.aA.setText(ahbl.p(aqdtVar, this.ak));
                return;
            }
            appm appmVar = appnVar.c;
            if (appmVar == null) {
                appmVar = appm.a;
            }
            aaui aauiVar = new aaui(appmVar);
            if (aauiVar.a.e.size() <= 0 || (((apmh) aauiVar.a.e.get(0)).b & 1) == 0) {
                apmgVar = null;
            } else {
                apmgVar = ((apmh) aauiVar.a.e.get(0)).c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            apmgVar.getClass();
            TextView textView4 = this.az;
            appm appmVar2 = aauiVar.a;
            if ((appmVar2.b & 1) != 0) {
                aqygVar4 = appmVar2.c;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            textView4.setText(ajcq.b(aqygVar4));
            TextView textView5 = this.aC;
            if ((apmgVar.b & 256) != 0) {
                aqygVar5 = apmgVar.i;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
            } else {
                aqygVar5 = null;
            }
            textView5.setText(ajcq.b(aqygVar5));
            this.aC.setOnClickListener(new View.OnClickListener() { // from class: wai
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wam wamVar = wam.this;
                    apmg apmgVar3 = apmgVar;
                    wbf wbfVar = wamVar.ag;
                    boolean z = false;
                    if (wbfVar == null || (wbfVar.d() && (wbfVar.k || wbfVar.c()))) {
                        wamVar.aJ(true);
                        if ((apmgVar3.b & 8192) != 0) {
                            aahd aahdVar = wamVar.ak;
                            apxf apxfVar = apmgVar3.n;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.a(apxfVar);
                            z = true;
                        }
                        if ((apmgVar3.b & 16384) == 0) {
                            if (z) {
                                return;
                            }
                            wamVar.dismiss();
                            return;
                        } else {
                            aahd aahdVar2 = wamVar.ak;
                            apxf apxfVar2 = apmgVar3.o;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar2.a(apxfVar2);
                            return;
                        }
                    }
                    wbf wbfVar2 = wamVar.ag;
                    CharSequence charSequence2 = (wbfVar2.k || wbfVar2.d() || wbfVar2.c()) ? !wbfVar2.d() ? wbfVar2.m : wbfVar2.n : wbfVar2.l;
                    if (!TextUtils.isEmpty(charSequence2)) {
                        wbfVar2.d.setText(charSequence2);
                        wbfVar2.d.setVisibility(0);
                    }
                    if (TextUtils.isEmpty(wbfVar2.g.getText())) {
                        EditText editText = wbfVar2.g;
                        editText.setError(editText.getHint());
                    }
                    if (TextUtils.isEmpty(wbfVar2.f.getText())) {
                        EditText editText2 = wbfVar2.f;
                        editText2.setError(editText2.getHint());
                    }
                    if (TextUtils.isEmpty(wbfVar2.e.getText())) {
                        EditText editText3 = wbfVar2.e;
                        editText3.setError(editText3.getHint());
                    }
                }
            });
            if (aauiVar.a.e.size() <= 1 || (((apmh) aauiVar.a.e.get(1)).b & 1) == 0) {
                apmgVar2 = null;
            } else {
                apmgVar2 = ((apmh) aauiVar.a.e.get(1)).c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
            }
            TextView textView6 = this.aD;
            if (apmgVar2 != null) {
                if ((apmgVar2.b & 256) != 0) {
                    aqygVar6 = apmgVar2.i;
                    if (aqygVar6 == null) {
                        aqygVar6 = aqyg.a;
                    }
                } else {
                    aqygVar6 = null;
                }
                charSequence = ajcq.b(aqygVar6);
            } else {
                charSequence = "";
            }
            textView6.setText(charSequence);
            if (apmgVar2 != null) {
                this.aD.setVisibility(0);
            }
            if (aauiVar.b() != null) {
                appr b = aauiVar.b();
                this.ax.setVisibility(0);
                ajkj ajkjVar = new ajkj(this.am, (ImageView) this.ax.findViewById(R.id.profile_picture));
                avgg avggVar = b.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajkjVar.k(avggVar);
                TextView textView7 = (TextView) this.ax.findViewById(R.id.profile_description);
                aqyg aqygVar9 = b.e;
                if (aqygVar9 == null) {
                    aqygVar9 = aqyg.a;
                }
                textView7.setText(ajcq.b(aqygVar9));
                TextView textView8 = (TextView) this.ax.findViewById(R.id.profile_name);
                aqyg aqygVar10 = b.d;
                if (aqygVar10 == null) {
                    aqygVar10 = aqyg.a;
                }
                textView8.setText(ajcq.b(aqygVar10));
                TextView textView9 = this.aA;
                if ((b.b & 8) != 0 && (aqygVar8 = b.f) == null) {
                    aqygVar8 = aqyg.a;
                }
                textView9.setText(aahk.a(aqygVar8, this.ak, false));
                return;
            }
            this.ay.setVisibility(0);
            wbc wbcVar = this.an;
            this.ag = new wbf(wbcVar.a, wbcVar.b, wbcVar.c, this.ay, this.aA, this.aB);
            if (aauiVar.a() == null) {
                wbf wbfVar = this.ag;
                if (aauiVar.b == null) {
                    appl applVar = aauiVar.a.d;
                    if (applVar == null) {
                        applVar = appl.a;
                    }
                    if ((applVar.b & 4) != 0) {
                        appl applVar2 = aauiVar.a.d;
                        if (applVar2 == null) {
                            applVar2 = appl.a;
                        }
                        appp apppVar = applVar2.e;
                        if (apppVar == null) {
                            apppVar = appp.a;
                        }
                        aauiVar.b = new aauh(apppVar);
                    }
                }
                wbfVar.a(aauiVar.b, bundle);
                return;
            }
            final wbf wbfVar2 = this.ag;
            final aauj a = aauiVar.a();
            wbfVar2.a(a, bundle);
            wbfVar2.k = false;
            wbfVar2.c.setVisibility(0);
            wbfVar2.j = a.l();
            wbfVar2.g.setHint(a.j());
            wbfVar2.g.setOnClickListener(new View.OnClickListener() { // from class: wba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wbf wbfVar3 = wbf.this;
                    wbfVar3.a.j(a.j(), wbfVar3.b.get(1), wbfVar3.b.get(2), wbfVar3.b.get(5), wbfVar3.j);
                }
            });
            wbfVar2.h = a.l() ? new SimpleDateFormat("MMM d", Locale.getDefault()) : DateFormat.getDateInstance();
            if (bundle == null || bundle.getLong("birthday") == 0) {
                GregorianCalendar gregorianCalendar = wbfVar2.b;
                int i2 = 1940;
                if (!a.l() && a.k()) {
                    i2 = a.a.m;
                }
                gregorianCalendar.set(i2, (!a.k() ? 1 : a.a.l) - 1, !a.k() ? 1 : a.a.k);
                if (a.k()) {
                    wbfVar2.b();
                }
            } else {
                wbfVar2.b.setTimeInMillis(bundle.getLong("birthday"));
            }
            wax waxVar = wbfVar2.i;
            a.getClass();
            aqph i3 = a.i();
            i3.getClass();
            aony aonyVar = i3.c;
            amkq.E(!aonyVar.isEmpty());
            waxVar.b.setHint((a.i().b & 1) != 0 ? a.i().d : null);
            waxVar.a.addAll(aonyVar);
            if (bundle == null) {
                for (int i4 = 0; i4 < aonyVar.size(); i4++) {
                    aqpg aqpgVar = ((aqpe) aonyVar.get(i4)).c;
                    if (aqpgVar == null) {
                        aqpgVar = aqpg.a;
                    }
                    if (aqpgVar.h) {
                        waxVar.c.setSelection(i4 + 1);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.wbg
    public final void aI(int i, int i2, int i3) {
        wbf wbfVar = this.ag;
        if (wbfVar != null) {
            wbfVar.aI(i, i2, i3);
        }
    }

    public final void aJ(boolean z) {
        if (z) {
            this.av.setVisibility(0);
            RelativeLayout relativeLayout = this.au;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            View view = this.aw;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        this.av.setVisibility(8);
        RelativeLayout relativeLayout2 = this.au;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        View view2 = this.aw;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final boolean aK() {
        aoub aoubVar = this.ah.a().x;
        if (aoubVar == null) {
            aoubVar = aoub.a;
        }
        return aoubVar.b;
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        onCancel(null);
        dismiss();
    }

    @Override // defpackage.waz, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.aE = context;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        appn appnVar = this.af;
        if (appnVar != null) {
            bundle.putByteArray(ae, appnVar.toByteArray());
        }
        apxf apxfVar = this.as;
        if (apxfVar != null) {
            bundle.putByteArray("next_endpoint", apxfVar.toByteArray());
        }
        wbf wbfVar = this.ag;
        if (wbfVar == null || TextUtils.isEmpty(wbfVar.g.getText())) {
            return;
        }
        bundle.putLong("birthday", wbfVar.b.getTimeInMillis());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray(ae);
            if (byteArray != null) {
                this.af = (appn) this.ao.a(byteArray, appn.a);
            }
            byte[] byteArray2 = bundle.getByteArray("next_endpoint");
            if (byteArray2 != null) {
                try {
                    this.as = (apxf) aonm.parseFrom(apxf.a, byteArray2, aomw.b());
                } catch (aoob e) {
                    Log.e("ChannelCreation", "Failed to deserialize nextEndpoint command.", e);
                }
            }
        }
        if (!aK()) {
            Bundle bundle2 = this.m;
            o(1, bundle2 != null ? bundle2.getInt("style", 0) : 0);
        } else {
            o(0, R.style.ChannelCreation_FullScreen);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        this.aq.j(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (aK()) {
            View inflate = layoutInflater.inflate(R.layout.channel_creation_element_container, viewGroup, false);
            this.au = (RelativeLayout) inflate.findViewById(R.id.element_layout);
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
            toolbar.q(new zau(this.aE).b(toolbar.e(), wbs.W(this.aE, R.attr.ytIconActiveOther).orElse(0)));
            toolbar.r(this);
            toolbar.x(O(R.string.channel_creation_title2));
            this.av = inflate.findViewById(R.id.progress_bar);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.channel_creation_container, viewGroup, false);
        this.av = inflate2.findViewById(R.id.progress_bar);
        View findViewById = inflate2.findViewById(R.id.channel_creation_form);
        this.aw = findViewById;
        this.ax = findViewById.findViewById(R.id.channel_creation_with_google_plus);
        this.ay = this.aw.findViewById(R.id.channel_creation_no_identity);
        Bundle bundle2 = this.m;
        int i = bundle2 == null ? 0 : bundle2.getInt("account_icon", 0);
        if (i != 0) {
            ((ImageView) this.ay.findViewById(R.id.account_icon)).setImageResource(i);
        }
        this.az = (TextView) this.aw.findViewById(R.id.title);
        this.aA = (TextView) this.aw.findViewById(R.id.info);
        this.aB = (TextView) this.aw.findViewById(R.id.error_message);
        this.aC = (TextView) this.aw.findViewById(R.id.ok_button);
        Bundle bundle3 = this.m;
        int i2 = bundle3 != null ? bundle3.getInt("ok_button_style", 0) : 0;
        if (i2 != 0) {
            jm.s(this.aC, i2);
        }
        TextView textView = (TextView) this.aw.findViewById(R.id.cancel_button);
        this.aD = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: wah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wam.this.cancel();
            }
        });
        return inflate2;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.aj.mG();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cancel();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aj.h();
    }

    @Override // defpackage.wds
    public final /* synthetic */ void q(int i) {
        wcy.c(this, i);
    }

    @Override // defpackage.wds
    public final void r(int i, String str, Uri uri) {
        if (aK()) {
            if (i == 1) {
                aP(atvp.PHOTO_UPLOAD_STATUS_UPLOADING, null, null);
            } else if (i == 2) {
                aP(atvp.PHOTO_UPLOAD_STATUS_UNSPECIFIED, str, uri);
            } else {
                this.al.d(O(R.string.image_upload_error));
                aP(atvp.PHOTO_UPLOAD_STATUS_FAILED, null, null);
            }
        }
    }
}
