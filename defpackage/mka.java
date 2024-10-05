package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mka {
    public final aooy a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final mjz i;

    private mka(aooy aooyVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z, Optional optional5, mjz mjzVar, Optional optional6) {
        this.a = aooyVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = z;
        this.g = optional5;
        mjzVar.getClass();
        this.i = mjzVar;
        this.h = optional6;
    }

    public static Optional a(atvz atvzVar) {
        atvzVar.getClass();
        int i = atvzVar.b;
        if (i != 117501096) {
            if (i == 318370163) {
                atvt atvtVar = (atvt) atvzVar.c;
                atvtVar.getClass();
                return Optional.of(new mka(atvtVar, Optional.empty(), b(atvtVar, juz.s, loc.q), b(atvtVar, mjw.b, loc.s), Optional.empty(), false, b(atvtVar, juz.t, loc.r), mjx.b, b(atvtVar, mjw.a, loc.t)));
            }
            return Optional.empty();
        }
        atvw atvwVar = (atvw) atvzVar.c;
        atvwVar.getClass();
        Optional b = b(atvwVar, mjw.h, loc.p);
        Optional b2 = b(atvwVar, mjw.c, loc.u);
        Optional b3 = b(atvwVar, mjw.e, mjy.a);
        Optional b4 = b(atvwVar, mjw.g, loc.o);
        atvv atvvVar = atvwVar.h;
        if (atvvVar == null) {
            atvvVar = atvv.a;
        }
        int bH = anaf.bH(atvvVar.b);
        boolean z = true;
        if (bH == 0 || bH != 2) {
            atvu atvuVar = atvwVar.i;
            if (atvuVar == null) {
                atvuVar = atvu.a;
            }
            if (atvuVar.b != 140810778) {
                atvu atvuVar2 = atvwVar.i;
                if (atvuVar2 == null) {
                    atvuVar2 = atvu.a;
                }
                if (atvuVar2.b != 318370164) {
                    z = false;
                }
            }
        }
        return Optional.of(new mka(atvwVar, b, b2, b3, b4, z, b(atvwVar, mjw.d, mjy.b), mjx.a, b(atvwVar, mjw.f, mjy.c)));
    }

    private static Optional b(Object obj, ammy ammyVar, amml ammlVar) {
        ammyVar.getClass();
        ammlVar.getClass();
        return ammyVar.a(obj) ? Optional.of(ammlVar.apply(obj)) : Optional.empty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mka) && this.a.equals(((mka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("mka".length() + 2 + String.valueOf(valueOf).length());
        sb.append("mka");
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
