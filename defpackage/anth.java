package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anth implements rie {
    final /* synthetic */ rdq a;

    public anth(rdq rdqVar) {
        this.a = rdqVar;
    }

    @Override // defpackage.rie
    public final int a(String str) {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rdd(rdqVar, str, rchVar));
        Integer num = (Integer) rch.d(rchVar.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.rie
    public final long b() {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcx(rdqVar, rchVar));
        Long l = (Long) rch.d(rchVar.b(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i = rdqVar.d + 1;
            rdqVar.d = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    @Override // defpackage.rie
    public final String c() {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcw(rdqVar, rchVar));
        return rchVar.c(50L);
    }

    @Override // defpackage.rie
    public final String d() {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcz(rdqVar, rchVar));
        return rchVar.c(500L);
    }

    @Override // defpackage.rie
    public final String e() {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcy(rdqVar, rchVar));
        return rchVar.c(500L);
    }

    @Override // defpackage.rie
    public final String f() {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcv(rdqVar, rchVar));
        return rchVar.c(500L);
    }

    @Override // defpackage.rie
    public final List g(String str, String str2) {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rcp(rdqVar, str, str2, rchVar));
        List list = (List) rch.d(rchVar.b(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // defpackage.rie
    public final Map h(String str, String str2, boolean z) {
        rdq rdqVar = this.a;
        rch rchVar = new rch(null);
        rdqVar.c(new rda(rdqVar, str, str2, z, rchVar));
        Bundle b = rchVar.b(5000L);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // defpackage.rie
    public final void i(String str) {
        rdq rdqVar = this.a;
        rdqVar.c(new rct(rdqVar, str));
    }

    @Override // defpackage.rie
    public final void j(String str, String str2, Bundle bundle) {
        rdq rdqVar = this.a;
        rdqVar.c(new rco(rdqVar, str, str2, bundle));
    }

    @Override // defpackage.rie
    public final void k(String str) {
        rdq rdqVar = this.a;
        rdqVar.c(new rcu(rdqVar, str));
    }

    @Override // defpackage.rie
    public final void l(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // defpackage.rie
    public final void m(Bundle bundle) {
        rdq rdqVar = this.a;
        rdqVar.c(new rcn(rdqVar, bundle));
    }
}
