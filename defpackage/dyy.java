package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyy extends dyt {
    /* JADX INFO: Access modifiers changed from: protected */
    public dyy() {
        this.a.add(dzf.AND);
        this.a.add(dzf.NOT);
        this.a.add(dzf.OR);
    }

    @Override // defpackage.dyt
    public final dyn a(String str, dxk dxkVar, List list) {
        dzf dzfVar = dzf.ADD;
        int ordinal = esv.x(str).ordinal();
        if (ordinal == 1) {
            esv.A(dzf.AND, 2, list);
            dyn b = dxkVar.b((dyn) list.get(0));
            return !b.g().booleanValue() ? b : dxkVar.b((dyn) list.get(1));
        }
        if (ordinal == 47) {
            esv.A(dzf.NOT, 1, list);
            return new dye(Boolean.valueOf(!dxkVar.b((dyn) list.get(0)).g().booleanValue()));
        }
        if (ordinal == 50) {
            esv.A(dzf.OR, 2, list);
            dyn b2 = dxkVar.b((dyn) list.get(0));
            return b2.g().booleanValue() ? b2 : dxkVar.b((dyn) list.get(1));
        }
        return super.b(str);
    }
}
