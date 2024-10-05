package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gn {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(Object obj) {
        obj.getClass();
    }

    public static void h(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static Spanned i(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 63) : Html.fromHtml(str);
    }

    public static Object j(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
