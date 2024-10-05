package defpackage;

import android.app.Activity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amet {
    private final ci a;
    private final Set b;
    private boolean c = false;

    public amet(Activity activity, Set set) {
        this.a = (ci) activity;
        this.b = set;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        amxd listIterator = ((amvs) this.b).listIterator();
        while (listIterator.hasNext()) {
            this.a.getLifecycle().b((aoj) listIterator.next());
        }
        this.c = true;
    }
}
