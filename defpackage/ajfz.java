package defpackage;

import android.os.Looper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfz implements swv {
    private final akbv a;
    private final acqz b;

    public ajfz(akbv akbvVar, acqz acqzVar) {
        this.a = akbvVar;
        this.b = acqzVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return avht.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        avht avhtVar = (avht) obj;
        if ((avhtVar.c & 1) == 0 || swuVar.a == null) {
            return ayph.f();
        }
        final arej arejVar = avhtVar.d;
        if (arejVar == null) {
            arejVar = arej.a;
        }
        final View view = swuVar.b;
        if (view == null) {
            view = swuVar.a;
        }
        if (view == null) {
            return ayph.f();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d(arejVar, view);
            return ayph.f();
        }
        return ayph.t(new ayrm() { // from class: ajfy
            @Override // defpackage.ayrm
            public final void a() {
                ajfz.this.d(arejVar, view);
            }
        }).E(ayqr.a());
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    public final void d(arej arejVar, View view) {
        int i = arejVar.b;
        if ((i & 16) != 0 || (i & 64) != 0) {
            this.a.b(arejVar, view, arejVar, this.b.mM());
        } else {
            this.a.f(arejVar, view, this.b.mM());
        }
    }
}
