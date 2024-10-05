package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ps implements po {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final aeg d = new aeg();

    public ps(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        rh rhVar = new rh(this.b, menu);
        this.d.put(menu, rhVar);
        return rhVar;
    }

    @Override // defpackage.po
    public final void a(pp ppVar) {
        this.a.onDestroyActionMode(e(ppVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.po
    public final boolean b(pp ppVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(ppVar), new qz(this.b, menuItem));
    }

    @Override // defpackage.po
    public final boolean c(pp ppVar, Menu menu) {
        return this.a.onCreateActionMode(e(ppVar), f(menu));
    }

    @Override // defpackage.po
    public final boolean d(pp ppVar, Menu menu) {
        return this.a.onPrepareActionMode(e(ppVar), f(menu));
    }

    public final ActionMode e(pp ppVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            pt ptVar = (pt) this.c.get(i);
            if (ptVar != null && ptVar.b == ppVar) {
                return ptVar;
            }
        }
        pt ptVar2 = new pt(this.b, ppVar);
        this.c.add(ptVar2);
        return ptVar2;
    }
}
