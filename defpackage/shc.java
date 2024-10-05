package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class shc {
    public final she a;
    public final shd b;
    private final acx c;
    private final IBinder d;
    private final Parcelable e;
    private volatile Boolean f;

    public shc(shd shdVar, acx acxVar, she sheVar) {
        c();
        c();
        c();
        this.f = null;
        this.b = shdVar;
        this.c = acxVar;
        this.d = new acu(acxVar).a().a.getExtras().getBinder("android.support.customtabs.extra.SESSION");
        this.e = new acu(acxVar).a().a.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
        this.a = sheVar;
    }

    private static void c() {
        new AtomicBoolean(false);
    }

    public final acu a() {
        return new acu(this.c);
    }

    public final void b(Uri uri) {
        Integer num = (Integer) ((ammv) this.b.c.get()).f();
        if (num == null || num.intValue() < 14) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("session", this.d);
        bundle.putParcelable("pendingId", this.e);
        bundle.putParcelable("origin", uri);
        this.b.b.a("addVerifiedOriginForSession", bundle);
    }
}
