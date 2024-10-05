package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatMessageBuyFlowRendererOuterClass;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablm implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnFocusChangeListener, ajom, abqc, ajyu, abqa {
    private final ImageView A;
    private final ImageView B;
    private final TextView C;
    private final View D;
    private final View E;
    private final TextView F;
    private final TextView G;
    private final LinearLayout H;
    private final TextView I;

    /* renamed from: J, reason: collision with root package name */
    private final ImageView f24J;
    private final TextView K;
    private final TextView L;
    private final TextView M;
    private final ImageView N;
    private final View O;
    private final View P;
    private final View Q;
    private final ViewGroup R;
    private final ImageView S;
    private final View T;
    private final View U;
    private final TextView V;
    private final ImageView W;
    private final TextView X;
    private final TextView Y;
    private final SeekBar Z;
    protected final View a;
    private final ajsf aA;
    private final acpk aB;
    private final ajyw aC;
    private final ProgressBar aa;
    private final View ab;
    private final ajrz ac;
    private final abjr ad;
    private final abhc ae;
    private final abht af;
    private final abge ag;
    private final zaw ah;
    private final Map ai;
    private final int ak;
    private int am;
    private boolean an;
    private long ao;
    private String ap;
    private abqf aq;
    private apxf ar;
    private final abpz as;
    private aqsv at;
    private boolean au;
    private boolean av;
    private final acra aw;
    private boolean ax;
    private final abll ay;
    protected final TextView b;
    protected final ImageView c;
    protected final EditText d;
    protected final Context e;
    protected final Button f;
    protected boolean g;
    protected boolean h;
    public final aahd i;
    public final EditText j;
    public final ajkj k;
    public final ajkj l;
    public yhe m;
    public final abji n;
    public long o;
    public int p;
    public aspz q;
    private NumberFormat r;
    private acsa s;
    private final TextView t;
    private final TextView u;
    private final abjt v;
    private final ajut w;
    private final TextWatcher x = new abli(this, 1);
    private final TextWatcher y = new abli(this, 0);
    private final Runnable z = new ablj(this);
    private final StringBuilder aj = new StringBuilder();
    private ajok al = new ajok();
    private int az = 1;

    public ablm(Context context, ajjs ajjsVar, abjt abjtVar, aahd aahdVar, ajut ajutVar, abji abjiVar, abjr abjrVar, acpk acpkVar, abhc abhcVar, ajsd ajsdVar, ajyw ajywVar, abht abhtVar, abge abgeVar, zaw zawVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = context;
        this.v = abjtVar;
        this.i = aahdVar;
        this.w = ajutVar;
        this.n = abjiVar;
        this.ad = abjrVar;
        this.aB = acpkVar;
        this.ae = abhcVar;
        this.aC = ajywVar;
        this.af = abhtVar;
        this.ag = abgeVar;
        this.ah = zawVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_purchase_flow_item, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.A = (ImageView) inflate.findViewById(R.id.back_button);
        this.B = (ImageView) inflate.findViewById(R.id.help_button);
        this.f = (Button) inflate.findViewById(R.id.buy_button);
        this.C = (TextView) inflate.findViewById(R.id.message_ticker_duration);
        this.V = (TextView) inflate.findViewById(R.id.character_count);
        this.U = inflate.findViewById(R.id.purchase_flow_input_panel_container);
        this.E = inflate.findViewById(R.id.heading);
        this.F = (TextView) inflate.findViewById(R.id.heading_title);
        this.G = (TextView) inflate.findViewById(R.id.heading_description);
        this.D = inflate.findViewById(R.id.message_header);
        this.O = inflate.findViewById(R.id.purchase_flow_message_settings_container);
        this.P = inflate.findViewById(R.id.purchase_flow_currency_and_price_container);
        this.Q = inflate.findViewById(R.id.message_body);
        this.K = (TextView) inflate.findViewById(R.id.author_name);
        this.L = (TextView) inflate.findViewById(R.id.header_text);
        this.M = (TextView) inflate.findViewById(R.id.header_subtext);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.header_currency_image);
        this.N = imageView;
        EditText editText = (EditText) inflate.findViewById(R.id.edit_message);
        this.d = editText;
        this.H = (LinearLayout) inflate.findViewById(R.id.footer_body);
        this.I = (TextView) inflate.findViewById(R.id.footer_text);
        this.f24J = (ImageView) inflate.findViewById(R.id.footer_icon);
        this.c = (ImageView) inflate.findViewById(R.id.author_image);
        this.Z = (SeekBar) inflate.findViewById(R.id.tier_seek_bar);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.purchase_flow_currency_image);
        this.W = imageView2;
        this.X = (TextView) inflate.findViewById(R.id.currency_symbol);
        this.j = (EditText) inflate.findViewById(R.id.buy_price);
        this.Y = (TextView) inflate.findViewById(R.id.currency_code);
        this.t = (TextView) inflate.findViewById(R.id.error_message);
        this.u = (TextView) inflate.findViewById(R.id.public_disclosure);
        this.aa = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.ab = inflate.findViewById(R.id.buy_frame);
        this.T = inflate.findViewById(R.id.underline);
        this.S = (ImageView) inflate.findViewById(R.id.emoji_picker_icon);
        this.R = (ViewGroup) inflate.findViewById(R.id.emoji_button_container);
        this.aw = abhtVar.p;
        ajsh ajshVar = new ajsh(inflate);
        this.ac = new ajrz(context, ajutVar, ajsdVar, true, ajshVar, false);
        this.aA = new ajsf(context, ajsdVar, true, ajshVar);
        this.ak = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_overlay_action_panel_container_margin_bottom);
        this.k = new ajkj(ajjsVar, imageView2);
        this.l = new ajkj(ajjsVar, imageView);
        this.as = new abpz();
        editText.setFilters(new InputFilter[]{new abjw()});
        editText.addTextChangedListener(new ajsj(editText, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift)));
        ahbw.w(inflate, this);
        HashMap hashMap = new HashMap();
        this.ai = hashMap;
        hashMap.put("YpcTransactionListener", new ablk(this));
        this.ay = new abll(this);
    }

    private final void A(boolean z) {
        int i = ((LinearLayout.LayoutParams) this.U.getLayoutParams()).bottomMargin;
        h(z);
        if (z) {
            if (this.av) {
                this.O.setVisibility(8);
                i = this.ak;
            }
            this.n.f((ViewGroup) this.a, this.at, this.d, this);
        } else {
            this.n.d();
            if (this.av) {
                this.O.setVisibility(0);
                i = 0;
            }
        }
        yny.z(this.U, yny.k(i), ViewGroup.MarginLayoutParams.class);
    }

    private final void B(int i, int i2) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.D.getBackground();
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.Q.getBackground();
        GradientDrawable gradientDrawable3 = (GradientDrawable) this.H.getBackground();
        if (gradientDrawable == null || gradientDrawable2 == null || gradientDrawable3 == null) {
            return;
        }
        abpz abpzVar = this.as;
        if (i == abpzVar.c) {
            return;
        }
        ValueAnimator valueAnimator = abpzVar.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = abpzVar.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        int i3 = abpzVar.c;
        if (i3 == 0) {
            i3 = i;
        }
        objArr[0] = Integer.valueOf(i3);
        objArr[1] = Integer.valueOf(i);
        abpzVar.a = ValueAnimator.ofObject(argbEvaluator, objArr);
        abpzVar.a.setDuration(250L);
        abpzVar.a.addUpdateListener(new abpx(gradientDrawable));
        AnimatorSet animatorSet = new AnimatorSet();
        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
        Object[] objArr2 = new Object[2];
        int i4 = abpzVar.d;
        if (i4 == 0) {
            i4 = i2;
        }
        objArr2[0] = Integer.valueOf(i4);
        objArr2[1] = Integer.valueOf(i2);
        abpzVar.b = ValueAnimator.ofObject(argbEvaluator2, objArr2);
        abpzVar.b.setDuration(250L);
        abpzVar.b.addUpdateListener(new abpy(gradientDrawable2, gradientDrawable3));
        animatorSet.play(abpzVar.a).with(abpzVar.b);
        abpzVar.d = i2;
        animatorSet.start();
        abpzVar.c = i;
    }

    private final double r(long j) {
        long j2 = this.ao;
        if (j2 == 0) {
            return 0.0d;
        }
        double d = j - (j % j2);
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    private final asqb s() {
        aspz aspzVar = this.q;
        if (aspzVar == null || aspzVar.g.size() == 0 || this.am > this.q.g.size()) {
            return null;
        }
        aspz aspzVar2 = this.q;
        return (asqb) aspzVar2.g.get(this.am);
    }

    private final String t(long j) {
        return String.format("%s %s", g(j), this.Y.getText());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablm.u():void");
    }

    private final void v(asrl asrlVar) {
        EditText editText = this.d;
        aqyg aqygVar = asrlVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        editText.setHint(ajcq.b(aqygVar));
        aspz aspzVar = this.q;
        if (aspzVar != null) {
            asrh asrhVar = aspzVar.f;
            if (asrhVar == null) {
                asrhVar = asrh.a;
            }
            if (asrhVar.c.size() > 0 && !this.ax) {
                asrh asrhVar2 = this.q.f;
                if (asrhVar2 == null) {
                    asrhVar2 = asrh.a;
                }
                asrh asrhVar3 = asrhVar2;
                aqyg a = this.n.c.a(asrhVar3);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Spanned b = ajcq.b(a);
                spannableStringBuilder.append((CharSequence) b);
                this.aA.g(a, b, spannableStringBuilder, new StringBuilder(), asrhVar3, this.d.getId());
                this.d.setText(spannableStringBuilder);
                this.ax = true;
            }
        }
        EditText editText2 = this.d;
        int i = asrlVar.d;
        if (i != editText2.getCurrentHintTextColor()) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(editText2.getCurrentHintTextColor()), Integer.valueOf(i));
            ofObject.setDuration(250L);
            ofObject.addUpdateListener(new abpv(editText2, 2));
            ofObject.start();
        }
        EditText editText3 = this.d;
        final int i2 = asrlVar.f;
        final int i3 = asrlVar.e;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ablg
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ablm.this.q(z, i2, i3);
            }
        });
        q(this.d.hasFocus(), i2, i3);
        this.p = asrlVar.g;
        int i4 = asrlVar.f;
        double red = Color.red(i4);
        Double.isNaN(red);
        double green = Color.green(i4);
        Double.isNaN(green);
        double d = (red * 0.2126d) + (green * 0.7152d);
        double blue = Color.blue(i4);
        Double.isNaN(blue);
        this.au = d + (blue * 0.0722d) > 25.0d;
        h(this.n.h);
        this.Q.setVisibility(0);
    }

    private final void w() {
        asqb s = s();
        if (s != null) {
            int i = s.b & 64;
            aqyg aqygVar = null;
            if (i == 0) {
                this.C.setText((CharSequence) null);
            } else {
                TextView textView = this.C;
                if (i != 0 && (aqygVar = s.g) == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
            }
            long j = s.e;
            this.o = j;
            o(j == 0 ? 0 : this.n.b(this.d.getText(), this.p), this.o);
        }
    }

    private final void x() {
        asqb s = s();
        if (s != null) {
            long j = s.c;
            this.j.setText(g(j));
            this.Z.setContentDescription(t(j));
        }
    }

    private final void y(aspq aspqVar) {
        aqyg aqygVar;
        if (aspqVar == null) {
            return;
        }
        TextView textView = this.I;
        if ((aspqVar.b & 2) != 0) {
            aqygVar = aspqVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((aspqVar.b & 1) != 0) {
            ajut ajutVar = this.w;
            arfs arfsVar = aspqVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b);
            if (a != 0) {
                this.f24J.setImageResource(a);
            }
        }
        this.H.setVisibility(0);
    }

    private final void z(int i) {
        yny.z(this.I, yny.v(i), ViewGroup.MarginLayoutParams.class);
        yny.z(this.f24J, yny.v(i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        throw null;
    }

    public abstract void d(avgg avggVar);

    public abstract void e();

    public final long f(String str) {
        try {
            return new BigDecimal((this.an ? this.aq.b.parse(str) : this.r.parse(str)).doubleValue(), MathContext.DECIMAL64).setScale((int) (Math.log10(1000000.0d) - Math.log10(this.ao)), RoundingMode.HALF_EVEN).scaleByPowerOfTen(6).longValue();
        } catch (ParseException unused) {
            zga.b("Failed to parse buyBucket purchase amount.");
            return 0L;
        }
    }

    public final String g(long j) {
        if (this.an) {
            abqf abqfVar = this.aq;
            String format = abqfVar.b.format(r(j));
            return (abqfVar.f && "BYN".equals(abqfVar.a)) ? format.replaceAll("(?i)BYR", "BYN") : format;
        }
        return this.r.format(r(j));
    }

    public final void h(boolean z) {
        if (z) {
            this.S.setImageResource(true != this.au ? R.drawable.ic_emoji_dark_on : R.drawable.ic_emoji_light_on);
            this.S.setContentDescription(this.e.getResources().getString(R.string.close_emoji_picker_button_cd));
        } else {
            this.S.setImageResource(true != this.au ? R.drawable.ic_emoji_dark_off : R.drawable.ic_emoji_light_off);
            this.S.setContentDescription(this.e.getResources().getString(R.string.open_emoji_picker_button_cd));
        }
    }

    public final void i(CharSequence charSequence) {
        n(false);
        whu.G(this.t, charSequence);
    }

    public final void j() {
        Object c = this.al.c("listenerKey");
        acpk acpkVar = this.aB;
        if (acpkVar != null) {
            acpkVar.e(true != this.av ? 2 : 3, 3);
        }
        if (c instanceof abqe) {
            ((abqe) c).r();
        }
        Iterator it = this.ae.a.iterator();
        while (it.hasNext()) {
            ((abjn) it.next()).c();
        }
    }

    @Override // defpackage.abqc
    public final void k() {
        n(false);
    }

    public final void l(String str) {
        asqj asqjVar;
        avgg avggVar;
        asqb s = s();
        if (TextUtils.isEmpty(str) && s != null) {
            str = g(s.c);
        }
        if (TextUtils.isEmpty(str)) {
            this.N.setVisibility(8);
            return;
        }
        if (s == null) {
            avggVar = null;
        } else {
            asqa asqaVar = s.f;
            if (asqaVar == null) {
                asqaVar = asqa.a;
            }
            if (asqaVar.b == 132496275) {
                asqjVar = (asqj) asqaVar.c;
            } else {
                asqjVar = asqj.a;
            }
            aqhu aqhuVar = asqjVar.j;
            if (aqhuVar == null) {
                aqhuVar = aqhu.a;
            }
            avggVar = aqhuVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        }
        if (ahbw.L(avggVar)) {
            this.N.setVisibility(0);
            this.l.k(avggVar);
        } else {
            this.N.setVisibility(8);
        }
        if (!this.an || TextUtils.isEmpty(this.ap)) {
            this.L.setText(str);
        } else {
            this.L.setText(this.e.getResources().getString(R.string.live_chat_purchase_amount, this.ap, str));
        }
    }

    @Override // defpackage.abqa
    public final void n(boolean z) {
        if (this.aa != null) {
            this.f.setVisibility(true != z ? 0 : 8);
            this.aa.setVisibility(true != z ? 8 : 0);
            this.ab.setBackground(z ? this.f.getBackground() : null);
            return;
        }
        this.f.setEnabled(!z);
    }

    @Override // defpackage.ajyu
    public final void na() {
        A(false);
        if (this.d.getVisibility() == 0) {
            this.d.requestFocus();
            whu.J(this.d);
        }
    }

    public final void o(int i, long j) {
        String string = this.e.getResources().getString(R.string.character_count, Integer.valueOf(i), Long.valueOf(j));
        int d = aih.d(this.e, this.v.a(2));
        int Q = wbs.Q(this.e, R.attr.ytTextSecondary);
        this.V.setText(string);
        if (i > this.o) {
            this.V.setTextColor(d);
            this.g = true;
        } else if (this.g) {
            this.V.setTextColor(Q);
            this.g = false;
        }
        e();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aspu aspuVar;
        aqyg aqygVar2;
        apmg apmgVar;
        int i;
        aqyg aqygVar3;
        apmg apmgVar2;
        apmg apmgVar3;
        final aqkv aqkvVar;
        aspz aspzVar = (aspz) obj;
        if (ajokVar != null) {
            this.al = ajokVar;
        }
        abjr abjrVar = this.ad;
        if (abjrVar != null) {
            this.av = abjrVar.c;
        }
        this.q = aspzVar;
        Iterator it = aspzVar.n.iterator();
        while (true) {
            aqygVar = null;
            if (!it.hasNext()) {
                this.at = null;
                break;
            }
            asqe asqeVar = (asqe) it.next();
            if (asqeVar.b == 126326492) {
                this.at = (aqsv) asqeVar.c;
                break;
            }
        }
        boolean z = true;
        this.an = aspzVar.c == 4;
        this.A.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.L.setOnClickListener(this);
        aulq aulqVar = aspzVar.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aooy m = ahbj.m(aulqVar);
        if (m instanceof avvm) {
            if (this.m == null) {
                ajyw ajywVar = this.aC;
                ViewStub viewStub = (ViewStub) this.a.findViewById(R.id.balance_stub);
                aahd aahdVar = (aahd) ajywVar.a.get();
                aahdVar.getClass();
                ajjz ajjzVar = (ajjz) ajywVar.b.get();
                ajjzVar.getClass();
                aahv aahvVar = (aahv) ajywVar.c.get();
                aahvVar.getClass();
                viewStub.getClass();
                this.m = new yhe(aahdVar, ajjzVar, aahvVar, viewStub);
            }
            this.m.oB(ajokVar, (avvm) m);
        }
        this.d.addTextChangedListener(this.x);
        if (this.at == null) {
            this.S.setVisibility(8);
            this.R.setOnClickListener(null);
        } else {
            this.S.setVisibility(0);
            this.R.setOnClickListener(this);
            h(false);
        }
        EditText editText = this.d;
        editText.addTextChangedListener(this.n.c(editText));
        aspz aspzVar2 = this.q;
        if (aspzVar2 != null) {
            aspy aspyVar = aspzVar2.m;
            if (aspyVar == null) {
                aspyVar = aspy.a;
            }
            if (aspyVar.b == 53345347) {
                aspx aspxVar = this.q.l;
                if (aspxVar == null) {
                    aspxVar = aspx.a;
                }
                if (aspxVar.b == 65153809) {
                    apmgVar2 = (apmg) aspxVar.c;
                } else {
                    apmgVar2 = apmg.a;
                }
                if ((apmgVar2.b & 32) != 0) {
                    ajut ajutVar = this.w;
                    aspx aspxVar2 = this.q.l;
                    if (aspxVar2 == null) {
                        aspxVar2 = aspx.a;
                    }
                    if (aspxVar2.b == 65153809) {
                        apmgVar3 = (apmg) aspxVar2.c;
                    } else {
                        apmgVar3 = apmg.a;
                    }
                    arfs arfsVar = apmgVar3.g;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    int a = ajutVar.a(b);
                    if (a != 0) {
                        this.B.setImageResource(a);
                    }
                    aspy aspyVar2 = this.q.m;
                    if (aspyVar2 == null) {
                        aspyVar2 = aspy.a;
                    }
                    if (aspyVar2.b == 53345347) {
                        aqkvVar = (aqkv) aspyVar2.c;
                    } else {
                        aqkvVar = aqkv.a;
                    }
                    this.B.setOnClickListener(new View.OnClickListener() { // from class: ablf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ablm ablmVar = ablm.this;
                            aqkv aqkvVar2 = aqkvVar;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            boolean z2 = true;
                            for (aqyg aqygVar4 : aqkvVar2.f) {
                                if (!z2) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                }
                                spannableStringBuilder.append((CharSequence) aahk.a(aqygVar4, ablmVar.i, false));
                                z2 = false;
                            }
                            View inflate = View.inflate(ablmVar.e, R.layout.live_chat_simple_text_view, null);
                            int dimensionPixelOffset = ablmVar.e.getResources().getDimensionPixelOffset(R.dimen.live_chat_simple_dialog_text_padding);
                            TextView textView = (TextView) inflate.findViewById(R.id.text);
                            textView.setTextColor(wbs.Q(ablmVar.e, R.attr.ytTextSecondary));
                            jm.s(textView, 2132083639);
                            textView.setLineSpacing(r4.getDimensionPixelOffset(R.dimen.live_chat_dialog_message_line_spacing_extra), 1.0f);
                            textView.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0);
                            textView.setText(spannableStringBuilder);
                            ScrollView scrollView = new ScrollView(ablmVar.e);
                            scrollView.addView(inflate);
                            mh mhVar = new mh(ablmVar.e);
                            mhVar.o(aqkvVar2.d);
                            mhVar.h(android.R.string.ok, null);
                            mhVar.p(scrollView);
                            mhVar.b().show();
                        }
                    });
                }
            }
        }
        if ((aspzVar.b & 262144) != 0) {
            TextView textView = this.u;
            aqyg aqygVar4 = aspzVar.s;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar4));
            this.u.setVisibility(0);
        }
        aspz aspzVar3 = this.q;
        if (aspzVar3 != null) {
            aspv aspvVar = aspzVar3.k;
            if (aspvVar == null) {
                aspvVar = aspv.a;
            }
            if (aspvVar.b == 65153809) {
                aspv aspvVar2 = this.q.k;
                if (aspvVar2 == null) {
                    aspvVar2 = aspv.a;
                }
                if (aspvVar2.b == 65153809) {
                    apmgVar = (apmg) aspvVar2.c;
                } else {
                    apmgVar = apmg.a;
                }
                if (apmgVar.c != 1 || (i = anaf.aJ(((Integer) apmgVar.d).intValue())) == 0) {
                    i = 1;
                }
                this.az = i;
                m();
                apxf apxfVar = apmgVar.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                this.ar = apxfVar;
                Button button = this.f;
                if ((apmgVar.b & 256) != 0) {
                    aqygVar3 = apmgVar.i;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                button.setText(ajcq.b(aqygVar3));
                acqx acqxVar = new acqx(apmgVar.t);
                this.s = acqxVar;
                this.aw.n(acqxVar);
            }
        }
        this.ao = aspzVar.i;
        if (this.an) {
            String str = aspzVar.c == 4 ? (String) aspzVar.d : "";
            this.Y.setText(str);
            abqf abqfVar = new abqf(str, aspzVar.h);
            this.aq = abqfVar;
            String str2 = abqfVar.e;
            this.ap = str2;
            this.X.setText(str2);
            this.Y.setVisibility(0);
            this.X.setVisibility(0);
            this.W.setVisibility(8);
        } else {
            this.Y.setVisibility(8);
            this.X.setVisibility(8);
            if (aspzVar.c == 21) {
                aspuVar = (aspu) aspzVar.d;
            } else {
                aspuVar = aspu.a;
            }
            aqhu aqhuVar = aspuVar.b;
            if (aqhuVar == null) {
                aqhuVar = aqhu.a;
            }
            avgg avggVar = aqhuVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (ahbw.L(avggVar)) {
                this.k.k(avggVar);
                this.W.setVisibility(0);
            } else {
                this.W.setVisibility(8);
            }
        }
        TextView textView2 = this.b;
        aqyg aqygVar5 = aspzVar.e;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar5));
        if (!TextUtils.isEmpty(this.b.getText())) {
            TextView textView3 = this.b;
            textView3.announceForAccessibility(textView3.getText());
        }
        this.aw.u(new acqx(aspzVar.q), null);
        if (aspzVar.g.size() > 0) {
            int max = Math.max(0, aspzVar.g.size() - 1);
            this.Z.setMax(max);
            if (s() != null) {
                if (this.an) {
                    NumberFormat numberFormat = NumberFormat.getInstance(this.aq.c);
                    this.r = numberFormat;
                    numberFormat.setCurrency(this.aq.d);
                } else {
                    NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.US);
                    this.r = numberFormat2;
                    numberFormat2.setGroupingUsed(false);
                }
                this.r.setMaximumFractionDigits(0);
                x();
                w();
                l(null);
                aspz aspzVar4 = this.q;
                if ((aspzVar4.b & 8192) != 0) {
                    aulq aulqVar2 = aspzVar4.o;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    aspw aspwVar = (aspw) aulqVar2.pX(LiveChatMessageBuyFlowRendererOuterClass.liveChatMessageBuyFlowHeadingRenderer);
                    if (aspwVar != null) {
                        TextView textView4 = this.F;
                        if ((aspwVar.b & 1) != 0) {
                            aqygVar2 = aspwVar.c;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        textView4.setText(ajcq.b(aqygVar2));
                        int i2 = aspwVar.b & 2;
                        if (i2 != 0) {
                            if (i2 != 0 && (aqygVar = aspwVar.d) == null) {
                                aqygVar = aqyg.a;
                            }
                            Spanned c = ajcq.c(aqygVar, new ajck() { // from class: ablh
                                @Override // defpackage.ajck
                                public final ClickableSpan a(apxf apxfVar2) {
                                    return aahi.a(false).a(ablm.this.i, null, apxfVar2);
                                }
                            });
                            if (!TextUtils.isEmpty(c)) {
                                this.G.setText(c);
                                this.G.setMovementMethod(LinkMovementMethod.getInstance());
                                this.G.setVisibility(0);
                            }
                        }
                        this.E.setVisibility(0);
                    } else {
                        this.E.setVisibility(8);
                    }
                }
                this.Z.setOnSeekBarChangeListener(this);
                p(aspzVar.j);
                u();
                x();
                this.j.setOnFocusChangeListener(this);
                this.j.addTextChangedListener(this.y);
                String format = this.r.format(r(((asqb) aspzVar.g.get(max)).d));
                int max2 = Math.max(0, format.length());
                this.aj.setLength(0);
                this.aj.append("0123456789");
                if (this.an) {
                    DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(this.aq.c);
                    String valueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                    char groupingSeparator = decimalFormatSymbols.getGroupingSeparator();
                    if (this.aq.b.getMinimumFractionDigits() > 0) {
                        this.aj.append(valueOf);
                    }
                    if (this.aq.b.isGroupingUsed() && format.indexOf(groupingSeparator) >= 0) {
                        this.aj.append(groupingSeparator);
                    }
                    this.j.setKeyListener(DigitsKeyListener.getInstance(this.aj.toString()));
                    this.j.setFilters(new InputFilter[]{new abmi(valueOf, groupingSeparator, max2, this.aq.d.getDefaultFractionDigits())});
                } else {
                    this.j.setKeyListener(DigitsKeyListener.getInstance(this.aj.toString()));
                    this.j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(max2)});
                }
            }
        }
        if ((aspzVar.b & 131072) != 0 && aspzVar.r) {
            z = false;
        }
        whu.I(this.P, z);
        whu.I(this.Z, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String charSequence;
        if (view == this.A) {
            Object c = this.al.c("listenerKey");
            if (c instanceof abqe) {
                ((abqe) c).s();
                return;
            }
            return;
        }
        if (view == this.f) {
            n(true);
            if (this.ar.pY(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint)) {
                Object c2 = this.al.c("listenerKey");
                abqe abqeVar = c2 instanceof abqe ? (abqe) c2 : null;
                HashMap hashMap = new HashMap();
                abht abhtVar = this.af;
                abge abgeVar = this.ag;
                zaw zawVar = this.ah;
                abji abjiVar = this.n;
                ajsa ajsaVar = abjiVar.c;
                asrh a = abjiVar.a(this.d.getText());
                SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) this.ar.pX(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
                if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d.isEmpty()) {
                    if (Log.isLoggable("LiveChatBuyFlow", 6)) {
                        Log.e("LiveChatBuyFlow", "No client ID prefix provided for message endpoint!");
                    }
                    charSequence = String.valueOf(System.currentTimeMillis());
                } else {
                    charSequence = TextUtils.concat(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d, String.valueOf(System.currentTimeMillis())).toString();
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abiu(abhtVar, abgeVar, zawVar, ajsaVar, a, charSequence, abqeVar, this, this.t));
                this.i.c(this.ar, hashMap);
                return;
            }
            asqb s = s();
            if (s != null) {
                long f = f(this.j.getText().toString());
                if (this.ar == null || f <= 0) {
                    return;
                }
                this.aw.I(3, this.s, null);
                this.t.setVisibility(8);
                if (!this.n.c.h() || s.e == 0) {
                    CharSequence text = s.e == 0 ? "" : this.d.getText();
                    if (this.ar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                        aone builder = ((YpcGetCartEndpoint$YPCGetCartEndpoint) this.ar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).toBuilder();
                        builder.copyOnWrite();
                        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.instance;
                        ypcGetCartEndpoint$YPCGetCartEndpoint.b |= 8;
                        ypcGetCartEndpoint$YPCGetCartEndpoint.f = f;
                        String charSequence2 = text.toString();
                        builder.copyOnWrite();
                        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.instance;
                        charSequence2.getClass();
                        ypcGetCartEndpoint$YPCGetCartEndpoint2.b |= 16;
                        ypcGetCartEndpoint$YPCGetCartEndpoint2.g = charSequence2;
                        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint3 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.build();
                        aong aongVar = (aong) this.ar.toBuilder();
                        aongVar.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, ypcGetCartEndpoint$YPCGetCartEndpoint3);
                        apxf apxfVar = (apxf) aongVar.build();
                        this.ar = apxfVar;
                        this.i.c(apxfVar, this.ai);
                        return;
                    }
                    if (this.ar.pY(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint)) {
                        apxf apxfVar2 = this.ar;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("HANDLE_TRANSACTION_CALLBACK", this.ay);
                        hashMap2.put("PURCHASE_PRICE_MICROS", Long.valueOf(f));
                        hashMap2.put("CLIENT_CHAT_MESSAGE_TEXT", text);
                        this.i.c(apxfVar2, hashMap2);
                        return;
                    }
                    return;
                }
                asrh a2 = this.n.a(this.d.getText());
                if (this.ar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                    aone builder2 = ((YpcGetCartEndpoint$YPCGetCartEndpoint) this.ar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).toBuilder();
                    builder2.copyOnWrite();
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint4 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder2.instance;
                    ypcGetCartEndpoint$YPCGetCartEndpoint4.b |= 8;
                    ypcGetCartEndpoint$YPCGetCartEndpoint4.f = f;
                    builder2.copyOnWrite();
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint5 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder2.instance;
                    a2.getClass();
                    ypcGetCartEndpoint$YPCGetCartEndpoint5.h = a2;
                    ypcGetCartEndpoint$YPCGetCartEndpoint5.b |= 32;
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint6 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder2.build();
                    aong aongVar2 = (aong) this.ar.toBuilder();
                    aongVar2.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, ypcGetCartEndpoint$YPCGetCartEndpoint6);
                    apxf apxfVar3 = (apxf) aongVar2.build();
                    this.ar = apxfVar3;
                    this.i.c(apxfVar3, this.ai);
                    return;
                }
                if (this.ar.pY(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint)) {
                    apxf apxfVar4 = this.ar;
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("HANDLE_TRANSACTION_CALLBACK", this.ay);
                    hashMap3.put("PURCHASE_PRICE_MICROS", Long.valueOf(f));
                    hashMap3.put("LIVE_CHAT_RICH_MESSAGE_INPUT", a2);
                    this.i.c(apxfVar4, hashMap3);
                    return;
                }
                return;
            }
            return;
        }
        if (view != this.L) {
            if (view == this.R) {
                A(!this.n.h);
            }
        } else if (this.P.getVisibility() == 0 && this.j.getVisibility() == 0 && this.j.requestFocus()) {
            whu.J(this.j);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EditText editText = this.j;
        if (view == editText) {
            if (z) {
                editText.getBackground().setColorFilter(wbs.Q(this.e, R.attr.ytCallToAction), PorterDuff.Mode.SRC_ATOP);
                this.j.post(this.z);
            } else {
                editText.getBackground().setColorFilter(wbs.Q(this.e, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.am = i;
        if (z) {
            x();
            if (this.am > 0) {
                this.d.requestFocus();
            }
        }
        w();
        l(null);
        u();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.j.setFocusable(false);
        this.j.setFocusableInTouchMode(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        asqj asqjVar;
        this.j.setFocusable(true);
        this.j.setFocusableInTouchMode(true);
        asqb s = s();
        if (s != null) {
            asqa asqaVar = s.f;
            if (asqaVar == null) {
                asqaVar = asqa.a;
            }
            if (asqaVar.b == 132496275) {
                asqjVar = (asqj) asqaVar.c;
            } else {
                asqjVar = asqj.a;
            }
            if (asqjVar.c == 6 && ((Boolean) asqjVar.d).booleanValue()) {
                whu.C(this.d);
            }
        }
    }

    public final void p(long j) {
        aspz aspzVar = this.q;
        if (aspzVar == null || aspzVar.g.size() == 0) {
            return;
        }
        int size = this.q.g.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            asqb asqbVar = (asqb) this.q.g.get(i2);
            if (i2 == 0) {
                if (j < asqbVar.c) {
                    this.am = i;
                    this.Z.setProgress(i);
                    this.Z.setContentDescription(t(j));
                    return;
                }
                i2 = 0;
            }
            if ((i2 == size - 1 && j > asqbVar.d) || (j >= asqbVar.c && j <= asqbVar.d)) {
                i = i2;
                this.am = i;
                this.Z.setProgress(i);
                this.Z.setContentDescription(t(j));
                return;
            }
            i2++;
        }
    }

    public final void q(boolean z, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.T.getLayoutParams();
        if (z) {
            layoutParams.height = this.T.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_focused);
            this.T.setBackgroundColor(i);
        } else {
            layoutParams.height = this.T.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_unfocused);
            this.T.setBackgroundColor(i2);
        }
        this.T.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        Drawable a;
        int i = this.az;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 4) {
            a = aii.a(this.e, R.drawable.live_chat_action_button_background_grey_dark);
        } else {
            a = i2 != 6 ? wbs.T(this.e, R.attr.liveChatActionButtonBackgroundPrimary) : aii.a(this.e, R.drawable.live_chat_action_button_background_payment);
        }
        whu.E(this.f, a);
    }
}
