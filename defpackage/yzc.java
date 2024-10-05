package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzc implements ypd {
    public static final Comparator a = unt.f;
    public final Map b;
    public final Map c = new ConcurrentHashMap();
    public final Executor d;

    public yzc(Map map, Executor executor) {
        this.b = map;
        this.d = executor;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yzd.class};
        }
        if (i == 0) {
            this.d.execute(new yzb(this));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
