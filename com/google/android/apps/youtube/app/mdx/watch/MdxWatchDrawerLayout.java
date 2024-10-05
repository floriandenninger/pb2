package com.google.android.apps.youtube.app.mdx.watch;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.akn;
import defpackage.aypy;
import defpackage.azrh;
import defpackage.azrs;
import defpackage.gjj;
import defpackage.jej;
import defpackage.jfm;
import defpackage.jfq;
import defpackage.jfr;
import defpackage.jfs;
import defpackage.jft;
import defpackage.jfu;
import defpackage.jfv;
import defpackage.jfz;
import defpackage.jw;
import defpackage.wbs;
import defpackage.zev;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxWatchDrawerLayout extends jej implements View.OnClickListener, jfr {
    public final Set a;
    public jfq b;
    public Optional c;
    public View d;
    public View e;
    public View f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final float n;
    private final float o;
    private final azrs p;
    private View q;
    private View r;
    private View s;
    private ImageView t;
    private boolean u;
    private Rect v;
    private Optional w;
    private Optional x;
    private Optional y;

    public MdxWatchDrawerLayout(Context context) {
        this(context, null, 0);
    }

    private final void m(float f) {
        if (this.d == null) {
            return;
        }
        int i = (int) (this.i + (f * (this.h - r0)));
        if (this.c.isPresent()) {
            akn aknVar = (akn) this.c.get();
            View view = this.d;
            if (aknVar.l(view, view.getLeft(), i)) {
                jw.G(this);
            }
        }
    }

    private final boolean n(MotionEvent motionEvent, View view) {
        return view.getGlobalVisibleRect(this.v) && this.v.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    @Override // defpackage.jfr
    public final jfz a() {
        return new jfz(f());
    }

    @Override // defpackage.jfr
    public final aypy b() {
        return this.p.U();
    }

    @Override // defpackage.jfr
    public final void c() {
        m(1.0f);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.c.isPresent() && ((akn) this.c.get()).n()) {
            jw.G(this);
        }
    }

    public final float f() {
        int i = this.h;
        return (i - this.g) / (i - this.i);
    }

    public final int g(int i, int i2) {
        return (int) (i - (f() * (i - i2)));
    }

    public final void h() {
        View view;
        ImageView imageView;
        View view2 = this.e;
        if (view2 == null || (view = this.s) == null || (imageView = this.t) == null) {
            return;
        }
        int measuredHeight = view2.getMeasuredHeight();
        int i = this.h - measuredHeight;
        int i2 = i + measuredHeight;
        this.w = Optional.of(new jfu(this.e, i, i2, 0.0f, 1.0f));
        int i3 = (int) (i - (measuredHeight * 0.9f));
        this.x = Optional.of(new jfu(view, i3, i3 + measuredHeight, 1.0f, 0.0f));
        this.y = Optional.of(new jfv(imageView, i3, i2));
    }

    public final void i(boolean z) {
        ViewParent parentForAccessibility = getParentForAccessibility();
        if (parentForAccessibility instanceof AccessibilityLayerLayout) {
            ((AccessibilityLayerLayout) parentForAccessibility).b(z);
        }
    }

    public final void j(int i, boolean z) {
        View view;
        View view2;
        if (z || i != this.g) {
            this.g = i;
            this.m = i == this.i;
            if (this.w.isPresent() && this.x.isPresent() && (view = this.e) != null && (view2 = this.q) != null) {
                ((jfu) this.w.get()).b(this.g);
                ((jfu) this.x.get()).b(this.g);
                view.setVisibility(true != this.m ? 0 : 4);
                float f = f();
                float f2 = this.o;
                float f3 = this.n;
                view2.setMinimumHeight(Math.round((f * (f2 - f3)) + f3));
                if (this.f != null && this.t != null && this.y.isPresent()) {
                    ImageView imageView = this.t;
                    int i2 = this.g;
                    int i3 = this.h;
                    this.f.setVisibility(i2 == i3 ? 4 : 0);
                    ((jfv) this.y.get()).b(this.g);
                    if (this.m) {
                        imageView.setContentDescription(getResources().getText(R.string.mdx_remote_queue_header_description));
                    } else if (i2 == i3) {
                        imageView.setContentDescription(getResources().getText(R.string.mdx_minibar_toggle_description));
                    }
                }
            }
            if (!jw.ak(this)) {
                requestLayout();
            }
            this.p.c(a());
            if (this.a.isEmpty()) {
                return;
            }
            for (jfm jfmVar : this.a) {
                jfz a = a();
                jfmVar.a.g(a.a);
                jfmVar.a.e(a.a());
            }
        }
    }

    public final void k() {
        int measuredHeight;
        View view = this.e;
        if (view == null || this.h == (measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) - this.j)) {
            return;
        }
        int g = g(measuredHeight, this.i);
        this.h = measuredHeight;
        h();
        j(g, false);
    }

    protected final boolean l(MotionEvent motionEvent) {
        View view = this.e;
        if (view != null && n(motionEvent, view)) {
            return true;
        }
        View view2 = this.q;
        return view2 != null && n(motionEvent, view2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e || view == this.q) {
            m(this.g > (this.h - this.i) / 2 ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        jw.M(this, new jfs(this));
        Optional of = Optional.of(akn.c(this, 10.0f, new jft(this)));
        this.c = of;
        ((akn) of.get()).b = getResources().getDisplayMetrics().density * 400.0f;
        View findViewById = findViewById(R.id.mdx_drawer);
        findViewById.getClass();
        this.d = findViewById;
        ViewStub viewStub = (ViewStub) findViewById(R.id.mdx_minibar_stub);
        viewStub.getClass();
        viewStub.setInflatedId(R.id.mdx_next_gen_fiji_minibar);
        viewStub.setLayoutResource(R.layout.mdx_next_gen_fiji_minibar);
        View inflate = viewStub.inflate();
        inflate.getClass();
        this.e = inflate;
        inflate.setOnClickListener(this);
        View findViewById2 = findViewById(R.id.mdx_next_gen_fiji_remote_queue);
        findViewById2.getClass();
        this.f = findViewById2;
        View findViewById3 = findViewById(R.id.mdx_next_gen_fiji_remote_queue_header);
        findViewById3.getClass();
        this.q = findViewById3;
        findViewById3.setOnClickListener(this);
        View findViewById4 = findViewById(R.id.mdx_drawer_scrim);
        findViewById4.getClass();
        this.r = findViewById4;
        View findViewById5 = findViewById(R.id.mdx_queue_header_content);
        findViewById5.getClass();
        this.s = findViewById5;
        ImageView imageView = (ImageView) findViewById(R.id.minibar_toggle);
        imageView.getClass();
        this.t = imageView;
        Drawable a = aii.a(getContext(), R.drawable.yt_outline_chevron_up_white_24);
        if (a != null) {
            a.mutate();
            a.setColorFilter(wbs.Q(getContext(), R.attr.ytTextPrimary), PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(a);
        }
        this.p.c(a());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c.isPresent()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3 && actionMasked != 1) {
                return (l(motionEvent) && ((akn) this.c.get()).k(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
            }
            ((akn) this.c.get()).d();
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.d;
        if (view == null) {
            return;
        }
        int measuredHeight = this.g + view.getMeasuredHeight() + this.j;
        if (this.u) {
            j(this.h, true);
            this.u = false;
            if (!this.m && zev.e(getContext())) {
                i(true);
            }
        }
        view.layout(i, this.g, i3, measuredHeight);
        View view2 = this.r;
        if (view2 != null) {
            view2.layout(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z = savedState.a;
        this.m = z;
        this.g = z ? this.i : this.h;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.a = this.m;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c.isPresent()) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.k || l(motionEvent)) {
            ((akn) this.c.get()).f(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new gjj(18);
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MdxWatchDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MdxWatchDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new CopyOnWriteArraySet();
        this.p = azrh.e().aT();
        this.u = true;
        this.v = new Rect();
        this.n = context.getResources().getDimension(R.dimen.mdx_queue_header_collapsed_height);
        this.o = context.getResources().getDimension(R.dimen.mdx_queue_header_expanded_height);
        this.w = Optional.empty();
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.c = Optional.empty();
    }
}
