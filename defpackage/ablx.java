package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablx implements ajom {
    private static Locale w;
    private static DateFormat x;
    private final SpannableStringBuilder A;
    private final abjk B;
    private final ajut C;
    private final abiy D;
    protected final ajrz a;
    protected final ajsh b;
    protected final StringBuilder c;
    protected final Context d;
    protected final Context e;
    protected final aahd f;
    protected final View g;
    protected final ImageView h;
    protected final View i;
    protected apxf j;
    protected asps k;
    protected List l;
    protected final float m;
    protected final float n;
    protected final View.OnClickListener o;
    protected boolean p;
    protected boolean q;
    public CharSequence r;
    public boolean s;
    public boolean t;
    public boolean u;
    protected final ajsf v;
    private final SpannableStringBuilder y;
    private final SpannableStringBuilder z;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(arfr.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amrwVar.g(arfr.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amrwVar.g(arfr.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amrwVar.g(arfr.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amrwVar.g(arfr.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        amrwVar.c();
    }

    public ablx(Context context, ajut ajutVar, aahd aahdVar, ajsd ajsdVar, abjk abjkVar, abiy abiyVar, zim zimVar) {
        this.d = context;
        this.f = aahdVar;
        this.C = ajutVar;
        this.B = abjkVar;
        this.D = abiyVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, zimVar.a);
        this.e = contextThemeWrapper;
        View inflate = View.inflate(contextThemeWrapper, m(), null);
        this.g = inflate;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ablu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ablx ablxVar = ablx.this;
                if (ablxVar.t) {
                    ablxVar.t = false;
                } else {
                    if (ablxVar.u) {
                        return;
                    }
                    ablxVar.h(view);
                }
            }
        };
        this.o = onClickListener;
        inflate.setOnClickListener(onClickListener);
        this.h = n();
        this.i = d();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_message_spacing);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_badge_spacing);
        float measureText = o().getPaint().measureText(" ");
        this.m = dimensionPixelSize / measureText;
        this.n = dimensionPixelOffset / measureText;
        ajsh ajshVar = new ajsh(inflate);
        this.b = ajshVar;
        this.a = new ajrz(context, ajutVar, ajsdVar, r(), ajshVar, false);
        this.v = new ajsf(context, ajsdVar, r(), ajshVar);
        this.y = new SpannableStringBuilder();
        this.z = new SpannableStringBuilder();
        this.A = new SpannableStringBuilder();
        this.c = new StringBuilder();
    }

    private static boolean t(List list, arfr arfrVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ajry) it.next()).b == arfrVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        throw null;
    }

    protected View d() {
        return null;
    }

    protected amrz e() {
        throw null;
    }

    protected List f(List list) {
        return ajry.b(list, amrz.k(arfr.VERIFIED, Integer.valueOf(wbs.Q(this.e, R.attr.ytIconActiveOther))));
    }

    protected abstract void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view) {
        throw null;
    }

    @Override // defpackage.ajom
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void oB(ajok ajokVar, asps aspsVar) {
        aqyg aqygVar;
        boolean z;
        Spanned b;
        aqyg aqygVar2;
        int length;
        int intValue;
        int i;
        int Q;
        int Q2;
        boolean z2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        this.y.clear();
        this.z.clear();
        this.A.clear();
        boolean z3 = false;
        this.c.setLength(0);
        boolean e = zev.e(this.d);
        this.a.e();
        this.v.e();
        this.k = aspsVar;
        this.l = f(aspsVar.j);
        abiz abizVar = new abiz(ajokVar.c("live_chat_item_action"));
        this.u = ajokVar.j("item_rendered_in_context_menu", false);
        boolean z4 = (ajokVar.c("live_chat_item_action") instanceof apxf) && ((apxf) ajokVar.c("live_chat_item_action")).pY(LiveChatAction.DimChatItemAction.dimChatItemAction);
        this.r = null;
        if (abizVar.c() && !this.s) {
            this.r = ajcq.b(abizVar.a());
        }
        int i2 = aspsVar.b & 128;
        if (i2 != 0 && !this.s) {
            if (i2 != 0) {
                aqygVar5 = aspsVar.k;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
            } else {
                aqygVar5 = null;
            }
            this.r = ajcq.b(aqygVar5);
        }
        if (this.r == null) {
            if ((aspsVar.b & 16) != 0) {
                aqygVar4 = aspsVar.g;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            this.r = aahk.a(aqygVar4, this.f, false);
        }
        this.p = (abizVar.c() || (aspsVar.b & 128) != 0) && !this.s;
        if (k()) {
            if ((aspsVar.b & 4) != 0) {
                aqygVar3 = aspsVar.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            CharSequence b2 = ajcq.b(aqygVar3);
            if (TextUtils.isEmpty(b2)) {
                long j = aspsVar.d / 1000;
                if (j != 0) {
                    Locale locale = Locale.getDefault();
                    if (!locale.equals(w)) {
                        x = android.text.format.DateFormat.getTimeFormat(this.d);
                        w = locale;
                    }
                    b2 = x.format(new Date(j));
                } else {
                    b2 = null;
                }
            }
            if (!TextUtils.isEmpty(b2)) {
                adyu.cZ(this.e, this.z, b2, R.style.live_chat_message_time);
                if (e) {
                    this.c.append(b2);
                    this.c.append(" ");
                }
            }
        }
        CharSequence charSequence = this.r;
        if (charSequence != null) {
            this.A.append(charSequence);
        }
        if ((aspsVar.b & 32) != 0) {
            aqygVar = aspsVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b3 = ajcq.b(aqygVar);
        if (TextUtils.isEmpty(b3)) {
            z = z4;
        } else {
            Context context = this.e;
            SpannableStringBuilder spannableStringBuilder = this.y;
            amrz e2 = e();
            List list = this.l;
            if (list == null || list.isEmpty() || !e2.containsKey(((ajry) list.get(0)).b)) {
                if (e2.containsKey(arfr.UNKNOWN)) {
                    intValue = ((Integer) e2.get(arfr.UNKNOWN)).intValue();
                    i = intValue;
                }
                i = R.style.live_chat_author_default;
            } else {
                if (t(list, arfr.OWNER)) {
                    intValue = ((Integer) e2.get(arfr.OWNER)).intValue();
                } else if (t(list, arfr.MEMBER)) {
                    intValue = ((Integer) e2.get(arfr.MEMBER)).intValue();
                } else if (t(list, arfr.MODERATOR)) {
                    intValue = ((Integer) e2.get(arfr.MODERATOR)).intValue();
                } else {
                    if (t(list, arfr.VERIFIED)) {
                        intValue = ((Integer) e2.get(arfr.VERIFIED)).intValue();
                    }
                    i = R.style.live_chat_author_default;
                }
                i = intValue;
            }
            adyu.da(context, spannableStringBuilder, b3, i, true);
            if (s()) {
                Context context2 = this.e;
                SpannableStringBuilder spannableStringBuilder2 = this.y;
                List list2 = this.l;
                ajut ajutVar = this.C;
                abiy abiyVar = this.D;
                int length2 = b3.length();
                View view = this.g;
                boolean j2 = j();
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        z = z4;
                    } else {
                        aspg aspgVar = abiyVar.a;
                        boolean z5 = aspgVar.b;
                        boolean z6 = aspgVar.e;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        boolean z7 = false;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            ajry ajryVar = (ajry) it.next();
                            boolean z10 = z5;
                            if (z5) {
                                z2 = z4;
                                if (ajryVar.b == arfr.OWNER) {
                                    z7 = true;
                                }
                            } else {
                                z2 = z4;
                            }
                            if (z6 && ajryVar.b == arfr.VERIFIED) {
                                int a = ajutVar.a(ajryVar.b);
                                if (a > 0) {
                                    arrayList.add(aii.a(context2, a));
                                }
                                z8 = true;
                            }
                            if (ajryVar.b == arfr.MEMBER || ajryVar.b == arfr.MODERATOR) {
                                z5 = z10;
                                it = it2;
                                z4 = z2;
                                z9 = true;
                            } else {
                                z5 = z10;
                                it = it2;
                                z4 = z2;
                            }
                        }
                        z = z4;
                        if (z7 || (z8 && !z9)) {
                            if (z7) {
                                Q = aih.d(context2, R.color.live_chat_light_owner_text_color);
                            } else {
                                Q = wbs.Q(context2, R.attr.liveChatVerifiedAuthorName);
                            }
                            if (z7) {
                                Q2 = wbs.Q(context2, R.attr.ytStaticYellow);
                            } else {
                                Q2 = wbs.Q(context2, R.attr.liveChatVerifiedBadgeChipBackground);
                            }
                            spannableStringBuilder2.setSpan(new abjx(context2, Q, Q2, arrayList), spannableStringBuilder2.length() - length2, spannableStringBuilder2.length(), 33);
                        }
                        if (z7 && j2) {
                            view.setBackgroundColor(wbs.W(context2, R.attr.ytBrandBackgroundSolid).orElse(0));
                        }
                        if (z7 || (z8 && !z9)) {
                            z3 = true;
                        }
                    }
                    this.q = z3;
                } else {
                    z = z4;
                }
                z3 = false;
                this.q = z3;
            } else {
                z = z4;
            }
            if (e) {
                this.c.append((CharSequence) b3);
                this.c.append(" ");
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = this.A;
        aqyg aqygVar6 = this.k.g;
        if (aqygVar6 == null) {
            aqygVar6 = aqyg.a;
        }
        if (aqygVar6 != null && aqygVar6.c.size() > 0) {
            for (aqyi aqyiVar : aqygVar6.c) {
                if (aqyiVar.c.contains("@") || aqyiVar.c.contains("#")) {
                    if (this.r != null && this.B.b != null && (length = spannableStringBuilder3.length() - this.r.length()) >= 0) {
                        Matcher matcher = this.B.b.matcher(this.r);
                        while (matcher.find()) {
                            spannableStringBuilder3.setSpan(new abjx(this.e, 0, aih.d(this.d, R.color.live_chat_mentions_bg_color), null), matcher.start() + length, matcher.end() + length, 33);
                        }
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder4 = this.A;
        int i3 = aspsVar.b & 256;
        if (i3 != 0) {
            if (i3 != 0) {
                aqygVar2 = aspsVar.l;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            b = ajcq.b(aqygVar2);
        } else {
            b = ajcq.b(abizVar.b());
        }
        boolean j3 = ajokVar.j("is-auto-mod-message", false);
        if (this.r != null && (abizVar.c() || b != null || j3)) {
            adyu.dc(spannableStringBuilder4, this.r.length(), new ForegroundColorSpan(l()));
            adyu.dc(spannableStringBuilder4, this.r.length(), new StyleSpan(2));
        }
        if (this.i != null) {
            whu.I(this.i, (abizVar.b() == null && b == null) ? false : true);
        }
        if (b != null && !this.s) {
            ablv ablvVar = new ablv(this, ajokVar, aspsVar);
            adyu.db(spannableStringBuilder4, this.m);
            spannableStringBuilder4.append((CharSequence) b);
            adyu.dc(spannableStringBuilder4, b.length(), ablvVar);
            adyu.dc(spannableStringBuilder4, b.length(), new ForegroundColorSpan(l()));
        }
        if (this.h != null) {
            avgg avggVar = aspsVar.i;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            p(avggVar);
        }
        apxf apxfVar = aspsVar.m;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.j = apxfVar;
        if (z) {
            View view2 = this.i;
            if (view2 != null) {
                view2.setBackgroundColor(aih.d(this.d, R.color.yt_medium_red));
                whu.I(this.i, true);
            }
            this.A.setSpan(new ForegroundColorSpan(wbs.W(this.d, R.attr.ytTextDisabled).orElse(0)), 0, this.A.length(), 33);
        }
        g(this.y, this.A, this.z, this.c);
    }

    protected boolean j() {
        return false;
    }

    protected boolean k() {
        return true;
    }

    protected abstract int l();

    protected abstract int m();

    protected abstract ImageView n();

    protected abstract TextView o();

    protected abstract void p(avgg avggVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(SpannableStringBuilder spannableStringBuilder) {
        for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
            spannableStringBuilder.setSpan(new ablw(this, clickableSpan), spannableStringBuilder.getSpanStart(clickableSpan), spannableStringBuilder.getSpanEnd(clickableSpan), spannableStringBuilder.getSpanFlags(clickableSpan));
            spannableStringBuilder.removeSpan(clickableSpan);
        }
    }

    protected abstract boolean r();

    protected boolean s() {
        return false;
    }
}
