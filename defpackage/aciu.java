package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aciu extends achj implements View.OnClickListener {
    public ajjs a;
    private aqyg ae;
    private atfw af;
    private apxf ag;
    private View ah;
    private View ai;
    private View aj;
    private Button ak;
    private TextView al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private RecyclerView ap;
    private ajkj aq;
    public acra b;
    public acis c;
    public aahd d;
    private String e;

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.b;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        this.e = bundle2.getString("ARG_ERROR_MESSAGE", "");
        if (bundle2.containsKey("ARG_ERROR_MESSAGE_FORMATTED_STRING")) {
            this.ae = (aqyg) amkq.ck(bundle2, "ARG_ERROR_MESSAGE_FORMATTED_STRING", aqyg.a, aomw.b());
        }
        if (bundle2.containsKey("ARG_ENDSCREEN_RENDERER")) {
            this.af = (atfw) amkq.ck(bundle2, "ARG_ENDSCREEN_RENDERER", atfw.a, aomw.b());
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ak, "translationY", qX().getDimensionPixelSize(R.dimen.lc_post_stream_next_button_translation), 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.start();
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(C());
        frameLayout.addView(q(viewGroup));
        return frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        acis acisVar;
        if (this.O == null || view != this.ak || (acisVar = this.c) == null) {
            return;
        }
        acisVar.S(this.ag);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (view instanceof ViewGroup) {
            new Bundle();
            ViewGroup viewGroup = (ViewGroup) view;
            View q = q(viewGroup);
            viewGroup.removeAllViews();
            viewGroup.addView(q);
        }
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(26108);
    }

    public final View q(ViewGroup viewGroup) {
        CharSequence charSequence;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        int aJ;
        View inflate = C().getLayoutInflater().inflate(R.layout.lc_post_stream_fragment, viewGroup, false);
        this.ah = inflate.findViewById(R.id.post_stream_spinner);
        this.ai = inflate.findViewById(R.id.content);
        this.aj = inflate.findViewById(R.id.stream_layout);
        this.al = (TextView) inflate.findViewById(R.id.stream_header_text);
        this.am = (TextView) inflate.findViewById(R.id.stream_title);
        this.an = (TextView) inflate.findViewById(R.id.stream_account_name);
        this.ap = (RecyclerView) inflate.findViewById(R.id.stream_stats_recycler_view);
        this.aq = new ajkj(this.a, (ImageView) inflate.findViewById(R.id.stream_thumbnail));
        Button button = (Button) inflate.findViewById(R.id.next_button);
        this.ak = button;
        button.setOnClickListener(this);
        this.ao = (TextView) inflate.findViewById(R.id.privacy_setting_notice);
        ci C = C();
        if (C != null) {
            this.ah.setVisibility(8);
            this.ai.setVisibility(0);
            aqyg aqygVar4 = this.ae;
            int i = 1;
            aqyg aqygVar5 = null;
            if (aqygVar4 != null) {
                charSequence = aahk.a(aqygVar4, this.d, false);
            } else if (TextUtils.isEmpty(this.e)) {
                atfw atfwVar = this.af;
                if (atfwVar == null || (atfwVar.b & 1) == 0) {
                    charSequence = null;
                } else {
                    aqyg aqygVar6 = atfwVar.c;
                    if (aqygVar6 == null) {
                        aqygVar6 = aqyg.a;
                    }
                    charSequence = ajcq.b(aqygVar6);
                }
            } else {
                charSequence = this.e;
            }
            if (charSequence != null) {
                this.al.setText(charSequence);
                if (this.ae != null) {
                    this.al.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (this.af != null) {
                this.aj.setVisibility(0);
                TextView textView = this.am;
                atfw atfwVar2 = this.af;
                if ((atfwVar2.b & 2) != 0) {
                    aqygVar = atfwVar2.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                TextView textView2 = this.an;
                atfw atfwVar3 = this.af;
                if ((atfwVar3.b & 4) != 0) {
                    aqygVar2 = atfwVar3.e;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                textView2.setText(ajcq.b(aqygVar2));
                TextView textView3 = this.am;
                Object[] objArr = new Object[1];
                atfw atfwVar4 = this.af;
                if ((atfwVar4.b & 2) != 0) {
                    aqygVar3 = atfwVar4.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                objArr[0] = ajcq.b(aqygVar3);
                textView3.setContentDescription(P(R.string.lc_title_cd, objArr));
                ajkj ajkjVar = this.aq;
                avgg avggVar = this.af.g;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajkjVar.k(avggVar);
                this.aq.i(ImageView.ScaleType.CENTER_CROP);
                this.ap.af(new GridLayoutManager(qX().getInteger(R.integer.lc_post_stream_stat_column_count), null));
                this.ap.ac(new acit(C, this.af.i));
                if (this.af.h.size() > 0 && (((apmh) this.af.h.get(0)).b & 1) != 0) {
                    apmg apmgVar = ((apmh) this.af.h.get(0)).c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    apxf apxfVar = apmgVar.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    this.ag = apxfVar;
                    Button button2 = this.ak;
                    if ((apmgVar.b & 256) != 0 && (aqygVar5 = apmgVar.i) == null) {
                        aqygVar5 = aqyg.a;
                    }
                    button2.setText(ajcq.b(aqygVar5));
                    Context qR = qR();
                    Button button3 = this.ak;
                    if (apmgVar.c == 1 && (aJ = anaf.aJ(((Integer) apmgVar.d).intValue())) != 0) {
                        i = aJ;
                    }
                    adyu.cm(qR, button3, i);
                }
                atfw atfwVar5 = this.af;
                if ((atfwVar5.b & 32) != 0) {
                    TextView textView4 = this.ao;
                    aqyg aqygVar7 = atfwVar5.j;
                    if (aqygVar7 == null) {
                        aqygVar7 = aqyg.a;
                    }
                    textView4.setText(ajcq.b(aqygVar7));
                    TextView textView5 = this.ao;
                    aqyg aqygVar8 = this.af.j;
                    if (aqygVar8 == null) {
                        aqygVar8 = aqyg.a;
                    }
                    textView5.setContentDescription(ajcq.b(aqygVar8));
                    this.ao.setVisibility(0);
                    if (qR().getResources().getConfiguration().orientation == 2 && !yjk.aa(qR())) {
                        this.al.setVisibility(8);
                    }
                }
            }
        }
        return inflate;
    }
}
