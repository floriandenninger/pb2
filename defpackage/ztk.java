package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ztk implements ztf {
    public final ztd a;
    private String h;
    public final Set b = Collections.newSetFromMap(new HashMap());
    public final Set c = Collections.newSetFromMap(new HashMap());
    public final Map d = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    public zor g = null;
    public boolean f = true;

    public ztk(ztd ztdVar) {
        this.a = ztdVar;
    }

    @Override // defpackage.ztf
    public final zsk a(final zsn zsnVar) {
        FilterMapTable$FilterDescriptor a;
        synchronized (this.c) {
            zor zorVar = this.g;
            if (zorVar != null && (a = FilterMapTable$FilterDescriptor.a(zorVar.a(), this.h)) != null) {
                zsnVar.a(a);
            }
            wcy.y(this.c, zsnVar);
        }
        return new zsk() { // from class: zth
            @Override // defpackage.zsk
            public final void a() {
                ztk ztkVar = ztk.this;
                zsn zsnVar2 = zsnVar;
                synchronized (ztkVar.c) {
                    ztkVar.c.remove(zsnVar2);
                }
            }
        };
    }

    @Override // defpackage.ztf
    public final zsk b(final zte zteVar) {
        synchronized (this.b) {
            zor zorVar = this.g;
            if (zorVar != null) {
                zteVar.a(zorVar);
            }
            wcy.y(this.b, zteVar);
        }
        return new zsk() { // from class: zti
            @Override // defpackage.zsk
            public final void a() {
                ztk ztkVar = ztk.this;
                zte zteVar2 = zteVar;
                synchronized (ztkVar.b) {
                    ztkVar.b.remove(zteVar2);
                }
            }
        };
    }

    @Override // defpackage.ztf
    public final void c(String str) {
        if (str == null || FilterMapTable$FilterDescriptor.e(str, f())) {
            return;
        }
        this.h = str;
        h();
    }

    @Override // defpackage.ztf
    public final void d(Map map) {
        ztd ztdVar = this.a;
        synchronized (ztdVar.q) {
            if (map != null) {
                if (!map.isEmpty()) {
                    if (ztdVar.r != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            ztdVar.m((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                        ztdVar.n();
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            ztdVar.q.put((String) entry2.getKey(), (Integer) entry2.getValue());
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ztf
    public final boolean e() {
        String str;
        zor zorVar = this.g;
        return (zorVar == null || (str = this.h) == null || !this.f || str.equalsIgnoreCase(zorVar.c)) ? false : true;
    }

    final String f() {
        if (this.f) {
            return this.h;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        zor zorVar = this.g;
        if (zorVar != null) {
            wcy.z(this.b, zorVar);
        }
    }

    public final void h() {
        FilterMapTable$FilterDescriptor a;
        zor zorVar = this.g;
        if (zorVar != null && (a = FilterMapTable$FilterDescriptor.a(zorVar.a(), this.h)) != null) {
            wcy.z(this.c, a);
        }
        ztd ztdVar = this.a;
        avwx avwxVar = avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        String f = ztdVar.k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).f();
        if (FilterMapTable$FilterDescriptor.h(f)) {
            f = ztdVar.k(avwx.EFFECT_SUBPACKAGE_ID_PRESET).f();
            if (FilterMapTable$FilterDescriptor.h(f)) {
                f = ztdVar.k(avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED).f();
                if (FilterMapTable$FilterDescriptor.h(f)) {
                    f = "NORMAL";
                }
            } else {
                avwxVar = avwx.EFFECT_SUBPACKAGE_ID_PRESET;
            }
        } else {
            avwxVar = avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        }
        if (f.equals(ztdVar.t) && ztdVar.v == avwxVar) {
            return;
        }
        ztdVar.t = f;
        ztdVar.v = avwxVar;
        ztdVar.o();
    }

    public final void i(List list) {
        zfi zfiVar;
        synchronized (this.d) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ztq ztqVar = (ztq) this.d.get(str);
                if (ztqVar != null && ztqVar.a.isAvailable()) {
                    arrayList.add(new ztr(str, ztqVar, new ztj(this, str, ztqVar)));
                }
            }
            if (!arrayList.isEmpty() && (zfiVar = this.a.p) != null) {
                zfiVar.a(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        h();
    }
}
