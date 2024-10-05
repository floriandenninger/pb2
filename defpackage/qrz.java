package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrz {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final roq g;
    public Integer h;

    public qrz(Account account, Set set, Map map, String str, String str2, roq roqVar) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = roqVar == null ? roq.a : roqVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Set set2 = ((aoae) it.next()).b;
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static qrz a(Context context) {
        qoc qocVar = new qoc(context);
        roq roqVar = roq.a;
        if (qocVar.e.containsKey(roo.a)) {
            roqVar = (roq) qocVar.e.get(roo.a);
        }
        return new qrz(null, qocVar.a, qocVar.d, qocVar.b, qocVar.c, roqVar);
    }
}
