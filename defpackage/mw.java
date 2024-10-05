package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mw extends pz {
    final /* synthetic */ ne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ne neVar, Window.Callback callback) {
        super(callback);
        this.a = neVar;
    }

    final ActionMode a(ActionMode.Callback callback) {
        ps psVar = new ps(this.a.d, callback);
        pp g = this.a.g(psVar);
        if (g != null) {
            return psVar.e(g);
        }
        return null;
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.P(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            ne neVar = this.a;
            int keyCode = keyEvent.getKeyCode();
            lu c = neVar.c();
            if (c == null || !c.v(keyCode, keyEvent)) {
                nc ncVar = neVar.w;
                if (ncVar == null || !neVar.W(ncVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (neVar.w == null) {
                        nc V = neVar.V(0);
                        neVar.R(V, keyEvent);
                        boolean W = neVar.W(V, keyEvent.getKeyCode(), keyEvent);
                        V.k = false;
                        if (!W) {
                        }
                    }
                    return false;
                }
                nc ncVar2 = neVar.w;
                if (ncVar2 != null) {
                    ncVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof qq)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        lu c;
        super.onMenuOpened(i, menu);
        ne neVar = this.a;
        if (i == 108 && (c = neVar.c()) != null) {
            c.e(true);
        }
        return true;
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        ne neVar = this.a;
        if (i == 108) {
            lu c = neVar.c();
            if (c != null) {
                c.e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            nc V = neVar.V(0);
            if (V.m) {
                neVar.L(V, false);
            }
        }
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        qq qqVar = menu instanceof qq ? (qq) menu : null;
        if (i == 0) {
            if (qqVar == null) {
                return false;
            }
            i = 0;
        }
        if (qqVar != null) {
            qqVar.i = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (qqVar != null) {
            qqVar.i = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        qq qqVar = this.a.V(0).h;
        if (qqVar == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, qqVar, i);
        }
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.a.o ? a(callback) : super.onWindowStartingActionMode(callback);
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.o && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
