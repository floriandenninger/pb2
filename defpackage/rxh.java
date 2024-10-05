package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxh extends rwr {
    public Map e;

    public rxh(int i) {
        super(i);
        this.e = rwh.u(i);
    }

    @Override // defpackage.rwr
    public final void e(Object obj, int i) {
        this.e.put(obj, Integer.valueOf(i));
    }

    @Override // defpackage.rwr
    public final void f() {
        List list = this.a;
        Map map = this.e;
        if (map == null) {
            this.e = rwh.u(list.size());
        } else {
            map.clear();
        }
        for (int i = 0; i < this.d; i++) {
            this.e.put(list.get(i), Integer.valueOf(i));
        }
    }

    public rxh(rxi rxiVar) {
        super(rxiVar);
    }
}
