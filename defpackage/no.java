package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class no extends lu {
    final ts a;
    boolean b;
    final Window.Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f = new ArrayList();
    private final Runnable g = new nj(this);
    private final yq h;

    public no(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        nk nkVar = new nk(this);
        this.h = nkVar;
        yt ytVar = new yt(toolbar, false);
        this.a = ytVar;
        nn nnVar = new nn(this, callback);
        this.c = nnVar;
        ytVar.e = nnVar;
        toolbar.q = nkVar;
        ytVar.t(charSequence);
    }

    @Override // defpackage.lu
    public final void A() {
        this.a.o(R.string.abc_action_bar_up_description);
    }

    @Override // defpackage.lu
    public final void B() {
        this.a.l(null);
    }

    @Override // defpackage.lu
    public final void C() {
    }

    public final Menu D() {
        if (!this.d) {
            ts tsVar = this.a;
            nl nlVar = new nl(this);
            nm nmVar = new nm(this);
            Toolbar toolbar = ((yt) tsVar).a;
            toolbar.t = nlVar;
            toolbar.u = nmVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f(nlVar, nmVar);
            }
            this.d = true;
        }
        return ((yt) this.a).a.g();
    }

    @Override // defpackage.lu
    public final int a() {
        return ((yt) this.a).b;
    }

    @Override // defpackage.lu
    public final Context b() {
        return this.a.b();
    }

    @Override // defpackage.lu
    public final View d() {
        return ((yt) this.a).c;
    }

    @Override // defpackage.lu
    public final void e(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((lt) this.f.get(i)).a();
        }
    }

    @Override // defpackage.lu
    public final void f() {
        this.a.r(8);
    }

    @Override // defpackage.lu
    public final void g() {
        ((yt) this.a).a.removeCallbacks(this.g);
    }

    @Override // defpackage.lu
    public final void h(View view, ls lsVar) {
        view.setLayoutParams(lsVar);
        this.a.j(view);
    }

    @Override // defpackage.lu
    public final void i(boolean z) {
    }

    @Override // defpackage.lu
    public final void j(boolean z) {
        k(4, 4);
    }

    @Override // defpackage.lu
    public final void k(int i, int i2) {
        ts tsVar = this.a;
        tsVar.k((i & i2) | ((i2 ^ (-1)) & ((yt) tsVar).b));
    }

    @Override // defpackage.lu
    public final void l(boolean z) {
        k(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.lu
    public final void m(Drawable drawable) {
        this.a.p(drawable);
    }

    @Override // defpackage.lu
    public final void n(boolean z) {
    }

    @Override // defpackage.lu
    public final void o(int i) {
        ts tsVar = this.a;
        tsVar.q(tsVar.b().getText(i));
    }

    @Override // defpackage.lu
    public final void p(CharSequence charSequence) {
        this.a.q(charSequence);
    }

    @Override // defpackage.lu
    public final void q(CharSequence charSequence) {
        this.a.t(charSequence);
    }

    @Override // defpackage.lu
    public final void r() {
        this.a.r(0);
    }

    @Override // defpackage.lu
    public final boolean s() {
        return this.a.w();
    }

    @Override // defpackage.lu
    public final boolean t() {
        if (!this.a.v()) {
            return false;
        }
        this.a.f();
        return true;
    }

    @Override // defpackage.lu
    public final boolean u() {
        ((yt) this.a).a.removeCallbacks(this.g);
        jw.H(((yt) this.a).a, this.g);
        return true;
    }

    @Override // defpackage.lu
    public final boolean v(int i, KeyEvent keyEvent) {
        Menu D = D();
        if (D == null) {
            return false;
        }
        D.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return D.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.lu
    public final boolean w(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            x();
        }
        return true;
    }

    @Override // defpackage.lu
    public final boolean x() {
        return this.a.z();
    }

    @Override // defpackage.lu
    public final void y() {
    }

    @Override // defpackage.lu
    public final void z() {
        k(0, 8);
    }
}
