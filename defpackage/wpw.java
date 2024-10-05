package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpw implements aeen {
    public final azrw a;
    public final AtomicReference b = new AtomicReference(false);

    public wpw(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.aeen
    public final void e() {
        this.b.set(false);
    }

    @Override // defpackage.aeen
    public final void f() {
        this.b.set(false);
    }

    @Override // defpackage.aeej
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aeen
    public final void h() {
        this.b.set(true);
    }

    @Override // defpackage.aeen
    public final void i(int i) {
        this.b.set(false);
    }

    @Override // defpackage.aeen
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aeen
    public final void k() {
    }
}
