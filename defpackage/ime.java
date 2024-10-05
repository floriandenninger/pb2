package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ime extends FrameLayout {
    public int a;
    public int b;
    private final int c;
    private final int d;

    public ime(Context context) {
        super(context);
        setLayoutDirection(0);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.video_interactions_touch_horizontal_border_width);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.video_interactions_touch_vertical_border_height);
    }

    private final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return false;
        }
        return motionEvent.getX() < ((float) this.c) || motionEvent.getX() > ((float) (getMeasuredWidth() - this.c)) || motionEvent.getY() < ((float) this.d) || motionEvent.getY() > ((float) (getMeasuredHeight() - this.d));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a = (int) motionEvent.getRawX();
        this.b = (int) motionEvent.getRawY();
        if (a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent) && super.onTouchEvent(motionEvent);
    }
}
