package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ageh implements agej, agml, agsf {
    public final agmm a;
    public final agsg b;
    public volatile agna c;
    public volatile agna d;
    private final agek e;
    private final yxn f;
    private final Map g = new HashMap();
    private final List h = new ArrayList();
    private final axpg i;
    private File j;

    public ageh(agek agekVar, agmm agmmVar, agsg agsgVar, yxn yxnVar, axpg axpgVar) {
        this.e = agekVar;
        this.a = agmmVar;
        this.b = agsgVar;
        this.f = yxnVar;
        this.i = axpgVar;
    }

    private final agna k(File file, String str) {
        return new agna(this.e.a(file), str);
    }

    private final synchronized void l() {
        this.j = null;
    }

    @Override // defpackage.agej
    public final synchronized agna a() {
        if (this.d == null || !this.a.w()) {
            return this.c;
        }
        return this.d;
    }

    @Override // defpackage.agej
    public final synchronized agna b() {
        return this.c;
    }

    @Override // defpackage.agej
    public final synchronized agna c() {
        return this.d;
    }

    @Override // defpackage.agej
    public final synchronized File d() {
        if (this.j == null) {
            agna a = a();
            String str = a != null ? a.a : null;
            this.j = str != null ? (File) this.g.get(str) : null;
        }
        return this.j;
    }

    @Override // defpackage.agej
    public final synchronized File e(String str) {
        return (File) this.g.get(str);
    }

    @Override // defpackage.amnv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized List get() {
        return amru.o(this.h);
    }

    @Override // defpackage.agej
    public final synchronized List g() {
        return amru.o(this.h);
    }

    public final synchronized void h() {
        File o;
        this.e.b();
        l();
        this.c = null;
        this.d = null;
        this.g.clear();
        this.h.clear();
        File o2 = this.a.o(true, null);
        if (o2 != null) {
            String valueOf = String.valueOf(o2.getAbsolutePath());
            if (valueOf.length() != 0) {
                "[Offline] Primary cache dir: ".concat(valueOf);
            }
            afhp.a(o2);
            String d = this.f.d();
            try {
                agna k = k(o2, d);
                if (k.o()) {
                    this.g.put(d, o2);
                    this.h.add(k);
                    this.c = k;
                }
            } catch (RuntimeException e) {
                zga.d("[Offline] Exception while creating cache", e);
                afsi.c(2, 28, "[Offline] Error creating offlineCache", e);
            }
        }
        String y = this.b.y(this.f);
        Map h = this.f.h();
        for (String str : h.keySet()) {
            if (((Boolean) h.get(str)).booleanValue() && (o = this.a.o(false, str)) != null) {
                String valueOf2 = String.valueOf(o.getAbsolutePath());
                if (valueOf2.length() != 0) {
                    "[Offline] SD card cache dir: ".concat(valueOf2);
                }
                afhp.a(o);
                String str2 = (String) this.f.g().get(str);
                try {
                    agna k2 = k(o, str2);
                    if (k2.o()) {
                        this.h.add(k2);
                        if (str.equals(y)) {
                            this.d = k2;
                        }
                        if (str2 != null) {
                            this.g.put(str2, o);
                        }
                    }
                } catch (RuntimeException e2) {
                    zga.d("[Offline] Exception while creating SD cache", e2);
                    afsi.c(2, 28, "Error creating sdCardOfflineCache", e2);
                }
            }
        }
        this.h.addAll((Collection) this.i.get());
    }

    public final boolean i() {
        return (a() == null && d() == null) ? false : true;
    }

    @Override // defpackage.agsf
    public final void j() {
        l();
    }
}
