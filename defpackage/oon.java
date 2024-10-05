package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.watchwhile.MdxMainController;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class oon extends euc {
    public axpg g;
    public axpg h;
    boolean i = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ola olaVar = (ola) this.g.get();
        int i = 1;
        if (olaVar.e.compareAndSet(false, true) && olaVar.a()) {
            asvu asvuVar = olaVar.f.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            final auxs b = auxs.b(asvuVar.bw);
            if (b == null) {
                b = auxs.STARTUP_SIGNAL_UNKNOWN;
            }
            int ordinal = b.ordinal();
            ayph h = (ordinal == 1 || ordinal == 2 || ordinal == 3) ? olaVar.c.g().L(new ayrw() { // from class: okz
                @Override // defpackage.ayrw
                public final boolean a(Object obj) {
                    return ((auxs) obj) == auxs.this;
                }
            }).ak(1L).h() : null;
            if (h != null) {
                asvu asvuVar2 = olaVar.f.b().e;
                if (asvuVar2 == null) {
                    asvuVar2 = asvu.a;
                }
                int i2 = asvuVar2.bx;
                if (i2 > 0) {
                    h = h.F(i2, TimeUnit.MILLISECONDS);
                }
                olaVar.d.d(h.C().B(ayqr.a()).R(new oky(olaVar, i)));
            } else {
                olaVar.b.getLifecycle().b((aoj) olaVar.a.get());
            }
        }
        boolean a = ((ola) this.g.get()).a();
        this.i = a;
        if (a) {
            return;
        }
        MdxMainController mdxMainController = (MdxMainController) this.h.get();
        mdxMainController.a.get();
        mdxMainController.b.get();
        mdxMainController.c.get();
        mdxMainController.d.get();
        mdxMainController.e.get();
        mdxMainController.f.get();
        mdxMainController.g.get();
        mdxMainController.h.get();
        mdxMainController.i.get();
        mdxMainController.j.get();
        mdxMainController.k.get();
        ((MdxMainController) this.h.get()).lg(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onDestroy() {
        if (!this.i) {
            ((MdxMainController) this.h.get()).lh(this);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onPause() {
        if (!this.i) {
            ((MdxMainController) this.h.get()).lc(this);
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.i) {
            return;
        }
        ((MdxMainController) this.h.get()).ot(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onStop() {
        if (!this.i) {
            ((MdxMainController) this.h.get()).nv(this);
        }
        super.onStop();
    }
}
