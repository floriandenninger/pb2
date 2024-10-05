package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class able implements ajom {
    protected final Context a;
    public final aahd b;
    public final acra c;
    protected final View d;
    private final ajrz e;
    private final SpannableStringBuilder f;
    private final StringBuilder g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final View n;
    private final View o;
    private final Drawable p;
    private final Drawable q;
    private final int r;
    private final int s;
    private final float t;
    private final ajkj u;
    private Spanned v;
    private boolean w;
    private boolean x;
    private final ajsf y;

    public able(Context context, acqz acqzVar, ajjz ajjzVar, ajsd ajsdVar, aahd aahdVar, ajut ajutVar) {
        this.a = context;
        this.b = aahdVar;
        this.c = acqzVar.mM();
        View inflate = LayoutInflater.from(context).inflate(e(), (ViewGroup) null);
        this.d = inflate;
        this.h = h();
        this.i = (TextView) inflate.findViewById(R.id.header_text);
        this.j = (TextView) inflate.findViewById(R.id.header_subtext);
        TextView i = i();
        this.k = i;
        this.m = inflate.findViewById(R.id.top_bar);
        this.n = inflate.findViewById(R.id.bottom_bar);
        this.o = inflate.findViewById(R.id.top_bar_content);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar);
        this.l = imageView;
        this.q = g();
        this.p = f();
        ajsh ajshVar = new ajsh(inflate);
        this.e = new ajrz(context, ajutVar, ajsdVar, true, ajshVar, false);
        this.y = new ajsf(context, ajsdVar, true, ajshVar);
        this.u = new ajkj(ajjzVar.b(), imageView);
        this.r = context.getResources().getColor(R.color.live_chat_membership_item_header_background);
        this.s = context.getResources().getColor(R.color.live_chat_membership_item_body_background);
        this.f = new SpannableStringBuilder();
        this.g = new StringBuilder();
        this.t = context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / i().getPaint().measureText(" ");
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        yny.A(inflate, new abld(marginLayoutParams, 0), yny.h(yny.y(-1, -2), yny.r(dimensionPixelOffset), yny.q(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
        i.setFilters(new InputFilter[]{new ajsi(i, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.e();
        this.h.setText((CharSequence) null);
        this.i.setText((CharSequence) null);
        this.j.setText((CharSequence) null);
        this.k.setText((CharSequence) null);
        this.u.a();
        this.d.setOnClickListener(null);
    }

    protected boolean d() {
        return false;
    }

    protected int e() {
        return R.layout.live_chat_membership_item;
    }

    protected Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_full_background);
    }

    protected Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_top_background);
    }

    protected final TextView h() {
        return (TextView) this.d.findViewById(R.id.author);
    }

    protected final TextView i() {
        return (TextView) this.d.findViewById(R.id.message);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        final aspn aspnVar = (aspn) obj;
        this.f.clear();
        this.g.setLength(0);
        TextView textView = this.i;
        if ((aspnVar.b & 16) != 0) {
            aqygVar = aspnVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.j;
        if ((aspnVar.b & 32) != 0) {
            aqygVar2 = aspnVar.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        abiz abizVar = new abiz(ajokVar.c("live_chat_item_action"));
        if (aspnVar.c == 8 || (aspnVar.b & 2048) != 0 || abizVar.c()) {
            boolean z = true;
            if (abizVar.c()) {
                this.w = false;
                this.x = true;
                this.v = ajcq.b(abizVar.a());
            } else if ((aspnVar.b & 2048) == 0) {
                this.x = false;
                this.v = aahk.a(aspnVar.c == 8 ? (aqyg) aspnVar.d : null, this.b, false);
                if (aspnVar.c == 8) {
                    aqygVar3 = (aqyg) aspnVar.d;
                } else {
                    aqygVar3 = aqyg.a;
                }
                if (aqygVar3 != null && aqygVar3.c.size() > 0) {
                    Iterator it = aqygVar3.c.iterator();
                    while (it.hasNext()) {
                        if (((aqyi) it.next()).pY(aqss.b)) {
                            break;
                        }
                    }
                }
                z = false;
                this.w = z;
            } else {
                this.w = false;
                this.x = true;
                aqyg aqygVar5 = aspnVar.l;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
                this.v = ajcq.b(aqygVar5);
            }
            if (!TextUtils.isEmpty(this.v) || this.w) {
                if (!TextUtils.isEmpty(this.v)) {
                    this.f.append((CharSequence) this.v);
                    this.g.append((CharSequence) this.v);
                }
                if (this.x) {
                    adyu.dc(this.f, this.v.length(), new ForegroundColorSpan(wbs.Q(this.a, R.attr.ytOverlayTextSecondary)));
                    adyu.dc(this.f, this.v.length(), new StyleSpan(2));
                } else if (this.w) {
                    ajsf ajsfVar = this.y;
                    if (aspnVar.c == 8) {
                        aqygVar4 = (aqyg) aspnVar.d;
                    } else {
                        aqygVar4 = aqyg.a;
                    }
                    ajsfVar.g(aqygVar4, this.v, this.f, this.g, aspnVar, this.k.getId());
                }
                this.k.setText(this.f);
            }
            this.m.setBackground(this.q);
            ((GradientDrawable) this.q).setColor(this.r);
            this.n.setVisibility(0);
            ((GradientDrawable) this.n.getBackground()).setColor(this.s);
            this.h.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_loyalty_message_author_name_text_size));
            this.j.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_loyalty_message_tier_name_text_size));
        } else {
            this.m.setBackground(this.p);
            ((GradientDrawable) this.m.getBackground()).setColor(this.s);
            this.n.setVisibility(8);
            this.h.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_membership_message_author_name_text_size));
            this.j.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_membership_message_tier_name_text_size));
        }
        if ((aspnVar.b & 512) == 0 || this.x) {
            this.h.setVisibility(8);
        } else {
            aqyg aqygVar6 = aspnVar.i;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
            this.e.b(spannableStringBuilder, new StringBuilder(b), ajry.a(aspnVar.k), this.t, aspnVar, h().getId(), false);
            this.h.setText(spannableStringBuilder);
            this.h.setVisibility(0);
        }
        if ((aspnVar.b & 1024) == 0 || this.x) {
            this.l.setVisibility(8);
        } else {
            avgg avggVar = aspnVar.j;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (avggVar != null) {
                this.u.k(avggVar);
            }
            this.l.setVisibility(0);
        }
        Resources resources = this.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.h.getVisibility() != 0) {
            if (!d()) {
                dimensionPixelSize /= 2;
            }
            int i = dimensionPixelSize - dimensionPixelOffset;
            TextView textView3 = this.k;
            textView3.setPaddingRelative(i, 0, textView3.getPaddingEnd(), 0);
            ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(i);
        } else if (d()) {
            TextView textView4 = this.k;
            textView4.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView4.getPaddingEnd(), 0);
        }
        final acqx acqxVar = (aspnVar.b & 65536) != 0 ? new acqx(aspnVar.n) : null;
        if (acqxVar != null) {
            this.c.n(acqxVar);
        }
        if ((aspnVar.b & 8192) == 0 || this.b == null) {
            return;
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: ablc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                able ableVar = able.this;
                acqx acqxVar2 = acqxVar;
                aspn aspnVar2 = aspnVar;
                if (acqxVar2 != null) {
                    ableVar.c.I(3, acqxVar2, null);
                }
                aahd aahdVar = ableVar.b;
                apxf apxfVar = aspnVar2.m;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
    }
}
