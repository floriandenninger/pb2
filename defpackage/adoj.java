package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoj implements ykl {
    final /* synthetic */ ykl a;
    final /* synthetic */ adok b;
    private final ykl c;

    public adoj(adok adokVar, ykl yklVar, ykl yklVar2) {
        this.b = adokVar;
        this.a = yklVar2;
        this.c = yklVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        ykl yklVar = this.c;
        if (yklVar != null) {
            yklVar.a(null, exc);
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        List<adga> list = (List) obj2;
        if (list.isEmpty()) {
            this.a.b(null, Collections.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (adga adgaVar : list) {
            if (!this.b.g.containsKey(adgaVar.b())) {
                arrayList.add(adgaVar.b());
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 6;
            int min = Math.min(arrayList.size(), i2);
            adok adokVar = this.b;
            adokVar.g.putAll(adokVar.d.b(arrayList.subList(i, min), 9));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (adga adgaVar2 : list) {
            adft adftVar = (adft) this.b.g.get(adgaVar2.b());
            if (adftVar != null) {
                adfv g = adgaVar2.a.g();
                g.a = adftVar;
                arrayList2.add(new adga(g.a()));
            }
        }
        Map a = this.b.b.a((Collection) Collection.EL.stream(arrayList2).map(acxx.j).collect(Collectors.toList()));
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            adga adgaVar3 = (adga) arrayList2.get(i3);
            if (a.containsKey(adgaVar3.a) && !((Set) a.get(adgaVar3.a)).isEmpty()) {
                arrayList3.add(adgaVar3);
            }
        }
        adlm g2 = ((adlt) this.b.c.get()).g();
        if (g2 != null && !g2.ac() && (g2.k() instanceof adga) && !arrayList3.contains(g2.k())) {
            arrayList3.add((adga) g2.k());
        }
        this.a.b(null, arrayList3);
    }
}
