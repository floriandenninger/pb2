package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

import defpackage.aomf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_WatchLaterButtonData extends WatchLaterButtonData {
    private final int b;
    private final String c;
    private final String d;
    private final aomf e;

    public AutoValue_WatchLaterButtonData(int i, String str, String str2, aomf aomfVar) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData
    public final aomf b() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData
    public final String c() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof WatchLaterButtonData) {
            WatchLaterButtonData watchLaterButtonData = (WatchLaterButtonData) obj;
            if (this.b == watchLaterButtonData.a() && ((str = this.c) != null ? str.equals(watchLaterButtonData.d()) : watchLaterButtonData.d() == null) && ((str2 = this.d) != null ? str2.equals(watchLaterButtonData.c()) : watchLaterButtonData.c() == null) && this.e.equals(watchLaterButtonData.b())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        String str2 = this.d;
        String valueOf = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 85 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("WatchLaterButtonData{state=");
        sb.append(i);
        sb.append(", label=");
        sb.append(str);
        sb.append(", accessibilityLabel=");
        sb.append(str2);
        sb.append(", trackingParams=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.c;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return ((hashCode ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.e.hashCode();
    }
}
