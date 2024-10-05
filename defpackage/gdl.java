package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdl implements aaha {
    private final MealbarPromoController a;
    private final acqz b;

    public gdl(MealbarPromoController mealbarPromoController, acqz acqzVar) {
        this.a = mealbarPromoController;
        this.b = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction)) {
            ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction) apxfVar.pX(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
            auub auubVar = showMealbarActionOuterClass$ShowMealbarAction.b;
            if (auubVar == null) {
                auubVar = auub.a;
            }
            if ((auubVar.b & 1) != 0) {
                auub auubVar2 = showMealbarActionOuterClass$ShowMealbarAction.b;
                if (auubVar2 == null) {
                    auubVar2 = auub.a;
                }
                atcf atcfVar = auubVar2.c;
                if (atcfVar == null) {
                    atcfVar = atcf.a;
                }
                this.a.h(atcfVar, this.b.mM());
            }
        }
    }
}
