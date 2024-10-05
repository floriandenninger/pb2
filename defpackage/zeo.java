package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zeo extends wo {
    final /* synthetic */ zeq a;

    public zeo(zeq zeqVar) {
        this.a = zeqVar;
    }

    @Override // defpackage.wo, defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView == this.a.b && motionEvent.getAction() == 0) {
            for (SwipeLayout swipeLayout : this.a.a) {
                if (swipeLayout.isAttachedToWindow()) {
                    Rect rect = new Rect();
                    swipeLayout.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f)) && swipeLayout.r()) {
                        swipeLayout.f();
                    }
                }
            }
        }
        return false;
    }
}
