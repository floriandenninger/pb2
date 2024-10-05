package com.google.android.libraries.youtube.player.features.overlay.subtitles;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import defpackage.aadw;
import defpackage.aand;
import defpackage.ahbw;
import defpackage.ahbz;
import defpackage.ahcx;
import defpackage.ahdy;
import defpackage.ahef;
import defpackage.aheg;
import defpackage.ahwx;
import defpackage.ahxi;
import defpackage.ahxj;
import defpackage.aidl;
import defpackage.aifk;
import defpackage.aigf;
import defpackage.aign;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.aisf;
import defpackage.aisl;
import defpackage.aism;
import defpackage.aisn;
import defpackage.aity;
import defpackage.aiua;
import defpackage.aiur;
import defpackage.aiuy;
import defpackage.aixm;
import defpackage.ajbl;
import defpackage.any;
import defpackage.aok;
import defpackage.apex;
import defpackage.atyg;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.banw;
import defpackage.yjk;
import defpackage.ykl;
import defpackage.ykn;
import defpackage.ypd;
import defpackage.zga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SubtitlesOverlayPresenter implements ykl, aiur, aioa, any, ypd {
    public final ahxi a;
    public final Map b;
    public SubtitleTrack c;
    public String d;
    private final aisn e;
    private final aiuy f;
    private final aisf g;
    private final Executor h;
    private final Executor i;
    private aisl j;
    private ykn k;
    private boolean l;
    private final aadw m;

    public SubtitlesOverlayPresenter(ahxi ahxiVar, aisn aisnVar, aiuy aiuyVar, aisf aisfVar, Executor executor, Executor executor2, aadw aadwVar) {
        ahxiVar.getClass();
        this.a = ahxiVar;
        aisnVar.getClass();
        this.e = aisnVar;
        aiuyVar.getClass();
        this.f = aiuyVar;
        aisfVar.getClass();
        this.g = aisfVar;
        this.h = executor;
        this.i = executor2;
        this.b = new HashMap();
        this.m = aadwVar;
        aiuyVar.e(this);
        ahxiVar.i(aiuyVar.b());
        ahxiVar.g(aiuyVar.a());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.d("error retrieving subtitle", exc);
        if (!yjk.h()) {
            this.i.execute(new Runnable() { // from class: ahxl
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitlesOverlayPresenter.this.g();
                }
            });
        } else {
            g();
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        aism aismVar = (aism) obj;
        final aiua aiuaVar = (aiua) obj2;
        if (aiuaVar == null) {
            g();
            return;
        }
        final aixm aixmVar = (aixm) this.b.get(aismVar.a.i());
        if (aixmVar != null) {
            this.h.execute(new Runnable() { // from class: ahxm
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitlesOverlayPresenter subtitlesOverlayPresenter = SubtitlesOverlayPresenter.this;
                    aixm aixmVar2 = aixmVar;
                    aiua aiuaVar2 = aiuaVar;
                    ahxj ahxjVar = new ahxj(subtitlesOverlayPresenter.a);
                    ArrayList arrayList = new ArrayList();
                    if (!aiuaVar2.a.isEmpty()) {
                        int i = 0;
                        while (i < aiuaVar2.a.size() - 1) {
                            int i2 = i + 1;
                            arrayList.add(new aity(((Long) aiuaVar2.a.get(i)).longValue(), ((Long) aiuaVar2.a.get(i2)).longValue(), aiuaVar2.b(((Long) aiuaVar2.a.get(i)).longValue()), ahxjVar));
                            i = i2;
                        }
                        arrayList.add(new aity(((Long) amkq.bj(aiuaVar2.a)).longValue(), Long.MAX_VALUE, new ArrayList(), ahxjVar));
                    }
                    aixmVar2.d(arrayList);
                }
            });
        }
    }

    public final void g() {
        this.a.a();
        this.a.f();
        aisl aislVar = this.j;
        if (aislVar != null) {
            aislVar.b();
            this.j = null;
        }
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((aixm) it.next()).j(aity.class);
        }
        this.c = null;
    }

    public final void h(ahcx ahcxVar) {
        this.l = ahcxVar.d() == aigf.REMOTE;
    }

    public final void i() {
        if (this.l) {
            return;
        }
        g();
        this.b.clear();
        ykn yknVar = this.k;
        if (yknVar != null) {
            yknVar.d();
            this.k = null;
        }
    }

    public final void j(ahdy ahdyVar) {
        if (this.l) {
            return;
        }
        p(ahdyVar.a());
    }

    public final void k(ahef ahefVar) {
        if (ahefVar.c() == aign.INTERSTITIAL_PLAYING || ahefVar.c() == aign.INTERSTITIAL_REQUESTED) {
            this.d = ahefVar.k();
        } else {
            this.d = ahefVar.e();
        }
        if (ahefVar.d() == null || ahefVar.d().c() == null || ahefVar.d().d() == null) {
            return;
        }
        this.b.put(ahefVar.d().c().y(), ahefVar.d().d());
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        apex apexVar;
        atyg F = aifk.F(this.m);
        if (F != null) {
            apexVar = F.o;
            if (apexVar == null) {
                apexVar = apex.a;
            }
        } else {
            apexVar = null;
        }
        final int i = 7;
        final int i2 = 4;
        final int i3 = 3;
        final int i4 = 6;
        final int i5 = 2;
        final int i6 = 5;
        final int i7 = 0;
        final int i8 = 1;
        return (apexVar == null || !apexVar.b) ? new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i8) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.ae(ahbz.p, ahbz.r).h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.G().l.X(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }), aiocVar.ae(ahbz.q, ahbz.s).h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e)} : new ayqx[]{aiocVar.G().c.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.ae(ahbz.p, ahbz.r).h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e), aiocVar.G().l.X(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }), aiocVar.ae(ahbz.q, ahbz.s).h(ahbw.g(aiocVar.aC(), 524288L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxk
            public final /* synthetic */ SubtitlesOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        this.a.l((aheg) obj);
                        return;
                    case 1:
                        this.a.k((ahef) obj);
                        return;
                    case 2:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.a;
                        ahej ahejVar = (ahej) obj;
                        subtitlesOverlayPresenter.d = ahejVar.b();
                        if (ahejVar.a() == 7) {
                            subtitlesOverlayPresenter.p(subtitlesOverlayPresenter.c);
                            return;
                        }
                        return;
                    case 3:
                        this.a.i();
                        return;
                    case 4:
                        this.a.i();
                        return;
                    case 5:
                        this.a.h((ahcx) obj);
                        return;
                    case 6:
                        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.a;
                        ahds ahdsVar = (ahds) obj;
                        subtitlesOverlayPresenter2.d = ahdsVar.d();
                        if (ahdsVar.a() == null || ahdsVar.c() == null) {
                            return;
                        }
                        subtitlesOverlayPresenter2.b.put(ahdsVar.a().y(), ahdsVar.c());
                        return;
                    default:
                        this.a.j((ahdy) obj);
                        return;
                }
            }
        }, ahwx.e)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahdy.class, ahef.class, aheg.class};
        }
        if (i == 0) {
            h((ahcx) obj);
            return null;
        }
        if (i == 1) {
            j((ahdy) obj);
            return null;
        }
        if (i == 2) {
            k((ahef) obj);
            return null;
        }
        if (i == 3) {
            l((aheg) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0265, code lost:
    
        if (r3.longValue() >= r0.l.longValue()) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0277, code lost:
    
        if (r3.longValue() < r0.l.longValue()) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.aheg r15) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter.l(aheg):void");
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        o();
    }

    @Override // defpackage.aiur
    public final void m(float f) {
        this.a.g(f);
    }

    @Override // defpackage.aiur
    public final void n(SubtitlesStyle subtitlesStyle) {
        this.a.i(subtitlesStyle);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    public final void o() {
        aisl aislVar = this.j;
        if (aislVar != null) {
            aislVar.b();
            this.j = null;
        }
        this.f.f(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    public final void p(SubtitleTrack subtitleTrack) {
        FormatStreamModel formatStreamModel;
        Long valueOf;
        g();
        this.c = subtitleTrack;
        ykn yknVar = this.k;
        aisl aislVar = null;
        r1 = null;
        banw banwVar = null;
        aislVar = null;
        if (yknVar != null) {
            yknVar.d();
            this.k = null;
        }
        if (subtitleTrack == null || subtitleTrack.p()) {
            return;
        }
        if (subtitleTrack.a() == aand.DASH_FMP4_TT_WEBVTT.bG || subtitleTrack.a() == aand.DASH_FMP4_TT_FMT3.bG) {
            aisf aisfVar = this.g;
            String str = this.d;
            aixm aixmVar = (aixm) this.b.get(subtitleTrack.i());
            ahxj ahxjVar = new ahxj(this.a);
            PlayerResponseModel playerResponseModel = aisfVar.q;
            if (playerResponseModel != null) {
                VideoStreamingData videoStreamingData = playerResponseModel.c;
                if (videoStreamingData != null) {
                    for (FormatStreamModel formatStreamModel2 : videoStreamingData.n) {
                        if (TextUtils.equals(formatStreamModel2.e, subtitleTrack.f())) {
                            formatStreamModel = formatStreamModel2;
                            break;
                        }
                    }
                }
                formatStreamModel = null;
                if (formatStreamModel != null) {
                    PlayerConfigModel c = aisfVar.q.c();
                    Long T = c.T();
                    if (T != null) {
                        valueOf = c.S();
                    } else {
                        Long valueOf2 = Long.valueOf(formatStreamModel.T());
                        T = valueOf2.longValue() < 0 ? null : valueOf2;
                        valueOf = Long.valueOf(formatStreamModel.S());
                        if (valueOf.longValue() < 0) {
                            valueOf = null;
                        }
                    }
                    Pair pair = new Pair(T, valueOf);
                    PlayerResponseModel playerResponseModel2 = aisfVar.q;
                    aidl aidlVar = (playerResponseModel2 == null || playerResponseModel2.c() == null || !aisfVar.q.c().aj()) ? null : (aidl) aisfVar.i.get();
                    ScheduledExecutorService scheduledExecutorService = aisfVar.f;
                    String str2 = aisfVar.g;
                    ajbl ajblVar = aisfVar.r;
                    if (ajblVar != null && ajblVar.Z().equals(str)) {
                        banwVar = aisfVar.r.ab();
                    }
                    aislVar = new aisl(str, scheduledExecutorService, formatStreamModel, str2, aixmVar, ahxjVar, aidlVar, banwVar, (Long) pair.first, (Long) pair.second);
                }
            }
            this.j = aislVar;
            return;
        }
        this.k = ykn.c(this);
        this.e.a(new aism(subtitleTrack), this.k);
    }
}
