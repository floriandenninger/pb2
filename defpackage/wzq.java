package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzq {
    private final wng a;
    private Object b;

    public wzq(wng wngVar) {
        wngVar.getClass();
        this.a = wngVar;
    }

    public final void a() {
        this.b = null;
    }

    public final void b(Object obj) {
        if (obj == null || obj != this.b) {
            return;
        }
        this.b = null;
    }

    public final void c(Object obj, apcm apcmVar) {
        if (obj != null) {
            if (apcmVar == apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE || this.a.e().contains(Integer.valueOf(apcmVar.f))) {
                this.b = obj;
            }
        }
    }

    public final boolean d(Object obj) {
        return this.a.h() && obj != null && obj == this.b;
    }
}
