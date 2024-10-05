package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alct extends albk {
    private final shf a;
    private final aaea b;
    private final albx c;
    private final alaj e;
    private final axze f;

    public alct(avtr avtrVar, shf shfVar, aaea aaeaVar, axze axzeVar, akyb akybVar, albx albxVar, alaj alajVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtrVar, akybVar, axzeVar, alepVar, null, null, null);
        this.a = shfVar;
        this.b = aaeaVar;
        this.f = axzeVar;
        this.c = albxVar;
        this.e = alajVar;
    }

    @Override // defpackage.albk
    public akwp k(Throwable th, akzs akzsVar, boolean z) {
        int m;
        int m2;
        avtq avtqVar;
        if (th instanceof FileNotFoundException) {
            axze axzeVar = this.f;
            String concat = f().concat(" File Not Found");
            akzq a = akzq.a(akzsVar.l);
            if (a == null) {
                a = akzq.UNKNOWN_UPLOAD;
            }
            axzeVar.f(concat, th, a);
            return t(this.d.c(this.c.a(akzsVar)), z);
        }
        if (!(th instanceof IOException) || (((m = akwg.m(akzsVar.s)) == 0 || m != 2) && ((m2 = akwg.m(akzsVar.s)) == 0 || m2 != 3))) {
            return super.k(th, akzsVar, z);
        }
        axze axzeVar2 = this.f;
        String f = f();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(f.length() + 33 + String.valueOf(message).length());
        sb.append(f);
        sb.append(" while reusing file input stream ");
        sb.append(message);
        String sb2 = sb.toString();
        akzq a2 = akzq.a(akzsVar.l);
        if (a2 == null) {
            a2 = akzq.UNKNOWN_UPLOAD;
        }
        axzeVar2.f(sb2, th, a2);
        this.e.c();
        if (th instanceof akwa) {
            avtqVar = ((akwa) th).a;
        } else {
            avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED;
        }
        alep alepVar = this.d;
        akzp b = b(akzsVar);
        b.getClass();
        return u(alepVar.o(avtqVar, b, amru.r(0L), this.f), z, airw.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.albk
    public final void q(akzs akzsVar) {
        long c = this.a.c();
        avuj avujVar = this.b.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        long j = avujVar.l;
        if (j > 0 && c - akzsVar.h > j) {
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED);
        }
    }
}
