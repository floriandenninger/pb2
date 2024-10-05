package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yo implements re {
    qq a;
    public qt b;
    final /* synthetic */ Toolbar c;

    public yo(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.re
    public final void b(Context context, qq qqVar) {
        qt qtVar;
        qq qqVar2 = this.a;
        if (qqVar2 != null && (qtVar = this.b) != null) {
            qqVar2.t(qtVar);
        }
        this.a = qqVar;
    }

    @Override // defpackage.re
    public final void c(qq qqVar, boolean z) {
    }

    @Override // defpackage.re
    public final void d(rd rdVar) {
        throw null;
    }

    @Override // defpackage.re
    public final boolean e() {
        return false;
    }

    @Override // defpackage.re
    public final boolean f(rm rmVar) {
        return false;
    }

    @Override // defpackage.re
    public final boolean g(qt qtVar) {
        KeyEvent.Callback callback = this.c.e;
        if (callback instanceof pq) {
            ((pq) callback).onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.e);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.d);
        Toolbar toolbar3 = this.c;
        toolbar3.e = null;
        int size = toolbar3.p.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.p.get(size));
            } else {
                toolbar3.p.clear();
                this.b = null;
                this.c.requestLayout();
                qtVar.h(false);
                return true;
            }
        }
    }

    @Override // defpackage.re
    public final boolean h(qt qtVar) {
        Toolbar toolbar = this.c;
        if (toolbar.d == null) {
            toolbar.d = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.d.setImageDrawable(toolbar.b);
            toolbar.d.setContentDescription(toolbar.c);
            yp E = Toolbar.E();
            E.a = (toolbar.h & 112) | 8388611;
            E.b = 2;
            toolbar.d.setLayoutParams(E);
            toolbar.d.setOnClickListener(new yn(toolbar));
        }
        ViewParent parent = this.c.d.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.d);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.d);
        }
        this.c.e = qtVar.getActionView();
        this.b = qtVar;
        ViewParent parent2 = this.c.e.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.e);
            }
            yp E2 = Toolbar.E();
            Toolbar toolbar5 = this.c;
            E2.a = 8388611 | (toolbar5.h & 112);
            E2.b = 2;
            toolbar5.e.setLayoutParams(E2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.e);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((yp) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.p.add(childAt);
            }
        }
        this.c.requestLayout();
        qtVar.h(true);
        KeyEvent.Callback callback = this.c.e;
        if (callback instanceof pq) {
            ((pq) callback).onActionViewExpanded();
        }
        return true;
    }

    @Override // defpackage.re
    public final void i() {
        if (this.b != null) {
            qq qqVar = this.a;
            if (qqVar != null) {
                int size = qqVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }
}
