package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgz {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final Pattern e;
    private static final Pattern f;
    private static final int[] g;

    static {
        a = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        b = Build.DEVICE;
        c = Build.MANUFACTURER;
        d = Build.MODEL;
        e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):?(\\d\\d)))?");
        f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static int a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int b(long j) {
        return (int) j;
    }

    public static int c(String str) {
        int length = str.length();
        opn.i(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static int d(int i) {
        if (i == 8) {
            return 3;
        }
        if (i != 16) {
            return i != 24 ? i != 32 ? 0 : 1073741824 : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        return 2;
    }

    public static int e(long j) {
        return (int) (j >>> 32);
    }

    public static long f(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static long g(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static long h(String str) {
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static long i(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d2 = j;
        double d3 = j2;
        double d4 = j3;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (long) (d2 * (d3 / d4));
    }

    public static pfs j(pfs pfsVar, int i) {
        if (i == 0) {
            return pfsVar;
        }
        long j = pfsVar.e;
        long j2 = j != -1 ? j - i : -1L;
        Uri uri = pfsVar.a;
        long j3 = pfsVar.d + i;
        return new pfs(uri, j3, j3, j2, pfsVar.f, pfsVar.g);
    }

    public static String k(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i < length) {
                sb.append(objArr[i].getClass().getSimpleName());
                if (i < length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public static String l(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(str3);
        sb.append(") ExoPlayerLib/1.5.16");
        return sb.toString();
    }

    public static ExecutorService m(String str) {
        return Executors.newSingleThreadExecutor(new ptr(str, 1, null));
    }

    public static void n(pfq pfqVar) {
        if (pfqVar != null) {
            try {
                pfqVar.c();
            } catch (IOException unused) {
            }
        }
    }

    public static void o(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean q(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || scheme.equals("file");
    }

    public static int r(long[] jArr, long j, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return z ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    public static int s(long[] jArr, long j, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        return z ? Math.max(0, binarySearch) : binarySearch;
    }

    public static int t(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            i2 = g[(i2 >>> 24) ^ (bArr[i3] & PrivateKeyType.INVALID)] ^ (i2 << 8);
        }
        return i2;
    }

    public static byte[] u() {
        byte[] bArr = new byte[38];
        for (int i = 0; i < 38; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static void v(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
            return;
        }
        double d2 = j;
        Double.isNaN(d2);
        double d3 = 1000000.0d / d2;
        while (i < jArr.length) {
            double d4 = jArr[i];
            Double.isNaN(d4);
            jArr[i] = (long) (d4 * d3);
            i++;
        }
    }
}
