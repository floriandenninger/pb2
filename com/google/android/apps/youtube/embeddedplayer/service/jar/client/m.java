package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m extends au {
    private final int a;
    private final int b;

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.au
    public int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.au
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof au) {
            au auVar = (au) obj;
            if (this.a == auVar.b() && this.b == auVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("CachedAdEvent{adEventType=");
        sb.append(i);
        sb.append(", adBreakType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
