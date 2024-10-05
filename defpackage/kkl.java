package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkl implements View.OnLayoutChangeListener, ahto, ahyl, kig {
    public final ahtp a;
    public final fna b;
    public final boolean d;
    public final aioc e;
    public final kih f;
    public long i;
    public yzr k;
    private boolean m;
    private fhg l = fhg.NONE;
    public Optional j = Optional.empty();
    public final List c = new ArrayList();
    public Optional h = Optional.empty();
    public koe g = null;

    public kkl(ahtp ahtpVar, fna fnaVar, kih kihVar, aioc aiocVar, aadw aadwVar) {
        this.a = ahtpVar;
        this.b = fnaVar;
        this.f = kihVar;
        this.e = aiocVar;
        asvu asvuVar = aadwVar.b().e;
        this.d = (asvuVar == null ? asvu.a : asvuVar).cG;
    }

    private final void e() {
        koe koeVar = this.g;
        if (koeVar == null) {
            return;
        }
        koeVar.b();
    }

    private final void f() {
        if (this.c.isEmpty()) {
            return;
        }
        e();
        yzr yzrVar = this.k;
        if (yzrVar == null) {
            return;
        }
        if (!this.l.b() || !this.h.isPresent()) {
            yny.z(yzrVar.b, yny.h(yny.r(0), yny.q(0)), ViewGroup.MarginLayoutParams.class);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.h.get()).getLayoutParams();
            yny.z(yzrVar.b, yny.h(yny.r(marginLayoutParams.getMarginStart()), yny.q(marginLayoutParams.getMarginEnd())), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void b(ahyo ahyoVar) {
    }

    public final void d() {
        ahtp ahtpVar = this.a;
        ahte ahteVar = (ahte) ahtpVar.d.get(ahyo.HEATMAP_MARKER);
        if (ahteVar instanceof ahth) {
            ahth ahthVar = (ahth) ahteVar;
            Optional ofNullable = Optional.ofNullable(ahthVar.c);
            this.j = ofNullable;
            ofNullable.ifPresent(new kki(this, 0));
            amru amruVar = ahthVar.a;
            if (amruVar.isEmpty() || this.i == 0) {
                return;
            }
            this.c.clear();
            Collection.EL.stream(amruVar).forEach(new kki(this, 2));
        }
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        this.m = i == 1 || i == 2;
        if (this.c.isEmpty()) {
            return;
        }
        e();
        yzr yzrVar = this.k;
        if (yzrVar == null) {
            return;
        }
        if (i == 1) {
            ((HeatMarkerView) yzrVar.b).b();
            yzrVar.a(true, false);
            return;
        }
        if (i == 2) {
            if (this.b.kL() > 0) {
                long kL = this.b.kL();
                HeatMarkerView heatMarkerView = (HeatMarkerView) yzrVar.b;
                heatMarkerView.c = ((float) j) / ((float) kL);
                heatMarkerView.invalidate();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            HeatMarkerView heatMarkerView2 = (HeatMarkerView) yzrVar.b;
            heatMarkerView2.a.cancel();
            heatMarkerView2.a.reverse();
            heatMarkerView2.d = true;
            yzrVar.a(false, true);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        if (this.l == fhgVar) {
            return;
        }
        this.l = fhgVar;
        f();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        if (controlsState.a == ahvo.NEW) {
            this.c.clear();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyo.HEATMAP_MARKER.equals(ahyoVar)) {
            this.c.clear();
            if (z) {
                d();
                if (this.m) {
                    e();
                    yzr yzrVar = this.k;
                    if (yzrVar == null) {
                        return;
                    }
                    ((HeatMarkerView) yzrVar.b).b();
                    yzrVar.a(true, false);
                }
            }
        }
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.h.isPresent() || view != this.h.get()) {
            view.removeOnLayoutChangeListener(this);
        } else {
            f();
            ((View) this.h.get()).requestLayout();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}
