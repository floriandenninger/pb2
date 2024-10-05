package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyx implements Comparator {
    final /* synthetic */ dyh a;
    final /* synthetic */ dxk b;

    public dyx(dyh dyhVar, dxk dxkVar) {
        this.a = dyhVar;
        this.b = dxkVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        dyn dynVar = (dyn) obj;
        dyn dynVar2 = (dyn) obj2;
        dyh dyhVar = this.a;
        dxk dxkVar = this.b;
        if (dynVar instanceof dyr) {
            return !(dynVar2 instanceof dyr) ? 1 : 0;
        }
        if (dynVar2 instanceof dyr) {
            return -1;
        }
        if (dyhVar == null) {
            return dynVar.i().compareTo(dynVar2.i());
        }
        return (int) esv.u(dyhVar.a(dxkVar, Arrays.asList(dynVar, dynVar2)).h().doubleValue());
    }
}
