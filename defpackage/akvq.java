package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvq {
    public final Context a;
    public final shf b;
    public final Executor c;
    public final akwc d;
    public final aaea e;
    public final akwd f;
    public final akwm g;
    public final akyk h;
    public final akyb i;
    public final alcw j;
    public final akxh k;
    public final axpg l;
    public final alep m;
    public final aloh n;
    public final akwg o;
    public final axze p;

    public akvq(Context context, shf shfVar, Executor executor, akwc akwcVar, aaea aaeaVar, akwd akwdVar, akwm akwmVar, akyk akykVar, axze axzeVar, akyb akybVar, alcw alcwVar, akxh akxhVar, axpg axpgVar, alep alepVar, akwg akwgVar, aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = shfVar;
        this.c = executor;
        this.d = akwcVar;
        this.e = aaeaVar;
        this.f = akwdVar;
        this.g = akwmVar;
        this.h = akykVar;
        this.p = axzeVar;
        this.i = akybVar;
        this.j = alcwVar;
        this.k = akxhVar;
        this.l = axpgVar;
        this.m = alepVar;
        this.o = akwgVar;
        this.n = alohVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23 && (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1)) {
            arrayList.add(avtm.UPLOAD_FEATURE_NO_STORAGE_PERMISSION);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str, aone aoneVar) {
        boolean contains = akwd.e(str).contains(akvx.BACKGROUND_TASK);
        aoneVar.copyOnWrite();
        akzs akzsVar = (akzs) aoneVar.instance;
        akzs akzsVar2 = akzs.a;
        akzsVar.c |= 65536;
        akzsVar.V = contains;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(aone aoneVar, avuj avujVar) {
        if (avujVar.j <= 0 || avujVar.k <= 0) {
            return false;
        }
        aoneVar.copyOnWrite();
        akzs akzsVar = (akzs) aoneVar.instance;
        akzs akzsVar2 = akzs.a;
        akzsVar.b |= 134217728;
        akzsVar.z = true;
        return true;
    }

    public final anhy a(final afsx afsxVar) {
        anhy T = anaf.T(new anfy() { // from class: akvh
            @Override // defpackage.anfy
            public final anhy a() {
                akvq akvqVar = akvq.this;
                afsx afsxVar2 = afsxVar;
                amkq.F(!afsxVar2.z(), "Cannot fetch videos for a signed-out identity.");
                String d = afsxVar2.d();
                ArrayList arrayList = new ArrayList();
                for (akzs akzsVar : akvqVar.g.c().values()) {
                    String str = akzsVar.e;
                    if (!str.isEmpty() && (!akzsVar.t || akzsVar.u)) {
                        if (str.equals(d)) {
                            aone builder = akzsVar.toBuilder();
                            boolean i = akvqVar.h.i();
                            boolean h = akvqVar.h.h();
                            if (i || h) {
                                if ((((akzs) builder.instance).c & 128) == 0) {
                                    akzp akzpVar = akzp.a;
                                    builder.copyOnWrite();
                                    akzs akzsVar2 = (akzs) builder.instance;
                                    akzpVar.getClass();
                                    akzsVar2.f65J = akzpVar;
                                    akzsVar2.c |= 128;
                                }
                                aone createBuilder = akzp.a.createBuilder();
                                if (i) {
                                    avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                                    createBuilder.copyOnWrite();
                                    akzp akzpVar2 = (akzp) createBuilder.instance;
                                    akzpVar2.d = avtqVar.aB;
                                    akzpVar2.b |= 2;
                                } else {
                                    avtq avtqVar2 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                                    createBuilder.copyOnWrite();
                                    akzp akzpVar3 = (akzp) createBuilder.instance;
                                    akzpVar3.d = avtqVar2.aB;
                                    akzpVar3.b |= 2;
                                }
                                builder.copyOnWrite();
                                akzs akzsVar3 = (akzs) builder.instance;
                                akzp akzpVar4 = (akzp) createBuilder.build();
                                akzpVar4.getClass();
                                akzsVar3.f65J = akzpVar4;
                                akzsVar3.c |= 128;
                            }
                            String valueOf = String.valueOf(((akzs) builder.instance).k);
                            if (valueOf.length() != 0) {
                                "Pending Upload frontendUploadId: ".concat(valueOf);
                            }
                            arrayList.add((akzs) builder.build());
                        }
                    }
                }
                return anaf.O(arrayList);
            }
        }, this.c);
        anaf.Y(T, new akvp(this, 2), this.c);
        return T;
    }

    public final void c(akxi akxiVar) {
        this.k.p(akxiVar);
    }

    public final void d(akxi akxiVar) {
        this.k.q(akxiVar);
    }
}
