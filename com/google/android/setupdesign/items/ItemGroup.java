package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ItemGroup extends AbstractItemHierarchy {
    public final List a;
    public final SparseIntArray b;

    public ItemGroup() {
        this.a = new ArrayList();
        this.b = new SparseIntArray();
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new SparseIntArray();
    }
}
