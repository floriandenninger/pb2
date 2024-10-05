package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqc extends ajpc {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ajop d;
    private final Resources e;
    private final Context f;

    public mqc(Context context, gma gmaVar) {
        context.getClass();
        this.d = gmaVar;
        View inflate = View.inflate(context, R.layout.item_section_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = context;
        this.e = context.getResources();
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.d).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        aska askaVar = (aska) obj;
        TextView textView = this.b;
        aqyg aqygVar2 = null;
        if ((askaVar.b & 1) != 0) {
            aqygVar = askaVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.c;
        if ((askaVar.b & 4) != 0 && (aqygVar2 = askaVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        this.d.e(ajokVar);
        int di = amkq.di(askaVar.d);
        int i = di != 0 ? di : 1;
        if (i == 2 || i == 3) {
            jm.s(this.b, R.style.TextAppearance_YouTube_Body1);
            jm.s(this.c, R.style.TextAppearance_YouTube_Caption);
        } else if (i == 4) {
            jm.s(this.b, R.style.TextAppearance_YouTube_Subhead);
            jm.s(this.c, R.style.TextAppearance_YouTube_Body1);
            this.c.setTextColor(wbs.W(this.f, R.attr.ytTextSecondary).orElse(0));
        } else if (i == 6) {
            jm.s(this.b, R.style.TextAppearance_YouTube_Spec_Body2b);
            this.b.setTextColor(wbs.W(this.f, R.attr.ytTextSecondary).orElse(0));
        } else if (i == 5) {
            jm.s(this.b, R.style.TextAppearance_YouTube_Subhead);
            this.b.setTextColor(wbs.W(this.f, R.attr.ytTextPrimary).orElse(0));
            this.b.setTypeface(ajct.ROBOTO_MEDIUM.a(this.f));
        } else {
            jm.s(this.b, R.style.TextAppearance_YouTube_Body2);
            jm.s(this.c, R.style.TextAppearance_YouTube_Caption);
        }
        View view = this.a;
        if (i == 2) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_min_height);
        } else if (i == 3) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_min_height);
        } else if (i == 4) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_min_height);
        } else if (i == 6) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_min_height);
        } else {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_min_height);
        }
        view.setMinimumHeight(dimensionPixelSize);
        View view2 = this.a;
        int paddingLeft = view2.getPaddingLeft();
        if (i == 2) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_top_padding);
        } else if (i == 3) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_top_padding);
        } else if (i == 4) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_top_padding);
        } else if (i == 6) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_top_padding);
        } else {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_top_padding);
        }
        int paddingRight = this.a.getPaddingRight();
        if (i == 2) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_bottom_padding);
        } else if (i == 3) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_bottom_padding);
        } else if (i == 4) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_bottom_padding);
        } else if (i == 6) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_bottom_padding);
        } else {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_bottom_padding);
        }
        view2.setPadding(paddingLeft, dimensionPixelSize2, paddingRight, dimensionPixelSize3);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
