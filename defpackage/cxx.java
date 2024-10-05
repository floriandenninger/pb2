package defpackage;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxx {
    public static final cqm a = cqm.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", cpw.c);
    public static final cqm b = cqm.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final cqm c;
    public static final cqm d;
    public static final cxw e;
    private static final Set h;
    private static final Queue i;
    public final ctk f;
    public final List g;
    private final ctm j;
    private final DisplayMetrics k;
    private final cyd l = cyd.a();

    static {
        cxu cxuVar = cxu.a;
        c = cqm.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        d = cqm.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        h = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new cxv();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        i = ddn.i(0);
    }

    public cxx(List list, DisplayMetrics displayMetrics, ctm ctmVar, ctk ctkVar) {
        this.g = list;
        did.ap(displayMetrics);
        this.k = displayMetrics;
        did.ap(ctmVar);
        this.j = ctmVar;
        did.ap(ctkVar);
        this.f = ctkVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap d(defpackage.cyh r12, android.graphics.BitmapFactory.Options r13, defpackage.cxw r14, defpackage.ctm r15) {
        /*
            boolean r0 = r13.inJustDecodeBounds
            if (r0 != 0) goto La
            r14.b()
            r12.d()
        La:
            int r0 = r13.outWidth
            int r1 = r13.outHeight
            java.lang.String r2 = r13.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.cys.a
            r3.lock()
            android.graphics.Bitmap r12 = r12.b(r13)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L22
            java.util.concurrent.locks.Lock r13 = defpackage.cys.a
        L1b:
            r13.unlock()
            return r12
        L1f:
            r12 = move-exception
            goto Le3
        L22:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            android.graphics.Bitmap r5 = r13.inBitmap     // Catch: java.lang.Throwable -> L1f
            r6 = 0
            if (r5 != 0) goto L2c
            r5 = r6
            goto L8f
        L2c:
            int r7 = r5.getAllocationByteCount()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r9 = 14
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r9 = " ("
            r8.append(r9)     // Catch: java.lang.Throwable -> L1f
            r8.append(r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r7 = ")"
            r8.append(r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L1f
            int r8 = r5.getWidth()     // Catch: java.lang.Throwable -> L1f
            int r9 = r5.getHeight()     // Catch: java.lang.Throwable -> L1f
            android.graphics.Bitmap$Config r5 = r5.getConfig()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L1f
            int r10 = r10 + 26
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L1f
            int r11 = r11.length()     // Catch: java.lang.Throwable -> L1f
            int r10 = r10 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r10 = "["
            r11.append(r10)     // Catch: java.lang.Throwable -> L1f
            r11.append(r8)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = "x"
            r11.append(r8)     // Catch: java.lang.Throwable -> L1f
            r11.append(r9)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = "] "
            r11.append(r8)     // Catch: java.lang.Throwable -> L1f
            r11.append(r5)     // Catch: java.lang.Throwable -> L1f
            r11.append(r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L1f
        L8f:
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L1f
            int r7 = r7 + 99
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1f
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L1f
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r7 = "Exception decoding bitmap, outWidth: "
            r8.append(r7)     // Catch: java.lang.Throwable -> L1f
            r8.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = ", outHeight: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L1f
            r8.append(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = ", outMimeType: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L1f
            r8.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = ", inBitmap: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L1f
            r8.append(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1f
            android.graphics.Bitmap r0 = r13.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Le2
            android.graphics.Bitmap r0 = r13.inBitmap     // Catch: java.lang.Throwable -> L1f java.io.IOException -> Le1
            r15.d(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> Le1
            r13.inBitmap = r6     // Catch: java.lang.Throwable -> L1f java.io.IOException -> Le1
            android.graphics.Bitmap r12 = d(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> Le1
            java.util.concurrent.locks.Lock r13 = defpackage.cys.a
            goto L1b
        Le1:
            throw r4     // Catch: java.lang.Throwable -> L1f
        Le2:
            throw r4     // Catch: java.lang.Throwable -> L1f
        Le3:
            java.util.concurrent.locks.Lock r13 = defpackage.cys.a
            r13.unlock()
            goto Lea
        Le9:
            throw r12
        Lea:
            goto Le9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxx.d(cyh, android.graphics.BitmapFactory$Options, cxw, ctm):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (cxx.class) {
            Queue queue = i;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            g(options2);
            return options2;
        }
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(cyh cyhVar, BitmapFactory.Options options, cxw cxwVar, ctm ctmVar) {
        options.inJustDecodeBounds = true;
        d(cyhVar, options, cxwVar, ctmVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028e A[Catch: all -> 0x03db, TryCatch #1 {all -> 0x03db, blocks: (B:26:0x025d, B:28:0x0269, B:29:0x0296, B:37:0x02d8, B:39:0x02de, B:42:0x02e5, B:44:0x02eb, B:45:0x02ed, B:48:0x02f5, B:50:0x02fb, B:52:0x0301, B:54:0x0305, B:56:0x030d, B:57:0x0312, B:58:0x0310, B:59:0x0319, B:61:0x031d, B:62:0x0325, B:64:0x0332, B:67:0x03bf, B:69:0x03c5, B:70:0x0344, B:71:0x0351, B:73:0x0381, B:74:0x0355, B:75:0x0359, B:76:0x0362, B:77:0x0366, B:78:0x036f, B:79:0x0378, B:80:0x037c, B:81:0x03ca, B:86:0x029f, B:88:0x02a5, B:89:0x02af, B:91:0x0271, B:96:0x0277, B:98:0x0281, B:99:0x0286, B:101:0x028e, B:94:0x0292, B:102:0x0284), top: B:25:0x025d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctd a(defpackage.cyh r27, int r28, int r29, defpackage.cqn r30, defpackage.cxw r31) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxx.a(cyh, int, int, cqn, cxw):ctd");
    }
}
