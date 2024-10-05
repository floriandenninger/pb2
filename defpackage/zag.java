package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zag {
    public static final zac a = new zac();
    private static final Handler b = new Handler(Looper.getMainLooper());

    public static void a(ImageView imageView) {
        imageView.setTag(R.id.bitmap_loader_tag, null);
    }

    public static void b(zaf zafVar, Uri uri, ImageView imageView, zae zaeVar) {
        c(zafVar, a, new zad(imageView.getContext()), uri, imageView, zaeVar);
    }

    public static void c(zaf zafVar, zaa zaaVar, zab zabVar, Uri uri, ImageView imageView, zae zaeVar) {
        zafVar.getClass();
        imageView.getClass();
        if (zaaVar != null) {
            zaaVar.a(imageView);
        }
        if (zaeVar != null) {
            zaeVar.e(imageView);
        }
        zafVar.a(uri, ykt.c(b, new yzz(imageView, zabVar, zaeVar)));
    }
}
