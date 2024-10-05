package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class edb {
    public String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedList a = new LinkedList();

    public edb(String str) {
        this.b = str;
        SystemClock.elapsedRealtime();
    }

    public static Map a(String str, Map map, StringBuilder sb, StringBuilder sb2) {
        if (sb.length() <= 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("action", str);
        }
        if (map != null && !map.isEmpty()) {
            linkedHashMap.putAll(map);
        }
        sb.deleteCharAt(sb.length() - 1);
        linkedHashMap.put("it", sb.toString());
        if (sb2.length() <= 0) {
            return linkedHashMap;
        }
        sb2.deleteCharAt(sb2.length() - 1);
        linkedHashMap.put("irt", sb2.toString());
        return linkedHashMap;
    }

    public static final eda e(long j) {
        return new eda(j, null, null);
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.c);
    }

    public final void c(String str, String str2) {
        this.c.put(str, str2);
    }

    public final boolean d(eda edaVar, long j, String... strArr) {
        if (edaVar != null) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new eda(j, strArr[i], edaVar));
            }
            return true;
        }
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
        sb.append("In action: ");
        sb.append(str);
        sb.append(", label item shouldn't be null");
        Log.e("Ticker", sb.toString());
        return false;
    }
}
