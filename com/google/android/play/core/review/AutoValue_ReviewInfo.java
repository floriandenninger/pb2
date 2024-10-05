package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_ReviewInfo extends ReviewInfo {
    private final PendingIntent a;
    private final boolean b;

    public AutoValue_ReviewInfo(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.a.equals(reviewInfo.a()) && this.b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
