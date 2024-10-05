package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wlq extends wlf implements wlc, wku {
    public CodeInputView a;
    private atuo ae;
    private long af;
    private String ag;
    public wlp b;
    public aahd c;
    private ImageButton d;
    private ContentLoadingProgressBar e;

    private final View o(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        aqyg aqygVar;
        String string = bundle != null ? bundle.getString("SAVED_VERIFICATION_CODE", "") : "";
        atuo atuoVar = this.ae;
        if ((atuoVar.b & 2) != 0) {
            aqygVar = atuoVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        View inflate = layoutInflater.inflate(R.layout.verification_code_entry_fragment, viewGroup, false);
        this.a = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.e = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        textView.setText(b);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.back_arrow_button);
        this.d = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: wln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wlq wlqVar = wlq.this;
                if (wlqVar.b != null) {
                    wlqVar.a.c();
                    wlqVar.b.a();
                }
            }
        });
        this.a.g(string);
        CodeInputView codeInputView = this.a;
        codeInputView.b = this;
        codeInputView.e(string.length() < 6 ? string.length() : 5);
        this.a.post(new Runnable() { // from class: wlo
            @Override // java.lang.Runnable
            public final void run() {
                wlq.this.a.h();
            }
        });
        return inflate;
    }

    @Override // defpackage.wku
    public final void d(atuq atuqVar) {
        this.e.a();
        wlp wlpVar = this.b;
        if (wlpVar != null) {
            wlpVar.c(atuqVar);
        }
    }

    @Override // defpackage.wku
    public final void e() {
        this.e.a();
        wlp wlpVar = this.b;
        if (wlpVar != null) {
            wlpVar.b();
        }
    }

    @Override // defpackage.wku
    public final void g(atuf atufVar) {
        this.e.a();
        wlp wlpVar = this.b;
        if (wlpVar != null) {
            wlpVar.d(atufVar);
        }
    }

    @Override // defpackage.wlc
    public final void h(String str) {
        apxf apxfVar;
        this.e.b();
        this.a.setEnabled(false);
        wkv wkvVar = new wkv(this, this.c);
        Long valueOf = Long.valueOf(this.af);
        String str2 = this.ag;
        atuo atuoVar = this.ae;
        if (atuoVar.c == 3) {
            apxfVar = (apxf) atuoVar.d;
        } else {
            apxfVar = apxf.a;
        }
        wkvVar.c(valueOf, str, str2, apxfVar);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.a.b());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        this.af = bundle2.getLong("ARG_IDV_REQUEST_ID");
        this.ag = bundle2.getString("ARG_PARAMS");
        byte[] byteArray = bundle2.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.ae = (atuo) aonm.parseFrom(atuo.a, byteArray, aomw.b());
            } catch (aoob e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        Context f = wcy.f(C());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(f);
        FrameLayout frameLayout = new FrameLayout(f);
        atuo atuoVar = this.ae;
        if (atuoVar == null || (atuoVar.b & 2) == 0 || atuoVar.c != 3) {
            zga.l("PhoneVerificationCodeInputScreenRenderer invalid.");
            wlp wlpVar = this.b;
            if (wlpVar != null) {
                wlpVar.b();
            }
        } else {
            frameLayout.addView(o(frameLayout, bundle, cloneInContext));
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
        LayoutInflater cloneInContext = ((LayoutInflater) C.getSystemService("layout_inflater")).cloneInContext(wcy.f(C));
        Bundle bundle = new Bundle();
        mQ(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View o = o(viewGroup, bundle, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(o);
    }
}
