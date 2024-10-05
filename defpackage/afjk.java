package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afjk implements amnv {
    public final /* synthetic */ amnv a;
    private final /* synthetic */ int b;

    public /* synthetic */ afjk(amnv amnvVar, int i) {
        this.b = i;
        this.a = amnvVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aqvp aqvpVar = ((PlayerConfigModel) this.a.get()).O().e;
                return aqvpVar == null ? aqvp.a : aqvpVar;
            }
            amnv amnvVar = this.a;
            aqvp aqvpVar2 = afjl.a;
            try {
                return (aqvp) amnvVar.get();
            } catch (IllegalStateException unused) {
                return afjl.a;
            }
        }
        amnv amnvVar2 = this.a;
        aqvp aqvpVar3 = afjl.a;
        aqvp aqvpVar4 = (aqvp) amnvVar2.get();
        if ((1 & aqvpVar4.b) == 0) {
            throw new IllegalStateException();
        }
        int i2 = aqvpVar4.c;
        if (i2 > 0 && aqvpVar4.e >= i2 && aqvpVar4.d >= 1.0f) {
            float f = aqvpVar4.f;
            if (f >= 0.0f && f < 1.0f) {
                return aqvpVar4;
            }
        }
        return afjl.a;
    }
}
