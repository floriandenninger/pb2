package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjx implements zkl {
    private final zki a;
    private final Map b;
    private final abdl c;

    public zjx(abdl abdlVar, zki zkiVar, byte[] bArr, byte[] bArr2) {
        abdlVar.getClass();
        this.c = abdlVar;
        zkiVar.getClass();
        this.a = zkiVar;
        this.b = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0361 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c A[EDGE_INSN: B:78:0x015c->B:79:0x015c BREAK  A[LOOP:0: B:30:0x00ad->B:77:0x0157], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.aqig r18) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjx.a(aqig):void");
    }

    @Override // defpackage.zkl
    public final void b(Collection collection) {
        c(collection, null);
    }

    @Override // defpackage.zkl
    public final void c(Collection collection, zjz zjzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        this.c.a(arrayList, new zjw(this, collection, zjzVar));
    }
}
