package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gm {
    public static ImageHeaderParser$ImageType A(List list, cqh cqhVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = cqhVar.a((cpz) list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static Bitmap a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    public static MediaDescription c(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static Uri d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static Bundle e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static CharSequence f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static CharSequence g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static String i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void r(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (yv.a != null && yv.a.c == view) {
            yv.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (yv.b != null && yv.b.c == view) {
                yv.b.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new yv(view, charSequence);
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }

    public static boolean t(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean u(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean v(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int w(List list, InputStream inputStream, ctk ctkVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cym(inputStream, ctkVar);
        }
        inputStream.mark(5242880);
        return x(list, new cqe(inputStream, ctkVar));
    }

    public static int x(List list, cqg cqgVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = cqgVar.a((cpz) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType y(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return A(list, new cqb(byteBuffer));
    }

    public static ImageHeaderParser$ImageType z(List list, InputStream inputStream, ctk ctkVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cym(inputStream, ctkVar);
        }
        inputStream.mark(5242880);
        return A(list, new cqa(inputStream));
    }
}
