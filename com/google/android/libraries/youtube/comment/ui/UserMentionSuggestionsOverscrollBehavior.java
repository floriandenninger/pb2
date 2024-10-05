package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import defpackage.ahe;
import defpackage.ahh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UserMentionSuggestionsOverscrollBehavior extends ahe {
    private boolean a;
    private int b;
    private int c;

    public UserMentionSuggestionsOverscrollBehavior() {
        this.c = -1;
    }

    public UserMentionSuggestionsOverscrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
    }

    @Override // defpackage.ahe
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ahe aheVar = ((ahh) view2.getLayoutParams()).a;
        if ((view instanceof ScrollView) && (aheVar instanceof BottomSheetBehavior)) {
            EditText editText = (EditText) coordinatorLayout.findViewById(R.id.content);
            int selectionStart = editText.getSelectionStart();
            Layout layout = editText.getLayout();
            if (layout == null) {
                return false;
            }
            int lineForOffset = layout.getLineForOffset(selectionStart);
            int lineBaseline = layout.getLineBaseline(lineForOffset) + layout.getLineAscent(lineForOffset);
            View findViewById = coordinatorLayout.findViewById(R.id.filler_space);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            BottomSheetBehavior x = BottomSheetBehavior.x(view2);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i = iArr[1];
            if (x.t == 5) {
                this.a = false;
                return false;
            }
            if (!this.a) {
                int[] iArr2 = new int[2];
                editText.getLocationOnScreen(iArr2);
                int i2 = iArr2[1];
                int lineHeight = editText.getLineHeight();
                this.b = lineBaseline + i2 + lineHeight + lineHeight;
                this.a = true;
            }
            if (i < this.b) {
                int i3 = this.c;
                if (i3 == -1) {
                    i3 = findViewById.getHeight();
                    this.c = i3;
                }
                int i4 = this.b - i;
                int i5 = i3 + i4;
                if (findViewById.getHeight() != i5) {
                    layoutParams.height = i5;
                    findViewById.requestLayout();
                    view.scrollTo(0, i4);
                    view.setVerticalScrollBarEnabled(false);
                }
            } else if (this.c >= 0) {
                this.c = -1;
                layoutParams.height = 0;
                findViewById.requestLayout();
                view.setVerticalScrollBarEnabled(true);
            }
        }
        return false;
    }
}
