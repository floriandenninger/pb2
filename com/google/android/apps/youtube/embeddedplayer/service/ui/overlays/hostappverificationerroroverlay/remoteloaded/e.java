package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class e extends FrameLayout {
    final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context) {
        super(context);
        this.a = fVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            f fVar = this.a;
            if (fVar.b) {
                fVar.a.a();
            }
        }
        return true;
    }
}
