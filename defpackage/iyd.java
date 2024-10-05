package defpackage;

import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iyd {
    public final Object a;
    public final Object b;
    public final PanelsBackStack c;
    public final Fragment$SavedState d;
    public final Fragment$SavedState e;
    public final PanelDescriptor f;
    public final PanelDescriptor g;

    public iyd() {
    }

    public iyd(Object obj, Object obj2, PanelsBackStack panelsBackStack, Fragment$SavedState fragment$SavedState, Fragment$SavedState fragment$SavedState2, PanelDescriptor panelDescriptor, PanelDescriptor panelDescriptor2) {
        this.a = obj;
        this.b = obj2;
        this.c = panelsBackStack;
        this.d = fragment$SavedState;
        this.e = fragment$SavedState2;
        this.f = panelDescriptor;
        this.g = panelDescriptor2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iyd) {
            iyd iydVar = (iyd) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(iydVar.a) : iydVar.a == null) {
                Object obj3 = this.b;
                if (obj3 != null ? obj3.equals(iydVar.b) : iydVar.b == null) {
                    PanelsBackStack panelsBackStack = this.c;
                    if (panelsBackStack != null ? panelsBackStack.equals(iydVar.c) : iydVar.c == null) {
                        Fragment$SavedState fragment$SavedState = this.d;
                        if (fragment$SavedState != null ? fragment$SavedState.equals(iydVar.d) : iydVar.d == null) {
                            Fragment$SavedState fragment$SavedState2 = this.e;
                            if (fragment$SavedState2 != null ? fragment$SavedState2.equals(iydVar.e) : iydVar.e == null) {
                                PanelDescriptor panelDescriptor = this.f;
                                if (panelDescriptor != null ? panelDescriptor.equals(iydVar.f) : iydVar.f == null) {
                                    PanelDescriptor panelDescriptor2 = this.g;
                                    PanelDescriptor panelDescriptor3 = iydVar.g;
                                    if (panelDescriptor2 != null ? panelDescriptor2.equals(panelDescriptor3) : panelDescriptor3 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = "null".length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 225 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("RetainedState{superState=");
        sb.append("null");
        sb.append(", selectionPanelRetainedState=");
        sb.append(valueOf);
        sb.append(", detailPanelRetainedState=");
        sb.append(valueOf2);
        sb.append(", detailPanelsBackStack=");
        sb.append(valueOf3);
        sb.append(", selectionPanelSavedState=");
        sb.append(valueOf4);
        sb.append(", detailPanelSavedState=");
        sb.append(valueOf5);
        sb.append(", detailPanelRetainedDescriptor=");
        sb.append(valueOf6);
        sb.append(", selectionPanelRetainedDescriptor=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) ^ (-721379959)) * 1000003;
        Object obj2 = this.b;
        int hashCode2 = (hashCode ^ (obj2 == null ? 0 : obj2.hashCode())) * 1000003;
        PanelsBackStack panelsBackStack = this.c;
        int hashCode3 = (hashCode2 ^ (panelsBackStack == null ? 0 : panelsBackStack.hashCode())) * 1000003;
        Fragment$SavedState fragment$SavedState = this.d;
        int hashCode4 = (hashCode3 ^ (fragment$SavedState == null ? 0 : fragment$SavedState.hashCode())) * 1000003;
        Fragment$SavedState fragment$SavedState2 = this.e;
        int hashCode5 = (hashCode4 ^ (fragment$SavedState2 == null ? 0 : fragment$SavedState2.hashCode())) * 1000003;
        PanelDescriptor panelDescriptor = this.f;
        int hashCode6 = (hashCode5 ^ (panelDescriptor == null ? 0 : panelDescriptor.hashCode())) * 1000003;
        PanelDescriptor panelDescriptor2 = this.g;
        return hashCode6 ^ (panelDescriptor2 != null ? panelDescriptor2.hashCode() : 0);
    }
}
