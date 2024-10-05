package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzs extends hg {
    public final azrw e;
    private final gzu f;
    private final gzx g;
    private final acra h;

    public gzs(azrw azrwVar, gzu gzuVar, gzx gzxVar, acra acraVar) {
        this.e = azrwVar;
        this.f = gzuVar;
        this.g = gzxVar;
        this.h = acraVar;
    }

    @Override // defpackage.hg
    public final void b() {
        this.f.a().b();
        s("onFastForward()", gzy.a);
    }

    @Override // defpackage.hg
    public final void c() {
        s("onPause()", this.f.b());
    }

    @Override // defpackage.hg
    public final void d() {
        gzy gzyVar;
        gzu gzuVar = this.f;
        if (gzuVar.d()) {
            gzuVar.a().d();
            gzyVar = gzy.a;
        } else {
            gzyVar = gzy.c;
        }
        s("onPlay()", gzyVar);
    }

    @Override // defpackage.hg
    public final void e(Uri uri, Bundle bundle) {
        String string = bundle.getString("android.intent.extra.youtube_click_tracking_id");
        byte[] decode = string != null ? Base64.decode(string, 8) : null;
        if (decode != null) {
            this.h.d(acsb.b(22678), null, null);
            acqx acqxVar = new acqx(decode);
            ((acqq) this.h).D(acqxVar);
            this.h.I(3, acqxVar, null);
        }
        gzu gzuVar = this.f;
        gzt gztVar = new gzt(gzuVar, uri, decode);
        fgj fgjVar = gzuVar.e;
        if (uri.getPath().equals("/playlist")) {
            uri = uri.buildUpon().path("watch").build();
        }
        fgjVar.o(uri, null, gztVar);
        gztVar.a.V(new ayrs() { // from class: gzr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gzs.this.s("onPlayFromUri()", (gzy) obj);
            }
        });
    }

    @Override // defpackage.hg
    public final void f() {
        s("onPrepare()", this.f.b());
    }

    @Override // defpackage.hg
    public final void g() {
        this.f.a().g();
        s("onRewind()", gzy.a);
    }

    @Override // defpackage.hg
    public final void h(long j) {
        this.f.a().h(j);
        s("onSeekTo()", gzy.a);
    }

    @Override // defpackage.hg
    public final void j() {
        gzy gzyVar;
        gzu gzuVar = this.f;
        if (gzuVar.d()) {
            gzuVar.a().j();
            gzyVar = gzy.a;
        } else {
            gzyVar = gzy.c;
        }
        s("onSkipToNext()", gzyVar);
    }

    @Override // defpackage.hg
    public final void k() {
        gzy gzyVar;
        gzu gzuVar = this.f;
        if (gzuVar.d()) {
            gzuVar.a().k();
            gzyVar = gzy.a;
        } else {
            gzyVar = gzy.c;
        }
        s("onSkipToPrevious()", gzyVar);
    }

    @Override // defpackage.hg
    public final void l() {
        gzu gzuVar = this.f;
        gzuVar.c().K();
        gzuVar.c().J();
        s("onStop()", gzy.a);
    }

    @Override // defpackage.hg
    public final void n() {
        s("onPlayFromMediaId()", gzy.b);
    }

    @Override // defpackage.hg
    public final void o() {
        s("onPlayFromSearch()", gzy.b);
    }

    @Override // defpackage.hg
    public final void p() {
        s("onPrepareFromMediaId()", gzy.b);
    }

    @Override // defpackage.hg
    public final void q() {
        s("onPrepareFromSearch()", gzy.b);
    }

    @Override // defpackage.hg
    public final void r() {
        s("onPrepareFromUri()", gzy.b);
    }

    public final void s(String str, gzy gzyVar) {
        if (gzyVar.d) {
            String gzyVar2 = gzyVar.toString();
            StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(gzyVar2).length());
            sb.append(str);
            sb.append(" : ");
            sb.append(gzyVar2);
            zga.b(sb.toString());
            hn hnVar = (hn) this.e.get();
            hq hqVar = new hq();
            amkq.N(gzyVar.d);
            int i = gzyVar.e;
            amkq.N(gzyVar.d);
            String str2 = gzyVar.f;
            hqVar.c = i;
            hqVar.d = str2;
            hqVar.c(7, 0L, 1.0f);
            hnVar.i(hqVar.a());
        }
    }

    @Override // defpackage.hg
    public final void i(RatingCompat ratingCompat) {
        final asno asnoVar;
        gzy gzyVar;
        float f = ratingCompat.b;
        final int i = 2;
        if (f >= 0.0f) {
            asnoVar = (ratingCompat.a == 2 && f == 1.0f) ? asno.LIKE : asno.DISLIKE;
        } else {
            asnoVar = asno.INDIFFERENT;
        }
        final gzx gzxVar = this.g;
        final String q = this.f.c().q();
        if (q == null) {
            gzyVar = gzy.a;
        } else if (gzxVar.a.t()) {
            gzxVar.b.b();
            ynk ynkVar = new ynk() { // from class: gzv
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    gzx gzxVar2 = gzx.this;
                    zga.d("Error rating", th);
                    gzxVar2.c.e(th);
                }
            };
            Runnable runnable = anij.a;
            int ordinal = asnoVar.ordinal();
            if (ordinal != 0) {
                final int i2 = 1;
                if (ordinal == 1) {
                    aayd a = gzxVar.d.a();
                    a.k();
                    a.w(q);
                    ynm.l(gzxVar.d.f(a, gzxVar.e), gzxVar.e, ynkVar, new ynl() { // from class: gzw
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            int i3 = i2;
                            if (i3 == 0) {
                                gzxVar.a(q, asnoVar);
                            } else if (i3 == 1) {
                                gzxVar.a(q, asnoVar);
                            } else {
                                gzxVar.a(q, asnoVar);
                            }
                        }
                    }, runnable);
                } else {
                    aayf d = gzxVar.d.d();
                    d.k();
                    d.w(q);
                    ynm.l(gzxVar.d.j(d, gzxVar.e), gzxVar.e, ynkVar, new ynl() { // from class: gzw
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            int i3 = i;
                            if (i3 == 0) {
                                gzxVar.a(q, asnoVar);
                            } else if (i3 == 1) {
                                gzxVar.a(q, asnoVar);
                            } else {
                                gzxVar.a(q, asnoVar);
                            }
                        }
                    }, runnable);
                }
            } else {
                aaye b = gzxVar.d.b();
                b.k();
                b.w(q);
                final int i3 = 0;
                ynm.l(gzxVar.d.h(b, gzxVar.e), gzxVar.e, ynkVar, new ynl() { // from class: gzw
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        int i32 = i3;
                        if (i32 == 0) {
                            gzxVar.a(q, asnoVar);
                        } else if (i32 == 1) {
                            gzxVar.a(q, asnoVar);
                        } else {
                            gzxVar.a(q, asnoVar);
                        }
                    }
                }, runnable);
            }
            gzyVar = gzy.a;
        } else {
            gzyVar = gzy.c;
        }
        s("onSetRating()", gzyVar);
    }
}
