package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatc {
    public final boolean a;
    public final boolean b;
    private final aove c;
    private List d;

    public aatc(aove aoveVar) {
        aoveVar.getClass();
        this.c = aoveVar;
        this.a = false;
        aovc aovcVar = aoveVar.c;
        this.b = 1 == ((aovcVar == null ? aovc.a : aovcVar).b & 1);
    }

    public static aatc b(String str, aatb aatbVar) {
        zhq.m(str);
        return new aatc(str, aatbVar);
    }

    public final aatb a() {
        for (Object obj : c()) {
            if (obj instanceof aatb) {
                aatb aatbVar = (aatb) obj;
                if (!aatbVar.b()) {
                    return aatbVar;
                }
            }
        }
        return null;
    }

    public final List c() {
        if (this.d == null) {
            this.d = new ArrayList(this.c.b.size() + 1);
            aovc aovcVar = this.c.c;
            if (aovcVar == null) {
                aovcVar = aovc.a;
            }
            if ((aovcVar.b & 1) != 0) {
                List list = this.d;
                aovc aovcVar2 = this.c.c;
                if (aovcVar2 == null) {
                    aovcVar2 = aovc.a;
                }
                aovb aovbVar = aovcVar2.c;
                if (aovbVar == null) {
                    aovbVar = aovb.a;
                }
                list.add(aovbVar);
            }
            for (aovd aovdVar : this.c.b) {
                if (aovdVar.b == 62381864) {
                    this.d.add(new aata((aova) aovdVar.c));
                }
            }
            if (this.d == null) {
                this.d = Collections.emptyList();
            }
        }
        return this.d;
    }

    private aatc(String str, aatb aatbVar) {
        this.c = null;
        aone createBuilder = aovb.a.createBuilder();
        aqyg g = ajcq.g(str);
        createBuilder.copyOnWrite();
        aovb aovbVar = (aovb) createBuilder.instance;
        g.getClass();
        aovbVar.c = g;
        aovbVar.b |= 1;
        aovb aovbVar2 = (aovb) createBuilder.build();
        ArrayList arrayList = new ArrayList(2);
        this.d = arrayList;
        arrayList.add(aovbVar2);
        this.d.add(aatbVar);
        this.a = true;
        this.b = true;
    }
}
