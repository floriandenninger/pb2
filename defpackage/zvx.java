package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvx implements aab {
    final /* synthetic */ zvy a;

    public zvx(zvy zvyVar) {
        this.a = zvyVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        zvy zvyVar = this.a;
        if (zvyVar.p) {
            return;
        }
        zvyVar.p = true;
        Object lM = zvyVar.lM();
        GalleryActivity galleryActivity = (GalleryActivity) zvyVar;
        eed eedVar = (eed) lM;
        galleryActivity.b = (aaea) eedVar.a.K.get();
        galleryActivity.m = (aadw) eedVar.a.D.get();
        galleryActivity.c = eedVar.iA();
        galleryActivity.d = (ypa) eedVar.a.B.get();
        galleryActivity.e = (akvf) eedVar.a.mN.get();
        galleryActivity.f = eedVar.a.gD();
        galleryActivity.o = (akwg) eedVar.a.mB.get();
        galleryActivity.g = (Handler) eedVar.a.an.get();
        galleryActivity.h = (anib) eedVar.a.f.get();
        galleryActivity.n = new akap();
    }
}
