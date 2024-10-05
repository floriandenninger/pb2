package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.alvn;
import defpackage.ecr;
import defpackage.ykl;
import defpackage.zga;
import defpackage.zhq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements ykl {
    final /* synthetic */ e a;
    private final String b;

    public c(e eVar, String str) {
        this.a = eVar;
        zhq.n(str, "videoId cannot be null or empty");
        this.b = str;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.d("Error loading DefaultThumbnailLoader", exc);
        this.a.c();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        e eVar = this.a;
        g gVar = eVar.d;
        String str = this.b;
        boolean e = eVar.e();
        boolean d = this.a.d();
        alvn alvnVar = gVar.a;
        if (alvnVar != null) {
            try {
                Parcel pn = alvnVar.pn();
                ecr.g(pn, bitmap);
                pn.writeString(str);
                ecr.e(pn, e);
                ecr.e(pn, d);
                alvnVar.pp(1, pn);
            } catch (RemoteException unused) {
            }
        }
    }
}
