package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axze {
    public final aaea a;

    public axze(aaea aaeaVar) {
        this.a = aaeaVar;
    }

    public axze(aaea aaeaVar, byte[] bArr) {
        aaeaVar.getClass();
        this.a = aaeaVar;
    }

    public axze(aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.a = aaeaVar;
    }

    public axze(aaea aaeaVar, char[] cArr) {
        this.a = aaeaVar;
    }

    public final aypy a() {
        return this.a.a.Y(axzd.o).B();
    }

    public final aypy b() {
        return this.a.a.Y(axzb.q).B();
    }

    public final aypy c() {
        return this.a.a.Y(axyz.t).B();
    }

    public final void d(String str) {
        e(str, null);
    }

    public final void e(String str, Throwable th) {
        f(str, th, null);
    }

    public final void f(String str, Throwable th, akzq akzqVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        avuj avujVar = this.a.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        String str2 = avujVar.p;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = "youtubeUploadService::";
        }
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        if (akzqVar != null) {
            sb.append(" UploadType: ");
            sb.append(akzqVar.g);
        }
        if (th != null) {
            zga.o("UploadEcatcherReporter", sb.toString(), th);
        } else {
            zga.m("UploadEcatcherReporter", sb.toString());
        }
        if (akzqVar == akzq.REELS_UPLOAD) {
            avuj avujVar2 = this.a.a().h;
            if (avujVar2 == null) {
                avujVar2 = avuj.a;
            }
            i = avujVar2.n;
        } else if (th instanceof akwe) {
            akwe akweVar = (akwe) th;
            if (akweVar.a == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNHANDLED_EXCEPTION || akweVar.a == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED) {
                avuj avujVar3 = this.a.a().h;
                if (avujVar3 == null) {
                    avujVar3 = avuj.a;
                }
                i = avujVar3.o;
            } else {
                avuj avujVar4 = this.a.a().h;
                if (avujVar4 == null) {
                    avujVar4 = avuj.a;
                }
                i = avujVar4.m;
            }
        } else {
            avuj avujVar5 = this.a.a().h;
            if (avujVar5 == null) {
                avujVar5 = avuj.a;
            }
            i = avujVar5.m;
        }
        if (i == 0) {
            return;
        }
        double random = Math.random();
        double d = i;
        Double.isNaN(d);
        if (Math.floor(random * d) == 0.0d) {
            if (th != null) {
                afsi.c(1, 9, sb.toString(), th);
            } else {
                afsi.b(1, 9, sb.toString());
            }
        }
    }

    public final int g() {
        return i().L;
    }

    public final int h() {
        return i().o;
    }

    public final astj i() {
        arfd a = this.a.a();
        if (a == null) {
            return astj.a;
        }
        astj astjVar = a.c;
        return astjVar == null ? astj.a : astjVar;
    }

    public final List j() {
        return i().A;
    }

    public final boolean k() {
        return i().O;
    }

    public final boolean l() {
        return i().v;
    }

    public final boolean m() {
        return i().M;
    }

    public final boolean n() {
        return i().n;
    }

    public final boolean o() {
        return i().k;
    }

    public final boolean p() {
        return i().p;
    }

    public final boolean q() {
        attq attqVar;
        arfd a = this.a.a();
        if (a != null) {
            attqVar = a.w;
            if (attqVar == null) {
                attqVar = attq.a;
            }
        } else {
            attqVar = attq.a;
        }
        return attqVar.b;
    }

    public final void r(String str, Throwable th) {
        if (s()) {
            afsi.c(2, 33, str, th);
        }
    }

    public final boolean s() {
        aaea aaeaVar = this.a;
        return aaeaVar != null && evr.U(aaeaVar);
    }

    public final boolean t() {
        avxn avxnVar = this.a.a().s;
        if (avxnVar == null) {
            avxnVar = avxn.a;
        }
        return avxnVar.j;
    }

    public final boolean u() {
        avxn avxnVar = this.a.a().s;
        if (avxnVar == null) {
            avxnVar = avxn.a;
        }
        return avxnVar.g;
    }

    public final boolean v() {
        avxn avxnVar = this.a.a().s;
        if (avxnVar == null) {
            avxnVar = avxn.a;
        }
        return avxnVar.k;
    }
}
