package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import defpackage.acrb;
import defpackage.alta;
import defpackage.alve;
import defpackage.alvf;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayro;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.azqi;
import defpackage.azre;
import defpackage.azrh;
import defpackage.oba;
import defpackage.zga;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class av implements com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.h, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a {
    public static final /* synthetic */ int u = 0;
    public List a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c b;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c c;
    public final Handler d;
    public final WeakReference e;
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.a f;
    public com.google.android.apps.youtube.embeddedplayer.service.jar.m g;
    public IEmbedFragmentService h;
    public t i;
    public n n;
    public int p;
    public SimplePlaybackDescriptor q;
    public Bundle r;
    public boolean s;
    private String w;
    private boolean x;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b j = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
    public alvf k = new alve();
    public com.google.android.apps.youtube.embeddedplayer.service.model.f l = com.google.android.apps.youtube.embeddedplayer.service.model.f.a;
    public final azrh m = azrh.aN(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
    public int t = 1;
    public int o = -1;

    static {
        zga.k("YouTubeAndroidPlayerAPI");
    }

    public av(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar) {
        this.e = new WeakReference(context);
        aVar.getClass();
        this.f = aVar;
        this.d = new Handler(context.getMainLooper());
    }

    public static int a(boolean z) {
        return z ? 1 : 0;
    }

    public static ayqj c(ayqj ayqjVar, ayqj ayqjVar2, final com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, final ViewGroup viewGroup, final IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService) {
        return ayqj.Q(ayqjVar.I(ayqr.a()), ayqjVar2.I(ayqr.a()), new ayro() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ae
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar2 = com.google.android.apps.youtube.embeddedplayer.service.jar.a.this;
                ViewGroup viewGroup2 = viewGroup;
                Context context = (Context) obj;
                com.google.android.apps.youtube.embeddedplayer.service.jar.m mVar = (com.google.android.apps.youtube.embeddedplayer.service.jar.m) obj2;
                av avVar = new av(context, aVar2);
                avVar.g = mVar;
                avVar.g.l(avVar);
                avVar.n = new n();
                avVar.c = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c(avVar.f, context);
                avVar.i = new s(avVar);
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = avVar.c;
                azrh azrhVar = avVar.m;
                if (cVar.c != null) {
                    alta.C("Attempting to inflate view multiple times.", new Object[0]);
                } else {
                    Context context2 = cVar.b;
                    context2.getClass();
                    cVar.c = new FrameLayout(context2);
                    cVar.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    cVar.c.setBackgroundColor(-16777216);
                    cVar.e = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h.a(cVar.c, cVar.a, new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b());
                    cVar.f = new com.google.android.apps.youtube.embeddedplayer.service.jar.q(cVar.e);
                    Context context3 = cVar.b;
                    if (context3 != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.f fVar = cVar.h;
                        final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i iVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i(context3, avVar, cVar.f);
                        LayoutInflater.from(iVar.b).inflate(R.layout.embed_preview, iVar);
                        iVar.c = iVar.findViewById(R.id.top_bar_background);
                        iVar.d = (TextView) iVar.findViewById(R.id.embed_title);
                        iVar.e = (TextView) iVar.findViewById(R.id.embed_subtitle);
                        iVar.f = (FrameLayout) iVar.findViewById(R.id.embed_preview_video_details_holder);
                        iVar.g = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d.a(iVar.b, iVar.f);
                        iVar.g.e = iVar;
                        iVar.h = (WatchLaterButton) iVar.findViewById(R.id.embed_preview_watch_later_button);
                        iVar.h.setOnClickListener(iVar);
                        iVar.h.b = iVar;
                        iVar.i = (YouTubeButton) iVar.findViewById(R.id.embed_preview_share_button);
                        iVar.i.setOnClickListener(iVar);
                        iVar.j = (ImageView) iVar.findViewById(R.id.embed_preview_thumbnail);
                        iVar.k = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.n((TouchImageView) iVar.findViewById(R.id.embed_preview_play_button));
                        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.n nVar = iVar.k;
                        nVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                i iVar2 = i.this;
                                h hVar = iVar2.l;
                                Context context4 = iVar2.getContext();
                                av avVar2 = (av) hVar;
                                if (avVar2.n() || avVar2.q == null) {
                                    return;
                                }
                                com.google.android.apps.youtube.embeddedplayer.service.jar.p a = avVar2.c.f.a();
                                if (a.a()) {
                                    try {
                                        com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d dVar = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
                                        dVar.j(SetOperationType.START, System.currentTimeMillis());
                                        dVar.g(Tick.REMOTE_RECEIVES_REQUEST, System.currentTimeMillis());
                                    } catch (RemoteException e) {
                                        oba.B(e);
                                    }
                                    IEmbedFragmentService iEmbedFragmentService = avVar2.h;
                                    if (iEmbedFragmentService != null) {
                                        try {
                                            iEmbedFragmentService.e(acrb.PLAYER_LARGE_PLAY_BUTTON.Jk);
                                        } catch (RemoteException unused) {
                                        }
                                    }
                                    com.google.android.apps.youtube.embeddedplayer.service.jar.m mVar2 = avVar2.g;
                                    if (mVar2 != null) {
                                        mVar2.p(avVar2, avVar2.q, avVar2.l, true);
                                        return;
                                    }
                                    return;
                                }
                                c cVar2 = avVar2.c;
                                alta.C("Ignoring play command - playback policies violated", new Object[0]);
                                cVar2.e.c();
                                int i = a.e;
                                if (i != 0) {
                                    Toast.makeText(context4, i, 0).show();
                                }
                            }
                        });
                        fVar.b = iVar;
                        fVar.b.d(fVar.c);
                        fVar.b.f(fVar.d);
                        fVar.b.c(fVar.e);
                        fVar.B(avVar);
                        fVar.t(avVar);
                        fVar.v(avVar);
                        fVar.D(avVar);
                        fVar.e(fVar.f);
                    }
                    Optional a = cVar.h.a();
                    if (a.isPresent()) {
                        ((View) a.get()).setVisibility(4);
                        ViewGroup viewGroup3 = cVar.c;
                        if (viewGroup3 != null) {
                            viewGroup3.addView((View) a.get());
                            viewGroup2.addView(cVar.c);
                        }
                    }
                    cVar.g = azrhVar.B().ab(ayqr.a()).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.a
                        @Override // defpackage.ayrs
                        public final void a(Object obj3) {
                            c.this.h.c((com.google.android.apps.youtube.embeddedplayer.service.model.d) obj3);
                        }
                    });
                }
                avVar.b = oba.F(context, avVar.d, mVar, viewGroup2);
                avVar.a = Collections.synchronizedList(new ArrayList());
                return avVar;
            }
        }).I(azre.a()).G(new ayrv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.an
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService2 = IEmbedFragmentServiceFactoryService.this;
                av avVar = (av) obj;
                int i = av.u;
                try {
                    t tVar = avVar.i;
                    tVar.getClass();
                    avVar.h = iEmbedFragmentServiceFactoryService2.a(tVar, avVar.f.a());
                    avVar.o = avVar.h.a();
                    IEmbedFragmentService iEmbedFragmentService = avVar.h;
                    avVar.j = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.d(iEmbedFragmentService.d(), avVar.o);
                    avVar.d.post(new ap(avVar, 0));
                    if (iEmbedFragmentService != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().b(iEmbedFragmentService.b());
                    }
                    return avVar;
                } catch (RemoteException e) {
                    throw azqi.b(e);
                }
            }
        }).m();
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        if (this.q != null) {
            bundle.putBoolean("has_simple_start_descriptor", true);
            SimplePlaybackDescriptor simplePlaybackDescriptor = this.q;
            bundle.putInt("spd_descriptor_type", simplePlaybackDescriptor.a);
            bundle.putString("spd_video_id", simplePlaybackDescriptor.b);
            bundle.putString("spd_playlist_id", simplePlaybackDescriptor.c);
            bundle.putStringArrayList("spd_video_ids_list", simplePlaybackDescriptor.d);
            bundle.putInt("spd_start_index", simplePlaybackDescriptor.f);
            bundle.putInt("spd_start_millis", simplePlaybackDescriptor.g);
        }
        Bundle f = !n() ? this.g.f(this) : null;
        if (f == null) {
            f = this.r;
        }
        if (f != null) {
            bundle.putBundle("saved_coordinator_state", f);
        }
        return bundle;
    }

    public final String d(String str) {
        try {
            return this.k.a(str);
        } catch (RemoteException unused) {
            alta.B("Cannot get embed config, client disconnected.", new Object[0]);
            return "";
        }
    }

    public final void e() {
        if (n() || this.p != 8 || this.x) {
            return;
        }
        Bundle bundle = this.r;
        if (bundle != null) {
            this.g.q(this, bundle);
            this.x = true;
            return;
        }
        SimplePlaybackDescriptor simplePlaybackDescriptor = this.q;
        if (simplePlaybackDescriptor == null || simplePlaybackDescriptor.e == 0) {
            return;
        }
        this.g.p(this, simplePlaybackDescriptor, this.l, false);
        this.x = true;
    }

    public final void f() {
        com.google.android.apps.youtube.embeddedplayer.service.jar.m mVar = this.g;
        if (mVar != null) {
            mVar.i(this);
            this.g.j(this.w);
            this.g = null;
        }
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().c();
        try {
            IEmbedFragmentService iEmbedFragmentService = this.h;
            if (iEmbedFragmentService != null) {
                iEmbedFragmentService.i();
            }
        } catch (RemoteException unused) {
        }
        this.n = null;
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = this.c;
        cVar.c = null;
        cVar.b = null;
        cVar.g.qc();
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.f fVar = cVar.h;
        fVar.b();
        fVar.b = com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e.a;
        cVar.e.f();
        this.i = null;
        this.h = null;
        this.j = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.o = -1;
        this.k = new alve();
        System.gc();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        IEmbedFragmentService iEmbedFragmentService = this.h;
        if (iEmbedFragmentService != null) {
            try {
                iEmbedFragmentService.g();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        IEmbedFragmentService iEmbedFragmentService = this.h;
        if (iEmbedFragmentService != null) {
            try {
                iEmbedFragmentService.h(subscriptionNotificationMenuItem);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b
    public final void i() {
        IEmbedFragmentService iEmbedFragmentService = this.h;
        if (iEmbedFragmentService != null) {
            try {
                iEmbedFragmentService.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        IEmbedFragmentService iEmbedFragmentService = this.h;
        if (iEmbedFragmentService != null) {
            try {
                iEmbedFragmentService.j();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void k(final int i, final int i2) {
        this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ar
            @Override // java.lang.Runnable
            public final void run() {
                av avVar = av.this;
                try {
                    avVar.k.h(i, i2);
                } catch (RemoteException unused) {
                    alta.B("Problem sending ad event to client.", new Object[0]);
                }
            }
        });
    }

    public final void l(SimplePlaybackDescriptor simplePlaybackDescriptor) {
        if (n()) {
            return;
        }
        m();
        this.t = 1;
        this.a.clear();
        this.q = simplePlaybackDescriptor;
        String str = simplePlaybackDescriptor.b;
        if (!n() && str != null && !str.equals(this.w)) {
            this.g.j(this.w);
            this.w = str;
            this.g.n(str, this);
        }
        this.r = null;
        this.x = false;
        e();
        try {
            IEmbedFragmentService iEmbedFragmentService = this.h;
            if (iEmbedFragmentService != null) {
                iEmbedFragmentService.r(simplePlaybackDescriptor);
            }
        } catch (RemoteException unused) {
        }
    }

    public final void m() {
        if (n()) {
            return;
        }
        this.g.o(this);
    }

    public final boolean n() {
        return this.g == null;
    }
}
