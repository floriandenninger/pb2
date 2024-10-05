package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcj {
    public static final String a = zga.a("MDX.MediaRouteFilter");
    private static final int[] h = {1, 2, 3, 4, 5, 6, 7};
    public final boolean b;
    public final Executor c;
    public final adee d;
    private final addp e;
    private final adlj f;
    private final String g;

    public adcj(adlj adljVar, adbu adbuVar, boolean z, bph bphVar, String str, Executor executor, adee adeeVar) {
        this(adljVar, adbuVar, z, new adbr(bphVar), str, executor, adeeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atai[] d() {
        int length = h.length;
        atai[] ataiVarArr = new atai[7];
        int i = 0;
        while (true) {
            int[] iArr = h;
            int length2 = iArr.length;
            if (i >= 7) {
                return ataiVarArr;
            }
            aone createBuilder = atai.a.createBuilder();
            int i2 = iArr[i];
            createBuilder.copyOnWrite();
            atai ataiVar = (atai) createBuilder.instance;
            int i3 = i2 - 1;
            if (i2 != 0) {
                ataiVar.c = i3;
                ataiVar.b |= 1;
                createBuilder.copyOnWrite();
                atai ataiVar2 = (atai) createBuilder.instance;
                ataiVar2.b |= 2;
                ataiVar2.d = 0;
                ataiVarArr[i] = (atai) createBuilder.build();
                i++;
            } else {
                throw null;
            }
        }
    }

    private final boolean e(bpv bpvVar) {
        return adeg.d(this.f, bpvVar);
    }

    private final boolean f(bpv bpvVar, Set set) {
        String q = adgb.q(bpvVar.q);
        if (q != null) {
            Optional findFirst = Collection.EL.stream(this.f.b()).filter(new opz(q, 7)).findFirst();
            if (findFirst.isPresent() && ((adfy) findFirst.get()).n != null) {
                String replace = ((adfy) findFirst.get()).n.c.replace("-", "").replace("uuid:", "");
                if (replace.length() >= 16 && set.contains(replace)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final String g(bpv bpvVar, CastDevice castDevice) {
        String b = castDevice.b();
        if (TextUtils.isEmpty(b)) {
            zga.m(a, "empty cast device Id, fallback to parsing route Id");
            b = bpvVar.c;
        }
        String replace = b.replace("-", "");
        return replace.substring(replace.lastIndexOf(":") + 1);
    }

    public final List a(amru amruVar, Map map) {
        HashSet hashSet = new HashSet();
        for (bpv bpvVar : map.keySet()) {
            Optional optional = (Optional) map.get(bpvVar);
            if (optional != null && optional.isPresent()) {
                hashSet.add(g(bpvVar, (CastDevice) optional.get()));
            }
        }
        ArrayList arrayList = new ArrayList(amruVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bpv bpvVar2 = (bpv) it.next();
            if (ammx.e(this.g) || Arrays.asList(this.g.split(",")).contains(bpvVar2.d)) {
                Optional optional2 = (Optional) map.get(bpvVar2);
                if (this.e.ra(bpvVar2)) {
                    if (!adeg.i(bpvVar2) || !f(bpvVar2, hashSet)) {
                        if (optional2 == null || !optional2.isPresent() || !adee.b((CastDevice) optional2.get()) || this.b) {
                            if (c(bpvVar2) && e(bpvVar2)) {
                                it.remove();
                            }
                        } else {
                            it.remove();
                        }
                    } else {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
        return arrayList;
    }

    public final void b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bpv bpvVar = (bpv) it.next();
            if (adee.e(bpvVar)) {
                hashSet.add(g(bpvVar, adee.c(bpvVar)));
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            bpv bpvVar2 = (bpv) it2.next();
            if (ammx.e(this.g) || Arrays.asList(this.g.split(",")).contains(bpvVar2.d)) {
                if (this.e.ra(bpvVar2)) {
                    if (!adeg.i(bpvVar2) || !f(bpvVar2, hashSet)) {
                        if (!adee.d(bpvVar2) || this.b) {
                            if (c(bpvVar2) && e(bpvVar2)) {
                                it2.remove();
                            }
                        } else {
                            it2.remove();
                        }
                    } else {
                        it2.remove();
                    }
                } else {
                    it2.remove();
                }
            } else {
                it2.remove();
            }
        }
    }

    public final boolean c(bpv bpvVar) {
        Optional findFirst;
        adlj adljVar = this.f;
        if (!adeg.i(bpvVar)) {
            return false;
        }
        String q = adgb.q(bpvVar.q);
        if (q == null) {
            findFirst = Optional.empty();
        } else {
            findFirst = Collection.EL.stream(adljVar.b()).filter(new opz(q, 12)).findFirst();
        }
        if (!findFirst.isPresent()) {
            zga.m(adeg.a, "Route was not found in screen monitor");
            return false;
        }
        return ((adfy) findFirst.get()).p();
    }

    public adcj(adlj adljVar, adbu adbuVar, boolean z, addp addpVar, String str, Executor executor, adee adeeVar) {
        adbuVar.getClass();
        adljVar.getClass();
        this.f = adljVar;
        this.b = z;
        addpVar.getClass();
        this.e = addpVar;
        this.g = str;
        this.c = executor;
        this.d = adeeVar;
    }
}
