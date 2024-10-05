package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzg extends vw {
    static final int[] d = {CellularSignalStrengthError.ERROR_NOT_SUPPORTED};
    private final int e;
    private final Activity f;
    private final ColorDrawable g = new ColorDrawable();
    private final ajjz h;
    private final we i;
    private final we j;
    private List k;
    private kzf l;
    private avgg m;
    private int n;

    public kzg(Activity activity, ajjz ajjzVar, we weVar, we weVar2, int i) {
        this.f = activity;
        this.h = ajjzVar;
        this.i = weVar;
        this.j = weVar2;
        this.e = i;
    }

    private final boolean A() {
        avgg avggVar = this.m;
        return avggVar != null && avggVar.c.size() > 0;
    }

    private static final kzd B(int i, ViewGroup viewGroup, we weVar) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        frameLayout.setLayoutParams(weVar);
        return new kzd(frameLayout, whu.Q(frameLayout.findViewById(R.id.scrim)));
    }

    private final avgg z(int i) {
        if (w()) {
            List list = this.k;
            if (list == null || i >= list.size()) {
                return null;
            }
            return (avgg) this.k.get(i);
        }
        if (i == 0) {
            return this.m;
        }
        List list2 = this.k;
        if (list2 == null || i > list2.size()) {
            return null;
        }
        return (avgg) this.k.get(i - 1);
    }

    @Override // defpackage.vw
    public final int b() {
        return w() ? 4 : 3;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return (i == 0 && this.n == 3 && A()) ? 0 : 1;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        kzf kzfVar;
        kzd kzdVar = (kzd) wvVar;
        kzdVar.a.setLayoutParams(x(i) ? this.j : this.i);
        List list = this.k;
        boolean z = true;
        int size = (list == null ? 0 : list.size()) + (!w() ? 1 : 0);
        if (i < size) {
            this.h.h(kzdVar.u, z(i));
        }
        boolean z2 = i == b() + (-1) && w();
        ImageView imageView = kzdVar.w;
        if (imageView != null) {
            imageView.setVisibility(true != z2 ? 8 : 0);
        }
        kzdVar.v.setVisibility((i >= size || z2) ? 0 : 8);
        avgg z3 = z(0);
        if (c(i) != 0 && i < size) {
            z = false;
        }
        if (z2 && i < size) {
            kzdVar.t.a(d);
        } else if (z && z3 != null) {
            if (this.l == null) {
                this.l = new kzf();
            }
            kzf kzfVar2 = this.l;
            zbb zbbVar = kzdVar.t;
            if (!kzfVar2.a.contains(zbbVar)) {
                kzfVar2.c();
                kzfVar2.a.add(zbbVar);
            }
        } else if (i >= size) {
            this.g.setColor(wbs.Q(kzdVar.u.getContext(), R.attr.ytIconInactive));
            kzdVar.u.setImageDrawable(this.g);
            kzdVar.t.a(d);
        }
        if (i != b() - 1 || (kzfVar = this.l) == null || kzfVar.a.isEmpty()) {
            return;
        }
        this.h.l(ahbw.E(z(0)), yki.c(this.f, this.l));
    }

    public final boolean w() {
        int i = this.n;
        return i == 0 || i == 1 || i == 2 || !A();
    }

    public final boolean x(int i) {
        return i == 0 && !w();
    }

    public final void y(int i, avgg avggVar, List list) {
        this.n = i;
        this.m = avggVar;
        this.k = list;
        kzf kzfVar = this.l;
        if (kzfVar != null) {
            kzfVar.c();
            kzfVar.a.clear();
            this.l = null;
        }
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            kzd B = B(R.layout.avatar_image_layout, viewGroup, this.j);
            ViewGroup.LayoutParams layoutParams = B.u.getLayoutParams();
            layoutParams.height = this.e;
            layoutParams.width = this.e;
            return B;
        }
        return B(R.layout.scrim_image_layout, viewGroup, this.i);
    }
}
