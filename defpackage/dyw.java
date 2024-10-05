package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyw extends dyt {
    /* JADX INFO: Access modifiers changed from: protected */
    public dyw() {
        this.a.add(dzf.APPLY);
        this.a.add(dzf.BLOCK);
        this.a.add(dzf.BREAK);
        this.a.add(dzf.CASE);
        this.a.add(dzf.DEFAULT);
        this.a.add(dzf.CONTINUE);
        this.a.add(dzf.DEFINE_FUNCTION);
        this.a.add(dzf.FN);
        this.a.add(dzf.IF);
        this.a.add(dzf.QUOTE);
        this.a.add(dzf.RETURN);
        this.a.add(dzf.SWITCH);
        this.a.add(dzf.TERNARY);
    }

    private static dyn c(dxk dxkVar, List list) {
        esv.C(dzf.FN, 2, list);
        dyn b = dxkVar.b((dyn) list.get(0));
        dyn b2 = dxkVar.b((dyn) list.get(1));
        if (!(b2 instanceof dyd)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
        }
        List m = ((dyd) b2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new dym(b.i(), m, arrayList, dxkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0119, code lost:
    
        if (r8.equals("continue") == false) goto L64;
     */
    @Override // defpackage.dyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dyn a(java.lang.String r8, defpackage.dxk r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyw.a(java.lang.String, dxk, java.util.List):dyn");
    }
}
