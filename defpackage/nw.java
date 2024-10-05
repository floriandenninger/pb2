package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nw extends lu implements rt {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ts d;
    ActionBarContextView e;
    View f;
    nv g;
    pp h;
    po i;
    public int j;
    public boolean k;
    boolean l;
    public boolean m;
    public py n;
    boolean o;
    final kb p;
    final kb q;
    final nu r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    public nw(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ns(this);
        this.q = new nt(this);
        this.r = new nu(this);
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private final void G(View view) {
        ts f;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.youtube.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((nw) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    jw.K(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback findViewById = view.findViewById(com.google.android.youtube.R.id.action_bar);
        if (findViewById instanceof ts) {
            f = (ts) findViewById;
        } else if (findViewById instanceof Toolbar) {
            f = ((Toolbar) findViewById).f();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.d = f;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.youtube.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.youtube.R.id.action_bar_container);
        this.c = actionBarContainer;
        ts tsVar = this.d;
        if (tsVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = tsVar.b();
        if ((this.d.a() & 4) != 0) {
            this.v = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        C();
        H(jp.d(context));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, nx.a, com.google.android.youtube.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.d) {
                this.o = true;
                actionBarOverlayLayout2.l(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            jw.S(this.c, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.lu
    public final void A() {
        this.d.o(com.google.android.youtube.R.string.abc_action_bar_up_description);
    }

    @Override // defpackage.lu
    public final void B() {
        this.d.l(null);
    }

    @Override // defpackage.lu
    public final void C() {
        this.d.C();
    }

    public final void D(boolean z) {
        ka c;
        ka b;
        if (z) {
            if (!this.y) {
                this.y = true;
                E(false);
            }
        } else if (this.y) {
            this.y = false;
            E(false);
        }
        if (!jw.al(this.c)) {
            if (z) {
                this.d.r(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.d.r(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            b = this.d.c(4, 100L);
            c = this.e.b(0, 200L);
        } else {
            c = this.d.c(0, 200L);
            b = this.e.b(8, 100L);
        }
        py pyVar = new py();
        pyVar.a.add(b);
        View view = (View) b.a.get();
        c.g(view != null ? view.animate().getDuration() : 0L);
        pyVar.a.add(c);
        pyVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(boolean r7) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.E(boolean):void");
    }

    @Override // defpackage.lu
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.lu
    public final Context b() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    @Override // defpackage.lu
    public final pp c(po poVar) {
        nv nvVar = this.g;
        if (nvVar != null) {
            nvVar.f();
        }
        this.b.l(false);
        this.e.i();
        nv nvVar2 = new nv(this, this.e.getContext(), poVar);
        nvVar2.a.s();
        try {
            if (!nvVar2.b.c(nvVar2, nvVar2.a)) {
                return null;
            }
            this.g = nvVar2;
            nvVar2.g();
            this.e.h(nvVar2);
            D(true);
            this.e.sendAccessibilityEvent(32);
            return nvVar2;
        } finally {
            nvVar2.a.r();
        }
    }

    @Override // defpackage.lu
    public final View d() {
        return this.d.d();
    }

    @Override // defpackage.lu
    public final void e(boolean z) {
        if (z == this.w) {
            return;
        }
        this.w = z;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((lt) this.x.get(i)).a();
        }
    }

    @Override // defpackage.lu
    public final void f() {
        if (this.l) {
            return;
        }
        this.l = true;
        E(false);
    }

    @Override // defpackage.lu
    public final void h(View view, ls lsVar) {
        view.setLayoutParams(lsVar);
        this.d.j(view);
    }

    @Override // defpackage.lu
    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        j(z);
    }

    @Override // defpackage.lu
    public final void j(boolean z) {
        k(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.lu
    public final void k(int i, int i2) {
        int a = this.d.a();
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        this.d.k((i & i2) | ((i2 ^ (-1)) & a));
    }

    @Override // defpackage.lu
    public final void l(boolean z) {
        k(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.lu
    public final void m(Drawable drawable) {
        this.d.p(drawable);
    }

    @Override // defpackage.lu
    public final void n(boolean z) {
        py pyVar;
        this.A = z;
        if (z || (pyVar = this.n) == null) {
            return;
        }
        pyVar.a();
    }

    @Override // defpackage.lu
    public final void o(int i) {
        p(this.a.getString(i));
    }

    @Override // defpackage.lu
    public final void p(CharSequence charSequence) {
        this.d.q(charSequence);
    }

    @Override // defpackage.lu
    public final void q(CharSequence charSequence) {
        this.d.t(charSequence);
    }

    @Override // defpackage.lu
    public final void r() {
        if (this.l) {
            this.l = false;
            E(false);
        }
    }

    @Override // defpackage.lu
    public final boolean t() {
        ts tsVar = this.d;
        if (tsVar == null || !tsVar.v()) {
            return false;
        }
        this.d.f();
        return true;
    }

    @Override // defpackage.lu
    public final boolean v(int i, KeyEvent keyEvent) {
        nv nvVar = this.g;
        if (nvVar == null) {
            return false;
        }
        qq qqVar = nvVar.a;
        qqVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return qqVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.lu
    public final void y() {
        H(jp.d(this.a));
    }

    @Override // defpackage.lu
    public final void z() {
        k(0, 8);
    }

    private final void H(boolean z) {
        if (z) {
            this.d.B();
        } else {
            this.d.B();
        }
        this.d.A();
        this.d.D();
        this.b.e = false;
    }

    public nw(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ns(this);
        this.q = new nt(this);
        this.r = new nu(this);
        G(dialog.getWindow().getDecorView());
    }
}
