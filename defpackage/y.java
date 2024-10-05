package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class y extends eq {
    public Map b;
    public Map c;
    private final Map e;
    private static final ResourceBundle d = new f();
    public static final y a = new y();

    private y() {
        super((byte[]) null);
        this.e = new HashMap();
    }

    public final x a(String str) {
        boolean containsKey;
        Object[][] objArr;
        x xVar;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            objArr = null;
            xVar = containsKey ? (x) this.e.get(str) : null;
        }
        if (!containsKey) {
            try {
                Object[][] objArr2 = (Object[][]) d.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object[] objArr3 = objArr2[i];
                    if (str.equals(objArr3[0])) {
                        objArr = (Object[][]) objArr3[1];
                        break;
                    }
                    i++;
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr4 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr4[0]);
                    sb.append(": ");
                    sb.append((String) objArr4[1]);
                }
                xVar = x.b(sb.toString());
            } catch (ParseException | MissingResourceException unused) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    xVar = (x) this.e.get(str);
                } else {
                    this.e.put(str, xVar);
                }
            }
        }
        return xVar;
    }

    public final void b() {
        Map map;
        Map emptyMap;
        Map emptyMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                emptyMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    emptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                emptyMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    emptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                emptyMap = Collections.emptyMap();
                emptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = emptyMap;
                    this.c = emptyMap2;
                }
            }
        }
    }
}
