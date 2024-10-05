package com.google.android.apps.youtube.app.fragments.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.fragments.panels.$AutoValue_PanePanelsController_PanePanelsState, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_PanePanelsController_PanePanelsState extends PanePanelsController$PanePanelsState {
    public final PaneFragmentPanelDescriptor a;
    public final PaneFragmentPanelDescriptor b;

    public C$AutoValue_PanePanelsController_PanePanelsState(PaneFragmentPanelDescriptor paneFragmentPanelDescriptor, PaneFragmentPanelDescriptor paneFragmentPanelDescriptor2) {
        if (paneFragmentPanelDescriptor == null) {
            throw new NullPointerException("Null selectionDescriptor");
        }
        this.a = paneFragmentPanelDescriptor;
        this.b = paneFragmentPanelDescriptor2;
    }

    @Override // com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState
    public final PaneFragmentPanelDescriptor a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState
    public final PaneFragmentPanelDescriptor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        PaneFragmentPanelDescriptor paneFragmentPanelDescriptor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PanePanelsController$PanePanelsState) {
            PanePanelsController$PanePanelsState panePanelsController$PanePanelsState = (PanePanelsController$PanePanelsState) obj;
            if (this.a.equals(panePanelsController$PanePanelsState.b()) && ((paneFragmentPanelDescriptor = this.b) != null ? paneFragmentPanelDescriptor.equals(panePanelsController$PanePanelsState.a()) : panePanelsController$PanePanelsState.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        PaneFragmentPanelDescriptor paneFragmentPanelDescriptor = this.b;
        return hashCode ^ (paneFragmentPanelDescriptor == null ? 0 : paneFragmentPanelDescriptor.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("PanePanelsState{selectionDescriptor=");
        sb.append(valueOf);
        sb.append(", detailDescriptor=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
