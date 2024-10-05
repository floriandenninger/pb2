package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkd extends zi {
    private final hkg a;

    public hkd(hkg hkgVar) {
        this.a = hkgVar;
    }

    static Optional q(wv wvVar) {
        return Optional.ofNullable((ajor) wvVar.a.getTag(R.id.presenter_adapter_viewholder_tag));
    }

    static boolean r(vw vwVar, int i) {
        if (i == -1 || vwVar.b() == 0 || !(vwVar instanceof ajox)) {
            return false;
        }
        return ((ajox) vwVar).getItem(i) instanceof hjx;
    }

    @Override // defpackage.zi
    public final int d(RecyclerView recyclerView, wv wvVar) {
        int i;
        if (r(recyclerView.m, wvVar.a())) {
            Optional q = q(wvVar);
            if (q.isPresent() && (((ajor) q.get()).t instanceof hjl) && !((hjl) ((ajor) q.get()).t).a.h) {
                i = 3;
                return n(i);
            }
        }
        i = 0;
        return n(i);
    }

    @Override // defpackage.zi
    public final void f(RecyclerView recyclerView, wv wvVar) {
        wvVar.a.setScaleX(1.0f);
        wvVar.a.setScaleY(1.0f);
        super.f(recyclerView, wvVar);
    }

    @Override // defpackage.zi
    public final void g(wv wvVar, int i) {
        jqr jqrVar;
        if (i == 2) {
            wvVar.a.setScaleX(1.03f);
            wvVar.a.setScaleY(1.1f);
            Optional q = q(wvVar);
            if (q.isPresent() && (((ajor) q.get()).t instanceof hjl) && (jqrVar = ((hjl) ((ajor) q.get()).t).a.i) != null) {
                jqrVar.a(acsb.c(116672)).c();
            }
        }
    }

    @Override // defpackage.zi
    public final boolean j() {
        return this.a.a() > 1;
    }

    @Override // defpackage.zi
    public final boolean k(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        int i = !r(recyclerView.m, 0) ? 1 : 0;
        int a = this.a.a();
        int a2 = wvVar.a();
        int min = Math.min(Math.max(wvVar2.a(), i), (a + i) - 1);
        if (a2 == min || !r(recyclerView.m, min)) {
            return false;
        }
        hkg hkgVar = this.a;
        int i2 = a2 - i;
        int i3 = min - i;
        if (i2 != i3 && i2 >= 0 && i3 >= 0 && i2 < hkgVar.a() && i3 < hkgVar.a()) {
            int size = hkgVar.b.size();
            hke hkeVar = (hke) hkgVar.b.remove(i2);
            hkgVar.b.add(i3, hkeVar);
            hkgVar.d.o(hkeVar.a(), (size - i3) - 1);
        }
        recyclerView.m.oe(a2, min);
        return true;
    }

    @Override // defpackage.zi
    public final void m() {
    }

    @Override // defpackage.zi
    public final void p() {
    }
}
