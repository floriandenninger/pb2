package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnt implements swv {
    public final akcp a;
    private final Handler b;

    public gnt(akcp akcpVar, Handler handler) {
        this.a = akcpVar;
        this.b = handler;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return auft.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final View view;
        final auft auftVar = (auft) obj;
        if ((auftVar.c & 1) == 0 || (view = swuVar.a) == null) {
            return ayph.f();
        }
        View view2 = swuVar.b;
        if (view2 != null) {
            view = view2;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if ((auftVar.c & 2) == 0) {
                this.b.post(new gns(this, auftVar, view, 0));
            } else {
                this.b.postDelayed(new gns(this, auftVar, view, 1), auftVar.e);
            }
            return ayph.f();
        }
        return ayph.t(new ayrm() { // from class: gnr
            @Override // defpackage.ayrm
            public final void a() {
                gnt gntVar = gnt.this;
                View view3 = view;
                view3.post(new gns(gntVar, auftVar, view3, 2));
            }
        }).E(ayqr.a());
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
