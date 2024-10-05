package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class va {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(wk wkVar) {
        List list = this.l;
        if (list == null) {
            View c = wkVar.c(this.d);
            this.d += this.e;
            return c;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((wv) this.l.get(i)).a;
            we weVar = (we) view.getLayoutParams();
            if (!weVar.pN() && this.d == weVar.pL()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int pL;
        int size = this.l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = ((wv) this.l.get(i2)).a;
            we weVar = (we) view3.getLayoutParams();
            if (view3 != view && !weVar.pN() && (pL = (weVar.pL() - this.d) * this.e) >= 0 && pL < i) {
                if (pL == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = pL;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((we) view2.getLayoutParams()).pL();
        }
    }

    public final boolean d(ws wsVar) {
        int i = this.d;
        return i >= 0 && i < wsVar.a();
    }
}
