package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyv extends dyt {
    public dyv() {
        this.a.add(dzf.EQUALS);
        this.a.add(dzf.GREATER_THAN);
        this.a.add(dzf.GREATER_THAN_EQUALS);
        this.a.add(dzf.IDENTITY_EQUALS);
        this.a.add(dzf.IDENTITY_NOT_EQUALS);
        this.a.add(dzf.LESS_THAN);
        this.a.add(dzf.LESS_THAN_EQUALS);
        this.a.add(dzf.NOT_EQUALS);
    }

    private static boolean c(dyn dynVar, dyn dynVar2) {
        if (dynVar.getClass().equals(dynVar2.getClass())) {
            if ((dynVar instanceof dyr) || (dynVar instanceof dyl)) {
                return true;
            }
            if (dynVar instanceof dyg) {
                if (Double.isNaN(dynVar.h().doubleValue()) || Double.isNaN(dynVar2.h().doubleValue())) {
                    return false;
                }
                return dynVar.h().equals(dynVar2.h());
            }
            if (dynVar instanceof dyq) {
                return dynVar.i().equals(dynVar2.i());
            }
            if (dynVar instanceof dye) {
                return dynVar.g().equals(dynVar2.g());
            }
            return dynVar == dynVar2;
        }
        if (((dynVar instanceof dyr) || (dynVar instanceof dyl)) && ((dynVar2 instanceof dyr) || (dynVar2 instanceof dyl))) {
            return true;
        }
        boolean z = dynVar instanceof dyg;
        if (!z || !(dynVar2 instanceof dyq)) {
            boolean z2 = dynVar instanceof dyq;
            if (!z2 || !(dynVar2 instanceof dyg)) {
                if (dynVar instanceof dye) {
                    return c(new dyg(dynVar.h()), dynVar2);
                }
                if (dynVar2 instanceof dye) {
                    return c(dynVar, new dyg(dynVar2.h()));
                }
                if ((!z2 && !z) || !(dynVar2 instanceof dyj)) {
                    if ((dynVar instanceof dyj) && ((dynVar2 instanceof dyq) || (dynVar2 instanceof dyg))) {
                        return c(new dyq(dynVar.i()), dynVar2);
                    }
                    return false;
                }
                return c(dynVar, new dyq(dynVar2.i()));
            }
            return c(new dyg(dynVar.h()), dynVar2);
        }
        return c(dynVar, new dyg(dynVar2.h()));
    }

    private static boolean d(dyn dynVar, dyn dynVar2) {
        if (dynVar instanceof dyj) {
            dynVar = new dyq(dynVar.i());
        }
        if (dynVar2 instanceof dyj) {
            dynVar2 = new dyq(dynVar2.i());
        }
        if ((dynVar instanceof dyq) && (dynVar2 instanceof dyq)) {
            return dynVar.i().compareTo(dynVar2.i()) < 0;
        }
        double doubleValue = dynVar.h().doubleValue();
        double doubleValue2 = dynVar2.h().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || Double.compare(doubleValue, doubleValue2) >= 0) ? false : true;
    }

    private static boolean e(dyn dynVar, dyn dynVar2) {
        if (dynVar instanceof dyj) {
            dynVar = new dyq(dynVar.i());
        }
        if (dynVar2 instanceof dyj) {
            dynVar2 = new dyq(dynVar2.i());
        }
        return (((dynVar instanceof dyq) && (dynVar2 instanceof dyq)) || !(Double.isNaN(dynVar.h().doubleValue()) || Double.isNaN(dynVar2.h().doubleValue()))) && !d(dynVar2, dynVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0038. Please report as an issue. */
    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        boolean c;
        boolean c2;
        esv.A(esv.x(str), 2, list);
        dyn b = dxkVar.b((dyn) list.get(0));
        dyn b2 = dxkVar.b((dyn) list.get(1));
        dzf dzfVar = dzf.ADD;
        int ordinal = esv.x(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c2 = c(b, b2);
            } else if (ordinal == 42) {
                c = d(b, b2);
            } else if (ordinal == 43) {
                c = e(b, b2);
            } else {
                switch (ordinal) {
                    case 37:
                        c = d(b2, b);
                        break;
                    case 38:
                        c = e(b2, b);
                        break;
                    case 39:
                        c = esv.G(b, b2);
                        break;
                    case 40:
                        c2 = esv.G(b, b2);
                        break;
                    default:
                        return super.b(str);
                }
            }
            c = !c2;
        } else {
            c = c(b, b2);
        }
        return c ? dyn.k : dyn.l;
    }
}
