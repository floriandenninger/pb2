package defpackage;

import android.hardware.display.DisplayManager;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfa implements DisplayManager.DisplayListener {
    final /* synthetic */ LiveCreationActivity a;

    public acfa(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        this.a.aH();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
