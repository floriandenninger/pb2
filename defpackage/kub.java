package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kub implements ayrs {
    public final /* synthetic */ SuggestedActionsMainController a;
    private final /* synthetic */ int b;

    public /* synthetic */ kub(SuggestedActionsMainController suggestedActionsMainController, int i) {
        this.b = i;
        this.a = suggestedActionsMainController;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b != 0) {
            SuggestedActionsMainController suggestedActionsMainController = this.a;
            kta ktaVar = (kta) obj;
            if (ktaVar.e()) {
                if (suggestedActionsMainController.d.contains(ktaVar.d())) {
                    return;
                }
                if (suggestedActionsMainController.h == null) {
                    azrw azrwVar = suggestedActionsMainController.l;
                    if (azrwVar == null) {
                        return;
                    }
                    suggestedActionsMainController.o = (yzr) azrwVar.get();
                    suggestedActionsMainController.h = (ViewGroup) suggestedActionsMainController.o.b;
                    suggestedActionsMainController.m();
                }
                ViewGroup viewGroup = suggestedActionsMainController.h;
                if (viewGroup == null || viewGroup.getChildCount() != 0) {
                    if (suggestedActionsMainController.f.a().getTag() != ktaVar.d()) {
                        suggestedActionsMainController.c.add(ktaVar.d());
                    }
                } else {
                    suggestedActionsMainController.l(ktaVar.d());
                }
            } else if (suggestedActionsMainController.f.a().getTag() == ktaVar.d()) {
                suggestedActionsMainController.k(null);
                suggestedActionsMainController.j();
            } else {
                suggestedActionsMainController.c.remove(ktaVar.d());
            }
            if (suggestedActionsMainController.f == null || ktaVar.a() == 0) {
                return;
            }
            ktz ktzVar = suggestedActionsMainController.f;
            ktzVar.d.a(ktaVar.a());
            return;
        }
        SuggestedActionsMainController suggestedActionsMainController2 = this.a;
        ahel ahelVar = (ahel) obj;
        if (ahelVar == null || ahelVar.a() == null) {
            return;
        }
        String Z = ahelVar.a().Z();
        if (TextUtils.equals(suggestedActionsMainController2.m, Z)) {
            return;
        }
        suggestedActionsMainController2.m = Z;
        suggestedActionsMainController2.n();
    }
}
