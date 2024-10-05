package defpackage;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pap implements Comparator {
    public ArrayList a;
    public boolean b;

    public final void a(pam pamVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        ArrayList arrayList = this.a;
        if (arrayList.contains(pamVar)) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            opn.k(!((pam) arrayList.get(i)).a.equals(pamVar.a));
        }
        arrayList.add(pamVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((pam) obj).a.compareTo(((pam) obj2).a);
    }
}
