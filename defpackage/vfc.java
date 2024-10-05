package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vfc implements anfz {
    public final /* synthetic */ vfd a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ vfc(vfd vfdVar, int i, List list, int i2) {
        this.d = i2;
        this.a = vfdVar;
        this.c = i;
        this.b = list;
    }

    public /* synthetic */ vfc(vfd vfdVar, List list, int i, int i2) {
        this.d = i2;
        this.a = vfdVar;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.d == 0) {
            final vfd vfdVar = this.a;
            final List list = this.b;
            final int i = this.c;
            final aooy aooyVar = (aooy) obj;
            return anaf.H(list).b(amjk.b(new anfy() { // from class: vfa
                @Override // defpackage.anfy
                public final anhy a() {
                    vfd vfdVar2 = vfd.this;
                    aooy aooyVar2 = aooyVar;
                    int i2 = i;
                    List list2 = list;
                    anhy O = anaf.O(aooyVar2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (((Boolean) anaf.W((Future) list2.get(i3))).booleanValue()) {
                            final vez vezVar = (vez) vfdVar2.a.get(i3);
                            O = anfq.i(O, amjk.c(new anfz() { // from class: vfb
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    return vez.this.b((aooy) obj2);
                                }
                            }), angq.a);
                        }
                    }
                    return O;
                }
            }), vfdVar.b);
        }
        vfd vfdVar2 = this.a;
        int i2 = this.c;
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) anaf.W((Future) list2.get(i3))).booleanValue()) {
                arrayList.add(((vez) vfdVar2.a.get(i3)).a());
            }
        }
        return anaf.J(arrayList).a(anaf.aa(), angq.a);
    }
}
