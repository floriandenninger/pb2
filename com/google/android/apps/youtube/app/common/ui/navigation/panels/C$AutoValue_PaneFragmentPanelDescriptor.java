package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.common.ui.navigation.panels.$AutoValue_PaneFragmentPanelDescriptor, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_PaneFragmentPanelDescriptor extends PaneFragmentPanelDescriptor {
    public final PaneDescriptor a;

    public C$AutoValue_PaneFragmentPanelDescriptor(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            throw new NullPointerException("Null paneDescriptor");
        }
        this.a = paneDescriptor;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor
    public final PaneDescriptor a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaneFragmentPanelDescriptor) {
            return this.a.equals(((PaneFragmentPanelDescriptor) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("PaneFragmentPanelDescriptor{paneDescriptor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
