package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajmb implements View.OnDragListener {
    final /* synthetic */ ajmc a;

    public ajmb(ajmc ajmcVar) {
        this.a = ajmcVar;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 3) {
            dragEvent.getY();
            return true;
        }
        if (action != 4) {
            return true;
        }
        int y = (int) dragEvent.getY();
        ajmc ajmcVar = this.a;
        int i = ajmcVar.e ? y - 30 : y - 60;
        if (i < 36) {
            i = 36;
        }
        ajmcVar.b.setPadding(0, i, 0, 0);
        return true;
    }
}
