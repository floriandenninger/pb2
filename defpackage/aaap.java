package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaap extends lo {
    final /* synthetic */ aaaq a;

    public aaap(aaaq aaaqVar) {
        this.a = aaaqVar;
    }

    private final void j() {
        int J2 = this.a.d.J();
        View childAt = this.a.c.getChildAt(0);
        this.a.e.setVisibility(true != (J2 > 0 || (childAt != null && childAt.getTop() < 0)) ? 4 : 0);
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        int i2;
        j();
        aabq aabqVar = this.a.f;
        if (aabqVar != null) {
            aabqVar.h();
        }
        if (i == 0) {
            aaaq aaaqVar = this.a;
            aabq aabqVar2 = aaaqVar.f;
            if (aaaqVar.c == null) {
                i2 = -1;
            } else {
                int J2 = aaaqVar.d.J();
                View childAt = aaaqVar.c.getChildAt(0);
                i2 = (childAt == null || ((float) childAt.getTop()) >= ((float) childAt.getHeight()) * (-0.3f)) ? J2 : J2 + 1;
            }
            aabqVar2.n(i2);
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        j();
        aabq aabqVar = this.a.f;
        if (aabqVar != null) {
            aabqVar.h();
        }
    }
}
