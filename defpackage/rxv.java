package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxv {
    private static final String[] a;
    private static final int b;

    static {
        String[] strArr = {"f", "p", "n", "µ", "m", "", "k", "M", "B", "T"};
        a = strArr;
        b = Arrays.asList(strArr).indexOf("");
    }

    @Deprecated
    public static String a(Number number, boolean z) {
        double floor;
        String str;
        if (z) {
            number = Long.valueOf(Math.round(number.doubleValue()));
        }
        if (number.doubleValue() == 0.0d) {
            return "0";
        }
        String str2 = number.doubleValue() >= 0.0d ? "" : "-";
        double abs = Math.abs(number.doubleValue());
        boolean z2 = !z || abs >= 1000.0d;
        if (abs >= 1.0d) {
            floor = Math.floor(Math.log10(abs) / 3.0d);
        } else {
            floor = Math.floor((Math.log10(abs) + 2.0d) / 3.0d);
        }
        int i = b;
        int min = Math.min(9 - i, Math.max(-i, (int) floor));
        double pow = abs / Math.pow(10.0d, min * 3);
        String str3 = a[min + i];
        if (z2) {
            if (pow < 10.0d) {
                str = "%.2f";
            } else if (pow < 100.0d) {
                str = "%.1f";
            }
            String format = String.format(str, Double.valueOf(pow));
            StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(format).length() + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(format);
            sb.append(str3);
            return sb.toString();
        }
        str = "%.0f";
        String format2 = String.format(str, Double.valueOf(pow));
        StringBuilder sb2 = new StringBuilder(str2.length() + String.valueOf(format2).length() + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(format2);
        sb2.append(str3);
        return sb2.toString();
    }
}
