package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qmi {
    final int a;
    final rpv b = new rpv();
    final int c;
    final Bundle d;

    public qmi(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(qmj qmjVar) {
        this.b.a(qmjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        this.b.b(obj);
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
