package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrk implements akrj, ypd {
    public final Map a = new HashMap();
    private final azrw b;

    public akrk(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.akrj
    public final void a(String str, Bundle bundle) {
        if (this.a.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // defpackage.akrj
    public final void b(Bundle bundle) {
    }

    public final void c() {
        ((ypa) this.b.get()).g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aapm.class, aftm.class};
        }
        if (i != 0) {
            if (i == 1) {
                this.a.clear();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        askp[] a = ((aapm) obj).a();
        if (a == null) {
            return null;
        }
        for (askp askpVar : a) {
            this.a.put(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
        }
        return null;
    }
}
