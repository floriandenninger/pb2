package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwl extends zoe {
    private final Context a;
    private final zob c;
    private final zmk d;
    private ScaleGestureDetector e;
    private final znh f;
    private boolean g;
    private boolean h;

    public hwl(Context context, zob zobVar, znh znhVar) {
        super(context, zobVar);
        context.getClass();
        this.a = context;
        zobVar.getClass();
        this.c = zobVar;
        this.d = new zmk(context, new zod(this, zobVar));
        this.f = znhVar;
    }

    @Override // defpackage.zoe
    public final boolean a() {
        return !this.f.I();
    }

    @Override // defpackage.zoe, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.d.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        boolean b = b(this.g, view, action, motionEvent);
        this.g = b;
        if (b) {
            this.h = true;
        }
        if (action == 1) {
            this.e = null;
            if (!b && !this.h && this.f.I()) {
                this.c.e(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 0) {
            this.h = false;
        }
        if (!this.g || action != 2) {
            return true;
        }
        if (this.e == null) {
            this.e = new ScaleGestureDetector(this.a, new zoc(this.c));
        }
        return this.e.onTouchEvent(motionEvent);
    }
}
