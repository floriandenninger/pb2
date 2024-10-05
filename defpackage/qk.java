package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qk extends ra implements View.OnKeyListener, PopupWindow.OnDismissListener, re {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private rd y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new qf(this);
    private final View.OnAttachStateChangeListener m = new qg(this);
    private final vi n = new qi(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public qk(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return jw.e(this.q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.qq r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.z(qq):void");
    }

    @Override // defpackage.re
    public final void c(qq qqVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (qqVar == ((qj) this.b.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            ((qj) this.b.get(i2)).b.i(false);
        }
        qj qjVar = (qj) this.b.remove(i);
        qjVar.b.m(this);
        if (this.f) {
            vk vkVar = qjVar.a;
            if (Build.VERSION.SDK_INT >= 23) {
                vkVar.p.setExitTransition(null);
            }
            qjVar.a.p.setAnimationStyle(0);
        }
        qjVar.a.k();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((qj) this.b.get(size2 - 1)).c;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((qj) this.b.get(0)).b.i(false);
                return;
            }
            return;
        }
        k();
        rd rdVar = this.y;
        if (rdVar != null) {
            rdVar.a(qqVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.re
    public final void d(rd rdVar) {
        this.y = rdVar;
    }

    @Override // defpackage.re
    public final boolean e() {
        return false;
    }

    @Override // defpackage.re
    public final boolean f(rm rmVar) {
        for (qj qjVar : this.b) {
            if (rmVar == qjVar.b) {
                qjVar.a().requestFocus();
                return true;
            }
        }
        if (!rmVar.hasVisibleItems()) {
            return false;
        }
        j(rmVar);
        rd rdVar = this.y;
        if (rdVar != null) {
            rdVar.b(rmVar);
        }
        return true;
    }

    @Override // defpackage.re
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((qj) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.ra
    public final void j(qq qqVar) {
        qqVar.h(this, this.h);
        if (u()) {
            z(qqVar);
        } else {
            this.l.add(qqVar);
        }
    }

    @Override // defpackage.ri
    public final ListView jC() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((qj) this.b.get(r0.size() - 1)).a();
    }

    @Override // defpackage.ri
    public final void k() {
        int size = this.b.size();
        if (size <= 0) {
            return;
        }
        qj[] qjVarArr = (qj[]) this.b.toArray(new qj[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qj qjVar = qjVarArr[size];
            if (qjVar.a.u()) {
                qjVar.a.k();
            }
        }
    }

    @Override // defpackage.ra
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, jw.e(view));
        }
    }

    @Override // defpackage.ra
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.ra
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, jw.e(this.q));
        }
    }

    @Override // defpackage.ra
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        qj qjVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                qjVar = null;
                break;
            }
            qjVar = (qj) this.b.get(i);
            if (!qjVar.a.u()) {
                break;
            } else {
                i++;
            }
        }
        if (qjVar != null) {
            qjVar.b.i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.ra
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ra
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.ri
    public final void s() {
        if (u()) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            z((qq) it.next());
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.ra
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.ri
    public final boolean u() {
        return this.b.size() > 0 && ((qj) this.b.get(0)).a.u();
    }
}
