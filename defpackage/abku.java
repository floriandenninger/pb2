package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abku extends abmy {
    private static final amrz x;
    private abnf A;
    private boolean y;
    private abps z;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(arfr.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amrwVar.g(arfr.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amrwVar.g(arfr.MODERATOR, Integer.valueOf(R.style.live_chat_banner_author_moderator));
        amrwVar.g(arfr.MEMBER, Integer.valueOf(R.style.live_chat_banner_author_member));
        amrwVar.g(arfr.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        x = amrwVar.c();
    }

    public abku(Activity activity, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajsd ajsdVar, abjk abjkVar, abiy abiyVar) {
        super(activity, ajjzVar, aahdVar, ajutVar, ajsdVar, abjkVar, abiyVar, zim.a(R.style.Themed_YouTube_LiveChat_Dark));
        this.g.setAlpha(0.0f);
    }

    @Override // defpackage.abmy, defpackage.ablx, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.g.setAlpha(1.0f);
    }

    @Override // defpackage.abmy, defpackage.ablx
    protected final View d() {
        return null;
    }

    @Override // defpackage.abmy, defpackage.ablx
    protected final amrz e() {
        return x;
    }

    @Override // defpackage.ablx
    protected final List f(List list) {
        return ajry.b(list, amrz.m(arfr.VERIFIED, Integer.valueOf(wbs.Q(this.e, R.attr.ytIconActiveOther)), arfr.MODERATOR, Integer.valueOf(wbs.Q(this.e, R.attr.ytIconActiveOther)), arfr.MEMBER, Integer.valueOf(wbs.Q(this.e, R.attr.ytIconActiveOther))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abmy, defpackage.ablx
    public final void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        super.g(spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3, sb);
        if (this.y) {
            this.w.setSingleLine(true);
        } else {
            this.w.setSingleLine(false);
        }
        this.A.a(this.c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, (Property<View, Float>) View.ALPHA, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.start();
    }

    @Override // defpackage.abmy, defpackage.ablx
    public final void h(View view) {
        abps abpsVar = this.z;
        if (abpsVar != null) {
            abpsVar.g();
        } else {
            super.h(view);
        }
    }

    @Override // defpackage.ablx
    /* renamed from: i */
    public final void oB(ajok ajokVar, asps aspsVar) {
        this.y = ajokVar.j("render_content_collapsed", false);
        this.z = (abps) ajokVar.d("on_content_clicked_listener", null);
        this.A = (abnf) ajokVar.d("accessibility_data_receiver_key", null);
        super.oB(ajokVar, aspsVar);
    }

    @Override // defpackage.abmy, defpackage.ablx
    protected final boolean j() {
        return false;
    }

    @Override // defpackage.ablx
    protected final boolean k() {
        return false;
    }

    @Override // defpackage.ablx, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        oB(ajokVar, (asps) obj);
    }
}
