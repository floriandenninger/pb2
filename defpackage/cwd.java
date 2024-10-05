package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwd implements cvz {
    private final List a;
    private final hy b;

    public cwd(List list, hy hyVar) {
        this.a = list;
        this.b = hyVar;
    }

    @Override // defpackage.cvz
    public final cvy a(Object obj, int i, int i2, cqn cqnVar) {
        cvy a;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        cqi cqiVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            cvz cvzVar = (cvz) this.a.get(i3);
            if (cvzVar.b(obj) && (a = cvzVar.a(obj, i, i2, cqnVar)) != null) {
                cqiVar = a.a;
                arrayList.add(a.c);
            }
        }
        if (arrayList.isEmpty() || cqiVar == null) {
            return null;
        }
        return new cvy(cqiVar, new cwc(arrayList, this.b));
    }

    @Override // defpackage.cvz
    public final boolean b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((cvz) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
