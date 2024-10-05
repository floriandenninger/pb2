package defpackage;

import android.util.Base64;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpi {
    private final SortedMap a = new TreeMap();

    public final String a() {
        Set<Map.Entry> entrySet = this.a.entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : entrySet) {
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append("/");
        }
        return sb.toString();
    }

    public final void b(String str, long j) {
        this.a.put(str, String.format("%d", Long.valueOf(j)));
    }

    public final void c(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void d(String str, boolean z) {
        this.a.put(str, String.format("%b", Boolean.valueOf(z)));
    }

    public final void e(String str, byte[] bArr) {
        bArr.getClass();
        this.a.put(str, Base64.encodeToString(bArr, 0));
    }
}
