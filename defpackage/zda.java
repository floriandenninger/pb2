package defpackage;

import androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zda implements zcq {
    private final aypy a;
    private final /* synthetic */ int b;

    public zda(zcq zcqVar, final azrw azrwVar, yqw yqwVar, int i) {
        this.b = i;
        this.a = zcqVar.a().aj(new ayrv() { // from class: zcu
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                azrw azrwVar2 = azrw.this;
                zcp zcpVar = (zcp) obj;
                if (zcpVar instanceof zct) {
                    return ((zcq) azrwVar2.get()).a();
                }
                return aypy.W(zcpVar);
            }
        }).aJ().aN().p(wbs.K(yqwVar.a()));
    }

    @Override // defpackage.zcq
    public final aypy a() {
        return this.b != 0 ? this.a : this.a;
    }

    public zda(final WindowInfoRepositoryCallbackAdapter windowInfoRepositoryCallbackAdapter, yqw yqwVar, final Executor executor, ayqi ayqiVar, final ayqi ayqiVar2, int i) {
        this.b = i;
        windowInfoRepositoryCallbackAdapter.getClass();
        aypy Y = aypy.v(new ayqa() { // from class: zcx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayqa
            public final void a(final aypz aypzVar) {
                final WindowInfoRepositoryCallbackAdapter windowInfoRepositoryCallbackAdapter2 = WindowInfoRepositoryCallbackAdapter.this;
                Executor executor2 = executor;
                final hw hwVar = new hw() { // from class: zcw
                    @Override // defpackage.hw
                    public final void accept(Object obj) {
                        aypz aypzVar2 = aypz.this;
                        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                        if (aypzVar2.e()) {
                            return;
                        }
                        aypzVar2.d(windowLayoutInfo);
                    }
                };
                ayrz.f((AtomicReference) aypzVar, aynu.e(new ayrm() { // from class: zcy
                    @Override // defpackage.ayrm
                    public final void a() {
                        WindowInfoRepositoryCallbackAdapter.this.removeWindowLayoutInfoListener(hwVar);
                    }
                }));
                windowInfoRepositoryCallbackAdapter2.addWindowLayoutInfoListener(executor2, hwVar);
            }
        }).Y(zcz.b).Y(zcz.a);
        final zct o = whu.o();
        final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        amkq.F(true, "waitUntil must be more than 0");
        timeUnit.getClass();
        ayqiVar2.getClass();
        this.a = Y.p(new ayqc() { // from class: ziy
            @Override // defpackage.ayqc
            public final ayqb a(aypy aypyVar) {
                final Object obj = o;
                final TimeUnit timeUnit2 = timeUnit;
                final ayqi ayqiVar3 = ayqiVar2;
                azjj azjjVar = new azjj(aypyVar, new ayrv() { // from class: ziz
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        aypy aypyVar2 = (aypy) obj2;
                        aypy u = aypy.W(obj).aH(10L, timeUnit2, ayqiVar3).u(aypyVar2);
                        aysw.b(aypyVar2, "other is null");
                        azfh azfhVar = new azfh(new ayqb[]{u, aypyVar2});
                        ayrv ayrvVar = aynu.l;
                        return azfhVar;
                    }
                });
                ayrv ayrvVar = aynu.l;
                return azjjVar;
            }
        }).B().ab(ayqiVar).p(wbs.K(yqwVar.a()));
    }
}
