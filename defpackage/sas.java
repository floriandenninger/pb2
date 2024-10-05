package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class sas {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[3];
        b = iArr;
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Paint.Align.values().length];
        a = iArr2;
        try {
            iArr2[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Paint.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Paint.Align.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
