package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaaa {
    public final argy a;
    public final zzz b;

    public aaaa(argy argyVar) {
        this.a = argyVar;
        argv argvVar = argyVar.c;
        int i = (argvVar == null ? argv.a : argvVar).b;
        if ((i & 8) != 0) {
            this.b = zzz.COLLABORATOR_CARD;
            return;
        }
        if ((i & 4) != 0) {
            this.b = zzz.PLAYLIST_CARD;
            return;
        }
        if ((i & 1) != 0) {
            this.b = zzz.SIMPLE_CARD;
            return;
        }
        if ((i & 2) != 0) {
            this.b = zzz.VIDEO_CARD;
        } else if ((i & 128) == 0) {
            zga.b("Encountered unknown or invalid card");
            this.b = null;
        } else {
            this.b = zzz.SHOPPING_CARD;
        }
    }

    public final argq a() {
        argv argvVar = this.a.c;
        if (argvVar == null) {
            argvVar = argv.a;
        }
        argq argqVar = argvVar.f;
        return argqVar == null ? argq.a : argqVar;
    }

    public final arhe b() {
        argv argvVar = this.a.c;
        if (argvVar == null) {
            argvVar = argv.a;
        }
        arhe arheVar = argvVar.e;
        return arheVar == null ? arhe.a : arheVar;
    }

    public final arhg c() {
        argv argvVar = this.a.c;
        if (argvVar == null) {
            argvVar = argv.a;
        }
        arhg arhgVar = argvVar.g;
        return arhgVar == null ? arhg.a : arhgVar;
    }

    public final arhi d() {
        argv argvVar = this.a.c;
        if (argvVar == null) {
            argvVar = argv.a;
        }
        arhi arhiVar = argvVar.c;
        return arhiVar == null ? arhi.a : arhiVar;
    }

    public final arhj e() {
        arha arhaVar = this.a.b;
        if (arhaVar == null) {
            arhaVar = arha.a;
        }
        arhj arhjVar = arhaVar.b;
        return arhjVar == null ? arhj.a : arhjVar;
    }

    public final arhk f() {
        argv argvVar = this.a.c;
        if (argvVar == null) {
            argvVar = argv.a;
        }
        arhk arhkVar = argvVar.d;
        return arhkVar == null ? arhk.a : arhkVar;
    }

    public final List g() {
        return this.a.d;
    }

    public final byte[] h() {
        args argsVar = this.a.e;
        if (argsVar == null) {
            argsVar = args.a;
        }
        if ((argsVar.b & 2) == 0) {
            return null;
        }
        args argsVar2 = this.a.e;
        if (argsVar2 == null) {
            argsVar2 = args.a;
        }
        argx argxVar = argsVar2.c;
        if (argxVar == null) {
            argxVar = argx.a;
        }
        return argxVar.b.I();
    }
}
