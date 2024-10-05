package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhq {
    private static final amnv a = amkq.x(gzp.q);
    private static final NumberFormat b = NumberFormat.getIntegerInstance();

    public static float a(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int b(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long c(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static CharSequence d(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public static String e(Resources resources, long j) {
        if (j >= 1073741824) {
            return resources.getString(R.string.byte_unit_gb);
        }
        if (j >= 1048576) {
            return resources.getString(R.string.byte_unit_mb);
        }
        return resources.getString(R.string.byte_unit_kb);
    }

    public static String f(long j) {
        if (j >= 1073741824) {
            NumberFormat numberFormat = b;
            double d = j;
            Double.isNaN(d);
            return numberFormat.format(Math.min(Math.ceil(d / 1.073741824E9d), 999.0d));
        }
        if (j >= 1048576) {
            NumberFormat numberFormat2 = b;
            double d2 = j;
            Double.isNaN(d2);
            return numberFormat2.format(Math.ceil(d2 / 1048576.0d));
        }
        NumberFormat numberFormat3 = b;
        double d3 = j;
        Double.isNaN(d3);
        return numberFormat3.format(Math.ceil(d3 / 1024.0d));
    }

    public static String g(Resources resources, long j) {
        if (j < 1024) {
            ajm ajmVar = (ajm) a.get();
            StringBuilder sb = new StringBuilder(20);
            sb.append(j);
            return resources.getString(R.string.num_bytes_with_unit, ajmVar.b(sb.toString()), resources.getString(R.string.byte_unit_mb));
        }
        return resources.getString(R.string.num_bytes_with_unit, ((ajm) a.get()).b(new String(String.valueOf(new DecimalFormat("#.##").format(((float) j) / 1024.0f)))), resources.getString(R.string.byte_unit_gb));
    }

    public static String h(String str) {
        return str == null ? "" : str;
    }

    public static String i(long j) {
        return j(j, 3);
    }

    public static String j(long j, int i) {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j < 0 ? "-" : "");
        long abs = Math.abs(j);
        long j2 = abs / 60;
        long j3 = j2 / 60;
        if (j3 > 0) {
            j2 %= 60;
            i = Math.max(i, 5);
        }
        String l = Long.toString(abs % 60);
        if (l.length() == 1) {
            String valueOf = String.valueOf(l);
            l = valueOf.length() != 0 ? "0".concat(valueOf) : new String("0");
        }
        String l2 = Long.toString(j2);
        if (l2.length() == 1 && i > 3) {
            String valueOf2 = String.valueOf(l2);
            l2 = valueOf2.length() != 0 ? "0".concat(valueOf2) : new String("0");
        }
        if (i > 4) {
            sb2.append(j3);
            sb2.append(':');
            sb2.append(l2);
            sb2.append(':');
            sb2.append(l);
            sb = sb2.toString();
        } else {
            sb2.append(l2);
            sb2.append(':');
            sb2.append(l);
            sb = sb2.toString();
        }
        return ((ajm) a.get()).b(sb);
    }

    public static String k(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String l(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static void m(String str) {
        amkq.E(!ammx.e(str));
    }

    public static void n(String str, Object obj) {
        amkq.F(!ammx.e(str), obj);
    }

    public static String o(Resources resources, long j) {
        return ((ajm) a.get()).b(resources.getString(R.string.num_bytes_with_unit, f(j), e(resources, j)));
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 50) {
            return str;
        }
        String valueOf = String.valueOf(str.subSequence(0, 49));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append("…");
        return sb.toString();
    }

    public static List q(String str) {
        ArrayList arrayList = new ArrayList();
        int length = (str.length() / 2048) + 1;
        int i = 0;
        while (i < length) {
            int i2 = i * 2048;
            i++;
            int i3 = i * 2048;
            if (i3 >= str.length()) {
                i3 = str.length();
            }
            arrayList.add(str.substring(i2, i3));
        }
        return arrayList;
    }
}
