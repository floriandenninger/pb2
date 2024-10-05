package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.ahbl;
import defpackage.ahvo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ae extends FrameLayout {
    final /* synthetic */ ak a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ak akVar, Context context) {
        super(context);
        this.a = akVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a.H();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = !keyEvent.isSystem() || ahbl.b(i);
        if (z) {
            this.a.pA();
        }
        if (this.a.H.a != ahvo.RECOVERABLE_ERROR || !z || i == 20 || i == 21 || i == 22 || i == 19) {
            return super.onKeyDown(i, keyEvent);
        }
        this.a.b.o();
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() != 1 || this.a.H.a != ahvo.RECOVERABLE_ERROR) {
            ak akVar = this.a;
            if (akVar.N) {
                akVar.c.d(akVar.g, motionEvent);
            } else if (motionEvent.getActionMasked() == 1) {
                this.a.f.b(motionEvent);
            }
            return true;
        }
        this.a.b.o();
        return true;
    }
}
