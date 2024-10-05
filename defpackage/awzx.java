package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzx {
    private final Map a = new HashMap();

    public final String a(String str) {
        if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final List b(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.US));
        return list == null ? amru.q() : list;
    }

    public final Set c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final void d(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        amkq.E(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        if (!this.a.containsKey(lowerCase)) {
            this.a.put(lowerCase, new ArrayList());
        }
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final void e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        amkq.E(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        this.a.put(lowerCase, new ArrayList());
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, ahaa.f);
        StringBuilder sb = new StringBuilder("{");
        ammr b = ammr.b(", ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(ammr.g(entry.getKey()));
                sb.append((CharSequence) "=");
                sb.append(ammr.g(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) b.b);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(ammr.g(entry2.getKey()));
                    sb.append((CharSequence) "=");
                    sb.append(ammr.g(entry2.getValue()));
                }
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
