package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uce {
    public URL a;
    public String b;
    public Map c;
    public byte[] d;

    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void b(ucd ucdVar, String str) {
        List arrayList = a().containsKey(ucdVar) ? (List) a().get(ucdVar) : new ArrayList(1);
        arrayList.add(str);
        a().put(ucdVar, arrayList);
    }
}
