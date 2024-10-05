package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sql extends dha {

    @dnt(a = 13)
    szx a;

    @dnt(a = 13)
    sww b;

    @dnt(a = 13)
    sxc c;

    @dnt(a = 13)
    sxi d;

    @dnt(a = 13)
    axot e;

    @dnt(a = 13)
    szx f;

    @dnt(a = 13)
    syd g;

    @dnt(a = 13)
    Map v;

    @dnt(a = 13)
    szl w;

    @dnt(a = 14)
    private sqk x;

    public sql() {
        super("ExpandableTextComponent");
        this.x = new sqk();
    }

    public static diy a(dhe dheVar, szx szxVar, szx szxVar2) {
        return H(sql.class, dheVar, 2076732558, new Object[]{dheVar, szxVar, szxVar2});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ff  */
    @Override // defpackage.dhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dha G(defpackage.dhe r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sql.G(dhe, int, int):dha");
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        int i = diyVar.b;
        if (i == -1048037474) {
            N((dhe) diyVar.c[0], (diw) obj);
            return null;
        }
        if (i != 2076732558) {
            return null;
        }
        dji djiVar = diyVar.a;
        Object[] objArr = diyVar.c;
        dhe dheVar = (dhe) objArr[0];
        szx szxVar = (szx) objArr[1];
        szx szxVar2 = (szx) objArr[2];
        sql sqlVar = (sql) djiVar;
        sww swwVar = sqlVar.b;
        sxc sxcVar = sqlVar.c;
        boolean booleanValue = sqlVar.x.a.booleanValue();
        if (dheVar.f != null) {
            dheVar.g(new dlp(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
        }
        sws a = swu.a();
        a.h = sxcVar.u;
        sxj sxjVar = sxcVar.r;
        if (sxjVar != null) {
            a.f = sxjVar;
        }
        if (booleanValue) {
            if (szxVar2 != null) {
                swwVar.b(szxVar2.a(), a.a()).Q();
            }
        } else if (szxVar != null) {
            swwVar.b(szxVar.a(), a.a()).Q();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baqlVar.a = false;
        this.x.a = (Boolean) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((sqk) dlqVar2).a = ((sqk) dlqVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        sql sqlVar = (sql) super.j();
        sqlVar.x = new sqk();
        return sqlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.x;
    }
}
