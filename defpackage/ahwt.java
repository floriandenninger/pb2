package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwt implements aioa, ypd {
    final /* synthetic */ ahwu a;

    public ahwt(ahwu ahwuVar) {
        this.a = ahwuVar;
    }

    public final void a(aeqq aeqqVar) {
        if (adyu.bP(aeqqVar.b())) {
            this.a.i = aeqqVar.f();
            this.a.j = aeqqVar.e();
            ahwu ahwuVar = this.a;
            if (ahwuVar.p) {
                ahwuVar.a.b(ahwuVar.i);
                ahwu ahwuVar2 = this.a;
                ahwuVar2.a.a(ahwuVar2.j);
            }
        }
    }

    public final void b(ahef ahefVar) {
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 4 || ordinal == 7) {
            if (ahefVar.a() != null) {
                this.a.e = ahefVar.a().y();
                this.a.f = ahefVar.k();
            } else if (ahefVar.b() != null) {
                this.a.e = ahefVar.b().y();
                this.a.f = ahefVar.e();
            } else {
                this.a.e = null;
            }
            PlayerResponseModel a = ahefVar.c().h() ? ahefVar.a() : ahefVar.b();
            ahwu ahwuVar = this.a;
            float f = 0.0f;
            if (a.c() != null) {
                apgk apgkVar = a.c().c.f;
                if (apgkVar == null) {
                    apgkVar = apgk.a;
                }
                f = Math.min(0.0f, apgkVar.b);
            }
            ahwuVar.s = f;
            VideoStreamingData videoStreamingData = a == null ? null : a.c;
            this.a.k = videoStreamingData != null ? videoStreamingData.i() : null;
            ahwu ahwuVar2 = this.a;
            ahwuVar2.g = ((Integer) ahwuVar2.b.get()).intValue();
            ahwu ahwuVar3 = this.a;
            ahwuVar3.h = ((Integer) ahwuVar3.c.get()).intValue();
            ahwu ahwuVar4 = this.a;
            if (ahwuVar4.p) {
                ahwuVar4.i();
            }
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 32768L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahws
            public final /* synthetic */ ahwt a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((aeqq) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahwx.a), aiocVar.G().k.X(new ayrs(this) { // from class: ahws
            public final /* synthetic */ ahwt a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((aeqq) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        })};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class, ahef.class};
        }
        if (i == 0) {
            a((aeqq) obj);
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
