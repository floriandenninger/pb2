package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfn implements ajom {
    public final TextView a;
    private final LinearLayout b;
    private final FrameLayout c;
    private final ImageView d;
    private final Drawable e;
    private final Drawable f;
    private final Resources g;

    public lfn(Context context) {
        this.g = context.getResources();
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.watch_card_expand_collapse_button, null);
        this.b = linearLayout;
        this.d = (ImageView) linearLayout.findViewById(R.id.button);
        this.e = aii.a(context, R.drawable.ic_arrow_expand);
        this.f = aii.a(context, R.drawable.ic_arrow_collapse);
        this.a = (TextView) linearLayout.findViewById(R.id.label);
        this.c = (FrameLayout) linearLayout.findViewById(R.id.expand_collapse_button);
        jw.M(linearLayout, new lfm(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        ldb ldbVar = (ldb) obj;
        Resources resources = this.d.getResources();
        if (ldbVar.a == 0 && ldbVar.d) {
            LinearLayout linearLayout = this.b;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) this.g.getDimension(R.dimen.expand_button_top_padding_for_multiple_season_show), this.b.getPaddingRight(), this.b.getPaddingBottom());
        } else {
            LinearLayout linearLayout2 = this.b;
            linearLayout2.setPadding(linearLayout2.getPaddingLeft(), (int) this.g.getDimension(R.dimen.collapse_button_top_padding_all_shows), this.b.getPaddingRight(), this.b.getPaddingBottom());
        }
        if (ldbVar.a != 0) {
            this.b.setOnClickListener(ldbVar.b);
            this.d.setImageDrawable(this.f);
            this.d.setVisibility(0);
            this.a.setVisibility(8);
            this.a.setText((CharSequence) null);
            this.c.setContentDescription(this.g.getString(R.string.universal_watch_card_collapse_button_accessibility_label));
            return;
        }
        this.b.setOnClickListener(ldbVar.b);
        this.d.setImageDrawable(this.e);
        this.d.setVisibility(0);
        this.a.setVisibility(0);
        TextView textView = this.a;
        CharSequence charSequence = ldbVar.c;
        if (charSequence == null) {
            charSequence = resources.getString(R.string.watch_card_expand_text);
        }
        textView.setText(charSequence);
        this.c.setContentDescription("");
    }
}
