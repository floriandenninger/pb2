package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rl extends ra implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, re {
    final vk a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final qq f;
    private final qn h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private rd o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new rj(this);
    private final View.OnAttachStateChangeListener l = new rk(this);
    private int s = 0;

    public rl(Context context, qq qqVar, View view, int i, boolean z) {
        this.e = context;
        this.f = qqVar;
        this.i = z;
        this.h = new qn(qqVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new vk(context, i);
        qqVar.h(this, context);
    }

    @Override // defpackage.re
    public final void c(qq qqVar, boolean z) {
        if (qqVar != this.f) {
            return;
        }
        k();
        rd rdVar = this.o;
        if (rdVar != null) {
            rdVar.a(qqVar, z);
        }
    }

    @Override // defpackage.re
    public final void d(rd rdVar) {
        this.o = rdVar;
    }

    @Override // defpackage.re
    public final boolean e() {
        return false;
    }

    @Override // defpackage.re
    public final boolean f(rm rmVar) {
        if (rmVar.hasVisibleItems()) {
            rc rcVar = new rc(this.e, rmVar, this.c, this.i, this.k);
            rcVar.e(this.o);
            rcVar.d(ra.w(rmVar));
            rcVar.c = this.m;
            this.m = null;
            this.f.i(false);
            vk vkVar = this.a;
            int i = vkVar.g;
            int b = vkVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, jw.e(this.n)) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!rcVar.h()) {
                if (rcVar.a != null) {
                    rcVar.g(i, b, true, true);
                }
            }
            rd rdVar = this.o;
            if (rdVar != null) {
                rdVar.b(rmVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.re
    public final void i() {
        this.q = false;
        qn qnVar = this.h;
        if (qnVar != null) {
            qnVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ra
    public final void j(qq qqVar) {
    }

    @Override // defpackage.ri
    public final ListView jC() {
        return this.a.e;
    }

    @Override // defpackage.ri
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.ra
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.ra
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.ra
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.ra
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.ra
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.ra
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.ra
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.ri
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.v(this);
        vk vkVar = this.a;
        vkVar.m = this;
        vkVar.z();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        vk vkVar2 = this.a;
        vkVar2.l = view2;
        vkVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.y();
        this.a.t(this.g);
        this.a.s();
        ug ugVar = this.a.e;
        ugVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ugVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            ugVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.s();
    }

    @Override // defpackage.ri
    public final boolean u() {
        return !this.p && this.a.u();
    }
}
