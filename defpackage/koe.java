package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class koe {
    private final Set a = new HashSet();
    private final azrw b;
    private boolean c;

    public koe(azrw azrwVar) {
        this.b = azrwVar;
    }

    public final void a(kod kodVar) {
        if (this.c) {
            kodVar.a((View) this.b.get());
        } else {
            this.a.add(kodVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.c) {
            return;
        }
        Object obj = this.b.get();
        this.c = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kod) it.next()).a((View) obj);
        }
        this.a.clear();
    }
}
