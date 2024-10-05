package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahzj implements aeen {
    public final aeeo a;
    public final aiap b;
    private final aes c;

    public ahzj(aeeo aeeoVar, aes aesVar, aiap aiapVar) {
        this.a = aeeoVar;
        this.c = aesVar;
        this.b = aiapVar;
    }

    @Override // defpackage.aeen
    public final void e() {
        this.c.b();
    }

    @Override // defpackage.aeen
    public final void f() {
        this.c.c(null);
    }

    @Override // defpackage.aeej
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aeen
    public final void h() {
    }

    @Override // defpackage.aeen
    public final void i(int i) {
        this.c.d(new IllegalArgumentException("Prebuffer failed"));
    }

    @Override // defpackage.aeen
    public final boolean j() {
        return false;
    }

    @Override // defpackage.aeen
    public final void k() {
    }
}
