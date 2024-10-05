package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyn implements adtu {
    final /* synthetic */ Map a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ String c;
    final /* synthetic */ acys d;

    public acyn(acys acysVar, Map map, byte[] bArr, String str) {
        this.d = acysVar;
        this.a = map;
        this.b = bArr;
        this.c = str;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        String str = acys.a;
        String valueOf = String.valueOf(this.c);
        zga.f(str, valueOf.length() != 0 ? "Error reading device description from ".concat(valueOf) : new String("Error reading device description from "), iOException);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        acys acysVar = this.d;
        Map map = this.a;
        byte[] bArr = this.b;
        yse yseVar = ysqVar.c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : yseVar.b) {
            if ("Application-URL".equalsIgnoreCase((String) entry.getKey())) {
                arrayList.add((String) entry.getValue());
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        adfy adfyVar = null;
        if (unmodifiableList.size() != 1) {
            zga.c(acys.a, "Expected one Application-URL header. Found 0 or more");
        } else {
            yso ysoVar = ysqVar.d;
            if (ysoVar != null) {
                try {
                    InputStream b = ysoVar.b();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    synchronized (acys.c) {
                        while (true) {
                            int read = b.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                    newInstance.setNamespaceAware(true);
                    NodeList elementsByTagName = newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(byteArray)).getDocumentElement().getElementsByTagName("device");
                    if (elementsByTagName.getLength() == 0) {
                        zga.c(acys.a, "No devices found in device description XML.");
                    } else {
                        Element element = (Element) elementsByTagName.item(0);
                        String g = acys.g(element, "friendlyName");
                        adfx i = adfy.i();
                        i.b(g);
                        i.j = new adgn(acys.g(element, "UDN"));
                        i.d = acys.g(element, "manufacturer");
                        i.e = acys.g(element, "modelName");
                        i.f = acys.g(element, "modelNumber");
                        i.g = (String) map.get("SERVER");
                        i.c(acysVar.n.b());
                        String str = (String) unmodifiableList.get(0);
                        if (str != null) {
                            Uri parse = Uri.parse(str);
                            Uri build = parse.buildUpon().appendPath(acysVar.e).build();
                            i.c = parse;
                            i.b = build;
                        }
                        i.e(3);
                        i.i = acysVar.h();
                        adfyVar = i.a();
                    }
                } catch (Exception e) {
                    zga.f(acys.a, "Error parsing device description response: ", e);
                }
            } else {
                zga.m(acys.a, "no body found in response");
            }
        }
        if (adfyVar != null) {
            this.d.d(this.c, adfyVar, this.a);
        }
    }
}
