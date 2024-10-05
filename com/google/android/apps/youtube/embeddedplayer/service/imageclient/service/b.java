package com.google.android.apps.youtube.embeddedplayer.service.imageclient.service;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import j$.util.Optional;
import j$.util.function.Function;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static int a = 1;
    private final SparseArray b = new SparseArray();

    public final synchronized Optional a(final BitmapKey bitmapKey) {
        WeakReference weakReference;
        weakReference = (WeakReference) this.b.get(bitmapKey.a);
        return Optional.ofNullable(weakReference != null ? (com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c) weakReference.get() : null).map(new Function() { // from class: com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.a
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return (Uri) ((com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c) obj).c.get(BitmapKey.this.b);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        });
    }

    public final synchronized int b(com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c cVar) {
        SparseArray sparseArray = this.b;
        int i = a + 1;
        a = i;
        sparseArray.append(i, new WeakReference(cVar));
        return a;
    }
}
