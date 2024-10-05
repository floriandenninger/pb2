package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iut extends ajsv {
    final /* synthetic */ mgr a;
    final /* synthetic */ ivj b;

    public iut(ivj ivjVar, mgr mgrVar) {
        this.b = ivjVar;
        this.a = mgrVar;
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void a() {
        mgr mgrVar = this.a;
        fav.j(mgrVar.l, mgrVar.f, this.b.bV);
        boolean n = this.a.n();
        ivj ivjVar = this.b;
        if (n != ivjVar.az) {
            ivjVar.az = n;
            ivjVar.bm();
        }
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void b() {
        this.b.aO.post(new Runnable() { // from class: ius
            @Override // java.lang.Runnable
            public final void run() {
                iut.this.b.bq.b();
            }
        });
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        if (z) {
            if (this.a == this.b.q()) {
                ivj ivjVar = this.b;
                if (!ivjVar.bI.k(PaneDescriptor.b(ivjVar))) {
                    this.b.bt();
                }
                ivj ivjVar2 = this.b;
                if (ivjVar2.bI.i(PaneDescriptor.b(ivjVar2))) {
                    this.b.bw();
                }
            }
            mfr mfrVar = this.b.bK;
            if (mfrVar != null) {
                auov auovVar = aamdVar.a;
                if (mfrVar.c.isEmpty()) {
                    List list = (List) mfrVar.b.get(auovVar);
                    mfrVar.b.clear();
                    mfrVar.a.clear();
                    if (list != null) {
                        mfrVar.b.put(auovVar, list);
                        mfrVar.c(list);
                    }
                }
            }
        }
        mgr mgrVar = this.a;
        fav.j(mgrVar.l, mgrVar.f, this.b.bV);
        if (this.a.n()) {
            ivj ivjVar3 = this.b;
            if (ivjVar3.az) {
                return;
            }
            ivjVar3.az = true;
            ivjVar3.bm();
        }
    }
}
