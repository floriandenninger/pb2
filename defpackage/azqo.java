package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azqo extends aypy {
    public abstract void a(ayrs ayrsVar);

    public final aypy aN() {
        azqo azqoVar;
        if (this instanceof azjd) {
            azqoVar = new azjg(((azjd) this).a);
            ayrv ayrvVar = aynu.m;
        } else {
            azqoVar = this;
        }
        azjm azjmVar = new azjm(azqoVar);
        ayrv ayrvVar2 = aynu.l;
        return azjmVar;
    }

    public final aypy d() {
        return e(1);
    }

    public final aypy e(int i) {
        ayrs ayrsVar = aysu.d;
        if (i <= 0) {
            a(ayrsVar);
            ayrv ayrvVar = aynu.m;
            return this;
        }
        azfi azfiVar = new azfi(this, ayrsVar);
        ayrv ayrvVar2 = aynu.l;
        return azfiVar;
    }
}
