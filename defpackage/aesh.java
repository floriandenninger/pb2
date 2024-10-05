package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesh {
    public final String a;
    private final Map b;

    public aesh(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static Map e(pth pthVar) {
        HashMap hashMap = new HashMap();
        String s = pthVar.s();
        while (!TextUtils.isEmpty(s)) {
            String[] split = s.split(": ");
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
            s = pthVar.s();
        }
        return hashMap;
    }

    public final Double a(String str) {
        try {
            if (this.b.containsKey(str)) {
                return Double.valueOf(Double.parseDouble((String) this.b.get(str)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Integer b(String str) {
        try {
            if (this.b.containsKey(str)) {
                return Integer.valueOf((String) this.b.get(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Long c(String str) {
        try {
            if (this.b.containsKey(str)) {
                return Long.valueOf((String) this.b.get(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final String d(String str) {
        return (String) this.b.get(str);
    }

    public final String toString() {
        String str = this.a;
        int size = this.b.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("EmbeddedMetadata(scheme='");
        sb.append(str);
        sb.append("', numKeys=");
        sb.append(size);
        sb.append(")");
        return sb.toString();
    }
}
