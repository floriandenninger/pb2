package com.facebook.litho;

import android.graphics.Rect;
import defpackage.did;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TestItem {
    public String a;
    public ComponentHost c;
    public Object d;
    public final Rect b = new Rect();
    private final AcquireKey e = new AcquireKey();

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class AcquireKey {
    }

    public AcquireKey getAcquireKey() {
        return this.e;
    }

    public Rect getBounds() {
        return this.b;
    }

    public ComponentHost getHost() {
        return this.c;
    }

    public String getTestKey() {
        return this.a;
    }

    public String getTextContent() {
        List textItems = did.C(Collections.singletonList(this.d)).getTextItems();
        StringBuilder sb = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((CharSequence) textItems.get(i));
        }
        return sb.toString();
    }
}
