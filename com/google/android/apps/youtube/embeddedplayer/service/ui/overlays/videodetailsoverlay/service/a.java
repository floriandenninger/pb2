package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service;

import android.graphics.Bitmap;
import defpackage.ykl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements ykl {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar = this.a.a;
        if (bVar == null) {
            return;
        }
        bVar.n(null);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar = this.a.a;
        if (bVar == null) {
            return;
        }
        bVar.n(bitmap);
    }
}
