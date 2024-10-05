package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.acsb;
import defpackage.ahvb;
import defpackage.ahxd;
import defpackage.ahxs;
import defpackage.ahyt;
import defpackage.aiew;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.ypa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    public ahvb a;
    public ahxs b;
    public ahyt c;
    public ahxd d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b e;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a h;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d i;
    public volatile boolean j;
    private final Handler k;
    private final ypa l;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f m;

    public e(Handler handler, ypa ypaVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
        this.i = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.g;
        this.k = handler;
        ypaVar.getClass();
        this.l = ypaVar;
        fVar.getClass();
        this.m = fVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void A(final int i) {
        this.k.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e.this;
                int i2 = i;
                eVar.b(aiew.PLAYER_CONTROL);
                eVar.c.x(i2);
                eVar.j = false;
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void B() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 6));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void a() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 1));
    }

    public final void b(aiew aiewVar) {
        if (this.j) {
            this.l.f(aiewVar);
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                i();
                break;
            case 3:
                q();
                break;
            case 4:
                n();
                break;
            case 5:
                m();
                break;
            case 6:
                r(parcel.readLong());
                break;
            case 7:
                g();
                break;
            case 8:
                l();
                break;
            case 9:
                A(parcel.readInt());
                break;
            case 10:
                a();
                break;
            case 11:
                u();
                break;
            case 12:
                f();
                break;
            case 13:
                y(ecr.j(parcel));
                break;
            case 14:
                p();
                break;
            case 15:
                o();
                break;
            case 16:
                z((SubtitleTrack) ecr.a(parcel, SubtitleTrack.CREATOR));
                break;
            case 17:
                k();
                break;
            case 18:
                x();
                break;
            case 19:
                v();
                break;
            case 20:
                w((SubscriptionNotificationMenuItem) ecr.a(parcel, SubscriptionNotificationMenuItem.CREATOR));
                break;
            case 21:
                B();
                break;
            case 22:
                t();
                break;
            case 23:
                s();
                break;
            case 24:
                h();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void f() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 7));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void g() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 8));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void h() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 9));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void i() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 10));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void j() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 11));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void k() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 12));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void l() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 13));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void m() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 14));
        this.m.p(acsb.c(28239));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void n() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 15));
        this.m.p(acsb.c(28240));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void o() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void p() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void q() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void r(final long j) {
        this.k.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e.this;
                long j2 = j;
                eVar.b(aiew.PLAYER_CONTROL);
                eVar.a.r(j2);
                eVar.j = false;
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void s() {
        this.i.t();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void t() {
        this.i.u();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void u() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 4));
        this.m.p(acsb.c(28666));
        this.m.p(acsb.c(23851));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void v() {
        this.k.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 5));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void w(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        this.k.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e.this;
                eVar.g.h(subscriptionNotificationMenuItem);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void x() {
        this.e.i();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void y(final boolean z) {
        this.k.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e.this;
                eVar.a.w(z);
                eVar.j = false;
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void z(final SubtitleTrack subtitleTrack) {
        this.k.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e.this;
                eVar.b.ps(subtitleTrack);
                eVar.j = false;
            }
        });
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }
}
