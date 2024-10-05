package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmi {
    public final View a;
    public final View.OnTouchListener b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public MotionEvent e;
    public boolean f;
    public boolean g;
    public final ncj h;
    public final ncj i;
    public final ncj j;

    public xmi(View view, ncj ncjVar, ncj ncjVar2, View.OnTouchListener onTouchListener, ncj ncjVar3, byte[] bArr, byte[] bArr2) {
        this.a = view;
        this.j = ncjVar;
        this.i = ncjVar2;
        this.b = onTouchListener;
        this.h = ncjVar3;
        view.setOnTouchListener(new xmh(this, 0));
        view.setOnClickListener(new xmg(this, 1));
    }

    public final void a() {
        MotionEvent motionEvent = this.e;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.e = null;
    }

    public final void b(View view, boolean z) {
        if (z) {
            this.c.add(view);
        }
        view.setOnTouchListener(new xmh(this, 1));
    }

    public final void c() {
        if (this.f) {
            this.f = false;
            this.d.clear();
            a();
        }
    }

    protected final void finalize() {
        super.finalize();
        a();
    }
}
