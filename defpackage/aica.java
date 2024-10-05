package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aica {
    public final acra a;
    public final aicg b;
    public final Handler c;
    public final aibx d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Runnable h = new Runnable() { // from class: aiby
        @Override // java.lang.Runnable
        public final void run() {
            aica.this.b();
        }
    };
    public aick i;
    private final aivo j;
    private final ainy k;

    public aica(azrw azrwVar, aicg aicgVar, Handler handler, aivo aivoVar, aibx aibxVar, ainy ainyVar) {
        this.a = (acra) azrwVar.get();
        this.b = aicgVar;
        this.c = handler;
        this.j = aivoVar;
        this.d = aibxVar;
        this.k = ainyVar;
    }

    private static final aupb c(aibw aibwVar) {
        return aibwVar.a ? aupb.SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER : aupb.SEEK_SOURCE_DOUBLE_TAP_TO_SEEK;
    }

    public final void a(MotionEvent motionEvent, View view, boolean z) {
        acrb acrbVar;
        aibw a;
        long j;
        Optional of;
        CharSequence b;
        Optional c;
        aicf aicfVar = new aicf(motionEvent, aicf.a(motionEvent, view.getWidth(), z), z);
        int i = aicfVar.b;
        if (i == 0 || this.i == null) {
            return;
        }
        if (!aicfVar.c) {
            acrbVar = i == 1 ? acrb.DOUBLE_TAP_TO_SEEK_FAST_FORWARD : acrb.DOUBLE_TAP_TO_SEEK_REWIND;
        } else if (i == 1) {
            acrbVar = acrb.TWO_FINGERS_DOUBLE_TAP_TO_SEEK_FORWARD;
        } else {
            acrbVar = acrb.TWO_FINGERS_DOUBLE_TAP_TO_SEEK_REWIND;
        }
        aibx aibxVar = this.d;
        Duration a2 = this.b.a();
        if (!aibxVar.c || !aicfVar.c) {
            a = aibw.a(a2);
        } else {
            if (aicfVar.b == 1) {
                c = aibxVar.a.b(ahyo.CHAPTER);
            } else {
                c = aibxVar.a.c(ahyo.CHAPTER);
            }
            if (!c.isPresent()) {
                a = aibw.a(a2);
            } else {
                aixh o = ((ainy) aibxVar.b.get()).o();
                if (o == null) {
                    a = aibw.a(a2);
                } else {
                    a = new aibw(true, Duration.ofMillis(Math.abs(((TimelineMarker) c.get()).a - o.b())), Optional.ofNullable(((TimelineMarker) c.get()).e), true);
                }
            }
        }
        Duration duration = a.b;
        if (aicfVar.b == 1) {
            j = duration.toMillis();
        } else {
            j = -duration.toMillis();
        }
        acra acraVar = this.a;
        acqx acqxVar = new acqx(acrbVar);
        aupb c2 = c(a);
        if (!this.f) {
            of = Optional.empty();
        } else {
            int b2 = this.k.o() == null ? 0 : (int) this.k.o().b();
            long min = Math.min(this.k.h(), Math.max(0L, b2 + j));
            aone createBuilder = asid.a.createBuilder();
            createBuilder.copyOnWrite();
            asid asidVar = (asid) createBuilder.instance;
            asidVar.c = c2.n;
            asidVar.b |= 1;
            createBuilder.copyOnWrite();
            asid asidVar2 = (asid) createBuilder.instance;
            asidVar2.b |= 2;
            asidVar2.d = b2;
            createBuilder.copyOnWrite();
            asid asidVar3 = (asid) createBuilder.instance;
            asidVar3.b |= 4;
            asidVar3.e = (int) min;
            asid asidVar4 = (asid) createBuilder.build();
            aone createBuilder2 = asht.a.createBuilder();
            createBuilder2.copyOnWrite();
            asht ashtVar = (asht) createBuilder2.instance;
            asidVar4.getClass();
            ashtVar.G = asidVar4;
            ashtVar.c |= 67108864;
            of = Optional.of((asht) createBuilder2.build());
        }
        acraVar.I(3, acqxVar, (asht) of.orElse(null));
        if (this.g) {
            this.j.h(j, c(a));
        } else {
            this.j.g(j);
        }
        this.b.c(aicfVar);
        this.c.removeCallbacks(this.h);
        this.c.postDelayed(this.h, 650L);
        this.e = true;
        if (!a.a || !a.c.isPresent()) {
            b = this.b.b();
        } else {
            b = (CharSequence) a.c.get();
        }
        this.i.e(b, aicfVar, a.d);
    }

    public final void b() {
        this.e = false;
        this.b.d();
    }
}
