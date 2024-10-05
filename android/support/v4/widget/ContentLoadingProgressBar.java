package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import defpackage.lk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Runnable e;
    public final Runnable f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    private final void c() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    public final void a() {
        post(new lk(this, 3));
    }

    public final void b() {
        post(new lk(this, 2));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new lk(this, 1);
        this.f = new lk(this, 0);
    }
}
