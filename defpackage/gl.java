package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.media.AudioAttributesCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gl {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public gl(int i) {
        aqj aqjVar;
        int i2 = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
            aqjVar = new aqk();
        } else {
            aqjVar = new aqj();
        }
        aqjVar.a.setLegacyStreamType(i);
        new AudioAttributesCompat(aqjVar.a());
    }

    public static int A(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int B(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (y(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        if (r12.size() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017b, code lost:
    
        r0 = new defpackage.cja(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0182, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        if (r13 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0196, code lost:
    
        if (r13 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0198, code lost:
    
        r1 = new android.graphics.LinearGradient(r14, r23, r16, r17, r0.b, r0.a, defpackage.ej.i(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e2, code lost:
    
        r2 = new defpackage.ez(r1, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ad, code lost:
    
        r1 = new android.graphics.SweepGradient(r22, r2, r0.b, r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
    
        if (r21 <= 0.0f) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c4, code lost:
    
        r1 = new android.graphics.RadialGradient(r22, r2, r21, r0.b, r0.a, defpackage.ej.i(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ee, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0187, code lost:
    
        r0 = new defpackage.cja(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        r0 = new defpackage.cja(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0181, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022b A[Catch: Exception -> 0x023d, TRY_LEAVE, TryCatch #0 {Exception -> 0x023d, blocks: (B:12:0x0037, B:13:0x003f, B:18:0x004a, B:19:0x0051, B:21:0x0052, B:31:0x007e, B:33:0x0088, B:34:0x00fe, B:36:0x0107, B:41:0x0175, B:43:0x017b, B:50:0x0198, B:51:0x01db, B:62:0x01ad, B:65:0x01c4, B:66:0x01e7, B:67:0x01ee, B:69:0x0187, B:70:0x018d, B:75:0x0117, B:77:0x0123, B:80:0x0137, B:84:0x0153, B:85:0x016d, B:92:0x01ef, B:93:0x020c, B:94:0x020d, B:95:0x022a, B:96:0x022b), top: B:11:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ez C(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl.C(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):ez");
    }

    public static int D(TypedArray typedArray, XmlPullParser xmlPullParser, int i) {
        if (y(xmlPullParser, "interpolator")) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static TypedValue E(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (y(xmlPullParser, "value")) {
            return typedArray.peekValue(0);
        }
        return null;
    }

    public static int F(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    private static void G(ArrayList arrayList, char c2, float[] fArr) {
        arrayList.add(new fp(c2, fArr));
    }

    public static ga a(Resources resources, Bitmap bitmap) {
        return new fz(resources, bitmap);
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                c = null;
            }
        }
        return 0;
    }

    public static Drawable c(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof gb)) ? new gd(drawable) : drawable;
    }

    public static void d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            d(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof gc) {
            d(((gc) drawable).c);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                d(child);
            }
        }
    }

    public static boolean e(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                a = null;
            }
        }
        return false;
    }

    public static File f(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static ByteBuffer g(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean i(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean j(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean i2 = i(file, inputStream);
                h(inputStream);
                return i2;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static Path k(String str) {
        Path path = new Path();
        fp[] m = m(str);
        if (m == null) {
            return null;
        }
        try {
            fp.a(m, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static boolean l(fp[] fpVarArr, fp[] fpVarArr2) {
        if (fpVarArr == null || fpVarArr2 == null || fpVarArr.length != fpVarArr2.length) {
            return false;
        }
        for (int i = 0; i < fpVarArr.length; i++) {
            fp fpVar = fpVarArr[i];
            char c2 = fpVar.a;
            fp fpVar2 = fpVarArr2[i];
            if (c2 != fpVar2.a || fpVar.b.length != fpVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0088. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: NumberFormatException -> 0x00cc, LOOP:3: B:29:0x0076->B:38:0x00a7, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00cc, blocks: (B:26:0x005b, B:28:0x006e, B:29:0x0076, B:31:0x007c, B:35:0x0088, B:38:0x00a7, B:52:0x0092, B:55:0x009a, B:42:0x00ad, B:43:0x00ba, B:48:0x00c0, B:60:0x00c5), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: NumberFormatException -> 0x00cc, TryCatch #0 {NumberFormatException -> 0x00cc, blocks: (B:26:0x005b, B:28:0x006e, B:29:0x0076, B:31:0x007c, B:35:0x0088, B:38:0x00a7, B:52:0x0092, B:55:0x009a, B:42:0x00ad, B:43:0x00ba, B:48:0x00c0, B:60:0x00c5), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0 A[Catch: NumberFormatException -> 0x00cc, TryCatch #0 {NumberFormatException -> 0x00cc, blocks: (B:26:0x005b, B:28:0x006e, B:29:0x0076, B:31:0x007c, B:35:0x0088, B:38:0x00a7, B:52:0x0092, B:55:0x009a, B:42:0x00ad, B:43:0x00ba, B:48:0x00c0, B:60:0x00c5), top: B:25:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fp[] m(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl.m(java.lang.String):fp[]");
    }

    public static fp[] n(fp[] fpVarArr) {
        if (fpVarArr == null) {
            return null;
        }
        fp[] fpVarArr2 = new fp[fpVarArr.length];
        for (int i = 0; i < fpVarArr.length; i++) {
            fpVarArr2[i] = new fp(fpVarArr[i]);
        }
        return fpVarArr2;
    }

    public static float p(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !y(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int q(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int r(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !y(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int s(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray t(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence u(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String v(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (y(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static String w(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean x(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] z(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static float[] o(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int min = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public gl() {
    }
}
