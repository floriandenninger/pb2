package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ec {
    final String a;
    final int b;
    final String c;
    final Notification d;

    public ec(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
    }
}
