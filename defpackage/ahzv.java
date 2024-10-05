package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzv extends yns implements aioa {
    public final ainy d;
    public final aioc e;
    public final ayqw f = new ayqw();
    private aixh g;
    private ahzu h;
    private final atxo i;

    public ahzv(ainy ainyVar, aioc aiocVar, atxo atxoVar) {
        ainyVar.getClass();
        this.d = ainyVar;
        this.e = aiocVar;
        atxoVar.getClass();
        this.i = atxoVar;
    }

    @Override // defpackage.yns
    public final void b() {
        aixm d;
        this.f.c();
        aixh aixhVar = this.g;
        if (aixhVar == null || this.h == null || (d = aixhVar.d()) == null) {
            return;
        }
        d.i(this.h);
    }

    public final void d(aixh aixhVar) {
        long max;
        if (this.h != null) {
            return;
        }
        this.g = aixhVar;
        aixm d = aixhVar != null ? aixhVar.d() : null;
        if (d == null) {
            return;
        }
        long h = this.d.h();
        if (h <= 0) {
            return;
        }
        if (this.i.d >= 0) {
            max = Math.min(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS), h);
        } else {
            max = Math.max(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS) + h, 0L);
        }
        ahzu ahzuVar = new ahzu(this, max, h);
        this.h = ahzuVar;
        d.c(ahzuVar);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 67108864L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahzt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahzv ahzvVar = ahzv.this;
                ahef ahefVar = (ahef) obj;
                if (!ahefVar.c().c(aign.PLAYBACK_LOADED) || ahefVar.c().h()) {
                    return;
                }
                ahzvVar.d(ahefVar.d());
            }
        }, ahwx.m)};
    }
}
