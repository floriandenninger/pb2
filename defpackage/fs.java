package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fs extends fy {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }

    private static Typeface f(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object g() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.fy
    public final Typeface a(Context context, fb fbVar, Resources resources, int i) {
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        Object g = g();
        if (g == null) {
            return null;
        }
        for (fc fcVar : fbVar.a) {
            int i2 = fcVar.f;
            File f = gl.f(context);
            if (f != null) {
                try {
                    if (gl.j(f, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(f);
                        } catch (IOException unused) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !h(g, mappedByteBuffer, fcVar.e, fcVar.b, fcVar.c)) {
                                return null;
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused2) {
                            }
                            throw th;
                            break;
                        }
                    }
                } finally {
                    f.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return f(g);
    }

    @Override // defpackage.fy
    public final Typeface b(Context context, CancellationSignal cancellationSignal, ajg[] ajgVarArr, int i) {
        Object g = g();
        if (g == null) {
            return null;
        }
        aeg aegVar = new aeg();
        for (ajg ajgVar : ajgVarArr) {
            Uri uri = ajgVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) aegVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = gl.g(context, cancellationSignal, uri);
                aegVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !h(g, byteBuffer, ajgVar.b, ajgVar.c, ajgVar.d)) {
                return null;
            }
        }
        Typeface f = f(g);
        if (f == null) {
            return null;
        }
        return Typeface.create(f, i);
    }
}
