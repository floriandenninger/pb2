package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcf implements dcl {
    protected final View a;
    private final dce b;

    public dcf(View view) {
        did.ap(view);
        this.a = view;
        this.b = new dce(view);
    }

    protected abstract void c();

    @Override // defpackage.dcl
    public final dbs d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof dbs) {
            return (dbs) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.dcl
    public final void e(dck dckVar) {
        dce dceVar = this.b;
        int b = dceVar.b();
        int a = dceVar.a();
        if (dce.d(b, a)) {
            dckVar.g(b, a);
            return;
        }
        if (!dceVar.c.contains(dckVar)) {
            dceVar.c.add(dckVar);
        }
        if (dceVar.d == null) {
            ViewTreeObserver viewTreeObserver = dceVar.b.getViewTreeObserver();
            dceVar.d = new dcm(dceVar, 1);
            viewTreeObserver.addOnPreDrawListener(dceVar.d);
        }
    }

    @Override // defpackage.dcl
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.dcl
    public final void g(dck dckVar) {
        this.b.c.remove(dckVar);
    }

    @Override // defpackage.dcl
    public final void h(dbs dbsVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, dbsVar);
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
        this.b.c();
        c();
    }

    @Override // defpackage.daq
    public final void k() {
    }

    @Override // defpackage.daq
    public final void l() {
    }

    @Override // defpackage.daq
    public final void m() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
