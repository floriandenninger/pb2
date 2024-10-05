package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aieu implements aioa {
    public final aioc b;
    public final ainy c;
    public final zbw d;
    public final aahd e;
    public awfm f;
    public Runnable g;
    public boolean h;
    public boolean i;
    public final okg l;
    private final acpl m;
    private final acra n;
    private final Handler o;
    public final ayqw a = new ayqw();
    public String j = "";
    public int k = -1;

    public aieu(Handler handler, aioc aiocVar, ainy ainyVar, zbw zbwVar, acpl acplVar, acra acraVar, aahd aahdVar, okg okgVar) {
        this.o = handler;
        this.b = aiocVar;
        this.c = ainyVar;
        this.d = zbwVar;
        this.m = acplVar;
        this.n = acraVar;
        this.e = aahdVar;
        this.l = okgVar;
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.o.removeCallbacks(runnable);
            this.g = null;
        }
    }

    public final void b(awfj awfjVar, awfl awflVar) {
        awfh a = awfi.a();
        a.copyOnWrite();
        ((awfi) a.instance).r(awfjVar);
        String k = this.n.k();
        a.copyOnWrite();
        ((awfi) a.instance).l(k);
        int i = awflVar.d;
        a.copyOnWrite();
        ((awfi) a.instance).o(i);
        long j = awflVar.c;
        a.copyOnWrite();
        ((awfi) a.instance).n(j);
        awfk b = awfk.b(awflVar.g);
        if (b == null) {
            b = awfk.YOU_THERE_TRIGGER_REASON_UNKNOWN;
        }
        a.copyOnWrite();
        ((awfi) a.instance).q(b);
        long j2 = awflVar.h;
        a.copyOnWrite();
        ((awfi) a.instance).m(j2);
        String str = this.j;
        if (str != null && !"".equals(str)) {
            String str2 = this.j;
            a.copyOnWrite();
            ((awfi) a.instance).k(str2);
        }
        if (this.k != -1 && (awfjVar == awfj.YOU_THERE_EVENT_TYPE_PROMPT_SHOWN || awfjVar == awfj.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN)) {
            int i2 = this.k;
            a.copyOnWrite();
            ((awfi) a.instance).p(i2);
        }
        arpn a2 = arpp.a();
        awfi awfiVar = (awfi) a.build();
        a2.copyOnWrite();
        ((arpp) a2.instance).en(awfiVar);
        this.m.c((arpp) a2.build());
    }

    public final void c(final awfl awflVar, final boolean z) {
        int i = awflVar.b;
        if ((32768 & i) != 0) {
            long j = (i & 4) != 0 ? awflVar.e : 0L;
            Runnable runnable = new Runnable() { // from class: aieq
                @Override // java.lang.Runnable
                public final void run() {
                    okg okgVar;
                    gcq gcqVar;
                    aieu aieuVar = aieu.this;
                    boolean z2 = z;
                    awfl awflVar2 = awflVar;
                    aieuVar.g = null;
                    if (z2 && (gcqVar = (okgVar = aieuVar.l).b) != null) {
                        okgVar.a.n(gcqVar);
                    }
                    apxf apxfVar = awflVar2.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    if (apxfVar.pY(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                        apxf apxfVar2 = awflVar2.n;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aieuVar.e.b(((CommandExecutorCommandOuterClass$CommandExecutorCommand) apxfVar2.pX(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
                    }
                    aieuVar.b(awfj.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN_IN_DIALOG, awflVar2);
                    if (!z2) {
                        aieuVar.i(awflVar2);
                    }
                    aieuVar.h(awflVar2);
                }
            };
            this.g = runnable;
            this.o.postDelayed(runnable, j);
            return;
        }
        h(awflVar);
    }

    public final void d(awfl awflVar) {
        aqyg aqygVar;
        g();
        a();
        akbz akbzVar = this.l.a;
        gcm d = gcq.d();
        d.f(true);
        d.d(-1);
        if ((awflVar.b & 16384) != 0) {
            aqygVar = awflVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        d.k(ajcq.b(aqygVar));
        akbzVar.o(d.b());
        b(awfj.YOU_THERE_EVENT_TYPE_USER_RESPONDED, awflVar);
    }

    public final void f(awfl awflVar) {
        this.c.a();
        b(awfj.YOU_THERE_EVENT_TYPE_PLAYBACK_PAUSED, awflVar);
    }

    public final void g() {
        this.o.postDelayed(new Runnable() { // from class: aieo
            @Override // java.lang.Runnable
            public final void run() {
                aieu aieuVar = aieu.this;
                if (aieuVar.c.d()) {
                    return;
                }
                aieuVar.c.b();
            }
        }, 300L);
    }

    public final void h(final awfl awflVar) {
        Runnable runnable = new Runnable() { // from class: aiep
            @Override // java.lang.Runnable
            public final void run() {
                aqyg aqygVar;
                aieu aieuVar = aieu.this;
                awfl awflVar2 = awflVar;
                aqyg aqygVar2 = null;
                aieuVar.g = null;
                if (!awflVar2.o.isEmpty()) {
                    aieuVar.e.b(awflVar2.o);
                    aieuVar.f(awflVar2);
                    return;
                }
                okg okgVar = aieuVar.l;
                aies aiesVar = new aies(aieuVar, awflVar2);
                aiem aiemVar = new aiem(aieuVar, awflVar2, 0);
                akbz akbzVar = okgVar.a;
                gcm d = gcq.d();
                d.f(true);
                d.d(-2);
                if ((awflVar2.b & 4096) != 0) {
                    aqygVar = awflVar2.l;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                d.k(ajcq.b(aqygVar));
                apmh apmhVar = awflVar2.k;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                if ((apmgVar.b & 256) != 0) {
                    apmh apmhVar2 = awflVar2.k;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar2.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    aqygVar2 = apmgVar2.i;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                }
                d.m(ajcq.b(aqygVar2), aiemVar);
                d.b = aiesVar;
                akbzVar.o(d.b());
            }
        };
        this.g = runnable;
        this.o.postDelayed(runnable, awflVar.f);
    }

    public final void i(awfl awflVar) {
        this.d.addObserver(new aiet(this, awflVar));
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 536870912L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aien
            public final /* synthetic */ aieu a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awfm awfmVar;
                awfl awflVar;
                aqyg aqygVar;
                aqyg aqygVar2;
                int i4 = i2;
                int i5 = 1;
                if (i4 == 0) {
                    aieu aieuVar = this.a;
                    ahef ahefVar = (ahef) obj;
                    aign c = ahefVar.c();
                    if (c.a(aign.PLAYBACK_LOADED)) {
                        aieuVar.f = null;
                        for (aryn arynVar : ahefVar.b().I()) {
                            if (arynVar != null && (arynVar.b & 2) != 0) {
                                awfm awfmVar2 = arynVar.d;
                                if (awfmVar2 == null) {
                                    awfmVar2 = awfm.a;
                                }
                                aieuVar.f = awfmVar2;
                                aieuVar.j = ahefVar.e();
                            }
                        }
                    } else if (c.a(aign.NEW, aign.ENDED)) {
                        aieuVar.a();
                        aieuVar.j = "";
                        aieuVar.k = -1;
                    }
                    aieuVar.i = c.a(aign.VIDEO_PLAYING);
                    return;
                }
                if (i4 == 1) {
                    this.a.h = ((ahcx) obj).d() == aigf.REMOTE;
                    return;
                }
                aieu aieuVar2 = this.a;
                aheg ahegVar = (aheg) obj;
                if (!aieuVar2.i || (awfmVar = aieuVar2.f) == null) {
                    return;
                }
                awfn awfnVar = awfmVar.b;
                if (awfnVar == null) {
                    awfnVar = awfn.a;
                }
                if (awfnVar.b != 126827209 || aieuVar2.h) {
                    return;
                }
                awfn awfnVar2 = aieuVar2.f.b;
                if (awfnVar2 == null) {
                    awfnVar2 = awfn.a;
                }
                if (awfnVar2.b == 126827209) {
                    awflVar = (awfl) awfnVar2.c;
                } else {
                    awflVar = awfl.a;
                }
                if (ahegVar.e() > TimeUnit.SECONDS.toMillis(awflVar.d)) {
                    aieuVar2.k = (int) TimeUnit.MILLISECONDS.toSeconds(ahegVar.e());
                    if (aieuVar2.d.a() <= awflVar.c) {
                        aieuVar2.b(awfj.YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD, awflVar);
                    } else if (awflVar.f == 0) {
                        aieuVar2.i(awflVar);
                        aieuVar2.h(awflVar);
                    } else if ((awflVar.b & 128) == 0 || !awflVar.i) {
                        aieuVar2.c(awflVar, false);
                    } else {
                        okg okgVar = aieuVar2.l;
                        aier aierVar = new aier(aieuVar2, awflVar);
                        aiem aiemVar = new aiem(aieuVar2, awflVar, i5);
                        gcm d = gcq.d();
                        d.f(true);
                        d.d(awflVar.f);
                        if ((awflVar.b & 1024) != 0) {
                            aqygVar = awflVar.j;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        d.k(ajcq.b(aqygVar));
                        apmh apmhVar = awflVar.k;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        if ((apmgVar.b & 256) != 0) {
                            apmh apmhVar2 = awflVar.k;
                            if (apmhVar2 == null) {
                                apmhVar2 = apmh.a;
                            }
                            apmg apmgVar2 = apmhVar2.c;
                            if (apmgVar2 == null) {
                                apmgVar2 = apmg.a;
                            }
                            aqygVar2 = apmgVar2.i;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        d.m(ajcq.b(aqygVar2), aiemVar);
                        d.b = aierVar;
                        okgVar.b = d.b();
                        okgVar.a.o(okgVar.b);
                    }
                    aieuVar2.f = null;
                }
            }
        }, ahwx.q), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 536870912L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aien
            public final /* synthetic */ aieu a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awfm awfmVar;
                awfl awflVar;
                aqyg aqygVar;
                aqyg aqygVar2;
                int i4 = i3;
                int i5 = 1;
                if (i4 == 0) {
                    aieu aieuVar = this.a;
                    ahef ahefVar = (ahef) obj;
                    aign c = ahefVar.c();
                    if (c.a(aign.PLAYBACK_LOADED)) {
                        aieuVar.f = null;
                        for (aryn arynVar : ahefVar.b().I()) {
                            if (arynVar != null && (arynVar.b & 2) != 0) {
                                awfm awfmVar2 = arynVar.d;
                                if (awfmVar2 == null) {
                                    awfmVar2 = awfm.a;
                                }
                                aieuVar.f = awfmVar2;
                                aieuVar.j = ahefVar.e();
                            }
                        }
                    } else if (c.a(aign.NEW, aign.ENDED)) {
                        aieuVar.a();
                        aieuVar.j = "";
                        aieuVar.k = -1;
                    }
                    aieuVar.i = c.a(aign.VIDEO_PLAYING);
                    return;
                }
                if (i4 == 1) {
                    this.a.h = ((ahcx) obj).d() == aigf.REMOTE;
                    return;
                }
                aieu aieuVar2 = this.a;
                aheg ahegVar = (aheg) obj;
                if (!aieuVar2.i || (awfmVar = aieuVar2.f) == null) {
                    return;
                }
                awfn awfnVar = awfmVar.b;
                if (awfnVar == null) {
                    awfnVar = awfn.a;
                }
                if (awfnVar.b != 126827209 || aieuVar2.h) {
                    return;
                }
                awfn awfnVar2 = aieuVar2.f.b;
                if (awfnVar2 == null) {
                    awfnVar2 = awfn.a;
                }
                if (awfnVar2.b == 126827209) {
                    awflVar = (awfl) awfnVar2.c;
                } else {
                    awflVar = awfl.a;
                }
                if (ahegVar.e() > TimeUnit.SECONDS.toMillis(awflVar.d)) {
                    aieuVar2.k = (int) TimeUnit.MILLISECONDS.toSeconds(ahegVar.e());
                    if (aieuVar2.d.a() <= awflVar.c) {
                        aieuVar2.b(awfj.YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD, awflVar);
                    } else if (awflVar.f == 0) {
                        aieuVar2.i(awflVar);
                        aieuVar2.h(awflVar);
                    } else if ((awflVar.b & 128) == 0 || !awflVar.i) {
                        aieuVar2.c(awflVar, false);
                    } else {
                        okg okgVar = aieuVar2.l;
                        aier aierVar = new aier(aieuVar2, awflVar);
                        aiem aiemVar = new aiem(aieuVar2, awflVar, i5);
                        gcm d = gcq.d();
                        d.f(true);
                        d.d(awflVar.f);
                        if ((awflVar.b & 1024) != 0) {
                            aqygVar = awflVar.j;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        d.k(ajcq.b(aqygVar));
                        apmh apmhVar = awflVar.k;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        if ((apmgVar.b & 256) != 0) {
                            apmh apmhVar2 = awflVar.k;
                            if (apmhVar2 == null) {
                                apmhVar2 = apmh.a;
                            }
                            apmg apmgVar2 = apmhVar2.c;
                            if (apmgVar2 == null) {
                                apmgVar2 = apmg.a;
                            }
                            aqygVar2 = apmgVar2.i;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        d.m(ajcq.b(aqygVar2), aiemVar);
                        d.b = aierVar;
                        okgVar.b = d.b();
                        okgVar.a.o(okgVar.b);
                    }
                    aieuVar2.f = null;
                }
            }
        }, ahwx.q), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 536870912L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: aien
            public final /* synthetic */ aieu a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awfm awfmVar;
                awfl awflVar;
                aqyg aqygVar;
                aqyg aqygVar2;
                int i4 = i;
                int i5 = 1;
                if (i4 == 0) {
                    aieu aieuVar = this.a;
                    ahef ahefVar = (ahef) obj;
                    aign c = ahefVar.c();
                    if (c.a(aign.PLAYBACK_LOADED)) {
                        aieuVar.f = null;
                        for (aryn arynVar : ahefVar.b().I()) {
                            if (arynVar != null && (arynVar.b & 2) != 0) {
                                awfm awfmVar2 = arynVar.d;
                                if (awfmVar2 == null) {
                                    awfmVar2 = awfm.a;
                                }
                                aieuVar.f = awfmVar2;
                                aieuVar.j = ahefVar.e();
                            }
                        }
                    } else if (c.a(aign.NEW, aign.ENDED)) {
                        aieuVar.a();
                        aieuVar.j = "";
                        aieuVar.k = -1;
                    }
                    aieuVar.i = c.a(aign.VIDEO_PLAYING);
                    return;
                }
                if (i4 == 1) {
                    this.a.h = ((ahcx) obj).d() == aigf.REMOTE;
                    return;
                }
                aieu aieuVar2 = this.a;
                aheg ahegVar = (aheg) obj;
                if (!aieuVar2.i || (awfmVar = aieuVar2.f) == null) {
                    return;
                }
                awfn awfnVar = awfmVar.b;
                if (awfnVar == null) {
                    awfnVar = awfn.a;
                }
                if (awfnVar.b != 126827209 || aieuVar2.h) {
                    return;
                }
                awfn awfnVar2 = aieuVar2.f.b;
                if (awfnVar2 == null) {
                    awfnVar2 = awfn.a;
                }
                if (awfnVar2.b == 126827209) {
                    awflVar = (awfl) awfnVar2.c;
                } else {
                    awflVar = awfl.a;
                }
                if (ahegVar.e() > TimeUnit.SECONDS.toMillis(awflVar.d)) {
                    aieuVar2.k = (int) TimeUnit.MILLISECONDS.toSeconds(ahegVar.e());
                    if (aieuVar2.d.a() <= awflVar.c) {
                        aieuVar2.b(awfj.YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD, awflVar);
                    } else if (awflVar.f == 0) {
                        aieuVar2.i(awflVar);
                        aieuVar2.h(awflVar);
                    } else if ((awflVar.b & 128) == 0 || !awflVar.i) {
                        aieuVar2.c(awflVar, false);
                    } else {
                        okg okgVar = aieuVar2.l;
                        aier aierVar = new aier(aieuVar2, awflVar);
                        aiem aiemVar = new aiem(aieuVar2, awflVar, i5);
                        gcm d = gcq.d();
                        d.f(true);
                        d.d(awflVar.f);
                        if ((awflVar.b & 1024) != 0) {
                            aqygVar = awflVar.j;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        d.k(ajcq.b(aqygVar));
                        apmh apmhVar = awflVar.k;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        if ((apmgVar.b & 256) != 0) {
                            apmh apmhVar2 = awflVar.k;
                            if (apmhVar2 == null) {
                                apmhVar2 = apmh.a;
                            }
                            apmg apmgVar2 = apmhVar2.c;
                            if (apmgVar2 == null) {
                                apmgVar2 = apmg.a;
                            }
                            aqygVar2 = apmgVar2.i;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        d.m(ajcq.b(aqygVar2), aiemVar);
                        d.b = aierVar;
                        okgVar.b = d.b();
                        okgVar.a.o(okgVar.b);
                    }
                    aieuVar2.f = null;
                }
            }
        }, ahwx.q)};
    }
}
