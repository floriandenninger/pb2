package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pr extends pp implements qo {
    public final qq a;
    private final Context b;
    private final ActionBarContextView c;
    private final po f;
    private WeakReference g;
    private boolean h;

    public pr(Context context, ActionBarContextView actionBarContextView, po poVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = poVar;
        qq qqVar = new qq(actionBarContextView.getContext());
        qqVar.D();
        this.a = qqVar;
        qqVar.b = this;
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.pp
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.pp
    public final MenuInflater b() {
        return new pw(this.c.getContext());
    }

    @Override // defpackage.pp
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.pp
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.pp
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.pp
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // defpackage.pp
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.pp
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.pp
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.pp
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.pp
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.pp
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.pp
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.pp
    public final boolean n() {
        return this.c.j;
    }
}
