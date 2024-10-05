package defpackage;

import android.util.Log;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjv {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static par a(String str) {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!prh.o(newPullParser, "x:xmpmeta")) {
                throw pnr.a("Couldn't find xmp metadata", null);
            }
            amru q = amru.q();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (prh.o(newPullParser, "rdf:Description")) {
                    String[] strArr = a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String m = prh.m(newPullParser, strArr[i2]);
                        if (m != null) {
                            if (Integer.parseInt(m) != 1) {
                                return null;
                            }
                            String[] strArr2 = b;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                String m2 = prh.m(newPullParser, strArr2[i3]);
                                if (m2 != null) {
                                    j = Long.parseLong(m2);
                                    if (j == -1) {
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            j = -9223372036854775807L;
                            String[] strArr3 = c;
                            while (true) {
                                if (i < 2) {
                                    String m3 = prh.m(newPullParser, strArr3[i]);
                                    if (m3 != null) {
                                        q = amru.s(new bjr("image/jpeg", 0L, 0L), new bjr("video/mp4", Long.parseLong(m3), 0L));
                                        break;
                                    }
                                    i++;
                                } else {
                                    q = amru.q();
                                    break;
                                }
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (prh.o(newPullParser, "Container:Directory")) {
                    q = b(newPullParser, "Container", "Item");
                } else if (prh.o(newPullParser, "GContainer:Directory")) {
                    q = b(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!prh.n(newPullParser, "x:xmpmeta"));
            if (q.isEmpty()) {
                return null;
            }
            return new par(j2, q, null);
        } catch (NumberFormatException | XmlPullParserException | pnr unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static amru b(XmlPullParser xmlPullParser, String str, String str2) {
        amrp f = amru.f();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (prh.o(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m = prh.m(xmlPullParser, concat3);
                String m2 = prh.m(xmlPullParser, concat4);
                String m3 = prh.m(xmlPullParser, concat5);
                String m4 = prh.m(xmlPullParser, concat6);
                if (m != null && m2 != null) {
                    f.h(new bjr(m, m3 != null ? Long.parseLong(m3) : 0L, m4 != null ? Long.parseLong(m4) : 0L));
                } else {
                    return amru.q();
                }
            }
        } while (!prh.n(xmlPullParser, concat2));
        return f.g();
    }
}
