package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dzb extends dyt {
    /* JADX INFO: Access modifiers changed from: protected */
    public dzb() {
        this.a.add(dzf.FOR_IN);
        this.a.add(dzf.FOR_IN_CONST);
        this.a.add(dzf.FOR_IN_LET);
        this.a.add(dzf.FOR_LET);
        this.a.add(dzf.FOR_OF);
        this.a.add(dzf.FOR_OF_CONST);
        this.a.add(dzf.FOR_OF_LET);
        this.a.add(dzf.WHILE);
    }

    private static dyn c(dza dzaVar, Iterator it, dyn dynVar) {
        if (it != null) {
            while (it.hasNext()) {
                dyn c = dzaVar.a((dyn) it.next()).c((dyd) dynVar);
                if (c instanceof dyf) {
                    dyf dyfVar = (dyf) c;
                    if ("break".equals(dyfVar.b)) {
                        return dyn.f;
                    }
                    if ("return".equals(dyfVar.b)) {
                        return dyfVar;
                    }
                }
            }
        }
        return dyn.f;
    }

    private static dyn d(dza dzaVar, dyn dynVar, dyn dynVar2) {
        return c(dzaVar, dynVar.l(), dynVar2);
    }

    private static dyn e(dza dzaVar, dyn dynVar, dyn dynVar2) {
        if (dynVar instanceof Iterable) {
            return c(dzaVar, ((Iterable) dynVar).iterator(), dynVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        dzf dzfVar = dzf.ADD;
        int ordinal = esv.x(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    esv.A(dzf.FOR_IN, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    }
                    String i = ((dyn) list.get(0)).i();
                    return d(new dyz(dxkVar, i, 2), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                case 27:
                    esv.A(dzf.FOR_IN_CONST, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    }
                    String i2 = ((dyn) list.get(0)).i();
                    return d(new dyz(dxkVar, i2, 1), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                case 28:
                    esv.A(dzf.FOR_IN_LET, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    }
                    String i3 = ((dyn) list.get(0)).i();
                    return d(new dyz(dxkVar, i3, 0), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                case 29:
                    esv.A(dzf.FOR_LET, 4, list);
                    dyn b = dxkVar.b((dyn) list.get(0));
                    if (!(b instanceof dyd)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    }
                    dyd dydVar = (dyd) b;
                    dyn dynVar = (dyn) list.get(1);
                    dyn dynVar2 = (dyn) list.get(2);
                    dyn b2 = dxkVar.b((dyn) list.get(3));
                    dxk a = dxkVar.a();
                    for (int i4 = 0; i4 < dydVar.c(); i4++) {
                        String i5 = dydVar.e(i4).i();
                        a.g(i5, dxkVar.d(i5));
                    }
                    while (dxkVar.b(dynVar).g().booleanValue()) {
                        dyn c = dxkVar.c((dyd) b2);
                        if (c instanceof dyf) {
                            dyf dyfVar = (dyf) c;
                            if ("break".equals(dyfVar.b)) {
                                return dyn.f;
                            }
                            if ("return".equals(dyfVar.b)) {
                                return dyfVar;
                            }
                        }
                        dxk a2 = dxkVar.a();
                        for (int i6 = 0; i6 < dydVar.c(); i6++) {
                            String i7 = dydVar.e(i6).i();
                            a2.g(i7, a.d(i7));
                        }
                        a2.b(dynVar2);
                        a = a2;
                    }
                    return dyn.f;
                case 30:
                    esv.A(dzf.FOR_OF, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    }
                    String i8 = ((dyn) list.get(0)).i();
                    return e(new dyz(dxkVar, i8, 2), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                case 31:
                    esv.A(dzf.FOR_OF_CONST, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    }
                    String i9 = ((dyn) list.get(0)).i();
                    return e(new dyz(dxkVar, i9, 1), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                case 32:
                    esv.A(dzf.FOR_OF_LET, 3, list);
                    if (!(list.get(0) instanceof dyq)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    }
                    String i10 = ((dyn) list.get(0)).i();
                    return e(new dyz(dxkVar, i10, 0), dxkVar.b((dyn) list.get(1)), dxkVar.b((dyn) list.get(2)));
                default:
                    return super.b(str);
            }
        }
        esv.A(dzf.WHILE, 4, list);
        dyn dynVar3 = (dyn) list.get(0);
        dyn dynVar4 = (dyn) list.get(1);
        dyn dynVar5 = (dyn) list.get(2);
        dyn b3 = dxkVar.b((dyn) list.get(3));
        if (dxkVar.b(dynVar5).g().booleanValue()) {
            dyn c2 = dxkVar.c((dyd) b3);
            if (c2 instanceof dyf) {
                dyf dyfVar2 = (dyf) c2;
                if ("break".equals(dyfVar2.b)) {
                    return dyn.f;
                }
                if ("return".equals(dyfVar2.b)) {
                    return dyfVar2;
                }
            }
        }
        while (dxkVar.b(dynVar3).g().booleanValue()) {
            dyn c3 = dxkVar.c((dyd) b3);
            if (c3 instanceof dyf) {
                dyf dyfVar3 = (dyf) c3;
                if ("break".equals(dyfVar3.b)) {
                    return dyn.f;
                }
                if ("return".equals(dyfVar3.b)) {
                    return dyfVar3;
                }
            }
            dxkVar.b(dynVar4);
        }
        return dyn.f;
    }
}
