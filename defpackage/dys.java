package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dys extends dyt {
    public dys() {
        this.a.add(dzf.BITWISE_AND);
        this.a.add(dzf.BITWISE_LEFT_SHIFT);
        this.a.add(dzf.BITWISE_NOT);
        this.a.add(dzf.BITWISE_OR);
        this.a.add(dzf.BITWISE_RIGHT_SHIFT);
        this.a.add(dzf.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(dzf.BITWISE_XOR);
    }

    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        dzf dzfVar = dzf.ADD;
        switch (esv.x(str).ordinal()) {
            case 4:
                esv.A(dzf.BITWISE_AND, 2, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) & esv.v(dxkVar.b((dyn) list.get(1)).h().doubleValue())));
            case 5:
                esv.A(dzf.BITWISE_LEFT_SHIFT, 2, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) << ((int) (esv.w(dxkVar.b((dyn) list.get(1)).h().doubleValue()) & 31))));
            case 6:
                esv.A(dzf.BITWISE_NOT, 1, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) ^ (-1)));
            case 7:
                esv.A(dzf.BITWISE_OR, 2, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) | esv.v(dxkVar.b((dyn) list.get(1)).h().doubleValue())));
            case 8:
                esv.A(dzf.BITWISE_RIGHT_SHIFT, 2, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) >> ((int) (esv.w(dxkVar.b((dyn) list.get(1)).h().doubleValue()) & 31))));
            case 9:
                esv.A(dzf.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new dyg(Double.valueOf(esv.w(dxkVar.b((dyn) list.get(0)).h().doubleValue()) >>> ((int) (esv.w(dxkVar.b((dyn) list.get(1)).h().doubleValue()) & 31))));
            case 10:
                esv.A(dzf.BITWISE_XOR, 2, list);
                return new dyg(Double.valueOf(esv.v(dxkVar.b((dyn) list.get(0)).h().doubleValue()) ^ esv.v(dxkVar.b((dyn) list.get(1)).h().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
