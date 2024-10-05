package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    public CharSequence a;
    public CharSequence b;
    public Bitmap c;

    public c() {
    }

    public c(d dVar) {
        this.a = dVar.b;
        this.b = dVar.c;
        this.c = dVar.d;
    }

    public final d a() {
        return new d(this.a, this.b, this.c);
    }
}
