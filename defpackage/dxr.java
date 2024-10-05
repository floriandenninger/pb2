package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxr extends dyh {
    final boolean a;
    final boolean b;
    final /* synthetic */ dxs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxr(dxs dxsVar, boolean z, boolean z2) {
        super("log");
        this.c = dxsVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        esv.D("log", 1, list);
        if (list.size() == 1) {
            this.c.a.a(3, dxkVar.b((dyn) list.get(0)).i(), Collections.emptyList(), this.a, this.b);
            return f;
        }
        int v = esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue());
        int i = v != 2 ? v != 3 ? v != 5 ? v != 6 ? 3 : 2 : 5 : 1 : 4;
        String i2 = dxkVar.b((dyn) list.get(1)).i();
        if (list.size() == 2) {
            this.c.a.a(i, i2, Collections.emptyList(), this.a, this.b);
            return f;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
            arrayList.add(dxkVar.b((dyn) list.get(i3)).i());
        }
        this.c.a.a(i, i2, arrayList, this.a, this.b);
        return f;
    }
}
