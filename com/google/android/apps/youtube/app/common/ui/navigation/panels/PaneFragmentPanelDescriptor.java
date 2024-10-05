package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PaneFragmentPanelDescriptor implements PanelDescriptor {
    public static PaneFragmentPanelDescriptor b(PaneDescriptor paneDescriptor) {
        return new AutoValue_PaneFragmentPanelDescriptor(paneDescriptor);
    }

    public abstract PaneDescriptor a();

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final Optional c() {
        return Optional.ofNullable(a().d());
    }

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final /* synthetic */ String d() {
        return null;
    }
}
