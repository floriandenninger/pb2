package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtp implements ahyl {
    public final ahtn g;
    public volatile boolean h;
    public boolean k;
    private final aahd l;
    private long m;
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final Map e = DesugarCollections.synchronizedMap(new HashMap());
    public final Map f = DesugarCollections.synchronizedMap(new HashMap());
    public Optional j = Optional.empty();
    public Optional i = Optional.empty();

    public ahtp(aahd aahdVar, ahtn ahtnVar) {
        this.l = aahdVar;
        this.g = ahtnVar;
    }

    private final void o(long j, int i, ahyo ahyoVar) {
        Optional ofNullable = Optional.ofNullable(m(ahyoVar));
        if (ofNullable.isPresent()) {
            TimelineMarker timelineMarker = null;
            if (ahyoVar.equals(ahyo.TIMESTAMP_MARKER)) {
                int length = ((TimelineMarker[]) ofNullable.get()).length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else if (((TimelineMarker[]) ofNullable.get())[length].a <= j) {
                        timelineMarker = ((TimelineMarker[]) ofNullable.get())[length];
                        break;
                    }
                }
                p(timelineMarker, ahyoVar, i);
                return;
            }
            TimelineMarker[] timelineMarkerArr = (TimelineMarker[]) ofNullable.get();
            int length2 = timelineMarkerArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                TimelineMarker timelineMarker2 = timelineMarkerArr[i2];
                if (timelineMarker2.a(j)) {
                    timelineMarker = timelineMarker2;
                    break;
                }
                i2++;
            }
            p(timelineMarker, ahyoVar, i);
        }
    }

    private final void p(TimelineMarker timelineMarker, ahyo ahyoVar, int i) {
        TimelineMarker timelineMarker2 = (TimelineMarker) this.b.get(ahyoVar);
        if (amkq.b(timelineMarker, timelineMarker2)) {
            return;
        }
        if (timelineMarker != null) {
            this.b.put(ahyoVar, timelineMarker);
        } else {
            this.b.remove(ahyoVar);
        }
        f(timelineMarker, ahyoVar, i, timelineMarker2);
    }

    public final TimelineMarker a(ahyo ahyoVar) {
        return (TimelineMarker) this.b.get(ahyoVar);
    }

    public final Optional b(ahyo ahyoVar) {
        Optional ofNullable = Optional.ofNullable(m(ahyoVar));
        if (!ofNullable.isPresent() || ((TimelineMarker[]) ofNullable.get()).length == 0) {
            return Optional.empty();
        }
        TimelineMarker timelineMarker = (TimelineMarker) this.b.get(ahyoVar);
        if (timelineMarker != null) {
            long j = timelineMarker.b;
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                for (TimelineMarker timelineMarker2 : (TimelineMarker[]) ofNullable.get()) {
                    if (timelineMarker2.a(j2)) {
                        return Optional.of(timelineMarker2);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final Optional c(ahyo ahyoVar) {
        Optional ofNullable = Optional.ofNullable(m(ahyoVar));
        if (!ofNullable.isPresent() || ((TimelineMarker[]) ofNullable.get()).length == 0) {
            return Optional.empty();
        }
        TimelineMarker timelineMarker = (TimelineMarker) this.b.get(ahyoVar);
        if (timelineMarker != null) {
            long j = timelineMarker.a;
            if (j > 0) {
                long j2 = j - 1;
                for (TimelineMarker timelineMarker2 : (TimelineMarker[]) ofNullable.get()) {
                    if (timelineMarker2.a(j2)) {
                        return Optional.of(timelineMarker2);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final void d(String str, apxf apxfVar) {
        if (apxfVar == null) {
            return;
        }
        this.f.put(str, apxfVar);
    }

    public final void e(boolean z, Optional optional) {
        apxf apxfVar;
        this.b.clear();
        this.j = optional;
        if (optional.isPresent()) {
            Map map = (Map) this.c.get(optional.get());
            if (map != null) {
                for (ahyo ahyoVar : map.keySet()) {
                    if (!z) {
                        this.d.remove(ahyoVar);
                    } else {
                        this.d.put(ahyoVar, (ahte) map.get(ahyoVar));
                    }
                    Set set = (Set) this.a.get(ahyoVar);
                    if (set == null) {
                        return;
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((ahto) it.next()).nr(ahyoVar, z);
                    }
                    if (z) {
                        o(this.m, 0, ahyoVar);
                    }
                }
                this.g.a(amru.o(this.d.values()));
            }
            if (z || (apxfVar = (apxf) this.f.get(optional.get())) == null) {
                return;
            }
            this.l.a(apxfVar);
        }
    }

    public final void f(TimelineMarker timelineMarker, ahyo ahyoVar, int i, TimelineMarker timelineMarker2) {
        apxf apxfVar;
        apxf apxfVar2;
        if (timelineMarker != null && (apxfVar2 = timelineMarker.f) != null) {
            this.l.a(apxfVar2);
        }
        if (timelineMarker == null && this.j.isPresent() && this.e.containsKey(this.j.get()) && (apxfVar = (apxf) this.e.get(this.j.get())) != null) {
            this.l.a(apxfVar);
        }
        Set set = (Set) this.a.get(ahyoVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ahto) it.next()).nx(timelineMarker2, timelineMarker, ahyoVar, i);
        }
    }

    public final void g(String str, boolean z) {
        if (!TextUtils.equals(str, (CharSequence) this.j.orElse(null))) {
            if (z) {
                e(true, Optional.ofNullable(str));
            }
        } else {
            if (z) {
                return;
            }
            e(false, Optional.ofNullable(str));
            e(true, this.i);
        }
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.h = z;
        if (i == 4 || i == 5) {
            return;
        }
        j(j, 2);
    }

    public final void i(ahyo ahyoVar, ahto ahtoVar) {
        Set set = (Set) this.a.get(ahyoVar);
        if (set == null) {
            set = new CopyOnWriteArraySet();
            this.a.put(ahyoVar, set);
        }
        set.add(ahtoVar);
    }

    public final void j(long j, int i) {
        arfr arfrVar;
        if (this.k) {
            return;
        }
        this.m = j;
        for (ahyo ahyoVar : ahyo.values()) {
            o(j, i, ahyoVar);
        }
        ahtn ahtnVar = this.g;
        if (i != 2) {
            return;
        }
        azqw azqwVar = ahtnVar.b;
        Optional empty = Optional.empty();
        Iterator it = ahtnVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ahtm ahtmVar = (ahtm) it.next();
            if (ahtmVar.a <= j && ahtmVar.b > j) {
                ahtc ahtcVar = new ahtc();
                arfr arfrVar2 = ahtmVar.d;
                if (arfrVar2 != null) {
                    ahtcVar.b = arfrVar2;
                    CharSequence charSequence = ahtmVar.c;
                    if (charSequence != null) {
                        ahtcVar.a = charSequence;
                        CharSequence charSequence2 = ahtcVar.a;
                        if (charSequence2 == null || (arfrVar = ahtcVar.b) == null) {
                            StringBuilder sb = new StringBuilder();
                            if (ahtcVar.a == null) {
                                sb.append(" label");
                            }
                            if (ahtcVar.b == null) {
                                sb.append(" icon");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        empty = Optional.of(new ahtd(charSequence2, arfrVar));
                    } else {
                        throw new NullPointerException("Null label");
                    }
                } else {
                    throw new NullPointerException("Null icon");
                }
            }
        }
        azqwVar.c(empty);
    }

    public final void k(String str, ahyo ahyoVar, TimelineMarker[] timelineMarkerArr, apxf apxfVar) {
        n(str, ahyoVar, new ahte(timelineMarkerArr), apxfVar);
    }

    public final void l(ahyo ahyoVar, ahto ahtoVar) {
        Set set = (Set) this.a.get(ahyoVar);
        if (set == null) {
            return;
        }
        set.remove(ahtoVar);
    }

    public final TimelineMarker[] m(ahyo ahyoVar) {
        ahte ahteVar = (ahte) this.d.get(ahyoVar);
        if (ahteVar == null) {
            return null;
        }
        return (TimelineMarker[]) ahteVar.a.toArray(new TimelineMarker[0]);
    }

    public final void n(String str, ahyo ahyoVar, ahte ahteVar, apxf apxfVar) {
        Map synchronizedMap;
        if (this.c.containsKey(str)) {
            synchronizedMap = (Map) this.c.get(str);
        } else {
            synchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
            this.c.put(str, synchronizedMap);
        }
        if (synchronizedMap != null) {
            synchronizedMap.put(ahyoVar, ahteVar);
            Set set = (Set) this.a.get(ahyoVar);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ahto) it.next()).b(ahyoVar);
                }
            }
        }
        if (apxfVar != null) {
            this.e.put(str, apxfVar);
        }
    }
}
