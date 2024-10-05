package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model;

import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_SubscribeButtonData extends SubscribeButtonData {
    private final int b;
    private final String c;
    private final String d;
    private final aomf e;

    public AutoValue_SubscribeButtonData(int i, String str, String str2, aomf aomfVar) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = aomfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData
    public final aomf b() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData
    public final String c() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SubscribeButtonData) {
            SubscribeButtonData subscribeButtonData = (SubscribeButtonData) obj;
            if (this.b == subscribeButtonData.a() && ((str = this.c) != null ? str.equals(subscribeButtonData.d()) : subscribeButtonData.d() == null) && ((str2 = this.d) != null ? str2.equals(subscribeButtonData.c()) : subscribeButtonData.c() == null) && this.e.equals(subscribeButtonData.b())) {
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
        StringBuilder sb = new StringBuilder(length + 82 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("SubscribeButtonData{state=");
        sb.append(i);
        sb.append(", text=");
        sb.append(str);
        sb.append(", accessibilityText=");
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
