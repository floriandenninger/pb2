package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zoy implements zoo {
    public final List a;
    public final vgz b;

    public zoy(final List list, final vgz vgzVar) {
        list.getClass();
        this.a = list;
        this.b = vgzVar;
        anfq.h(d(), new amml() { // from class: zox
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                int i;
                List<FilterMapTable$FilterDescriptor> list2 = list;
                vgz vgzVar2 = vgzVar;
                Map map = (Map) obj;
                if (map == null || !map.containsKey(zoy.e("NORMAL"))) {
                    HashMap hashMap = new HashMap();
                    Iterator it = list2.iterator();
                    while (true) {
                        i = 2;
                        if (!it.hasNext()) {
                            break;
                        }
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) it.next();
                        hashMap.put(zoy.e(filterMapTable$FilterDescriptor.a), 2);
                        filterMapTable$FilterDescriptor.f = new dsm(2);
                    }
                    vgzVar2.b(new vqy(hashMap, i), angq.a);
                } else {
                    for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 : list2) {
                        filterMapTable$FilterDescriptor2.f = new dsm(((Integer) yjj.t(map, zoy.e(filterMapTable$FilterDescriptor2.a), 0)).intValue());
                    }
                }
                return true;
            }
        }, angq.a);
    }

    public static final String e(String str) {
        String valueOf = String.valueOf(amkq.d(str));
        return valueOf.length() != 0 ? "VISITED_EFFECT_ID_".concat(valueOf) : new String("VISITED_EFFECT_ID_");
    }

    @Override // defpackage.zoo
    public final void a(String str) {
        anfq.h(anfq.h(c(e(str)), yml.i, angq.a), new zow(this, str, 0), angq.a);
        FilterMapTable$FilterDescriptor b = b(str);
        if (b != null) {
            b.f = new dsm(2);
        }
    }

    public final FilterMapTable$FilterDescriptor b(String str) {
        return FilterMapTable$FilterDescriptor.a(this.a, str);
    }

    public final anhy c(String str) {
        return anfq.h(this.b.a(), new wgs(str, 11), angq.a);
    }

    public final anhy d() {
        return anfq.h(this.b.a(), yml.g, angq.a);
    }
}
