package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mmy implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ aqcb b;
    final /* synthetic */ mmz c;

    public mmy(mmz mmzVar, ViewGroup viewGroup, aqcb aqcbVar) {
        this.c = mmzVar;
        this.a = viewGroup;
        this.b = aqcbVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Resources resources = this.c.n.getResources();
        Context context = this.c.n;
        asvx asvxVar = this.b.p;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        ammv A = mcy.A(context, asvxVar, resources.getDimensionPixelSize(R.dimen.compact_movie_horizontal_padding), resources.getDimensionPixelSize(R.dimen.compact_movie_menu_offset));
        if (this.b.r) {
            final ViewGroup viewGroup = this.a;
            int intValue = ((Integer) A.b(new amml() { // from class: mmx
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    return Integer.valueOf((((Integer) obj).intValue() - viewGroup.getMeasuredWidth()) / 2);
                }
            }).e(0)).intValue();
            yny.z(this.a, yny.h(yny.r(intValue), yny.q(intValue + resources.getDimensionPixelSize(R.dimen.compact_movie_horizontal_padding))), GridLayout.LayoutParams.class);
        } else {
            yny.z(this.a, yny.x(((Integer) A.e(Integer.valueOf(resources.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), GridLayout.LayoutParams.class);
        }
        return false;
    }
}
