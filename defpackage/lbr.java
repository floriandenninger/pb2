package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lbr implements ActionMode.Callback {
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.setTag(fzb.a);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
