package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.altp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AbstractItemHierarchy {
    private final ArrayList a = new ArrayList();

    public AbstractItemHierarchy() {
    }

    public final void a(int i) {
        int i2;
        if (i < 0) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("notifyItemRangeChanged: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ItemGroup itemGroup = (ItemGroup) arrayList.get(i3);
            List list = itemGroup.a;
            int size2 = list.size();
            int i4 = 0;
            while (true) {
                i2 = -1;
                if (i4 >= size2) {
                    i4 = -1;
                    break;
                } else if (list.get(i4) == this) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                int size3 = itemGroup.a.size();
                int i5 = -1;
                while (i5 < 0 && i4 < size3) {
                    i5 = itemGroup.b.get(i4, -1);
                    i4++;
                }
                i2 = i5 < 0 ? 0 : i5;
            }
            if (i2 >= 0) {
                itemGroup.a(i2 + i);
            } else {
                String valueOf = String.valueOf(this);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb2.append("Unexpected child change ");
                sb2.append(valueOf);
                Log.e("ItemGroup", sb2.toString());
            }
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.b);
        obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }
}
