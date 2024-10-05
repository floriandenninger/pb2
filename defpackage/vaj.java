package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum vaj {
    HIDDEN(0.0f),
    COLLAPSED(25.0f),
    EXPANDED(75.0f),
    FULLY_EXPANDED(100.0f);

    vaj e;
    public vaj f;
    public final float g;

    static {
        vaj vajVar = HIDDEN;
        vaj vajVar2 = COLLAPSED;
        vaj vajVar3 = EXPANDED;
        vaj vajVar4 = FULLY_EXPANDED;
        vajVar.e = vajVar;
        vajVar.f = vajVar;
        vajVar2.e = vajVar2;
        vajVar2.f = vajVar3;
        vajVar3.e = vajVar2;
        vajVar3.f = vajVar4;
        vajVar4.e = vajVar3;
        vajVar4.f = vajVar4;
    }

    vaj(float f) {
        this.g = f;
    }
}
