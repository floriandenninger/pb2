package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.ll;
import defpackage.ws;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class c extends ll {
    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int c = recyclerView.c(view);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_inside_padding);
        rect.left = dimensionPixelSize;
        rect.right = dimensionPixelSize;
        if (c < 0) {
            return;
        }
        if (c <= 0) {
            rect.left = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_edge_padding);
        }
        if (recyclerView.m == null || c < r5.b() - 1) {
            return;
        }
        rect.right = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_edge_padding);
    }
}
