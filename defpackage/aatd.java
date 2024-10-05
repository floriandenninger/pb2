package defpackage;

import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatd {
    private aovh a;
    private aovm b;
    private aqrh c;
    private List d;
    private List e;

    public aatd(aovh aovhVar) {
        this.a = aovhVar;
    }

    public aatd(List list, List list2, aovm aovmVar, aqrh aqrhVar) {
        ArrayList arrayList = new ArrayList(list.size());
        this.d = arrayList;
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(list2.size());
        this.e = arrayList2;
        arrayList2.addAll(list2);
        this.b = aovmVar;
        this.c = aqrhVar;
    }

    public final aovm a() {
        aovh aovhVar;
        if (this.b == null && (aovhVar = this.a) != null && (aovhVar.b & 1) != 0) {
            aulq aulqVar = aovhVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(AccountsListRenderer.googleAccountHeaderRenderer)) {
                aulq aulqVar2 = this.a.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                this.b = (aovm) aulqVar2.pX(AccountsListRenderer.googleAccountHeaderRenderer);
            }
        }
        return this.b;
    }

    public final aqrh b() {
        aovh aovhVar;
        if (this.c == null && (aovhVar = this.a) != null && (aovhVar.b & 4) != 0) {
            aqrh aqrhVar = aovhVar.f;
            if (aqrhVar == null) {
                aqrhVar = aqrh.a;
            }
            this.c = aqrhVar;
        }
        return this.c;
    }

    public final List d() {
        if (this.e == null) {
            aovh aovhVar = this.a;
            if (aovhVar == null || aovhVar.d.size() == 0) {
                this.e = Collections.emptyList();
            } else {
                this.e = new ArrayList();
                for (aovf aovfVar : this.a.d) {
                    if ((aovfVar.b & 1) != 0) {
                        List list = this.e;
                        aouz aouzVar = aovfVar.c;
                        if (aouzVar == null) {
                            aouzVar = aouz.a;
                        }
                        list.add(aouzVar);
                    }
                }
            }
        }
        return this.e;
    }

    public final List c() {
        aovh aovhVar;
        List list = this.d;
        if (list == null && (aovhVar = this.a) != null) {
            this.d = new ArrayList(aovhVar.c.size());
            for (aovg aovgVar : this.a.c) {
                if (aovgVar.b == 63434476) {
                    this.d.add(new aatc((aove) aovgVar.c));
                }
            }
        } else if (list == null) {
            this.d = Collections.emptyList();
        }
        return this.d;
    }
}
