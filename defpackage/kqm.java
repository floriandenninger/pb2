package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver;
import defpackage.aok;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.evr;
import defpackage.kfe;
import defpackage.kqm;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqm {
    public static final long a = TimeUnit.DAYS.toMillis(90);
    public final ci b;
    public final shf c;
    public final kqh d;
    public final akbw e;
    public final aioc f;
    public final PlayerAccessibilitySettingsEduController$LifecycleObserver g;
    public final acra h;
    public final wjt i;
    public final afsy j;
    public final wju k;
    public final aadw l;
    public final ajoy m;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver] */
    public kqm(ci ciVar, ajoy ajoyVar, kqh kqhVar, aadw aadwVar, aioc aiocVar, akbw akbwVar, shf shfVar, acra acraVar, wjt wjtVar, afsy afsyVar, wju wjuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ciVar.getClass();
        this.b = ciVar;
        this.m = ajoyVar;
        this.d = kqhVar;
        this.l = aadwVar;
        this.f = aiocVar;
        this.e = akbwVar;
        this.c = shfVar;
        this.h = acraVar;
        this.i = wjtVar;
        this.j = afsyVar;
        this.k = wjuVar;
        this.g = new any() { // from class: com.google.android.apps.youtube.app.player.overlay.accessibility.PlayerAccessibilitySettingsEduController$LifecycleObserver
            private ayqx b;

            @Override // defpackage.aoa
            public final /* synthetic */ void lc(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lg(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lh(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void nu(aok aokVar) {
            }

            @Override // defpackage.aoa
            public final void nv(aok aokVar) {
                Object obj = this.b;
                if (obj != null) {
                    azqb.f((AtomicReference) obj);
                    this.b = null;
                }
            }

            @Override // defpackage.any, defpackage.aoa
            public final void ot(aok aokVar) {
                if (evr.aO(kqm.this.l)) {
                    final kqm kqmVar = kqm.this;
                    this.b = kqmVar.f.G().a.G().E(ayqr.a()).Y(new ayrs() { // from class: kqk
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            kqm kqmVar2 = kqm.this;
                            if (((ahef) obj).c().d() && kqmVar2.d.b()) {
                                ynm.n(kqmVar2.b, ((vgz) kqmVar2.m.a.get()).a(), jnh.d, new kqj(kqmVar2, 1));
                            }
                        }
                    }, kfe.t);
                }
            }
        };
    }

    public final View.OnClickListener a() {
        return new View.OnClickListener() { // from class: kqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kqm kqmVar = kqm.this;
                if (kqmVar.k.a()) {
                    ynm.n(kqmVar.b, kqmVar.i.a(kqmVar.j.c()), jnh.c, new kqj(kqmVar, 0));
                } else {
                    kqmVar.b(fav.a(kqmVar.b));
                }
            }
        };
    }

    public final void b(Intent intent) {
        this.b.startActivity(intent);
        this.h.I(3, new acqx(acsb.c(100673)), null);
    }
}
