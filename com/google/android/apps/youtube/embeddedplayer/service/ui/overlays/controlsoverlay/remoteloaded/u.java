package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.ahvb;
import defpackage.ahxd;
import defpackage.ahxs;
import defpackage.ahyt;
import defpackage.aupb;
import defpackage.avzr;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class u implements ahvb, ahxs, ahyt, ahxd, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f a;

    public u(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.ahxd
    public final void a() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.g();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahxd
    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.l();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void c() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void d() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.f();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void e() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.i();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void f() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.j();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.v();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.w(subscriptionNotificationMenuItem);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b
    public final void i() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.x();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.B();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void k() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.k();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void l() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.m();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void m() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.n();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void n() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.o();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void o() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.p();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void p(long j) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g
    public final void pr() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.h();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahxs
    public final void ps(SubtitleTrack subtitleTrack) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.z(subtitleTrack);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void q() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.q();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void r(long j) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.r(j);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void s(long j, aupb aupbVar) {
        r(j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void t() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.s();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void u() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.t();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void v() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.u();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvb
    public final void w(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.y(z);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahyt
    public final void x(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.A(i);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahyt
    public final void y(avzr avzrVar) {
    }
}
