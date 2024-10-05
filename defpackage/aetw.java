package defpackage;

import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetw {
    public final aeve a;
    public volatile aewe b;
    public final afdt c;
    public final ysy d;
    public final aeez e;
    public final afkn f;
    public final aehs g;
    public final amnv h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile afky m;
    public volatile aezf n;
    public final LruCache o = new LruCache(7);
    public aeou p;
    public boolean q;
    public boolean r;
    public final afhs s;
    private final aenf t;
    private final amnv u;
    private final afcu v;

    public aetw(aeve aeveVar, aewe aeweVar, afdt afdtVar, afhs afhsVar, ysy ysyVar, aeez aeezVar, afkn afknVar, aehs aehsVar, aenf aenfVar, amnv amnvVar, amnv amnvVar2, afcu afcuVar) {
        this.a = aeveVar;
        this.b = aeweVar;
        this.c = afdtVar;
        this.s = afhsVar;
        this.d = ysyVar;
        this.e = aeezVar;
        this.f = afknVar;
        this.g = aehsVar;
        this.t = aenfVar;
        this.h = amnvVar;
        this.u = amnvVar2;
        this.v = afcuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PlayerConfigModel a() {
        aezf aezfVar = this.n;
        return aezfVar != null ? aezfVar.a() : PlayerConfigModel.b;
    }

    public final aeru b() {
        aezf aezfVar = this.n;
        return aezfVar != null ? aezfVar.b : aeru.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aesa c() {
        aezf aezfVar = this.n;
        return aezfVar != null ? aezfVar.K : aesa.a;
    }

    public final amnv d(PlayerConfigModel playerConfigModel) {
        return playerConfigModel.aK() ? this.u : advx.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, aesa aesaVar, PlayerConfigModel playerConfigModel, afjf afjfVar) {
        this.o.put(str, aehc.a(aesaVar, playerConfigModel, afjfVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(aezf aezfVar) {
        if (this.n != null) {
            this.n.H = true;
        }
        this.n = aezfVar;
        if (aezfVar != null) {
            this.v.i(aezfVar.a());
            e(aezfVar.a, aezfVar.K, aezfVar.a(), aezfVar.b.a());
            this.t.l(b(), this.s.af(), aezfVar.a());
        }
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.m != null;
    }
}
