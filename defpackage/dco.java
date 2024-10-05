package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class dco extends dcb {
    public final View a;
    public final dcn b;

    public dco(View view) {
        did.ap(view);
        this.a = view;
        this.b = new dcn(view);
    }

    @Override // defpackage.dcb, defpackage.dcl
    public final dbs d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof dbs) {
            return (dbs) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.dcl
    public void e(dck dckVar) {
        dcn dcnVar = this.b;
        int b = dcnVar.b();
        int a = dcnVar.a();
        if (dcn.d(b, a)) {
            dckVar.g(b, a);
            return;
        }
        if (!dcnVar.c.contains(dckVar)) {
            dcnVar.c.add(dckVar);
        }
        if (dcnVar.d == null) {
            ViewTreeObserver viewTreeObserver = dcnVar.b.getViewTreeObserver();
            dcnVar.d = new dcm(dcnVar, 0);
            viewTreeObserver.addOnPreDrawListener(dcnVar.d);
        }
    }

    @Override // defpackage.dcl
    public final void g(dck dckVar) {
        this.b.c.remove(dckVar);
    }

    @Override // defpackage.dcb, defpackage.dcl
    public final void h(dbs dbsVar) {
        o(dbsVar);
    }

    public final View n() {
        return this.a;
    }

    public final void o(Object obj) {
        this.a.setTag(R.id.glide_custom_view_target_tag, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
