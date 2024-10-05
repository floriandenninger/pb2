package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.livechat.innertube.CreatorSupportPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.ProductPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abns implements abjn, zfk, ajyu {
    private static final long w = TimeUnit.SECONDS.toMillis(5);
    private TextWatcher A;
    private int B;
    private ImageView C;
    private ImageView D;
    private ViewGroup E;
    private boolean H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private final acpk f25J;
    private final advq K;
    protected final Context a;
    protected final acra b;
    protected final aahd c;
    protected final ajut d;
    protected final abjr e;
    protected final abji f;
    protected final ajsa g;
    protected final boolean i;
    protected final boolean j;
    public abjl k;
    protected aqsv l;
    public final akcy m;
    public Spanned n;
    public int o;
    public int p;
    protected abjm q;
    public List r;
    public boolean s;
    public boolean t;
    public abib u;
    protected final aoae v;
    private final Context x;
    private final Runnable F = new Runnable() { // from class: abng
        @Override // java.lang.Runnable
        public final void run() {
            abns.this.B(true);
        }
    };
    private final Handler G = new Handler();
    protected final boolean h = true;
    private final TextWatcher y = new abnq(this);
    private final InputFilter z = new abjw();

    public abns(Context context, zim zimVar, ajut ajutVar, aahd aahdVar, acra acraVar, abjr abjrVar, abji abjiVar, ajsa ajsaVar, acpk acpkVar, aoae aoaeVar, akcy akcyVar, advq advqVar, boolean z, boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.x = new ContextThemeWrapper(context, zimVar.a);
        this.d = ajutVar;
        this.c = aahdVar;
        this.b = acraVar;
        this.e = abjrVar;
        this.f = abjiVar;
        this.g = ajsaVar;
        this.f25J = acpkVar;
        this.v = aoaeVar;
        this.m = akcyVar;
        this.K = advqVar;
        this.i = z;
        this.j = z2;
    }

    public static final void K(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    private final ViewGroup L() {
        if (this.E == null) {
            this.E = (ViewGroup) n().findViewById(R.id.action_pills);
        }
        return this.E;
    }

    private final void M(ViewGroup viewGroup, final asph asphVar, final SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        if ((asphVar.b & 2) != 0) {
            arfs arfsVar = asphVar.d;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            View k = k(arfsVar);
            aott aottVar = asphVar.f;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            if ((aottVar.b & 1) != 0) {
                aott aottVar2 = asphVar.f;
                if (aottVar2 == null) {
                    aottVar2 = aott.a;
                }
                aots aotsVar = aottVar2.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                k.setContentDescription(aotsVar.c);
            }
            final acqx acqxVar = new acqx(asphVar.h);
            this.b.u(acqxVar, null);
            if (asphVar.g) {
                k.setOnClickListener(new View.OnClickListener() { // from class: abnm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        whu.L(abns.this.a, asphVar.e, 0);
                    }
                });
            } else if (supportedPickerPanelWrapper != null) {
                k.setOnClickListener(new View.OnClickListener() { // from class: abnj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abns abnsVar = abns.this;
                        SupportedPickerPanelWrapper supportedPickerPanelWrapper2 = supportedPickerPanelWrapper;
                        acqx acqxVar2 = acqxVar;
                        whu.C(abnsVar.r());
                        if (abnsVar.a instanceof ci) {
                            abnsVar.e.c = abnsVar.J();
                            abib abibVar = abnsVar.u;
                            if (abibVar != null) {
                                abibVar.a();
                            }
                            abjl abjlVar = abnsVar.k;
                            if (abjlVar != null) {
                                abjlVar.d();
                            }
                            adyu.dd(null, null, supportedPickerPanelWrapper2).qh(((ci) abnsVar.a).getSupportFragmentManager(), "purchase_dialog_fragment");
                        }
                        abnsVar.m.f();
                        abnsVar.b.I(3, acqxVar2, null);
                    }
                });
            }
            k.setTag(R.id.live_chat_picker_toggle_button_tag, asphVar.c);
            viewGroup.addView(k);
            aoae aoaeVar = this.v;
            if (aoaeVar != null) {
                aoaeVar.c(asphVar, k);
            }
        }
    }

    private final void N() {
        this.f.d();
        t().setAlpha(0.0f);
        t().setVisibility(4);
        s().setAlpha(1.0f);
        s().setVisibility(0);
        s().bringToFront();
    }

    private final void O(boolean z) {
        if (w() == null) {
            return;
        }
        r().setVisibility(true != z ? 0 : 8);
        w().setVisibility(true == z ? 0 : 8);
        t().setBackground(z ? null : whu.x(this.a, 0));
        this.H = z;
    }

    private final void P(boolean z) {
        if (this.l == null) {
            if (this.H) {
                return;
            }
            N();
            return;
        }
        G(false);
        o().setOnClickListener(new abnh(this, 2));
        if (this.t || !z) {
            B(false);
        } else {
            this.G.postDelayed(this.F, w);
        }
    }

    private final void Q() {
        K(o(), true);
        yny.z(r(), yny.r(0), ViewGroup.MarginLayoutParams.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(int i) {
        throw null;
    }

    public final void B(boolean z) {
        if (s().getVisibility() == 0 || t().getVisibility() != 0) {
            if (!z) {
                s().setVisibility(8);
                s().setAlpha(0.0f);
                t().setVisibility(0);
                t().setAlpha(1.0f);
                return;
            }
            s().setVisibility(0);
            t().setVisibility(0);
            t().animate().alpha(1.0f).setListener(null);
            s().animate().alpha(0.0f).setListener(new abnp(this)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        Editable h = h();
        if (this.k == null || TextUtils.isEmpty(h)) {
            return;
        }
        if (this.g.h()) {
            this.k.f(this.f.a(h));
        } else {
            this.k.g(h.toString().trim());
        }
        this.f25J.e(true != J() ? 2 : 3, 2);
        zev.c(this.a, u(), this.a.getResources().getString(R.string.live_chat_message_sent_accessibility_string));
        x();
        this.f.d();
        G(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(boolean z) {
        yny.z(l(), yny.n(z ? this.B : 0), ViewGroup.LayoutParams.class);
    }

    public final void E(int i) {
        ViewGroup L = L();
        if (L != null) {
            for (int i2 = 0; i2 < L.getChildCount(); i2++) {
                View childAt = L.getChildAt(i2);
                if (childAt.getVisibility() != i) {
                    childAt.setVisibility(i);
                    Object tag = childAt.getTag();
                    if (i == 0 && (tag instanceof acqx)) {
                        this.b.u((acqx) tag, null);
                    }
                }
            }
        }
    }

    public abstract void F(avgg avggVar);

    protected abstract void G(boolean z);

    protected final void H(boolean z) {
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_text_field_height);
        View m = m();
        m.setVisibility(true != z ? 8 : 0);
        m.setMinimumHeight(dimensionPixelOffset);
        ViewGroup p = p();
        p.setVisibility(true != z ? 0 : 8);
        p.setMinimumHeight(dimensionPixelOffset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void I() {
        abji abjiVar = this.f;
        if (!abjiVar.h) {
            abjiVar.f((ViewGroup) n(), this.l, r(), this);
            G(this.f.h);
            B(false);
        } else {
            abjiVar.d();
            G(this.f.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean J() {
        return false;
    }

    @Override // defpackage.abjn
    public void c() {
        r().setText("");
    }

    @Override // defpackage.abjn
    public void d(asqx asqxVar) {
        apmg apmgVar;
        asph asphVar;
        SupportedPickerPanelWrapper supportedPickerPanelWrapper;
        asrl asrlVar;
        D(true);
        p().removeAllViews();
        ViewGroup q = q();
        if (q != null) {
            int childCount = q.getChildCount();
            for (int i = 0; i < childCount; i++) {
                q.getChildAt(i).setOnClickListener(null);
            }
            q.removeAllViews();
        }
        ViewGroup L = L();
        if (L != null) {
            for (int i2 = 0; i2 < L.getChildCount(); i2++) {
                L.getChildAt(i2).setOnClickListener(null);
            }
            L.removeAllViews();
        }
        this.l = null;
        o().setOnClickListener(null);
        m().setOnClickListener(null);
        N();
        this.G.removeCallbacks(this.F);
        int i3 = asqxVar.b;
        if (i3 != 121323709) {
            if (i3 == 132498670) {
                y((asrf) asqxVar.c);
                return;
            } else {
                if (i3 == 58508690) {
                    z((atdn) asqxVar.c);
                    return;
                }
                return;
            }
        }
        asqf asqfVar = (asqf) asqxVar.c;
        boolean z = this.t;
        EditText r = r();
        Q();
        O(false);
        H(true);
        if (z) {
            B(false);
        } else {
            avgg avggVar = asqfVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            F(avggVar);
        }
        if (asqfVar != null && (asqfVar.b & 4) != 0) {
            asqg asqgVar = asqfVar.d;
            if (asqgVar == null) {
                asqgVar = asqg.a;
            }
            if (asqgVar.b == 121291266) {
                asrlVar = (asrl) asqgVar.c;
            } else {
                asrlVar = asrl.a;
            }
            aqyg aqygVar = asrlVar.b;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            this.n = ajcq.b(aqygVar);
            r.getText().clear();
            K(u(), false);
            r.setEnabled(true);
            r.setHint(i());
            this.o = asrlVar.c;
            this.p = asrlVar.g;
            r.setFilters(new InputFilter[]{this.z});
        }
        aulq aulqVar = asqfVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ViewGroup L2 = L();
        if (L2 != null && aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            final apmg apmgVar2 = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            final View inflate = LayoutInflater.from(this.x).inflate(R.layout.live_chat_action_panel_pill, (ViewGroup) null);
            arfs arfsVar = apmgVar2.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            if ((arfsVar.b & 1) != 0) {
                ajut ajutVar = this.d;
                arfs arfsVar2 = apmgVar2.g;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b = arfr.b(arfsVar2.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int a = ajutVar.a(b);
                if (a != 0) {
                    ((ImageView) inflate.findViewById(R.id.pill_icon)).setImageDrawable(aii.a(this.a, a));
                }
            }
            this.r = apmgVar2.q;
            TextView textView = (TextView) inflate.findViewById(R.id.pill_label);
            aqyg aqygVar2 = apmgVar2.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar2));
            inflate.setTag(new acqx(apmgVar2.t));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: abni
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abns abnsVar = abns.this;
                    View view2 = inflate;
                    apmg apmgVar3 = apmgVar2;
                    abjl abjlVar = abnsVar.k;
                    if (abjlVar != null) {
                        abjlVar.d();
                    }
                    Editable h = abnsVar.h();
                    asrh a2 = !TextUtils.isEmpty(h) ? abnsVar.f.a(h) : null;
                    Object tag = view2.getTag();
                    if (tag instanceof acqx) {
                        abnsVar.b.I(3, (acqx) tag, null);
                    }
                    aahd aahdVar = abnsVar.c;
                    apxf apxfVar = apmgVar3.p;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, a2 != null ? amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", a2) : null);
                }
            });
            inflate.setVisibility(4);
            L2.addView(inflate);
        }
        ViewGroup q2 = q();
        if (q2 != null) {
            q2.removeAllViews();
            if (asqfVar.f.size() != 0 && this.h) {
                for (asqd asqdVar : asqfVar.f) {
                    if (asqdVar.b == 132562777) {
                        arfs arfsVar3 = ((asph) asqdVar.c).d;
                        if (arfsVar3 == null) {
                            arfsVar3 = arfs.a;
                        }
                        arfr b2 = arfr.b(arfsVar3.c);
                        if (b2 == null) {
                            b2 = arfr.UNKNOWN;
                        }
                        if (b2 != arfr.EMOJI) {
                            if (asqdVar.b == 132562777) {
                                asphVar = (asph) asqdVar.c;
                            } else {
                                asphVar = asph.a;
                            }
                            asqe[] asqeVarArr = (asqe[]) asqfVar.e.toArray(new asqe[0]);
                            int length = asqeVarArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    supportedPickerPanelWrapper = null;
                                    break;
                                }
                                asqe asqeVar = asqeVarArr[i4];
                                if (asqeVar != null) {
                                    int i5 = asqeVar.b;
                                    if (i5 == 129042058) {
                                        supportedPickerPanelWrapper = new CreatorSupportPickerPanelWrapper((asow) asqeVar.c);
                                    } else if (i5 == 189846535) {
                                        supportedPickerPanelWrapper = new ProductPickerPanelWrapper((asqv) asqeVar.c);
                                    }
                                    if (supportedPickerPanelWrapper == null && (asphVar.b & 1) != 0 && asphVar.c.equals(supportedPickerPanelWrapper.a()) && supportedPickerPanelWrapper.b()) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                supportedPickerPanelWrapper = null;
                                if (supportedPickerPanelWrapper == null) {
                                }
                                i4++;
                            }
                            M(q2, asphVar, supportedPickerPanelWrapper);
                            K(q2, true);
                        }
                    }
                    if (asqdVar.b == 65153809) {
                        arfs arfsVar4 = ((apmg) asqdVar.c).g;
                        if (arfsVar4 == null) {
                            arfsVar4 = arfs.a;
                        }
                        arfr b3 = arfr.b(arfsVar4.c);
                        if (b3 == null) {
                            b3 = arfr.UNKNOWN;
                        }
                        if (b3 != arfr.EMOJI) {
                            if (asqdVar.b == 65153809) {
                                apmgVar = (apmg) asqdVar.c;
                            } else {
                                apmgVar = apmg.a;
                            }
                            if ((apmgVar.b & 32) != 0) {
                                arfs arfsVar5 = apmgVar.g;
                                if (arfsVar5 == null) {
                                    arfsVar5 = arfs.a;
                                }
                                View k = k(arfsVar5);
                                aott aottVar = apmgVar.s;
                                if (aottVar == null) {
                                    aottVar = aott.a;
                                }
                                if ((aottVar.b & 1) != 0) {
                                    aott aottVar2 = apmgVar.s;
                                    if (aottVar2 == null) {
                                        aottVar2 = aott.a;
                                    }
                                    aots aotsVar = aottVar2.c;
                                    if (aotsVar == null) {
                                        aotsVar = aots.a;
                                    }
                                    k.setContentDescription(aotsVar.c);
                                }
                                k.setOnClickListener(new abnk(this, apmgVar, 1));
                                q2.addView(k);
                                k.setTag(R.id.live_chat_picker_toggle_button_tag, apmgVar.k);
                            }
                        }
                    }
                    K(q2, true);
                }
            }
        }
        Iterator it = asqfVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            asqe asqeVar2 = (asqe) it.next();
            if (asqeVar2.b == 126326492) {
                this.l = (aqsv) asqeVar2.c;
                break;
            }
        }
        if (this.l != null) {
            t().setImageResource(R.drawable.ic_emoji_white_24);
        }
        P(true);
        if (this.g.h()) {
            TextWatcher c = this.f.c(r());
            r().removeTextChangedListener(c);
            r().addTextChangedListener(c);
        }
        if (this.j) {
            return;
        }
        this.v.c(asqfVar, r());
    }

    @Override // defpackage.abjn
    public final void e() {
        if (this.I) {
            return;
        }
        EditText r = r();
        r.setRawInputType(1);
        r.setOnEditorActionListener(new abnr(this));
        r.addTextChangedListener(this.y);
        r.setMaxLines(1);
        ajsj ajsjVar = new ajsj(r, this.a.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) this.a.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift));
        this.A = ajsjVar;
        r.addTextChangedListener(ajsjVar);
        u().setOnClickListener(new abnh(this, 1));
        ViewGroup L = L();
        if (L != null) {
            L.setOnClickListener(new abnh(this, 0));
        }
        this.B = l().getLayoutParams().height;
        D(false);
        this.f.d();
        this.I = true;
    }

    @Override // defpackage.abjn
    public void f() {
        ViewGroup q = q();
        if (q != null) {
            q.removeAllViews();
        }
        D(false);
        K(u(), false);
        if (w() != null) {
            w().setText((CharSequence) null);
        }
    }

    public abstract int g(arfr arfrVar, boolean z);

    public final Editable h() {
        return r().getText();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spanned i() {
        return this.n;
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }

    public abstract View k(arfs arfsVar);

    public abstract View l();

    public abstract View m();

    public abstract View n();

    @Override // defpackage.ajyu
    public final void na() {
        this.f.d();
        r().requestFocus();
        whu.J(r());
        P(false);
    }

    public abstract View o();

    public abstract ViewGroup p();

    public abstract ViewGroup q();

    public abstract EditText r();

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView s() {
        if (this.C == null) {
            this.C = (ImageView) n().findViewById(R.id.user_thumbnail);
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView t() {
        if (this.D == null) {
            this.D = (ImageView) n().findViewById(R.id.emoji_picker_icon);
        }
        return this.D;
    }

    public abstract ImageView u();

    /* JADX INFO: Access modifiers changed from: protected */
    public TextView v() {
        throw null;
    }

    public abstract TextView w();

    public abstract void x();

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(final asrf asrfVar) {
        aqyg aqygVar;
        apmg apmgVar;
        SupportedPickerPanelWrapper supportedPickerPanelWrapper;
        TextView w2 = w();
        if (w2 == null) {
            return;
        }
        O(true);
        if ((asrfVar.b & 2) != 0) {
            aqygVar = asrfVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) ajcq.b(aqygVar));
        if ((asrfVar.b & 4) != 0) {
            aulq aulqVar = asrfVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmg apmgVar2 = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            aqyg aqygVar2 = apmgVar2.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            if (aqygVar2.c.size() > 0) {
                aqyg aqygVar3 = apmgVar2.i;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                Spanned b = ajcq.b(ajcq.g(((aqyi) aqygVar3.c.get(0)).c.replace(" ", " ")));
                apxf apxfVar = apmgVar2.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                amrz k = amrz.k("engagement_panel_id_key", "live-chat-item-section");
                append.append((CharSequence) "  •  ").append((CharSequence) b).setSpan(new aahi(this.c, k, apxfVar, false), append.length() - b.length(), append.length(), 33);
                append.setSpan(new TextAppearanceSpan(this.a, R.style.live_chat_members_only_upsell_button_style), append.length() - b.length(), append.length(), 33);
                w().setMovementMethod(LinkMovementMethod.getInstance());
                jw.M(w(), new abno(this, apxfVar, k));
            }
        }
        w2.setText(append);
        arfs arfsVar = asrfVar.c;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        if ((arfsVar.b & 1) != 0) {
            Context context = this.a;
            ajut ajutVar = this.d;
            arfs arfsVar2 = asrfVar.c;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar2.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            Drawable c = gl.c(nz.b(context, ajutVar.a(b2)));
            c.setTint(wbs.Q(this.a, R.attr.ytIconDisabled));
            t().setImageDrawable(c);
            Q();
            B(false);
        }
        H(true);
        if ((asrfVar.b & 8) != 0) {
            o().setClickable(false);
            m().setOnClickListener(new View.OnClickListener() { // from class: abnn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abns abnsVar = abns.this;
                    asrf asrfVar2 = asrfVar;
                    abjl abjlVar = abnsVar.k;
                    apxf apxfVar2 = asrfVar2.f;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    abjlVar.h(apxfVar2);
                }
            });
        }
        K(u(), false);
        aony<asre> aonyVar = asrfVar.g;
        ViewGroup q = q();
        for (asre asreVar : aonyVar) {
            int i = asreVar.b;
            if (i == 65153809) {
                advq advqVar = this.K;
                Context context2 = (Context) advqVar.a.get();
                context2.getClass();
                ajyg ajygVar = (ajyg) advqVar.b.get();
                ajygVar.getClass();
                abhb abhbVar = new abhb(context2, ajygVar);
                if (asreVar.b == 65153809) {
                    apmgVar = (apmg) asreVar.c;
                } else {
                    apmgVar = apmg.a;
                }
                abhbVar.oB(new ajok(), apmgVar);
                TextView textView = abhbVar.a;
                if ((apmgVar.b & 32) != 0) {
                    textView.setTag(R.id.live_chat_picker_toggle_button_tag, apmgVar.k);
                    arfs arfsVar3 = apmgVar.g;
                    if (arfsVar3 == null) {
                        arfsVar3 = arfs.a;
                    }
                    arfr b3 = arfr.b(arfsVar3.c);
                    if (b3 == null) {
                        b3 = arfr.UNKNOWN;
                    }
                    int g = g(b3, false);
                    Drawable drawable = abhbVar.a.getCompoundDrawables()[0];
                    if (drawable != null) {
                        zau.e(drawable, g, PorterDuff.Mode.SRC_IN);
                    }
                }
                textView.setOnClickListener(new abnk(this, apmgVar, 0));
                q.addView(textView);
            } else if (i == 132562777 && this.h) {
                asph asphVar = (asph) asreVar.c;
                if ((asphVar.b & 2) != 0) {
                    arfs arfsVar4 = asphVar.d;
                    if (arfsVar4 == null) {
                        arfsVar4 = arfs.a;
                    }
                    arfr b4 = arfr.b(arfsVar4.c);
                    if (b4 == null) {
                        b4 = arfr.UNKNOWN;
                    }
                    if (b4 != arfr.UNKNOWN) {
                        asrg[] asrgVarArr = (asrg[]) asrfVar.h.toArray(new asrg[0]);
                        int length = asrgVarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                supportedPickerPanelWrapper = null;
                                break;
                            }
                            asrg asrgVar = asrgVarArr[i2];
                            if (asrgVar != null) {
                                int i3 = asrgVar.b;
                                if (i3 == 129042058) {
                                    supportedPickerPanelWrapper = new CreatorSupportPickerPanelWrapper((asow) asrgVar.c);
                                } else if (i3 == 189846535) {
                                    supportedPickerPanelWrapper = new ProductPickerPanelWrapper((asqv) asrgVar.c);
                                }
                                if (supportedPickerPanelWrapper == null && (asphVar.b & 1) != 0 && asphVar.c.equals(supportedPickerPanelWrapper.a()) && supportedPickerPanelWrapper.b()) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            supportedPickerPanelWrapper = null;
                            if (supportedPickerPanelWrapper == null) {
                            }
                            i2++;
                        }
                        M(q, asphVar, supportedPickerPanelWrapper);
                        K(q, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(atdn atdnVar) {
        aqyg aqygVar;
        H(false);
        O(false);
        apmh apmhVar = atdnVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            LayoutInflater from = LayoutInflater.from(this.a);
            ViewGroup p = p();
            Button button = (Button) from.inflate(R.layout.live_chat_action_button_grey_dark, p, false);
            apmh apmhVar2 = atdnVar.h;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 16384) != 0) {
                final apxf apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                button.setOnClickListener(new View.OnClickListener() { // from class: abnl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abns abnsVar = abns.this;
                        abnsVar.k.h(apxfVar);
                    }
                });
            }
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            button.setText(ajcq.b(aqygVar));
            p.addView(button, -1, this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
            atdq atdqVar = atdnVar.f;
            if (atdqVar == null) {
                atdqVar = atdq.a;
            }
            atdp atdpVar = atdqVar.c;
            if (atdpVar == null) {
                atdpVar = atdp.a;
            }
            if ((atdpVar.b & 1) != 0) {
                atdq atdqVar2 = atdnVar.f;
                if (atdqVar2 == null) {
                    atdqVar2 = atdq.a;
                }
                atdp atdpVar2 = atdqVar2.c;
                if (atdpVar2 == null) {
                    atdpVar2 = atdp.a;
                }
                aqyg aqygVar2 = atdpVar2.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                Spanned b = ajcq.b(aqygVar2);
                TextView textView = (TextView) from.inflate(R.layout.live_chat_button_subtext_light, p, false);
                textView.setText(b);
                p.addView(textView);
            }
        }
    }
}
