package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.alta;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DisconnectedApiPlayerService extends IApiPlayerService.Stub {
    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void A(EmbedsPrewarmData embedsPrewarmData) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void B(boolean z) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void D(CommandWrapper commandWrapper) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void E(int i) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void F(int i) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void G(boolean z) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void H(boolean z) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void I(boolean z) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void J() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void K(String str) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void L() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void M() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void N() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean O() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean P(byte[] bArr) {
        alta.C("PlayerService was disconnected", new Object[0]);
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] Q() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new byte[0];
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] R() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new byte[0];
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final d a() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new a();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final c b() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new b() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService.2
            @Override // com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c
            public final void a(RemoteEmbedExceptionData remoteEmbedExceptionData) {
            }
        };
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.a();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        alta.C("PlayerService was disconnected", new Object[0]);
        return new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.b() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService.1
            @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c
            public final void a(SelectableItemKey selectableItemKey) {
            }
        };
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void f() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void g() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void h(String str, int i, int i2, int i3) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void i(String str, int i, int i2) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void j(List list, int i, int i2, int i3) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void k(boolean z) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void l(String str) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void m() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void n() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void o(String str, int i, int i2, boolean z, int i3) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void p(String str, boolean z, int i, boolean z2, int i2) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void q(List list, int i, int i2, boolean z, int i3) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void r() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void s(VisibilityChangeEventData visibilityChangeEventData) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void t(byte[] bArr) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void u(int i, KeyEvent keyEvent) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void v(int i, KeyEvent keyEvent) {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void w() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void x() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void y() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void z() {
        alta.C("PlayerService was disconnected", new Object[0]);
    }
}
