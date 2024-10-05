package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fly implements zdh, zdd {
    private final View a;
    private Point b;
    private Object c;

    public fly(View view) {
        this.a = view;
    }

    private final Point d(MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = new Point();
        }
        this.b.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fav.r(this.b, this.a);
        return this.b;
    }

    @Override // defpackage.zdh
    public final void b(MotionEvent motionEvent) {
        View o = fav.o(this.a, d(motionEvent), eri.p);
        if (o == null) {
            return;
        }
        if (this.c == null) {
            this.c = o.getTag(R.id.player_overlay_tap_listener);
        }
        Object obj = this.c;
        if (obj != null) {
            ((zdh) obj).b(motionEvent);
        } else if (o.isClickable()) {
            o.performClick();
        }
    }

    @Override // defpackage.zdd
    public final void nG(MotionEvent motionEvent, boolean z) {
        View o = fav.o(this.a, d(motionEvent), eri.o);
        if (o == null) {
            return;
        }
        if (this.c == null) {
            this.c = o.getTag(R.id.player_overlay_tap_listener);
        }
        Object obj = this.c;
        if (obj != null) {
            ((zdd) obj).nG(motionEvent, z);
        }
    }

    @Override // defpackage.zdd
    public final boolean nL(MotionEvent motionEvent, boolean z) {
        View o = fav.o(this.a, d(motionEvent), eri.n);
        if (o == null) {
            return false;
        }
        if (this.c == null) {
            this.c = o.getTag(R.id.player_overlay_tap_listener);
        }
        Object obj = this.c;
        return obj != null && ((zdd) obj).nL(motionEvent, z);
    }
}
