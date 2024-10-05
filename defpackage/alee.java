package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class alee extends albk {
    private final ScheduledExecutorService a;

    public alee(aaea aaeaVar, ScheduledExecutorService scheduledExecutorService, akyb akybVar, axze axzeVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_UNKNOWN, akybVar, axzeVar, alepVar, null, null, null);
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.L;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        return s(str, akwmVar);
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.i;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "WaitForScottyResourceIdTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return (akzsVar.c & 16) != 0;
    }

    public final anhy s(final String str, final akwm akwmVar) {
        akzs b = akwmVar.b(str);
        if (b != null) {
            if ((b.c & 32) == 0) {
                akzp akzpVar = b.f65J;
                if (akzpVar == null) {
                    akzpVar = akzp.a;
                }
                if (alep.j(akzpVar)) {
                    return anaf.O(t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE), true));
                }
                return anaf.Q(new anfy() { // from class: aled
                    @Override // defpackage.anfy
                    public final anhy a() {
                        return alee.this.s(str, akwmVar);
                    }
                }, 10000L, TimeUnit.MILLISECONDS, this.a);
            }
            return anaf.O(t(this.d.d(), true));
        }
        throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND);
    }
}
