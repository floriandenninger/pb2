package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqt extends axqo {
    public static final azrw b = axqs.a(Collections.emptyMap());

    public axqt(Map map) {
        super(map);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map get() {
        LinkedHashMap o = ayaw.o(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            o.put(entry.getKey(), ((azrw) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(o);
    }
}
