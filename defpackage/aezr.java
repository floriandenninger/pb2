package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aezr extends aezl {
    final /* synthetic */ aezt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezr(aezt aeztVar, aezk aezkVar) {
        super(aeztVar, aezkVar);
        this.c = aeztVar;
    }

    @Override // defpackage.aezs
    public final int a() {
        return this.a.b;
    }

    @Override // defpackage.aezs
    public final void d() {
        this.a.b++;
    }

    @Override // defpackage.aezl, defpackage.aezs
    public final boolean e() {
        int a = a();
        if (a > 1) {
            PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.c.b.get();
            if (a >= ((playerConfigModel.c.b & 1) != 0 ? playerConfigModel.O().f : 10)) {
                return false;
            }
        }
        return true;
    }
}
