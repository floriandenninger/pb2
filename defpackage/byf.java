package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byf extends ic {
    final /* synthetic */ ViewPager b;

    public byf(ViewPager viewPager) {
        this.b = viewPager;
    }

    private final boolean k() {
        bxz bxzVar = this.b.b;
        return bxzVar != null && bxzVar.j() > 1;
    }

    @Override // defpackage.ic
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        bxz bxzVar;
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(k());
        if (accessibilityEvent.getEventType() != 4096 || (bxzVar = this.b.b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(bxzVar.j());
        accessibilityEvent.setFromIndex(this.b.c);
        accessibilityEvent.setToIndex(this.b.c);
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.r("androidx.viewpager.widget.ViewPager");
        ksVar.C(k());
        if (this.b.canScrollHorizontally(1)) {
            ksVar.h(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            ksVar.h(8192);
        }
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.b.canScrollHorizontally(-1)) {
                return false;
            }
            this.b.l(r2.c - 1);
            return true;
        }
        if (!this.b.canScrollHorizontally(1)) {
            return false;
        }
        ViewPager viewPager = this.b;
        viewPager.l(viewPager.c + 1);
        return true;
    }
}
