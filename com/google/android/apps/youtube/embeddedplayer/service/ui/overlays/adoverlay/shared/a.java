package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void a(int i, int i2, int i3) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pn.writeInt(i3);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void f(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(11, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void g(f fVar) {
        Parcel pn = pn();
        ecr.i(pn, fVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void h(CharSequence charSequence) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void i(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void j(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void k(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void l(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(10, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void m(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void n(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void o(FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        Parcel pn = pn();
        ecr.g(pn, fancyDismissibleDialogRendererWrapper);
        pp(12, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void p(CharSequence charSequence) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        pp(8, pn);
    }
}
