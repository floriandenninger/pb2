package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzk extends actb {
    private final ahcc b;
    private final aigf c;
    private final Map d;

    public wzk(ahcc ahccVar, int i, aigf aigfVar, boolean z, Map map) {
        super("video_to_ad", i, z);
        this.b = ahccVar;
        this.c = aigfVar;
        map.getClass();
        this.d = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final boolean a(ynz ynzVar) {
        if (ynzVar.f().isEmpty() || !ynzVar.f().equals("ad_ba")) {
            return super.a(ynzVar);
        }
        super.e();
        return true;
    }

    @Override // defpackage.actb
    public final edb b() {
        g("vis", this.c.a());
        g("mod_ad", "1");
        if (this.b.e() > 0) {
            g("cache_bytes", String.valueOf(this.b.e()));
        }
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final void c(ynz ynzVar, Set set, Set set2) {
        super.c(ynzVar, set, set2);
        if (this.d.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.d.entrySet()) {
            g((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
