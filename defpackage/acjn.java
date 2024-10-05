package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjn extends achl implements View.OnClickListener {
    public aahd a;
    private ImageButton ae;
    private Button af;
    private Button ag;
    private apmg ah;
    private apmg ai;
    private apxf aj;
    public acfh b;
    public ajjz c;
    public acjm d;
    private aqdt e;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.lc_safeguard_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.heading);
        TextView textView3 = (TextView) inflate.findViewById(R.id.bullet1);
        TextView textView4 = (TextView) inflate.findViewById(R.id.bullet2);
        TextView textView5 = (TextView) inflate.findViewById(R.id.bullet3);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.safeguard_image);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.close_button);
        this.ae = imageButton;
        imageButton.setOnClickListener(this);
        Button button = (Button) inflate.findViewById(R.id.learn_more_button);
        this.ag = button;
        button.setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.get_started_button);
        this.af = button2;
        button2.setOnClickListener(this);
        aqdt aqdtVar = this.e;
        if (aqdtVar != null) {
            aqyg aqygVar = aqdtVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
            aqyg aqygVar2 = this.e.m;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
            ajjz ajjzVar = this.c;
            avgg avggVar = this.e.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            int size = this.e.g.size();
            if (size > 0) {
                SpannableString spannableString = new SpannableString(ajcq.b((aqyg) this.e.g.get(0)));
                spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView3.setText(spannableString);
            }
            if (size > 1) {
                SpannableString spannableString2 = new SpannableString(ajcq.b((aqyg) this.e.g.get(1)));
                spannableString2.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView4.setText(spannableString2);
            }
            if (size > 2) {
                SpannableString spannableString3 = new SpannableString(ajcq.b((aqyg) this.e.g.get(2)));
                spannableString3.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView5.setText(spannableString3);
            }
            if (size > 3) {
                aqyg aqygVar3 = (aqyg) this.e.g.get(3);
                if (aqygVar3.c.size() > 0) {
                    apxf apxfVar = ((aqyi) aqygVar3.c.get(0)).m;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    this.aj = apxfVar;
                    this.ag.setText(ajcq.b(aqygVar3));
                    Button button3 = this.ag;
                    aqyh aqyhVar = aqygVar3.f;
                    if (aqyhVar == null) {
                        aqyhVar = aqyh.a;
                    }
                    aots aotsVar = aqyhVar.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    button3.setContentDescription(aotsVar.c);
                }
            }
            apmh apmhVar = this.e.i;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            this.ah = apmgVar;
            acfh acfhVar = this.b;
            arfs arfsVar = apmgVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            this.ae.setImageDrawable(aii.a(qR(), acfhVar.a(b)));
            ImageButton imageButton2 = this.ae;
            aott aottVar = this.ah.s;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar2 = aottVar.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            imageButton2.setContentDescription(aotsVar2.c);
            apmh apmhVar2 = this.e.h;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            this.ai = apmgVar2;
            Button button4 = this.af;
            aqyg aqygVar4 = apmgVar2.i;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            button4.setText(ajcq.b(aqygVar4));
            Button button5 = this.af;
            aott aottVar2 = this.ai.s;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar3 = aottVar2.c;
            if (aotsVar3 == null) {
                aotsVar3 = aots.a;
            }
            button5.setContentDescription(aotsVar3.c);
        }
        return inflate;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.e = (aqdt) aonm.parseFrom(aqdt.a, byteArray, aomw.b());
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
        if (view == this.ag) {
            this.a.a(this.aj);
        } else if (view == this.ae) {
            this.d.A();
        } else if (view == this.af) {
            this.d.H();
        }
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
