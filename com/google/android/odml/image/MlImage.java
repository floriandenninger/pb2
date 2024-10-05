package com.google.android.odml.image;

import android.graphics.Rect;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MlImage implements Closeable {
    private final ImageContainer a;
    private final Rect b;
    private int c;

    MlImage(ImageContainer imageContainer, int i, Rect rect, long j, int i2, int i3) {
        this.a = imageContainer;
        Rect rect2 = new Rect();
        this.b = rect2;
        rect2.set(rect);
        this.c = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            getContainer().close();
        }
    }

    public ImageContainer getContainer() {
        return this.a;
    }
}
