package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmj extends wlj implements wlc, wks, wku {
    public atuf a;
    public String ae;
    public String af;
    public wmi ag;
    public aahd ah;
    private ImageButton ai;
    private long aj;
    private String ak;
    public ContentLoadingProgressBar b;
    public Button c;
    public CodeInputView d;
    public arzs e = arzs.CODE_DELIVERY_METHOD_UNKNOWN;

    public static final boolean p(atuf atufVar) {
        if (atufVar == null) {
            return false;
        }
        int i = atufVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return false;
        }
        atug atugVar = atufVar.e;
        if (atugVar == null) {
            atugVar = atug.a;
        }
        atui atuiVar = atugVar.b;
        if (atuiVar == null) {
            atuiVar = atui.a;
        }
        if ((atuiVar.b & 2) == 0) {
            return false;
        }
        atuh atuhVar = atufVar.f;
        if (atuhVar == null) {
            atuhVar = atuh.a;
        }
        apmg apmgVar = atuhVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) == 0) {
            return false;
        }
        atuh atuhVar2 = atufVar.f;
        if (atuhVar2 == null) {
            atuhVar2 = atuh.a;
        }
        apmg apmgVar2 = atuhVar2.b;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        return (apmgVar2.b & 8192) != 0;
    }

    private final View q(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        aqyg aqygVar;
        if (bundle != null) {
            str = bundle.getString("SAVED_VERIFICATION_CODE", "");
        } else {
            atug atugVar = this.a.e;
            if (atugVar == null) {
                atugVar = atug.a;
            }
            atui atuiVar = atugVar.b;
            if (atuiVar == null) {
                atuiVar = atui.a;
            }
            str = atuiVar.c;
        }
        View inflate = layoutInflater.inflate(R.layout.verification_result_error_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.body);
        this.d = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        this.c = (Button) inflate.findViewById(R.id.resend_code_button);
        this.ai = (ImageButton) inflate.findViewById(R.id.close_button);
        this.b = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        atuf atufVar = this.a;
        aqyg aqygVar2 = null;
        if ((atufVar.b & 1) != 0) {
            aqygVar = atufVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        atuf atufVar2 = this.a;
        if ((atufVar2.b & 2) != 0 && (aqygVar2 = atufVar2.d) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        this.d.g(str);
        this.d.e(str.length() < 6 ? str.length() : 5);
        this.d.b = this;
        Button button = this.c;
        atuh atuhVar = this.a.f;
        if (atuhVar == null) {
            atuhVar = atuh.a;
        }
        apmg apmgVar = atuhVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        aqyg aqygVar3 = apmgVar.i;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        button.setText(ajcq.b(aqygVar3));
        this.c.setOnClickListener(new wmh(this, 1));
        ImageButton imageButton = this.ai;
        if (imageButton != null) {
            imageButton.setOnClickListener(new wmh(this, 0));
        }
        return inflate;
    }

    @Override // defpackage.wks
    public final void a() {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aQ();
        }
    }

    @Override // defpackage.wks
    public final void b(atut atutVar) {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aR(atutVar);
        }
    }

    @Override // defpackage.wks
    public final void c(atuo atuoVar, long j, String str) {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aS(atuoVar, j, str);
        }
    }

    @Override // defpackage.wku
    public final void d(atuq atuqVar) {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aT(atuqVar);
        }
    }

    @Override // defpackage.wku
    public final void e() {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aQ();
        }
    }

    @Override // defpackage.wku
    public final void g(atuf atufVar) {
        this.b.a();
        wmi wmiVar = this.ag;
        if (wmiVar != null) {
            wmiVar.aU(atufVar);
        }
    }

    @Override // defpackage.wlc
    public final void h(String str) {
        amkq.E(p(this.a));
        this.ah.getClass();
        this.ag.getClass();
        this.b.b();
        wkv wkvVar = new wkv(this, this.ah);
        Long valueOf = Long.valueOf(this.aj);
        String str2 = this.ak;
        apxf apxfVar = this.a.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        wkvVar.c(valueOf, str, str2, apxfVar);
        this.c.setEnabled(false);
        this.d.setEnabled(false);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.d.b());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        try {
            Bundle bundle2 = this.m;
            this.a = (atuf) amkq.cj(bundle2, "ARG_RENDERER", atuf.a, aomw.b());
            arzs b = arzs.b(bundle2.getInt("ARG_CODE_DELIVERY_METHOD"));
            this.e = b;
            if (b == null) {
                this.e = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            this.ae = bundle2.getString("ARG_COUNTRY_CODE");
            this.af = bundle2.getString("ARG_PHONE_NUMBER");
            this.aj = bundle2.getLong("ARG_IDV_REQUEST_ID");
            this.ak = bundle2.getString("ARG_PARAMS");
        } catch (aoob e) {
            String valueOf = String.valueOf(atuf.class.getName());
            throw new RuntimeException(valueOf.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf) : new String("Failed to parse a known parcelable proto "), e);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        this.a.getClass();
        amkq.E(this.e != arzs.CODE_DELIVERY_METHOD_UNKNOWN);
        this.ae.getClass();
        this.af.getClass();
        Context f = wcy.f(C());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(f);
        FrameLayout frameLayout = new FrameLayout(f);
        if (p(this.a)) {
            frameLayout.addView(q(frameLayout, bundle, cloneInContext));
        } else {
            zga.l("PhoneVerificationCodeInputErrorScreenRenderer invalid.");
            wmi wmiVar = this.ag;
            if (wmiVar != null) {
                wmiVar.aQ();
            }
        }
        return frameLayout;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci C = C();
        View view = this.O;
        if (C == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        Bundle bundle = new Bundle();
        LayoutInflater cloneInContext = ((LayoutInflater) C.getSystemService("layout_inflater")).cloneInContext(wcy.f(C));
        mQ(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View q = q(viewGroup, bundle, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(q);
    }
}
