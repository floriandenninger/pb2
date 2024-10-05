package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihu extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ilm a;
    final /* synthetic */ ijz b;
    final /* synthetic */ ihv c;

    public ihu(ihv ihvVar, ilm ilmVar, ijz ijzVar) {
        this.c = ihvVar;
        this.a = ilmVar;
        this.b = ijzVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ily aG = this.a.aG();
        if (aG == null) {
            return;
        }
        this.c.c = true;
        aG.a();
        aG.performHapticFeedback(0);
        ijz ijzVar = this.b;
        if (ijzVar.e && ijzVar.g && ijzVar.h) {
            ijzVar.d();
            ijzVar.h(3, 134942);
        }
    }
}
