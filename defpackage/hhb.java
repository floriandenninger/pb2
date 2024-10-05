package defpackage;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hhb extends zoe {
    final /* synthetic */ hhd a;
    private final hii c;
    private final View d;
    private final hgo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(hhd hhdVar, hii hiiVar, View view, hgo hgoVar, zob zobVar) {
        super(hhdVar.qR(), zobVar);
        this.a = hhdVar;
        this.c = hiiVar;
        this.d = view;
        this.e = hgoVar;
    }

    @Override // defpackage.zoe, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        super.onTouch(view, motionEvent);
        if (this.a.aQ()) {
            Matrix transform = this.a.as.a.getTransform(null);
            transform.invert(transform);
            motionEvent.transform(transform);
        }
        hii hiiVar = this.c;
        View view2 = this.d;
        boolean z = !this.e.i();
        zrx a = hiiVar.a();
        zsa zsaVar = a != null ? a.a : null;
        if (zsaVar != null) {
            zsaVar.a(view, motionEvent, view2, z);
            return true;
        }
        return view.onTouchEvent(motionEvent);
    }
}
