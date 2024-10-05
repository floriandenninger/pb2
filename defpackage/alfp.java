package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alfp extends ahe {
    private alfq a;
    private int b;

    public alfp() {
        this.b = 0;
    }

    public alfp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public final int E() {
        alfq alfqVar = this.a;
        if (alfqVar != null) {
            return alfqVar.b;
        }
        return 0;
    }

    public final boolean F(int i) {
        alfq alfqVar = this.a;
        if (alfqVar != null) {
            return alfqVar.c(i);
        }
        this.b = i;
        return false;
    }

    @Override // defpackage.ahe
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        rX(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new alfq(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    protected void rX(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.l(view, i);
    }
}
