package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctx {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
