package com.google.android.apps.youtube.embeddedplayer.service.model;

import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m {
    public CharSequence a;
    public CharSequence b;
    private aomf c;

    public final VideoDetailsExpanded a() {
        aomf aomfVar = this.c;
        if (aomfVar == null) {
            throw new IllegalStateException("Missing required properties: trackingParams");
        }
        return new AutoValue_VideoDetailsExpanded(this.a, this.b, aomfVar);
    }

    public final void b(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.c = aomfVar;
    }

    public final VideoDetailsCollapsed c() {
        aomf aomfVar = this.c;
        if (aomfVar == null) {
            throw new IllegalStateException("Missing required properties: trackingParams");
        }
        return new AutoValue_VideoDetailsCollapsed(this.a, this.b, aomfVar);
    }

    public final void d(aomf aomfVar) {
        if (aomfVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.c = aomfVar;
    }
}
