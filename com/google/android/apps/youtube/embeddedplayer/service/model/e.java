package com.google.android.apps.youtube.embeddedplayer.service.model;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    private String a;

    public final FragmentKeyData a() {
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: fragmentKey");
        }
        return new AutoValue_FragmentKeyData(str);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null fragmentKey");
        }
        this.a = str;
    }
}
