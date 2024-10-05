package defpackage;

import android.content.ClipData;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajma implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        view.startDrag(new ClipData("", new String[0], new ClipData.Item("")), new View.DragShadowBuilder(view), null, 0);
        return true;
    }
}
