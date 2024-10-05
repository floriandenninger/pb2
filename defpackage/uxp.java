package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxp {
    public static final /* synthetic */ int a = 0;
    private static volatile Map b;
    private static volatile vfg d;
    private static final Object c = new Object();
    private static final Object e = new Object();
    private static final vhe f = new vhe(uxq.a);

    public static uxq a(uvu uvuVar) {
        aomf aomfVar;
        aone createBuilder = uxq.a.createBuilder();
        if (uvuVar == null) {
            return (uxq) createBuilder.build();
        }
        for (uvv uvvVar : uvuVar.f) {
            aone createBuilder2 = uxr.a.createBuilder();
            String str = uvvVar.e;
            createBuilder2.copyOnWrite();
            uxr uxrVar = (uxr) createBuilder2.instance;
            str.getClass();
            uxrVar.b |= 1;
            uxrVar.e = str;
            int i = uvvVar.c;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    long longValue = i == 1 ? ((Long) uvvVar.d).longValue() : 0L;
                    createBuilder2.copyOnWrite();
                    uxr uxrVar2 = (uxr) createBuilder2.instance;
                    uxrVar2.c = 2;
                    uxrVar2.d = Long.valueOf(longValue);
                } else if (i3 == 1) {
                    boolean booleanValue = i == 2 ? ((Boolean) uvvVar.d).booleanValue() : false;
                    createBuilder2.copyOnWrite();
                    uxr uxrVar3 = (uxr) createBuilder2.instance;
                    uxrVar3.c = 3;
                    uxrVar3.d = Boolean.valueOf(booleanValue);
                } else if (i3 == 2) {
                    double doubleValue = i == 3 ? ((Double) uvvVar.d).doubleValue() : 0.0d;
                    createBuilder2.copyOnWrite();
                    uxr uxrVar4 = (uxr) createBuilder2.instance;
                    uxrVar4.c = 4;
                    uxrVar4.d = Double.valueOf(doubleValue);
                } else if (i3 == 3) {
                    String str2 = i == 4 ? (String) uvvVar.d : "";
                    createBuilder2.copyOnWrite();
                    uxr uxrVar5 = (uxr) createBuilder2.instance;
                    str2.getClass();
                    uxrVar5.c = 5;
                    uxrVar5.d = str2;
                } else if (i3 == 4) {
                    if (i == 5) {
                        aomfVar = (aomf) uvvVar.d;
                    } else {
                        aomfVar = aomf.b;
                    }
                    createBuilder2.copyOnWrite();
                    uxr uxrVar6 = (uxr) createBuilder2.instance;
                    aomfVar.getClass();
                    uxrVar6.c = 6;
                    uxrVar6.d = aomfVar;
                } else {
                    throw new IllegalStateException("No known flag type");
                }
                uxr uxrVar7 = (uxr) createBuilder2.build();
                createBuilder.copyOnWrite();
                uxq uxqVar = (uxq) createBuilder.instance;
                uxrVar7.getClass();
                aony aonyVar = uxqVar.h;
                if (!aonyVar.c()) {
                    uxqVar.h = aonm.mutableCopy(aonyVar);
                }
                uxqVar.h.add(uxrVar7);
            } else {
                throw null;
            }
        }
        String str3 = uvuVar.e;
        createBuilder.copyOnWrite();
        uxq uxqVar2 = (uxq) createBuilder.instance;
        str3.getClass();
        uxqVar2.b = 4 | uxqVar2.b;
        uxqVar2.e = str3;
        String str4 = uvuVar.c;
        createBuilder.copyOnWrite();
        uxq uxqVar3 = (uxq) createBuilder.instance;
        str4.getClass();
        uxqVar3.b = 1 | uxqVar3.b;
        uxqVar3.c = str4;
        long j = uvuVar.i;
        createBuilder.copyOnWrite();
        uxq uxqVar4 = (uxq) createBuilder.instance;
        uxqVar4.b |= 8;
        uxqVar4.f = j;
        if ((uvuVar.b & 2) != 0) {
            aomf aomfVar2 = uvuVar.d;
            createBuilder.copyOnWrite();
            uxq uxqVar5 = (uxq) createBuilder.instance;
            aomfVar2.getClass();
            uxqVar5.b |= 2;
            uxqVar5.d = aomfVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        uxq uxqVar6 = (uxq) createBuilder.instance;
        uxqVar6.b |= 16;
        uxqVar6.g = currentTimeMillis;
        return (uxq) createBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vfg b(Context context, anic anicVar) {
        vfg vfgVar = d;
        if (vfgVar == null) {
            synchronized (e) {
                vfgVar = d;
                if (vfgVar == null) {
                    vcw vcwVar = new vcw(Collections.singletonList(vcz.q(context).a()));
                    vfh vfhVar = new vfh();
                    vfhVar.a = anicVar;
                    vfhVar.b = vcwVar;
                    vfhVar.b(vgk.a);
                    vfg a2 = vfhVar.a();
                    d = a2;
                    vfgVar = a2;
                }
            }
        }
        return vfgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amrz c(uxq uxqVar) {
        aomf aomfVar;
        HashMap aJ = amkq.aJ(uxqVar.h.size() + 3);
        for (uxr uxrVar : uxqVar.h) {
            int i = uxrVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                aJ.put(uxrVar.e, Long.valueOf(i == 2 ? ((Long) uxrVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                aJ.put(uxrVar.e, Boolean.valueOf(i == 3 ? ((Boolean) uxrVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                aJ.put(uxrVar.e, Double.valueOf(i == 4 ? ((Double) uxrVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                aJ.put(uxrVar.e, i == 5 ? (String) uxrVar.d : "");
            } else if (i3 == 4) {
                String str = uxrVar.e;
                if (i == 6) {
                    aomfVar = (aomf) uxrVar.d;
                } else {
                    aomfVar = aomf.b;
                }
                aJ.put(str, aomfVar.I());
            }
        }
        aJ.put("__phenotype_server_token", uxqVar.e);
        aJ.put("__phenotype_snapshot_token", uxqVar.c);
        aJ.put("__phenotype_configuration_version", Long.valueOf(uxqVar.f));
        return amrz.j(aJ);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anhy d(uvi uviVar, String str, String str2) {
        return anfq.h(uviVar.e().b(str, str2), tur.p, uviVar.c());
    }

    public static anhy e(uvi uviVar, final String str, String str2, final uxq uxqVar, boolean z, boolean z2) {
        if (str.indexOf(35) < 0 && !z2) {
            String packageName = uviVar.f.getPackageName();
            final int i = 1;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(packageName).length());
            sb.append(str);
            sb.append("#");
            sb.append(packageName);
            final anhy b2 = g(uviVar, sb.toString(), str2, z).b(new amml() { // from class: uxn
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    if (i != 0) {
                        uxq uxqVar2 = uxqVar;
                        int i2 = uxp.a;
                        return uxqVar2;
                    }
                    uxq uxqVar3 = uxqVar;
                    int i3 = uxp.a;
                    return uxqVar3;
                }
            }, uviVar.c());
            b2.d(new Runnable() { // from class: uxo
                @Override // java.lang.Runnable
                public final void run() {
                    anhy anhyVar = anhy.this;
                    String str3 = str;
                    int i2 = uxp.a;
                    try {
                        anaf.W(anhyVar);
                    } catch (ExecutionException unused) {
                        String.valueOf(str3).length();
                    }
                }
            }, uviVar.c());
        }
        vgz g = g(uviVar, str, str2, z);
        final int i2 = 0;
        return g.b(new amml() { // from class: uxn
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                if (i2 != 0) {
                    uxq uxqVar2 = uxqVar;
                    int i22 = uxp.a;
                    return uxqVar2;
                }
                uxq uxqVar3 = uxqVar;
                int i3 = uxp.a;
                return uxqVar3;
            }
        }, uviVar.c());
    }

    public static Map f(Context context) {
        InputStream open;
        Map map = b;
        if (map == null) {
            synchronized (c) {
                map = b;
                if (map == null) {
                    amrw h = amrz.h();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            try {
                                AssetManager assets = context.getAssets();
                                String valueOf = String.valueOf(str);
                                open = assets.open(valueOf.length() != 0 ? "phenotype/".concat(valueOf) : new String("phenotype/"));
                            } catch (aoob e2) {
                                String valueOf2 = String.valueOf(str);
                                Log.e("SnapshotHandler", valueOf2.length() != 0 ? "Unable to read Phenotype PackageMetadata for ".concat(valueOf2) : new String("Unable to read Phenotype PackageMetadata for "), e2);
                            }
                            try {
                                uwm uwmVar = new uwm(context, (uwn) aonm.parseFrom(uwn.a, open, aomw.b()));
                                h.g(uwmVar.a, uwmVar);
                                if (open != null) {
                                    open.close();
                                }
                            } catch (Throwable th) {
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        Log.e("SnapshotHandler", "Unable to read Phenotype PackageMetadata from assets.", e3);
                    }
                    amrz c2 = h.c();
                    b = c2;
                    map = c2;
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vgz g(uvi uviVar, String str, String str2, boolean z) {
        vfe a2 = vff.a();
        vda a3 = vdb.a(uviVar.f);
        a3.e("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append(".pb");
        a3.f(sb.toString());
        if (z && slf.f()) {
            a3.d("directboot-files");
        }
        a2.f(a3.a());
        a2.e(uxq.a);
        a2.d(f);
        a2.c();
        return b(uviVar.f, uviVar.c()).a(a2.a());
    }
}
