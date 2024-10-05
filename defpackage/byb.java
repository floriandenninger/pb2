package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byb implements iw {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public byb(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        ko t = jw.t(view, koVar);
        if (t.x()) {
            return t;
        }
        Rect rect = this.b;
        rect.left = t.d();
        rect.top = t.f();
        rect.right = t.e();
        rect.bottom = t.c();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ko r = jw.r(this.a.getChildAt(i), t);
            rect.left = Math.min(r.d(), rect.left);
            rect.top = Math.min(r.f(), rect.top);
            rect.right = Math.min(r.e(), rect.right);
            rect.bottom = Math.min(r.c(), rect.bottom);
        }
        ke keVar = new ke(t);
        keVar.c(fn.c(rect));
        return keVar.a();
    }
}
