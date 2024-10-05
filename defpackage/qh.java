package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qh implements Runnable {
    final /* synthetic */ qj a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ qq c;
    final /* synthetic */ qi d;

    public qh(qi qiVar, qj qjVar, MenuItem menuItem, qq qqVar) {
        this.d = qiVar;
        this.a = qjVar;
        this.b = menuItem;
        this.c = qqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj qjVar = this.a;
        if (qjVar != null) {
            this.d.a.f = true;
            qjVar.b.i(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.z(this.b, 4);
        }
    }
}
