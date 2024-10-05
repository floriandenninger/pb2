package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prd {
    public final String a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public prd(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static int a(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                String valueOf = String.valueOf(str);
                Log.w("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
                return -1;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            prh.k("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
