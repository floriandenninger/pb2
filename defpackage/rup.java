package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rup implements View.OnTouchListener {
    final /* synthetic */ ruv a;

    public rup(ruv ruvVar) {
        this.a = ruvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ruv ruvVar = this.a;
        ruvVar.k.onTouchEvent(motionEvent);
        boolean z = ruvVar.l.onTouchEvent(motionEvent) || ruvVar.k.isInProgress();
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (z || action != 1) {
            return z;
        }
        rwm rwmVar = ruvVar.m;
        for (rwh rwhVar : rwmVar.b) {
            ruv ruvVar2 = rwmVar.a;
        }
        return false;
    }
}
