package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvk extends rwh {
    final /* synthetic */ rvo a;

    public rvk(rvo rvoVar) {
        this.a = rvoVar;
    }

    @Override // defpackage.rwh
    public final void d(Map map, rzk rzkVar) {
        this.a.c.clear();
        this.a.d.clear();
        if (map.isEmpty()) {
            return;
        }
        Boolean bool = (Boolean) this.a.b.s(rwn.a);
        Boolean valueOf = Boolean.valueOf(bool != null && bool.booleanValue());
        if (!this.a.a.isEnabled() || valueOf.booleanValue()) {
            return;
        }
        for (String str : map.keySet()) {
            rvo rvoVar = this.a;
            rvoVar.f.add(rvoVar.b.i(str));
        }
        if (this.a.b.k().equals(sax.d)) {
            this.a.d(rwh.r());
        } else {
            this.a.d(new TreeSet());
        }
        rvo rvoVar2 = this.a;
        rvoVar2.e = rwh.u(rvoVar2.c.size());
        List l = rvoVar2.b.l();
        for (int i = 0; i < l.size(); i++) {
            sba sbaVar = ((rvg) l.get(i)).a;
            saw c = ((rvg) l.get(i)).c();
            List list = sbaVar.a;
            for (int i2 = 0; i2 < sbaVar.a(); i2++) {
                Object a = c.a(list.get(i2), i2, sbaVar);
                if (!rvoVar2.e.containsKey(a)) {
                    Integer[] numArr = new Integer[l.size()];
                    Arrays.fill((Object[]) numArr, (Object) (-1));
                    rvoVar2.e.put(a, numArr);
                }
                ((Integer[]) rvoVar2.e.get(a))[i] = Integer.valueOf(i2);
            }
        }
    }
}
