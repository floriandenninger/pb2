package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qw extends FrameLayout implements pq {
    final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public qw(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.pq
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.pq
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
