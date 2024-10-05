package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zco extends ViewPager {
    private final zcn i;
    private final zcn j;

    public zco(Context context) {
        super(context);
        final int i = 1;
        this.i = new zcn(this) { // from class: zcm
            public final /* synthetic */ zco a;

            {
                this.a = this;
            }

            @Override // defpackage.zcn
            public final boolean a(MotionEvent motionEvent) {
                return i != 0 ? this.a.z(motionEvent) : this.a.A(motionEvent);
            }
        };
        final int i2 = 0;
        this.j = new zcn(this) { // from class: zcm
            public final /* synthetic */ zco a;

            {
                this.a = this;
            }

            @Override // defpackage.zcn
            public final boolean a(MotionEvent motionEvent) {
                return i2 != 0 ? this.a.z(motionEvent) : this.a.A(motionEvent);
            }
        };
    }

    private static final boolean w(MotionEvent motionEvent, zcn zcnVar) {
        try {
            return zcnVar.a(motionEvent);
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean A(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return w(motionEvent, this.j);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return w(motionEvent, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean z(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public zco(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 1;
        this.i = new zcn(this) { // from class: zcm
            public final /* synthetic */ zco a;

            {
                this.a = this;
            }

            @Override // defpackage.zcn
            public final boolean a(MotionEvent motionEvent) {
                return i != 0 ? this.a.z(motionEvent) : this.a.A(motionEvent);
            }
        };
        final int i2 = 0;
        this.j = new zcn(this) { // from class: zcm
            public final /* synthetic */ zco a;

            {
                this.a = this;
            }

            @Override // defpackage.zcn
            public final boolean a(MotionEvent motionEvent) {
                return i2 != 0 ? this.a.z(motionEvent) : this.a.A(motionEvent);
            }
        };
    }
}
