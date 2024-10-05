package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjl {
    public static final Attributes a = new zjj();
    private static final Map b;
    private final SAXParserFactory c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("http://xml.org/sax/features/namespaces", false);
        hashMap.put("http://xml.org/sax/features/namespace-prefixes", true);
        b = Collections.unmodifiableMap(hashMap);
    }

    public zjl(Map map) {
        map.getClass();
        try {
            this.c = SAXParserFactory.newInstance();
            for (Map.Entry entry : map.entrySet()) {
                this.c.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("SAX initilization error", e);
        } catch (SAXNotRecognizedException e2) {
            throw new RuntimeException("SAX initilization error", e2);
        } catch (SAXNotSupportedException e3) {
            throw new RuntimeException("SAX initilization error", e3);
        }
    }

    public static zjl a() {
        return new zjl(b);
    }

    public final Object b(InputStream inputStream, ajun ajunVar) {
        XMLReader xMLReader;
        inputStream.getClass();
        ajunVar.getClass();
        try {
            synchronized (this.c) {
                xMLReader = this.c.newSAXParser().getXMLReader();
            }
            zjk zjkVar = new zjk(ajunVar, null, null);
            xMLReader.setContentHandler(zjkVar);
            xMLReader.parse(new InputSource(inputStream));
            Object obj = zjkVar.a;
            if (obj != null) {
                return obj;
            }
            throw new zjh();
        } catch (ParserConfigurationException e) {
            throw new zji(e);
        } catch (SAXException e2) {
            throw new zji(e2);
        }
    }
}
