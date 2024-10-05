package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tha {
    private final int a;
    private final List d;
    private final SparseIntArray e;
    private final andp b = tfe.a();
    private final List c = new ArrayList();
    private final List f = new ArrayList();
    private final SparseIntArray g = new SparseIntArray();

    public tha(int i, int i2) {
        this.a = i;
        this.d = new ArrayList(i2);
        this.e = new SparseIntArray(i2);
    }

    public tgf b(tgb tgbVar, int i) {
        tgbVar.b = this.a;
        if (i == -1) {
            i = -1;
        }
        int size = this.d.size();
        aong aongVar = tgbVar.c;
        int f = tgbVar.f();
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        int i2 = f - 1;
        tgf tgfVar2 = tgf.a;
        if (f == 0) {
            throw null;
        }
        tgfVar.e = i2;
        tgfVar.b |= 2;
        andp andpVar = this.b;
        aong aongVar2 = tgbVar.c;
        ando andoVar = ((tgf) aongVar2.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        aone builder = andoVar.toBuilder();
        builder.copyOnWrite();
        ando andoVar2 = (ando) builder.instance;
        andpVar.getClass();
        andoVar2.e = andpVar;
        andoVar2.b |= 2048;
        builder.copyOnWrite();
        ando andoVar3 = (ando) builder.instance;
        andoVar3.b |= 1;
        andoVar3.c = size;
        ando andoVar4 = (ando) builder.build();
        aongVar2.copyOnWrite();
        tgf tgfVar3 = (tgf) aongVar2.instance;
        andoVar4.getClass();
        tgfVar3.d = andoVar4;
        tgfVar3.b |= 1;
        aoae aoaeVar = tgbVar.e;
        if (!aoaeVar.b.isEmpty()) {
            Iterator it = aoaeVar.b.iterator();
            while (it.hasNext()) {
                ((tgr) it.next()).e();
            }
        }
        tgf a = tgbVar.a();
        this.d.add(a);
        this.e.append(size, i);
        return a;
    }

    public thi c() {
        return new thi(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public void e(thh thhVar) {
        if (thhVar.b == 1) {
            amkq.E(this.e.valueAt(thhVar.c()) == -1);
        }
        this.c.add(thhVar);
    }

    public void f(tgb tgbVar, List list) {
        int r = anaf.r(((tgf) list.get(0)).e);
        if (r == 0 || r == 1) {
            e(new thh(2, list, this.f.size()));
            tgz tgzVar = new tgz(this);
            ando andoVar = ((tgf) tgbVar.c.instance).d;
            if (andoVar == null) {
                andoVar = ando.a;
            }
            andp andpVar = andoVar.e;
            if (andpVar == null) {
                andpVar = andp.a;
            }
            if ((andpVar.b & 2) != 0) {
                tgzVar.a(tgbVar);
                return;
            }
            return;
        }
        e(new thh(3, list, -1));
    }
}
