package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zoe implements View.OnTouchListener {
    private final Context a;
    final GestureDetector b;
    private final zob c;
    private ScaleGestureDetector d;
    private boolean e;

    public zoe(Context context, zob zobVar) {
        context.getClass();
        this.a = context;
        zobVar.getClass();
        this.c = zobVar;
        this.b = new GestureDetector(context, new zod(this, zobVar));
    }

    public static boolean b(boolean z, View view, int i, MotionEvent motionEvent) {
        if (i == 1) {
            view.performClick();
            return false;
        }
        if (i == 5) {
            return true;
        }
        if (i == 6 && motionEvent.getPointerCount() < 2) {
            return false;
        }
        return z;
    }

    public boolean a() {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.b.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        boolean b = b(this.e, view, action, motionEvent);
        this.e = b;
        if (action == 1) {
            this.d = null;
            action = 1;
        }
        if (!b || action != 2) {
            return true;
        }
        if (this.d == null) {
            this.d = new ScaleGestureDetector(this.a, new zoc(this.c));
        }
        return this.d.onTouchEvent(motionEvent);
    }
}
