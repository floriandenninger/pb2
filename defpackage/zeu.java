package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zeu extends TouchDelegate {
    private final Map a;
    private TouchDelegate b;

    public zeu(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.a = identityHashMap;
        if (!(touchDelegate instanceof zeu)) {
            this.b = touchDelegate;
            return;
        }
        zeu zeuVar = (zeu) touchDelegate;
        this.b = zeuVar.b;
        identityHashMap.putAll(zeuVar.a);
    }

    public static void b(View view, View view2, TouchDelegate touchDelegate) {
        zeu zeuVar;
        view.getClass();
        view2.getClass();
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        if (touchDelegate2 instanceof zeu) {
            zeuVar = (zeu) touchDelegate2;
        } else {
            zeuVar = new zeu(view, touchDelegate2);
        }
        amkq.N(!(touchDelegate instanceof zeu));
        zeuVar.a.put(view2, touchDelegate);
        if (touchDelegate == zeuVar.b) {
            zeuVar.b = null;
        }
        if (touchDelegate2 != zeuVar) {
            view.setTouchDelegate(zeuVar);
        }
    }

    private static boolean c(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = touchDelegate.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    public final void a(View view) {
        this.a.remove(view);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        boolean c = touchDelegate != null ? c(motionEvent, touchDelegate) : false;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            c |= c(motionEvent, (TouchDelegate) it.next());
        }
        return c;
    }
}
