package defpackage;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aced implements View.OnTouchListener {
    final /* synthetic */ GestureDetector a;
    final /* synthetic */ acei b;

    public aced(acei aceiVar, GestureDetector gestureDetector) {
        this.b = aceiVar;
        this.a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b.u;
        if (i == 1 || i == 4 || i == 7) {
            return false;
        }
        boolean onTouchEvent = this.a.onTouchEvent(motionEvent);
        if (onTouchEvent || motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        aceh acehVar = this.b.s;
        if (acehVar.b) {
            if (acehVar.c) {
                acehVar.c = false;
            } else {
                acei aceiVar = acehVar.d;
                aceg acegVar = aceiVar.p;
                if (acegVar != null) {
                    acdy acdyVar = (acdy) acegVar;
                    if (aceiVar != acdyVar.b) {
                        String valueOf = String.valueOf(aceiVar);
                        String valueOf2 = String.valueOf(acdyVar.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
                        sb.append("Unexpected self view window: ");
                        sb.append(valueOf);
                        sb.append(" != ");
                        sb.append(valueOf2);
                        Log.e("ScreencastControls", sb.toString());
                        acdyVar.f.i();
                    } else {
                        int i2 = acdyVar.i;
                        if (i2 == 4 || i2 == 7 || acdyVar.c.t()) {
                            acdyVar.c.c();
                            aceiVar.c();
                            acdyVar.k();
                        } else {
                            acdyVar.c.r();
                            aceiVar.i();
                            acdyVar.f();
                        }
                        acdyVar.j.a.edit().putBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", true).apply();
                    }
                }
            }
        }
        return false;
    }
}
