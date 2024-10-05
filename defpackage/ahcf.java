package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahcf extends actb {
    private final aigf b;
    private final ahcc c;
    private final Map d;

    public ahcf(int i, aigf aigfVar, boolean z, ahcc ahccVar, Map map) {
        super("watch", i, z);
        aigfVar.getClass();
        this.b = aigfVar;
        this.c = ahccVar;
        map.getClass();
        this.d = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final boolean a(ynz ynzVar) {
        boolean a = super.a(ynzVar);
        if (!a || ynzVar.getClass() == ahde.class || ynzVar.getClass() == ahdf.class || ynzVar.getClass() == ahdb.class) {
            return a;
        }
        f("abandoned_watch");
        return true;
    }

    @Override // defpackage.actb
    public final edb b() {
        g("vis", this.b.a());
        g("bwm", String.format(Locale.US, "%d:%.3f", Long.valueOf(this.c.a.get()), Float.valueOf(this.c.b.get() / 1000.0f)));
        if (this.c.e() > 0) {
            g("cache_bytes", String.valueOf(this.c.e()));
        }
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final void c(ynz ynzVar, Set set, Set set2) {
        super.c(ynzVar, set, set2);
        for (Map.Entry entry : this.d.entrySet()) {
            g((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
