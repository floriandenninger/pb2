package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankb {
    public final ConcurrentMap a = new ConcurrentHashMap();
    public anjz b;
    public final Class c;

    public ankb(Class cls) {
        this.c = cls;
    }

    public final List a(byte[] bArr) {
        List list = (List) this.a.get(new anka(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
