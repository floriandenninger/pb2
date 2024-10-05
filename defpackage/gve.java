package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gve implements aahd {
    private final aahd a;
    private final Map b;

    public gve(aahd aahdVar, Map map) {
        aahdVar.getClass();
        this.a = aahdVar;
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (map == null) {
            this.a.c(apxfVar, this.b);
            return;
        }
        HashMap hashMap = new HashMap(this.b);
        hashMap.putAll(map);
        this.a.c(apxfVar, hashMap);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
