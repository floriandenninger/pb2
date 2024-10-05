package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fq {
    public static final aef a;
    private static final fy b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            b = new fv();
        } else if (Build.VERSION.SDK_INT >= 28) {
            b = new fu();
        } else if (Build.VERSION.SDK_INT >= 26) {
            b = new ft();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (fs.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (fs.a != null) {
                    b = new fs();
                }
            }
            b = new fr();
        }
        a = new aef(16);
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, ajg[] ajgVarArr, int i) {
        return b.b(context, cancellationSignal, ajgVarArr, i);
    }

    public static Typeface c(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = b.d(context, resources, i, str, i2);
        if (d != null) {
            a.d(d(resources, i, i2), d);
        }
        return d;
    }

    public static String d(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0.equals(r4) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface e(android.content.Context r6, defpackage.fa r7, android.content.res.Resources r8, int r9, int r10, defpackage.fh r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq.e(android.content.Context, fa, android.content.res.Resources, int, int, fh, boolean):android.graphics.Typeface");
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }
}
