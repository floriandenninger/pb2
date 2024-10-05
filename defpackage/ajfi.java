package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajfi extends alkd {
    final /* synthetic */ ajfj a;
    private final Set c;

    public ajfi(ajfj ajfjVar) {
        this.a = ajfjVar;
        this.c = new CopyOnWriteArraySet(ajfjVar.a);
    }

    @Override // defpackage.alkd
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        akbq akbqVar = ((ajfa) obj).a;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((akbl) it.next()).li(akbqVar, i);
        }
        this.c.clear();
        ajfj ajfjVar = this.a;
        akbq akbqVar2 = ajfjVar.c;
        if (akbqVar2 == null || akbqVar2 == akbqVar) {
            ViewGroup viewGroup = ajfjVar.b;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                ajfjVar.b.setVisibility(ajfjVar.e);
            }
            ajfjVar.d = null;
            ajfjVar.c = null;
        }
    }

    @Override // defpackage.alkd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ajfa ajfaVar = (ajfa) obj;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((akbl) it.next()).lj(ajfaVar.a);
        }
    }
}
