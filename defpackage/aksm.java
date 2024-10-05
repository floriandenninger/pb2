package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksm implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public aksm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public aksm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public aksm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[] cArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public aksm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[] sArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public static aksm a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aksm(azrwVar, azrwVar2, azrwVar3, 0);
    }

    public static aksl b(aadw aadwVar, vjf vjfVar, azrw azrwVar) {
        avdj avdjVar = aadwVar.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        aksl akslVar = new aksl((ScheduledExecutorService) azrwVar.get(), vjfVar);
        if (avdjVar != null) {
            apcu apcuVar = avdjVar.d;
            if (apcuVar == null) {
                apcuVar = apcu.a;
            }
            if (!apcuVar.b) {
                akslVar.f(false);
                return akslVar;
            }
        }
        akslVar.f(true);
        long j = 100;
        if (avdjVar != null) {
            apcu apcuVar2 = avdjVar.d;
            if (apcuVar2 == null) {
                apcuVar2 = apcu.a;
            }
            if (apcuVar2.d > 20) {
                apcu apcuVar3 = avdjVar.d;
                if (apcuVar3 == null) {
                    apcuVar3 = apcu.a;
                }
                j = apcuVar3.d;
            }
        }
        ((vjj) akslVar.b).c = j;
        long j2 = 60000;
        if (avdjVar != null) {
            apcu apcuVar4 = avdjVar.d;
            if (apcuVar4 == null) {
                apcuVar4 = apcu.a;
            }
            if (apcuVar4.c > 10000) {
                apcu apcuVar5 = avdjVar.d;
                if (apcuVar5 == null) {
                    apcuVar5 = apcu.a;
                }
                j2 = apcuVar5.c;
            }
        }
        ((vjj) akslVar.b).d = j2;
        return akslVar;
    }

    public static aknq c(Context context, Executor executor, azrw azrwVar) {
        aknq aknqVar;
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            aknqVar = (aknq) azrwVar.get();
        } else {
            String absolutePath = filesDir.getAbsolutePath();
            String str = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 7 + String.valueOf(str).length());
            sb.append(absolutePath);
            sb.append(str);
            sb.append("storage");
            aknn aknnVar = new aknn(sb.toString(), executor);
            aknnVar.c(new aknk(aknnVar, 0));
            aknqVar = aknnVar;
        }
        ayaw.k(aknqVar);
        return aknqVar;
    }

    public static aksm d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aksm(azrwVar, azrwVar2, azrwVar3, 1, (byte[]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.d;
        if (i == 0) {
            return b((aadw) this.a.get(), (vjf) this.b.get(), this.c);
        }
        if (i == 1) {
            return c((Context) ((axqs) this.a).a, (Executor) this.c.get(), this.b);
        }
        if (i == 2) {
            return new alog((alop) this.b.get(), (aloe) this.c.get(), ((aloi) this.a).get());
        }
        return new alqg(axqq.a(this.b), axqq.a(this.a), axqq.a(this.c));
    }
}
