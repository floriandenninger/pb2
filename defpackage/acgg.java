package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgg extends achb implements View.OnClickListener {
    public aahd a;
    private Button ae;
    private apxf af;
    public ajjz b;
    public apmg c;
    private aqdt d;
    private Button e;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.lc_cool_off_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.body);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        Button button = (Button) inflate.findViewById(R.id.learn_more_button);
        this.e = button;
        button.setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.ok_button);
        this.ae = button2;
        button2.setOnClickListener(this);
        aqdt aqdtVar = this.d;
        if (aqdtVar != null) {
            aqyg aqygVar = aqdtVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
            textView2.setText(ajcq.b((aqyg) this.d.g.get(0)));
            ajjz ajjzVar = this.b;
            avgg avggVar = this.d.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            aqyg aqygVar2 = (aqyg) this.d.g.get(1);
            apxf apxfVar = ((aqyi) aqygVar2.c.get(0)).m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.af = apxfVar;
            this.e.setText(ajcq.b(aqygVar2));
            Button button3 = this.e;
            aqyh aqyhVar = aqygVar2.f;
            if (aqyhVar == null) {
                aqyhVar = aqyh.a;
            }
            aots aotsVar = aqyhVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            button3.setContentDescription(aotsVar.c);
            apmh apmhVar = this.d.h;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            this.c = apmgVar;
            Button button4 = this.ae;
            aqyg aqygVar3 = apmgVar.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            button4.setText(ajcq.b(aqygVar3));
            Button button5 = this.ae;
            aott aottVar = this.c.s;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar2 = aottVar.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            button5.setContentDescription(aotsVar2.c);
        }
        return inflate;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.d = (aqdt) aonm.parseFrom(aqdt.a, byteArray, aomw.b());
            } catch (aoob e) {
                throw new IllegalArgumentException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        return o(viewGroup, layoutInflater);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmg apmgVar;
        apxf apxfVar;
        if (view == this.e && (apxfVar = this.af) != null) {
            this.a.a(apxfVar);
        }
        if (view != this.ae || (apmgVar = this.c) == null) {
            return;
        }
        aahd aahdVar = this.a;
        apxf apxfVar2 = apmgVar.p;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar.a(apxfVar2);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View o = o(viewGroup, C().getLayoutInflater());
            viewGroup.removeAllViews();
            viewGroup.addView(o);
        }
    }
}
