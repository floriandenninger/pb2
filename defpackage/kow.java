package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import j$.util.Collection;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kow implements fna {
    final ahyl e;
    final fmy f;
    final fmz g;
    final fmx h;
    public final boolean i;
    public InlineTimeBarWrapper j;
    private ahyg k;
    private kov m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private final Set l = new HashSet();
    public final Set a = new HashSet();
    public Set b = amvs.a;
    public Set c = amvs.a;
    public Set d = amvs.a;

    public kow(axzg axzgVar, byte[] bArr, byte[] bArr2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayrz.c((AtomicReference) axzgVar.a.a.Y(axzd.k).B().as(false).V(new lgx(atomicBoolean, 1)));
        this.i = atomicBoolean.get();
        this.e = new ahyl() { // from class: kos
            @Override // defpackage.ahyl
            public final void h(int i, long j) {
                Iterator it = kow.this.a.iterator();
                while (it.hasNext()) {
                    ((ahyl) it.next()).h(i, j);
                }
            }
        };
        this.f = new kou(this);
        this.g = new fmz() { // from class: koq
            @Override // defpackage.fmz
            public final void a(MotionEvent motionEvent) {
                kow kowVar = kow.this;
                if (kowVar.c.isEmpty()) {
                    return;
                }
                ((fmz) kowVar.c.iterator().next()).a(motionEvent);
            }
        };
        this.h = new fmx() { // from class: kok
            @Override // defpackage.fmx
            public final void a() {
                Iterator it = kow.this.d.iterator();
                while (it.hasNext()) {
                    ((fmx) it.next()).a();
                }
            }
        };
    }

    private final long D(Function function, String str) {
        kov kovVar = this.m;
        if (kovVar != null) {
            return ((Long) function.apply(kovVar.a)).longValue();
        }
        zga.m("WatchWhileTimeBarController", String.format("%s: no active timebar", str));
        return 0L;
    }

    private final void E(Consumer consumer, String str) {
        kov kovVar = this.m;
        if (kovVar == null) {
            zga.m("WatchWhileTimeBarController", String.format("%s: no active timebar", str));
        } else {
            consumer.accept(kovVar.a);
        }
    }

    private final void F(final Consumer consumer) {
        Collection.EL.stream(this.l).forEach(new Consumer() { // from class: kop
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                Consumer.this.accept(((kov) obj).a);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer.CC.$default$andThen(this, consumer2);
            }
        });
    }

    @Override // defpackage.fna
    public final void A(int i) {
        this.n = i;
        F(new kot(i, 1));
    }

    @Override // defpackage.fna
    public final long c() {
        return D(jyr.e, "getScrubberPositionTimeMillis");
    }

    public final View f(ViewStub viewStub, Predicate predicate) {
        amkq.O(this.i, "wrong arm");
        InlineTimeBarWrapper inlineTimeBarWrapper = (InlineTimeBarWrapper) viewStub.inflate();
        inlineTimeBarWrapper.setVisibility(0);
        o(inlineTimeBarWrapper.a, predicate);
        return inlineTimeBarWrapper;
    }

    @Override // defpackage.fna
    public final void g(View view) {
        E(new kon(view, 1), "addExcludeTouchView");
        this.q = true;
    }

    @Override // defpackage.fna
    public final void h() {
        E(iwu.d, "dismissScrub");
    }

    @Override // defpackage.fna
    public final void i(final Rect rect) {
        E(new Consumer() { // from class: kom
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((fna) obj).i(rect);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        }, "getScrubberBounds");
    }

    @Override // defpackage.fna
    public final void j(final Point point) {
        E(new Consumer() { // from class: kol
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((fna) obj).j(point);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        }, "getSeekTimePosition");
    }

    @Override // defpackage.ahyj
    public final long kJ() {
        return D(jyr.f, "getDisplayCurrentTimeMillis");
    }

    @Override // defpackage.ahyj
    public final long kK() {
        return D(jyr.h, "getRelativeBufferedTimeMillis");
    }

    @Override // defpackage.ahyj
    public final long kL() {
        return D(jyr.i, "getRelativeTotalTimeMillis");
    }

    @Override // defpackage.ahyj
    public final boolean kO() {
        jyr jyrVar = jyr.j;
        kov kovVar = this.m;
        if (kovVar == null) {
            zga.m("WatchWhileTimeBarController", String.format("%s: no active timebar", "isScrubbing"));
            return false;
        }
        return ((Boolean) jyrVar.apply(kovVar.a)).booleanValue();
    }

    @Override // defpackage.ahyj
    public final void kP() {
        E(new iwu(3), "setScrubbing");
    }

    @Override // defpackage.ahyj
    public final long kQ() {
        return D(jyr.g, "getDisplayScrubberTimeMillis");
    }

    @Override // defpackage.ahym
    public final void kR(ahyl ahylVar) {
        this.a.add(ahylVar);
    }

    @Override // defpackage.fna
    public final void l() {
        E(iwu.e, "maybeCompleteScrub");
    }

    @Override // defpackage.fna
    public final void m(int i) {
        E(new kot(i, 0), "maybeMoveScrub");
    }

    @Override // defpackage.fna
    public final void n(int i) {
        E(new kot(i, 2), "maybeStartScrub");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(fna fnaVar, Predicate predicate) {
        amkq.O(this.i || this.l.isEmpty(), "there can only be one (reparented timebar)");
        amkq.O(!this.q, "cannot add timebar after finalization");
        this.l.add(new kov(fnaVar, predicate));
        ahyg ahygVar = this.k;
        if (ahygVar == null) {
            this.k = (ahyg) ((ahyf) fnaVar).r;
        } else {
            fnaVar.y(ahygVar);
        }
        fnaVar.kR(this.e);
        fmt fmtVar = (fmt) fnaVar;
        fmtVar.p = this.f;
        fnaVar.r(this.g);
        fmtVar.o = ammv.j(this.h);
        fnaVar.A(this.n);
        fnaVar.w(this.o);
        fnaVar.setClickable(this.p);
    }

    @Override // defpackage.fna
    public final void p(boolean z) {
        F(new knr(z, 2));
    }

    @Override // defpackage.ahym
    public final void q(ahyl ahylVar) {
        this.a.remove(ahylVar);
    }

    @Override // defpackage.fna
    public final void r(fmz fmzVar) {
        this.c = amsx.r(fmzVar);
    }

    @Override // defpackage.fna
    public final void s(boolean z) {
        F(new knr(z, 4));
    }

    @Override // defpackage.ahyj
    public final void sendAccessibilityEvent(int i) {
        E(new iwu(6), "sendAccessibilityEvent");
    }

    @Override // defpackage.ahyj
    public final void setAlpha(float f) {
        F(new kss(f, 1));
    }

    @Override // defpackage.fna
    public final void setClickable(boolean z) {
        this.p = z;
        F(new knr(z, 3));
    }

    @Override // defpackage.fna
    public final void setVisibility(int i) {
        throw null;
    }

    @Override // defpackage.fna
    public final void t(View view) {
        F(new kon(view, 0));
        this.q = true;
    }

    @Override // defpackage.fna
    public final void u(int i) {
        F(new kot(i, 3));
    }

    @Override // defpackage.fna
    public final void v(fmy fmyVar) {
        this.b = amsx.r(fmyVar);
    }

    @Override // defpackage.fna
    public final void w(int i) {
        this.o = i;
        F(new kot(i, 4));
    }

    @Override // defpackage.fna
    public final void x(final boolean z, final boolean z2) {
        F(new Consumer() { // from class: kor
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((fna) obj).x(z, z2);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ahyj
    public final /* bridge */ /* synthetic */ void y(ahyk ahykVar) {
        final ahyg ahygVar = (ahyg) ahykVar;
        this.k = ahygVar;
        F(new Consumer() { // from class: koo
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((fna) obj).y(ahyg.this);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void z(fhg fhgVar) {
        kov kovVar;
        Iterator it = this.l.iterator();
        while (true) {
            if (it.hasNext()) {
                kovVar = (kov) it.next();
                if (kovVar.b.test(fhgVar)) {
                    break;
                }
            } else {
                kovVar = null;
                break;
            }
        }
        if (this.m == kovVar) {
            return;
        }
        for (kov kovVar2 : this.l) {
            if (kovVar2 != kovVar) {
                kovVar2.a.setVisibility(8);
                kovVar2.a.x(false, false);
            }
        }
        this.m = kovVar;
        if (kovVar != null) {
            kovVar.a.x(true, false);
            kovVar.a.setVisibility(0);
        }
    }
}
