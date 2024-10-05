package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygf extends ajpc {
    private final Context a;
    private final aahd b;
    private final yfw c;
    private final CharSequence d;
    private final ViewGroup e;
    private final TextView f;
    private final Resources g;

    public ygf(Context context, aahd aahdVar, yfw yfwVar) {
        context.getClass();
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = yfwVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.simple_text_section, (ViewGroup) null);
        this.e = viewGroup;
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.d = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        this.g = context.getResources();
        yfwVar.c(viewGroup);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.setBackground(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        auuy auuyVar = (auuy) obj;
        af afVar = (af) this.f.getLayoutParams();
        int bp = aobq.bp(auuyVar.d);
        if (bp == 0) {
            bp = 1;
        }
        int i = bp - 1;
        if (i == 1) {
            int dimensionPixelSize = this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_vulcan);
            jw.Y(this.e, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            afVar.width = 0;
            afVar.I = this.g.getDimensionPixelSize(R.dimen.simple_text_section_max_content_width);
            jm.s(this.f, R.style.TextAppearance_YouTube_Subhead);
            this.f.setTypeface(ajct.ROBOTO_MEDIUM.a(this.a));
            this.f.setTextColor(wbs.S(this.a, android.R.attr.textColorPrimary));
        } else if (i == 2) {
            jw.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_subscription_title_top_padding), 0, 0);
            afVar.width = 0;
            afVar.I = this.g.getDimensionPixelSize(R.dimen.subscription_cards_max_width);
            jm.s(this.f, R.style.TextAppearance_YouTube_Title);
            this.f.setTextColor(wbs.S(this.a, android.R.attr.textColorPrimary));
            this.f.setTypeface(ajct.YTSANS_MEDIUM.a(this.a));
        } else if (i == 3) {
            jw.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_start), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_end), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            afVar.width = -1;
            afVar.I = 0;
            jm.s(this.f, R.style.TextAppearance_YouTube_Body1);
            this.f.setTextColor(wbs.S(this.a, R.attr.ytTextSecondary));
        } else if (i == 4) {
            jw.Y(this.f, this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding));
            afVar.width = -1;
            afVar.I = 0;
            jm.s(this.f, R.style.TextAppearance_YouTube_Spec_Body2a);
            this.f.setTextColor(wbs.S(this.a, R.attr.ytTextSecondary));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(wbs.Q(this.a, R.attr.ytGeneralBackgroundA));
            gradientDrawable.setCornerRadius(this.a.getResources().getDimensionPixelSize(R.dimen.simple_text_card_background_radius));
            this.f.setBackground(gradientDrawable);
        } else {
            jw.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_end_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            afVar.width = -1;
            afVar.I = 0;
            jm.s(this.f, R.style.TextAppearance_YouTube_Subhead);
            this.f.setTypeface(ajct.ROBOTO_MEDIUM.a(this.a));
            this.f.setTextColor(wbs.S(this.a, android.R.attr.textColorPrimary));
        }
        if (auuyVar.b.size() != 0) {
            whu.G(this.f, ajcq.k(this.d, aahk.c((aqyg[]) auuyVar.b.toArray(new aqyg[0]), this.b, false)));
        }
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auuy) obj).c.I();
    }
}
