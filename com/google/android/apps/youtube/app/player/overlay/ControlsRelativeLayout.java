package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.asvu;
import defpackage.kkp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ControlsRelativeLayout extends kkp {
    public aadw a;
    private View b;
    private SparseBooleanArray c;

    public ControlsRelativeLayout(Context context) {
        super(context);
        this.b = null;
        this.c = null;
    }

    public final boolean a(View view) {
        if (this.b == null) {
            this.c = new SparseBooleanArray();
            this.b = findViewById(R.id.youtube_controls_bottom_ui_container);
        }
        SparseBooleanArray sparseBooleanArray = this.c;
        sparseBooleanArray.getClass();
        if (sparseBooleanArray.indexOfKey(view.getId()) < 0) {
            View view2 = this.b;
            view2.getClass();
            boolean z = view2.findViewById(view.getId()) != null;
            sparseBooleanArray.put(view.getId(), z);
            return z;
        }
        return sparseBooleanArray.get(view.getId());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        super.addChildrenForAccessibility(arrayList);
        asvu asvuVar = this.a.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.aZ) {
            Collections.sort(arrayList, new Comparator() { // from class: kid
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    ControlsRelativeLayout controlsRelativeLayout = ControlsRelativeLayout.this;
                    boolean a = controlsRelativeLayout.a((View) obj);
                    if (a == controlsRelativeLayout.a((View) obj2)) {
                        return 0;
                    }
                    return a ? 1 : -1;
                }
            });
        }
    }

    public ControlsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.c = null;
    }
}
