package defpackage;

import com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import defpackage.aok;
import defpackage.aypn;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ksq;
import defpackage.ktf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksq {
    public final aioc a;
    public final DefaultScrubberEventLogger$LifecycleObserver b = new any() { // from class: com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver
        private final ayqw b = new ayqw();

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
        }

        @Override // defpackage.any, defpackage.aoa
        public final void ot(aok aokVar) {
            this.b.c();
            ayqw ayqwVar = this.b;
            aypn E = ksq.this.a.G().c.G().E(ayqr.a());
            final ksq ksqVar = ksq.this;
            ayqwVar.d(E.Y(new ayrs() { // from class: kso
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ksq.this.c = ((ahds) obj).d();
                }
            }, ktf.b));
        }
    };
    public String c;
    private final acpl d;
    private final ahtp e;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.youtube.app.player.overlay.storyboard.DefaultScrubberEventLogger$LifecycleObserver] */
    public ksq(acpl acplVar, ahtp ahtpVar, aioc aiocVar, ahym ahymVar, ksn ksnVar) {
        this.d = acplVar;
        this.e = ahtpVar;
        this.a = aiocVar;
        ahymVar.kR(new ksp(this));
        ksnVar.a = this;
    }

    public final void a(int i) {
        TimelineMarker[] m = this.e.m(ahyo.CHAPTER);
        if (m == null || m.length == 0) {
            return;
        }
        aung a = aunh.a();
        a.copyOnWrite();
        ((aunh) a.instance).g(true);
        boolean z = i == 1;
        a.copyOnWrite();
        ((aunh) a.instance).h(z);
        String str = this.c;
        if (str != null) {
            a.copyOnWrite();
            ((aunh) a.instance).f(str);
        }
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dG((aunh) a.build());
        this.d.c((arpp) a2.build());
    }
}
