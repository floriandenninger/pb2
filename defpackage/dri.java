package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.yoga.YogaDirection;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dri implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ drj a;
    final /* synthetic */ YogaDirection b;
    final /* synthetic */ ajbh c;

    public dri(drj drjVar, ajbh ajbhVar, YogaDirection yogaDirection, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = drjVar;
        this.c = ajbhVar;
        this.b = yogaDirection;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.c.i;
        if (i == -1) {
            if (this.b == YogaDirection.RTL) {
                this.a.fullScroll(66);
            }
            this.c.i = this.a.getScrollX();
            return true;
        }
        this.a.setScrollX(i);
        return true;
    }
}
