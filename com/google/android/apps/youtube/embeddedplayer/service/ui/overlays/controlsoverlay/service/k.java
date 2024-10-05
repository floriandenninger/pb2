package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.ahbx;
import defpackage.ahvb;
import defpackage.ahvc;
import defpackage.ahxd;
import defpackage.ahxe;
import defpackage.ahxs;
import defpackage.ahxt;
import defpackage.ahyt;
import defpackage.ahyu;
import defpackage.atyq;
import defpackage.ypa;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k implements ahvc, ahxt, ahyu, ahxe, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c a;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b;

    public k(Handler handler, ypa ypaVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar) {
        this.a = cVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e(handler, ypaVar, fVar);
        this.b = eVar;
        try {
            cVar.j(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.b.e = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.F(videoDetails);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.b.h = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.H(watchLaterButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.q(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.o(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = this.b;
        ahvbVar.getClass();
        eVar.a = ahvbVar;
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.v(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.w(subtitleTrack);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.y(controlsOverlayStyle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        this.b.b = ahxsVar;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.C(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(controlsState);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.t(charSequence.toString());
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.x(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.p(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nf() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.l(str, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void ns() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.G(videoQualityArr, i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar == null) {
            return true;
        }
        try {
            cVar.L(i, keyEvent);
            return true;
        } catch (RemoteException unused) {
            return true;
        }
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar == null) {
            return true;
        }
        try {
            cVar.M(i, keyEvent);
            return true;
        } catch (RemoteException unused) {
            return true;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.u(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void pA() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.I();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void pB() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.K();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pt(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.r(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.b.d = ahxdVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pv(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
    public final void pw(com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d dVar) {
        this.b.i = dVar;
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.D(map);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.E(j, j2, j3, j4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.b.c = ahytVar;
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.J(list);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.n(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.s(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.b.f = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.z(subscribeButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.b.g = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.A(subscriptionNotificationButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.B(subscriptionNotificationMenuData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void y() {
        ahbx.c(this);
    }

    @Override // defpackage.ahvc
    public final void z(atyq atyqVar, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.m(new PlayerErrorMessageRendererWrapper(atyqVar), z);
            } catch (RemoteException unused) {
            }
        }
    }
}
