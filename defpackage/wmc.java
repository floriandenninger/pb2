package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmc extends wlh {
    public atvc a;
    public wmb b;
    public zim c;
    public ajrv d;

    public static final boolean o(atvc atvcVar) {
        if (atvcVar == null) {
            return false;
        }
        atva atvaVar = atvcVar.e;
        if (atvaVar == null) {
            atvaVar = atva.a;
        }
        apmg apmgVar = atvaVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) == 0) {
            return false;
        }
        atva atvaVar2 = atvcVar.e;
        if (atvaVar2 == null) {
            atvaVar2 = atva.a;
        }
        apmg apmgVar2 = atvaVar2.b;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        apxf apxfVar = apmgVar2.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        atur aturVar = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) apxfVar.pX(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint)).b;
        if (aturVar == null) {
            aturVar = atur.a;
        }
        return (aturVar.b & 1) != 0;
    }

    private final View p(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        aqyg aqygVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.verification_intro_fragment, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.body);
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.consent);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.back_arrow_button);
        Button button = (Button) viewGroup2.findViewById(R.id.get_started_button);
        Button button2 = (Button) viewGroup2.findViewById(R.id.learn_more_button);
        atva atvaVar = this.a.e;
        if (atvaVar == null) {
            atvaVar = atva.a;
        }
        apmg apmgVar = atvaVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) != 0) {
            atva atvaVar2 = this.a.e;
            if (atvaVar2 == null) {
                atvaVar2 = atva.a;
            }
            apmg apmgVar2 = atvaVar2.b;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqygVar = apmgVar2.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        button.setText(ajcq.b(aqygVar).toString().toUpperCase(Locale.getDefault()));
        atvc atvcVar = this.a;
        if ((atvcVar.b & 2) != 0) {
            aqyg aqygVar2 = atvcVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar2));
        }
        atvc atvcVar2 = this.a;
        if ((atvcVar2.b & 4) != 0) {
            aqyg aqygVar3 = atvcVar2.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar3));
        }
        atvc atvcVar3 = this.a;
        if ((atvcVar3.b & 128) == 0) {
            textView3.setVisibility(8);
        } else {
            aqyg aqygVar4 = atvcVar3.i;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            textView3.setText(ajcq.c(aqygVar4, this.d));
        }
        atva atvaVar3 = this.a.f;
        if (atvaVar3 == null) {
            atvaVar3 = atva.a;
        }
        apmg apmgVar3 = atvaVar3.b;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        if ((apmgVar3.b & 256) != 0) {
            atva atvaVar4 = this.a.f;
            if (atvaVar4 == null) {
                atvaVar4 = atva.a;
            }
            apmg apmgVar4 = atvaVar4.b;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            if ((apmgVar4.b & 16384) != 0) {
                atva atvaVar5 = this.a.f;
                if (atvaVar5 == null) {
                    atvaVar5 = atva.a;
                }
                apmg apmgVar5 = atvaVar5.b;
                if (apmgVar5 == null) {
                    apmgVar5 = apmg.a;
                }
                aqyg aqygVar5 = apmgVar5.i;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
                button2.setText(ajcq.b(aqygVar5).toString().toUpperCase(Locale.getDefault()));
                button2.setOnClickListener(new wlz(this, apmgVar5));
            }
        }
        imageButton.setOnClickListener(new wma(this, 1));
        button.setOnClickListener(new wma(this, 0));
        return viewGroup2;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_RENDERER")) {
            try {
                this.a = (atvc) amkq.cj(bundle2, "ARG_RENDERER", atvc.a, aomw.b());
            } catch (aoob e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.c.a);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        if (o(this.a)) {
            frameLayout.addView(p(frameLayout, cloneInContext));
        } else {
            zga.l("PhoneVerificationIntroRenderer invalid.");
            wmb wmbVar = this.b;
            if (wmbVar != null) {
                wmbVar.aJ();
            }
        }
        return frameLayout;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context qR = qR();
        View view = this.O;
        if (qR == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View p = p(viewGroup, LayoutInflater.from(new ContextThemeWrapper(qR, this.c.a)));
        viewGroup.removeAllViews();
        viewGroup.addView(p);
    }
}
