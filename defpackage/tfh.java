package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfh implements tfi {
    public final anib a;
    public final Set b;

    public tfh(anib anibVar, Set set) {
        this.a = anibVar;
        this.b = set;
    }

    @Override // defpackage.tfi
    public final anhy a(final tfp tfpVar) {
        return anaf.T(amjk.b(new anfy() { // from class: tfg
            @Override // defpackage.anfy
            public final anhy a() {
                tfh tfhVar = tfh.this;
                tfp tfpVar2 = tfpVar;
                int i = 1;
                ArrayList arrayList = new ArrayList(1);
                amxd listIterator = ((amwf) tfhVar.b).listIterator();
                while (listIterator.hasNext()) {
                    arrayList.add(((tfi) listIterator.next()).a(tfpVar2));
                }
                return anaf.J(arrayList).a(new adec(arrayList, i), tfhVar.a);
            }
        }), this.a);
    }
}
