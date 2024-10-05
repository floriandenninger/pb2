package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xrv implements aab {
    final /* synthetic */ xrw a;

    public xrv(xrw xrwVar) {
        this.a = xrwVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        xrw xrwVar = this.a;
        if (xrwVar.a) {
            return;
        }
        xrwVar.a = true;
        Object lM = xrwVar.lM();
        ImageGalleryActivity imageGalleryActivity = (ImageGalleryActivity) xrwVar;
        eed eedVar = (eed) lM;
        imageGalleryActivity.b = (xun) eedVar.a.a.bJ.get();
        imageGalleryActivity.c = (xtb) eedVar.a.a.bL.get();
    }
}
