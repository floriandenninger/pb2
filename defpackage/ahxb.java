package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxb implements ahwz, aioa, ypd {
    private static final avve[] c = new avve[0];
    public final ainy a;
    public PlayerResponseModel b;
    private final kfc d;

    public ahxb(ainy ainyVar, kfc kfcVar) {
        this.a = ainyVar;
        kfcVar.getClass();
        this.d = kfcVar;
        kfcVar.c.a(this);
    }

    private final void d() {
        this.d.b(false);
        this.d.a(c, -1);
    }

    public final void a(ahcr ahcrVar) {
        c(ahcrVar.c());
    }

    public final void b(ahef ahefVar) {
        aign c2 = ahefVar.c();
        this.b = ahefVar.b();
        if (c2.h()) {
            d();
        }
        if (c2 == aign.VIDEO_PLAYING) {
            c(ahcr.d(ahefVar.b()));
            kfc kfcVar = this.d;
            avvf avvfVar = ahefVar.b().c().c.t;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            kfcVar.d = avvfVar.d;
        }
    }

    public final void c(avve[] avveVarArr) {
        aiwk aiwkVar = this.a.p.a;
        int i = 0;
        boolean z = aiwkVar != null && aiwkVar.ao().a();
        this.d.b(z);
        if (z) {
            while (true) {
                if (i >= avveVarArr.length) {
                    i = -1;
                    break;
                }
                float f = avveVarArr[i].d;
                aiwk aiwkVar2 = this.a.p.a;
                if (Float.compare(f, aiwkVar2 != null ? aiwkVar2.j() : 1.0f) == 0) {
                    break;
                } else {
                    i++;
                }
            }
            this.d.a(avveVarArr, i);
            return;
        }
        d();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 131072L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxa
            public final /* synthetic */ ahxb a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((ahcr) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahwx.c), aiocVar.ae(ahbz.n, ahbz.o).h(ahbw.g(aiocVar.aC(), 131072L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxa
            public final /* synthetic */ ahxb a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((ahcr) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahwx.c)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcr.class, ahef.class};
        }
        if (i == 0) {
            a((ahcr) obj);
            return null;
        }
        if (i == 1) {
            b((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
