package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxv extends dyh {
    final Map a;
    private final amsj b;

    public dxv(amsj amsjVar, byte[] bArr, byte[] bArr2) {
        super("require");
        this.a = new HashMap();
        this.b = amsjVar;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        dyn dynVar;
        esv.B("require", 1, list);
        String i = dxkVar.b((dyn) list.get(0)).i();
        if (this.a.containsKey(i)) {
            return (dyn) this.a.get(i);
        }
        amsj amsjVar = this.b;
        if (amsjVar.a.containsKey(i)) {
            try {
                dynVar = (dyn) ((Callable) amsjVar.a.get(i)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(i);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            dynVar = dyn.f;
        }
        if (dynVar instanceof dyh) {
            this.a.put(i, (dyh) dynVar);
        }
        return dynVar;
    }
}
