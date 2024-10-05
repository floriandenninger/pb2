package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxv implements ahxs, aioa, ypd {
    private final ainy a;
    private final ahxt b;

    public ahxv(ainy ainyVar, ahxt ahxtVar) {
        this.a = ainyVar;
        ahxtVar.getClass();
        this.b = ahxtVar;
        ahxtVar.l(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahdy ahdyVar) {
        this.b.j(ahdyVar.a());
        if (ahdyVar.a() == null || ahdyVar.a().p() || ahdyVar.a().l()) {
            this.b.e(false);
        } else {
            this.b.e(true);
        }
    }

    public final void c(ahdz ahdzVar) {
        this.b.g(ahdzVar.a());
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.ae(ahbz.t, aidf.b).h(ahbw.g(aiocVar.aC(), 1048576L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxu
            public final /* synthetic */ ahxv a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.b((ahdy) obj);
                } else {
                    this.a.c((ahdz) obj);
                }
            }
        }, ahwx.f), aiocVar.ae(ahbz.t, ahbz.u).h(ahbw.g(aiocVar.aC(), 1048576L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxu
            public final /* synthetic */ ahxv a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.b((ahdy) obj);
                } else {
                    this.a.c((ahdz) obj);
                }
            }
        }, ahwx.f)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdy.class, ahdz.class};
        }
        if (i == 0) {
            b((ahdy) obj);
            return null;
        }
        if (i == 1) {
            c((ahdz) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ahxs
    public final void ps(SubtitleTrack subtitleTrack) {
        this.a.G(subtitleTrack);
    }
}
