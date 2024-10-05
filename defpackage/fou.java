package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fou {
    public final ActiveStateScrollSelectionController a;

    public fou() {
    }

    public fou(ActiveStateScrollSelectionController activeStateScrollSelectionController) {
        this.a = activeStateScrollSelectionController;
    }

    public static fot a() {
        return new fot();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fou)) {
            return false;
        }
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.a;
        ActiveStateScrollSelectionController activeStateScrollSelectionController2 = ((fou) obj).a;
        if (activeStateScrollSelectionController == null) {
            return activeStateScrollSelectionController2 == null;
        }
        return activeStateScrollSelectionController.equals(activeStateScrollSelectionController2);
    }

    public final int hashCode() {
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.a;
        return (activeStateScrollSelectionController == null ? 0 : activeStateScrollSelectionController.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("MainAppElementsUserData{activeStateScrollSelectionController=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
