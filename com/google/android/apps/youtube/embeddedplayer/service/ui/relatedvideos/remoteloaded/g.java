package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import defpackage.ykl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class g implements ykl {
    final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        BitmapKey bitmapKey = (BitmapKey) obj;
        if (bitmapKey == null || !bitmapKey.equals(this.a.t)) {
            return;
        }
        this.a.x.setImageBitmap(null);
        this.a.A = 3;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        BitmapKey bitmapKey = (BitmapKey) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmapKey == null || !bitmapKey.equals(this.a.t)) {
            return;
        }
        this.a.x.setImageBitmap(bitmap);
        this.a.A = 3;
    }
}
