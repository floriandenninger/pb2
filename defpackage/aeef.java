package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeef extends paq {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private String e;
    private long f;
    private long g;
    private List h;

    public aeef(String str) {
        super(str);
    }

    @Override // defpackage.paq
    protected final Pair f(XmlPullParser xmlPullParser, String str, long j) {
        try {
            this.f = t(xmlPullParser, "yt:segmentIngestTime");
        } catch (ParseException unused) {
            this.f = -1L;
        }
        this.h = new ArrayList();
        return super.f(xmlPullParser, str, j);
    }

    @Override // defpackage.paq
    protected final ozv g(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new ozv(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    @Override // defpackage.paq
    protected final pal h(XmlPullParser xmlPullParser, String str, pbb pbbVar) {
        this.a = xmlPullParser.getAttributeValue(null, "yt:audioContentID");
        this.b = xmlPullParser.getAttributeValue(null, "yt:langName");
        this.c = false;
        this.d = xmlPullParser.getAttributeValue(null, "yt:projectionType");
        this.e = xmlPullParser.getAttributeValue(null, "yt:stereoLayout");
        return super.h(xmlPullParser, str, pbbVar);
    }

    @Override // defpackage.paq
    protected final pam i(XmlPullParser xmlPullParser) {
        SparseArray sparseArray = new SparseArray();
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "yt:SystemURL")) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
                if ("widevine".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(4, xmlPullParser.getText());
                } else if ("playready".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(5, xmlPullParser.getText());
                }
            }
        } while (!muf.N(xmlPullParser, "ContentProtection"));
        return new aeed(attributeValue, sparseArray);
    }

    @Override // defpackage.paq
    protected final pay l(XmlPullParser xmlPullParser, pay payVar) {
        this.g = e(xmlPullParser, "presentationTimeOffset", 0L);
        return super.l(xmlPullParser, payVar);
    }

    @Override // defpackage.paq
    protected final List o(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (muf.P(xmlPullParser, "S")) {
                j = e(xmlPullParser, "t", j);
                long j2 = j - this.g;
                long e = e(xmlPullParser, "yt:cuepointTimeOffset", Long.MIN_VALUE);
                aeqo aeqoVar = null;
                if (e != Long.MIN_VALUE) {
                    long e2 = e(xmlPullParser, "yt:cuepointDuration", Long.MIN_VALUE);
                    if (e2 != Long.MIN_VALUE) {
                        aeqoVar = new aeqo(n(xmlPullParser, "yt:cuepointIdentifier", null), n(xmlPullParser, "yt:cuepointEvent", null), j2, e, e2, n(xmlPullParser, "yt:cuepointContext", null));
                    }
                }
                if (aeqoVar != null) {
                    this.h.add(aeqoVar);
                }
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

    @Override // defpackage.paq
    protected final void p(XmlPullParser xmlPullParser) {
        if (muf.P(xmlPullParser, "Role") && "main".equals(xmlPullParser.getAttributeValue(null, "value"))) {
            this.c = true;
        }
    }

    @Override // defpackage.paq
    protected final pal y(int i, List list, List list2) {
        return new aeec(i, list, list2, this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.paq
    protected final par z(long j, List list) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((aeqo) it.next()).f = j;
        }
        return new aeee(j, list, this.f);
    }
}
