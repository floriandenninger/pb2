package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ozv {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public ozv(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        opn.h(str);
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = i3;
        this.h = i4;
        this.c = i5;
        this.j = str3;
        this.i = str4;
    }

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":", 2);
        try {
            if (split.length == 0) {
                return -1;
            }
            return Integer.parseInt(split[0]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String b(int i, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String valueOf = String.valueOf(i);
        if (isEmpty) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public static String c(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split(":", 2);
        return split.length < 2 ? "" : split[1];
    }

    public static ozv d(FormatStreamModel formatStreamModel) {
        String str = formatStreamModel.e;
        String t = formatStreamModel.t();
        int i = formatStreamModel.i();
        int d = formatStreamModel.d();
        int c = formatStreamModel.c();
        int i2 = formatStreamModel.f;
        formatStreamModel.q();
        formatStreamModel.E();
        return new ozv(str, t, i, d, c, -1, -1, i2, null, aaov.a(t));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((ozv) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
