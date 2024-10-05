package com.google.android.youtube.api.jar.client;

import android.content.Intent;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.p;
import defpackage.alta;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class h extends p {
    final /* synthetic */ RemoteEmbeddedPlayer a;

    public h(RemoteEmbeddedPlayer remoteEmbeddedPlayer) {
        this.a = remoteEmbeddedPlayer;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final String a(String str) {
        alta.B("Embed config is not supported in RemoteEmbeddedPlayer.", new Object[0]);
        return "";
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void f() {
        this.a.T();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void g(boolean z, long j) {
        this.a.h.post(new f(this, j, 1));
        this.a.U(z);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void h() {
        this.a.h.post(new e(this, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void i() {
        this.a.h.post(new e(this, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x00b7. Please report as an issue. */
    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void j(String str) {
        char c;
        int i = 7;
        try {
            switch (str.hashCode()) {
                case -2142596576:
                    if (str.equals("PLAYER_VIEW_TOO_SMALL")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1949945212:
                    if (str.equals("EMBEDDING_DISABLED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1731984950:
                    if (str.equals("PLAYER_VIEW_NOT_VISIBLE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -879828873:
                    if (str.equals("NETWORK_ERROR")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -585411087:
                    if (str.equals("USER_DECLINED_HIGH_BANDWIDTH")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -513113115:
                    if (str.equals("UNAUTHORIZED_OVERLAY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -485608986:
                    if (str.equals("INTERNAL_ERROR")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 75858354:
                    if (str.equals("USER_DECLINED_RESTRICTED_CONTENT")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 383333018:
                    if (str.equals("NOT_PLAYABLE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1045580280:
                    if (str.equals("BLOCKED_FOR_APP")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1479939124:
                    if (str.equals("UNEXPECTED_SERVICE_DISCONNECTION")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1635406296:
                    if (str.equals("AUTOPLAY_DISABLED")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1918408868:
                    if (str.equals("EMPTY_PLAYLIST")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        switch (c) {
            case 0:
                i = 1;
                this.a.az(i);
                return;
            case 1:
                i = 2;
                this.a.az(i);
                return;
            case 2:
                i = 3;
                this.a.az(i);
                return;
            case 3:
                i = 4;
                this.a.az(i);
                return;
            case 4:
                i = 5;
                this.a.az(i);
                return;
            case 5:
                i = 6;
                this.a.az(i);
                return;
            case 6:
                this.a.az(i);
                return;
            case 7:
                i = 8;
                this.a.az(i);
                return;
            case '\b':
                i = 9;
                this.a.az(i);
                return;
            case '\t':
                i = 10;
                this.a.az(i);
                return;
            case '\n':
                i = 11;
                this.a.az(i);
                return;
            case 11:
                i = 12;
                this.a.az(i);
                return;
            case '\f':
                i = 13;
                this.a.az(i);
                return;
            case '\r':
                i = 14;
                this.a.az(i);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void k(final boolean z) {
        this.a.h.post(new Runnable() { // from class: com.google.android.youtube.api.jar.client.d
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.a.O(z);
            }
        });
        this.a.V(z);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void l(String str, final String str2, final long j, final long j2, final boolean z, final boolean z2, int i) {
        this.a.h.post(new Runnable() { // from class: com.google.android.youtube.api.jar.client.c
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                String str3 = str2;
                boolean z3 = z;
                boolean z4 = z2;
                long j3 = j;
                long j4 = j2;
                hVar.a.aA(str3);
                RemoteEmbeddedPlayer remoteEmbeddedPlayer = hVar.a;
                remoteEmbeddedPlayer.c = z3;
                remoteEmbeddedPlayer.b = z4;
                remoteEmbeddedPlayer.f = j3;
                remoteEmbeddedPlayer.g = j4;
            }
        });
        this.a.W(str);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void m() {
        this.a.h.post(new e(this, 2));
        this.a.X();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void n() {
        this.a.Y();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void o(long j) {
        this.a.h.post(new f(this, j, 0));
        this.a.Z();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void p(long j, long j2) {
        this.a.h.post(new g(this, j, j2, 0));
        this.a.aa();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void q() {
        this.a.h.post(new e(this, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void r() {
        this.a.ab();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void s() {
        this.a.ac();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void t(long j, long j2) {
        this.a.h.post(new g(this, j, j2, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void u(long j) {
        this.a.h.post(new f(this, j, 2));
        this.a.ad(j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void v() {
        this.a.h.post(new e(this, 4));
        this.a.ae();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void w() {
        this.a.af();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void x() {
        this.a.h.post(new e(this, 5));
        this.a.ag();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void y(String str) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void z(Intent intent) {
        this.a.D.startActivity(intent);
    }
}
