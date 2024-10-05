package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import com.google.android.libraries.material.dialog.ButtonPaneLayout;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjl extends TouchDelegate {
    public final Set a;
    public TouchDelegate b;
    final /* synthetic */ ButtonPaneLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjl(ButtonPaneLayout buttonPaneLayout) {
        super(new Rect(), buttonPaneLayout);
        this.c = buttonPaneLayout;
        this.a = new aeb();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
            return true;
        }
        motionEvent.offsetLocation(-this.c.getLeft(), -this.c.getTop());
        if (this.a.isEmpty()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((TouchDelegate) it.next()).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
