package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyb implements nwy {
    private final ViewGroup a;
    private final aypn d;
    private final ayqi e;
    private final azqv c = azqv.aq(new Rect(0, 0, 0, 0));
    private final azqv b = azqv.aq(0);

    public nyb(ViewGroup viewGroup, ayqi ayqiVar, ntv ntvVar) {
        this.a = viewGroup;
        this.e = ayqiVar;
        this.d = aypn.z(Double.valueOf(0.34d)).j(ntvVar.b.s(niy.t).A(nxb.l).A(nxb.k)).n();
    }

    @Override // defpackage.nwy
    public final int a() {
        Integer num = (Integer) this.b.ar();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.nwy
    public final Rect b() {
        Rect rect = (Rect) this.c.ar();
        return rect != null ? rect : new Rect(0, 0, 0, 0);
    }

    @Override // defpackage.nwy
    public final aypn c() {
        return this.c;
    }

    @Override // defpackage.nwy
    public final aypn d() {
        return this.b;
    }

    @Override // defpackage.nwy
    public final void e() {
        final View findViewById = this.a.findViewById(R.id.accessibility_layer_container);
        findViewById.getClass();
        this.c.c(new Rect(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom()));
        aypn i = whu.A(findViewById, this.e).i(aypg.LATEST);
        aypn.e(this.d, i, new ayro() { // from class: nya
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                DisplayMetrics displayMetrics = findViewById.getContext().getResources().getDisplayMetrics();
                int height = ((Rect) obj2).height();
                double doubleValue = ((Double) obj).doubleValue();
                int i2 = 0;
                if (displayMetrics != null && yjk.P(displayMetrics, height) >= 500) {
                    double d = height;
                    Double.isNaN(d);
                    i2 = (int) (d * doubleValue);
                }
                return Integer.valueOf(i2);
            }
        }).aa(this.b);
        i.aa(this.c);
    }
}
