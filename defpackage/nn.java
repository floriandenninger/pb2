package defpackage;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nn extends pz {
    final /* synthetic */ no a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(no noVar, Window.Callback callback) {
        super(callback);
        this.a = noVar;
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.a.a.b());
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.pz, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            no noVar = this.a;
            if (!noVar.b) {
                noVar.a.n();
                this.a.b = true;
                return true;
            }
        }
        return onPreparePanel;
    }
}
