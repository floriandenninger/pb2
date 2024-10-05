package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrm implements aioa, ypd {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahrm(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahcx ahcxVar) {
        ahsd ahsdVar;
        aigf aigfVar = aigf.DEFAULT;
        aign aignVar = aign.NEW;
        int ordinal = ahcxVar.d().ordinal();
        if ((ordinal != 0 && ordinal != 2) || this.a.h.isEmpty() || (ahsdVar = this.a.l) == null) {
            return;
        }
        ahsdVar.f = ahcxVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahef ahefVar) {
        this.a.n = ahefVar.e();
        this.a.o = ahefVar.k();
        aigf aigfVar = aigf.DEFAULT;
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 0) {
            this.a.q();
            return;
        }
        if (ordinal == 5) {
            this.a.p(ahefVar.d(), ahefVar.a());
            return;
        }
        if (ordinal == 8) {
            this.a.p(ahefVar.d(), ahefVar.b());
            return;
        }
        if (ordinal != 9) {
            return;
        }
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
        if (creatorEndscreenOverlayPresenter.i) {
            creatorEndscreenOverlayPresenter.i = false;
            creatorEndscreenOverlayPresenter.s();
            this.a.l(false);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 1024L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahrl
            public final /* synthetic */ ahrm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((ahcx) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahfo.i), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 1024L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahrl
            public final /* synthetic */ ahrm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((ahcx) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahfo.i)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class};
        }
        if (i == 0) {
            a((ahcx) obj);
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
