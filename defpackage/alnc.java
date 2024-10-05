package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alnc implements View.OnTouchListener {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ alnf b;

    public alnc(alnf alnfVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = alnfVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.g()) {
                this.b.d = false;
            }
            this.b.e(this.a);
        }
        return false;
    }
}
