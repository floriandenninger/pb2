package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqz {
    public dtg a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public final void a(View view) {
        if (!this.c || this.d) {
            return;
        }
        if (!this.e) {
            this.d = true;
            dtg dtgVar = this.a;
            if (dtgVar != null) {
                dtgVar.a(view, 1);
            }
            this.c = false;
        }
        this.e = false;
    }

    public final void b(View view) {
        if (!this.b && !this.d) {
            this.b = true;
            dtg dtgVar = this.a;
            if (dtgVar != null) {
                dtgVar.a(view, 0);
            }
        }
        this.e = true;
    }

    public final void c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (!this.d) {
                this.c = false;
                this.e = true;
                return;
            } else {
                this.b = false;
                this.c = false;
                this.d = false;
                return;
            }
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.c && this.b && !this.d) {
            this.d = true;
            dtg dtgVar = this.a;
            if (dtgVar != null) {
                dtgVar.a(view, 1);
            }
        }
    }

    public final void d() {
        this.c = true;
    }
}
