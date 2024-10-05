package defpackage;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhs implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[] fArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[] iArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[] sArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][][] iArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public xhs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public static xhs A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 15, (float[][]) null);
    }

    public static xhs B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 16, (byte[][][]) null);
    }

    public static xhs C(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 17, (char[][][]) null);
    }

    public static xhs D(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 18, (short[][][]) null);
    }

    public static xhs E(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 19, (int[][][]) null);
    }

    public static xhs F(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 20, (boolean[][][]) null);
    }

    public static aeof G(axzg axzgVar, axpg axpgVar, axpg axpgVar2) {
        aeof aeofVar;
        if (((Boolean) axzgVar.j().aB()).booleanValue()) {
            ammv ammvVar = (ammv) axpgVar.get();
            if (ammvVar.h()) {
                aeofVar = (aeof) ammvVar.c();
                ayaw.k(aeofVar);
                return aeofVar;
            }
        }
        aeofVar = (aeof) axpgVar2.get();
        ayaw.k(aeofVar);
        return aeofVar;
    }

    public static xhs a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 0);
    }

    public static File b(Context context, String str, Object obj) {
        File c = yjk.c("CacheDir", context.getCacheDir());
        for (int i = 0; i < 5 && c == null; i++) {
            Thread.yield();
            StringBuilder sb = new StringBuilder(19);
            sb.append("CacheDir");
            sb.append(i);
            c = yjk.c(sb.toString(), context.getCacheDir());
        }
        if (c == null) {
            c = yjk.c("ExternalCacheDir", context.getExternalCacheDir());
        }
        String property = System.getProperty("java.io.tmpdir");
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(property).length() + 1 + String.valueOf(packageName).length());
        sb2.append(property);
        sb2.append("/");
        sb2.append(packageName);
        final File file = new File(sb2.toString());
        if (c != null) {
            if (file.isDirectory()) {
                final tru truVar = (tru) obj;
                final byte[] bArr = null;
                truVar.a.execute(new Runnable(file, bArr) { // from class: yjx
                    public final /* synthetic */ File a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        tru truVar2 = tru.this;
                        for (File file2 : this.a.listFiles()) {
                            if (file2.isDirectory() && file2.getName().startsWith("failovercache-")) {
                                truVar2.a(file2);
                            }
                        }
                    }
                });
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("failovercache-");
            sb3.append(currentTimeMillis);
            c = new File(file, sb3.toString());
            String valueOf = String.valueOf(c.getPath());
            zga.g(valueOf.length() != 0 ? "Could not obtain a cache directory - using failover dir: ".concat(valueOf) : new String("Could not obtain a cache directory - using failover dir: "));
            c.mkdirs();
        }
        if (str == null) {
            return c;
        }
        File file2 = new File(c, str);
        file2.mkdir();
        return file2;
    }

    public static ylr c(Executor executor, ylg ylgVar, Runnable runnable) {
        return new ylr(executor, ylgVar, runnable);
    }

    public static anic d(Set set, Context context, sii siiVar) {
        anic a = siiVar.a(yjk.k(Math.max(4, yjk.o()), 0, "critical", set));
        ayaw.k(a);
        return a;
    }

    public static anic e(Set set, Context context, sii siiVar) {
        anic a = siiVar.a(yjk.k(2, 9, "init", set));
        ayaw.k(a);
        return a;
    }

    public static anic f(Set set, Context context, sii siiVar) {
        anic a = siiVar.a(yjk.k(2, 10, "logging", set));
        ayaw.k(a);
        return a;
    }

    public static yrh g(Context context, ynx ynxVar, Handler handler) {
        return new yrh(context, ynxVar, handler);
    }

    public static yyf h(Context context, azrw azrwVar, azrw azrwVar2) {
        return new yyf(context, azrwVar, azrwVar2);
    }

    public static aafz i(azrw azrwVar, azrw azrwVar2, anib anibVar) {
        return new aafz(azrwVar, azrwVar2, anibVar);
    }

    public static aafq j(boolean z, azrw azrwVar, azrw azrwVar2) {
        aafq aafqVar = (aafq) (z ? azrwVar.get() : azrwVar2.get());
        ayaw.k(aafqVar);
        return aafqVar;
    }

    public static aaqz k(Set set, aaea aaeaVar) {
        return new aaqz(set, aaeaVar);
    }

    public static ammv l(ammv ammvVar, acpl acplVar, anib anibVar) {
        return ammvVar.h() ? ammv.j(new aeoe((aafc) ammvVar.c(), acplVar, anibVar)) : amlr.a;
    }

    public static xhs m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 1, (byte[]) null);
    }

    public static xhs n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 2, (char[]) null);
    }

    public static xhs o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 3, (short[]) null);
    }

    public static xhs p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 4);
    }

    public static xhs q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 5);
    }

    public static xhs r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 6);
    }

    public static xhs s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 7, (int[]) null);
    }

    public static xhs t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 8, (boolean[]) null);
    }

    public static xhs u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 9, (float[]) null);
    }

    public static xhs v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 10, (byte[][]) null);
    }

    public static xhs w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 11, (char[][]) null);
    }

    public static xhs x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 12, (short[][]) null);
    }

    public static xhs y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 13, (int[][]) null);
    }

    public static xhs z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new xhs(azrwVar, azrwVar2, azrwVar3, 14, (boolean[][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                return new xhr((afuh) this.a.get(), (xlj) this.b.get(), (Executor) this.c.get());
            case 1:
                return new xbq((wni) ((axqs) this.b).a, (shf) this.a.get(), (wzp) this.c.get());
            case 2:
                return b((Context) ((axqs) this.c).a, (String) ((axqs) this.a).a, ((yjy) this.b).get());
            case 3:
                return c((Executor) this.b.get(), (ylg) this.c.get(), (Runnable) this.a.get());
            case 4:
                return d(((axqw) this.a).get(), (Context) ((axqs) this.b).a, ((sij) this.c).get());
            case 5:
                return e(((axqw) this.a).get(), (Context) ((axqs) this.b).a, ((sij) this.c).get());
            case 6:
                return f(((axqw) this.a).get(), (Context) ((axqs) this.b).a, ((sij) this.c).get());
            case 7:
                return g((Context) ((axqs) this.c).a, (ynx) this.b.get(), (Handler) this.a.get());
            case 8:
                return new yvt(((amdb) this.c).get(), ((amdd) this.a).get(), (zey) this.b.get());
            case 9:
                yyf h = h((Context) ((axqs) this.c).a, this.b, this.a);
                h.b();
                return h;
            case 10:
                return new zak((Context) ((axqs) this.c).a, (ysy) this.a.get(), (axzg) this.b.get(), null, null);
            case 11:
                return new zfe((Context) ((axqs) this.c).a, (ExecutorService) this.a.get(), (shf) this.b.get());
            case 12:
                azrw azrwVar = this.c;
                azrw azrwVar2 = this.a;
                ((afpt) this.b).get();
                return new aaee(azrwVar, azrwVar2);
            case 13:
                return i(this.b, this.a, (anib) this.c.get());
            case 14:
                return j(((aagj) this.c).get().booleanValue(), this.b, this.a);
            case 15:
                return k(((axqw) this.a).get(), (aaea) this.c.get());
            case 16:
                return new aarr(this.b, (aaea) this.c.get(), (afsy) this.a.get());
            case 17:
                return new aawh(this.c, (ylf) this.a.get(), (aadw) this.b.get());
            case 18:
                return new acpf((Context) ((axqs) this.c).a, (shf) this.b.get(), this.a);
            case 19:
                return G((axzg) this.b.get(), axqq.a(this.c), axqq.a(this.a));
            default:
                return l((ammv) this.b.get(), (acpl) this.c.get(), (anib) this.a.get());
        }
    }
}
