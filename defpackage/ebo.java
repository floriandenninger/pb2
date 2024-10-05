package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.SettableFuture;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebo extends ecl {
    private static final amsj j = new amsj((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    private final Context h;
    private final dvj i;

    public ebo(ebe ebeVar, aone aoneVar, int i, Context context, dvj dvjVar) {
        super(ebeVar, "NK1iwlHEHCICBCLEvTy0TnuhgEeSXovnPs9zKPvVW8trSfaaB+/inefY+5AxSSUI", "/qulcnd5BAOc2NixUFmrPgx+DAD1V/hpoK4nowHOBbg=", aoneVar, i, 27);
        this.h = context;
        this.i = dvjVar;
    }

    public static String c(dvj dvjVar) {
        if (dvjVar == null || (dvjVar.b & 2) == 0) {
            return null;
        }
        dvl dvlVar = dvjVar.d;
        if (dvlVar == null) {
            dvlVar = dvl.a;
        }
        if (ebg.g(dvlVar.b)) {
            return null;
        }
        dvl dvlVar2 = dvjVar.d;
        if (dvlVar2 == null) {
            dvlVar2 = dvl.a;
        }
        return dvlVar2.b;
    }

    private final String d() {
        try {
            Future future = this.a.j;
            if (future != null) {
                future.get();
            }
            dvo dvoVar = this.a.i;
            if (dvoVar == null || (dvoVar.b & 4194304) == 0) {
                return null;
            }
            return dvoVar.s;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    private final boolean e() {
        return this.a.m;
    }

    @Override // defpackage.ecl
    protected final void a() {
        boolean z;
        Boolean valueOf;
        int i;
        dzh dzhVar;
        AtomicReference r = j.r(this.h.getPackageName());
        synchronized (r) {
            dzh dzhVar2 = (dzh) r.get();
            if (dzhVar2 == null || ebg.g(dzhVar2.a) || dzhVar2.a.equals("E") || dzhVar2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (ebg.g(c(this.i))) {
                    dvj dvjVar = this.i;
                    if (!ebg.g(c(dvjVar))) {
                        valueOf = false;
                    } else {
                        if (dvjVar != null && (dvjVar.b & 1) != 0) {
                            dvk dvkVar = dvjVar.c;
                            if (dvkVar == null) {
                                dvkVar = dvk.a;
                            }
                            int K = esv.K(dvkVar.c);
                            if (K != 0 && K == 4) {
                                z = true;
                                valueOf = Boolean.valueOf(z);
                            }
                        }
                        z = false;
                        valueOf = Boolean.valueOf(z);
                    }
                    i = (valueOf.booleanValue() && e()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean valueOf2 = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) pyi.e.e();
                String b = ((Boolean) pyi.d.e()).booleanValue() ? b() : null;
                if (bool.booleanValue() && e() && ebg.g(b)) {
                    b = d();
                }
                dzh dzhVar3 = new dzh((String) this.d.invoke(null, this.h, valueOf2, b));
                if (ebg.g(dzhVar3.a) || dzhVar3.a.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = d();
                        if (!ebg.g(d)) {
                            dzhVar3.a = d;
                        }
                    } else if (i2 == 4) {
                        dvl dvlVar = this.i.d;
                        if (dvlVar == null) {
                            dvlVar = dvl.a;
                        }
                        dzhVar3.a = dvlVar.b;
                    }
                }
                r.set(dzhVar3);
            }
            dzhVar = (dzh) r.get();
        }
        synchronized (this.g) {
            if (dzhVar != null) {
                aone aoneVar = this.g;
                String str = dzhVar.a;
                aoneVar.copyOnWrite();
                dvo dvoVar = (dvo) aoneVar.instance;
                dvo dvoVar2 = dvo.a;
                str.getClass();
                dvoVar.b |= 4194304;
                dvoVar.s = str;
                aone aoneVar2 = this.g;
                long j2 = dzhVar.b;
                aoneVar2.copyOnWrite();
                dvo dvoVar3 = (dvo) aoneVar2.instance;
                dvoVar3.b |= 536870912;
                dvoVar3.y = j2;
                aone aoneVar3 = this.g;
                String str2 = dzhVar.c;
                aoneVar3.copyOnWrite();
                dvo dvoVar4 = (dvo) aoneVar3.instance;
                str2.getClass();
                dvoVar4.b |= 268435456;
                dvoVar4.x = str2;
                aone aoneVar4 = this.g;
                String str3 = dzhVar.d;
                aoneVar4.copyOnWrite();
                dvo dvoVar5 = (dvo) aoneVar4.instance;
                str3.getClass();
                dvoVar5.c |= 128;
                dvoVar5.H = str3;
                aone aoneVar5 = this.g;
                String str4 = dzhVar.e;
                aoneVar5.copyOnWrite();
                dvo dvoVar6 = (dvo) aoneVar5.instance;
                str4.getClass();
                dvoVar6.c |= 256;
                dvoVar6.I = str4;
            }
        }
    }

    protected final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] i = ebg.i((String) pyi.f.e());
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(ebg.i((String) pyi.g.e()))));
            }
            Context context = this.h;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final SettableFuture f = SettableFuture.f();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: ecm
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    SettableFuture settableFuture = SettableFuture.this;
                    if (list == null) {
                        settableFuture.o(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                            if (apkChecksum.getType() == 8) {
                                settableFuture.o(ebg.c(apkChecksum.getValue()));
                                return;
                            }
                        }
                        settableFuture.o(null);
                    } catch (Throwable unused) {
                        settableFuture.o(null);
                    }
                }
            });
            return (String) f.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
