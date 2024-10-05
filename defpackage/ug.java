package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ug extends ListView {
    public boolean a;
    uf b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Field i;
    private ue j;
    private final boolean k;
    private boolean l;
    private li m;

    public ug(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private final void c(boolean z) {
        ue ueVar = this.j;
        if (ueVar != null) {
            ueVar.b = z;
        }
    }

    private final void d() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:30|(1:32)|33|(1:40)|41|(1:43)|44|(1:(12:47|(1:49)|50|51|52|(2:54|(1:56))|(3:59|(1:61)(1:72)|62)(1:73)|63|(1:67)|68|(1:70)|71)(1:76))(1:78)|77|(0)|50|51|52|(0)|(0)(0)|63|(2:65|67)|68|(0)|71) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[Catch: IllegalAccessException -> 0x00ec, TryCatch #0 {IllegalAccessException -> 0x00ec, blocks: (B:52:0x00cf, B:54:0x00db, B:56:0x00e8), top: B:51:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.a(android.view.MotionEvent, int):boolean");
    }

    public final int b(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        int i5 = 0;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            int i6 = itemViewType != i5 ? itemViewType : i5;
            if (itemViewType != i5) {
                view = null;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i4 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
            i4++;
            i5 = i6;
        }
        return i3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        c(true);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                uf ufVar = new uf(this);
                this.b = ufVar;
                ufVar.a.post(ufVar);
            }
            actionMasked = 10;
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                d();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        uf ufVar = this.b;
        if (ufVar != null) {
            ug ugVar = ufVar.a;
            ugVar.b = null;
            ugVar.removeCallbacks(ufVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        ue ueVar = drawable != null ? new ue(drawable) : null;
        this.j = ueVar;
        super.setSelector(ueVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
