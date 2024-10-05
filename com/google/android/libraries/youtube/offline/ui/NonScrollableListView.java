package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import defpackage.agye;
import defpackage.agyf;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NonScrollableListView extends LinearLayout {
    SparseArray a;
    public ListAdapter b;
    public AdapterView.OnItemClickListener c;
    public agyf d;

    public NonScrollableListView(Context context) {
        super(context);
    }

    public final void a() {
        removeAllViews();
        ListAdapter listAdapter = this.b;
        if (listAdapter == null) {
            return;
        }
        int count = listAdapter.getCount();
        int i = 0;
        while (true) {
            View view = null;
            if (i >= count) {
                break;
            }
            int itemViewType = listAdapter.getItemViewType(i);
            SparseArray sparseArray = this.a;
            ArrayDeque arrayDeque = (sparseArray == null || sparseArray.size() <= itemViewType) ? null : (ArrayDeque) this.a.get(itemViewType);
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                view = (View) arrayDeque.removeFirst();
            }
            View view2 = listAdapter.getView(i, view, this);
            if (view2 != null) {
                addView(view2);
                view2.setOnClickListener(new agye(this, i, listAdapter));
            }
            i++;
        }
        setVisibility(count > 0 ? 0 : 8);
        ListAdapter listAdapter2 = this.b;
        if (listAdapter2 == null) {
            return;
        }
        if (this.a == null) {
            this.a = new SparseArray(listAdapter2.getViewTypeCount());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int itemViewType2 = listAdapter2.getItemViewType(i2);
            ArrayDeque arrayDeque2 = this.a.size() > itemViewType2 ? (ArrayDeque) this.a.get(itemViewType2) : null;
            if (arrayDeque2 == null) {
                arrayDeque2 = new ArrayDeque();
                this.a.put(itemViewType2, arrayDeque2);
            }
            arrayDeque2.add(getChildAt(i2));
        }
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
