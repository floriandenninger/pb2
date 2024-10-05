package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpu extends diy {
    private final WeakReference d;

    public dpu(dpt dptVar) {
        super(null);
        this.d = new WeakReference(dptVar);
    }

    @Override // defpackage.diy
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dph dphVar = (dph) obj;
        dpt dptVar = (dpt) this.d.get();
        if (dptVar == null) {
            return;
        }
        dpg dpgVar = dphVar.b;
        if (dptVar.e != null) {
            boolean z = dphVar.a;
            dpg dpgVar2 = dpg.INITIAL_LOAD;
            int ordinal = dpgVar.ordinal();
            if (ordinal == 1) {
                dptVar.e.a(z ? dqi.LOADING : dqi.LOADED);
            } else if (ordinal == 2) {
                doz dozVar = dptVar.e;
                dozVar.a(z ? dqi.EMPTY : dqi.LOADED);
                dozVar.a.b();
            } else if (ordinal == 3) {
                doz dozVar2 = dptVar.e;
                dozVar2.a(z ? dqi.ERROR : dqi.LOADED);
                dozVar2.a.b();
            }
        }
        if (did.t()) {
            dptVar.g(dpgVar);
        } else {
            ((dke) dptVar.b).post(new dpl(dptVar, dpgVar));
        }
    }
}
