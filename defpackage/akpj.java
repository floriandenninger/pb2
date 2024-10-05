package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpj implements akpf {
    private final Map a = new HashMap();

    @Override // defpackage.akpf
    public final anhy a(String str) {
        if (this.a.containsKey(str)) {
            return anaf.O((akps) this.a.get(str));
        }
        return anaf.O(null);
    }

    @Override // defpackage.akpf
    public final void b(String str, akps akpsVar) {
        this.a.put(str, akpsVar);
    }
}
