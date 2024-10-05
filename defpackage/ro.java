package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ro extends ViewGroup {
    protected final rn a;
    public final Context b;
    public ActionMenuView c;
    public sb d;
    public int e;
    protected ka f;
    private boolean g;
    private boolean h;

    ro(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final ka b(int i, long j) {
        ka kaVar = this.f;
        if (kaVar != null) {
            kaVar.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ka q = jw.q(this);
            q.c(1.0f);
            q.d(j);
            rn rnVar = this.a;
            rnVar.d(q, 0);
            q.f(rnVar);
            return q;
        }
        ka q2 = jw.q(this);
        q2.c(0.0f);
        q2.d(j);
        rn rnVar2 = this.a;
        rnVar2.d(q2, i);
        q2.f(rnVar2);
        return q2;
    }

    public void d(int i) {
        throw null;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, nx.a, R.attr.actionBarStyle, 0);
        d(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        sb sbVar = this.d;
        if (sbVar != null) {
            sbVar.j = jp.c(sbVar.b);
            qq qqVar = sbVar.c;
            if (qqVar != null) {
                qqVar.l(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ka kaVar = this.f;
            if (kaVar != null) {
                kaVar.a();
            }
            super.setVisibility(i);
        }
    }

    public ro(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new rn(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
