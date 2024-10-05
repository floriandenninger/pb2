package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class veh implements vcv {
    public vdf[] a;

    private veh() {
    }

    public static veh b() {
        return new veh();
    }

    @Override // defpackage.vcv
    public final /* bridge */ /* synthetic */ Object a(vcu vcuVar) {
        OutputStream f = vcuVar.b.f(vcuVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        if (!vcuVar.d.isEmpty()) {
            List list = vcuVar.d;
            Uri uri = vcuVar.e;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vel b = ((vem) it.next()).b(uri);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            vcs vcsVar = !arrayList2.isEmpty() ? new vcs(f, arrayList2) : null;
            if (vcsVar != null) {
                arrayList.add(vcsVar);
            }
        }
        for (ven venVar : vcuVar.c) {
            arrayList.add(venVar.f());
        }
        Collections.reverse(arrayList);
        vdf[] vdfVarArr = this.a;
        if (vdfVarArr != null) {
            vdf vdfVar = vdfVarArr[0];
            Closeable closeable = (OutputStream) amkq.bj(arrayList);
            if (closeable instanceof vdr) {
                vdfVar.b = (vdr) closeable;
                vdfVar.a = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
