package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psz {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c;
        psy c2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (c2 = c(str2)) == null) {
                    return 0;
                }
                return c2.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            zfl zflVar = (zfl) a.get(i);
            String str2 = zflVar.b;
            if (str.equals(null)) {
                int i2 = zflVar.c;
                return 0;
            }
        }
        return -1;
    }

    static psy c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        pse.c(group);
        String group2 = matcher.group(2);
        try {
            return new psy(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : pts.ah(str)) {
            String e = e(str2);
            if (e != null && j(e)) {
                return e;
            }
        }
        return null;
    }

    public static String e(String str) {
        psy c;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String c2 = amkq.c(str.trim());
        if (c2.startsWith("avc1") || c2.startsWith("avc3")) {
            return "video/avc";
        }
        if (c2.startsWith("hev1") || c2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (c2.startsWith("dvav") || c2.startsWith("dva1") || c2.startsWith("dvhe") || c2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (c2.startsWith("av01")) {
            return "video/av01";
        }
        if (c2.startsWith("vp9") || c2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (c2.startsWith("vp8") || c2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (c2.startsWith("mp4a")) {
            if (c2.startsWith("mp4a.") && (c = c(c2)) != null) {
                str2 = f(c.a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (c2.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (c2.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (c2.startsWith("ac-3") || c2.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (c2.startsWith("ec-3") || c2.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (c2.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (c2.startsWith("ac-4") || c2.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (c2.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (c2.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (c2.startsWith("dtsh") || c2.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (c2.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (c2.startsWith("opus")) {
            return "audio/opus";
        }
        if (c2.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (c2.startsWith("flac")) {
            return "audio/flac";
        }
        if (c2.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (c2.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (c2.contains("cea708")) {
            return "application/cea-708";
        }
        if (c2.contains("eia608") || c2.contains("cea608")) {
            return "application/cea-608";
        }
        int size = a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            zfl zflVar = (zfl) a.get(i);
            String str3 = zflVar.a;
            if (c2.startsWith(null)) {
                String str4 = zflVar.b;
                break;
            }
            i++;
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : pts.ah(str)) {
            String e = e(str2);
            if (e != null && l(e)) {
                return e;
            }
        }
        return null;
    }

    public static String h(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 2;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean i(String str, String str2) {
        char c;
        psy c2;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (c2 = c(str2)) == null || (a2 = c2.a()) == 0 || a2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean j(String str) {
        return "audio".equals(m(str));
    }

    public static boolean k(String str) {
        return "text".equals(m(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(m(str));
    }

    private static String m(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
