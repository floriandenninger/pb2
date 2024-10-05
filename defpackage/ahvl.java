package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvl implements aioa, ypd {
    final /* synthetic */ ahvm a;

    public ahvl(ahvm ahvmVar) {
        this.a = ahvmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r0 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ajbl r3, defpackage.aigr r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r3.c()
            if (r0 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r3 = r3.c()
            aryi r3 = r3.q()
            r0 = 0
            if (r3 == 0) goto L43
            aryc r1 = r3.n
            if (r1 != 0) goto L19
            aryc r1 = defpackage.aryc.a
        L19:
            asti r1 = r1.c
            if (r1 != 0) goto L1f
            asti r1 = defpackage.asti.a
        L1f:
            asth r1 = r1.g
            if (r1 != 0) goto L25
            asth r1 = defpackage.asth.a
        L25:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L43
            aryc r3 = r3.n
            if (r3 != 0) goto L31
            aryc r3 = defpackage.aryc.a
        L31:
            asti r3 = r3.c
            if (r3 != 0) goto L37
            asti r3 = defpackage.asti.a
        L37:
            asth r3 = r3.g
            if (r3 != 0) goto L3d
            asth r3 = defpackage.asth.a
        L3d:
            astf r0 = r3.c
            if (r0 != 0) goto L43
            astf r0 = defpackage.astf.a
        L43:
            if (r0 != 0) goto L4b
        L45:
            int r3 = r4.i
            r0 = 15
            if (r3 != r0) goto L57
        L4b:
            ahvm r3 = r2.a
            ahvc r3 = r3.s
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r4 = com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState.a()
            r3.nI(r4)
            return
        L57:
            boolean r3 = defpackage.ahbl.d(r3)
            if (r3 == 0) goto L76
            atyq r3 = r4.e
            if (r3 != 0) goto L6d
            ahvm r3 = r2.a
            ahvc r3 = r3.s
            java.lang.String r0 = r4.d
            boolean r4 = r4.a
            r3.nh(r0, r4)
            return
        L6d:
            ahvm r0 = r2.a
            ahvc r0 = r0.s
            boolean r4 = r4.a
            r0.z(r3, r4)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvl.a(ajbl, aigr):void");
    }

    public final void b(aeqq aeqqVar) {
        ahvm ahvmVar = this.a;
        ahvmVar.f53J = 0L;
        ahvmVar.K = 0L;
        FormatStreamModel e = aeqqVar.e();
        FormatStreamModel f = aeqqVar.f();
        synchronized (this.a.L) {
            try {
                if (e != null && f != null) {
                    this.a.M = new FormatStreamModel[]{e, f};
                } else if (e != null) {
                    this.a.M = new FormatStreamModel[]{e};
                } else if (f != null) {
                    this.a.M = new FormatStreamModel[]{f};
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.N.b();
    }

    public final void c(ahcx ahcxVar) {
        boolean z = ahcxVar.c() == aigf.FULLSCREEN;
        ahvm ahvmVar = this.a;
        if (ahvmVar.x != z) {
            ahvmVar.x = z;
            ahvmVar.s.r(z);
        }
        this.a.w = ahcxVar.d() == aigf.REMOTE;
    }

    public final void d(ahdv ahdvVar) {
        atzr atzrVar;
        if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || ahdvVar.a() == null || (atzrVar = ahdvVar.a().i) == null || (atzrVar.b & 262144) == 0) {
            return;
        }
        ahvc ahvcVar = this.a.s;
        aqyg aqygVar = atzrVar.m;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        ahvcVar.nJ(ajcq.b(aqygVar));
    }

    public final void g(ahef ahefVar) {
        ControlsState c;
        boolean z = true;
        boolean z2 = ahefVar.l() && ahefVar.b() != null && ahefVar.b().D();
        aign c2 = ahefVar.c();
        if (ahefVar.b() != null && ahefVar.b().c().ax() && c2.a(aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING, aign.PLAYBACK_INTERRUPTED)) {
            c2 = aign.VIDEO_PLAYING;
        }
        this.a.y = c2.c(aign.PLAYBACK_LOADED);
        this.a.A = c2 == aign.ENDED;
        if (c2 == aign.NEW) {
            ahvm ahvmVar = this.a;
            ahvmVar.C = false;
            ahvmVar.B = false;
            ahvmVar.D = null;
            ahvmVar.E = aign.NEW;
            ahvmVar.y = false;
            ahvmVar.z = false;
            ahvmVar.A = false;
            ahvmVar.G = 0L;
            ahvmVar.H = 0L;
            ahvmVar.I = 0L;
            ahvmVar.f53J = 0L;
            ahvmVar.K = 0L;
            ahvmVar.s.ng();
            ahvmVar.s.nI(ControlsState.b());
            ahvmVar.N.a();
            synchronized (ahvmVar.L) {
                ahvmVar.M = null;
            }
        } else if (!this.a.y || c2.b()) {
            ahvm ahvmVar2 = this.a;
            ahvc ahvcVar = ahvmVar2.s;
            if (ahvmVar2.r.d()) {
                c = ControlsState.e();
            } else {
                c = ControlsState.c();
            }
            ahvcVar.nI(c);
        } else if (c2 == aign.PLAYBACK_INTERRUPTED) {
            this.a.s.nI(new ControlsState(ahvo.PAUSED, false));
        } else if (c2.a(aign.INTERSTITIAL_REQUESTED, aign.READY)) {
            this.a.s.nI(ControlsState.d());
        } else if (c2 == aign.ENDED) {
            this.a.s.nI(ControlsState.a());
        }
        if (c2.d()) {
            this.a.s.nI(ControlsState.f());
            this.a.N.b();
        }
        ahvm ahvmVar3 = this.a;
        ahvmVar3.E = c2;
        ahvmVar3.D = ahefVar;
        ahvmVar3.e();
        if (!c2.c(aign.READY) || (ahefVar.l() && (!ahefVar.l() || !z2))) {
            z = false;
        }
        this.a.s.i(z);
        this.a.d();
    }

    public final void h(aheg ahegVar) {
        this.a.G = ahegVar.e();
        this.a.H = ahegVar.h();
        this.a.I = ahegVar.f();
        this.a.f53J = ahegVar.a();
        this.a.f();
    }

    public final void i(ahej ahejVar) {
        ControlsState d;
        ahvm ahvmVar = this.a;
        if (!ahvmVar.y || ahvmVar.A) {
            return;
        }
        int a = ahejVar.a();
        if (a != 2) {
            if (a != 3 && a != 4) {
                if (a == 5) {
                    this.a.s.nI(ControlsState.e());
                    return;
                } else if (a != 6) {
                    return;
                }
            }
            ahvc ahvcVar = this.a.s;
            if (ahejVar.c()) {
                d = ControlsState.c();
            } else {
                d = ControlsState.d();
            }
            ahvcVar.nI(d);
            return;
        }
        this.a.s.nI(ControlsState.f());
    }

    public final void j() {
        this.a.z = true;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 6;
        final int i3 = 0;
        final int i4 = 3;
        final int i5 = 7;
        final int i6 = 2;
        final int i7 = 8;
        final int i8 = 4;
        final int i9 = 5;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.G().c.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.G().k.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.G().i.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.ap().h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i9) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), aiocVar.ao().h(ahbw.g(aiocVar.aC(), 8192L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i8) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r), ahbw.d(aiocVar.G().g, ahbz.l).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahvk
            public final /* synthetic */ ahvl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.a.b((aeqq) obj);
                        return;
                    case 1:
                        ahvl ahvlVar = this.a;
                        Pair pair = (Pair) obj;
                        if (pair.second != null) {
                            ahvlVar.a((ajbl) pair.first, (aigr) pair.second);
                            return;
                        }
                        return;
                    case 2:
                        this.a.c((ahcx) obj);
                        return;
                    case 3:
                        ahvl ahvlVar2 = this.a;
                        if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                            ahvlVar2.a.s.nI(ControlsState.a());
                            return;
                        }
                        return;
                    case 4:
                        this.a.d((ahdv) obj);
                        return;
                    case 5:
                        this.a.j();
                        return;
                    case 6:
                        this.a.g((ahef) obj);
                        return;
                    case 7:
                        this.a.h((aheg) obj);
                        return;
                    default:
                        this.a.i((ahej) obj);
                        return;
                }
            }
        }, ahfo.r)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{aeqq.class, ahcx.class, ahdv.class, aheb.class, ahef.class, aheg.class, ahej.class, aigr.class};
            case 0:
                b((aeqq) obj);
                return null;
            case 1:
                c((ahcx) obj);
                return null;
            case 2:
                d((ahdv) obj);
                return null;
            case 3:
                j();
                return null;
            case 4:
                g((ahef) obj);
                return null;
            case 5:
                h((aheg) obj);
                return null;
            case 6:
                i((ahej) obj);
                return null;
            case 7:
                a(null, (aigr) obj);
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
