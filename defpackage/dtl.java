package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtl extends lo {
    public dti a;
    public wd b;
    private final dre c;
    private View d;
    private int e = -1;

    public dtl(dre dreVar) {
        this.c = dreVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        int c = ((dsx) this.c).H.c();
        if (c != -1) {
            int i3 = c;
            while (true) {
                if (i3 < 0) {
                    i3 = -1;
                    break;
                } else if (this.c.k(i3)) {
                    break;
                } else {
                    i3--;
                }
            }
            ComponentTree j = this.c.j(c);
            View view = this.d;
            if (view != null && j != null && view != j.getLithoView()) {
                this.d.setTranslationY(0.0f);
                this.d = null;
            }
            if (i3 == -1 || j == null) {
                this.a.p();
                this.e = -1;
                return;
            }
            if (c == i3) {
                dkp lithoView = j.getLithoView();
                if (lithoView == null) {
                    boolean as = this.a.l.as();
                    String f = j.f();
                    boolean z = j.p;
                    boolean s = j.s();
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 141);
                    sb.append("First visible sticky header item is null, RV.hasPendingAdapterUpdates: ");
                    sb.append(as);
                    sb.append(", first visible component: ");
                    sb.append(f);
                    sb.append(", hasMounted: ");
                    sb.append(z);
                    sb.append(", isReleased: ");
                    sb.append(s);
                    dhz.a(2, "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull", sb.toString());
                } else {
                    int i4 = i3 + 1;
                    if (!this.c.l(i4) || !this.c.k(i4)) {
                        lithoView.setTranslationY(-lithoView.getTop());
                    }
                }
                this.d = lithoView;
                this.a.p();
                this.e = -1;
                return;
            }
            int i5 = 0;
            if (this.a.k.getVisibility() == 8 || i3 != this.e) {
                ComponentTree j2 = this.c.j(i3);
                dkp lithoView2 = j2.getLithoView();
                if (lithoView2 != null && lithoView2.getWindowToken() != null) {
                    lithoView2.onStartTemporaryDetach();
                }
                dti dtiVar = this.a;
                if (j2.getLithoView() != null) {
                    dkp lithoView3 = j2.getLithoView();
                    lithoView3.z = lithoView3.r;
                }
                dtiVar.k.G(j2);
                dtiVar.q(dtiVar.getWidth());
                dti dtiVar2 = this.a;
                dtiVar2.k.setVisibility(0);
                dtiVar2.k.A();
            }
            int e = ((dsx) this.c).H.e();
            while (true) {
                if (c > e) {
                    break;
                }
                if (this.c.k(c)) {
                    i5 = Math.min((this.b.S(c).getTop() - this.a.k.getBottom()) + this.a.getPaddingTop(), 0);
                    break;
                }
                c++;
            }
            this.a.k.setTranslationY(i5);
            this.e = i3;
        }
    }
}
