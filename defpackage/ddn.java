package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddn {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private ddn() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        String valueOf = String.valueOf(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf2 = String.valueOf(bitmap.getConfig());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(valueOf);
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(valueOf2);
        throw new IllegalStateException(sb.toString());
    }

    public static int b(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = ddm.a[config.ordinal()];
        int i5 = 4;
        if (i4 == 1) {
            i5 = 1;
        } else if (i4 == 2 || i4 == 3) {
            i5 = 2;
        } else if (i4 == 4) {
            i5 = 8;
        }
        return i3 * i5;
    }

    public static int c(float f) {
        return e(Float.floatToIntBits(f), 17);
    }

    public static int d(int i) {
        return e(i, 17);
    }

    public static int e(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int f(Object obj, int i) {
        return e(obj == null ? 0 : obj.hashCode(), i);
    }

    public static Handler g() {
        if (c == null) {
            synchronized (ddn.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Queue i(int i) {
        return new ArrayDeque(i);
    }

    public static void j() {
        if (!o()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void k(Runnable runnable) {
        g().post(runnable);
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof cvu) {
            return ((cvu) obj).a();
        }
        return obj.equals(obj2);
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean n() {
        return !o();
    }

    public static boolean o() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean p(int i, int i2) {
        return q(i) && q(i2);
    }

    private static boolean q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
