package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dze extends dyt {
    /* JADX INFO: Access modifiers changed from: protected */
    public dze() {
        this.a.add(dzf.ASSIGN);
        this.a.add(dzf.CONST);
        this.a.add(dzf.CREATE_ARRAY);
        this.a.add(dzf.CREATE_OBJECT);
        this.a.add(dzf.EXPRESSION_LIST);
        this.a.add(dzf.GET);
        this.a.add(dzf.GET_INDEX);
        this.a.add(dzf.GET_PROPERTY);
        this.a.add(dzf.NULL);
        this.a.add(dzf.SET_PROPERTY);
        this.a.add(dzf.TYPEOF);
        this.a.add(dzf.UNDEFINED);
        this.a.add(dzf.VAR);
    }

    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        String str2;
        dzf dzfVar = dzf.ADD;
        int ordinal = esv.x(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            esv.A(dzf.ASSIGN, 2, list);
            dyn b = dxkVar.b((dyn) list.get(0));
            if (!(b instanceof dyq)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
            }
            if (!dxkVar.h(b.i())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.i()));
            }
            dyn b2 = dxkVar.b((dyn) list.get(1));
            dxkVar.g(b.i(), b2);
            return b2;
        }
        if (ordinal == 14) {
            esv.C(dzf.CONST, 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    dyn b3 = dxkVar.b((dyn) list.get(i2));
                    if (b3 instanceof dyq) {
                        dxkVar.f(b3.i(), dxkVar.b((dyn) list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                    }
                }
                return dyn.f;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal == 24) {
            esv.C(dzf.EXPRESSION_LIST, 1, list);
            dyn dynVar = dyn.f;
            while (i < list.size()) {
                dynVar = dxkVar.b((dyn) list.get(i));
                if (dynVar instanceof dyf) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return dynVar;
        }
        if (ordinal == 33) {
            esv.A(dzf.GET, 1, list);
            dyn b4 = dxkVar.b((dyn) list.get(0));
            if (!(b4 instanceof dyq)) {
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b4.getClass().getCanonicalName()));
            }
            return dxkVar.d(b4.i());
        }
        if (ordinal == 49) {
            esv.A(dzf.NULL, 0, list);
            return dyn.g;
        }
        if (ordinal == 58) {
            esv.A(dzf.SET_PROPERTY, 3, list);
            dyn b5 = dxkVar.b((dyn) list.get(0));
            dyn b6 = dxkVar.b((dyn) list.get(1));
            dyn b7 = dxkVar.b((dyn) list.get(2));
            if (b5 == dyn.f || b5 == dyn.g) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b6.i(), b5.i()));
            }
            if (!(b5 instanceof dyd) || !(b6 instanceof dyg)) {
                if (b5 instanceof dyj) {
                    ((dyj) b5).r(b6.i(), b7);
                }
            } else {
                ((dyd) b5).q(b6.h().intValue(), b7);
            }
            return b7;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new dyd();
            }
            dyd dydVar = new dyd();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dyn b8 = dxkVar.b((dyn) it.next());
                if (!(b8 instanceof dyf)) {
                    dydVar.q(i, b8);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return dydVar;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new dyk();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            dyk dykVar = new dyk();
            while (i < list.size() - 1) {
                dyn b9 = dxkVar.b((dyn) list.get(i));
                dyn b10 = dxkVar.b((dyn) list.get(i + 1));
                if (!(b9 instanceof dyf) && !(b10 instanceof dyf)) {
                    dykVar.r(b9.i(), b10);
                    i += 2;
                } else {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
            }
            return dykVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            esv.A(dzf.GET_PROPERTY, 2, list);
            dyn b11 = dxkVar.b((dyn) list.get(0));
            dyn b12 = dxkVar.b((dyn) list.get(1));
            if (!(b11 instanceof dyd) || !esv.F(b12)) {
                if (b11 instanceof dyj) {
                    return ((dyj) b11).f(b12.i());
                }
                if (b11 instanceof dyq) {
                    if ("length".equals(b12.i())) {
                        return new dyg(Double.valueOf(b11.i().length()));
                    }
                    if (esv.F(b12) && b12.h().doubleValue() < b11.i().length()) {
                        return new dyq(String.valueOf(b11.i().charAt(b12.h().intValue())));
                    }
                }
                return dyn.f;
            }
            return ((dyd) b11).e(b12.h().intValue());
        }
        switch (ordinal) {
            case 62:
                esv.A(dzf.TYPEOF, 1, list);
                dyn b13 = dxkVar.b((dyn) list.get(0));
                if (b13 instanceof dyr) {
                    str2 = "undefined";
                } else if (b13 instanceof dye) {
                    str2 = "boolean";
                } else if (b13 instanceof dyg) {
                    str2 = "number";
                } else if (b13 instanceof dyq) {
                    str2 = "string";
                } else if (b13 instanceof dym) {
                    str2 = "function";
                } else {
                    if ((b13 instanceof dyo) || (b13 instanceof dyf)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                    }
                    str2 = "object";
                }
                return new dyq(str2);
            case 63:
                esv.A(dzf.UNDEFINED, 0, list);
                return dyn.f;
            case 64:
                esv.C(dzf.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dyn b14 = dxkVar.b((dyn) it2.next());
                    if (b14 instanceof dyq) {
                        dxkVar.e(b14.i(), dyn.f);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                    }
                }
                return dyn.f;
            default:
                return super.b(str);
        }
    }
}
