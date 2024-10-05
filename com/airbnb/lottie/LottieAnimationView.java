package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.abo;
import defpackage.asg;
import defpackage.cfd;
import defpackage.cfe;
import defpackage.cff;
import defpackage.cfg;
import defpackage.cfh;
import defpackage.cfi;
import defpackage.cfj;
import defpackage.cfq;
import defpackage.cfz;
import defpackage.cgb;
import defpackage.cgd;
import defpackage.cge;
import defpackage.cgi;
import defpackage.cgj;
import defpackage.cgk;
import defpackage.cig;
import defpackage.cls;
import defpackage.clu;
import defpackage.clw;
import defpackage.jw;
import defpackage.nz;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final cgb a = new cfe();
    public cgb b;
    public int c;
    public final cfz d;
    public boolean e;
    public cfj f;
    private final cgb g;
    private final cgb h;
    private boolean i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Set q;
    private int r;
    private cgi s;
    private int t;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new cff(this, 1);
        this.h = new cff(this, 0);
        this.c = 0;
        this.d = new cfz();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(null, R.attr.lottieAnimationViewStyle);
    }

    private final void r() {
        cgi cgiVar = this.s;
        if (cgiVar != null) {
            cgiVar.g(this.g);
            this.s.f(this.h);
        }
    }

    private final void t(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cgj.a, i, 0);
        this.e = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    f(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    g(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                h(string);
            }
            this.c = obtainStyledAttributes.getResourceId(4, 0);
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.n = true;
                this.p = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                this.d.p(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                m(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                l(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                n(obtainStyledAttributes.getFloat(15, 1.0f));
            }
            this.d.h = obtainStyledAttributes.getString(7);
            k(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            cfz cfzVar = this.d;
            if (cfzVar.j != z) {
                cfzVar.j = z;
                if (cfzVar.a != null) {
                    cfzVar.g();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.d.f(new cig("**"), cge.E, new clu(new cgk(nz.a(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                this.d.c = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i2 = obtainStyledAttributes.getInt(11, 0);
                abo.d();
                if (i2 >= 3) {
                    i2 = 0;
                }
                p(abo.d()[i2]);
            }
            this.d.e = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            this.d.d = Boolean.valueOf(cls.b(getContext()) != 0.0f).booleanValue();
            s();
            this.i = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.d.b.addListener(animatorListener);
    }

    public final void b(cig cigVar, Object obj, clw clwVar) {
        this.d.f(cigVar, obj, new cfi(clwVar));
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.r++;
        super.buildDrawingCache(z);
        if (this.r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            p(2);
        }
        this.r--;
        cfd.a();
    }

    public final void c() {
        this.n = false;
        this.m = false;
        this.l = false;
        cfz cfzVar = this.d;
        cfzVar.f.clear();
        cfzVar.b.cancel();
        s();
    }

    public final void d() {
        this.p = false;
        this.n = false;
        this.m = false;
        this.l = false;
        this.d.i();
        s();
    }

    public final void e() {
        if (!isShown()) {
            this.l = true;
        } else {
            this.d.j();
            s();
        }
    }

    public final void f(int i) {
        cgi k;
        this.k = i;
        this.j = null;
        if (isInEditMode()) {
            k = new cgi(new cfg(this, i), true);
        } else if (this.e) {
            Context context = getContext();
            k = cfq.k(context, i, cfq.n(context, i));
        } else {
            k = cfq.k(getContext(), i, null);
        }
        j(k);
    }

    public final void g(String str) {
        cgi h;
        this.j = str;
        this.k = 0;
        if (isInEditMode()) {
            h = new cgi(new cfh(this, str), true);
        } else {
            h = this.e ? cfq.h(getContext(), str) : cfq.i(getContext(), str, null);
        }
        j(h);
    }

    public final void h(String str) {
        j(this.e ? cfq.l(getContext(), str) : cfq.m(getContext(), str, null));
    }

    public final void i(cfj cfjVar) {
        this.d.setCallback(this);
        this.f = cfjVar;
        this.o = true;
        boolean r = this.d.r(cfjVar);
        this.o = false;
        s();
        if (getDrawable() == this.d) {
            if (!r) {
                return;
            }
        } else if (!r) {
            boolean o = o();
            setImageDrawable(null);
            setImageDrawable(this.d);
            if (o) {
                this.d.k();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((cgd) it.next()).a(cfjVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        cfz cfzVar = this.d;
        if (drawable2 == cfzVar) {
            super.invalidateDrawable(cfzVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(cgi cgiVar) {
        this.f = null;
        this.d.h();
        r();
        cgiVar.e(this.g);
        cgiVar.d(this.h);
        this.s = cgiVar;
    }

    public final void k(float f) {
        this.d.o(f);
    }

    public final void l(int i) {
        this.d.p(i);
    }

    public final void m(int i) {
        this.d.b.setRepeatMode(i);
    }

    public final void n(float f) {
        this.d.b.b = f;
    }

    public final boolean o() {
        return this.d.q();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.p || this.n)) {
            e();
            this.p = false;
            this.n = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (o()) {
            c();
            this.n = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.a;
        this.j = str;
        if (!TextUtils.isEmpty(str)) {
            g(this.j);
        }
        int i = savedState.b;
        this.k = i;
        if (i != 0) {
            f(i);
        }
        k(savedState.c);
        if (savedState.d) {
            e();
        }
        this.d.h = savedState.e;
        m(savedState.f);
        l(savedState.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.j;
        savedState.b = this.k;
        savedState.c = this.d.c();
        boolean z = false;
        if (this.d.q() || (!jw.aj(this) && this.n)) {
            z = true;
        }
        savedState.d = z;
        cfz cfzVar = this.d;
        savedState.e = cfzVar.h;
        savedState.f = cfzVar.b.getRepeatMode();
        savedState.g = this.d.e();
        return savedState;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        if (this.i) {
            if (isShown()) {
                if (this.m) {
                    if (isShown()) {
                        this.d.k();
                        s();
                    }
                } else if (this.l) {
                    e();
                }
                this.m = false;
                this.l = false;
                return;
            }
            if (o()) {
                d();
                this.m = true;
            }
        }
    }

    public final void p(int i) {
        this.t = i;
        s();
    }

    public final void q(cgd cgdVar) {
        cfj cfjVar = this.f;
        if (cfjVar != null) {
            cgdVar.a(cfjVar);
        }
        this.q.add(cgdVar);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        r();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        r();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        r();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        cfz cfzVar;
        if (!this.o && drawable == (cfzVar = this.d) && cfzVar.q()) {
            d();
        } else if (!this.o && (drawable instanceof cfz)) {
            cfz cfzVar2 = (cfz) drawable;
            if (cfzVar2.q()) {
                cfzVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private final void s() {
        cfj cfjVar;
        cfj cfjVar2;
        int i = this.t;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 2;
        if (i2 == 0 ? !(((cfjVar = this.f) == null || !cfjVar.k || Build.VERSION.SDK_INT >= 28) && (((cfjVar2 = this.f) == null || cfjVar2.l <= 4) && Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25)) : i2 != 1) {
            i3 = 1;
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(11);
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new cff(this, 1);
        this.h = new cff(this, 0);
        this.c = 0;
        this.d = new cfz();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new cff(this, 1);
        this.h = new cff(this, 0);
        this.c = 0;
        this.d = new cfz();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        t(attributeSet, i);
    }
}
