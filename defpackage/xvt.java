package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xvt implements ajom, xpc, yak {
    public apyv A;
    private final ajjz B;
    private final ajuw C;
    private final ajut D;
    private final yal E;
    private final yae F;
    private final xwn G;
    private final int H;
    private final int I;

    /* renamed from: J, reason: collision with root package name */
    private final int f279J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final FrameLayout X;
    public final Context a;
    private ViewGroup aA;
    private ViewGroup aB;
    private View aC;
    private View aD;
    private FrameLayout aE;
    private FrameLayout aF;
    private FrameLayout aG;
    private FrameLayout aH;
    private TextView aI;
    private TextView aJ;
    private View aK;
    private final xzu aL;
    private final xzv aM;
    private View.OnAttachStateChangeListener aN;
    private final ajsh aO;
    private final SpannableStringBuilder aP;
    private final StringBuilder aQ;
    private ajok aR;
    private final yap aS;
    private final ajsf aT;
    private final yaq aU;
    private final abie aV;
    private Animator aa;
    private final xvs ab;
    private final xvs ac;
    private final xvs ad;
    private View ae;
    private ImageView af;
    private xvr ag;
    private TextView ah;
    private ViewGroup ai;
    private TextView aj;
    private ImageView ak;
    private TextView al;
    private TextView am;
    private ImageView an;
    private View ao;
    private ImageView ap;
    private TextView aq;
    private FrameLayout ar;
    private TextView as;
    private View at;
    private TextView au;
    private TextView av;
    private TextView aw;
    private View ax;
    private ImageView ay;
    private TextView az;
    public final xqi b;
    public final akbv c;
    public final aahd d;
    public final afsy e;
    public final aahv f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ViewTreeObserver.OnPreDrawListener n;
    public View o;
    public View p;
    public View q;
    public TextView r;
    public TextView s;
    public ViewGroup t;
    public ImageView u;
    public ImageView v;
    public ImageView w;
    public ImageView x;
    public ViewTreeObserver.OnScrollChangedListener y;
    public boolean z;
    public int l = 5;
    private boolean Y = false;
    private boolean Z = false;
    public boolean m = false;

    /* JADX WARN: Type inference failed for: r9v1, types: [ajos, java.lang.Object] */
    public xvt(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, ajvb ajvbVar, xqi xqiVar, akbv akbvVar, ajut ajutVar, yaq yaqVar, yal yalVar, yae yaeVar, xwn xwnVar, abie abieVar, xzv xzvVar, yah yahVar, ajsd ajsdVar, zil zilVar, yap yapVar, afsy afsyVar, aahv aahvVar, byte[] bArr, byte[] bArr2) {
        ajsh ajshVar = new ajsh();
        this.aO = ajshVar;
        this.aP = new SpannableStringBuilder();
        this.aQ = new StringBuilder();
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.B = ajjzVar;
        this.C = ajuwVar;
        aahdVar.getClass();
        this.d = aahdVar;
        xqiVar.getClass();
        this.b = xqiVar;
        akbvVar.getClass();
        this.c = akbvVar;
        yaqVar.getClass();
        this.aU = yaqVar;
        yalVar.getClass();
        this.E = yalVar;
        this.aV = abieVar;
        this.D = ajutVar;
        xzvVar.getClass();
        this.aM = xzvVar;
        yahVar.getClass();
        this.F = yaeVar;
        this.G = xwnVar;
        yapVar.getClass();
        this.aS = yapVar;
        aahvVar.getClass();
        this.f = aahvVar;
        this.e = afsyVar;
        yaeVar.a = aahdVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        LayoutInflater from = LayoutInflater.from(context);
        xvs D = D(from.inflate(R.layout.comment_infoline_above, (ViewGroup) frameLayout, false));
        this.ab = D;
        xvs D2 = D(from.inflate(R.layout.comment_infoline_below, (ViewGroup) frameLayout, false));
        this.ac = D2;
        xvs D3 = D(from.inflate(R.layout.backstage_post, (ViewGroup) frameLayout, false));
        this.ad = D3;
        this.aL = new xzu(context, ajvbVar.get());
        this.aT = new ajsf(context, ajsdVar, true, ajshVar);
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        this.H = (context.getTheme() != null && context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true) && typedValue.type == 5) ? (int) typedValue.getDimension(context.getResources().getDisplayMetrics()) : 0;
        this.I = resources.getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        this.f279J = resources.getDimensionPixelSize(R.dimen.reply_layout_margin_left);
        this.K = resources.getDimensionPixelSize(R.dimen.reply_layout_indented_margin_left);
        this.L = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_x);
        this.g = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_y);
        this.h = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left);
        this.j = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_postv21);
        this.i = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right);
        this.k = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_postv21);
        this.M = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_indented);
        this.N = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_indented);
        this.O = resources.getDimensionPixelSize(R.dimen.comment_avatar_size);
        this.P = resources.getDimensionPixelSize(R.dimen.reply_avatar_size);
        this.Q = resources.getDimensionPixelSize(R.dimen.comment_author_badge_size);
        this.R = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top);
        this.S = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top_highlighted_reply);
        this.T = wbs.W(context, R.attr.cmtBgStyleDefault).orElse(0);
        this.U = wbs.W(context, R.attr.cmtBgStyleGrey).orElse(0);
        this.V = wbs.W(context, zilVar.a).orElse(0);
        this.W = wbs.W(context, R.attr.ytTextSecondary).orElse(0);
        m(D, false);
        m(D2, false);
        m(D3, true);
    }

    private static final String A(apyv apyvVar) {
        apxk apxkVar = apyvVar.t;
        if (apxkVar == null) {
            apxkVar = apxk.a;
        }
        apxj apxjVar = apxkVar.c;
        if (apxjVar == null) {
            apxjVar = apxj.a;
        }
        aqhi aqhiVar = apxjVar.f;
        if (aqhiVar == null) {
            aqhiVar = aqhi.a;
        }
        aqhh aqhhVar = aqhiVar.c;
        if (aqhhVar == null) {
            aqhhVar = aqhh.a;
        }
        if (!aqhhVar.g || aqhhVar.h) {
            return "";
        }
        aott aottVar = aqhhVar.k;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) == 0) {
            return "";
        }
        aott aottVar2 = aqhhVar.k;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar = aottVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    private static final apyo B(apyv apyvVar) {
        apyp apypVar = apyvVar.v;
        if (apypVar == null) {
            apypVar = apyp.a;
        }
        if ((apypVar.b & 1) == 0) {
            return null;
        }
        apyp apypVar2 = apyvVar.v;
        if (apypVar2 == null) {
            apypVar2 = apyp.a;
        }
        apyo apyoVar = apypVar2.c;
        return apyoVar == null ? apyo.a : apyoVar;
    }

    private static final apmg C(apyv apyvVar) {
        apxk apxkVar = apyvVar.t;
        if (apxkVar == null) {
            apxkVar = apxk.a;
        }
        apxj apxjVar = apxkVar.c;
        if (apxjVar == null) {
            apxjVar = apxj.a;
        }
        apmh apmhVar = apxjVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return null;
        }
        apmh apmhVar2 = apxjVar.e;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    private static final xvs D(View view) {
        xvs xvsVar = new xvs();
        xvsVar.a = view;
        xvsVar.g = (TextView) view.findViewById(R.id.comment_author);
        xvsVar.d = view.findViewById(R.id.left_margin);
        xvsVar.e = (ImageView) view.findViewById(R.id.comment_avatar);
        xvsVar.h = (TextView) view.findViewById(R.id.comment_content);
        xvsVar.i = (TextView) view.findViewById(R.id.comment_expand_button);
        xvsVar.j = (ViewGroup) view.findViewById(R.id.action_toolbar);
        xvsVar.l = (ViewGroup) view.findViewById(R.id.moderation_toolbar);
        xvsVar.m = (ImageView) view.findViewById(R.id.comment_approve_button);
        xvsVar.n = (ImageView) view.findViewById(R.id.comment_remove_button);
        xvsVar.o = (ImageView) view.findViewById(R.id.comment_report_button);
        xvsVar.p = (ImageView) view.findViewById(R.id.comment_ban_button);
        xvsVar.q = (TextView) view.findViewById(R.id.comment_timestamp);
        xvsVar.r = (ImageView) view.findViewById(R.id.pinned_comment_icon);
        xvsVar.s = (TextView) view.findViewById(R.id.pinned_comment_label);
        xvsVar.t = (TextView) view.findViewById(R.id.linked_comment_badge);
        xvsVar.u = (ImageView) view.findViewById(R.id.comment_sponsor_badge);
        xvsVar.v = view.findViewById(R.id.sponsors_only_badge);
        xvsVar.x = (TextView) view.findViewById(R.id.sponsors_only_badge_text);
        xvsVar.w = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon);
        xvsVar.M = (FrameLayout) view.findViewById(R.id.backstage_image);
        xvsVar.N = (FrameLayout) view.findViewById(R.id.backstage_playlist);
        xvsVar.O = (FrameLayout) view.findViewById(R.id.backstage_video);
        xvsVar.P = (FrameLayout) view.findViewById(R.id.creator_reply);
        xvsVar.L = (TextView) view.findViewById(R.id.replies_metadata);
        xvsVar.k = (TextView) view.findViewById(R.id.creator_stories_reply);
        xvsVar.y = (FrameLayout) view.findViewById(R.id.comment_poll);
        xvsVar.H = (ViewGroup) view.findViewById(R.id.comment_info_line);
        xvsVar.I = (ViewGroup) view.findViewById(R.id.comment_poll_info_line);
        xvsVar.z = (TextView) view.findViewById(R.id.comment_poll_author);
        xvsVar.A = view.findViewById(R.id.poll_info_line_separator);
        xvsVar.D = (TextView) view.findViewById(R.id.comment_poll_timestamp);
        xvsVar.B = (TextView) view.findViewById(R.id.comment_poll_votes_total);
        xvsVar.C = (TextView) view.findViewById(R.id.comment_poll_voting_status);
        xvsVar.E = view.findViewById(R.id.sponsors_only_badge_poll);
        xvsVar.G = (TextView) view.findViewById(R.id.sponsors_only_badge_text_poll);
        xvsVar.F = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon_poll);
        xvsVar.K = view.findViewById(R.id.comment_poll_separator2);
        xvsVar.f278J = view.findViewById(R.id.comment_info_line_separator);
        xvsVar.Q = view.findViewById(R.id.comment_divider);
        xvsVar.b = view.findViewById(R.id.action_menu_anchor);
        xvsVar.c = view.findViewById(R.id.top_action_menu_anchor);
        return xvsVar;
    }

    private final void E(apyv apyvVar, boolean z) {
        audq audqVar;
        boolean z2;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        audq audqVar2;
        this.ar.removeAllViews();
        yal yalVar = this.E;
        apjn apjnVar = apyvVar.B;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        if (apjnVar.b == 99391126) {
            apjn apjnVar2 = apyvVar.B;
            if (apjnVar2 == null) {
                apjnVar2 = apjn.a;
            }
            if (apjnVar2.b == 99391126) {
                audqVar2 = (audq) apjnVar2.c;
            } else {
                audqVar2 = audq.a;
            }
            audqVar = audqVar2;
        } else {
            audqVar = null;
        }
        audq audqVar3 = audqVar == null ? null : (audq) yalVar.e(yal.n(apyvVar.i), audqVar, audq.class, audqVar.k, z);
        if (audqVar3 != null) {
            this.ar.addView(this.aL.c(this.aL.d(this.aR), audqVar3));
            TextView textView = this.av;
            if ((audqVar3.b & 64) != 0) {
                aqygVar = audqVar3.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = this.au;
            if ((audqVar3.b & 32) != 0) {
                aqygVar2 = audqVar3.h;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            TextView textView3 = this.aw;
            if ((apyvVar.b & 262144) != 0) {
                aqygVar3 = apyvVar.r;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            textView3.setText(ajcq.b(aqygVar3));
            if ((apyvVar.b & 32) != 0) {
                aqygVar4 = apyvVar.k;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            Spanned b = ajcq.b(aqygVar4);
            if (TextUtils.isEmpty(b)) {
                this.as.setText("");
                this.as.setVisibility(8);
                View view = this.at;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                this.as.setText(b);
                this.as.setVisibility(0);
                apxo apxoVar = apyvVar.w;
                if (apxoVar == null) {
                    apxoVar = apxo.a;
                }
                apxm apxmVar = apxoVar.d;
                if (apxmVar == null) {
                    apxmVar = apxm.a;
                }
                if ((apxmVar.b & 1) != 0) {
                    arfs arfsVar = apxmVar.c;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    if (b2 != arfr.CHECK) {
                        Resources resources = this.a.getResources();
                        ajut ajutVar = this.D;
                        arfs arfsVar2 = apxmVar.c;
                        if (arfsVar2 == null) {
                            arfsVar2 = arfs.a;
                        }
                        arfr b3 = arfr.b(arfsVar2.c);
                        if (b3 == null) {
                            b3 = arfr.UNKNOWN;
                        }
                        Drawable drawable = resources.getDrawable(ajutVar.a(b3));
                        drawable.setBounds(0, 0, 50, 50);
                        this.as.setCompoundDrawablesRelative(null, null, drawable, null);
                        this.as.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelSize(R.dimen.comment_author_text_icon_gap));
                    }
                }
                View view2 = this.at;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            View view3 = this.aD;
            if (view3 != null) {
                view3.setVisibility(this.av.getText().length() > 0 ? 0 : 8);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        FrameLayout frameLayout = this.ar;
        int i = true != z2 ? 8 : 0;
        frameLayout.setVisibility(i);
        this.aB.setVisibility(i);
        this.aA.setVisibility(true != z2 ? 0 : 8);
    }

    private static final boolean G(ajok ajokVar) {
        return !ajokVar.j("ignoreIndentedComment", false) && ajokVar.j("indentedComment", false);
    }

    private static final String H(apyv apyvVar) {
        apmg C = C(apyvVar);
        if (C == null) {
            return "";
        }
        aqyg aqygVar = C.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        aots aotsVar = aqyhVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    private final String k(apyv apyvVar) {
        apxo apxoVar = apyvVar.w;
        if (apxoVar == null) {
            apxoVar = apxo.a;
        }
        apxm apxmVar = apxoVar.d;
        if (apxmVar == null) {
            apxmVar = apxm.a;
        }
        aqyg aqygVar = apxmVar.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        if ((aqyhVar.b & 1) == 0) {
            return this.ah.getText().toString();
        }
        apxo apxoVar2 = apyvVar.w;
        if (apxoVar2 == null) {
            apxoVar2 = apxo.a;
        }
        apxm apxmVar2 = apxoVar2.d;
        if (apxmVar2 == null) {
            apxmVar2 = apxm.a;
        }
        aqyg aqygVar2 = apxmVar2.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        aqyh aqyhVar2 = aqygVar2.f;
        if (aqyhVar2 == null) {
            aqyhVar2 = aqyh.a;
        }
        aots aotsVar = aqyhVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    private final void l(StringBuilder sb, apyv apyvVar) {
        audq audqVar;
        aqyg aqygVar;
        apjn apjnVar = apyvVar.B;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        if (apjnVar.b == 99391126) {
            apjn apjnVar2 = apyvVar.B;
            if (apjnVar2 == null) {
                apjnVar2 = apjn.a;
            }
            if (apjnVar2.b == 99391126) {
                audqVar = (audq) apjnVar2.c;
            } else {
                audqVar = audq.a;
            }
            sb.append(this.au.getText().toString());
            sb.append(". ");
            for (audo audoVar : audqVar.f) {
                aqyg aqygVar2 = null;
                if ((audoVar.b & 1) != 0) {
                    aqygVar = audoVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                sb.append((CharSequence) ajcq.b(aqygVar));
                sb.append(". ");
                if ((audoVar.b & 32) != 0 && (aqygVar2 = audoVar.g) == null) {
                    aqygVar2 = aqyg.a;
                }
                Spanned b = ajcq.b(aqygVar2);
                if (!TextUtils.isEmpty(b)) {
                    sb.append((CharSequence) b);
                    sb.append(". ");
                }
            }
        }
    }

    private final void m(xvs xvsVar, boolean z) {
        View view = xvsVar.a;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new xvm(this, xvsVar, z, view));
    }

    private final void n(apyv apyvVar, acra acraVar, Map map, boolean z) {
        apxj apxjVar;
        int i;
        Map map2;
        TextView textView;
        ImageView imageView;
        apyv apyvVar2;
        yae yaeVar;
        ImageView imageView2;
        apmp apmpVar;
        ImageView imageView3;
        ImageView imageView4;
        int i2;
        aqyg aqygVar;
        apxk apxkVar = apyvVar.t;
        if (apxkVar == null) {
            apxkVar = apxk.a;
        }
        if ((apxkVar.b & 1) == 0 || B(apyvVar) != null) {
            this.ai.setVisibility(8);
            return;
        }
        apxk apxkVar2 = apyvVar.t;
        if (apxkVar2 == null) {
            apxkVar2 = apxk.a;
        }
        apxj apxjVar2 = apxkVar2.c;
        if (apxjVar2 == null) {
            apxjVar2 = apxj.a;
        }
        apxj apxjVar3 = apxjVar2;
        t(apxjVar3, map);
        yae yaeVar2 = this.F;
        apyv apyvVar3 = this.A;
        xvr xvrVar = this.ag;
        ImageView imageView5 = (ImageView) xvrVar.b;
        ImageView imageView6 = (ImageView) xvrVar.d;
        TextView textView2 = xvrVar.c;
        Map map3 = this.Y ? yaeVar2.f : yaeVar2.e;
        apmp b = yaeVar2.b.b(apyvVar3.i, apxjVar3, z);
        apmp a = yaeVar2.b.a(apyvVar3.i, apxjVar3, z);
        if (b == null || a == null) {
            apxjVar = apxjVar3;
            imageView5.setVisibility(4);
            imageView5.setClickable(false);
            textView2.setVisibility(4);
            imageView6.setVisibility(4);
            imageView6.setClickable(false);
        } else {
            yae.c(b, imageView5, textView2, map3);
            yae.a(a, imageView6, map3);
            if ((b.b & 1024) != 0) {
                if ((apyvVar3.b & 2097152) != 0) {
                    aqygVar = apyvVar3.s;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView2.setText(ajcq.b(aqygVar));
                imageView5.setOnClickListener(new yac(yaeVar2, b, map, 1));
                apmpVar = a;
                map2 = map3;
                textView = textView2;
                imageView = imageView6;
                imageView2 = imageView5;
                apyvVar2 = apyvVar3;
                yaeVar = yaeVar2;
                apxjVar = apxjVar3;
            } else {
                map2 = map3;
                textView = textView2;
                imageView = imageView6;
                apyvVar2 = apyvVar3;
                yaeVar = yaeVar2;
                apxjVar = apxjVar3;
                imageView2 = imageView5;
                imageView2.setOnClickListener(new yab(yaeVar2, apyvVar3, apxjVar3, z, acraVar, map, imageView5, textView, map2, imageView, 1));
                apmpVar = a;
            }
            if ((apmpVar.b & 1024) == 0) {
                imageView3 = imageView2;
                imageView4 = imageView;
                imageView4.setOnClickListener(new yab(yaeVar, apyvVar2, apxjVar, z, acraVar, map, imageView2, textView, map2, imageView, 0));
                i2 = 0;
            } else {
                i2 = 0;
                ImageView imageView7 = imageView;
                imageView7.setOnClickListener(new yac(yaeVar, apmpVar, map, 0));
                imageView4 = imageView7;
                imageView3 = imageView2;
            }
            imageView3.setVisibility(i2);
            textView.setVisibility(i2);
            imageView4.setVisibility(i2);
        }
        if (!apyvVar.I) {
            xwn xwnVar = this.G;
            View view = this.o;
            xvr xvrVar2 = this.ag;
            xwnVar.a(view, xvrVar2.f, xvrVar2.e, xvrVar2.g, xvrVar2.h, apyvVar.i, apxjVar, acraVar, map, z);
        }
        s(apxjVar, acraVar, map);
        int i3 = 0;
        while (true) {
            if (i3 >= this.ai.getChildCount()) {
                i = 8;
                break;
            } else {
                if (this.ai.getChildAt(i3).getVisibility() == 0) {
                    i = 0;
                    break;
                }
                i3++;
            }
        }
        this.ai.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(defpackage.apyv r11, final defpackage.acra r12, java.lang.Object r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L1c
            atdf r1 = r11.u
            if (r1 != 0) goto L9
            atdf r1 = defpackage.atdf.a
        L9:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L1c
            atdf r11 = r11.u
            if (r11 != 0) goto L15
            atdf r11 = defpackage.atdf.a
        L15:
            atdc r11 = r11.c
            if (r11 != 0) goto L1d
            atdc r11 = defpackage.atdc.a
            goto L1d
        L1c:
            r11 = r0
        L1d:
            boolean r1 = r10.m
            r2 = 8
            if (r1 == 0) goto L2b
            android.view.View r1 = r10.q
            android.view.View r3 = r10.p
            r3.setVisibility(r2)
            goto L34
        L2b:
            android.view.View r1 = r10.p
            android.view.View r3 = r10.q
            if (r3 == 0) goto L34
            r3.setVisibility(r2)
        L34:
            r6 = r1
            r1 = 3
            r3 = 2131427742(0x7f0b019e, float:1.8477109E38)
            zhh r1 = defpackage.yny.j(r1, r3)
            java.lang.Class<android.widget.RelativeLayout$LayoutParams> r3 = android.widget.RelativeLayout.LayoutParams.class
            defpackage.yny.z(r6, r1, r3)
            if (r11 != 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            r6.setVisibility(r2)
            if (r11 != 0) goto L4e
            r11 = r0
            r1 = r11
            goto L54
        L4e:
            aott r1 = r11.i
            if (r1 != 0) goto L54
            aott r1 = defpackage.aott.a
        L54:
            F(r6, r1)
            ajuw r4 = r10.C
            android.view.View r5 = r10.o
            r7 = r11
            r8 = r13
            r9 = r12
            r4.e(r5, r6, r7, r8, r9)
            boolean r13 = r10.z
            if (r13 == 0) goto L71
            android.view.View r11 = r10.o
            android.view.ViewTreeObserver r11 = r11.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r12 = r10.y
            r11.removeOnScrollChangedListener(r12)
            return
        L71:
            if (r11 == 0) goto L8e
            int r13 = r11.b
            r13 = r13 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L8e
            atcy r13 = r11.h
            if (r13 != 0) goto L7f
            atcy r13 = defpackage.atcy.a
        L7f:
            int r0 = r13.b
            r1 = 102716411(0x61f53fb, float:2.9966275E-35)
            if (r0 != r1) goto L8c
            java.lang.Object r13 = r13.c
            r0 = r13
            arej r0 = (defpackage.arej) r0
            goto L8e
        L8c:
            arej r0 = defpackage.arej.a
        L8e:
            if (r0 != 0) goto L91
            goto La7
        L91:
            xvl r13 = new xvl
            r13.<init>()
            r10.y = r13
            boolean r11 = r10.z
            if (r11 != 0) goto La7
            android.view.View r11 = r10.o
            android.view.ViewTreeObserver r11 = r11.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r12 = r10.y
            r11.addOnScrollChangedListener(r12)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvt.o(apyv, acra, java.lang.Object):void");
    }

    private final void p(apyv apyvVar) {
        aqyg aqygVar;
        apxn apxnVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        apkv apkvVar;
        Drawable drawable;
        TextView textView = this.aj;
        apxr apxrVar = null;
        if ((apyvVar.b & 262144) != 0) {
            aqygVar = apyvVar.r;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((apyvVar.b & 32) == 0) {
            this.ah.setVisibility(8);
            View view = this.aC;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            TextView textView2 = this.ah;
            apyv apyvVar2 = this.A;
            if ((apyvVar2.b & 32) != 0) {
                aqygVar2 = apyvVar2.k;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            this.ah.setTextColor(this.W);
            this.ah.setBackgroundColor(this.T);
            this.ah.setBackgroundDrawable(null);
            this.ah.setPadding(0, 0, 0, 0);
            this.ah.setCompoundDrawablePadding(0);
            jm.u(this.ah, null, null, null);
            apxo apxoVar = apyvVar.w;
            if (apxoVar == null) {
                apxoVar = apxo.a;
            }
            if ((apxoVar.b & 2) != 0) {
                apxo apxoVar2 = apyvVar.w;
                if (apxoVar2 == null) {
                    apxoVar2 = apxo.a;
                }
                apxm apxmVar = apxoVar2.d;
                if (apxmVar == null) {
                    apxmVar = apxm.a;
                }
                if ((apxmVar.b & 8) != 0) {
                    aqygVar3 = apxmVar.e;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                Spanned b = ajcq.b(aqygVar3);
                if (!TextUtils.isEmpty(b)) {
                    this.ah.setText(b);
                }
                int i = apxmVar.b;
                if ((i & 32) != 0) {
                    zbx zbxVar = new zbx(wbs.Q(this.a, R.attr.ytVerifiedBadgeBackground));
                    zbxVar.b(4, 1, zbx.a(this.ah.getTextSize(), 1) + 4, 1);
                    this.ah.setBackground(zbxVar);
                    this.ah.setTextColor(wbs.Q(this.a, R.attr.ytTextPrimary));
                } else if ((i & 4) != 0) {
                    apxn apxnVar2 = apxmVar.d;
                    if (apxnVar2 == null) {
                        apxnVar2 = apxn.a;
                    }
                    if (apxnVar2.b == 118483990) {
                        apkvVar = (apkv) apxnVar2.c;
                    } else {
                        apkvVar = apkv.a;
                    }
                    Drawable drawable2 = this.a.getResources().getDrawable(R.drawable.comment_author_highlight);
                    drawable2.setColorFilter(apkvVar.c, PorterDuff.Mode.SRC_IN);
                    this.ah.setBackgroundDrawable(drawable2);
                    this.ah.setTextColor(apkvVar.d);
                }
                int currentTextColor = this.ah.getCurrentTextColor();
                if ((apxmVar.b & 1) != 0) {
                    arfs arfsVar = apxmVar.c;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    arfr arfrVar = arfr.CHECK;
                    int i2 = R.dimen.comment_author_text_verified_icon_gap;
                    if (b2 == arfrVar) {
                        drawable = this.a.getResources().getDrawable(R.drawable.ic_check_black);
                    } else {
                        arfs arfsVar2 = apxmVar.c;
                        if (arfsVar2 == null) {
                            arfsVar2 = arfs.a;
                        }
                        arfr b3 = arfr.b(arfsVar2.c);
                        if (b3 == null) {
                            b3 = arfr.UNKNOWN;
                        }
                        if (b3 == arfr.CHECK_CIRCLE_THICK) {
                            drawable = this.a.getResources().getDrawable(R.drawable.quantum_ic_check_circle_white_24);
                        } else {
                            Resources resources = this.a.getResources();
                            ajut ajutVar = this.D;
                            arfs arfsVar3 = apxmVar.c;
                            if (arfsVar3 == null) {
                                arfsVar3 = arfs.a;
                            }
                            arfr b4 = arfr.b(arfsVar3.c);
                            if (b4 == null) {
                                b4 = arfr.UNKNOWN;
                            }
                            drawable = resources.getDrawable(ajutVar.a(b4));
                            i2 = R.dimen.comment_author_text_icon_gap;
                        }
                    }
                    int i3 = this.Q;
                    drawable.setBounds(0, 0, i3, i3);
                    if (currentTextColor != -16777216) {
                        drawable.setColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN);
                    }
                    this.ah.setCompoundDrawablesRelative(null, null, drawable, null);
                    this.ah.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelSize(i2));
                }
            }
            this.ah.setVisibility(0);
            View view2 = this.aC;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        this.an.setVisibility(8);
        apxo apxoVar3 = apyvVar.y;
        if (apxoVar3 == null) {
            apxoVar3 = apxo.a;
        }
        if ((apxoVar3.b & 4) != 0) {
            apxo apxoVar4 = apyvVar.y;
            if (apxoVar4 == null) {
                apxoVar4 = apxo.a;
            }
            apxq apxqVar = apxoVar4.e;
            if (apxqVar == null) {
                apxqVar = apxq.a;
            }
            int i4 = apxqVar.c;
            if (i4 == 4) {
                ImageView imageView = this.an;
                avgg avggVar = (avgg) apxqVar.d;
                imageView.setColorFilter((ColorFilter) null);
                this.B.e(imageView);
                this.B.h(imageView, avggVar);
            } else {
                ImageView imageView2 = this.an;
                arfs arfsVar4 = i4 == 1 ? (arfs) apxqVar.d : null;
                if ((apxqVar.b & 8) != 0) {
                    apxnVar = apxqVar.f;
                    if (apxnVar == null) {
                        apxnVar = apxn.a;
                    }
                } else {
                    apxnVar = null;
                }
                v(imageView2, arfsVar4, apxnVar, R.attr.cmtSponsorBadgeBackground);
            }
            this.an.setVisibility(0);
        }
        apxo apxoVar5 = apyvVar.z;
        if (apxoVar5 == null) {
            apxoVar5 = apxo.a;
        }
        if ((apxoVar5.b & 8) != 0) {
            apxo apxoVar6 = apyvVar.z;
            if (apxoVar6 == null) {
                apxoVar6 = apxo.a;
            }
            apxrVar = apxoVar6.f;
            if (apxrVar == null) {
                apxrVar = apxr.a;
            }
        }
        y(apxrVar, this.ao, this.aq, this.ap);
        y(apxrVar, this.ax, this.az, this.ay);
    }

    private final void q(apyv apyvVar, boolean z) {
        aqyg aqygVar = apyvVar.p;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned a = aahk.a(aqygVar, this.d, false);
        if (!TextUtils.isEmpty(a) || (apyvVar.c & 256) == 0) {
            this.r.setVisibility(0);
            this.aP.clear();
            this.aQ.setLength(0);
            if (TextUtils.isEmpty(a)) {
                this.r.setText((CharSequence) null);
            } else {
                this.aP.append((CharSequence) a);
                this.aQ.append((CharSequence) a);
                ajsf ajsfVar = this.aT;
                aqyg aqygVar2 = apyvVar.p;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                ajsfVar.g(aqygVar2, a, this.aP, this.aQ, apyvVar, this.r.getId());
                this.r.setText(this.aP);
            }
            this.r.setMaxLines(z ? this.l : Integer.MAX_VALUE);
            return;
        }
        this.r.setVisibility(8);
    }

    private final void r(apyv apyvVar) {
        if (this.aS.a(apyvVar) == null) {
            this.aH.setVisibility(8);
            if (C(apyvVar) != null) {
                x(true);
                return;
            }
            return;
        }
        apyv a = this.aS.a(apyvVar);
        ajok d = this.aL.d(this.aR);
        d.f("creatorReplyParentComment", this.A);
        d.f("indentedComment", true);
        this.aH.addView(this.aL.c(d, a), 0);
        this.aH.setVisibility(0);
        x(false);
    }

    private final void s(apxj apxjVar, acra acraVar, Map map) {
        if ((apxjVar.b & 32768) != 0) {
            aulq aulqVar = apxjVar.g;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            View view = this.ag.k;
            aott aottVar = apmgVar.s;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            F(view, aottVar);
            if (this.m) {
                TextView textView = (TextView) this.ag.k.findViewById(R.id.comment_action_toolbar_create_story_text);
                aqyg aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
            }
            this.ag.k.setOnClickListener(new xvg(this, apmgVar, acraVar, map, 1));
            this.ag.k.setVisibility(0);
            acraVar.n(new acqx(apmgVar.t));
        }
    }

    private final void t(apxj apxjVar, final Map map) {
        final apmg apmgVar;
        CharSequence charSequence;
        apmh apmhVar = apxjVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        aqyg aqygVar = null;
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = apxjVar.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        if (apmgVar == null) {
            x(false);
            return;
        }
        TextView textView = this.ag.j;
        String str = "";
        if (textView != null) {
            int i = apmgVar.b & 256;
            if (i != 0) {
                if (i != 0 && (aqygVar = apmgVar.i) == null) {
                    aqygVar = aqyg.a;
                }
                charSequence = ajcq.b(aqygVar);
            } else {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
        View view = this.ag.i;
        if ((apmgVar.b & 65536) != 0) {
            aots aotsVar = apmgVar.r;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        }
        view.setContentDescription(str);
        this.ag.i.setOnClickListener(new View.OnClickListener() { // from class: xvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xvt xvtVar = xvt.this;
                apmg apmgVar2 = apmgVar;
                Map map2 = map;
                apza apzaVar = (apza) apmgVar2.pX(apza.b);
                if ((apzaVar.c & 1) == 0 || apzaVar.e.isEmpty()) {
                    if ((apmgVar2.b & 16384) != 0) {
                        aahd aahdVar = xvtVar.d;
                        apxf apxfVar = apmgVar2.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, map2);
                        return;
                    }
                    return;
                }
                aoti aotiVar = (aoti) xvtVar.f.a(xvtVar.e.c()).f(apzaVar.e).g(aoti.class).X();
                if (aotiVar != null && aotiVar.getShouldRequireViewerAck().booleanValue()) {
                    aahd aahdVar2 = xvtVar.d;
                    apxf apxfVar2 = apzaVar.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.a(apxfVar2);
                    return;
                }
                if ((apmgVar2.b & 16384) != 0) {
                    aahd aahdVar3 = xvtVar.d;
                    apxf apxfVar3 = apmgVar2.o;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aahdVar3.c(apxfVar3, map2);
                }
            }
        });
        x(true);
    }

    private final void u() {
        View view;
        ViewGroup viewGroup;
        TextView textView = this.r;
        if (textView != null) {
            textView.setText((CharSequence) null);
            if (this.n != null) {
                this.r.getViewTreeObserver().removeOnPreDrawListener(this.n);
                this.n = null;
            }
        }
        TextView textView2 = this.s;
        if (textView2 != null) {
            textView2.setOnClickListener(null);
        }
        xvr xvrVar = this.ag;
        if (xvrVar != null && (viewGroup = xvrVar.a) != null) {
            viewGroup.setVisibility(8);
        }
        View view2 = this.q;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        xvr xvrVar2 = this.ag;
        if (xvrVar2 == null || (view = xvrVar2.k) == null) {
            return;
        }
        view.setVisibility(8);
    }

    private final void v(ImageView imageView, arfs arfsVar, apxn apxnVar, int i) {
        arfr arfrVar;
        int orElse;
        if (arfsVar != null) {
            arfrVar = arfr.b(arfsVar.c);
            if (arfrVar == null) {
                arfrVar = arfr.UNKNOWN;
            }
        } else {
            arfrVar = arfr.SPONSORSHIPS;
        }
        imageView.setImageResource(this.D.a(arfrVar));
        if (apxnVar == null || apxnVar.b != 118483990) {
            orElse = wbs.W(this.a, i).orElse(0);
        } else {
            orElse = ((apkv) apxnVar.c).e;
        }
        imageView.setColorFilter(orElse);
    }

    private final void w() {
        TextView textView = this.ag.j;
        if (textView != null && textView.getVisibility() != 0) {
            this.ag.j.setVisibility(4);
        }
        View view = this.ag.d;
        int i = this.h;
        int i2 = this.g;
        wcy.q(view, i, i2, this.i, i2);
    }

    private final void x(boolean z) {
        int i = true != z ? 4 : 0;
        View view = this.ag.i;
        view.setVisibility(i);
        view.setClickable(z);
        TextView textView = this.ag.j;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    private final void y(apxr apxrVar, final View view, TextView textView, ImageView imageView) {
        aqyg aqygVar;
        arfs arfsVar;
        apxn apxnVar;
        if (view == null) {
            return;
        }
        if (apxrVar == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        aqyg aqygVar2 = null;
        if ((apxrVar.b & 2) != 0) {
            aqygVar = apxrVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((apxrVar.b & 1) != 0) {
            arfsVar = apxrVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
        } else {
            arfsVar = null;
        }
        if ((apxrVar.b & 4) != 0) {
            apxnVar = apxrVar.e;
            if (apxnVar == null) {
                apxnVar = apxn.a;
            }
        } else {
            apxnVar = null;
        }
        v(imageView, arfsVar, apxnVar, R.attr.cmtSponsorsOnlyBadge);
        view.setOnClickListener(null);
        if ((apxrVar.b & 2) != 0 && (aqygVar2 = apxrVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        view.setContentDescription(ajcq.i(aqygVar2));
        if ((apxrVar.b & 8) != 0) {
            aqyg aqygVar3 = apxrVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            final String obj = ajcq.b(aqygVar3).toString();
            if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: xvk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    xvt xvtVar = xvt.this;
                    String str = obj;
                    View view3 = view;
                    xvtVar.b.a(str, wbs.W(xvtVar.a, R.attr.cmtCreatorHeartTooltipBg).orElse(0), view3);
                }
            });
        }
    }

    private final boolean z(apmh apmhVar, ImageView imageView, acra acraVar, Map map) {
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        apmg apmgVar2 = apmgVar;
        if ((apmgVar2.b & 32) == 0) {
            imageView.setVisibility(4);
            imageView.setOnClickListener(null);
            return false;
        }
        Resources resources = this.a.getResources();
        ajut ajutVar = this.D;
        arfs arfsVar = apmgVar2.g;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajutVar.a(b));
        boolean z = apmgVar2.h;
        drawable.setTint(wbs.W(this.a, z ? R.attr.ytTextDisabled : R.attr.ytTextPrimary).orElse(0));
        imageView.setImageDrawable(drawable);
        imageView.setEnabled(!z);
        imageView.setVisibility(0);
        aott aottVar = apmgVar2.s;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        F(imageView, aottVar);
        imageView.setOnClickListener(new xvg(this, apmgVar2, acraVar, map, 0));
        return true;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.X;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.aT.e();
        this.o.setClickable(false);
        yaq yaqVar = this.aU;
        apyv apyvVar = this.A;
        yjj.x(yaqVar.a, apyvVar, this);
        yjj.z(yaqVar.a, apyvVar);
        this.E.g(this);
        u();
        ViewGroup viewGroup = this.ai;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.t;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView = this.aI;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.aL.e(this.aE);
        this.aL.e(this.aF);
        this.aL.e(this.aG);
        this.aL.e(this.ar);
        this.aL.e(this.aH);
        this.aK.setVisibility(8);
        Animator animator = this.aa;
        if (animator != null && animator.isRunning()) {
            this.aa.end();
        }
        this.aa = null;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.aN;
        if (onAttachStateChangeListener != null) {
            this.X.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.aN = null;
        }
    }

    @Override // defpackage.xpc
    public final void d(apyv apyvVar) {
        this.aL.e(this.aH);
        r(apyvVar);
    }

    final void e(apyv apyvVar) {
        this.Y = false;
        this.Z = false;
        this.X.removeAllViews();
        xvs xvsVar = this.ac;
        if (apyvVar.L.size() > 0) {
            Iterator it = apyvVar.L.iterator();
            while (it.hasNext()) {
                int aC = aobq.aC(((apyt) it.next()).b);
                if (aC == 0) {
                    aC = 1;
                }
                int i = aC - 1;
                if (i == 1) {
                    this.Y = true;
                    xvsVar = this.ad;
                } else if (i == 5) {
                    this.Z = true;
                    xvsVar = this.ab;
                }
            }
        }
        View view = xvsVar.a;
        this.ag = new xvr();
        if (apyvVar != null && (apyvVar.c & 1048576) != 0) {
            apyy apyyVar = apyvVar.f96J;
            if (apyyVar == null) {
                apyyVar = apyy.a;
            }
            int ay = aobq.ay(apyyVar.b);
            if (ay != 0 && ay == 7) {
                this.m = true;
                if (view.findViewById(R.id.action_toolbar_with_labels) == null) {
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.action_toolbar_with_labels_stub);
                    viewStub.setLayoutResource(R.layout.comment_action_toolbar_with_labels);
                    viewStub.inflate();
                }
                View findViewById = view.findViewById(R.id.action_toolbar_with_labels);
                this.ag.a = (ViewGroup) view.findViewById(R.id.action_toolbar_with_labels);
                this.ag.b = view.findViewById(R.id.comment_action_toolbar_like);
                this.ag.c = (TextView) view.findViewById(R.id.comment_action_toolbar_like_text);
                this.ag.d = view.findViewById(R.id.comment_action_toolbar_dislike);
                this.ag.e = (ViewGroup) findViewById.findViewById(R.id.comment_action_toolbar_creator_heart);
                this.ag.f = (ImageView) findViewById.findViewById(R.id.comment_heart_button);
                this.ag.g = (ImageView) findViewById.findViewById(R.id.comment_creator_hearted_badge_avatar);
                this.ag.h = (ImageView) findViewById.findViewById(R.id.comment_avatar_heart_overlay);
                this.ag.i = view.findViewById(R.id.comment_action_toolbar_reply);
                this.ag.j = (TextView) view.findViewById(R.id.comment_action_toolbar_reply_text);
                this.ag.k = view.findViewById(R.id.comment_action_toolbar_create_story);
                xvsVar.f = this.ag;
                m(xvsVar, this.Y);
                this.o = xvsVar.a;
                this.af = xvsVar.e;
                this.ah = xvsVar.g;
                this.ae = xvsVar.d;
                this.r = xvsVar.h;
                this.s = xvsVar.i;
                this.aI = xvsVar.k;
                this.ai = xvsVar.j;
                this.t = xvsVar.l;
                this.u = xvsVar.m;
                this.v = xvsVar.n;
                this.w = xvsVar.o;
                this.x = xvsVar.p;
                this.aj = xvsVar.q;
                this.ak = xvsVar.r;
                this.al = xvsVar.s;
                this.am = xvsVar.t;
                this.an = xvsVar.u;
                this.ao = xvsVar.v;
                this.aq = xvsVar.x;
                this.ap = xvsVar.w;
                this.aE = xvsVar.M;
                this.aF = xvsVar.N;
                this.aG = xvsVar.O;
                this.aH = xvsVar.P;
                this.ar = xvsVar.y;
                this.as = xvsVar.z;
                this.at = xvsVar.A;
                this.aA = xvsVar.H;
                this.aB = xvsVar.I;
                this.aw = xvsVar.D;
                this.au = xvsVar.B;
                this.av = xvsVar.C;
                this.ax = xvsVar.E;
                this.ay = xvsVar.F;
                this.az = xvsVar.G;
                this.aD = xvsVar.K;
                this.aC = xvsVar.f278J;
                this.aJ = xvsVar.L;
                this.aK = xvsVar.Q;
                this.p = xvsVar.b;
                this.q = xvsVar.c;
                this.X.addView(this.o);
            }
        }
        this.m = false;
        xvr xvrVar = this.ag;
        xvrVar.a = xvsVar.j;
        xvrVar.b = view.findViewById(R.id.comment_like_button);
        this.ag.c = (TextView) view.findViewById(R.id.comment_like_count);
        this.ag.d = view.findViewById(R.id.comment_dislike_button);
        this.ag.e = (ViewGroup) view.findViewById(R.id.comment_creator_heart);
        this.ag.f = (ImageView) view.findViewById(R.id.comment_heart_button);
        this.ag.g = (ImageView) view.findViewById(R.id.comment_creator_hearted_badge_avatar);
        this.ag.h = (ImageView) view.findViewById(R.id.comment_avatar_heart_overlay);
        this.ag.i = view.findViewById(R.id.comment_reply_button);
        this.ag.j = (TextView) view.findViewById(R.id.comment_reply_count);
        this.ag.k = view.findViewById(R.id.create_story_reply_button);
        xvsVar.f = this.ag;
        m(xvsVar, this.Y);
        this.o = xvsVar.a;
        this.af = xvsVar.e;
        this.ah = xvsVar.g;
        this.ae = xvsVar.d;
        this.r = xvsVar.h;
        this.s = xvsVar.i;
        this.aI = xvsVar.k;
        this.ai = xvsVar.j;
        this.t = xvsVar.l;
        this.u = xvsVar.m;
        this.v = xvsVar.n;
        this.w = xvsVar.o;
        this.x = xvsVar.p;
        this.aj = xvsVar.q;
        this.ak = xvsVar.r;
        this.al = xvsVar.s;
        this.am = xvsVar.t;
        this.an = xvsVar.u;
        this.ao = xvsVar.v;
        this.aq = xvsVar.x;
        this.ap = xvsVar.w;
        this.aE = xvsVar.M;
        this.aF = xvsVar.N;
        this.aG = xvsVar.O;
        this.aH = xvsVar.P;
        this.ar = xvsVar.y;
        this.as = xvsVar.z;
        this.at = xvsVar.A;
        this.aA = xvsVar.H;
        this.aB = xvsVar.I;
        this.aw = xvsVar.D;
        this.au = xvsVar.B;
        this.av = xvsVar.C;
        this.ax = xvsVar.E;
        this.ay = xvsVar.F;
        this.az = xvsVar.G;
        this.aD = xvsVar.K;
        this.aC = xvsVar.f278J;
        this.aJ = xvsVar.L;
        this.aK = xvsVar.Q;
        this.p = xvsVar.b;
        this.q = xvsVar.c;
        this.X.addView(this.o);
    }

    public final void f(View view) {
        if (view.getVisibility() == 0) {
            int i = this.L;
            int i2 = this.g;
            wcy.q(view, i, i2, i, i2);
        }
    }

    public final void g(apyv apyvVar) {
        q(apyvVar, false);
        this.s.setVisibility(8);
        i(false);
    }

    public final void h(apmg apmgVar, acra acraVar, Map map) {
        apxf apxfVar;
        int i = apmgVar.b;
        if ((i & 16384) != 0) {
            apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            if ((i & 32768) == 0) {
                return;
            }
            apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        if ((apmgVar.b & 1048576) != 0) {
            acraVar.I(3, new acqx(apmgVar.t), null);
        }
        if (map != null) {
            map.put("com.google.android.libraries.youtube.comment.action_tag", "");
        }
        this.d.c(apxfVar, map);
    }

    public final void i(boolean z) {
        TextView textView = this.aJ;
        if (textView != null) {
            yny.z(this.aJ, yny.v(textView.getResources().getDimensionPixelOffset(true != z ? R.dimen.comment_replies_metadata_top_margin : R.dimen.comment_replies_metadata_top_margin_with_read_more)), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.yak
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        apyv apyvVar;
        audq audqVar = (audq) obj;
        apjn apjnVar = this.A.B;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        if (apjnVar.b == 99391126) {
            xpa xpaVar = (xpa) this.aR.c("commentThreadMutator");
            aone createBuilder = apjn.a.createBuilder();
            createBuilder.copyOnWrite();
            apjn apjnVar2 = (apjn) createBuilder.instance;
            audqVar.getClass();
            apjnVar2.c = audqVar;
            apjnVar2.b = 99391126;
            apjn apjnVar3 = (apjn) createBuilder.build();
            aone builder = this.A.toBuilder();
            builder.copyOnWrite();
            apyv apyvVar2 = (apyv) builder.instance;
            apjnVar3.getClass();
            apyvVar2.B = apjnVar3;
            apyvVar2.c |= 256;
            apyv apyvVar3 = (apyv) builder.build();
            if (!this.aS.f(this.A) && apyvVar3.G.size() > 0) {
                this.aS.b(apyvVar3);
            }
            if (this.aS.e(this.A) != apyvVar3.N) {
                yap yapVar = this.aS;
                yapVar.d(apyvVar3, yapVar.e(this.A));
            }
            apyv a = this.aS.a(this.A);
            apyx apyxVar = apyvVar3.E;
            if (apyxVar == null) {
                apyxVar = apyx.a;
            }
            if (apyxVar.b == 62285947) {
                apyvVar = (apyv) apyxVar.c;
            } else {
                apyvVar = apyv.a;
            }
            if (!amkq.b(a, apyvVar)) {
                yap yapVar2 = this.aS;
                yapVar2.c(apyvVar3, yapVar2.a(this.A));
            }
            this.A = apyvVar3;
            E(apyvVar3, xpaVar.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
    
        if (r2.i.equals(r12.i) != false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x061c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0337  */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 2554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvt.oB(ajok, java.lang.Object):void");
    }

    private static final void F(View view, aott aottVar) {
        if (aottVar == null || (aottVar.b & 1) == 0) {
            view.setContentDescription("");
            return;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        view.setContentDescription(aotsVar.c);
    }
}
