package defpackage;

import android.view.Choreographer;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acew implements Choreographer.FrameCallback {
    final /* synthetic */ LiveCreationActivity a;

    public acew(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.N.a();
        if (this.a.aL()) {
            this.a.ao(this);
        }
    }
}
