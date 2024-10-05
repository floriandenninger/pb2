package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhv {
    public final gof a;
    public final mic b;
    public boolean c;
    public boolean d = true;
    private final flx e;
    private PlaybackStartDescriptor f;

    public mhv(flx flxVar, mic micVar, gof gofVar) {
        micVar.getClass();
        this.b = micVar;
        flxVar.getClass();
        this.e = flxVar;
        this.a = gofVar;
        c();
    }

    public final PlaybackStartDescriptor a() {
        if (this.f == null) {
            aifz d = PlaybackStartDescriptor.d();
            d.a = this.a.b();
            this.f = d.a();
        }
        return this.f;
    }

    public final void b(int i, boolean z) {
        if (this.c) {
            this.b.q();
            return;
        }
        if (this.a.f() == null) {
            return;
        }
        boolean z2 = i == 1 || i == 0;
        String f = this.a.f();
        aifz e = a().e();
        flv b = this.e.b(f);
        if (b != null) {
            long j = b.a;
            if (j > 0) {
                e.k = j;
            }
        }
        e.f = z2;
        e.e = z;
        e.d();
        this.f = e.a();
        WatchDescriptor watchDescriptor = new WatchDescriptor(this.f);
        gof gofVar = this.a;
        mic micVar = this.b;
        fhc b2 = fhd.b();
        b2.f(watchDescriptor);
        fhd a = b2.a();
        gofVar.m();
        micVar.u(a);
        this.c = true;
    }

    public final void c() {
        this.c = false;
    }

    public final boolean d() {
        return TextUtils.equals(this.b.l(), this.a.f());
    }
}
