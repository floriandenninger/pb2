package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpm implements anfz {
    public final /* synthetic */ tpp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tpm(tpp tppVar, int i) {
        this.b = i;
        this.a = tppVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.b == 0) {
            final tpp tppVar = this.a;
            final Boolean bool = (Boolean) obj;
            return anfq.i(tppVar.b.c(), new anfz() { // from class: tpj
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    final tpp tppVar2 = tpp.this;
                    final Boolean bool2 = bool;
                    final List list = (List) obj2;
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tppVar2.b.e((tlg) it.next()));
                    }
                    return anaf.H(arrayList).b(new anfy() { // from class: tpl
                        @Override // defpackage.anfy
                        public final anhy a() {
                            tpp tppVar3 = tpp.this;
                            List list2 = list;
                            List list3 = arrayList;
                            Boolean bool3 = bool2;
                            int i = 1;
                            anhy O = anaf.O(true);
                            for (int i2 = 0; i2 < list2.size(); i2++) {
                                O = anfq.i(O, new tpo(tppVar3, (tlg) list2.get(i2), (tlh) anaf.W((Future) list3.get(i2)), i), tppVar3.d);
                            }
                            return anfq.h(O, new lod(bool3, 7), tppVar3.d);
                        }
                    }, tppVar2.d);
                }
            }, tppVar.d);
        }
        tpp tppVar2 = this.a;
        return anfq.i(tppVar2.b(tppVar2.c.a()), new tph(tppVar2, (ttj) obj, 1), tppVar2.d);
    }
}
