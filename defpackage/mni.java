package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mni implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ mnj a;

    public mni(mnj mnjVar) {
        this.a = mnjVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a.getViewTreeObserver().removeOnPreDrawListener(this);
        mnj mnjVar = this.a;
        Context context = mnjVar.b;
        asvx asvxVar = mnjVar.d.k;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        ammv A = mcy.A(context, asvxVar, this.a.c.getDimensionPixelSize(R.dimen.compact_show_horizontal_padding), this.a.c.getDimensionPixelSize(R.dimen.compact_show_menu_offset));
        mnj mnjVar2 = this.a;
        yny.z(mnjVar2.a, yny.x(((Integer) A.e(Integer.valueOf(mnjVar2.c.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), GridLayout.LayoutParams.class);
        return false;
    }
}
