package com.google.android.apps.youtube.embeddedplayer.service.model;

import defpackage.aomf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_VideoDetailsCollapsed extends VideoDetailsCollapsed {
    private final CharSequence b;
    private final CharSequence c;
    private final aomf d;

    public AutoValue_VideoDetailsCollapsed(CharSequence charSequence, CharSequence charSequence2, aomf aomfVar) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed
    public final aomf a() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed
    public final CharSequence b() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed
    public final CharSequence c() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 57 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("VideoDetailsCollapsed{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", trackingParams=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
