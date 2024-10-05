package defpackage;

import java.util.Deque;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zjk extends DefaultHandler {
    public Object a;
    private final Deque b;
    private final Deque c;
    private final Deque d;
    private final Deque e;
    private final ajun f;

    public zjk(ajun ajunVar, byte[] bArr, byte[] bArr2) {
        this.f = ajunVar;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.offerFirst("");
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.b = new LinkedList();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.f.C((String) this.c.peekFirst()) != null) {
            ((StringBuilder) this.e.peekFirst()).append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        wbs C = this.f.C((String) this.c.pollFirst());
        if (C != null) {
            Attributes attributes = (Attributes) this.d.pollFirst();
            String sb = ((StringBuilder) this.e.pollFirst()).toString();
            Object peekFirst = this.b.peekFirst();
            if (peekFirst == null) {
                peekFirst = this.a;
            }
            this.a = peekFirst;
            C.F(this.b, attributes, sb);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4 = (String) this.c.peekFirst();
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str3).length());
        sb.append(str4);
        sb.append("/");
        sb.append(str3);
        String sb2 = sb.toString();
        this.c.offerFirst(sb2);
        wbs C = this.f.C(sb2);
        if (C != null) {
            this.d.offerFirst(attributes != null ? new AttributesImpl(attributes) : zjl.a);
            this.e.offerFirst(new StringBuilder());
            C.G(this.b, attributes);
        }
    }
}
