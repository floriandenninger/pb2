package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.ykl;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class h implements ykl {
    final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Couldn't retrieve thumbnail from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zga.d(sb.toString(), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.a.p((Bitmap) obj2);
    }
}
