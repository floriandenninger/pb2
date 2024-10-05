package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ExpandableSurveyRenderer;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqb extends ajpc implements ggr, gmf, ajof, ypd {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final TextView D;
    private final ImageView E;
    private final LinearLayout F;
    private final LinearLayout G;
    private final ajjz H;
    private final ajos I;

    /* renamed from: J, reason: collision with root package name */
    private final HatsContainer f240J;
    private final LinearLayout K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private Object Q;
    private ajoi R;
    private ajom S;
    private ajom T;
    private ajom U;
    private TextView V;
    private ChipCloudView W;
    private apxf X;
    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand Y;
    private int Z;
    public final aahd a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private mqa[] ad;
    private final ajom ae;
    private gof af;
    private final jgp ah;
    public final ajut b;
    public final LinearLayout c;
    public final ypa d;
    public final Context e;
    public final int f;
    public apxf g;
    public arih i;
    public View j;
    public final RelativeLayout k;
    public Button l;
    public Button m;
    public LinearLayout n;
    public LinearLayout o;
    public LinearLayout p;
    public TextView q;
    public Spanned t;
    final View v;
    private acra x;
    private final View y;
    private final gma z;
    private int ag = 1;
    public CharSequence r = "";
    public int s = -1;
    public List u = null;
    public final Map h = new HashMap();

    public mqb(Context context, aahd aahdVar, gma gmaVar, ypa ypaVar, ajut ajutVar, jgp jgpVar, akht akhtVar, ajjz ajjzVar, ajos ajosVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = context;
        this.a = aahdVar;
        this.z = gmaVar;
        this.d = ypaVar;
        this.b = ajutVar;
        this.ah = jgpVar;
        this.H = ajjzVar;
        this.I = ajosVar;
        this.ae = akhtVar.f(false);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_between_button_margin);
        this.M = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_first_primary_button_start_margin);
        this.N = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_button_min_width);
        this.f = wbs.W(context, R.attr.ytCallToAction).orElse(0);
        this.O = wbs.W(context, R.attr.ytBorderedButtonChipBackground).orElse(0);
        this.P = wbs.W(context, R.attr.ytBrandBackgroundSolid).orElse(0);
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.inline_survey_layout, (ViewGroup) null);
        this.y = inflate;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.video_layout);
        this.G = linearLayout;
        this.c = (LinearLayout) inflate.findViewById(R.id.full_size_video_layout);
        this.v = from.inflate(R.layout.in_card_video_layout, (ViewGroup) linearLayout, false);
        this.A = (ImageView) inflate.findViewById(R.id.icon);
        this.B = (TextView) inflate.findViewById(R.id.title);
        this.C = (TextView) inflate.findViewById(R.id.subtitle);
        this.D = (TextView) inflate.findViewById(R.id.tap_suppressed_message);
        this.E = (ImageView) inflate.findViewById(R.id.close_button);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.survey_responses);
        this.F = linearLayout2;
        this.f240J = (HatsContainer) LayoutInflater.from(context).inflate(R.layout.hats_survey_container, (ViewGroup) linearLayout2, false);
        this.K = (LinearLayout) from.inflate(R.layout.inline_survey_buttons, (ViewGroup) linearLayout2, false);
        this.k = (RelativeLayout) inflate.findViewById(R.id.survey_layout);
        gmaVar.c(inflate);
        inflate.setBackground(new fyl(wbs.W(context, R.attr.yt10PercentLayer).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static boolean p(arih arihVar) {
        int bb = aobq.bb(arihVar.n);
        return bb != 0 && bb == 4;
    }

    public static boolean q(arih arihVar) {
        int bb = aobq.bb(arihVar.n);
        return bb != 0 && bb == 2;
    }

    private static String r(aqyg aqygVar) {
        if (aqygVar == null) {
            return null;
        }
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        if ((aqyhVar.b & 1) == 0) {
            return null;
        }
        aqyh aqyhVar2 = aqygVar.f;
        if (aqyhVar2 == null) {
            aqyhVar2 = aqyh.a;
        }
        aots aotsVar = aqyhVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    private final void s(byte[] bArr) {
        acra acraVar = this.x;
        if (acraVar == null || bArr == null) {
            return;
        }
        acraVar.D(new acqx(bArr));
    }

    private final void t(byte[] bArr) {
        acra acraVar = this.x;
        if (acraVar == null || bArr == null) {
            return;
        }
        acraVar.u(new acqx(bArr), null);
    }

    private final void u(View view) {
        view.setBackground(new RippleDrawable(wbs.S(this.e, R.attr.colorControlHighlight), view.getBackground(), null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.z.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajoi ajoiVar = this.R;
        if (ajoiVar != null) {
            ajoiVar.c();
        }
        ajom ajomVar = this.S;
        if (ajomVar != null) {
            ahbw.u(ajomVar, ajosVar);
            this.S = null;
        }
        ajom ajomVar2 = this.T;
        if (ajomVar2 != null) {
            ahbw.u(ajomVar2, ajosVar);
            this.T = null;
        }
        ajom ajomVar3 = this.U;
        if (ajomVar3 != null) {
            ahbw.u(ajomVar3, ajosVar);
            this.U = null;
        }
        this.ae.b(ajosVar);
        this.d.m(this);
        this.af = null;
        this.Q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        int i;
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        int aJ;
        apxf apxfVar;
        aqyg aqygVar3;
        aqyg aqygVar4;
        arih arihVar = (arih) obj;
        this.Q = arihVar;
        this.x = ajokVar.a;
        this.h.put("com.google.android.libraries.youtube.innertube.endpoint.tag", arihVar);
        Iterator it = arihVar.l.iterator();
        while (it.hasNext()) {
            this.a.c((apxf) it.next(), this.h);
        }
        TextView textView = this.B;
        aqyg aqygVar5 = arihVar.f;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar5));
        TextView textView2 = this.B;
        aqyg aqygVar6 = arihVar.f;
        if (aqygVar6 == null) {
            aqygVar6 = aqyg.a;
        }
        textView2.setContentDescription(r(aqygVar6));
        TextView textView3 = this.C;
        aqyg aqygVar7 = arihVar.g;
        if (aqygVar7 == null) {
            aqygVar7 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar7));
        TextView textView4 = this.C;
        aqyg aqygVar8 = arihVar.g;
        if (aqygVar8 == null) {
            aqygVar8 = aqyg.a;
        }
        textView4.setContentDescription(r(aqygVar8));
        final int i2 = 1;
        final int i3 = 0;
        if ((arihVar.b & 1) == 0) {
            this.A.setVisibility(8);
        } else {
            ImageView imageView = this.A;
            ajut ajutVar = this.b;
            arfs arfsVar = arihVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
            this.A.setVisibility(0);
        }
        if ((arihVar.b & 2) != 0) {
            ImageView imageView2 = this.E;
            ajut ajutVar2 = this.b;
            arfs arfsVar2 = arihVar.d;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar2.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            imageView2.setImageResource(ajutVar2.a(b2));
        }
        if ((arihVar.b & 4) != 0) {
            apxf apxfVar2 = arihVar.e;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            this.g = apxfVar2;
            this.E.setVisibility(0);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: mps
                public final /* synthetic */ mqb a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i2 != 0) {
                        this.a.k();
                        return;
                    }
                    mqb mqbVar = this.a;
                    mqbVar.s = -1;
                    mqbVar.a.c(mqbVar.g, mqbVar.h);
                    mqbVar.d.d(new ajvf(mqbVar.i));
                }
            });
        } else {
            this.E.setVisibility(8);
            this.E.setOnClickListener(null);
        }
        this.i = arihVar;
        this.G.removeAllViews();
        if (this.c.getChildCount() > 1) {
            this.c.removeViews(1, r2.getChildCount() - 1);
        }
        this.aa = false;
        this.ab = false;
        this.ac = false;
        whu.I(this.G, false);
        whu.I(this.c, false);
        if ((arihVar.b & 128) != 0) {
            i = aobq.aV(arihVar.i);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.ag = i;
        if ((arihVar.b & 64) != 0) {
            arig arigVar = arihVar.h;
            if (arigVar == null) {
                arigVar = arig.a;
            }
            int i4 = arigVar.b;
            if (i4 == 125014205) {
                arif arifVar = (arif) arigVar.c;
                t(arifVar.g.I());
                this.aa = true;
                ImageView imageView3 = (ImageView) this.v.findViewById(R.id.thumbnail);
                TextView textView5 = (TextView) this.v.findViewById(R.id.video_title);
                TextView textView6 = (TextView) this.v.findViewById(R.id.video_details);
                ajoi ajoiVar = new ajoi(this.a, this.v, this);
                this.R = ajoiVar;
                acra acraVar = ajokVar.a;
                if ((arifVar.b & 8) != 0) {
                    apxfVar = arifVar.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = null;
                }
                ajoiVar.a(acraVar, apxfVar, ajokVar.e());
                this.G.addView(this.v);
                whu.I(this.G, true);
                ajjz ajjzVar = this.H;
                avgg avggVar = arifVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajjzVar.h(imageView3, avggVar);
                if ((arifVar.b & 2) != 0) {
                    aqygVar3 = arifVar.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                whu.G(textView5, ajcq.b(aqygVar3));
                if ((arifVar.b & 4) != 0) {
                    aqygVar4 = arifVar.e;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                } else {
                    aqygVar4 = null;
                }
                whu.G(textView6, ajcq.b(aqygVar4));
            } else if (i4 == 50630979) {
                aqdb aqdbVar = (aqdb) arigVar.c;
                t(aqdbVar.y.I());
                this.aa = true;
                if (this.S == null) {
                    ammv s = ahbw.s(this.I, aqdbVar, this.G);
                    if (s.h()) {
                        this.S = (ajom) s.c();
                    }
                }
                ajokVar.getClass();
                ajokVar.f("yt_click_intercept_tag", this);
                this.S.oB(ajokVar, aqdbVar);
                this.G.addView(this.S.a());
                whu.I(this.G, true);
            } else if (i4 == 60373625) {
                ardf ardfVar = (ardf) arigVar.c;
                s(ardfVar.z.I());
                t(ardfVar.z.I());
                this.ab = true;
                if (this.T == null) {
                    ammv s2 = ahbw.s(this.I, ardfVar, this.G);
                    if (s2.h()) {
                        this.T = (ajom) s2.c();
                    }
                }
                this.T.oB(ajokVar, ardfVar);
                this.c.addView(this.T.a());
                whu.I(this.c, true);
                this.d.g(this);
            } else if (i4 == 89018663) {
                awal awalVar = (awal) arigVar.c;
                s(awalVar.q.I());
                t(awalVar.q.I());
                this.ab = true;
                if (this.U == null) {
                    ammv s3 = ahbw.s(this.I, awalVar, this.G);
                    if (s3.h()) {
                        this.U = (ajom) s3.c();
                    }
                }
                this.U.oB(ajokVar, awalVar);
                this.c.addView(this.U.a());
                whu.I(this.c, true);
                this.d.g(this);
            } else if (i4 == 83537025) {
                this.ac = true;
                whu.I(this.c, true);
                this.af = evr.bp(arihVar);
                this.c.addView(((mpq) this.ae).b);
                this.ae.oB(ajokVar, this.af);
                this.d.g(this);
            }
        }
        int aU = aobq.aU(arihVar.k);
        if (aU == 0) {
            aU = 1;
        }
        if (aU == 3) {
            this.y.findViewById(R.id.bottom_divider).setVisibility(0);
            this.k.setBackgroundColor(this.O);
            this.F.setBackgroundColor(this.O);
            this.B.setTextColor(this.f);
            this.C.setTextColor(this.f);
            if (this.A.getDrawable() != null) {
                this.A.getDrawable().mutate().setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
            }
            if (this.E.getDrawable() != null) {
                this.E.getDrawable().mutate().setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
            }
            if (this.aa) {
                LinearLayout linearLayout = (LinearLayout) this.y.findViewById(R.id.video_info_view);
                if (linearLayout != null) {
                    linearLayout.setPadding(0, 0, 0, 0);
                    linearLayout.setBackgroundColor(wbs.W(this.e, R.attr.ytBrandBackgroundSolid).orElse(0));
                    yny.z(linearLayout.findViewById(R.id.thumbnail_layout), yny.h(yny.v(0), yny.k(0)), ViewGroup.MarginLayoutParams.class);
                }
                yny.z(this.G, yny.r(this.e.getResources().getDimensionPixelOffset(R.dimen.start_end_padding)), ViewGroup.MarginLayoutParams.class);
            } else if (this.ab) {
                this.y.findViewById(R.id.bottom_divider).setVisibility(8);
                this.c.setBackgroundColor(this.P);
            } else if (this.ac) {
                this.y.findViewById(R.id.bottom_divider).setVisibility(8);
            }
        } else {
            this.y.findViewById(R.id.bottom_divider).setVisibility(8);
        }
        whu.I(this.k, true);
        arii ariiVar = arihVar.j;
        if (ariiVar == null) {
            ariiVar = arii.a;
        }
        this.F.removeAllViews();
        whu.I(this.F, true);
        if (ariiVar != null && ariiVar.b == 116011845) {
            aony aonyVar = ((arie) ariiVar.c).b;
            this.K.removeAllViews();
            int i5 = 0;
            while (i5 < aonyVar.size()) {
                frg d = this.ah.d(null, this.h);
                if ((((apmh) aonyVar.get(i5)).b & 1) != 0) {
                    apmgVar = ((apmh) aonyVar.get(i5)).c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                } else {
                    apmgVar = null;
                }
                d.oB(ajokVar, apmgVar);
                TextView textView7 = d.b;
                textView7.setMinimumWidth(this.N);
                this.K.addView(textView7);
                textView7.setTextAlignment(4);
                if (i5 == 0) {
                    apmg apmgVar2 = ((apmh) aonyVar.get(0)).c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    if (apmgVar2.c == 1 && (aJ = anaf.aJ(((Integer) apmgVar2.d).intValue())) != 0 && aJ == 3) {
                        int i6 = this.M;
                        if (textView7 != null && (textView7.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                            ((ViewGroup.MarginLayoutParams) textView7.getLayoutParams()).setMarginStart(i6);
                            textView7.requestLayout();
                        }
                    }
                    i5 = 0;
                }
                int i7 = this.L;
                if (textView7 != null && (textView7.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) textView7.getLayoutParams()).setMarginEnd(i7);
                    textView7.requestLayout();
                }
                i5++;
            }
            this.F.addView(this.K);
            this.F.setVisibility(0);
            return;
        }
        if (ariiVar != null && ariiVar.b == 171694596) {
            aony<avcj> aonyVar2 = ((arid) ariiVar.c).b;
            HatsHorizontalSurvey b3 = this.f240J.a().b();
            b3.f(null, null);
            b3.d(null);
            ArrayList arrayList = new ArrayList(aonyVar2.size());
            for (avcj avcjVar : aonyVar2) {
                final avch avchVar = avcjVar.b == 84469192 ? (avch) avcjVar.c : null;
                if (avchVar != null) {
                    View d2 = gfw.d(this.e, null, false);
                    gfw.g(d2, avchVar, this.b, new View.OnClickListener() { // from class: mpw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            mqb mqbVar = mqb.this;
                            avch avchVar2 = avchVar;
                            aahd aahdVar = mqbVar.a;
                            apxf apxfVar3 = avchVar2.e;
                            if (apxfVar3 == null) {
                                apxfVar3 = apxf.a;
                            }
                            aahdVar.c(apxfVar3, mqbVar.h);
                        }
                    });
                    arrayList.add(d2);
                }
            }
            b3.e(arrayList);
            b3.b(gfw.f(aonyVar2));
            b3.a(gfw.e(aonyVar2));
            this.f240J.f(b3);
            HatsContainer hatsContainer = this.f240J;
            hatsContainer.g = false;
            hatsContainer.c();
            this.f240J.setPadding(0, 0, 0, 0);
            whu.I(this.f240J, true);
            this.F.addView(this.f240J);
            this.F.setVisibility(0);
            return;
        }
        if (ariiVar == null || ariiVar.b != 195864971) {
            whu.I(this.F, false);
            View view = this.y;
            view.getClass();
            view.post(new hgc(view, 5));
            return;
        }
        aqve aqveVar = (aqve) ariiVar.c;
        t(aqveVar.e.I());
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: mps
            public final /* synthetic */ mqb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i3 != 0) {
                    this.a.k();
                    return;
                }
                mqb mqbVar = this.a;
                mqbVar.s = -1;
                mqbVar.a.c(mqbVar.g, mqbVar.h);
                mqbVar.d.d(new ajvf(mqbVar.i));
            }
        });
        LayoutInflater from = LayoutInflater.from(this.e);
        if (q(this.i)) {
            aqygVar = null;
            this.j = from.inflate(R.layout.expandable_survey_replace_with_follow_up_layout, (ViewGroup) null);
        } else {
            aqygVar = null;
            this.j = from.inflate(R.layout.expandable_survey_layout, (ViewGroup) null);
        }
        this.q = (TextView) this.j.findViewById(R.id.rating_description);
        this.V = (TextView) this.j.findViewById(R.id.follow_up_text);
        this.n = (LinearLayout) this.j.findViewById(R.id.star_container);
        LinearLayout linearLayout2 = (LinearLayout) this.j.findViewById(R.id.follow_up_container);
        this.o = linearLayout2;
        this.p = (LinearLayout) linearLayout2.findViewById(R.id.rating_selection);
        Button button = (Button) this.j.findViewById(R.id.btn_not_sure_undo);
        this.l = button;
        u(button);
        Button button2 = (Button) this.j.findViewById(R.id.btn_submit);
        this.m = button2;
        u(button2);
        ChipCloudView chipCloudView = (ChipCloudView) this.j.findViewById(R.id.follow_up_cloud);
        this.W = chipCloudView;
        chipCloudView.b(this.e.getResources().getInteger(R.integer.inline_survey_max_follow_up_question_rows));
        aulq aulqVar = aqveVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqvg aqvgVar = (aqvg) aulqVar.pX(ExpandableSurveyRenderer.ratingSurveyRenderer);
        t(aqvgVar.c.I());
        this.ad = new mqa[aqvgVar.b.size()];
        this.Z = this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_star_padding);
        for (int i8 = 0; i8 < aqvgVar.b.size(); i8++) {
            if (((aulq) aqvgVar.b.get(i8)).pY(ExpandableSurveyRenderer.ratingSurveyOptionRenderer)) {
                final aqvf aqvfVar = (aqvf) ((aulq) aqvgVar.b.get(i8)).pX(ExpandableSurveyRenderer.ratingSurveyOptionRenderer);
                t(aqvfVar.h.I());
                aqyg aqygVar9 = aqvfVar.c;
                if (aqygVar9 == null) {
                    aqygVar9 = aqyg.a;
                }
                final Spanned b4 = ajcq.b(aqygVar9);
                final ImageView imageView4 = new ImageView(this.e);
                int i9 = this.Z;
                imageView4.setPadding(i9, i9, i9, i9);
                imageView4.setContentDescription(b4);
                u(imageView4);
                final int i10 = i8 + 1;
                imageView4.setOnTouchListener(new View.OnTouchListener() { // from class: mpy
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        mqb mqbVar = mqb.this;
                        int i11 = i10;
                        CharSequence charSequence = b4;
                        ImageView imageView5 = imageView4;
                        if (motionEvent.getAction() == 0) {
                            mqbVar.o(i11);
                            mqbVar.q.setText(charSequence);
                        } else if (motionEvent.getAction() == 3) {
                            mqbVar.o(mqbVar.s);
                            mqbVar.q.setText(mqbVar.r);
                        } else {
                            if (motionEvent.getAction() != 1) {
                                return false;
                            }
                            imageView5.performClick();
                            return false;
                        }
                        return true;
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: mpv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        apxf apxfVar3;
                        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
                        mqb mqbVar = mqb.this;
                        aqvf aqvfVar2 = aqvfVar;
                        int i11 = i10;
                        CharSequence charSequence = b4;
                        mqbVar.m(aqvfVar2.h.I());
                        if ((aqvfVar2.b & 16) != 0) {
                            apxf apxfVar4 = aqvfVar2.g;
                            if (apxfVar4 == null) {
                                apxfVar4 = apxf.a;
                            }
                            apxfVar3 = apxfVar4;
                        } else {
                            apxfVar3 = null;
                        }
                        apxf apxfVar5 = aqvfVar2.f;
                        if (apxfVar5 == null) {
                            apxfVar5 = apxf.a;
                        }
                        if (apxfVar5.pY(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand)) {
                            apxf apxfVar6 = aqvfVar2.f;
                            if (apxfVar6 == null) {
                                apxfVar6 = apxf.a;
                            }
                            addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand) apxfVar6.pX(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand);
                        } else {
                            addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = null;
                        }
                        mqbVar.n(false, i11, charSequence, apxfVar3, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, aqvfVar2);
                        if (mqb.q(mqbVar.i)) {
                            whu.I(mqbVar.k, false);
                            whu.I(mqbVar.n, false);
                            whu.I(mqbVar.m, true);
                            LinearLayout linearLayout3 = (LinearLayout) mqbVar.j.findViewById(R.id.mini_star_container);
                            for (int i12 = 0; i12 < i11; i12++) {
                                ImageView imageView5 = new ImageView(mqbVar.e);
                                ajut ajutVar3 = mqbVar.b;
                                arfs arfsVar3 = aqvfVar2.d;
                                if (arfsVar3 == null) {
                                    arfsVar3 = arfs.a;
                                }
                                arfr b5 = arfr.b(arfsVar3.c);
                                if (b5 == null) {
                                    b5 = arfr.UNKNOWN;
                                }
                                int a = ajutVar3.a(b5);
                                ajut ajutVar4 = mqbVar.b;
                                arfs arfsVar4 = aqvfVar2.e;
                                if (arfsVar4 == null) {
                                    arfsVar4 = arfs.a;
                                }
                                arfr b6 = arfr.b(arfsVar4.c);
                                if (b6 == null) {
                                    b6 = arfr.UNKNOWN;
                                }
                                mqa mqaVar = new mqa(mqbVar, imageView5, a, ajutVar4.a(b6));
                                mqaVar.c();
                                mqaVar.a();
                                linearLayout3.addView(imageView5, mqbVar.e.getResources().getDimensionPixelSize(R.dimen.mini_star_icon_height_width_dp), mqbVar.e.getResources().getDimensionPixelSize(R.dimen.mini_star_icon_height_width_dp));
                            }
                            whu.I(linearLayout3, true);
                        }
                    }
                });
                this.n.addView(imageView4);
                mqa[] mqaVarArr = this.ad;
                ajut ajutVar3 = this.b;
                arfs arfsVar3 = aqvfVar.d;
                if (arfsVar3 == null) {
                    arfsVar3 = arfs.a;
                }
                arfr b5 = arfr.b(arfsVar3.c);
                if (b5 == null) {
                    b5 = arfr.UNKNOWN;
                }
                int a = ajutVar3.a(b5);
                ajut ajutVar4 = this.b;
                arfs arfsVar4 = aqvfVar.e;
                if (arfsVar4 == null) {
                    arfsVar4 = arfs.a;
                }
                arfr b6 = arfr.b(arfsVar4.c);
                if (b6 == null) {
                    b6 = arfr.UNKNOWN;
                }
                mqaVarArr[i8] = new mqa(this, imageView4, a, ajutVar4.a(b6));
                this.ad[i8].b();
            }
        }
        aulq aulqVar2 = aqveVar.c;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        final apmg apmgVar3 = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        if ((apmgVar3.b & 256) != 0) {
            aqygVar2 = apmgVar3.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = aqygVar;
        }
        Spanned b7 = ajcq.b(aqygVar2);
        this.t = b7;
        this.l.setText(b7);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: mpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
                mqb mqbVar = mqb.this;
                apmg apmgVar4 = apmgVar3;
                if (mqbVar.s != -1) {
                    mqbVar.s = -1;
                    mqbVar.o(-1);
                    mqbVar.n.setVisibility(0);
                    mqbVar.q.setPadding(0, 0, 0, 0);
                    mqbVar.l.setText(mqbVar.t);
                    mqbVar.o.setVisibility(8);
                    if (mqb.q(mqbVar.i)) {
                        whu.I(mqbVar.m, false);
                        whu.I(mqbVar.k, true);
                        LinearLayout linearLayout3 = (LinearLayout) mqbVar.j.findViewById(R.id.mini_star_container);
                        linearLayout3.removeAllViews();
                        whu.I(linearLayout3, false);
                        return;
                    }
                    if (mqb.p(mqbVar.i)) {
                        mqbVar.p.removeAllViews();
                        whu.I(mqbVar.p, false);
                        return;
                    }
                    return;
                }
                mqbVar.m(apmgVar4.t.I());
                Spanned spanned = mqbVar.t;
                apxf apxfVar3 = apmgVar4.n;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                apxf apxfVar4 = apxfVar3;
                apxf apxfVar5 = apmgVar4.p;
                if (apxfVar5 == null) {
                    apxfVar5 = apxf.a;
                }
                if (apxfVar5.pY(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand)) {
                    apxf apxfVar6 = apmgVar4.p;
                    if (apxfVar6 == null) {
                        apxfVar6 = apxf.a;
                    }
                    addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand) apxfVar6.pX(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand);
                } else {
                    addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = null;
                }
                mqbVar.n(false, 0, spanned, apxfVar4, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, null);
                if (mqb.q(mqbVar.i)) {
                    whu.I(mqbVar.k, false);
                    whu.I(mqbVar.m, true);
                }
            }
        });
        aulq aulqVar3 = aqveVar.d;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        final aong aongVar = (aong) ((apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer)).toBuilder();
        apmg apmgVar4 = (apmg) aongVar.instance;
        if ((apmgVar4.b & 256) != 0) {
            Button button3 = this.m;
            aqyg aqygVar10 = apmgVar4.i;
            if (aqygVar10 == null) {
                aqygVar10 = aqyg.a;
            }
            button3.setText(ajcq.b(aqygVar10));
        }
        this.m.setOnClickListener(new View.OnClickListener() { // from class: mpt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11;
                HashMap hashMap;
                mqb mqbVar = mqb.this;
                aong aongVar2 = aongVar;
                mqbVar.m(((apmg) aongVar2.instance).t.I());
                mqbVar.m.setEnabled(false);
                if (!mqbVar.u.isEmpty()) {
                    apxf apxfVar3 = (apxf) mqbVar.u.get(0);
                    if (!apxfVar3.pY(FeedbackEndpointOuterClass.feedbackEndpoint) || mqbVar.u.size() <= 1) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap();
                        ArrayList arrayList2 = new ArrayList(mqbVar.u.size() - 1);
                        for (int i12 = 1; i12 < mqbVar.u.size(); i12++) {
                            arrayList2.add(((aqwl) ((apxf) mqbVar.u.get(i12)).pX(FeedbackEndpointOuterClass.feedbackEndpoint)).e);
                        }
                        hashMap.put("feedback_merge_token", true);
                        hashMap.put("feedback_token", arrayList2);
                    }
                    mqbVar.a.c(apxfVar3, hashMap);
                }
                apxf apxfVar4 = ((apmg) aongVar2.instance).p;
                if (apxfVar4 == null) {
                    apxfVar4 = apxf.a;
                }
                ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apxfVar4.pX(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
                if (apxfVar4.pY(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)) {
                    aulz aulzVar = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                    if (aulzVar == null) {
                        aulzVar = aulz.a;
                    }
                    if ((aulzVar.b & 32) != 0 && (i11 = mqbVar.s) < 3 && i11 != 0) {
                        aulz aulzVar2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                        if (aulzVar2 == null) {
                            aulzVar2 = aulz.a;
                        }
                        arih arihVar2 = aulzVar2.h;
                        if (arihVar2 == null) {
                            arihVar2 = arih.a;
                        }
                        aone builder = arihVar2.toBuilder();
                        builder.copyOnWrite();
                        arih arihVar3 = (arih) builder.instance;
                        arihVar3.h = null;
                        arihVar3.b &= -65;
                        arih arihVar4 = (arih) builder.build();
                        aulz aulzVar3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                        if (aulzVar3 == null) {
                            aulzVar3 = aulz.a;
                        }
                        aone builder2 = aulzVar3.toBuilder();
                        builder2.copyOnWrite();
                        aulz aulzVar4 = (aulz) builder2.instance;
                        arihVar4.getClass();
                        aulzVar4.h = arihVar4;
                        aulzVar4.b |= 32;
                        aulz aulzVar5 = (aulz) builder2.build();
                        aone builder3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.toBuilder();
                        builder3.copyOnWrite();
                        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) builder3.instance;
                        aulzVar5.getClass();
                        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.c = aulzVar5;
                        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.b |= 1;
                        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction3 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) builder3.build();
                        aong aongVar3 = (aong) apxfVar4.toBuilder();
                        aongVar3.e(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction, replaceEnclosingActionOuterClass$ReplaceEnclosingAction3);
                        apxfVar4 = (apxf) aongVar3.build();
                    }
                }
                aongVar2.copyOnWrite();
                apmg apmgVar5 = (apmg) aongVar2.instance;
                apxfVar4.getClass();
                apmgVar5.p = apxfVar4;
                apmgVar5.b |= 32768;
                aahd aahdVar = mqbVar.a;
                apxf apxfVar5 = apmgVar5.p;
                if (apxfVar5 == null) {
                    apxfVar5 = apxf.a;
                }
                aahdVar.c(apxfVar5, mqbVar.h);
                mqbVar.s = -1;
            }
        });
        this.F.addView(this.j);
        this.F.setVisibility(0);
        int i11 = this.s;
        if (i11 != -1) {
            n(true, i11, this.r, this.X, this.Y, i11 == 0 ? aqygVar : (aqvf) ((aulq) aqvgVar.b.get(i11 - 1)).pX(ExpandableSurveyRenderer.ratingSurveyOptionRenderer));
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arih) obj).m.I();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ggr, ajom] */
    @Override // defpackage.ggr
    public final View g() {
        return this.ae.g();
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        int i = this.ag;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            k();
            return false;
        }
        this.D.setVisibility(0);
        TextView textView = this.D;
        textView.announceForAccessibility(textView.getText());
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ggr, ajom] */
    @Override // defpackage.ggr
    public final void i(boolean z) {
        this.ae.i(z);
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    public final void k() {
        apxf apxfVar = this.g;
        if (apxfVar != null) {
            this.a.c(apxfVar, this.h);
        }
        this.d.d(new ajvf(this.i));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{izi.class};
        }
        if (i == 0) {
            whu.I(this.c, false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void m(byte[] bArr) {
        acra acraVar = this.x;
        if (acraVar == null || bArr == null) {
            return;
        }
        acraVar.I(3, new acqx(bArr), null);
    }

    public final void n(boolean z, int i, CharSequence charSequence, apxf apxfVar, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, aqvf aqvfVar) {
        aqyg aqygVar;
        Spanned b;
        aqyg aqygVar2;
        final apxf apxfVar2;
        if (this.s != i || z) {
            this.D.setVisibility(8);
            this.s = i;
            if (!z) {
                this.u.clear();
                this.u.add(apxfVar);
            }
            aony<aulq> aonyVar = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand == null ? null : addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.c;
            this.W.removeAllViews();
            boolean z2 = false;
            if (aonyVar == null || aonyVar.isEmpty()) {
                this.W.setVisibility(8);
            } else {
                this.W.setVisibility(0);
                for (aulq aulqVar : aonyVar) {
                    if (aulqVar.pY(SurveyRenderer.checkboxSurveyOptionRenderer)) {
                        avby avbyVar = (avby) aulqVar.pX(SurveyRenderer.checkboxSurveyOptionRenderer);
                        if ((avbyVar.b & 1) != 0) {
                            aqygVar2 = avbyVar.c;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        Spanned b2 = ajcq.b(aqygVar2);
                        if ((avbyVar.b & 2) != 0) {
                            apxfVar2 = avbyVar.d;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                        } else {
                            apxfVar2 = null;
                        }
                        final byte[] I = avbyVar.e.I();
                        final gdq gdqVar = new gdq(this.e);
                        aone createBuilder = aptg.a.createBuilder();
                        String[] strArr = new String[1];
                        strArr[z2 ? 1 : 0] = b2.toString();
                        aqyg g = ajcq.g(strArr);
                        createBuilder.copyOnWrite();
                        aptg aptgVar = (aptg) createBuilder.instance;
                        g.getClass();
                        aptgVar.f = g;
                        aptgVar.b |= 2;
                        createBuilder.copyOnWrite();
                        aptg aptgVar2 = (aptg) createBuilder.instance;
                        aptgVar2.b |= 256;
                        aptgVar2.i = z2;
                        aone createBuilder2 = apti.a.createBuilder();
                        apth apthVar = apth.STYLE_UNKNOWN;
                        createBuilder2.copyOnWrite();
                        apti aptiVar = (apti) createBuilder2.instance;
                        aptiVar.c = apthVar.p;
                        aptiVar.b |= 1;
                        createBuilder.copyOnWrite();
                        aptg aptgVar3 = (aptg) createBuilder.instance;
                        apti aptiVar2 = (apti) createBuilder2.build();
                        aptiVar2.getClass();
                        aptgVar3.e = aptiVar2;
                        aptgVar3.b |= 1;
                        aptg aptgVar4 = (aptg) createBuilder.build();
                        DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
                        int i2 = this.f;
                        gdo a = gdqVar.a();
                        a.e(true);
                        aqyg aqygVar3 = aptgVar4.f;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        a.g(!TextUtils.isEmpty(ajcq.b(aqygVar3)));
                        a.c = ammv.j(Integer.valueOf(i2));
                        a.t(R.drawable.chip_cloud_chip_checkbox_background);
                        a.v(i2);
                        a.n(i2);
                        a.l(R.drawable.chip_cloud_chip_checkbox_background);
                        a.w(true);
                        a.s(8388627);
                        gdqVar.e = a.a();
                        gdqVar.b(aptgVar4);
                        gdqVar.setMinimumHeight(this.e.getResources().getDimensionPixelSize(R.dimen.inline_survey_chip_height));
                        gdqVar.f(yjk.K(displayMetrics, 48));
                        gdqVar.setAccessibilityDelegate(new mpz(gdqVar));
                        gdqVar.setOnClickListener(new View.OnClickListener() { // from class: mpx
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                mqb mqbVar = mqb.this;
                                byte[] bArr = I;
                                gdq gdqVar2 = gdqVar;
                                apxf apxfVar3 = apxfVar2;
                                mqbVar.m(bArr);
                                gdqVar2.d(true == gdqVar2.isSelected() ? 2 : 1);
                                if (gdqVar2.isSelected()) {
                                    mqbVar.u.add(apxfVar3);
                                } else {
                                    mqbVar.u.remove(apxfVar3);
                                }
                            }
                        });
                        t(avbyVar.e.I());
                        this.W.addView(gdqVar);
                        if (z) {
                            for (apxf apxfVar3 : this.u) {
                                if ((avbyVar.b & 2) != 0) {
                                    apxf apxfVar4 = avbyVar.d;
                                    if (apxfVar4 == null) {
                                        apxfVar4 = apxf.a;
                                    }
                                    if (apxfVar4.equals(apxfVar3)) {
                                        gdqVar.d(1);
                                    }
                                }
                            }
                        }
                        z2 = false;
                    }
                }
            }
            o(this.s);
            int dimensionPixelOffset = q(this.i) ? 0 : this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_rating_desc_padding);
            if (this.s == 0) {
                this.n.setVisibility(8);
                this.q.setPadding(0, dimensionPixelOffset, 0, 0);
            }
            if (aqvfVar != null && p(this.i)) {
                ImageView imageView = new ImageView(this.e);
                int dimensionPixelOffset2 = this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_rating_selection_padding);
                imageView.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
                ajut ajutVar = this.b;
                arfs arfsVar = aqvfVar.d;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b3 = arfr.b(arfsVar.c);
                if (b3 == null) {
                    b3 = arfr.UNKNOWN;
                }
                int a2 = ajutVar.a(b3);
                ajut ajutVar2 = this.b;
                arfs arfsVar2 = aqvfVar.e;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b4 = arfr.b(arfsVar2.c);
                if (b4 == null) {
                    b4 = arfr.UNKNOWN;
                }
                mqa mqaVar = new mqa(this, imageView, a2, ajutVar2.a(b4));
                mqaVar.b();
                mqaVar.a();
                this.p.addView(imageView);
                whu.I(this.p, true);
                this.q.setPadding(0, dimensionPixelOffset, 0, 0);
                whu.I(this.n, false);
            }
            this.r = charSequence;
            this.X = apxfVar;
            this.Y = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
            if (addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand == null) {
                b = null;
            } else {
                if ((addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.b & 1) != 0) {
                    aqygVar = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                b = ajcq.b(aqygVar);
            }
            whu.G(this.q, charSequence);
            whu.G(this.V, b);
            this.l.setText(this.e.getResources().getString(R.string.inline_surveys_undo_selection));
            this.o.setVisibility(0);
            if (z) {
                whu.I(this.o, true);
                whu.I(this.p, true);
                if (p(this.i)) {
                    whu.I(this.n, false);
                }
            }
        }
    }

    public final void o(int i) {
        if (i < 0) {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.ad[i2].c();
        }
        while (true) {
            mqa[] mqaVarArr = this.ad;
            if (i >= mqaVarArr.length) {
                return;
            }
            mqaVarArr[i].b();
            i++;
        }
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof mqb) && ((mqb) gmfVar).Q == this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gmf, ajom] */
    @Override // defpackage.gmf
    public final ayph oz(int i) {
        return this.af != null ? this.ae.oz(i) : ayph.f();
    }
}
