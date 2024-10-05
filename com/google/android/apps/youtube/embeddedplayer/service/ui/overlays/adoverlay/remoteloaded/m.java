package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final CharSequence j;
    private final Bitmap k;

    public m() {
    }

    public m(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        this.j = charSequence;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.k = bitmap;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        l lVar = new l();
        lVar.a = this.j;
        lVar.e(this.a);
        lVar.d(this.b);
        lVar.g(this.c);
        lVar.f(this.d);
        lVar.b = this.k;
        lVar.c(this.e);
        lVar.h(this.f);
        lVar.i(this.g);
        lVar.b(this.h);
        lVar.j(this.i);
        return lVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            CharSequence charSequence = this.j;
            if (charSequence != null ? charSequence.equals(mVar.j) : mVar.j == null) {
                if (this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d && ((bitmap = this.k) != null ? bitmap.equals(mVar.k) : mVar.k == null) && this.e == mVar.e && this.f == mVar.f && this.g == mVar.g && this.h == mVar.h && this.i == mVar.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.j);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        String valueOf2 = String.valueOf(this.k);
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 267 + String.valueOf(valueOf2).length());
        sb.append("Data{adTitle=");
        sb.append(valueOf);
        sb.append(", isSkippable=");
        sb.append(z);
        sb.append(", hideSkipButton=");
        sb.append(z2);
        sb.append(", skipEnabled=");
        sb.append(z3);
        sb.append(", showAdChoices=");
        sb.append(z4);
        sb.append(", channelThumbnail=");
        sb.append(valueOf2);
        sb.append(", extraBottomMarginPx=");
        sb.append(i);
        sb.append(", skipTimeRemainingMillis=");
        sb.append(i2);
        sb.append(", timeRemainingMillis=");
        sb.append(i3);
        sb.append(", currentAdIndex=");
        sb.append(i4);
        sb.append(", totalAds=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        CharSequence charSequence = this.j;
        int hashCode = ((((((((((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003;
        Bitmap bitmap = this.k;
        return ((((((((((hashCode ^ (bitmap != null ? bitmap.hashCode() : 0)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }
}
