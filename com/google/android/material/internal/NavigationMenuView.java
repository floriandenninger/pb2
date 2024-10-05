package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.qq;
import defpackage.rg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements rg {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.rg
    public final void a(qq qqVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        af(new LinearLayoutManager(1));
    }
}
