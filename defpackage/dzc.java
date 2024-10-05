package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dzc extends dyt {
    /* JADX INFO: Access modifiers changed from: protected */
    public dzc() {
        this.a.add(dzf.ADD);
        this.a.add(dzf.DIVIDE);
        this.a.add(dzf.MODULUS);
        this.a.add(dzf.MULTIPLY);
        this.a.add(dzf.NEGATE);
        this.a.add(dzf.POST_DECREMENT);
        this.a.add(dzf.POST_INCREMENT);
        this.a.add(dzf.PRE_DECREMENT);
        this.a.add(dzf.PRE_INCREMENT);
        this.a.add(dzf.SUBTRACT);
    }

    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        dzf dzfVar = dzf.ADD;
        int ordinal = esv.x(str).ordinal();
        if (ordinal == 0) {
            esv.A(dzf.ADD, 2, list);
            dyn b = dxkVar.b((dyn) list.get(0));
            dyn b2 = dxkVar.b((dyn) list.get(1));
            if ((b instanceof dyj) || (b instanceof dyq) || (b2 instanceof dyj) || (b2 instanceof dyq)) {
                String valueOf = String.valueOf(b.i());
                String valueOf2 = String.valueOf(b2.i());
                return new dyq(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new dyg(Double.valueOf(b.h().doubleValue() + b2.h().doubleValue()));
        }
        if (ordinal == 21) {
            esv.A(dzf.DIVIDE, 2, list);
            return new dyg(Double.valueOf(dxkVar.b((dyn) list.get(0)).h().doubleValue() / dxkVar.b((dyn) list.get(1)).h().doubleValue()));
        }
        if (ordinal == 59) {
            esv.A(dzf.SUBTRACT, 2, list);
            return new dyg(Double.valueOf(dxkVar.b((dyn) list.get(0)).h().doubleValue() + new dyg(Double.valueOf(-dxkVar.b((dyn) list.get(1)).h().doubleValue())).a.doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            esv.B(str, 2, list);
            dyn b3 = dxkVar.b((dyn) list.get(0));
            dxkVar.b((dyn) list.get(1));
            return b3;
        }
        if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    esv.A(dzf.MODULUS, 2, list);
                    return new dyg(Double.valueOf(dxkVar.b((dyn) list.get(0)).h().doubleValue() % dxkVar.b((dyn) list.get(1)).h().doubleValue()));
                case 45:
                    esv.A(dzf.MULTIPLY, 2, list);
                    return new dyg(Double.valueOf(dxkVar.b((dyn) list.get(0)).h().doubleValue() * dxkVar.b((dyn) list.get(1)).h().doubleValue()));
                case 46:
                    esv.A(dzf.NEGATE, 1, list);
                    return new dyg(Double.valueOf(-dxkVar.b((dyn) list.get(0)).h().doubleValue()));
                default:
                    return super.b(str);
            }
        }
        esv.B(str, 1, list);
        return dxkVar.b((dyn) list.get(0));
    }
}
