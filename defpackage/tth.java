package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tth {
    public final tow a;
    public final trf b;
    public final vcw c;
    public final tss d;
    public final Context e;
    public final tme f;
    public final ammv g;
    public final Executor h;
    public final tko i;

    public tth(Context context, tow towVar, trf trfVar, vcw vcwVar, tss tssVar, tme tmeVar, ammv ammvVar, Executor executor, tko tkoVar) {
        this.e = context;
        this.a = towVar;
        this.b = trfVar;
        this.c = vcwVar;
        this.d = tssVar;
        this.f = tmeVar;
        this.g = ammvVar;
        this.h = executor;
        this.i = tkoVar;
    }

    public static final String a(tld tldVar) {
        return tldVar.c + "|" + tldVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
