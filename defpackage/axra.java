package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axra implements Iterable {
    private final HashMap b = new HashMap();
    public final ArrayList a = new ArrayList();

    public axra(Map map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.b.put(split[0], split[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.keySet().iterator();
    }
}
