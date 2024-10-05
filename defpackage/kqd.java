package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqd implements aioa, ypd {
    final /* synthetic */ kqe a;

    public kqd(kqe kqeVar) {
        this.a = kqeVar;
    }

    public final void a(ahcx ahcxVar) {
        kqe kqeVar = this.a;
        boolean z = kqeVar.e;
        kqeVar.e = ahcxVar.d() == aigf.REMOTE;
        kqe kqeVar2 = this.a;
        if (kqeVar2.e == z) {
            return;
        }
        kqeVar2.h();
    }

    public final void b(ahdv ahdvVar) {
        if (!ahdvVar.c().b(aigk.VIDEO_PLAYBACK_LOADED) || ahdvVar.b() == null) {
            return;
        }
        kqe kqeVar = this.a;
        PlayerResponseModel b = ahdvVar.b();
        kqeVar.d = new kpz(b.y(), b.b().e());
        this.a.g();
    }

    public final void c(ahed ahedVar) {
        kqe kqeVar = this.a;
        boolean z = kqeVar.f;
        boolean z2 = true;
        if (ahedVar.a() != aigm.IS_UAO && !ahedVar.b()) {
            z2 = false;
        }
        kqeVar.f = z2;
        kqe kqeVar2 = this.a;
        if (z != kqeVar2.f) {
            kqeVar2.h();
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 2;
        ayqx Y = aiocVar.t().a.Y(new ayrs(this) { // from class: kqc
            public final /* synthetic */ kqd a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    this.a.b((ahdv) obj);
                } else if (i2 != 1) {
                    this.a.c((ahed) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, kfe.r);
        final int i2 = 0;
        ayqx Y2 = aiocVar.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: kqc
            public final /* synthetic */ kqd a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.b((ahdv) obj);
                } else if (i22 != 1) {
                    this.a.c((ahed) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, kfe.r);
        final int i3 = 1;
        return new ayqx[]{Y, Y2, aiocVar.t().b.Y(new ayrs(this) { // from class: kqc
            public final /* synthetic */ kqd a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.b((ahdv) obj);
                } else if (i22 != 1) {
                    this.a.c((ahed) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, kfe.r)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahdv.class, ahed.class};
        }
        if (i == 0) {
            a((ahcx) obj);
            return null;
        }
        if (i == 1) {
            b((ahdv) obj);
            return null;
        }
        if (i == 2) {
            c((ahed) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
