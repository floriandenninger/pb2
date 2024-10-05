package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class euv {
    private final azrw a;
    private final atud b;
    private final Map c;
    private final euw d;

    public euv(azrw azrwVar, wng wngVar) {
        euw eusVar;
        this.a = azrwVar;
        Object b = wngVar.b();
        if (b instanceof atud) {
            this.b = (atud) b;
        } else {
            this.b = null;
        }
        this.c = new HashMap();
        atud atudVar = this.b;
        int i = (atudVar == null || (i = aobq.bi(atudVar.c)) == 0) ? 1 : i;
        atud atudVar2 = this.b;
        int i2 = atudVar2 != null ? atudVar2.b : 0;
        boolean z = atudVar2 != null && atudVar2.d;
        boolean z2 = atudVar2 != null && atudVar2.e;
        String d = d();
        if (i - 1 == 1) {
            eusVar = new eus(azrwVar, i2, z, z2, d);
        } else {
            eusVar = new eut(azrwVar, i2, z, z2, d);
        }
        this.d = eusVar;
    }

    private final String d() {
        atud atudVar = this.b;
        return atudVar != null ? atudVar.f : "";
    }

    public final Object a(eux euxVar, Class cls, String str) {
        Object obj = this.c.get(euxVar);
        if (!cls.isInstance(obj)) {
            return null;
        }
        Object cast = cls.cast(obj);
        this.d.d(euxVar, str, null, true);
        return cast;
    }

    public final Object b(String str, Class cls, String str2, euu euuVar) {
        return c(str, cls, str2, euuVar, null);
    }

    public final Object c(String str, Class cls, String str2, euu euuVar, Object obj) {
        eux euxVar = new eux(str, cls);
        Object a = a(euxVar, cls, str2);
        if (a == null) {
            a = euuVar.a();
            if (ammx.e(euxVar.a)) {
                ((viz) ((aksl) this.a.get()).e.get()).b(ammx.d(str2), d());
            }
            this.c.put(euxVar, a);
            if (this.d.f(euxVar)) {
                ((viz) ((aksl) this.a.get()).f.get()).b(ammx.d(str2), d());
            }
            this.d.d(euxVar, str2, obj, false);
            if (this.d.e()) {
                ArrayList arrayList = new ArrayList();
                this.d.c(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    eux euxVar2 = (eux) arrayList.get(i);
                    this.c.remove(euxVar2);
                    this.d.b(euxVar2);
                }
            }
        }
        return a;
    }
}
