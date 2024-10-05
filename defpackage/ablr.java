package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ablr implements ajom {
    public final aahd a;
    public final acra b;
    protected final Context c;
    protected final View d;
    protected final View e;
    protected final View f;
    protected final ImageView g;
    protected final ImageView h;
    protected final TextView i;
    protected final TextView j;
    protected final TextView k;
    protected final TextView l;
    protected final Map m;
    private final ajsh n;
    private final SpannableStringBuilder o;
    private final StringBuilder p;
    private final ajut q;
    private final ajkj r;
    private final ajkj s;
    private final View t;
    private final LinearLayout u;
    private final TextView v;
    private boolean w;
    private CharSequence x;
    private final ajsf y;
    private final axze z;

    public ablr(Context context, ajjs ajjsVar, acqz acqzVar, aahd aahdVar, ajsd ajsdVar, ajut ajutVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = context;
        this.b = acqzVar.mM();
        this.a = aahdVar;
        this.q = ajutVar;
        this.z = axzeVar;
        View inflate = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.top_bar);
        this.e = findViewById;
        View findViewById2 = inflate.findViewById(R.id.bottom_bar);
        this.f = findViewById2;
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.avatar);
        this.g = imageView;
        this.i = (TextView) findViewById.findViewById(R.id.author);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.currency_image);
        this.h = imageView2;
        this.j = (TextView) findViewById.findViewById(R.id.amount);
        this.k = (TextView) findViewById.findViewById(R.id.time);
        TextView textView = (TextView) findViewById2.findViewById(R.id.message);
        this.l = textView;
        this.t = inflate.findViewById(R.id.underline);
        this.u = (LinearLayout) findViewById2.findViewById(R.id.footer_body);
        this.v = (TextView) findViewById2.findViewById(R.id.footer_text);
        this.m = new HashMap();
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams g = g();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        yny.A(inflate, new abld(g, 2), yny.h(yny.r(dimensionPixelOffset), yny.q(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
        this.o = new SpannableStringBuilder();
        this.p = new StringBuilder();
        ajsh ajshVar = new ajsh(inflate);
        this.n = ajshVar;
        this.y = new ajsf(context, ajsdVar, true, ajshVar);
        this.r = new ajkj(ajjsVar, imageView);
        this.s = new ajkj(ajjsVar, imageView2);
        textView.setFilters(new InputFilter[]{new ajsi(textView, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final SpannableStringBuilder i(aqyg aqygVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        adyu.cZ(this.c, spannableStringBuilder, ajcq.b(aqygVar), R.style.live_chat_paid_message_deleted);
        return spannableStringBuilder;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        this.y.e();
        this.r.a();
        this.s.a();
        this.w = false;
        LinearLayout linearLayout = this.u;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.d.setOnClickListener(null);
    }

    protected int d() {
        return R.layout.live_chat_paid_message;
    }

    protected int e() {
        return R.drawable.live_chat_paid_message_full_background;
    }

    protected int f() {
        return R.drawable.live_chat_paid_message_top_background;
    }

    protected ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    @Override // defpackage.ajom
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oB(defpackage.ajok r16, defpackage.asqj r17) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablr.oB(ajok, asqj):void");
    }
}
