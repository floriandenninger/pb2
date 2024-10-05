package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aok;
import defpackage.aypn;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.nua;
import defpackage.ode;
import defpackage.odg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odg implements ksf {
    public final oel a;
    public final aioc b;
    public final DownAndOutController$LifecycleObserver c;
    public final odi d;
    public final ypa e;
    public final gpe f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private final Context k;
    private final boolean l;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver] */
    public odg(Context context, aaea aaeaVar, oel oelVar, aioc aiocVar, odi odiVar, ypa ypaVar, gpe gpeVar) {
        this.k = context;
        this.a = oelVar;
        aiocVar.getClass();
        this.b = aiocVar;
        this.d = odiVar;
        this.e = ypaVar;
        this.f = gpeVar;
        this.c = new any() { // from class: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.DownAndOutController$LifecycleObserver
            private final ayqw b = new ayqw();
            private final ode c;

            {
                this.c = new ode(odg.this);
            }

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
                this.b.c();
                odg.this.e.m(this.c);
            }

            @Override // defpackage.any, defpackage.aoa
            public final void ot(aok aokVar) {
                this.b.c();
                ayqw ayqwVar = this.b;
                aypn E = odg.this.b.ao().G().E(ayqr.a());
                final odg odgVar = odg.this;
                ayqwVar.d(E.Y(new ayrs() { // from class: odf
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        odg odgVar2 = odg.this;
                        ahdv ahdvVar = (ahdv) obj;
                        PlayerResponseModel b = ahdvVar.b();
                        if (!ahdvVar.c().b(aigk.VIDEO_PLAYBACK_LOADED) || b == null) {
                            return;
                        }
                        odgVar2.h = b.c().ay();
                        odgVar2.i = b.c().az();
                    }
                }, nua.n));
                odg.this.e.g(this.c);
            }
        };
        aswb aswbVar = aaeaVar.a().e;
        this.l = (aswbVar == null ? aswb.a : aswbVar).aa;
    }

    public final boolean a() {
        if (this.l) {
            return yjk.Y(this.k) ? this.h : this.i;
        }
        return false;
    }

    public final boolean b(int i) {
        Rect a = this.a.a();
        return ((float) i) >= ((float) anaf.af(a.width(), a.height(), yjk.L(this.k))) * 0.3f;
    }

    @Override // defpackage.ksf
    public final void g(int i, boolean z) {
        this.g = i == 2;
    }
}
