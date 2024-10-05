package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkn implements aioa {
    final /* synthetic */ adko a;
    private final /* synthetic */ int b;

    public adkn(adko adkoVar, int i) {
        this.b = i;
        this.a = adkoVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        if (this.b == 0) {
            return new ayqx[]{aiocVar.ao().X(new ayrs() { // from class: adkm
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    adkn adknVar = adkn.this;
                    ahdv ahdvVar = (ahdv) obj;
                    adgc b = adknVar.a.k.b();
                    boolean z = false;
                    if (ahdvVar.a() != null && ahdvVar.a().g != null) {
                        z = true;
                    }
                    b.n(z);
                    String str = null;
                    if (z && (ahdvVar.a().g.c & 32) != 0) {
                        str = ahdvVar.a().g.k;
                    }
                    b.b = str;
                    b.f(adknVar.a.i.c());
                    adknVar.a.l.c(b.a());
                }
            })};
        }
        final int i3 = 2;
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.G().a.X(new ayrs(this, i3, bArr) { // from class: adkk
            public final /* synthetic */ adkn a;
            private final /* synthetic */ int b;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = this.b;
                boolean z = false;
                if (i4 == 0) {
                    final adkn adknVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    boolean z2 = ahcxVar.c() == aigf.FULLSCREEN;
                    adknVar.a.m = ahcxVar.d() == aigf.REMOTE;
                    adgc b = adknVar.a.k.b();
                    if (ahcxVar.c() == aigf.MINIMIZED) {
                        b.m(adgd.BROWSE);
                    } else if (z2) {
                        b.m(adgd.WATCH);
                    } else if (ahcxVar.c() == aigf.DEFAULT) {
                        if (ahcxVar.b() < 0 || ahcxVar.a() < 0) {
                            b.m(adgd.BROWSE);
                        } else {
                            final byte[] bArr2 = null;
                            new Handler().postDelayed(new Runnable(bArr2) { // from class: adkl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    adkn adknVar2 = adkn.this;
                                    if (adknVar2.a.c.q() == null || adknVar2.a.k.g == adgd.WATCH) {
                                        return;
                                    }
                                    adgc b2 = adknVar2.a.k.b();
                                    b2.m(adgd.WATCH);
                                    adknVar2.a.l.c(b2.a());
                                }
                            }, 100L);
                        }
                    }
                    b.h(z2);
                    if (adknVar.a.m) {
                        b.p(0);
                    }
                    b.f(adknVar.a.i.c());
                    adknVar.a.l.c(b.a());
                    return;
                }
                if (i4 != 1) {
                    adkn adknVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c().a(aign.NEW, aign.PLAYBACK_LOADED)) {
                        adgc b2 = adknVar2.a.k.b();
                        if (ahefVar.c() == aign.NEW) {
                            b2.i(false);
                            b2.o(false);
                            b2.n(false);
                            b2.q(false);
                        } else {
                            b2.m(adgd.WATCH);
                            b2.g(ahefVar.b().a());
                            b2.a = ahefVar.b().y();
                            adko adkoVar = adknVar2.a;
                            if (!adkoVar.m) {
                                b2.p(adkoVar.k.n + 1);
                            }
                            b2.f(adknVar2.a.i.c());
                        }
                        adknVar2.a.l.c(b2.a());
                        return;
                    }
                    return;
                }
                adkn adknVar3 = this.a;
                VideoQuality[] l = ((aeqq) obj).l();
                if (l != null) {
                    boolean z3 = false;
                    for (VideoQuality videoQuality : l) {
                        int i5 = videoQuality.a;
                        if (i5 >= 720) {
                            z = true;
                            break;
                        }
                        z3 |= !(i5 < 480);
                    }
                    z = z3;
                }
                r1 = false;
                adgc b3 = adknVar3.a.k.b();
                b3.i(r1);
                b3.o(z);
                b3.f(adknVar3.a.i.c());
                adknVar3.a.l.c(b3.a());
            }
        }), aiocVar.t().b.X(new ayrs(this, i, bArr) { // from class: adkk
            public final /* synthetic */ adkn a;
            private final /* synthetic */ int b;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = this.b;
                boolean z = false;
                if (i4 == 0) {
                    final adkn adknVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    boolean z2 = ahcxVar.c() == aigf.FULLSCREEN;
                    adknVar.a.m = ahcxVar.d() == aigf.REMOTE;
                    adgc b = adknVar.a.k.b();
                    if (ahcxVar.c() == aigf.MINIMIZED) {
                        b.m(adgd.BROWSE);
                    } else if (z2) {
                        b.m(adgd.WATCH);
                    } else if (ahcxVar.c() == aigf.DEFAULT) {
                        if (ahcxVar.b() < 0 || ahcxVar.a() < 0) {
                            b.m(adgd.BROWSE);
                        } else {
                            final byte[] bArr2 = null;
                            new Handler().postDelayed(new Runnable(bArr2) { // from class: adkl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    adkn adknVar2 = adkn.this;
                                    if (adknVar2.a.c.q() == null || adknVar2.a.k.g == adgd.WATCH) {
                                        return;
                                    }
                                    adgc b2 = adknVar2.a.k.b();
                                    b2.m(adgd.WATCH);
                                    adknVar2.a.l.c(b2.a());
                                }
                            }, 100L);
                        }
                    }
                    b.h(z2);
                    if (adknVar.a.m) {
                        b.p(0);
                    }
                    b.f(adknVar.a.i.c());
                    adknVar.a.l.c(b.a());
                    return;
                }
                if (i4 != 1) {
                    adkn adknVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c().a(aign.NEW, aign.PLAYBACK_LOADED)) {
                        adgc b2 = adknVar2.a.k.b();
                        if (ahefVar.c() == aign.NEW) {
                            b2.i(false);
                            b2.o(false);
                            b2.n(false);
                            b2.q(false);
                        } else {
                            b2.m(adgd.WATCH);
                            b2.g(ahefVar.b().a());
                            b2.a = ahefVar.b().y();
                            adko adkoVar = adknVar2.a;
                            if (!adkoVar.m) {
                                b2.p(adkoVar.k.n + 1);
                            }
                            b2.f(adknVar2.a.i.c());
                        }
                        adknVar2.a.l.c(b2.a());
                        return;
                    }
                    return;
                }
                adkn adknVar3 = this.a;
                VideoQuality[] l = ((aeqq) obj).l();
                if (l != null) {
                    boolean z3 = false;
                    for (VideoQuality videoQuality : l) {
                        int i5 = videoQuality.a;
                        if (i5 >= 720) {
                            z = true;
                            break;
                        }
                        z3 |= !(i5 < 480);
                    }
                    z = z3;
                }
                r1 = false;
                adgc b3 = adknVar3.a.k.b();
                b3.i(r1);
                b3.o(z);
                b3.f(adknVar3.a.i.c());
                adknVar3.a.l.c(b3.a());
            }
        }), aiocVar.ae(aczu.o, aczu.p).X(new ayrs(this, i2, bArr) { // from class: adkk
            public final /* synthetic */ adkn a;
            private final /* synthetic */ int b;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = this.b;
                boolean z = false;
                if (i4 == 0) {
                    final adkn adknVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    boolean z2 = ahcxVar.c() == aigf.FULLSCREEN;
                    adknVar.a.m = ahcxVar.d() == aigf.REMOTE;
                    adgc b = adknVar.a.k.b();
                    if (ahcxVar.c() == aigf.MINIMIZED) {
                        b.m(adgd.BROWSE);
                    } else if (z2) {
                        b.m(adgd.WATCH);
                    } else if (ahcxVar.c() == aigf.DEFAULT) {
                        if (ahcxVar.b() < 0 || ahcxVar.a() < 0) {
                            b.m(adgd.BROWSE);
                        } else {
                            final byte[] bArr2 = null;
                            new Handler().postDelayed(new Runnable(bArr2) { // from class: adkl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    adkn adknVar2 = adkn.this;
                                    if (adknVar2.a.c.q() == null || adknVar2.a.k.g == adgd.WATCH) {
                                        return;
                                    }
                                    adgc b2 = adknVar2.a.k.b();
                                    b2.m(adgd.WATCH);
                                    adknVar2.a.l.c(b2.a());
                                }
                            }, 100L);
                        }
                    }
                    b.h(z2);
                    if (adknVar.a.m) {
                        b.p(0);
                    }
                    b.f(adknVar.a.i.c());
                    adknVar.a.l.c(b.a());
                    return;
                }
                if (i4 != 1) {
                    adkn adknVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c().a(aign.NEW, aign.PLAYBACK_LOADED)) {
                        adgc b2 = adknVar2.a.k.b();
                        if (ahefVar.c() == aign.NEW) {
                            b2.i(false);
                            b2.o(false);
                            b2.n(false);
                            b2.q(false);
                        } else {
                            b2.m(adgd.WATCH);
                            b2.g(ahefVar.b().a());
                            b2.a = ahefVar.b().y();
                            adko adkoVar = adknVar2.a;
                            if (!adkoVar.m) {
                                b2.p(adkoVar.k.n + 1);
                            }
                            b2.f(adknVar2.a.i.c());
                        }
                        adknVar2.a.l.c(b2.a());
                        return;
                    }
                    return;
                }
                adkn adknVar3 = this.a;
                VideoQuality[] l = ((aeqq) obj).l();
                if (l != null) {
                    boolean z3 = false;
                    for (VideoQuality videoQuality : l) {
                        int i5 = videoQuality.a;
                        if (i5 >= 720) {
                            z = true;
                            break;
                        }
                        z3 |= !(i5 < 480);
                    }
                    z = z3;
                }
                r1 = false;
                adgc b3 = adknVar3.a.k.b();
                b3.i(r1);
                b3.o(z);
                b3.f(adknVar3.a.i.c());
                adknVar3.a.l.c(b3.a());
            }
        })};
    }
}
