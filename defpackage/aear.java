package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aear {
    public static atog A(aaea aaeaVar) {
        if (aaeaVar.a() == null) {
            return null;
        }
        atog atogVar = aaeaVar.a().p;
        return atogVar == null ? atog.a : atogVar;
    }

    public static void B(agaf agafVar) {
        ynm.m(agafVar.m(0L), afka.j);
    }

    public static boolean E(Context context) {
        return eg.a(context).g();
    }

    public static int F(Context context, afyt afytVar) {
        if (!afytVar.d(context)) {
            return 3;
        }
        if (afytVar.e(context)) {
            return !((Boolean) ynm.f(afytVar.c(), true)).booleanValue() ? 4 : 2;
        }
        return 5;
    }

    public static void G(Intent intent, String str, atog atogVar) {
        if (atogVar == null || !atogVar.l || TextUtils.isEmpty(str)) {
            return;
        }
        intent.putExtra("push_notification_clientstreamz_logging", str);
    }

    public static agbs H(Intent intent) {
        return I(intent.getExtras());
    }

    public static agbs I(Bundle bundle) {
        if (bundle == null) {
            return agbs.a("", -666);
        }
        return agbs.b(zhq.h(bundle.getString("notification_tag")), bundle.getInt("notification_id", -666), zhq.h(bundle.getString("client_id")));
    }

    public static ammv J(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        Notification notification = statusBarNotification.getNotification();
        if (notification != null && (bundle = notification.extras) != null) {
            return ammv.i(bundle.getString("client_id"));
        }
        return amlr.a;
    }

    public static void K(dy dyVar, agbs agbsVar) {
        String str = agbsVar.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("client_id", str);
        Bundle bundle2 = dyVar.y;
        if (bundle2 == null) {
            dyVar.y = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    public static void L(Intent intent, agbs agbsVar) {
        intent.putExtra("notification_tag", agbsVar.a);
        intent.putExtra("notification_id", agbsVar.b);
        intent.putExtra("client_id", agbsVar.c);
    }

    public static asuh M(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return (asuh) aonm.parseFrom(asuh.b, bArr, aomw.b());
            } catch (aoob unused) {
            }
        }
        return null;
    }

    public static void N(Intent intent, asuh asuhVar) {
        if (asuhVar == null) {
            return;
        }
        intent.putExtra("logging_directive", asuhVar.toByteArray());
    }

    public static void O(Intent intent, apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)) {
            zga.g("Notification clickTrackingEndpoint was not set or did not contain a RecordNotificationInteractionsEndpoint.");
        } else {
            intent.putExtra("record_interactions_endpoint", apxfVar.toByteArray());
        }
    }

    public static Bundle P(InteractionLoggingScreen interactionLoggingScreen) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("interaction_screen_extra", interactionLoggingScreen);
        return bundle;
    }

    public static InteractionLoggingScreen Q(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(InteractionLoggingScreen.class.getClassLoader());
            Parcelable parcelable = bundle.getParcelable("interaction_screen_extra");
            if (parcelable instanceof InteractionLoggingScreen) {
                return (InteractionLoggingScreen) parcelable;
            }
            return null;
        } catch (BadParcelableException unused) {
            zga.b("Malformed bundle.");
            return null;
        }
    }

    public static void R(Intent intent, InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen != null) {
            intent.putExtra("interaction_screen_bundle_extra", P(interactionLoggingScreen));
        }
    }

    public static String S(Intent intent) {
        if (intent.getExtras() == null || !intent.hasExtra("push_notification_clientstreamz_logging")) {
            return null;
        }
        return intent.getStringExtra("push_notification_clientstreamz_logging");
    }

    public static void T(Intent intent, aovq aovqVar) {
        if (aovqVar == null) {
            return;
        }
        intent.putExtra("identity_token", aovqVar.toByteArray());
    }

    public static void U(Context context) {
        ((NotificationManager) context.getSystemService("notification")).cancelAll();
    }

    public static void V(Context context, acra acraVar, agbs agbsVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : Y(context)) {
                String str = agbsVar.c;
                if (TextUtils.isEmpty(str) || (J(statusBarNotification).h() && TextUtils.equals(str, (CharSequence) J(statusBarNotification).c()) && TextUtils.equals(statusBarNotification.getTag(), agbsVar.a) && statusBarNotification.getId() == agbsVar.b)) {
                    W(acraVar, statusBarNotification.getNotification());
                    ((NotificationManager) context.getSystemService("notification")).cancel(agbsVar.a, agbsVar.b);
                }
            }
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(agbsVar.a, agbsVar.b);
    }

    public static void W(acra acraVar, Notification notification) {
        Bundle bundle = notification.extras;
        asuh M = bundle == null ? null : M(bundle.getByteArray("logging_directive"));
        Bundle bundle2 = notification.extras;
        InteractionLoggingScreen Q = bundle2 == null ? null : Q(bundle2.getBundle("interaction_screen_bundle_extra"));
        if (M == null || Q == null) {
            return;
        }
        acraVar.B(Q);
        acqx acqxVar = new acqx(M.d);
        acqx acqxVar2 = new acqx(acrb.PUSH_NOTIFICATION_HIDE);
        acraVar.F(acqxVar2, acqxVar);
        acraVar.u(acqxVar2, null);
        acraVar.I(3, acqxVar2, null);
    }

    public static void X(Context context, acra acraVar, Intent intent) {
        agbs H = H(intent);
        if (H.b == -666) {
            return;
        }
        V(context, acraVar, H);
    }

    public static StatusBarNotification[] Y(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Exception e) {
            afsi.b(1, 7, e.getMessage());
            return new StatusBarNotification[0];
        }
    }

    public static final Optional Z(twy twyVar) {
        return ad(twyVar.f, apeh.a);
    }

    public static final void a(actg actgVar) {
        actgVar.h(aean.class, "gel");
        actgVar.h(aeao.class, "mpl_s");
        actgVar.h(adze.class, "aiss");
        actgVar.h(adzd.class, "aisr");
        actgVar.h(adzb.class, "aisf");
        actgVar.h(adzc.class, "aisi");
        actgVar.h(aecm.class, "viss");
        actgVar.h(aecl.class, "visr");
        actgVar.h(aecj.class, "visf");
        actgVar.h(aeck.class, "visi");
        actgVar.h(aecs.class, "vsiss");
        actgVar.h(aect.class, "vsisrh");
        actgVar.h(aecq.class, "vsisfb");
        actgVar.h(aecr.class, "vsisr");
        actgVar.h(adzk.class, "asiss");
        actgVar.h(adzl.class, "asisrh");
        actgVar.h(adzi.class, "asisfb");
        actgVar.h(adzj.class, "asisr");
        actgVar.h(aecu.class, "vri");
        actgVar.h(aecv.class, "vrrh");
        actgVar.h(aecp.class, "vrfb");
        actgVar.h(aeco.class, "vr100k");
        actgVar.h(adzm.class, "ari");
        actgVar.h(adzn.class, "arrh");
        actgVar.h(adzh.class, "arfb");
        actgVar.h(adzg.class, "ar40k");
        actgVar.h(aebf.class, "ogpd");
        actgVar.h(aebr.class, "osor");
        actgVar.h(aebk.class, "orj");
        actgVar.h(aeax.class, "ocs");
        actgVar.h(aebb.class, "ofdos");
        actgVar.h(aebp.class, "osdos");
        actgVar.h(aebc.class, "ofdo");
        actgVar.h(aebq.class, "osdo");
        actgVar.h(aebs.class, "osdof");
        actgVar.h(aebn.class, "orh");
        actgVar.h(aeba.class, "orfb");
        actgVar.h(aeay.class, "or100k");
        actgVar.h(aeat.class, "oaisr");
        actgVar.h(aebv.class, "ovisr");
        actgVar.h(aebh.class, "ormk");
        actgVar.h(aebj.class, "orpr");
        actgVar.h(aebz.class, "orwnr");
        actgVar.h(aeby.class, "ovr2s");
        actgVar.h(aeaw.class, "oar2s");
        actgVar.h(aebw.class, "ovd2s");
        actgVar.h(aeau.class, "oad2s");
        actgVar.h(aebx.class, "ovrp2s");
        actgVar.h(aeav.class, "oarp2s");
        actgVar.h(aebd.class, "ofvrp");
        actgVar.h(aeaz.class, "ofarp");
        actgVar.h(aebm.class, "orf");
        actgVar.h(aebl.class, "ore");
        actgVar.h(aebe.class, "oge");
        actgVar.h(aebi.class, "oor");
        actgVar.h(aecb.class, "ppu");
        actgVar.h(aeap.class, "pari");
        actgVar.h(aeaq.class, "pvri");
        actgVar.h(aecw.class, "vtre");
        actgVar.h(aecx.class, "vtrr");
        actgVar.h(aecy.class, "vtrs");
        actgVar.h(aeci.class, "vhb");
        actgVar.h(aech.class, "vfb");
        actgVar.h(adzp.class, "atre");
        actgVar.h(adzq.class, "atrr");
        actgVar.h(adzr.class, "atrs");
        actgVar.h(adzo.class, "atps");
        actgVar.h(adza.class, "ahb");
        actgVar.h(adyz.class, "afb");
        actgVar.h(adyx.class, "aci");
        actgVar.h(adyw.class, "acc");
        actgVar.h(aecf.class, "vci");
        actgVar.h(aece.class, "vcc");
        actgVar.h(adyy.class, "acq");
        actgVar.h(aecg.class, "vcq");
        actgVar.h(adzx.class, "drm_gk_s");
        actgVar.h(adzw.class, "drm_gk_f");
        actgVar.h(adzz.class, "drm_net_s");
        actgVar.h(adzy.class, "drm_net_r");
        actgVar.h(aead.class, "drm_kr_s");
        actgVar.h(aeac.class, "drm_kr_f");
        actgVar.h(aeab.class, "drm_os_s");
        actgVar.h(aeaa.class, "drm_os_f");
        actgVar.h(adzv.class, "mrs");
        actgVar.h(adzu.class, "mrc");
        actgVar.h(aeae.class, "empa");
        actgVar.h(aeai.class, "empu");
        actgVar.h(aeah.class, "empp");
        actgVar.h(aeag.class, "empabs");
        actgVar.h(aeaf.class, "empabe");
        actgVar.h(aeak.class, "empvbs");
        actgVar.h(aeaj.class, "empvbe");
        actgVar.h(aedk.class, "vmscps");
        actgVar.h(aedj.class, "vmscpe");
        actgVar.h(aedm.class, "vmsrps");
        actgVar.h(aedl.class, "vmsrpe");
        actgVar.h(aedi.class, "vmscls");
        actgVar.h(aedh.class, "vmscle");
        actgVar.h(aedg.class, "vmpsts");
        actgVar.h(aedf.class, "vmpste");
        actgVar.h(aeda.class, "vmpbtgs");
        actgVar.h(aecz.class, "vmpbtge");
        actgVar.h(aedc.class, "vmpcdms");
        actgVar.h(aedb.class, "vmpcdme");
        actgVar.h(aede.class, "vmpdbs");
        actgVar.h(aedd.class, "vmpdbe");
        actgVar.h(aecn.class, "vmbf");
        actgVar.h(adzf.class, "ambf");
        actgVar.h(aeal.class, "exp");
        actgVar.h(aeam.class, "ffr");
        actgVar.h(aeca.class, "psr");
        actgVar.h(aecd.class, "sss");
        actgVar.h(aecc.class, "ssd");
        actgVar.g(aeax.class, fcx.f);
        actgVar.g(aebu.class, fcx.j);
        actgVar.g(adzs.class, fcx.d);
        actgVar.g(adzt.class, fcx.e);
        actgVar.g(aebo.class, fcx.h);
        actgVar.g(aebg.class, fcx.g);
        actgVar.g(aebt.class, fcx.i);
    }

    public static final Optional aa(List list) {
        if (list.isEmpty()) {
            zga.b("There are no notifications to get the payload from.");
            return Optional.empty();
        }
        if (list.size() > 1) {
            zga.b("There is more than one notification, must be a group summary (not supported).");
            return Optional.empty();
        }
        return ad(((txb) amkq.bk(list)).h, apej.a);
    }

    private static boolean ab(afhs afhsVar, PlayerConfigModel playerConfigModel, boolean z) {
        aapa aapaVar = aapa.DEFAULT;
        int ordinal = afhsVar.ar().ordinal();
        return ordinal != 0 ? ordinal == 5 : z && playerConfigModel.aH();
    }

    private static asi ac(final ayr ayrVar, pms[] pmsVarArr) {
        if (ayrVar != null) {
            pmsVarArr = (pms[]) DesugarArrays.stream(pmsVarArr).map(new Function() { // from class: aezv
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    pms pmsVar = (pms) obj;
                    return pmsVar.c(ayr.this.a(pmsVar));
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).toArray(aezw.d);
        }
        return new asi(pmsVarArr);
    }

    private static final Optional ad(aols aolsVar, aoqs aoqsVar) {
        ammv ammvVar;
        if (aolsVar == null) {
            zga.b("The payload is absent.");
            return Optional.empty();
        }
        try {
            aomw b = aomw.b();
            if (((aoqt) aoqsVar).a == aoqu.c(aolsVar.b)) {
                ammvVar = ammv.j(((aoqt) aoqsVar).b.k(aolsVar.c, b));
            } else {
                ammvVar = amlr.a;
            }
            return Optional.ofNullable((aooy) ammvVar.f());
        } catch (aoob unused) {
            zga.b("The payload has wrong format/type.");
            return Optional.empty();
        }
    }

    public static aty b(CronetEngine cronetEngine, Executor executor, ammy ammyVar, int i, int i2, boolean z, boolean z2) {
        return new aegk(cronetEngine, executor, ammyVar, i, i2, z, z2);
    }

    public static boolean c(Exception exc) {
        return exc.getCause() != null && (exc.getCause() instanceof SocketTimeoutException);
    }

    public static void d(aerv aervVar) {
        afki.a(aervVar.a);
        afki.a(aervVar.a());
    }

    public static final long e(String str, int i) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String f(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static String g(pbn pbnVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return f(pbnVar.a.getPropertyByteArray("metrics"));
            } catch (Exception e) {
                afid.c(afic.DRM, e, "Failed to retrieve DRM Metrics", new Object[0]);
            }
        }
        return "";
    }

    public static String h(aze azeVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return f(azeVar.a.getPropertyByteArray("metrics"));
            } catch (Exception e) {
                afid.c(afic.DRM, e, "Failed to retrieve DRM Metrics", new Object[0]);
            }
        }
        return "";
    }

    public static final pia i(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) > 32) {
            try {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
                if (bArr[8] == 0) {
                    axbc axbcVar = (axbc) aonm.parseFrom(axbc.a, copyOfRange);
                    if (axbcVar == null) {
                        afid.d(afic.DRM, "Widevine PSSH Proto parsing failed.");
                        return null;
                    }
                    if ((axbcVar.b & 32) != 0) {
                        return new pia(axbcVar.c.I(), axbcVar.d, (axbcVar.b & 256) != 0 ? axbcVar.e : 120);
                    }
                    return null;
                }
                afid.e(afic.DRM, "Expected PSSH version 0, actual version %s ", Byte.valueOf(bArr[8]));
                return null;
            } catch (aoob | ArrayIndexOutOfBoundsException unused) {
                afid.d(afic.DRM, "Could not parse drmInitData");
            }
        }
        return null;
    }

    public static int j(List list, long j, long j2, ammy ammyVar) {
        afcp afcpVar;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            afcq afcqVar = (afcq) list.get(i);
            if (afcqVar.b - j >= j2 && (afcpVar = afcqVar.a) != null && ammyVar.a(afcpVar)) {
                return i;
            }
        }
        return size;
    }

    public static boolean k(adxr adxrVar, afcp afcpVar, String str, PlayerConfigModel playerConfigModel, boolean z, long j) {
        return (adxrVar == null || TextUtils.isEmpty(str) || playerConfigModel.aa() || !z || !adxrVar.e(str, afcpVar.d(), j, 0, 0, 0)) ? false : true;
    }

    public static boolean l(adxr adxrVar, String str, PlayerConfigModel playerConfigModel, afcp afcpVar) {
        return adxrVar == null || TextUtils.isEmpty(str) || ozv.a(afcpVar.d()) == -1 || playerConfigModel.aa() || adxrVar.e(str, afcpVar.d(), 0L, 1, 3, 3);
    }

    public static boolean m(VideoStreamingData videoStreamingData, boolean z) {
        if (videoStreamingData != null) {
            return (videoStreamingData.equals(VideoStreamingData.a) || !(videoStreamingData.p.isEmpty() || videoStreamingData.v)) && !z;
        }
        return false;
    }

    public static void o(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (videoStreamingData.C()) {
            throw new aele("manifestless");
        }
        if (videoStreamingData.y != 3) {
            throw new aele("hdr");
        }
        if (!playerConfigModel.aw() || (!videoStreamingData.r() && !videoStreamingData.v())) {
            if (videoStreamingData.w) {
                throw new aele("manifestless-otf");
            }
            return;
        }
        throw new aele("ambisonic-audio");
    }

    public static boolean p(double d) {
        return Math.random() < d;
    }

    public static int q(VideoStreamingData videoStreamingData, boolean z) {
        return (z || !videoStreamingData.v || videoStreamingData.D()) ? Integer.MAX_VALUE : 480;
    }

    public static Pair r(ayr ayrVar, List list, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (!formatStreamModel.L() || z) {
                if (formatStreamModel.C()) {
                    arrayList3.add(formatStreamModel);
                } else if (formatStreamModel.P()) {
                    arrayList4.add(formatStreamModel);
                }
            }
        }
        pms[] pmsVarArr = (pms[]) Collection.EL.stream(arrayList3).map(acxx.l).toArray(aezw.a);
        pms[] pmsVarArr2 = (pms[]) Collection.EL.stream(arrayList4).map(acxx.l).toArray(aezw.c);
        if (pmsVarArr.length > 0) {
            arrayList.add(ac(ayrVar, pmsVarArr));
            arrayList2.add(new aezx(1, (FormatStreamModel[]) arrayList3.toArray(new FormatStreamModel[0])));
        }
        if (pmsVarArr2.length > 0) {
            arrayList.add(ac(ayrVar, pmsVarArr2));
            arrayList2.add(new aezx(2, (FormatStreamModel[]) arrayList4.toArray(new FormatStreamModel[0])));
        }
        return new Pair(new asj((asi[]) arrayList.toArray(new asi[0])), (aezx[]) arrayList2.toArray(new aezx[0]));
    }

    public static void s(aeru aeruVar, int i) {
        aeruVar.i("ssfr", new aeqs((i != 2 ? i != 3 ? "UNRECOGNIZED" : "EXO_PLAYER_STICKY_SFR_FALLBACK_APP_CYCLE" : "EXO_PLAYER_STICKY_SFR_FALLBACK_UNSPECIFIED").replaceFirst("EXO_PLAYER_STICKY_SFR_FALLBACK_", "")));
    }

    public static long t(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j + j2;
    }

    public static long u(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - j2;
    }

    public static int[] v(axj axjVar, aezx aezxVar) {
        ArrayList arrayList = new ArrayList();
        List list = axjVar.a().b;
        for (int i = 0; i < list.size(); i++) {
            if (((afxg) list.get(i)).b == aezxVar.a) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public static void w(agcz agczVar) {
        yjk.f();
        java.util.Collection c = agczVar.c();
        String.format(Locale.US, "There are %d active GCM topic subscriptions:", Integer.valueOf(c.size()));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            x((agcw) it.next(), true);
        }
    }

    public static final boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? "UNSUBSCRIBE" : "SUBSCRIBE";
    }

    public static void x(agcw agcwVar, boolean z) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = true != z ? "" : "    ";
        objArr[1] = agcwVar.b;
        int i = agcwVar.h;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNSUBSCRIBED" : "UNSUBSCRIBING" : "SUBSCRIBED" : "SUBSCRIBING";
        if (i == 0) {
            throw null;
        }
        objArr[2] = str;
        objArr[3] = Integer.valueOf(agcwVar.c.size());
        String.format(locale, "%s%s: %s - %d subscribers", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aflb n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r1, defpackage.afky r2, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r3, defpackage.afhs r4, int r5, boolean r6, boolean r7, boolean r8) {
        /*
            if (r3 == 0) goto La0
            if (r1 != 0) goto L6
            goto La0
        L6:
            if (r2 == 0) goto L20
            if (r8 == 0) goto L20
            aflb r8 = r2.C()
            aflb r0 = defpackage.aflb.GL_GVR
            if (r8 == r0) goto L1a
            aflb r8 = r2.C()
            aflb r0 = defpackage.aflb.YUV_SURFACE
            if (r8 != r0) goto L20
        L1a:
            aflb r1 = r2.C()
            goto La9
        L20:
            r2 = 0
            r8 = 1
            if (r7 != 0) goto L4b
            aapb r7 = r1.i()
            aapb r0 = defpackage.aapb.RECTANGULAR_2D
            if (r7 != r0) goto L4b
            aapb r7 = r1.i()
            boolean r7 = r3.as(r7)
            if (r7 != 0) goto L4b
            atyi r7 = r3.c
            aquz r7 = r7.e
            if (r7 != 0) goto L3e
            aquz r7 = defpackage.aquz.b
        L3e:
            int r7 = r7.aA
            int r7 = defpackage.aobq.bM(r7)
            if (r7 != 0) goto L48
        L46:
            r7 = 0
            goto L4c
        L48:
            r0 = 2
            if (r7 != r0) goto L46
        L4b:
            r7 = 1
        L4c:
            r0 = 4
            if (r5 != r0) goto L50
            r2 = 1
        L50:
            if (r2 == 0) goto L61
            boolean r8 = r3.aH()
            if (r8 != 0) goto L61
            if (r7 != 0) goto L61
            boolean r8 = r1.v
            if (r8 != 0) goto L61
            aflb r1 = defpackage.aflb.YUV_SURFACE
            goto La9
        L61:
            atyi r8 = r3.c
            aquz r8 = r8.e
            if (r8 != 0) goto L69
            aquz r8 = defpackage.aquz.b
        L69:
            boolean r8 = r8.Q
            if (r8 == 0) goto L7e
            if (r7 != 0) goto L7e
            boolean r8 = ab(r4, r3, r2)
            if (r8 == 0) goto L7e
            boolean r8 = m(r1, r6)
            if (r8 == 0) goto L7e
            aflb r1 = defpackage.aflb.GL_VPX
            goto La9
        L7e:
            boolean r2 = ab(r4, r3, r2)
            if (r2 != 0) goto L86
            if (r7 == 0) goto L8f
        L86:
            boolean r2 = m(r1, r6)
            if (r2 == 0) goto L8f
            aflb r1 = defpackage.aflb.GL_GVR
            goto La9
        L8f:
            r2 = 8
            if (r5 != r2) goto L96
            aflb r1 = defpackage.aflb.GL_VPX
            goto La9
        L96:
            boolean r1 = r1.v
            if (r1 == 0) goto L9d
            aflb r1 = defpackage.aflb.SECURE_SURFACE
            goto La9
        L9d:
            aflb r1 = defpackage.aflb.SURFACE
            goto La9
        La0:
            if (r2 == 0) goto La7
            aflb r1 = r2.C()
            goto La9
        La7:
            aflb r1 = defpackage.afkp.a
        La9:
            aflb r2 = defpackage.aflb.SURFACE
            if (r1 != r2) goto Lc3
            boolean r2 = r4.al()
            if (r2 != 0) goto Lc1
            if (r3 == 0) goto Lc3
            atyi r2 = r3.c
            aquz r2 = r2.e
            if (r2 != 0) goto Lbd
            aquz r2 = defpackage.aquz.b
        Lbd:
            boolean r2 = r2.bn
            if (r2 == 0) goto Lc3
        Lc1:
            aflb r1 = defpackage.aflb.SECURE_SURFACE
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aear.n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, afky, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs, int, boolean, boolean, boolean):aflb");
    }
}
