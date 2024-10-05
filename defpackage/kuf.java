package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kuf implements Runnable {
    final /* synthetic */ SuggestedActionsMainController a;
    private final /* synthetic */ int b;

    public kuf(SuggestedActionsMainController suggestedActionsMainController, int i) {
        this.b = i;
        this.a = suggestedActionsMainController;
    }

    public /* synthetic */ kuf(SuggestedActionsMainController suggestedActionsMainController, int i, byte[] bArr) {
        this.b = i;
        this.a = suggestedActionsMainController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            SuggestedActionsMainController suggestedActionsMainController = this.a;
            ViewGroup viewGroup = suggestedActionsMainController.h;
            if (viewGroup == null || viewGroup.getChildCount() == 0) {
                return;
            }
            avaz avazVar = (avaz) suggestedActionsMainController.h.getChildAt(0).getTag();
            if (avazVar != null) {
                suggestedActionsMainController.d.add(avazVar);
            }
            suggestedActionsMainController.k(new kuf(suggestedActionsMainController, 1, null));
            return;
        }
        this.a.j();
    }
}
