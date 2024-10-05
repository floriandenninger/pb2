package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackf extends ablx {
    private static final amrz w;
    private final TextView A;
    private final TextView B;
    private final ajkj x;
    private final afsy y;
    private final TextView z;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(arfr.UNKNOWN, Integer.valueOf(R.style.live_chat_overlay_author));
        amrwVar.g(arfr.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amrwVar.g(arfr.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amrwVar.g(arfr.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amrwVar.g(arfr.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        w = amrwVar.c();
    }

    public ackf(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, afsy afsyVar, ajsd ajsdVar, abjk abjkVar, abiy abiyVar, zim zimVar) {
        super(context, ajutVar, aahdVar, ajsdVar, abjkVar, abiyVar, zimVar);
        this.y = afsyVar;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.g.setLayoutParams(marginLayoutParams);
        this.x = new ajkj(ajjzVar.b(), this.h);
        TextView textView = (TextView) this.g.findViewById(R.id.author);
        textView.getClass();
        this.z = textView;
        TextView textView2 = (TextView) this.g.findViewById(R.id.timestamp);
        textView2.getClass();
        this.B = textView2;
        TextView textView3 = (TextView) this.g.findViewById(R.id.comment);
        textView3.getClass();
        this.A = textView3;
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setOnClickListener(this.o);
        textView3.setFilters(new InputFilter[]{new ajsi(textView3, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final boolean t(View view) {
        return view.getAlpha() > 0.0f && (!(view.getParent() instanceof View) || t((View) view.getParent()));
    }

    @Override // defpackage.ablx, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.x.a();
    }

    @Override // defpackage.ablx
    protected final amrz e() {
        return w;
    }

    @Override // defpackage.ablx
    protected final void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        aqyg aqygVar;
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            this.a.b(spannableStringBuilder, sb, this.l, this.n, this.k, this.z.getId(), false);
        }
        q(spannableStringBuilder2);
        this.z.setText(spannableStringBuilder);
        this.A.setText(spannableStringBuilder2);
        this.B.setText(spannableStringBuilder3);
        boolean e = zev.e(this.d);
        if (e) {
            sb.append((CharSequence) spannableStringBuilder2);
            this.A.setImportantForAccessibility(2);
        }
        if (!this.p) {
            ajsf ajsfVar = this.v;
            aqyg aqygVar2 = this.k.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            aqyg aqygVar3 = aqygVar2;
            asps aspsVar = this.k;
            if ((aspsVar.b & 16) != 0) {
                aqygVar = aspsVar.g;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            ajsfVar.g(aqygVar3, ajcq.b(aqygVar), spannableStringBuilder2, sb, this.k, this.A.getId());
        }
        if (e) {
            this.g.setContentDescription(sb);
        }
    }

    @Override // defpackage.ablx
    public final void h(View view) {
        if (!this.y.t() || this.k == null || this.j == null || !t(view)) {
            return;
        }
        HashMap hashMap = new HashMap();
        asps aspsVar = this.k;
        if (aspsVar != null) {
            hashMap.put("context_menu_header_renderer_key", aspsVar);
        }
        this.f.c(this.j, hashMap);
    }

    @Override // defpackage.ablx
    protected final int l() {
        return wbs.W(this.e, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.ablx
    protected final int m() {
        return R.layout.live_chat_light_overlay_text_item;
    }

    @Override // defpackage.ablx
    protected final ImageView n() {
        return (ImageView) this.g.findViewById(R.id.avatar);
    }

    @Override // defpackage.ablx
    protected final TextView o() {
        return (TextView) this.g.findViewById(R.id.author);
    }

    @Override // defpackage.ablx
    protected final void p(avgg avggVar) {
        this.x.k(avggVar);
    }

    @Override // defpackage.ablx
    protected final boolean r() {
        return false;
    }
}
