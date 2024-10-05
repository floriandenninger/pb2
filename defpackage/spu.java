package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class spu implements GestureDetector.OnDoubleTapListener {
    private final spt a;

    public spu(spt sptVar) {
        this.a = sptVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        List<ssl> list;
        spt sptVar = this.a;
        if (motionEvent.getActionMasked() != 1 || (list = sptVar.e) == null) {
            return false;
        }
        for (ssl sslVar : list) {
            View view = (View) sptVar.a.get();
            szk szkVar = new szk(motionEvent.getX(), motionEvent.getY());
            sww swwVar = sslVar.e.b;
            awnw a = sslVar.a.a();
            sst sstVar = sslVar.e;
            sslVar.e.d(swwVar.b(a, sst.g(view, szkVar, sslVar.b, sslVar.c, sslVar.d)).Q(), sslVar.d);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        spt sptVar = this.a;
        List list = sptVar.d;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sxn) it.next()).a((View) sptVar.a.get(), new szk(motionEvent.getX(), motionEvent.getY()));
        }
        return false;
    }
}
