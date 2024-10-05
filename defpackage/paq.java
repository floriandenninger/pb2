package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class paq extends DefaultHandler implements pgg {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private final String b;
    private final XmlPullParserFactory c;

    public paq(String str) {
        this.b = str;
        try {
            this.c = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    protected static final pba A(XmlPullParser xmlPullParser, pba pbaVar) {
        long j;
        long j2;
        long e = e(xmlPullParser, "timescale", pbaVar != null ? pbaVar.g : 1L);
        long e2 = e(xmlPullParser, "presentationTimeOffset", pbaVar != null ? pbaVar.h : 0L);
        long j3 = pbaVar != null ? pbaVar.a : 0L;
        long j4 = pbaVar != null ? pbaVar.b : -1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - parseLong) + 1;
            j = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        pas pasVar = pbaVar != null ? pbaVar.f : null;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "Initialization")) {
                pasVar = x(xmlPullParser);
            }
        } while (!muf.N(xmlPullParser, "SegmentBase"));
        return new pba(pasVar, e, e2, j, j2);
    }

    private static int B(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        opn.k(i == i2);
        return i;
    }

    protected static float a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    protected static int b(XmlPullParser xmlPullParser, String str) {
        return c(xmlPullParser, str, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int c(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : pgz.h(attributeValue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long e(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static String m(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return muf.M(str, xmlPullParser.getText());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String n(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final paz q(long j, long j2) {
        return new paz(j, j2);
    }

    protected static final int r(XmlPullParser xmlPullParser) {
        int b = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(n(xmlPullParser, "schemeIdUri", null)) ? b(xmlPullParser, "value") : -1;
        do {
            xmlPullParser.next();
        } while (!muf.N(xmlPullParser, "AudioChannelConfiguration"));
        return b;
    }

    protected static final int s(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 0;
        }
        return !"text".equals(attributeValue) ? -1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long t(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1L;
        }
        Matcher matcher = pgz.e.matcher(attributeValue);
        int i = 0;
        if (!matcher.matches()) {
            throw new ParseException(attributeValue.length() != 0 ? "Invalid date/time format: ".concat(attributeValue) : new String("Invalid date/time format: "), 0);
        }
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (matcher.group(11).equals("-")) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf.length() != 0 ? "0.".concat(valueOf) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long u(XmlPullParser xmlPullParser) {
        return e(xmlPullParser, "d", -1L);
    }

    protected static final pas v(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new pas(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new pas(attributeValue, j, j2);
    }

    protected static final pbc w(XmlPullParser xmlPullParser, String str, pbc pbcVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return pbcVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i2]);
                String valueOf2 = String.valueOf(attributeValue.substring(i));
                strArr[i2] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                i = attributeValue.length();
            } else if (indexOf != i) {
                String valueOf3 = String.valueOf(strArr[i2]);
                String valueOf4 = String.valueOf(attributeValue.substring(i, indexOf));
                strArr[i2] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i3);
                String substring = attributeValue.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d")) {
                            str2 = String.valueOf(str2).concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    if (substring.equals("Number")) {
                        iArr[i2] = 2;
                    } else if (substring.equals("Bandwidth")) {
                        iArr[i2] = 3;
                    } else if (substring.equals("Time")) {
                        iArr[i2] = 4;
                    } else {
                        throw new IllegalArgumentException(attributeValue.length() != 0 ? "Invalid template: ".concat(attributeValue) : new String("Invalid template: "));
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return new pbc(strArr, iArr, strArr2, i2);
    }

    protected static final pas x(XmlPullParser xmlPullParser) {
        return v(xmlPullParser, "sourceURL", "range");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Pair f(XmlPullParser xmlPullParser, String str, long j) {
        xmlPullParser.getAttributeValue(null, "id");
        long d = d(xmlPullParser, "start", j);
        long d2 = d(xmlPullParser, "duration", -1L);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        pbb pbbVar = null;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m(xmlPullParser, str);
                    z = true;
                }
            } else if (muf.P(xmlPullParser, "AdaptationSet")) {
                arrayList.add(h(xmlPullParser, str, pbbVar));
            } else if (muf.P(xmlPullParser, "SegmentBase")) {
                pbbVar = A(xmlPullParser, null);
            } else if (muf.P(xmlPullParser, "SegmentList")) {
                pbbVar = k(xmlPullParser, null);
            } else if (muf.P(xmlPullParser, "SegmentTemplate")) {
                pbbVar = l(xmlPullParser, null);
            }
        } while (!muf.N(xmlPullParser, "Period"));
        return Pair.create(z(d, arrayList), Long.valueOf(d2));
    }

    protected ozv g(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new ozv(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02e1, code lost:
    
        if ("wvtt".equals(r0) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x039b A[LOOP:0: B:2:0x0059->B:9:0x039b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pal h(org.xmlpull.v1.XmlPullParser r59, java.lang.String r60, defpackage.pbb r61) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.paq.h(org.xmlpull.v1.XmlPullParser, java.lang.String, pbb):pal");
    }

    protected pam i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        pbe pbeVar = null;
        UUID uuid = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                pbeVar = new pbe("video/mp4", Base64.decode(xmlPullParser.getText(), 0));
                uuid = opn.q(pbeVar.b);
                z = true;
            }
        } while (!muf.N(xmlPullParser, "ContentProtection"));
        if (!z || uuid != null) {
            return new pam(attributeValue, uuid, pbeVar);
        }
        Log.w("MPDParser", "Skipped unsupported ContentProtection element");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014f A[Catch: ParseException -> 0x0179, XmlPullParserException -> 0x0180, TryCatch #2 {ParseException -> 0x0179, XmlPullParserException -> 0x0180, blocks: (B:3:0x0004, B:5:0x0017, B:7:0x0021, B:9:0x003d, B:11:0x0047, B:13:0x0051, B:14:0x0059, B:18:0x0072, B:21:0x007f, B:22:0x012c, B:31:0x0149, B:33:0x014f, B:36:0x0162, B:37:0x0169, B:40:0x0140, B:41:0x0147, B:45:0x0097, B:47:0x009f, B:49:0x00b3, B:51:0x00be, B:52:0x00c8, B:55:0x00d2, B:60:0x00ed, B:61:0x0109, B:62:0x010a, B:65:0x0124, B:66:0x011e, B:71:0x0171, B:72:0x0178), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162 A[Catch: ParseException -> 0x0179, XmlPullParserException -> 0x0180, TryCatch #2 {ParseException -> 0x0179, XmlPullParserException -> 0x0180, blocks: (B:3:0x0004, B:5:0x0017, B:7:0x0021, B:9:0x003d, B:11:0x0047, B:13:0x0051, B:14:0x0059, B:18:0x0072, B:21:0x007f, B:22:0x012c, B:31:0x0149, B:33:0x014f, B:36:0x0162, B:37:0x0169, B:40:0x0140, B:41:0x0147, B:45:0x0097, B:47:0x009f, B:49:0x00b3, B:51:0x00be, B:52:0x00c8, B:55:0x00d2, B:60:0x00ed, B:61:0x0109, B:62:0x010a, B:65:0x0124, B:66:0x011e, B:71:0x0171, B:72:0x0178), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pao j(java.lang.String r29, java.io.InputStream r30) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.paq.j(java.lang.String, java.io.InputStream):pao");
    }

    protected final pax k(XmlPullParser xmlPullParser, pax paxVar) {
        long e = e(xmlPullParser, "timescale", paxVar != null ? paxVar.g : 1L);
        long e2 = e(xmlPullParser, "presentationTimeOffset", paxVar != null ? paxVar.h : 0L);
        long e3 = e(xmlPullParser, "duration", paxVar != null ? paxVar.b : -1L);
        int c = c(xmlPullParser, "startNumber", paxVar != null ? paxVar.a : 1);
        List list = null;
        List list2 = null;
        pas pasVar = null;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "Initialization")) {
                pasVar = x(xmlPullParser);
            } else if (muf.P(xmlPullParser, "SegmentTimeline")) {
                list = o(xmlPullParser);
            } else if (muf.P(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(v(xmlPullParser, "media", "mediaRange"));
            }
        } while (!muf.N(xmlPullParser, "SegmentList"));
        if (paxVar != null) {
            if (pasVar == null) {
                pasVar = paxVar.f;
            }
            if (list == null) {
                list = paxVar.c;
            }
            if (list2 == null) {
                list2 = paxVar.d;
            }
        }
        return new pax(pasVar, e, e2, c, e3, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pay l(XmlPullParser xmlPullParser, pay payVar) {
        long e = e(xmlPullParser, "timescale", payVar != null ? payVar.g : 1L);
        long e2 = e(xmlPullParser, "presentationTimeOffset", payVar != null ? payVar.h : 0L);
        long e3 = e(xmlPullParser, "duration", payVar != null ? payVar.b : -1L);
        int c = c(xmlPullParser, "startNumber", payVar != null ? payVar.a : 1);
        List list = null;
        pbc w = w(xmlPullParser, "media", payVar != null ? payVar.e : null);
        pbc w2 = w(xmlPullParser, "initialization", payVar != null ? payVar.d : null);
        pas pasVar = null;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "Initialization")) {
                pasVar = x(xmlPullParser);
            } else if (muf.P(xmlPullParser, "SegmentTimeline")) {
                list = o(xmlPullParser);
            }
        } while (!muf.N(xmlPullParser, "SegmentTemplate"));
        if (payVar != null) {
            if (pasVar == null) {
                pasVar = payVar.f;
            }
            if (list == null) {
                list = payVar.c;
            }
        }
        return new pay(pasVar, e, e2, c, e3, list, w2, w);
    }

    protected List o(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "S")) {
                j = e(xmlPullParser, "t", j);
                long u = u(xmlPullParser);
                int c = c(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < c; i++) {
                    arrayList.add(q(j, u));
                    j += u;
                }
            }
        } while (!muf.N(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    protected void p(XmlPullParser xmlPullParser) {
    }

    protected pal y(int i, List list, List list2) {
        return new pal(i, list, list2);
    }

    protected par z(long j, List list) {
        return new par(j, list);
    }
}
