package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aolh {
    private static final ammr b = ammr.b("-");
    final aolj a;

    public aolh() {
        this.a = aolk.a();
    }

    public final String a(String str) {
        boolean z;
        int i;
        aolj aoljVar = this.a;
        String str2 = aoljVar.a;
        Map map = aoljVar.b;
        Map map2 = aoljVar.c;
        if (map2.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.entrySet().iterator();
            Iterator it2 = map2.entrySet().iterator();
            Map.Entry entry = it.hasNext() ? (Map.Entry) it.next() : null;
            Map.Entry entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
            boolean z2 = false;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (entry == null && entry2 == null) {
                    break;
                }
                if (entry2 == null) {
                    z = true;
                } else if (entry == null) {
                    z = false;
                } else {
                    int compareTo = ((aolf) entry.getKey()).compareTo((aolf) entry2.getKey());
                    z = compareTo < 0;
                    if (compareTo == 0) {
                        entry = null;
                    }
                }
                if (z) {
                    aolg aolgVar = (aolg) entry.getValue();
                    if (z2) {
                        int i4 = aolgVar.b;
                        if (i4 != i3 + 1) {
                            arrayList.add(str2.substring(i2, i3));
                            i2 = aolgVar.b;
                            i = aolgVar.d;
                        } else {
                            i3 = i4 + aolgVar.d;
                            entry = null;
                            z2 = true;
                        }
                    } else {
                        i2 = aolgVar.b;
                        i = aolgVar.d;
                    }
                    i3 = i + i2;
                    entry = null;
                    z2 = true;
                } else {
                    qqe qqeVar = (qqe) entry2.getValue();
                    if (z2) {
                        arrayList.add(str2.substring(i2, i3));
                    }
                    Object obj = qqeVar.a;
                    entry2 = null;
                    z2 = false;
                }
                if (entry == null && it.hasNext()) {
                    entry = (Map.Entry) it.next();
                }
                if (entry2 == null && it2.hasNext()) {
                    entry2 = (Map.Entry) it2.next();
                }
            }
            if (z2) {
                arrayList.add(str2.substring(i2, i3));
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            String valueOf = String.valueOf(b.d(arrayList));
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        if (str2.isEmpty()) {
            return "";
        }
        String valueOf2 = String.valueOf(str2);
        return valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str);
    }

    public aolh(aolk aolkVar) {
        this.a = new aolj(aolkVar);
    }
}
