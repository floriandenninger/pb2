package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class viu implements vjf {
    private final qlm a;
    private final String b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private final String e;

    public viu(Context context, String str) {
        qlm qlmVar = new qlm(context, str, null);
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = "";
        if (str.startsWith("STREAMZ_")) {
            this.a = qlmVar;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    @Override // defpackage.vjf
    public final void a(vje vjeVar) {
        vjg vjgVar = new vjg(vjeVar);
        if (vjgVar.a.b.size() != 0) {
            qli b = this.a.b(vjgVar);
            b.j = this.b;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!b.a.f()) {
                    if (b.f == null) {
                        b.f = new ArrayList();
                    }
                    b.f.add(str);
                } else {
                    throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                }
            }
            if (!this.e.isEmpty()) {
                String str2 = this.e;
                axkl axklVar = b.c;
                axklVar.copyOnWrite();
                ((axkm) axklVar.instance).s("");
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                b = ((vit) it2.next()).a();
            }
            b.b();
        }
    }
}
