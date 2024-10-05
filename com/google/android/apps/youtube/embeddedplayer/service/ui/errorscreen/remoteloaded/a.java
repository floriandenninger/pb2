package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class a extends FrameLayout {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Context context) {
        super(context);
        this.a = bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f fVar;
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            b bVar = this.a;
            if (bVar.c && (fVar = bVar.e) != null) {
                fVar.a.a.o();
            }
        }
        return true;
    }
}
