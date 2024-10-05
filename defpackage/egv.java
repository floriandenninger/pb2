package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class egv implements azrw {
    public final /* synthetic */ azrw a;
    private final /* synthetic */ int b;

    public /* synthetic */ egv(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return (Executor) this.a.get();
        }
        if (i == 1) {
            return (akqj) this.a.get();
        }
        if (i == 2) {
            return (akqj) this.a.get();
        }
        if (i == 3) {
            azrw azrwVar = this.a;
            int i2 = enq.a;
            return amsx.r((aapu) azrwVar.get());
        }
        if (i == 4) {
            azrw azrwVar2 = this.a;
            int i3 = enq.a;
            return amsx.r((aapu) azrwVar2.get());
        }
        azrw azrwVar3 = this.a;
        if (!((ammv) azrwVar3.get()).h() || ((upi) ((ammv) azrwVar3.get()).c()).a() == null) {
            return null;
        }
        azrw a = ((upi) ((ammv) azrwVar3.get()).c()).a();
        a.getClass();
        return (babg) a.get();
    }
}
