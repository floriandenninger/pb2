package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajld implements dcl {
    private final ajjx a;
    private final dch b;
    private final ajjy c;
    private final avgg d;
    private final ajjv e;
    private boolean f = false;

    public ajld(dch dchVar, ajjv ajjvVar, avgg avggVar, ajjy ajjyVar, ajjx ajjxVar) {
        this.b = dchVar;
        this.e = ajjvVar;
        this.d = avggVar;
        this.c = ajjyVar;
        this.a = ajjxVar;
    }

    private final void i(ImageView imageView) {
        this.f = true;
        ajjx ajjxVar = this.a;
        if (ajjxVar != null) {
            ajjxVar.c(imageView);
        }
        this.c.f(imageView, this.e, this.d);
    }

    @Override // defpackage.dcl
    public final void a(Drawable drawable) {
        View view = this.b.a;
        if (!this.f) {
            i((ImageView) view);
        }
        this.b.a(drawable);
        ajjx ajjxVar = this.a;
        if (ajjxVar != null) {
            ajjxVar.a((ImageView) view);
        }
        this.c.d((ImageView) view, this.e, this.d);
    }

    @Override // defpackage.dcl
    public final void b(Object obj, dcs dcsVar) {
        View view = this.b.a;
        if (!this.f) {
            i((ImageView) view);
        }
        this.b.b(obj, dcsVar);
        ajjx ajjxVar = this.a;
        if (ajjxVar != null) {
            ajjxVar.b((ImageView) view);
        }
        this.c.g((ImageView) view, this.e, this.d);
    }

    @Override // defpackage.dcl
    public final dbs d() {
        return this.b.d();
    }

    @Override // defpackage.dcl
    public final void e(dck dckVar) {
        this.b.e(dckVar);
    }

    @Override // defpackage.dcl
    public final void f(Drawable drawable) {
        this.b.f(drawable);
        i((ImageView) this.b.a);
    }

    @Override // defpackage.dcl
    public final void g(dck dckVar) {
        this.b.g(dckVar);
    }

    @Override // defpackage.dcl
    public final void h(dbs dbsVar) {
        this.b.o(dbsVar);
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
        this.b.jZ(drawable);
        this.c.e((ImageView) this.b.a, this.e, this.d);
    }

    @Override // defpackage.daq
    public final void k() {
    }

    @Override // defpackage.daq
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.daq
    public final void m() {
        this.b.m();
    }
}
