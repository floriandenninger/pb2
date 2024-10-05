package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nv extends pp implements qo {
    public final qq a;
    public po b;
    final /* synthetic */ nw c;
    private final Context f;
    private WeakReference g;

    public nv(nw nwVar, Context context, po poVar) {
        this.c = nwVar;
        this.f = context;
        this.b = poVar;
        qq qqVar = new qq(context);
        qqVar.D();
        this.a = qqVar;
        qqVar.b = this;
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        po poVar = this.b;
        if (poVar != null) {
            return poVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.pp
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.pp
    public final MenuInflater b() {
        return new pw(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.pp
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.pp
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.pp
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.pp
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.pp
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.pp
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.pp
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.pp
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.pp
    public final boolean n() {
        return this.c.e.j;
    }

    @Override // defpackage.pp
    public final void f() {
        nw nwVar = this.c;
        if (nwVar.g != this) {
            return;
        }
        if (nw.F(nwVar.l, nwVar.m, false)) {
            this.b.a(this);
        } else {
            nw nwVar2 = this.c;
            nwVar2.h = this;
            nwVar2.i = this.b;
        }
        this.b = null;
        this.c.D(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        this.c.d.e().sendAccessibilityEvent(32);
        nw nwVar3 = this.c;
        nwVar3.b.l(nwVar3.o);
        this.c.g = null;
    }
}
