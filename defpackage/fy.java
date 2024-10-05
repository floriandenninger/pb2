package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fy {
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public fy() {
    }

    private static long f(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object g(Object[] objArr, int i, fx fxVar) {
        int i2 = 1 != (i & 1) ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(fxVar.a(obj2) - i2);
            int i4 = abs + abs + (fxVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    public Typeface a(Context context, fb fbVar, Resources resources, int i) {
        fc fcVar = (fc) g(fbVar.a, i, new fw(0));
        if (fcVar == null) {
            return null;
        }
        Typeface c = fq.c(context, resources, fcVar.f, fcVar.a, i);
        long f = f(c);
        if (f != 0) {
            this.h.put(Long.valueOf(f), fbVar);
        }
        return c;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, ajg[] ajgVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (ajgVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(l(ajgVarArr, i).a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface k = k(context, inputStream);
            gl.h(inputStream);
            return k;
        } catch (IOException unused2) {
            gl.h(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            gl.h(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File f = gl.f(context);
        if (f == null) {
            return null;
        }
        try {
            if (gl.j(f, resources, i)) {
                return Typeface.createFromFile(f.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            f.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface k(Context context, InputStream inputStream) {
        File f = gl.f(context);
        if (f == null) {
            return null;
        }
        try {
            if (gl.i(f, inputStream)) {
                return Typeface.createFromFile(f.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            f.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajg l(ajg[] ajgVarArr, int i) {
        return (ajg) g(ajgVarArr, i, new fw(1));
    }

    public fy(byte[] bArr) {
    }
}
