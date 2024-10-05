package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Effect;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ztd implements zsq, zsi {
    private aoae A;
    public zto a;
    public zum b;
    public boolean c;
    public Map f;
    public ztp g;
    public zfi p;
    public zoo r;
    public List s;
    public String t;
    public String u;
    public avwx v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean d = true;
    public final Object e = new Object();
    public final Set i = Collections.newSetFromMap(new HashMap());
    public final Set j = Collections.newSetFromMap(new HashMap());
    public final Set k = Collections.newSetFromMap(new HashMap());
    public final Set l = Collections.newSetFromMap(new HashMap());
    public final Set m = Collections.newSetFromMap(new HashMap());
    public final Set n = Collections.newSetFromMap(new HashMap());
    public final Set o = Collections.newSetFromMap(new HashMap());
    public final Map q = new HashMap();
    private final Map z = new EnumMap(avwx.class);
    public final zsh h = new zsh(Executors.newSingleThreadExecutor());

    public static zsq j() {
        return new ztd();
    }

    @Override // defpackage.zsi
    public final void a(String str) {
        this.h.d(str);
    }

    @Override // defpackage.zsi
    public final void b() {
        n();
        q();
    }

    @Override // defpackage.zsq
    public final zsk c(final zsm zsmVar) {
        synchronized (this.i) {
            aoae aoaeVar = this.A;
            if (aoaeVar != null) {
                zsmVar.a(aoaeVar);
            } else {
                wcy.y(this.i, zsmVar);
            }
        }
        return new zsk() { // from class: zsw
            @Override // defpackage.zsk
            public final void a() {
                ztd ztdVar = ztd.this;
                zsm zsmVar2 = zsmVar;
                synchronized (ztdVar.i) {
                    ztdVar.i.remove(zsmVar2);
                }
            }
        };
    }

    @Override // defpackage.zsq
    public final zsk d(final zsj zsjVar) {
        this.h.a(zsjVar);
        return new zsk() { // from class: zsv
            @Override // defpackage.zsk
            public final void a() {
                ztd ztdVar = ztd.this;
                ztdVar.h.e(zsjVar);
            }
        };
    }

    @Override // defpackage.zsq
    public final zsk e(final zsn zsnVar) {
        synchronized (this.n) {
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
            if (a != null) {
                zsnVar.a(a);
            }
            wcy.y(this.n, zsnVar);
        }
        return new zsk() { // from class: zsz
            @Override // defpackage.zsk
            public final void a() {
                ztd ztdVar = ztd.this;
                zsn zsnVar2 = zsnVar;
                synchronized (ztdVar.n) {
                    ztdVar.n.remove(zsnVar2);
                }
            }
        };
    }

    @Override // defpackage.zsq
    public final zsk f(zso zsoVar) {
        zsoVar.getClass();
        this.p = zsoVar;
        synchronized (this.z) {
            for (ztk ztkVar : this.z.values()) {
                synchronized (ztkVar.d) {
                    Iterator it = ztkVar.e.keySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!ztkVar.d.containsKey(str)) {
                            ztkVar.d.put(str, (ztq) ztkVar.e.get(str));
                        }
                        it.remove();
                    }
                    ztkVar.i((List) Collection.EL.stream(ztkVar.d.keySet()).collect(Collectors.toList()));
                }
            }
        }
        return new zsk() { // from class: zsr
            @Override // defpackage.zsk
            public final void a() {
                ztd.this.p = null;
            }
        };
    }

    @Override // defpackage.zsq
    public final zsl g() {
        if (this.t != null) {
            Map map = amvo.b;
            if (this.v == avwx.EFFECT_SUBPACKAGE_ID_PRESET) {
                float f = true != FilterMapTable$FilterDescriptor.e(this.t, "AUTO") ? 0.5f : 0.8f;
                Map hashMap = new HashMap();
                hashMap.put("intensity", Float.valueOf(f));
                map = hashMap;
            }
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
            String str = this.t;
            return new zsl(str, a == null ? str : a.c, FilterMapTable$FilterDescriptor.e(str, "NORMAL") ? avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED : this.v, map);
        }
        return zsl.a;
    }

    @Override // defpackage.zsq
    public final void h(zto ztoVar) {
        amkq.N(this.a == null);
        ztoVar.getClass();
        this.a = ztoVar;
        zss zssVar = new zss(this, ztoVar);
        synchronized (ztoVar.e) {
            ztoVar.h = zssVar;
            ztoVar.c();
        }
    }

    @Override // defpackage.zsq
    public final void i(zum zumVar) {
        amkq.N(this.b == null);
        zumVar.getClass();
        this.b = zumVar;
        zst zstVar = new zst(this, zumVar);
        synchronized (zumVar.c) {
            zumVar.m = zstVar;
            zumVar.b();
        }
    }

    public final ztk k(avwx avwxVar) {
        ztk ztkVar;
        synchronized (this.z) {
            ztkVar = (ztk) this.z.get(avwxVar);
            if (ztkVar == null) {
                ztkVar = new ztk(this);
                this.z.put(avwxVar, ztkVar);
            }
        }
        return ztkVar;
    }

    public final void l(Set set) {
        synchronized (this.i) {
            aoae aoaeVar = new aoae(set, (byte[]) null, (byte[]) null);
            this.A = aoaeVar;
            wcy.z(this.i, aoaeVar);
            this.i.clear();
        }
    }

    public final void n() {
        List list = this.s;
        if (list != null) {
            wcy.z(this.m, list);
            Iterator it = this.z.values().iterator();
            while (it.hasNext()) {
                ((ztk) it.next()).g();
            }
        }
    }

    public final void o() {
        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
        if (a != null) {
            wcy.z(this.n, a);
        }
        q();
    }

    public final void p() {
        k(avwx.EFFECT_SUBPACKAGE_ID_PRESET).j(true);
        k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).j(false);
    }

    public final void q() {
        Effect a;
        if (this.d) {
            String str = this.t;
            FilterMapTable$FilterDescriptor a2 = FilterMapTable$FilterDescriptor.a(this.s, str);
            if (a2 == null || a2.b) {
                str = "NORMAL";
            }
            if (FilterMapTable$FilterDescriptor.e(str, this.u)) {
                return;
            }
            this.u = str;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "EffectProvider::updateAppliedEffect setXenoEffect to ".concat(valueOf) : new String("EffectProvider::updateAppliedEffect setXenoEffect to ");
            if (this.y) {
                zga.c("PresetFilterDebug", concat);
            }
            if (!this.x || (a = this.b.a(this.u)) == null) {
                return;
            }
            if (!this.y || !this.u.equals("bw_med_contrast_shorts")) {
                wcy.z(this.o, a);
            } else {
                wcy.z(this.o, null);
            }
        }
    }

    public final void r(List list, List list2, agcm agcmVar) {
        synchronized (this.q) {
            this.r = agcmVar.c(list);
            for (Map.Entry entry : this.q.entrySet()) {
                m((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.q.clear();
            this.s = list;
            n();
        }
        o();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            zor zorVar = (zor) it.next();
            avwx avwxVar = zorVar.a;
            ztk k = k(avwxVar);
            k.g = zorVar;
            k.g();
            k.h();
            if (avwxVar == avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE) {
                final int i = 0;
                k.a(new zsn(this) { // from class: ztc
                    public final /* synthetic */ ztd a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i != 0) {
                            ztd ztdVar = this.a;
                            if (ztdVar.w) {
                                return;
                            }
                            ztdVar.k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).c("NORMAL");
                            ztdVar.p();
                            return;
                        }
                        ztd ztdVar2 = this.a;
                        ztdVar2.w = true;
                        if (!FilterMapTable$FilterDescriptor.h(((FilterMapTable$FilterDescriptor) obj).a)) {
                            ztdVar2.k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).j(true);
                            ztdVar2.k(avwx.EFFECT_SUBPACKAGE_ID_PRESET).j(false);
                        } else {
                            ztdVar2.p();
                        }
                        ztdVar2.w = false;
                    }
                });
            } else if (avwxVar == avwx.EFFECT_SUBPACKAGE_ID_PRESET) {
                final int i2 = 1;
                k.a(new zsn(this) { // from class: ztc
                    public final /* synthetic */ ztd a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i2 != 0) {
                            ztd ztdVar = this.a;
                            if (ztdVar.w) {
                                return;
                            }
                            ztdVar.k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).c("NORMAL");
                            ztdVar.p();
                            return;
                        }
                        ztd ztdVar2 = this.a;
                        ztdVar2.w = true;
                        if (!FilterMapTable$FilterDescriptor.h(((FilterMapTable$FilterDescriptor) obj).a)) {
                            ztdVar2.k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).j(true);
                            ztdVar2.k(avwx.EFFECT_SUBPACKAGE_ID_PRESET).j(false);
                        } else {
                            ztdVar2.p();
                        }
                        ztdVar2.w = false;
                    }
                });
            } else if (avwxVar == avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED) {
                zga.l("Loaded unspecified subpackage");
            } else {
                String valueOf = String.valueOf(avwxVar.name());
                zga.b(valueOf.length() != 0 ? "Ignoring selected effect from unknown subpackage: ".concat(valueOf) : new String("Ignoring selected effect from unknown subpackage: "));
            }
        }
    }

    public final void m(String str, int i) {
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                this.r.a(str);
                return;
            }
            throw new AssertionError(i);
        }
        zoy zoyVar = (zoy) this.r;
        anfq.h(anfq.h(zoyVar.c(zoy.e(str)), yml.h, angq.a), new zow(zoyVar, str, i2), angq.a);
        FilterMapTable$FilterDescriptor b = zoyVar.b(str);
        if (b != null) {
            b.f = new dsm(1);
        }
    }
}
