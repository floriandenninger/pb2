package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acud {
    private final afuh b;
    private final afxf c;
    private final String d;
    public final Map a = new HashMap();
    private final acuc e = new acuc(this);

    public acud(afuh afuhVar, afxf afxfVar, String str) {
        afuhVar.getClass();
        this.b = afuhVar;
        afxfVar.getClass();
        this.c = afxfVar;
        this.d = str;
    }

    private final void d(asus asusVar) {
        if (asusVar == null || (asusVar.b & 1) == 0) {
            return;
        }
        try {
            Uri a = this.c.a(Uri.parse(asusVar.c), this.e);
            if (a == null) {
                return;
            }
            afug d = afuh.d(this.d);
            d.b(a);
            d.a(new acub((asur[]) asusVar.d.toArray(new asur[0]), 0));
            this.b.a(d, afxi.a);
        } catch (zjg unused) {
            zga.l("Error substituting macros in URI.");
        }
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((asus) it.next());
        }
    }

    public final void b(asus[] asusVarArr) {
        if (asusVarArr == null) {
            return;
        }
        for (asus asusVar : asusVarArr) {
            d(asusVar);
        }
    }

    public final void c(String str, String str2) {
        if (str2 != null) {
            this.a.put(str, str2);
        } else {
            this.a.remove(str);
        }
    }
}
