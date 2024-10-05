package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lyy {
    public final Context a;
    int b = -1;
    private final axpg c;

    /* JADX INFO: Access modifiers changed from: protected */
    public lyy(Context context, axpg axpgVar) {
        this.a = context;
        axpgVar.getClass();
        this.c = axpgVar;
    }

    protected int a() {
        return -1;
    }

    protected int b() {
        return -1;
    }

    protected abstract ViewGroup c();

    /* JADX INFO: Access modifiers changed from: protected */
    public final AppBarLayout d() {
        return (AppBarLayout) this.c.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        int i;
        AppBarLayout d = d();
        ViewGroup c = c();
        ViewGroup viewGroup = (ViewGroup) c.getParent();
        if (viewGroup != d) {
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, a());
            c.setTag(295039029, Integer.valueOf(b()));
            int b = b();
            if (b >= 0) {
                int i2 = 0;
                while (i2 < d.getChildCount()) {
                    Object tag = d.getChildAt(i2).getTag(295039029);
                    int intValue = tag instanceof Integer ? ((Integer) tag).intValue() : 0;
                    if (intValue < 0 || intValue > b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i = i2;
            } else {
                i = d.getChildCount();
            }
            d.addView(c, i, layoutParams);
            this.b = -1;
        }
    }

    protected void f() {
        whu.I(c(), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        if (!j()) {
            if (this.b != 0) {
                f();
                this.b = 0;
                return;
            }
            return;
        }
        e();
        if (this.b == 1) {
            return;
        }
        i();
        this.b = 1;
    }

    public abstract void h(gad gadVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        whu.I(c(), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j() {
        throw null;
    }
}
