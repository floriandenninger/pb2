package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yjt implements View.OnFocusChangeListener, View.OnTouchListener, TextView.OnEditorActionListener {
    final /* synthetic */ yju a;

    public yjt(yju yjuVar) {
        this.a = yjuVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        this.a.b();
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.e();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        yju yjuVar = this.a;
        boolean z = view == yjuVar.e || view == yjuVar.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && z) {
                view.performClick();
                return true;
            }
        } else {
            if (z) {
                this.a.e();
                return true;
            }
            this.a.b();
        }
        return false;
    }
}
