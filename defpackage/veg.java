package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class veg implements vcv {
    public boolean a = false;

    private veg() {
    }

    public static veg b() {
        return new veg();
    }

    @Override // defpackage.vcv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a(vcu vcuVar) {
        InputStream d = vcuVar.b.d(vcuVar.f);
        if (this.a) {
            d = new BufferedInputStream(d);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        if (!vcuVar.d.isEmpty()) {
            List list = vcuVar.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((vem) it.next()).f();
            }
            vcr vcrVar = !arrayList2.isEmpty() ? new vcr(d, arrayList2) : null;
            if (vcrVar != null) {
                arrayList.add(vcrVar);
            }
        }
        for (ven venVar : vcuVar.c) {
            arrayList.add(venVar.e());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
