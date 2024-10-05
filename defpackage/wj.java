package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wj {
    final SparseArray a = new SparseArray();
    public int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final wi a(int i) {
        wi wiVar = (wi) this.a.get(i);
        if (wiVar != null) {
            return wiVar;
        }
        wi wiVar2 = new wi();
        this.a.put(i, wiVar2);
        return wiVar2;
    }

    public final wv b(int i) {
        wi wiVar = (wi) this.a.get(i);
        if (wiVar == null || wiVar.a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = wiVar.a;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((wv) arrayList.get(size)).r());
        return (wv) arrayList.remove(size);
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        for (int i = 0; i < this.a.size(); i++) {
            ((wi) this.a.valueAt(i)).a.clear();
        }
    }

    public final void e() {
        this.b--;
    }

    public final void f(wv wvVar) {
        int i = wvVar.f;
        ArrayList arrayList = a(i).a;
        int i2 = ((wi) this.a.get(i)).b;
        if (arrayList.size() >= 5) {
            return;
        }
        wvVar.l();
        arrayList.add(wvVar);
    }
}
