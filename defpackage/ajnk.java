package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnk extends ajmv {
    private LinearLayout a;

    public ajnk(Context context, ajop ajopVar, ajos ajosVar) {
        super(context, ajopVar, ajosVar);
    }

    @Override // defpackage.ajmv
    protected final ViewGroup d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.a.setGravity(48);
        return this.a;
    }

    @Override // defpackage.ajmv
    protected final ajnc e(Context context, ajos ajosVar) {
        return new ajnj(context, ajosVar);
    }

    @Override // defpackage.ajmv
    protected final void g(ajok ajokVar, ajni ajniVar) {
        this.a.setPadding(ajokVar.b("grid_row_presenter_horizontal_row_padding", ajniVar.e), ajokVar.b("grid_row_presenter_top_padding", ajniVar.c), ajokVar.b("grid_row_presenter_horizontal_row_padding", ajniVar.f), ajokVar.b("grid_row_presenter_bottom_padding", ajniVar.d));
    }

    @Override // defpackage.ajmv
    protected final void i(View view, ajni ajniVar, int i) {
        int i2 = ajniVar.g;
        view.setPadding(i2, 0, i2, 0);
        this.a.addView(view);
    }
}
