package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.io.File;
import java.security.Key;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svf implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final /* synthetic */ int g;

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i) {
        this.g = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, byte[] bArr) {
        this.g = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.d = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.e = azrwVar;
        this.f = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
        this.b = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, char[] cArr) {
        this.g = i;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.b = azrwVar4;
        this.f = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, char[] cArr, byte[] bArr) {
        this.g = i;
        this.a = azrwVar;
        this.e = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
        this.f = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, float[] fArr) {
        this.g = i;
        this.f = azrwVar;
        this.a = azrwVar2;
        this.e = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
        this.c = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, int[] iArr) {
        this.g = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.d = azrwVar3;
        this.f = azrwVar4;
        this.a = azrwVar5;
        this.e = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, short[] sArr) {
        this.g = i;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
        this.a = azrwVar5;
        this.f = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, boolean[] zArr) {
        this.g = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.f = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, byte[][] bArr) {
        this.g = i;
        this.c = azrwVar;
        this.f = azrwVar2;
        this.a = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
        this.e = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, char[][] cArr) {
        this.g = i;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.b = azrwVar4;
        this.f = azrwVar5;
        this.d = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, float[][] fArr) {
        this.g = i;
        this.f = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.e = azrwVar4;
        this.c = azrwVar5;
        this.d = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, int[][] iArr) {
        this.g = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.d = azrwVar5;
        this.f = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, short[][] sArr) {
        this.g = i;
        this.f = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.d = azrwVar5;
        this.e = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.f = azrwVar4;
        this.e = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.b = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, char[][][] cArr) {
        this.g = i;
        this.d = azrwVar;
        this.b = azrwVar2;
        this.f = azrwVar3;
        this.e = azrwVar4;
        this.c = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, float[][][] fArr) {
        this.g = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.f = azrwVar3;
        this.a = azrwVar4;
        this.c = azrwVar5;
        this.b = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, int[][][] iArr) {
        this.g = i;
        this.f = azrwVar;
        this.e = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
        this.a = azrwVar5;
        this.d = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, short[][][] sArr) {
        this.g = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.f = azrwVar3;
        this.e = azrwVar4;
        this.b = azrwVar5;
        this.a = azrwVar6;
    }

    public svf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.f = azrwVar3;
        this.b = azrwVar4;
        this.e = azrwVar5;
        this.d = azrwVar6;
    }

    public static svf A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 16, (int[][][]) null);
    }

    public static svf B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 17, (boolean[][][]) null);
    }

    public static svf C(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 18, (float[][][]) null);
    }

    public static svf D(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 19, (byte[]) null, (byte[]) null);
    }

    public static svf E(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 20, (char[]) null, (byte[]) null);
    }

    public static svf a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 0);
    }

    public static UnifiedTemplateResolver b(final ammv ammvVar, final ammv ammvVar2, final String str, final azrw azrwVar, final ammv ammvVar3, final ammv ammvVar4) {
        UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) sve.a.a(new syw() { // from class: svb
            @Override // defpackage.syw
            public final Object a() {
                ammv ammvVar5 = ammv.this;
                return new UnifiedTemplateResolver(((Boolean) ammvVar5.e(false)).booleanValue(), str, ((Boolean) ammvVar2.e(false)).booleanValue() ? (DebuggerClient) azrwVar.get() : null, ((Boolean) ammvVar3.e(false)).booleanValue(), ((Integer) ammvVar4.e(0)).intValue());
            }
        });
        ayaw.k(unifiedTemplateResolver);
        return unifiedTemplateResolver;
    }

    public static anic c(ammv ammvVar, anic anicVar, int i, int i2, ammv ammvVar2, sjp sjpVar, ammv ammvVar3) {
        boolean booleanValue = ((Boolean) ammvVar2.e(false)).booleanValue();
        StrictMode.ThreadPolicy.Builder penaltyLog = new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyLog();
        if (Build.VERSION.SDK_INT >= 23) {
            penaltyLog.detectResourceMismatches();
            if (Build.VERSION.SDK_INT >= 26) {
                penaltyLog.detectUnbufferedIo();
            }
        }
        return sid.a(anaf.C(sil.a(ammvVar3, sgf.j(i2, booleanValue, sjpVar, sgf.k("BG", sgf.l(penaltyLog.build(), (ThreadFactory) ammvVar.e(shu.a(i, pkr.b))))))), anicVar);
    }

    public static wgv d(azrw azrwVar, aadw aadwVar, Context context, anib anibVar, vfg vfgVar, String str) {
        vda a = vdb.a(context);
        a.e("account");
        a.f("account.pb");
        Uri a2 = a.a();
        vfk d = vfn.d(context, anibVar);
        d.d("pre_incognito_signed_in_user_id");
        d.b();
        d.c = str;
        d.e(fkm.k);
        vfn a3 = d.a();
        ywu d2 = ywv.d(azrwVar, anibVar);
        d2.a = wgw.a;
        d2.b(wgr.f);
        d2.b = wgr.e;
        d2.c = lyk.f;
        ywv a4 = d2.a();
        vfe a5 = vff.a();
        a5.e(awul.a);
        a5.f(a2);
        a5.b(a3);
        a5.b(a4);
        return new wgv(azrwVar, vfgVar.a(a5.a()), aadwVar);
    }

    public static Set e(woy woyVar, wps wpsVar, wxt wxtVar, wwb wwbVar, wvu wvuVar, wyk wykVar) {
        return new LinkedHashSet(Arrays.asList(woyVar, wpsVar, wxtVar, wwbVar, wvuVar, wykVar));
    }

    public static aivs f(Context context, azrw azrwVar, azrw azrwVar2, aifk aifkVar, Executor executor, Executor executor2) {
        return new aivs(context, azrwVar, azrwVar2, aifkVar, executor, executor2);
    }

    public static xls g(afxf afxfVar, xlt xltVar, xlo xloVar, xho xhoVar, aioc aiocVar, aypn aypnVar) {
        return new xls(afxfVar, xltVar, xloVar, xhoVar, aiocVar, aypnVar);
    }

    public static CronetEngine h(CronetEngine cronetEngine, yth ythVar, final Context context, final ynx ynxVar, final File file, final azrw azrwVar) {
        if (cronetEngine == null && (cronetEngine = ythVar.a(new yks() { // from class: ytl
            @Override // defpackage.yks
            public final Object a(Object obj, Object obj2) {
                atmi atmiVar;
                Context context2 = context;
                ynx ynxVar2 = ynxVar;
                File file2 = file;
                azrw azrwVar2 = azrwVar;
                try {
                    apdn apdnVar = ynxVar2.a().d;
                    if (apdnVar == null) {
                        apdnVar = apdn.a;
                    }
                    apdo apdoVar = apdnVar.f;
                    if (apdoVar == null) {
                        apdoVar = apdo.a;
                    }
                    if ((apdoVar.b & 1) != 0) {
                        apdo apdoVar2 = apdnVar.f;
                        if (apdoVar2 == null) {
                            apdoVar2 = apdo.a;
                        }
                        atmiVar = apdoVar2.c;
                        if (atmiVar == null) {
                            atmiVar = atmi.a;
                        }
                    } else {
                        aone createBuilder = atmi.a.createBuilder();
                        createBuilder.copyOnWrite();
                        atmi atmiVar2 = (atmi) createBuilder.instance;
                        atmiVar2.b |= 2;
                        atmiVar2.d = true;
                        createBuilder.copyOnWrite();
                        atmi atmiVar3 = (atmi) createBuilder.instance;
                        atmiVar3.b |= 1;
                        atmiVar3.c = true;
                        atmiVar = (atmi) createBuilder.build();
                    }
                    ((ExperimentalCronetEngine.Builder) obj).enableQuic(atmiVar.d).enableHttp2(atmiVar.c).setLibraryLoader((CronetEngine.Builder.LibraryLoader) new ytm(context2));
                    File file3 = new File(file2, "cronet_metadata_cache");
                    file3.mkdirs();
                    if (file3.isDirectory()) {
                        ((ExperimentalCronetEngine.Builder) obj).setStoragePath(file3.getAbsolutePath());
                        ((ExperimentalCronetEngine.Builder) obj).enableHttpCache(2, 0L);
                    }
                    apdu apduVar = yny.a(ynxVar2.a()).d;
                    if (apduVar == null) {
                        apduVar = apdu.a;
                    }
                    apds apdsVar = apduVar.c;
                    if (apdsVar == null) {
                        apdsVar = apds.a;
                    }
                    String str = apdsVar.b;
                    if (!TextUtils.isEmpty(str)) {
                        ((ExperimentalCronetEngine.Builder) obj).setExperimentalOptions(str);
                    }
                    boolean z = ynxVar2.d().j;
                    ((ExperimentalCronetEngine.Builder) obj).enableNetworkQualityEstimator(z);
                    if (atmiVar.d) {
                        List list = apdsVar.c;
                        if (list.isEmpty()) {
                            list = amru.A("www.googleapis.com", "www.googleadservices.com", "youtubei.googleapis.com", "yt3.ggpht.com", "yt3.googleusercontent.com", "www.gstatic.com", "csi.gstatic.com", "myphonenumbers-pa.googleapis.com", "people-pa.googleapis.com", "i.ytimg.com", "video.google.com", "s.youtube.com", "www.youtube.com", "googleads.g.doubleclick.net");
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((ExperimentalCronetEngine.Builder) obj).addQuicHint((String) it.next(), 443, 443);
                        }
                    }
                    ((CronetEngine.Builder) obj).enableBrotli(true);
                    ExperimentalCronetEngine build = ((ExperimentalCronetEngine.Builder) obj).build();
                    if (!z) {
                        return build;
                    }
                    build.addRttListener((NetworkQualityRttListener) azrwVar2.get());
                    return build;
                } catch (Throwable th) {
                    String valueOf = String.valueOf(obj2);
                    zga.d(valueOf.length() != 0 ? "Failed to construct CronetEngine using ".concat(valueOf) : new String("Failed to construct CronetEngine using "), th);
                    return null;
                }
            }
        })) == null) {
            throw new IllegalStateException("Could not create CronetEngine");
        }
        return cronetEngine;
    }

    public static ysl i(aabx aabxVar, ysn ysnVar, cnd cndVar, ysm ysmVar, Executor executor, aace aaceVar) {
        int i = aabxVar.c;
        ysl b = ysnVar.b(cndVar, ysmVar, executor, aaceVar, "bg-innertube");
        ayaw.k(b);
        return b;
    }

    public static ysl j(aabx aabxVar, ysn ysnVar, cnd cndVar, ysm ysmVar, Executor executor, aace aaceVar) {
        int i = aabxVar.c;
        ysl b = ysnVar.b(cndVar, ysmVar, executor, aaceVar, "ui-innertube");
        ayaw.k(b);
        return b;
    }

    public static acoy k(Executor executor, yxx yxxVar, aaea aaeaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new acoy(executor, yxxVar, aaeaVar, azrwVar, azrwVar2, azrwVar3);
    }

    public static acpw l(acpa acpaVar, Object obj, aazq aazqVar, afsy afsyVar, ynn ynnVar, afrw afrwVar) {
        return new acpw(acpaVar, (acpm) obj, aazqVar, afsyVar, ynnVar, afrwVar);
    }

    public static afgb m(amnv amnvVar, anic anicVar, afhs afhsVar, acsy acsyVar, acpl acplVar, afsy afsyVar) {
        return new afgb(amnvVar, anicVar, afhsVar, acsyVar, acplVar, afsyVar);
    }

    public static svf n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 1, (byte[]) null);
    }

    public static svf o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 4, (int[]) null);
    }

    public static svf p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 5, (boolean[]) null);
    }

    public static svf q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 6, (float[]) null);
    }

    public static svf r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 7, (byte[][]) null);
    }

    public static svf s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 8, (char[][]) null);
    }

    public static svf t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 9, (short[][]) null);
    }

    public static svf u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 10, (int[][]) null);
    }

    public static svf v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 11, (boolean[][]) null);
    }

    public static svf w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 12, (float[][]) null);
    }

    public static svf x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 13, (byte[][][]) null);
    }

    public static svf y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 14, (char[][][]) null);
    }

    public static svf z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new svf(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, 15, (short[][][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.g) {
            case 0:
                return b((ammv) this.a.get(), (ammv) this.b.get(), ((yjv) this.c).b(), this.d, (ammv) this.e.get(), (ammv) this.f.get());
            case 1:
                return c((ammv) ((axqs) this.a).a, (anic) this.b.get(), ots.d().intValue(), ((shq) this.c).get().intValue(), (ammv) ((axqs) this.e).a, ((sju) this.f).get(), (ammv) ((axqs) this.d).a);
            case 2:
                ((trq) this.c).get();
                shf shfVar = (shf) this.d.get();
                tme tmeVar = (tme) this.e.get();
                vgz vgzVar = (vgz) this.b.get();
                Executor executor = (Executor) this.f.get();
                return new tqi(shfVar, tmeVar, vgzVar, executor);
            case 3:
                return d(this.e, (aadw) this.c.get(), (Context) ((axqs) this.b).a, (anib) this.d.get(), (vfg) this.a.get(), ((yjv) this.f).b());
            case 4:
                return e((woy) this.c.get(), (wps) this.b.get(), (wxt) this.d.get(), (wwb) this.f.get(), (wvu) this.a.get(), (wyk) this.e.get());
            case 5:
                return new wxo(this.e, this.d, this.b, this.c, (Executor) this.f.get(), this.a);
            case 6:
                ajoy ajoyVar = (ajoy) this.f.get();
                wyo wyoVar = (wyo) this.a.get();
                wys wysVar = (wys) this.e.get();
                wym wymVar = (wym) this.b.get();
                wyu wyuVar = (wyu) this.d.get();
                return new wyn(ajoyVar, wyoVar, wysVar, wymVar, wyuVar, null, null, null, null);
            case 7:
                return f((Context) ((axqs) this.c).a, this.f, this.a, (aifk) this.b.get(), (Executor) this.d.get(), (Executor) this.e.get());
            case 8:
                return g((afxf) this.e.get(), (xlt) this.c.get(), (xlo) this.a.get(), (xho) this.b.get(), (aioc) this.f.get(), (aypn) this.d.get());
            case 9:
                return h((CronetEngine) ((axqs) this.f).a, (yth) this.a.get(), (Context) ((axqs) this.b).a, (ynx) this.c.get(), (File) this.d.get(), this.e);
            case 10:
                return i((aabx) ((axqs) this.a).a, (ysn) this.b.get(), (cnd) this.c.get(), (ysm) this.e.get(), (Executor) this.d.get(), ((aacf) this.f).get());
            case 11:
                return j((aabx) ((axqs) this.b).a, (ysn) this.c.get(), (cnd) this.d.get(), (ysm) this.f.get(), (Executor) this.e.get(), ((aacf) this.a).get());
            case 12:
                return new abaz((aarm) this.f.get(), (ajoy) this.a.get(), (afsy) this.b.get(), (ysl) this.e.get(), (ypa) this.c.get(), (aahv) this.d.get(), null, null, null);
            case 13:
                return k((Executor) this.d.get(), (yxx) this.c.get(), (aaea) this.e.get(), this.f, this.b, this.a);
            case 14:
                return l((acpa) this.d.get(), this.b.get(), (aazq) this.f.get(), (afsy) this.e.get(), (ynn) this.c.get(), (afrw) this.a.get());
            case 15:
                ((afpw) this.d).get();
                return new acrh((SharedPreferences) this.f.get(), (ywr) this.e.get(), (acpl) this.b.get(), (aaea) this.a.get());
            case 16:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f.get();
                ajkn ajknVar = (ajkn) this.e.get();
                shf shfVar2 = (shf) this.c.get();
                acpl acplVar = (acpl) this.b.get();
                Executor executor2 = (Executor) this.a.get();
                return new acsw(sharedPreferences, ajknVar, shfVar2, acplVar, executor2, null);
            case 17:
                return new aeeh((amnv) this.c.get(), (Key) this.a.get(), (afhz) this.f.get(), (aaea) this.b.get(), (afhs) this.e.get(), (adyl) this.d.get());
            case 18:
                return m(((adwi) this.e).get(), (anic) this.d.get(), (afhs) this.f.get(), (acsy) this.a.get(), (acpl) this.c.get(), (afsy) this.b.get());
            case 19:
                return new afgt((shf) this.e.get(), (shf) this.f.get(), (Context) ((axqs) this.d).a, (afqj) this.c.get(), (aaea) this.b.get(), ((afgz) this.a).get());
            default:
                return new afsm((Executor) this.a.get(), this.e, axqq.a(this.c), (ynx) this.d.get(), this.b, (ammv) ((axqs) this.f).a);
        }
    }
}
