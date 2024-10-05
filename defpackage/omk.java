package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class omk implements Runnable {
    public final /* synthetic */ omq a;
    private final /* synthetic */ int b;

    public /* synthetic */ omk(omq omqVar, int i) {
        this.b = i;
        this.a = omqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.s();
                return;
            case 1:
                this.a.A();
                return;
            case 2:
                ((abbx) this.a.ag.get()).a.c();
                return;
            case 3:
                this.a.m();
                return;
            case 4:
                omq omqVar = this.a;
                omqVar.A = (ViewGroup) omqVar.a.findViewById(R.id.pane_fragment_container);
                return;
            case 5:
                this.a.r();
                return;
            case 6:
                this.a.B();
                return;
            case 7:
                this.a.C();
                return;
            case 8:
                this.a.o();
                return;
            case 9:
                this.a.h();
                return;
            case 10:
                this.a.p();
                return;
            case 11:
                this.a.n();
                return;
            case 12:
                omq omqVar2 = this.a;
                final ajjz ajjzVar = (ajjz) omqVar2.ac.get();
                ajjzVar.f();
                final ond ondVar = omqVar2.aL;
                if (ondVar.c.compareAndSet(false, true)) {
                    asvu asvuVar = ondVar.g.b().e;
                    if (asvuVar == null) {
                        asvuVar = asvu.a;
                    }
                    if (!asvuVar.cR) {
                        ondVar.a.sh();
                    } else {
                        ondVar.b.d(ondVar.h.a().ak(1L).g(new ayrv() { // from class: onb
                            @Override // defpackage.ayrv
                            public final Object a(Object obj) {
                                ond ondVar2 = ond.this;
                                if (((emk) obj).a()) {
                                    onc oncVar = new onc(ondVar2.g, (ajjz) ondVar2.f.get(), (ajzi) ondVar2.e.get(), ondVar2.a);
                                    ajjz ajjzVar2 = (ajjz) ondVar2.f.get();
                                    ajzi ajziVar = (ajzi) ondVar2.e.get();
                                    ajjzVar2.d(oncVar);
                                    ajziVar.a(oncVar);
                                } else {
                                    ondVar2.a.sh();
                                }
                                return ayph.f();
                            }
                        }).Q());
                        ayph a = ondVar.d.a();
                        final ayqw ayqwVar = ondVar.b;
                        a.R(new ayrm() { // from class: ona
                            @Override // defpackage.ayrm
                            public final void a() {
                                ayqw.this.c();
                            }
                        });
                    }
                }
                final eni eniVar = omqVar2.aM;
                if (eniVar.f.get() == 1 && eniVar.e.compareAndSet(false, true)) {
                    final emr emrVar = new emr(eniVar.c, eniVar.b, new Runnable() { // from class: enh
                        @Override // java.lang.Runnable
                        public final void run() {
                            eni.this.e();
                        }
                    });
                    ajjzVar.d(emrVar);
                    ((ajzi) eniVar.d.get()).a(emrVar);
                    eniVar.b().B(azre.b(eniVar.b.c())).R(new ayrm() { // from class: enf
                        @Override // defpackage.ayrm
                        public final void a() {
                            eni eniVar2 = eni.this;
                            ajjy ajjyVar = emrVar;
                            ajjzVar.o(ajjyVar);
                            ((ajzi) eniVar2.d.get()).b(ajjyVar);
                        }
                    });
                    return;
                }
                return;
            case 13:
                omq omqVar3 = this.a;
                omqVar3.ai = new nmt(omqVar3.a.getApplicationContext());
                return;
            case 14:
                this.a.ap.a();
                return;
            case 15:
                ((ltw) this.a.T.get()).a();
                return;
            case 16:
                omq omqVar4 = this.a;
                omqVar4.c.g(omqVar4.ad);
                return;
            case 17:
                this.a.c.a();
                return;
            case 18:
                this.a.S.a();
                return;
            default:
                this.a.av.a();
                return;
        }
    }
}
