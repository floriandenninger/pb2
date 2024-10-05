package defpackage;

import android.app.Activity;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abmy extends ablx {
    private static final amrz x;
    protected final TextView w;
    private final ajjz y;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(arfr.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amrwVar.g(arfr.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amrwVar.g(arfr.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amrwVar.g(arfr.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amrwVar.g(arfr.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        x = amrwVar.c();
    }

    public abmy(Activity activity, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajsd ajsdVar, abjk abjkVar, abiy abiyVar, zim zimVar) {
        super(activity, ajutVar, aahdVar, ajsdVar, abjkVar, abiyVar, zimVar);
        this.y = ajjzVar;
        TextView textView = (TextView) this.g.findViewById(R.id.chat_message);
        textView.getClass();
        this.w = textView;
        textView.setOnClickListener(this.o);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setFilters(new InputFilter[]{new ajsi(textView, this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.ablx, defpackage.ajom
    public void b(ajos ajosVar) {
        this.a.e();
        this.v.e();
        this.k = null;
        this.l = null;
        this.r = null;
        this.s = false;
        this.p = false;
        this.t = false;
        this.q = false;
        this.g.setContentDescription(null);
        this.y.e(this.h);
        this.g.setBackgroundColor(0);
    }

    @Override // defpackage.ablx
    protected View d() {
        return this.g.findViewById(R.id.highlight_bar);
    }

    @Override // defpackage.ablx
    protected amrz e() {
        return x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ablx
    public void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        aqyg aqygVar;
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        if (spannableStringBuilder3.length() != 0) {
            spannableStringBuilder4.append((CharSequence) spannableStringBuilder3);
            adyu.db(spannableStringBuilder4, this.m);
        }
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder);
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            this.a.b(spannableStringBuilder4, sb, this.l, this.n, this.k, this.w.getId(), this.q);
        }
        adyu.db(spannableStringBuilder4, this.m);
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder2);
        q(spannableStringBuilder4);
        boolean e = zev.e(this.d);
        if (e) {
            sb.append((CharSequence) spannableStringBuilder2);
        }
        this.w.setText(spannableStringBuilder4);
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
            ajsfVar.g(aqygVar3, ajcq.b(aqygVar), spannableStringBuilder4, sb, this.k, this.w.getId());
        }
        if (e) {
            this.w.setContentDescription(sb);
        }
    }

    @Override // defpackage.ablx
    public void h(View view) {
        if (this.j != null) {
            HashMap hashMap = new HashMap();
            asps aspsVar = this.k;
            if (aspsVar != null) {
                hashMap.put("context_menu_header_renderer_key", aspsVar);
            }
            this.f.c(this.j, hashMap);
        }
    }

    @Override // defpackage.ablx
    protected boolean j() {
        return true;
    }

    @Override // defpackage.ablx
    protected final int l() {
        return wbs.W(this.d, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.ablx
    protected final int m() {
        return R.layout.live_chat_light_text_item;
    }

    @Override // defpackage.ablx
    protected final ImageView n() {
        return (ImageView) this.g.findViewById(R.id.avatar);
    }

    @Override // defpackage.ablx
    protected final TextView o() {
        return (TextView) this.g.findViewById(R.id.chat_message);
    }

    @Override // defpackage.ablx
    protected final void p(avgg avggVar) {
        this.y.h(this.h, avggVar);
    }

    @Override // defpackage.ablx
    protected final boolean r() {
        return true;
    }

    @Override // defpackage.ablx
    public final boolean s() {
        return true;
    }
}
