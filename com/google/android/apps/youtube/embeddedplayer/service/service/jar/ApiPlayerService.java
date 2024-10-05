package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.model.IpcCompatiblePlaybackState;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import defpackage.aci;
import defpackage.aeu;
import defpackage.afsi;
import defpackage.aian;
import defpackage.aiao;
import defpackage.aiap;
import defpackage.aifz;
import defpackage.aigh;
import defpackage.aixh;
import defpackage.alta;
import defpackage.alux;
import defpackage.anaf;
import defpackage.anfq;
import defpackage.anfz;
import defpackage.anht;
import defpackage.anhv;
import defpackage.anhy;
import defpackage.aoae;
import defpackage.aorz;
import defpackage.aosa;
import defpackage.apxf;
import defpackage.aqrs;
import defpackage.aqrt;
import defpackage.aqvu;
import defpackage.azrw;
import defpackage.oba;
import defpackage.osv;
import defpackage.otb;
import defpackage.oto;
import defpackage.otp;
import defpackage.ouu;
import defpackage.rql;
import defpackage.ynl;
import defpackage.ynm;
import defpackage.zbw;
import defpackage.zfi;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiPlayerService extends IApiPlayerService.Stub implements IBinder.DeathRecipient, ouu {
    public final otp a;
    private final Handler b;
    private final ApiPlayerListener c;
    private final b d;
    private final d e;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.d f;
    private final a g;
    private final k h;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service.a i;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service.a j;
    private final f k;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service.a l;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service.b m;
    private final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a n;
    private final c o;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a p;
    private final g q;
    private final com.google.android.apps.youtube.embeddedplayer.service.csi.service.b r;
    private final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a s;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d t;
    private final ApiPlayerEmbedConfigProvider u;
    private q v;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b w;
    private final aoae x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ApiPlayerEmbedConfigProvider implements alux {
        public q a;

        public ApiPlayerEmbedConfigProvider(q qVar) {
            this.a = qVar;
        }

        @Override // defpackage.alux
        public final String a(String str) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    return qVar.a(str);
                } catch (RemoteException unused) {
                }
            }
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ApiPlayerListener implements oto {
        public q a;

        public ApiPlayerListener(q qVar) {
            this.a = qVar;
        }

        @Override // defpackage.oto
        public final void a() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.f();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void b(boolean z, long j) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.g(z, j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void c() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.h();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void d() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.i();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void e(boolean z) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.k(z);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void f(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.l(str, str2, j, j2, z, z2, i);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void g() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.m();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void h() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.n();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void i(long j) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.o(j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void j(long j, long j2) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.p(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void k() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.q();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void l() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.r();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void m() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.s();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void n(long j, long j2) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.t(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void o(long j) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.u(j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void p() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.v();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void q() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.w();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void r() {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.x();
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void s(String str) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.y(str);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void t(Intent intent) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.z(intent);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // defpackage.oto
        public final void u(int i) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.j(alta.D(i));
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public ApiPlayerService(Context context, Handler handler, aoae aoaeVar, osv osvVar, q qVar, final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar, l lVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9, com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar4, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        context.getClass();
        handler.getClass();
        this.b = handler;
        aoaeVar.getClass();
        this.x = aoaeVar;
        osvVar.getClass();
        this.v = qVar;
        if (!z) {
            fVar.getClass();
        } else {
            lVar.getClass();
        }
        this.f = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.d(handler, cVar3);
        this.g = new a(handler, cVar4);
        otb otbVar = (otb) osvVar;
        final k kVar = new k(handler, otbVar.f.k(), cVar5, osvVar.c());
        this.h = kVar;
        try {
            cVar.f(new e(handler, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.pA();
                }
            }));
        } catch (RemoteException unused) {
        }
        this.i = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service.a(cVar6);
        this.j = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service.a(cVar7);
        this.k = new f(cVar8);
        this.l = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service.a(cVar9);
        this.m = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service.b(handler, fVar4);
        if (!z) {
            this.e = null;
            fVar.getClass();
            b bVar = new b(fVar);
            if (bVar.b != null) {
                bVar.c = new h(handler, bVar);
                try {
                    bVar.b.j(bVar.c);
                } catch (RemoteException unused2) {
                }
            }
            this.d = bVar;
            this.n = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.c(bVar, cVar2);
        } else {
            this.d = null;
            lVar.getClass();
            d dVar = new d(handler, lVar);
            this.e = dVar;
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(cVar2);
            dVar.a.a = eVar;
            this.n = eVar;
        }
        ApiPlayerListener apiPlayerListener = new ApiPlayerListener(qVar);
        this.c = apiPlayerListener;
        rql rqlVar = new rql();
        this.o = new c(ak.a, handler, rqlVar, fVar2, null);
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.service.a(cVar10);
        this.p = aVar;
        this.w = com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b.d(fVar3, osvVar.b(), osvVar.f());
        com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar2 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d();
        this.t = dVar2;
        this.q = osvVar.d();
        this.r = new com.google.android.apps.youtube.embeddedplayer.service.csi.service.b(osvVar.a());
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a d = otbVar.f.d();
        this.s = d;
        d.a = otbVar.c.a;
        i iVar = new i(this.f, handler, osvVar.f());
        ApiPlayerEmbedConfigProvider apiPlayerEmbedConfigProvider = new ApiPlayerEmbedConfigProvider(qVar);
        this.u = apiPlayerEmbedConfigProvider;
        zfi zfiVar = new zfi() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda1
            @Override // defpackage.zfi
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c cVar11 = com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c.this;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    try {
                        cVar11.a(bool.booleanValue());
                    } catch (RemoteException unused3) {
                    }
                }
            }
        };
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a aVar2 = this.n;
        a aVar3 = this.g;
        k kVar2 = this.h;
        this.a = otp.M(context, apiPlayerListener, osvVar, aVar2, iVar, aVar3, kVar2, kVar2, kVar2, kVar2, kVar2, kVar2, kVar2, rqlVar, dVar2, kVar2, kVar2, kVar2, this.i, this.j, this.k, this.l, aVar, zfiVar, apiPlayerEmbedConfigProvider, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda0
            @Override // com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a
            public final void a(aqvu aqvuVar) {
                try {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c.this.o(new FancyDismissibleDialogRendererWrapper(aqvuVar));
                } catch (RemoteException unused3) {
                }
            }
        }, this.m);
        aoaeVar.B(this);
        try {
            qVar.asBinder().linkToDeath(this, 0);
        } catch (RemoteException unused3) {
            binderDied();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void A(final EmbedsPrewarmData embedsPrewarmData) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                EmbedsPrewarmData embedsPrewarmData2 = embedsPrewarmData;
                otp otpVar = apiPlayerService.a;
                final com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.c cVar = otpVar.T;
                alux aluxVar = otpVar.b;
                String str = ((otb) otpVar.a).c.a;
                aqrt D = oba.D(cVar.g);
                final int i = 1;
                final int i2 = 0;
                boolean z = D != null && D.g;
                if (cVar.h.b.contains(str) && z) {
                    int a = embedsPrewarmData2.a();
                    aifz e = oba.w(embedsPrewarmData2.b(), 0L).e();
                    boolean z2 = a != 2;
                    e.d = z2;
                    e.f = z2;
                    final PlaybackStartDescriptor a2 = e.a();
                    aqrs E = oba.E(cVar.k);
                    if (E != null && E.b) {
                        ynm.i(cVar.f.a(), new ynl() { // from class: com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj) {
                                c.this.d.b = ((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a;
                            }
                        });
                    }
                    cVar.d.a = aluxVar.a(embedsPrewarmData2.b());
                    cVar.c.b(a2.h(cVar.e), embedsPrewarmData2.a() == 1);
                    aqrt D2 = oba.D(cVar.g);
                    long millis = (D2 == null || (D2.b & 65536) == 0) ? com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.c.a.toMillis() : D2.h;
                    aiao aiaoVar = new aiao();
                    aiaoVar.a = Long.valueOf(millis);
                    aiaoVar.b = false;
                    aigh aighVar = com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.c.b;
                    if (aighVar != null) {
                        aiaoVar.c = aighVar;
                        Long l = aiaoVar.a;
                        if (l == null || aiaoVar.b == null || aiaoVar.c == null) {
                            StringBuilder sb = new StringBuilder();
                            if (aiaoVar.a == null) {
                                sb.append(" mediaDurationMs");
                            }
                            if (aiaoVar.b == null) {
                                sb.append(" enableAutoMediaDuration");
                            }
                            if (aiaoVar.c == null) {
                                sb.append(" prefetchPlaybackContextWrapper");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        final aiap aiapVar = new aiap(l.longValue(), aiaoVar.b.booleanValue(), aiaoVar.c);
                        final aian aianVar = cVar.j;
                        if (aianVar.b.h()) {
                            aci.c(new aeu() { // from class: aiam
                                @Override // defpackage.aeu
                                public final Object a(aes aesVar) {
                                    if (i == 0) {
                                        aian aianVar2 = aianVar;
                                        PlaybackStartDescriptor playbackStartDescriptor = a2;
                                        aiap aiapVar2 = aiapVar;
                                        Executor executor = aianVar2.a;
                                        akpq akpqVar = aianVar2.d;
                                        aiaf aiafVar = (aiaf) akpqVar.a.get();
                                        aiafVar.getClass();
                                        executor.execute(new ahzk(aiafVar, (ajoy) akpqVar.b.get(), aesVar, playbackStartDescriptor, aiapVar2, null, null));
                                        return "PrefetchPrebufferManagerImpl.doPrefetch operation";
                                    }
                                    aian aianVar3 = aianVar;
                                    PlaybackStartDescriptor playbackStartDescriptor2 = a2;
                                    aiap aiapVar3 = aiapVar;
                                    Executor executor2 = aianVar3.a;
                                    aiaf aiafVar2 = (aiaf) aianVar3.c.a.get();
                                    aiafVar2.getClass();
                                    executor2.execute(new ahzo(aiafVar2, aesVar, playbackStartDescriptor2, aiapVar3));
                                    return "PrefetchPrebufferManagerImpl.doOnesiePrefetchPrebuffer operation";
                                }
                            });
                            return;
                        } else {
                            aci.c(new aeu() { // from class: aiam
                                @Override // defpackage.aeu
                                public final Object a(aes aesVar) {
                                    if (i2 == 0) {
                                        aian aianVar2 = aianVar;
                                        PlaybackStartDescriptor playbackStartDescriptor = a2;
                                        aiap aiapVar2 = aiapVar;
                                        Executor executor = aianVar2.a;
                                        akpq akpqVar = aianVar2.d;
                                        aiaf aiafVar = (aiaf) akpqVar.a.get();
                                        aiafVar.getClass();
                                        executor.execute(new ahzk(aiafVar, (ajoy) akpqVar.b.get(), aesVar, playbackStartDescriptor, aiapVar2, null, null));
                                        return "PrefetchPrebufferManagerImpl.doPrefetch operation";
                                    }
                                    aian aianVar3 = aianVar;
                                    PlaybackStartDescriptor playbackStartDescriptor2 = a2;
                                    aiap aiapVar3 = aiapVar;
                                    Executor executor2 = aianVar3.a;
                                    aiaf aiafVar2 = (aiaf) aianVar3.c.a.get();
                                    aiafVar2.getClass();
                                    executor2.execute(new ahzo(aiafVar2, aesVar, playbackStartDescriptor2, aiapVar3));
                                    return "PrefetchPrebufferManagerImpl.doOnesiePrefetchPrebuffer operation";
                                }
                            });
                            return;
                        }
                    }
                    throw new NullPointerException("Null prefetchPlaybackContextWrapper");
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void B(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.C(z);
            }
        });
    }

    public final void C(boolean z) {
        this.a.x(z);
        this.p.b();
        this.w.c();
        this.x.C(this);
        this.o.b();
        q qVar = this.v;
        if (qVar != null) {
            qVar.asBinder().unlinkToDeath(this, 0);
            this.v = null;
        }
        this.c.a = null;
        this.u.a = null;
        b bVar = this.d;
        if (bVar != null) {
            Surface surface = bVar.d;
            if (surface != null) {
                surface.release();
                bVar.d = null;
                bVar.a();
            }
            bVar.b = null;
        }
        this.h.a = null;
        this.f.a = null;
        this.g.a = null;
        this.i.a = null;
        this.j.a = null;
        this.k.a = null;
        this.l.a = null;
        this.m.a = null;
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.a aVar = this.n;
        aVar.D();
        aVar.a = null;
        System.gc();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void D(CommandWrapper commandWrapper) {
        this.a.y((apxf) commandWrapper.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void E(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.z(i);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void F(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.A(i);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void G(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.B(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void H(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.C(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void I(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.D(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void J() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.E();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void K(final String str) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                anhy anhyVar;
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                final String str2 = str;
                final otp otpVar = apiPlayerService.a;
                com.google.android.apps.youtube.embeddedplayer.service.permissions.c cVar = otpVar.Y;
                final com.google.android.apps.youtube.embeddedplayer.service.permissions.a aVar = com.google.android.apps.youtube.embeddedplayer.service.permissions.a.a;
                aqrs E = oba.E(cVar.c);
                if (E == null || !E.d) {
                    anhyVar = anhv.a;
                } else {
                    anhyVar = anfq.i(anht.q(cVar.a.a()), new anfz() { // from class: com.google.android.apps.youtube.embeddedplayer.service.permissions.b
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            a aVar2 = a.this;
                            aorz aorzVar = ((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).b;
                            a aVar3 = a.a;
                            if (aVar2.ordinal() != 0) {
                                throw new AssertionError("Incorrect permission requested");
                            }
                            aosa aosaVar = aorzVar.b;
                            if (aosaVar == null || !aosaVar.b) {
                                return anaf.N(new AccessControlException(aVar2.b));
                            }
                            return anhv.a;
                        }
                    }, cVar.b);
                }
                ynm.i(anhyVar, new ynl() { // from class: otj
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        otp otpVar2 = otp.this;
                        otpVar2.a.g(str2, new aftk(1));
                    }
                });
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void L() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda10
            /* JADX WARN: Type inference failed for: r0v6, types: [wiz, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                azrw azrwVar;
                otb otbVar = (otb) ApiPlayerService.this.a.a;
                if (!otbVar.e || (azrwVar = otbVar.g) == null) {
                    throw new AccessControlException("Permission denied: unauthorized usage of SignOut API");
                }
                azrwVar.get().l("Third-party signOut invocation.", true);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void M() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.F();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void N() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.F();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean O() {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ConditionVariable conditionVariable2 = conditionVariable;
                atomicBoolean2.set(apiPlayerService.a.J());
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        return atomicBoolean.get();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean P(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
        try {
            inflaterOutputStream.write(bArr, 0, bArr.length);
            inflaterOutputStream.flush();
            inflaterOutputStream.close();
        } catch (IOException unused) {
            afsi.b(2, 4, "IOException when decompressing.");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        inflater.end();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        if (obtain.readInt() != 1) {
            obtain.recycle();
            afsi.b(2, 4, "Incorrect state format.");
            return false;
        }
        try {
            try {
                final PlaybackServiceState playbackServiceState = (PlaybackServiceState) obtain.readParcelable(PlaybackServiceState.class.getClassLoader());
                obtain.recycle();
                final ConditionVariable conditionVariable = new ConditionVariable();
                this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApiPlayerService apiPlayerService = ApiPlayerService.this;
                        PlaybackServiceState playbackServiceState2 = playbackServiceState;
                        ConditionVariable conditionVariable2 = conditionVariable;
                        apiPlayerService.a.t(playbackServiceState2);
                        conditionVariable2.open();
                    }
                });
                conditionVariable.block();
                return true;
            } catch (BadParcelableException unused2) {
                afsi.b(2, 4, "Cannot read state.");
                obtain.recycle();
                return false;
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] Q() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                PlaybackStartDescriptor playbackStartDescriptor;
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicReference atomicReference2 = atomicReference;
                ConditionVariable conditionVariable2 = conditionVariable;
                otp otpVar = apiPlayerService.a;
                PlaybackServiceState c = otpVar.c();
                int hashCode = c.hashCode();
                otpVar.h.a = c;
                Optional empty = Optional.empty();
                PlaybackStartDescriptor playbackStartDescriptor2 = otpVar.e;
                if (playbackStartDescriptor2 != null) {
                    empty = Optional.of(playbackStartDescriptor2.h(otpVar.U));
                    playbackStartDescriptor = otpVar.e.e().a();
                    aixh n = otpVar.i.n();
                    if (n != null) {
                        playbackStartDescriptor.q(n.b());
                    }
                } else {
                    playbackStartDescriptor = null;
                }
                boolean z = true;
                if (!otpVar.I(empty) && otpVar.g != 2) {
                    z = false;
                }
                atomicReference2.set(new IpcCompatiblePlaybackState(hashCode, playbackStartDescriptor, z));
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] R() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                AtomicReference atomicReference2 = atomicReference;
                ConditionVariable conditionVariable2 = conditionVariable;
                atomicReference2.set(apiPlayerService.a.c());
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        int length = marshall.length;
        if (length > 419430) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Saved state excessive: ");
            sb.append(length);
            afsi.b(1, 4, sb.toString());
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(marshall);
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
        } catch (IOException unused) {
            afsi.b(2, 4, "Problem during compression.");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length >= 419430) {
            afsi.b(2, 4, "Compression above threshold.");
        }
        return byteArray;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d a() {
        return this.r;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c b() {
        return this.s;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        B(true);
    }

    @Override // defpackage.ouu
    public final void c() {
        C(true);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        return this.q;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        return this.t;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void f() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.d();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void g() {
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                ConditionVariable conditionVariable2 = conditionVariable;
                apiPlayerService.a.F();
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void h(final String str, final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.e(str, i, i2, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void i(final String str, final int i, final int i2) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.g(str, i, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void j(final List list, final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.h(list, i, i2, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void k(final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.i(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void l(String str) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void m() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.q();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void n() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.j();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void o(final String str, final int i, final int i2, final boolean z, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.n(str, i, i2, z, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void p(final String str, final boolean z, final int i, final boolean z2, final int i2) {
        this.r.g(Tick.MAIN_APP_RECEIVES_REQUEST, System.currentTimeMillis());
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.o(str, z, i, z2, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void q(final List list, final int i, final int i2, final boolean z, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.p(list, i, i2, z, i3);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void r() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.r();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void s(final VisibilityChangeEventData visibilityChangeEventData) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.s(visibilityChangeEventData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void t(byte[] bArr) {
        final IpcCompatiblePlaybackState ipcCompatiblePlaybackState;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            try {
                ipcCompatiblePlaybackState = (IpcCompatiblePlaybackState) obtain.readParcelable(IpcCompatiblePlaybackState.class.getClassLoader());
            } catch (BadParcelableException unused) {
                afsi.b(2, 4, "Cannot read IPC-compatible player state.");
                obtain.recycle();
                ipcCompatiblePlaybackState = null;
            }
            if (ipcCompatiblePlaybackState == null) {
                return;
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    ApiPlayerService apiPlayerService = ApiPlayerService.this;
                    IpcCompatiblePlaybackState ipcCompatiblePlaybackState2 = ipcCompatiblePlaybackState;
                    ConditionVariable conditionVariable2 = conditionVariable;
                    otp otpVar = apiPlayerService.a;
                    ApiPlayerStateCache apiPlayerStateCache = otpVar.h;
                    int i = ipcCompatiblePlaybackState2.b;
                    PlaybackServiceState playbackServiceState = apiPlayerStateCache.a;
                    PlaybackServiceState playbackServiceState2 = null;
                    if (playbackServiceState != null && i == playbackServiceState.hashCode()) {
                        playbackServiceState2 = apiPlayerStateCache.a;
                    }
                    if (playbackServiceState2 != null) {
                        otpVar.t(playbackServiceState2);
                    } else {
                        PlaybackStartDescriptor playbackStartDescriptor = ipcCompatiblePlaybackState2.c;
                        if (playbackStartDescriptor != null) {
                            otpVar.l(playbackStartDescriptor, ipcCompatiblePlaybackState2.a, otpVar.f);
                        }
                    }
                    conditionVariable2.open();
                }
            });
            conditionVariable.block();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void u(final int i, final KeyEvent keyEvent) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.K(i, keyEvent);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void v(final int i, final KeyEvent keyEvent) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService apiPlayerService = ApiPlayerService.this;
                apiPlayerService.a.L(i, keyEvent);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void w() {
        zbw zbwVar = this.a.f253J;
        if (zbwVar != null) {
            zbwVar.b();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void x() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.u();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void y() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.v();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void z() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerService.this.a.w();
            }
        });
    }
}
