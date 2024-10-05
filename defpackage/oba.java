package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.j;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import defpackage.aahd;
import defpackage.ahuu;
import defpackage.oba;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class oba {

    @Backup
    public static final String FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "floaty_bar_tutorial_last_shown_timestamp";

    @Backup
    public static final String FLOATY_BAR_TUTORIAL_SHOWN_COUNT = "floaty_bar_tutorial_shown_count";
    private static Context a;
    public static Boolean b;
    public static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Boolean f;

    public static void A(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            alta.B(message, "Failed to construct command router.");
        } else {
            alta.B("Failed to construct command router.", new Object[0]);
        }
    }

    public static void B(RemoteException remoteException) {
        String message = remoteException.getMessage();
        if (message == null) {
            alta.C("Service was disconnected", new Object[0]);
        } else {
            alta.C("Service was disconnected: %s", message);
        }
    }

    public static void C() {
        alta.C("Service was disconnected", new Object[0]);
    }

    public static aqrt D(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return aqrt.a;
        }
        aqrt aqrtVar = aaeaVar.a().v;
        return aqrtVar == null ? aqrt.a : aqrtVar;
    }

    public static aqrs E(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null || (aadwVar.b().b & 524288) == 0) {
            return null;
        }
        aqrs aqrsVar = aadwVar.b().p;
        return aqrsVar == null ? aqrs.a : aqrsVar;
    }

    public static c F(Context context, Handler handler, aahd aahdVar, final ViewGroup viewGroup) {
        final b bVar = new b(context);
        bVar.mZ(new ahut() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.d
            @Override // defpackage.ahut
            public final void d(ahuu ahuuVar, View view) {
                viewGroup.addView(view, bVar.c());
            }
        });
        return new j(bVar, Optional.of(handler), aahdVar);
    }

    public static aypy G(final Context context, final Handler handler, aypy aypyVar, final ViewGroup viewGroup) {
        return aypyVar.Y(new ayrv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.e
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return oba.F(context, handler, (aahd) obj, viewGroup);
            }
        });
    }

    public static dvo H(Context context, String str, String str2) {
        dvo dvoVar;
        try {
            dvoVar = (dvo) new qxi(context, str, str2).a.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            dvoVar = null;
        }
        return dvoVar == null ? qxi.d() : dvoVar;
    }

    public static Object I(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static Bundle J(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String K() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        return sb.toString();
    }

    public static void L(Bundle bundle) {
        if (!((Boolean) qwr.d.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= ((Integer) qwr.c.a()).intValue()) {
            return;
        }
        String valueOf = String.valueOf(qwr.c.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
        sb.append("Max allowed bundle size of ");
        sb.append(valueOf);
        sb.append(" exceeded, you are passing in a bundle of ");
        sb.append(dataSize);
        sb.append(" size.");
        throw new IllegalStateException(sb.toString());
    }

    public static void M(FeedbackOptions feedbackOptions) {
        if (((Boolean) qwr.d.a()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            qwm.a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= ((Integer) qwr.c.a()).intValue()) {
                return;
            }
            String valueOf = String.valueOf(qwr.c.a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
            sb.append("Max allowed feedback options size of ");
            sb.append(valueOf);
            sb.append(" exceeded, you are passing in feedback options of ");
            sb.append(dataSize);
            sb.append(" size.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void N(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static File O(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void P(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
        sb.append("Failed to rename ");
        sb.append(valueOf);
        sb.append(" -> ");
        sb.append(valueOf2);
        sb.append(".");
        throw new qut(sb.toString());
    }

    public static void Q(quz quzVar) {
        File file = quzVar.b;
        try {
            if (!file.exists() && !file.createNewFile()) {
                String valueOf = String.valueOf(quzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to touch last-used file for ");
                sb.append(valueOf);
                sb.append(".");
                throw new qut(sb.toString());
            }
            if (file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            String valueOf2 = String.valueOf(quzVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb2.append("Failed to update last-used timestamp for ");
            sb2.append(valueOf2);
            sb2.append(".");
            throw new qut(sb2.toString());
        } catch (IOException e2) {
            String valueOf3 = String.valueOf(quzVar);
            String valueOf4 = String.valueOf(e2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
            sb3.append("Failed to touch last-used file for ");
            sb3.append(valueOf3);
            sb3.append(": ");
            sb3.append(valueOf4);
            throw new qut(sb3.toString());
        }
    }

    public static quz R(Context context, List list) {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return U(valueOf.length() != 0 ? "tmp_".concat(valueOf) : new String("tmp_"), context);
    }

    public static quz S(qva qvaVar, Context context, List list) {
        quz U = U(qvaVar.a, context);
        if (!U.c()) {
            return null;
        }
        Q(U);
        return U;
    }

    public static void T(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!W(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed to clean up temporary file ");
                sb.append(valueOf);
                sb.append(".");
                Log.e("DG", sb.toString());
            }
        }
        list.clear();
    }

    public static quz U(String str, Context context) {
        File file = new File(O(context), str);
        return new quz(new quw(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    public static byte[] V(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() != 0 ? "ERROR : ".concat(valueOf) : new String("ERROR : ")).getBytes();
    }

    public static boolean W(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                W(file2);
            }
        }
        return file.delete();
    }

    public static synchronized boolean X(Context context) {
        Boolean bool;
        synchronized (oba.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = d) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            d = null;
            if (aa()) {
                d = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    d = true;
                } catch (ClassNotFoundException unused) {
                    d = false;
                }
            }
            a = applicationContext;
            return d.booleanValue();
        }
    }

    public static boolean Y(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) qtu.b(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean Z() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean aa() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean ab() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static int ac(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static boolean ad(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (e == null) {
            e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return e.booleanValue();
    }

    public static boolean ae(Context context) {
        if (ad(context)) {
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            if (f == null) {
                f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f.booleanValue() && !aa()) {
                return true;
            }
        }
        return false;
    }

    public static void af(Context context) {
        try {
            qip.an(context);
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
        }
    }

    public static String ag(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static ArrayList ah() {
        return new ArrayList();
    }

    public static boolean ai(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean aj(Object[] objArr, Object obj) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!qar.j(objArr[i], obj)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static Uri b(Context context) {
        return whl.s(context, "watch", "floatybartutorial.pb");
    }

    public static void c(PlaybackStartDescriptor playbackStartDescriptor, ainy ainyVar) {
        aixh n = ainyVar.n();
        if (n == null) {
            return;
        }
        PlayerResponseModel c2 = n.c();
        playbackStartDescriptor.q((c2 == null || TimeUnit.SECONDS.toMillis((long) c2.a()) - n.b() > 1000) ? n.b() : 0L);
    }

    public static aypn d(nuo nuoVar) {
        return nuoVar.c.s(oht.b).A(nxb.o).J();
    }

    public static aypn e(aypn aypnVar) {
        return aypnVar.J().ah().sk();
    }

    public static aypr f(final aypn aypnVar) {
        return new aypr() { // from class: nyi
            @Override // defpackage.aypr
            public final banv a(aypn aypnVar2) {
                return aypn.this.M(new kha(aypnVar2, 3));
            }
        };
    }

    public static aypy g(aypy aypyVar) {
        return aypyVar.ae().aJ().d();
    }

    public static void h(ayqx ayqxVar) {
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayqxVar.qc();
    }

    public static String i(aqts aqtsVar) {
        if (((aqtsVar.d == 18 ? (aqtn) aqtsVar.e : aqtn.a).b & 2) != 0) {
            return (aqtsVar.d == 18 ? (aqtn) aqtsVar.e : aqtn.a).d;
        }
        if (aqtsVar.d == 1) {
            return (String) aqtsVar.e;
        }
        return null;
    }

    public static String j(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        if (((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10 ? (aqtn) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d : aqtn.a).b & 2) != 0) {
            return (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10 ? (aqtn) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d : aqtn.a).d;
        }
        if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 1) {
            return (String) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
        }
        return null;
    }

    public static String k(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) {
        if (((toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2 ? (aqtn) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c : aqtn.a).b & 2) != 0) {
            return (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2 ? (aqtn) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c : aqtn.a).d;
        }
        if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 1) {
            return (String) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c;
        }
        return null;
    }

    public static Optional l(apxf apxfVar, nqp nqpVar, nqd nqdVar, String str, boolean z, final Map map) {
        Optional ofNullable;
        String i = nqpVar.i();
        if (ammx.e(i) || ammx.e(str)) {
            ofNullable = Optional.ofNullable(nqpVar.e(apxfVar, nqdVar, z));
        } else if (amkq.b(str, i)) {
            ofNullable = Optional.ofNullable(nqpVar.d(apxfVar, nqdVar));
        } else {
            ofNullable = Optional.empty();
        }
        ofNullable.filter(nty.a).map(mjq.r).ifPresent(new Consumer() { // from class: ntx
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((npj) obj).m = xpb.b(map);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        return ofNullable;
    }

    public static String m(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 8) != 0) {
            return showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.f;
        }
        return null;
    }

    public static void n(boolean z, nnc nncVar) {
        if (z) {
            nncVar.p(false);
        }
    }

    public static boolean o(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, nqp nqpVar) {
        return nqpVar.z(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
    }

    public static aypn p(aypn aypnVar, aypn aypnVar2, aypn aypnVar3) {
        aypn n = aypn.e(aypnVar, aypnVar2, knl.h).n();
        return aypnVar3 == null ? n : aypnVar3.M(new kha(n, 2));
    }

    public static void q(yzr yzrVar, float f2) {
        double d2 = f2;
        if (d2 <= 0.0010000000474974513d) {
            yzrVar.a(false, false);
        } else {
            yzrVar.a(true, false);
            yzrVar.b.setAlpha((float) Math.min(1.0d, d2));
        }
    }

    public static nqg r(nqp nqpVar, apxf apxfVar, nqd nqdVar, boolean z) {
        return nqpVar.f(apxfVar, nqdVar, z, false);
    }

    public static void s(nqp nqpVar, aqts aqtsVar, asht ashtVar, boolean z) {
        nqpVar.r(aqtsVar, ashtVar, z, null, false);
    }

    public static int t(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            default:
                return 0;
        }
    }

    public static int u(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static PlaybackStartDescriptor v(String str, int i, long j) {
        aifz d2 = PlaybackStartDescriptor.d();
        d2.a = opn.c(str, i, j);
        return d2.a();
    }

    public static PlaybackStartDescriptor w(String str, long j) {
        apxf d2 = opn.d(str, j);
        aifz d3 = PlaybackStartDescriptor.d();
        d3.a = d2;
        return d3.a();
    }

    public static PlaybackStartDescriptor x(List list, int i, long j) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        if (max != i) {
            alta.C("Out of bounds video list index. Using nearest valid index.", new Object[0]);
        }
        aifz d2 = PlaybackStartDescriptor.d();
        d2.c(list);
        d2.b = max;
        d2.k = j;
        return d2.a();
    }

    public static Optional y(PlaybackStartDescriptor playbackStartDescriptor) {
        apxf apxfVar = playbackStartDescriptor.b;
        return apxfVar != null ? Optional.of(apxfVar) : opn.e(playbackStartDescriptor.m(), playbackStartDescriptor.a(), playbackStartDescriptor.c());
    }

    public static aryi z(atyq atyqVar) {
        aone createBuilder = aryi.a.createBuilder();
        createBuilder.copyOnWrite();
        aryi aryiVar = (aryi) createBuilder.instance;
        aryiVar.c = 1;
        aryiVar.b = 1 | aryiVar.b;
        aone createBuilder2 = aryh.a.createBuilder();
        createBuilder2.copyOnWrite();
        aryh aryhVar = (aryh) createBuilder2.instance;
        atyqVar.getClass();
        aryhVar.c = atyqVar;
        aryhVar.b = 58356580;
        createBuilder.copyOnWrite();
        aryi aryiVar2 = (aryi) createBuilder.instance;
        aryh aryhVar2 = (aryh) createBuilder2.build();
        aryhVar2.getClass();
        aryiVar2.g = aryhVar2;
        aryiVar2.b |= 32;
        return (aryi) createBuilder.build();
    }

    public List a() {
        return null;
    }
}
