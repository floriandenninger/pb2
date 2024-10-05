package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zdi extends zdb {
    private final ViewConfiguration a;
    private boolean b;
    public zdh c;
    protected boolean d;
    private float e;
    private float g;

    public zdi(ViewConfiguration viewConfiguration) {
        viewConfiguration.getClass();
        this.a = viewConfiguration;
    }

    @Override // defpackage.zdg
    public void c() {
        this.b = false;
        this.d = false;
    }

    @Override // defpackage.zdg
    public boolean d(View view, MotionEvent motionEvent) {
        zdh zdhVar;
        boolean e = e(motionEvent);
        if (!e || (zdhVar = this.c) == null) {
            return e;
        }
        zdhVar.b(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 3) {
            c();
        } else {
            if (!this.b || motionEvent.getActionMasked() != 1) {
                if (motionEvent.getActionMasked() == 0) {
                    this.b = true;
                    this.e = motionEvent.getRawX();
                    this.g = motionEvent.getRawY();
                } else if (!this.b || motionEvent.getActionMasked() != 2) {
                    if (this.b && motionEvent.getActionMasked() == 6) {
                        this.d = motionEvent.getPointerCount() > 1;
                    }
                } else {
                    float scaledTouchSlop = this.a.getScaledTouchSlop();
                    if (Math.abs(motionEvent.getRawX() - this.e) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.g) > scaledTouchSlop) {
                        this.b = false;
                    }
                }
            } else {
                this.b = false;
                return true;
            }
        }
        return false;
    }
}
