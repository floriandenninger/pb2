package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byt {
    public final int a;
    public final int b;
    public final Notification c;

    public byt(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        byt bytVar = (byt) obj;
        if (this.a == bytVar.a && this.b == bytVar.b) {
            return this.c.equals(bytVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
