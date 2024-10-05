package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zdc implements Runnable {
    final /* synthetic */ zde a;

    public zdc(zde zdeVar) {
        this.a = zdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        zde zdeVar = this.a;
        zdh zdhVar = zdeVar.c;
        if (zdhVar != null && (motionEvent = zdeVar.a) != null) {
            zdhVar.b(motionEvent);
        }
        this.a.c();
    }
}
