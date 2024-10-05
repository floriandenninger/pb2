package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.gm;
import defpackage.nx;
import defpackage.qb;
import defpackage.qc;
import defpackage.qp;
import defpackage.qt;
import defpackage.rf;
import defpackage.sc;
import defpackage.un;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, rf, sc {
    public qt b;
    public qp c;
    public qc d;
    private CharSequence e;
    private Drawable f;
    private un g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && ((this.b.n & 4) != 4 || !this.h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.e : null);
        CharSequence charSequence = this.b.l;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.b.d);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.b.m;
        if (TextUtils.isEmpty(charSequence2)) {
            gm.r(this, z3 ? null : this.b.d);
        } else {
            gm.r(this, charSequence2);
        }
    }

    private final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // defpackage.rf
    public final qt a() {
        return this.b;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.sc
    public final boolean c() {
        return b();
    }

    @Override // defpackage.sc
    public final boolean d() {
        return b() && this.b.getIcon() == null;
    }

    @Override // defpackage.rf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.rf
    public final void f(qt qtVar) {
        this.b = qtVar;
        Drawable icon = qtVar.getIcon();
        this.f = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.k;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = qtVar.f(this);
        g();
        setId(qtVar.a);
        setVisibility(true != qtVar.isVisible() ? 8 : 0);
        setEnabled(qtVar.isEnabled());
        if (qtVar.hasSubMenu() && this.g == null) {
            this.g = new qb(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qp qpVar = this.c;
        if (qpVar != null) {
            qpVar.b(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = h();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean b = b();
        if (b && (i4 = this.j) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.i);
        } else {
            i3 = this.i;
        }
        if (mode != 1073741824 && this.i > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (b || this.f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        un unVar;
        if (this.b.hasSubMenu() && (unVar = this.g) != null && unVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nx.c, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }
}
