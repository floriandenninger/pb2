package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahvm {
    public boolean A;
    public boolean B;
    public boolean C;
    public ahef D;
    public aign E;
    public Map F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f53J;
    public long K;
    public FormatStreamModel[] M;
    public final ahvl O;
    public final ahvj P;
    public final ahvi Q;
    private final ahuk a;
    private ayqx b;
    public final ainy r;
    public final ahvc s;
    public final adxr t;
    public final ScheduledExecutorService u;
    public final Executor v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object L = new Object();
    public final ahvg N = new ahvg(this);

    public ahvm(ainy ainyVar, ahuk ahukVar, ahvc ahvcVar, adxr adxrVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.r = ainyVar;
        ahvcVar.getClass();
        this.s = ahvcVar;
        adxrVar.getClass();
        this.t = adxrVar;
        scheduledExecutorService.getClass();
        this.u = scheduledExecutorService;
        executor.getClass();
        this.v = executor;
        this.a = ahukVar;
        this.O = new ahvl(this);
        this.P = new ahvj(this);
        this.Q = new ahvi(this);
    }

    private final boolean g() {
        return this.a != null;
    }

    public final void a() {
        this.s.nf();
    }

    public final void b() {
        if (g() && this.b == null) {
            this.a.d();
            this.b = this.a.a().E(ayqr.a()).Y(new ayrs() { // from class: ahvd
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ahvm.this.s.nK(((ahuh) obj).a);
                }
            }, ahfo.p);
            d();
        }
    }

    public final void c() {
        if (!g() || this.b == null) {
            return;
        }
        this.a.c();
        azqb.f((AtomicReference) this.b);
        this.b = null;
    }

    public final void d() {
        if (g()) {
            this.a.b();
        }
    }

    public final void e() {
        ahef ahefVar = this.D;
        if (ahefVar == null) {
            return;
        }
        boolean z = false;
        if (ahefVar.l() && this.D.b() != null && this.D.b().D()) {
            z = true;
        }
        if (this.E == aign.PLAYBACK_INTERRUPTED) {
            return;
        }
        if (this.E.h()) {
            if (!this.w || this.D.k() != null) {
                this.s.k(this.w ? ControlsOverlayStyle.j : ControlsOverlayStyle.i);
                return;
            } else {
                this.s.k(ControlsOverlayStyle.m);
                return;
            }
        }
        if (this.E.c(aign.READY)) {
            if (this.w) {
                if (!this.D.l()) {
                    if (!this.C) {
                        if (this.z) {
                            this.s.k(ControlsOverlayStyle.e);
                            return;
                        } else {
                            this.s.k(ControlsOverlayStyle.f);
                            return;
                        }
                    }
                    this.s.k(this.B ? ControlsOverlayStyle.b : ControlsOverlayStyle.c);
                    return;
                }
                this.s.k(z ? ControlsOverlayStyle.h : ControlsOverlayStyle.g);
                return;
            }
            if (!this.D.l()) {
                if (!this.C) {
                    if (this.z) {
                        this.s.k(ControlsOverlayStyle.d);
                        return;
                    } else {
                        this.s.k(ControlsOverlayStyle.a);
                        return;
                    }
                }
                this.s.k(this.B ? ControlsOverlayStyle.b : ControlsOverlayStyle.c);
                return;
            }
            this.s.k(z ? ControlsOverlayStyle.l : ControlsOverlayStyle.k);
        }
    }

    public final void f() {
        this.s.py(this.G, this.H, this.I, Math.min(Math.max(this.f53J, this.K), this.I));
    }
}
