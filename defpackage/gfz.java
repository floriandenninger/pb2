package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfz implements AccessibilityManager.AccessibilityStateChangeListener, fxh, adlr, flb, fxi, ypd {
    public final Context a;
    public final fxj b;
    public final AccessibilityStateReceiver c;
    public final flc d;
    public boolean f;
    private final ypa g;
    private final gfy h;
    private final adlt i;
    private boolean k;
    private Boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    public final Set e = new HashSet();
    private final Set j = new HashSet();

    public gfz(Context context, adlt adltVar, AccessibilityStateReceiver accessibilityStateReceiver, fxj fxjVar, ypa ypaVar, gfy gfyVar, flc flcVar) {
        this.a = context;
        this.b = fxjVar;
        this.g = ypaVar;
        this.h = gfyVar;
        this.i = adltVar;
        this.c = accessibilityStateReceiver;
        this.d = flcVar;
    }

    private final void p(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        i();
    }

    @Override // defpackage.fxi
    public final void a() {
        this.m = false;
        this.i.k(this);
        i();
        this.g.m(this);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.m = true;
        this.i.i(this);
        this.o = this.i.g() != null;
        i();
        e(this.a.getResources().getConfiguration());
        this.g.g(this);
    }

    @Override // defpackage.flb
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.flb
    public final void d(boolean z) {
        this.n = false;
        i();
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        boolean z = configuration.orientation == 1;
        if (this.f != z) {
            this.f = z;
            i();
        }
    }

    public final void g(int i) {
        this.j.add(Integer.valueOf(i));
        i();
    }

    @Override // defpackage.flb
    public final void h(boolean z) {
        this.n = true;
        i();
    }

    public final void i() {
        yjk.f();
        this.l = null;
        boolean o = o();
        if (this.q == o) {
            return;
        }
        this.q = o;
        for (mhk mhkVar : this.e) {
            mhkVar.d.q();
            if (o && mhkVar.g != null) {
                Handler handler = mhkVar.f;
                ScrollSelectionController scrollSelectionController = mhkVar.e;
                scrollSelectionController.getClass();
                handler.post(new mhj(scrollSelectionController, 0));
            }
        }
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        p(false);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{gfx.class};
        }
        if (i == 0) {
            i();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        p(true);
    }

    public final void m(int i) {
        this.j.remove(Integer.valueOf(i));
        i();
    }

    public final void n(boolean z) {
        if (z != this.k) {
            this.k = z;
            i();
        }
    }

    public final boolean o() {
        Boolean bool = this.l;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        if (!this.m || !this.n || this.o || this.p || !this.j.isEmpty() || (this.k && (!this.f || !this.h.f()))) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.l = valueOf;
        return valueOf.booleanValue();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        i();
    }
}
