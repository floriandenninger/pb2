package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class id {
    public qs a;

    public abstract View a();

    public View b(MenuItem menuItem) {
        return a();
    }

    public void c(SubMenu subMenu) {
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        throw null;
    }

    public boolean g() {
        return false;
    }

    public void h(qs qsVar) {
        if (this.a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = qsVar;
    }
}
