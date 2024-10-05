package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aezp extends aezl {
    final /* synthetic */ aezt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezp(aezt aeztVar, aezk aezkVar) {
        super(aeztVar, aezkVar);
        this.c = aeztVar;
    }

    @Override // defpackage.aezs
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.aezs
    public final void d() {
        this.a.a++;
    }

    @Override // defpackage.aezl, defpackage.aezs
    public final boolean e() {
        int i;
        int a = a();
        if (a > 1) {
            PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.c.b.get();
            int i2 = Integer.MAX_VALUE;
            if ((playerConfigModel.c.b & 1) != 0 && (i = playerConfigModel.O().g) != -1) {
                i2 = i;
            }
            if (a >= i2) {
                return false;
            }
        }
        return true;
    }
}
