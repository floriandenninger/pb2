package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lvg extends bxz {
    final /* synthetic */ lvi a;

    public lvg(lvi lviVar) {
        this.a = lviVar;
    }

    @Override // defpackage.bxz
    public final Object c(ViewGroup viewGroup, int i) {
        lvi lviVar = this.a;
        View view = (View) lviVar.c.get(lviVar.b.y(i));
        this.a.b.addView(view, 0);
        return view;
    }

    @Override // defpackage.bxz
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        this.a.b.removeView((View) obj);
    }

    @Override // defpackage.bxz
    public final boolean g(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.bxz
    public final int j() {
        return this.a.c.size();
    }

    @Override // defpackage.bxz
    public final int k(Object obj) {
        for (int i = 0; i < this.a.c.size(); i++) {
            if (((View) this.a.c.get(i)) == obj) {
                return this.a.b.y(i);
            }
        }
        return -2;
    }
}
