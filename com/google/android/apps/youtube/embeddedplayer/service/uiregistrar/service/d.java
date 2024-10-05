package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.i;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.b {
    private static int a = 1;
    private final SparseArray b = new SparseArray();

    private final synchronized void c(SelectableItemKey selectableItemKey) {
        WeakReference weakReference = (WeakReference) this.b.get(selectableItemKey.a);
        i iVar = weakReference != null ? (i) weakReference.get() : null;
        if (iVar != null) {
            iVar.a(selectableItemKey.b);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c
    public final void a(SelectableItemKey selectableItemKey) {
        c(selectableItemKey);
    }

    public final synchronized int b(i iVar) {
        SparseArray sparseArray = this.b;
        int i = a + 1;
        a = i;
        sparseArray.append(i, new WeakReference(iVar));
        return a;
    }
}
