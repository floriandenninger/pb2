package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class myd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aqco a;
    final /* synthetic */ mye b;

    public myd(mye myeVar, aqco aqcoVar) {
        this.b = myeVar;
        this.a = aqcoVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Resources resources = this.b.g.getResources();
        int K = yjk.K(resources.getDisplayMetrics(), 16);
        int K2 = yjk.K(resources.getDisplayMetrics(), 8);
        Context context = this.b.g;
        asvx asvxVar = this.a.n;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        yny.z(this.b.a, yny.x(((Integer) mcy.A(context, asvxVar, K, K2).e(Integer.valueOf(resources.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), LinearLayout.LayoutParams.class);
        return false;
    }
}
