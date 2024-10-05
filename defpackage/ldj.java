package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldj implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    public final /* synthetic */ ldk d;

    public ldj(ldk ldkVar, boolean z, int i, List list) {
        this.d = ldkVar;
        this.a = z;
        this.b = i;
        this.c = list;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.d.i.getViewTreeObserver().removeOnPreDrawListener(this);
        int measuredWidth = this.a ? this.d.i.getMeasuredWidth() + this.d.b.getDimensionPixelSize(R.dimen.clarification_box_open_in_new_icon_size) + this.d.b.getDimensionPixelSize(R.dimen.clarification_box_open_in_new_icon_padding_start) : 0;
        WrappingTextViewForClarifyBox wrappingTextViewForClarifyBox = this.d.h;
        wrappingTextViewForClarifyBox.b = this.b;
        wrappingTextViewForClarifyBox.d = new ldi(this, this.a);
        WrappingTextViewForClarifyBox wrappingTextViewForClarifyBox2 = this.d.h;
        wrappingTextViewForClarifyBox2.c = measuredWidth;
        wrappingTextViewForClarifyBox2.a = new ArrayList(this.c);
        wrappingTextViewForClarifyBox2.requestLayout();
        this.d.g.invalidate();
        return true;
    }
}
