package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvz extends zof implements View.OnTouchListener {
    final zoe a;
    private final hvy b;
    private final View c;
    private final boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private float h;
    private float i;
    private final Rect j = new Rect();

    public hvz(hvy hvyVar, View view, boolean z, boolean z2) {
        this.b = hvyVar;
        this.c = view;
        this.d = z2;
        this.a = z ? new zoe(view.getContext(), this) : null;
    }

    public final boolean f(int i, KeyEvent keyEvent) {
        if (i != 24 && i != 25) {
            return false;
        }
        keyEvent.startTracking();
        if (!this.f && !this.e) {
            this.f = true;
            this.b.mk();
        }
        return true;
    }

    public final boolean g(int i) {
        return (i == 24 || i == 25) && !this.e;
    }

    public final boolean h(int i) {
        if (i != 24 && i != 25) {
            return false;
        }
        if (this.f && !this.e) {
            this.b.mm();
        }
        this.f = false;
        return true;
    }

    @Override // defpackage.zof, defpackage.zob
    public final void mj(int i) {
        if (i == 4) {
            this.g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zoe zoeVar = this.a;
        if (zoeVar != null) {
            this.g = false;
            zoeVar.onTouch(view, motionEvent);
            if (this.g) {
                this.b.ml();
                return true;
            }
        }
        if (motionEvent.getAction() == 1) {
            if (this.e && !this.f) {
                this.b.mm();
            }
            this.e = false;
            view.performClick();
        } else if ((!this.e && !this.f) || motionEvent.getAction() != 2 || motionEvent.getPointerCount() != 1) {
            if (motionEvent.getAction() == 0) {
                if (!this.f) {
                    this.e = true;
                    this.b.mk();
                }
                this.h = motionEvent.getRawX();
                this.i = motionEvent.getRawY();
            }
        } else {
            if (this.d) {
                this.b.mp(motionEvent.getRawX() - this.h, motionEvent.getRawY() - this.i);
            }
            this.c.getGlobalVisibleRect(this.j);
            float max = Math.max(0.0f, (this.j.exactCenterY() - motionEvent.getRawY()) - (r6.height() / 2));
            if (max > 0.0f) {
                float top = this.c.getTop() - this.j.height();
                if (top >= 1.0f) {
                    this.b.mq(max / top);
                }
            }
            return true;
        }
        return true;
    }
}
