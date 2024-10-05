package defpackage;

import android.accounts.AccountManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.system.Os;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.h;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.d;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteDialListener;
import com.google.android.libraries.youtube.net.retries.NetworkRetryControllerProdContainerRegistrar;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineKeepAliveService;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetector;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import com.google.android.youtube.R;
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.security.Key;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.CronetEngine;
import org.chromium.net.PrivateKeyType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efe implements azrw {
    private final efz a;
    private final int b;

    public efe(efz efzVar, int i) {
        this.a = efzVar;
        this.b = i;
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1100:
                return new jhw();
            case 1101:
                return new jka(this.a.gH);
            case 1102:
                return new jkb();
            case 1103:
                return new jkc((aahv) this.a.dB.get());
            case 1104:
                efz efzVar = this.a;
                return new jkg(efzVar.gH, (axzg) efzVar.kt.get(), null, null);
            case 1105:
                efz efzVar2 = this.a;
                return amsx.w((jhl) efzVar2.ox.get(), (jhl) efzVar2.oy.get(), (jhl) efzVar2.oz.get(), (jhl) efzVar2.oA.get(), (jhl) efzVar2.oB.get(), (jhl) efzVar2.oC.get(), (jhl) efzVar2.oD.get());
            case 1106:
                return new jhf(this.a.gH);
            case 1107:
                return new jjp();
            case 1108:
                return new jjq((aadw) this.a.D.get());
            case 1109:
                return new jjr(this.a.gH);
            case 1110:
                return new jjt(this.a.gH);
            case 1111:
                return new jjv();
            case 1112:
                return new jjx();
            case 1113:
                efz efzVar3 = this.a;
                return amsx.v((jhk) efzVar3.oF.get(), (jhk) efzVar3.oG.get(), new jjy(), new jkd(efzVar3.nC), new jke());
            case 1114:
                return new jho();
            case 1115:
                return new jjw();
            case 1116:
                return new axzf((aadw) this.a.D.get());
            case 1117:
                efz efzVar4 = this.a;
                return new jih(efzVar4.B, (aalu) efzVar4.dy.get(), (aahv) efzVar4.dB.get(), (aais) efzVar4.dJ.get(), (afsy) efzVar4.au.get(), (ExecutorService) efzVar4.f.get(), (axzf) efzVar4.kN.get(), null);
            case 1118:
                efz efzVar5 = this.a;
                return new joh(efzVar5.dB, efzVar5.oL, efzVar5.oM, efzVar5.oN, efzVar5.B, efzVar5.aq);
            case 1119:
                efz efzVar6 = this.a;
                return new joe((aahv) efzVar6.dB.get(), (aais) efzVar6.dJ.get(), (axzg) efzVar6.kK.get(), efzVar6.ix(), efzVar6.iy(), efzVar6.aq, null, null, null, null);
            case 1120:
                efz efzVar7 = this.a;
                return new jpy((aahv) efzVar7.dB.get(), efzVar7.lq(), efzVar7.lh(), efzVar7.lp(), efzVar7.lj(), (ywr) efzVar7.gQ.get(), efzVar7.ag(), (axzf) efzVar7.nj.get(), (axzg) efzVar7.kK.get(), null, null, null, null, null, null);
            case 1121:
                efz efzVar8 = this.a;
                return new jpl((aais) efzVar8.dJ.get(), (afsy) efzVar8.au.get(), efzVar8.lo(), efzVar8.lh(), efzVar8.lp(), (ywr) efzVar8.gQ.get(), efzVar8.ag(), (axzg) efzVar8.kK.get(), null, null, null, null, null, null);
            case 1122:
                efz efzVar9 = this.a;
                return new jpv(efzVar9.b.a, (aahv) efzVar9.dB.get(), efzVar9.lq(), efzVar9.lh(), efzVar9.lp(), efzVar9.lj(), efzVar9.ag(), (axzf) efzVar9.nj.get(), (axzg) efzVar9.kK.get(), null, null, null, null, null, null);
            case 1123:
                return this.a.lo();
            case 1124:
                return this.a.ix();
            case 1125:
                return this.a.iy();
            case 1126:
                efz efzVar10 = this.a;
                return new jur((fka) efzVar10.gN.get(), (agpd) efzVar10.la.get(), (ypa) efzVar10.B.get(), (afsy) efzVar10.au.get(), (ayqi) efzVar10.aq.get(), (jyu) efzVar10.oQ.get());
            case 1127:
                efz efzVar11 = this.a;
                return new jyu((fis) efzVar11.oP.get(), (ysy) efzVar11.as.get());
            case 1128:
                efz efzVar12 = this.a;
                return new fis((aais) efzVar12.dJ.get(), (afsy) efzVar12.au.get(), (shf) efzVar12.g.get());
            case 1129:
                efz efzVar13 = this.a;
                return new advs((aadw) efzVar13.D.get(), (advq) efzVar13.gi.get());
            case 1130:
                efz efzVar14 = this.a;
                return new adwl((aenl) efzVar14.gl.get(), axqq.a(efzVar14.gD), efzVar14.dE(), efzVar14.ga, (affa) efzVar14.gz.get(), (axzg) efzVar14.eY.get(), null, null);
            case 1131:
                efz efzVar15 = this.a;
                return new egd(efzVar15.et, (anhy) efzVar15.nR.get());
            case 1132:
                efz efzVar16 = this.a;
                return svf.k((Executor) efzVar16.f.get(), (yxx) efzVar16.k.get(), (aaea) efzVar16.K.get(), efzVar16.aw, efzVar16.at, efzVar16.pa);
            case 1133:
                efz efzVar17 = this.a;
                return amsx.t((afrs) efzVar17.oW.get(), (afrs) efzVar17.oX.get(), (afrs) efzVar17.oZ.get());
            case 1134:
                efz efzVar18 = this.a;
                acpa acpaVar = (acpa) efzVar18.mp.get();
                aazq aazqVar = (aazq) efzVar18.oV.get();
                Object obj = efzVar18.f208J.get();
                afsy afsyVar = (afsy) efzVar18.au.get();
                afqd afqdVar = (afqd) efzVar18.N.get();
                ynn ynnVar = (ynn) efzVar18.Z.get();
                afrw afrwVar = (afrw) efzVar18.at.get();
                return d.b(acpaVar, aazqVar, obj, afsyVar, afqdVar, ynnVar, afrwVar);
            case 1135:
                efz efzVar19 = this.a;
                aarm aarmVar = (aarm) efzVar19.er.get();
                ajoy ajoyVar = (ajoy) efzVar19.eV.get();
                return new aazq(aarmVar, ajoyVar, (ysl) efzVar19.fO.get(), (aadw) efzVar19.D.get(), null, null, null);
            case 1136:
                efz efzVar20 = this.a;
                return svf.l((acpa) efzVar20.mp.get(), efzVar20.f208J.get(), (aazq) efzVar20.oV.get(), (afsy) efzVar20.au.get(), (ynn) efzVar20.Z.get(), (afrw) efzVar20.at.get());
            case 1137:
                efz efzVar21 = this.a;
                return aijh.i((afsy) efzVar21.au.get(), (aayb) efzVar21.oY.get(), efzVar21.kK(), (aadw) efzVar21.D.get());
            case 1138:
                efz efzVar22 = this.a;
                aarm aarmVar2 = (aarm) efzVar22.er.get();
                ajoy ajoyVar2 = (ajoy) efzVar22.eV.get();
                return new aayb(aarmVar2, ajoyVar2, (ysl) efzVar22.fO.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1139:
                return this.a.av();
            case 1140:
                return new akmx(this.a.ev);
            case 1141:
                efz efzVar23 = this.a;
                return new akpv((aktq) efzVar23.bt.get(), (akpt) efzVar23.cJ.get(), efzVar23.pg, efzVar23.ph, efzVar23.pd, efzVar23.pl, Optional.of(efzVar23.po));
            case 1142:
                efz efzVar24 = this.a;
                return new aksw(efzVar24.b.a, (aktq) efzVar24.bt.get(), (aksp) efzVar24.pd.get(), (aksr) efzVar24.pf.get());
            case 1143:
                efz efzVar25 = this.a;
                return new aksp(efzVar25.b.a, (zey) efzVar25.al.get());
            case 1144:
                efz efzVar26 = this.a;
                return new aksr(efzVar26.b.a, (shf) efzVar26.g.get(), (aksq) efzVar26.pe.get(), (acpl) efzVar26.aw.get(), (aksp) efzVar26.pd.get(), (aktq) efzVar26.bt.get());
            case 1145:
                return new aksq(this.a.b.a);
            case 1146:
                efz efzVar27 = this.a;
                return new NativeCrashDetector(efzVar27.b.a, (aktq) efzVar27.bt.get(), (acpl) efzVar27.aw.get());
            case 1147:
                efz efzVar28 = this.a;
                return new akrq(efzVar28.e(), (ypa) efzVar28.B.get(), (shf) efzVar28.g.get(), (ScheduledExecutorService) efzVar28.f.get(), efzVar28.cC, efzVar28.pj, efzVar28.pi, efzVar28.pk, efzVar28.bu);
            case 1148:
                efz efzVar29 = this.a;
                return new akrr(efzVar29.b.a, efzVar29.pi, efzVar29.fF, efzVar29.D);
            case 1149:
                return new akrs(this.a.cC);
            case 1150:
                return new aktp();
            case 1151:
                aof lifecycle = ((aok) this.a.pn.get()).getLifecycle();
                ayaw.k(lifecycle);
                return lifecycle;
            case 1152:
                return new yqg((yqe) this.a.pm.get());
            case 1153:
                return new yqe(this.a.b.a);
            case 1154:
                efz efzVar30 = this.a;
                return new ybc((wcf) efzVar30.hM.get(), (aaea) efzVar30.K.get(), efzVar30.b.a, (afsy) efzVar30.au.get(), (abep) efzVar30.x.get(), (ysy) efzVar30.as.get());
            case 1155:
                efz efzVar31 = this.a;
                return new haa((ylf) efzVar31.ai.get(), (aadw) efzVar31.D.get());
            case 1156:
                efz efzVar32 = this.a;
                return new fhk((aadw) efzVar32.D.get(), (ylf) efzVar32.ai.get());
            case 1157:
                efz efzVar33 = this.a;
                return enq.z((ScheduledExecutorService) efzVar33.f.get(), (aadw) efzVar33.D.get());
            case 1158:
                efz efzVar34 = this.a;
                return enq.y((ymy) efzVar34.pt.get(), (Executor) efzVar34.f.get(), (aadw) efzVar34.D.get());
            case 1159:
                efz efzVar35 = this.a;
                aado aadoVar = new aado((aadw) efzVar35.D.get(), efzVar35.eK);
                aadoVar.a = axqq.a(efzVar35.pv);
                return aadoVar;
            case 1160:
                FirebaseAnalytics t = enq.t(this.a.b.a);
                ayaw.k(t);
                return t;
            case 1161:
                efz efzVar36 = this.a;
                Context context = efzVar36.b.a;
                return new yka((Executor) efzVar36.f.get(), efzVar36.px, efzVar36.pz, efzVar36.pA, efzVar36.pB, efzVar36.is, efzVar36.M, efzVar36.B, efzVar36.T, efzVar36.pC);
            case 1162:
                return Boolean.valueOf(yny.a(((ynx) this.a.M.get()).a()).f);
            case 1163:
                yrs yrsVar = (yrs) this.a.py.get();
                ayaw.k(yrsVar);
                return yrsVar;
            case 1164:
                efz efzVar37 = this.a;
                return new yrs(efzVar37.b.a, efzVar37.ar, (zey) efzVar37.al.get());
            case 1165:
                efz efzVar38 = this.a;
                final Context context2 = efzVar38.b.a;
                final azrw azrwVar = efzVar38.g;
                final azrw azrwVar2 = efzVar38.f;
                return (yzi) amlr.a.d(new amnv() { // from class: ykb
                    @Override // defpackage.amnv
                    public final Object get() {
                        Context context3 = context2;
                        azrw azrwVar3 = azrwVar;
                        azrw azrwVar4 = azrwVar2;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new yog("ScheduledTaskProto", 0));
                        return new yzi(new yzj(new yoc(context3, "com.google.android.libraries.youtube.common.task.ScheduledTaskStore", arrayList)), Executors.newScheduledThreadPool(1, new yna("taskSched")), (shf) azrwVar3.get(), (Executor) azrwVar4.get());
                    }
                });
            case 1166:
                efz efzVar39 = this.a;
                yzf yzfVar = new yzf((ypa) efzVar39.B.get(), (ysy) efzVar39.as.get());
                Executor executor = (Executor) efzVar39.f.get();
                HashMap hashMap = new HashMap();
                hashMap.put(yzf.e, yzfVar);
                return new yzc(hashMap, anaf.E(executor));
            case 1167:
                Context context3 = this.a.b.a;
                int i2 = enq.a;
                ammv.j(true);
                return new ansv((byte[]) null);
            case 1168:
                throw new IllegalArgumentException("Do not directly use the WorkManager or Configuration types. See go/tiktok/dev/androidx/work.");
            case 1169:
                efz efzVar40 = this.a;
                return new aabv(efzVar40.eL, efzVar40.by, efzVar40.dB, efzVar40.dJ, efzVar40.fO, efzVar40.iS, efzVar40.hV);
            case 1170:
                return ytb.g(amvs.a);
            case 1171:
                efz efzVar41 = this.a;
                afjo afjoVar = (afjo) efzVar41.gh.get();
                ahzx ahzxVar = (ahzx) efzVar41.eQ.get();
                afjoVar.b = ahzxVar.a.aD();
                aior F = ahzxVar.a.F();
                ayaw.k(F);
                return F;
            case 1172:
                return new ahzx((aioc) this.a.fY.get());
            case 1173:
                efz efzVar42 = this.a;
                return new ywf((ywe) efzVar42.pI.get(), efzVar42.b.a);
            case 1174:
                return new fhq();
            case 1175:
                efz efzVar43 = this.a;
                return new fhn(efzVar43.K, efzVar43.ai, (shf) efzVar43.g.get());
            case 1176:
                efz efzVar44 = this.a;
                aktr aktrVar = new aktr();
                aktrVar.a = (akvs) efzVar44.pL.get();
                aktrVar.b = (akvc) efzVar44.mO.get();
                return aktrVar;
            case 1177:
                efz efzVar45 = this.a;
                return new akvs((shf) efzVar45.g.get(), (aadw) efzVar45.D.get(), (ypa) efzVar45.B.get(), (afsy) efzVar45.au.get(), (aahv) efzVar45.dB.get(), (akwm) efzVar45.mD.get(), (akxh) efzVar45.mI.get(), (aldn) efzVar45.mK.get());
            case 1178:
                efz efzVar46 = this.a;
                return new afyc(efzVar46.ra, efzVar46.hM, efzVar46.au, efzVar46.gV, (aadw) efzVar46.D.get());
            case 1179:
                efz efzVar47 = this.a;
                twx twxVar = (twx) efzVar47.pN.get();
                udh udhVar = (udh) efzVar47.qX.get();
                udk udkVar = (udk) efzVar47.qY.get();
                return new udf(twxVar, udhVar, udkVar);
            case 1180:
                return new txg(this.a.b.a);
            case 1181:
                efz efzVar48 = this.a;
                return new uad(efzVar48.b.a, (twn) efzVar48.pO.get(), (tzz) efzVar48.pP.get());
            case 1182:
                return this.a.aA();
            case 1183:
                return new uac();
            case 1184:
                efz efzVar49 = this.a;
                return new udh(efzVar49.ax(), (tze) efzVar49.pR.get(), (twn) efzVar49.pO.get(), (uat) efzVar49.qI.get(), (twx) efzVar49.pN.get(), (ucn) efzVar49.qW.get(), (uar) efzVar49.qp.get(), ammv.j((afyo) efzVar49.qN.get()), efzVar49.b.a);
            case 1185:
                return new tze((twx) this.a.pN.get());
            case 1186:
                efz efzVar50 = this.a;
                Context context4 = efzVar50.b.a;
                uds udsVar = (uds) efzVar50.pS.get();
                txa txaVar = (txa) efzVar50.pT.get();
                axpg a = axqq.a(efzVar50.qO);
                axpg a2 = axqq.a(efzVar50.qP);
                axpg a3 = axqq.a(efzVar50.qQ);
                axpg a4 = axqq.a(efzVar50.qR);
                axpg a5 = axqq.a(efzVar50.qS);
                axqq.a(efzVar50.qT);
                axqq.a(efzVar50.qU);
                axqq.a(efzVar50.qV);
                return new uax(context4, udsVar, txaVar, a, a2, a3, a4, a5);
            case 1187:
                efz efzVar51 = this.a;
                return new udv(efzVar51.b.a, new udt((twn) efzVar51.pO.get()));
            case 1188:
                efz efzVar52 = this.a;
                return new txk(efzVar52.b.a, (twx) efzVar52.pN.get());
            case 1189:
                efz efzVar53 = this.a;
                uba ubaVar = new uba((uah) efzVar53.qr.get());
                ubaVar.a = efzVar53.ip();
                return ubaVar;
            case 1190:
                efz efzVar54 = this.a;
                uaq uaqVar = (uaq) efzVar54.pW.get();
                udm udmVar = (udm) efzVar54.qa.get();
                Object obj2 = efzVar54.qf.get();
                Object obj3 = efzVar54.qg.get();
                uan uanVar = (uan) efzVar54.qh.get();
                uan uanVar2 = (uan) efzVar54.qj.get();
                Object obj4 = efzVar54.qk.get();
                uao uaoVar = (uao) efzVar54.ql.get();
                Object obj5 = efzVar54.qm.get();
                uar uarVar = (uar) efzVar54.qp.get();
                return new uam(uaqVar, udmVar, (uan) obj2, (uaq) obj3, uanVar, uanVar2, uaoVar, (uaq) obj5, uarVar, (tzh) efzVar54.qo.get(), null, null);
            case 1191:
                efz efzVar55 = this.a;
                return new uaq((twn) efzVar55.pO.get(), (uak) efzVar55.pV.get());
            case 1192:
                efz efzVar56 = this.a;
                Context context5 = efzVar56.b.a;
                uaa uaaVar = (uaa) efzVar56.pQ.get();
                return new uas(context5, uaaVar);
            case 1193:
                return new tyo();
            case 1194:
                efz efzVar57 = this.a;
                udo udoVar = new udo();
                udoVar.a = (udp) efzVar57.pZ.get();
                return udoVar;
            case 1195:
                efz efzVar58 = this.a;
                return new udp((ucj) efzVar58.pX.get(), (twn) efzVar58.pO.get(), axqq.a(efzVar58.pY));
            case 1196:
                efz efzVar59 = this.a;
                return new ucl(efzVar59.b.a, efzVar59.ax());
            case 1197:
                return new afyh((ysl) this.a.fN.get());
            case 1198:
                efz efzVar60 = this.a;
                return new uan((twn) efzVar60.pO.get(), (uak) efzVar60.pV.get(), (uaj) efzVar60.qe.get());
            case 1199:
                efz efzVar61 = this.a;
                return new uap(efzVar61.b.a, (twn) efzVar61.pO.get(), (ubo) efzVar61.qb.get(), new yfl(axqw.a, efzVar61.qc, (short[]) null), (aloh) efzVar61.qd.get(), null, null, null, null, null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 1300:
                efz efzVar = this.a;
                Context context = efzVar.b.a;
                return wtv.H();
            case 1301:
                efz efzVar2 = this.a;
                azrw azrwVar = efzVar2.iQ;
                ekm ekmVar = (ekm) efzVar2.rB.get();
                azrw azrwVar2 = efzVar2.sy;
                azrw azrwVar3 = efzVar2.tI;
                azrw azrwVar4 = efzVar2.sB;
                azrw azrwVar5 = efzVar2.sC;
                azrw azrwVar6 = efzVar2.ty;
                azrw azrwVar7 = efzVar2.lr;
                azrw azrwVar8 = efzVar2.sz;
                azrw azrwVar9 = efzVar2.sG;
                azrw azrwVar10 = efzVar2.rV;
                return new elb(azrwVar, ekmVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, (whu) efzVar2.rz.get(), null, null);
            case 1302:
                return new ekm();
            case 1303:
                return wpo.H(this.a.rC);
            case 1304:
                efz efzVar3 = this.a;
                wnm wnmVar = (wnm) efzVar3.tW.get();
                Set iG = efzVar3.iG();
                Set iH = efzVar3.iH();
                amsx r = amsx.r((wwt) efzVar3.rF.get());
                Set iE = efzVar3.iE();
                Set iF = efzVar3.iF();
                amsx s = amsx.s((www) efzVar3.rF.get(), (www) efzVar3.sF.get());
                Set iA = efzVar3.iA();
                Set iB = efzVar3.iB();
                Set set = (Set) efzVar3.ua.get();
                Set set2 = (Set) efzVar3.ub.get();
                Context context2 = efzVar3.b.a;
                xln xlnVar = (xln) efzVar3.tz.get();
                return new wnl(wnmVar, iG, iH, r, iE, iF, s, iA, iB, set, set2, context2, xlnVar, (yfl) efzVar3.sj.get(), (wwm) efzVar3.sv.get(), (aaea) efzVar3.K.get(), (aadw) efzVar3.D.get(), null);
            case 1305:
                efz efzVar4 = this.a;
                return wmn.t((wxr) efzVar4.rI.get(), (wxr) efzVar4.tu.get(), (ywt) efzVar4.tQ.get(), (Map) efzVar4.tU.get(), efzVar4.B, (amsx) efzVar4.tV.get(), (whu) efzVar4.rz.get());
            case 1306:
                efz efzVar5 = this.a;
                return new wxr(efzVar5.rC, (amrz) efzVar5.rH.get());
            case 1307:
                efz efzVar6 = this.a;
                azrw azrwVar11 = efzVar6.rG;
                azrw azrwVar12 = efzVar6.rA;
                amrw h = amrz.h();
                h.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar12);
                h.g(apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, ejz.a);
                h.g(apae.SLOT_TYPE_IN_PLAYER, ejz.b);
                h.g(apae.SLOT_TYPE_LOCKSCREEN, ejz.c);
                h.g(apae.SLOT_TYPE_FIXED_FOOTER, ejz.d);
                h.g(apae.SLOT_TYPE_FORECASTING, ejz.e);
                h.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar11);
                h.g(apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, ejz.f);
                h.g(apae.SLOT_TYPE_PLAYBACK_TRACKING, ejz.g);
                h.g(apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, ejz.h);
                return h.c();
            case 1308:
                efz efzVar7 = this.a;
                return new wxo(efzVar7.rD, efzVar7.B, efzVar7.rE, efzVar7.K, (Executor) efzVar7.i.get(), efzVar7.rF);
            case 1309:
                return szr.l();
            case 1310:
                return new wxw(this.a.rC);
            case 1311:
                return new wxt(this.a.rC);
            case 1312:
                efz efzVar8 = this.a;
                return new wxr(efzVar8.rC, (amrz) efzVar8.tt.get());
            case 1313:
                efz efzVar9 = this.a;
                azrw azrwVar13 = efzVar9.rM;
                azrw azrwVar14 = efzVar9.rP;
                azrw azrwVar15 = efzVar9.sV;
                azrw azrwVar16 = efzVar9.ta;
                azrw azrwVar17 = efzVar9.tc;
                azrw azrwVar18 = efzVar9.te;
                azrw azrwVar19 = efzVar9.tm;
                azrw azrwVar20 = efzVar9.tn;
                azrw azrwVar21 = efzVar9.tq;
                azrw azrwVar22 = efzVar9.ts;
                amrw h2 = amrz.h();
                h2.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar13);
                h2.g(apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, azrwVar14);
                h2.g(apae.SLOT_TYPE_IN_PLAYER, azrwVar15);
                h2.g(apae.SLOT_TYPE_LOCKSCREEN, azrwVar16);
                h2.g(apae.SLOT_TYPE_FIXED_FOOTER, azrwVar17);
                h2.g(apae.SLOT_TYPE_FORECASTING, azrwVar18);
                h2.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar19);
                h2.g(apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, azrwVar20);
                h2.g(apae.SLOT_TYPE_PLAYBACK_TRACKING, azrwVar21);
                h2.g(apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, azrwVar22);
                return h2.c();
            case 1314:
                efz efzVar10 = this.a;
                return new ekz(efzVar10.rJ, (aoae) efzVar10.rK.get(), (aoae) efzVar10.rL.get(), null, null, null, null, null, null);
            case 1315:
                efz efzVar11 = this.a;
                return wtv.E(efzVar11.rC, (whu) efzVar11.rz.get());
            case 1316:
                return new aoae((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1317:
                return new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1318:
                efz efzVar12 = this.a;
                azrw azrwVar23 = efzVar12.rC;
                azrw azrwVar24 = efzVar12.rO;
                return new wtt(azrwVar23, azrwVar24, (whu) efzVar12.rz.get(), null, null);
            case 1319:
                efz efzVar13 = this.a;
                aahd aahdVar = (aahd) efzVar13.rN.get();
                return new wpl(aahdVar);
            case 1320:
                return new ffh();
            case 1321:
                efz efzVar14 = this.a;
                return wtz.b((wni) efzVar14.cT.get(), efzVar14.rC, efzVar14.rQ, efzVar14.K, efzVar14.sg, efzVar14.rV, efzVar14.sP, efzVar14.sQ, efzVar14.sS, efzVar14.sT, efzVar14.rO, (wor) efzVar14.sU.get(), (aifw) efzVar14.ls.get(), (Executor) efzVar14.i.get(), (ypa) efzVar14.B.get(), (whu) efzVar14.rz.get());
            case 1322:
                return new wzq((wng) this.a.cU.get());
            case 1323:
                efz efzVar15 = this.a;
                return svf.g((afxf) efzVar15.rU.get(), (xlt) efzVar15.rW.get(), (xlo) efzVar15.sd.get(), (xho) efzVar15.sf.get(), (aioc) efzVar15.fY.get(), (aypn) efzVar15.ok.get());
            case 1324:
                efz efzVar16 = this.a;
                return oux.e((xbt) efzVar16.rS.get(), (xbo) efzVar16.rT.get());
            case 1325:
                efz efzVar17 = this.a;
                return new xbt((wni) efzVar17.cT.get(), (shf) efzVar17.g.get(), (zbw) efzVar17.av.get(), (ysy) efzVar17.as.get(), (aloh) efzVar17.rR.get(), null, null);
            case 1326:
                return new aloh(this.a.b.a, (char[]) null);
            case 1327:
                return new xbo((xlj) this.a.eH.get());
            case 1328:
                return new xlt((xcl) this.a.rV.get());
            case 1329:
                return new xcl();
            case 1330:
                efz efzVar18 = this.a;
                return new xlu((aifw) efzVar18.ls.get(), (aifv) efzVar18.rX.get(), (wmt) efzVar18.rZ.get(), (xbq) efzVar18.sc.get(), (afxf) efzVar18.rU.get(), (xcl) efzVar18.rV.get(), (aahd) efzVar18.rN.get());
            case 1331:
                return afpv.F((ahzx) this.a.eQ.get());
            case 1332:
                return new wmt((tdq) this.a.rY.get());
            case 1333:
                return ote.e(this.a.e());
            case 1334:
                efz efzVar19 = this.a;
                return new xbq((wni) efzVar19.cT.get(), (shf) efzVar19.g.get(), (wzp) efzVar19.sb.get());
            case 1335:
                efz efzVar20 = this.a;
                return new wzp((aloh) efzVar20.sa.get(), (Executor) efzVar20.aA.get(), null, null, null);
            case 1336:
                return new aloh(this.a.b.a, (char[]) null);
            case 1337:
                efz efzVar21 = this.a;
                return new xho((xhk) efzVar21.se.get(), (afsy) efzVar21.au.get(), (Executor) efzVar21.f.get(), (afxf) efzVar21.rU.get());
            case 1338:
                efz efzVar22 = this.a;
                return shr.i((aadw) efzVar22.D.get(), (afuh) efzVar22.hz.get(), (afuh) efzVar22.me.get(), (shf) efzVar22.g.get());
            case 1339:
                efz efzVar23 = this.a;
                return wpk.b((woy) efzVar23.sk.get(), (wvl) efzVar23.sl.get(), (wuk) efzVar23.sm.get(), (wox) efzVar23.sx.get(), (wvs) efzVar23.sD.get(), (wxv) efzVar23.sF.get(), (wpp) efzVar23.sG.get(), (wxx) efzVar23.sH.get(), (wxy) efzVar23.sI.get(), (wya) efzVar23.sJ.get(), (wvb) efzVar23.sn.get(), (wvf) efzVar23.sp.get(), (wvd) efzVar23.so.get(), (wyb) efzVar23.sK.get(), (wyc) efzVar23.sL.get(), (wyj) efzVar23.sM.get(), (wwk) efzVar23.sN.get(), (wwg) efzVar23.sO.get(), (wvl) efzVar23.ss.get(), (aypn) efzVar23.eR.get(), (aypn) efzVar23.ok.get(), (aioc) efzVar23.fY.get());
            case 1340:
                efz efzVar24 = this.a;
                return oux.p((whu) efzVar24.rz.get(), wpa.b(efzVar24.K, (aifw) efzVar24.ls.get(), efzVar24.rZ, efzVar24.sh, efzVar24.sw));
            case 1341:
                efz efzVar25 = this.a;
                return oux.a((tdq) efzVar25.rY.get(), wnf.b((wng) efzVar25.cU.get()));
            case 1342:
                efz efzVar26 = this.a;
                return snd.C(efzVar26.rC, efzVar26.K, (whu) efzVar26.rz.get(), (yfl) efzVar26.sj.get(), (wwm) efzVar26.sv.get());
            case 1343:
                efz efzVar27 = this.a;
                return wtv.I(efzVar27.se, efzVar27.si);
            case 1344:
                efz efzVar28 = this.a;
                afsy afsyVar = (afsy) efzVar28.au.get();
                Executor executor = (Executor) efzVar28.f.get();
                return h.f(afsyVar, executor);
            case 1345:
                efz efzVar29 = this.a;
                return h.D((wod) efzVar29.su.get(), efzVar29.io(), (whu) efzVar29.rz.get());
            case 1346:
                efz efzVar30 = this.a;
                return snd.z(efzVar30.rU, efzVar30.sc, efzVar30.K, efzVar30.st, (whu) efzVar30.rz.get());
            case 1347:
                return this.a.io();
            case 1348:
                return wpo.p((wob) this.a.sk.get());
            case 1349:
                return szr.m();
            case 1350:
                return szr.o();
            case 1351:
                return szr.p();
            case 1352:
                return szr.n();
            case 1353:
                return wup.l();
            case 1354:
                return wup.a();
            case 1355:
                return wup.b();
            case 1356:
                return wup.c();
            case 1357:
                return wup.m();
            case 1358:
                return wpo.e((wob) this.a.sk.get());
            case 1359:
                return wup.n();
            case 1360:
                return wup.d();
            case 1361:
                return wpo.s((wob) this.a.sk.get());
            case 1362:
                return wup.e();
            case 1363:
                return wup.f();
            case 1364:
                return wup.g();
            case 1365:
                return wup.o();
            case 1366:
                return wup.h();
            case 1367:
                return wup.p();
            case 1368:
                return wup.i();
            case 1369:
                efz efzVar31 = this.a;
                return shr.E((Executor) efzVar31.f.get(), (abds) efzVar31.lv.get(), (abdt) efzVar31.lu.get(), (whu) efzVar31.rz.get());
            case 1370:
                efz efzVar32 = this.a;
                return new wvs(efzVar32.sy, efzVar32.sz, efzVar32.sC);
            case 1371:
                return new wvz(this.a.B);
            case 1372:
                efz efzVar33 = this.a;
                return new wyt((wni) efzVar33.cT.get(), (wym) efzVar33.sB.get(), (aaea) efzVar33.K.get());
            case 1373:
                efz efzVar34 = this.a;
                wni wniVar = (wni) efzVar34.cT.get();
                ajoy ajoyVar = (ajoy) efzVar34.sA.get();
                return new wym(wniVar, ajoyVar, null, null, null, null);
            case 1374:
                return wpo.I(this.a.hl);
            case 1375:
                efz efzVar35 = this.a;
                azrw azrwVar25 = efzVar35.rC;
                azrw azrwVar26 = efzVar35.B;
                azrw azrwVar27 = efzVar35.sE;
                azrw azrwVar28 = efzVar35.sk;
                return new wxv(azrwVar25, azrwVar26, azrwVar27, azrwVar28);
            case 1376:
                return szr.r();
            case 1377:
                return wpo.c((ypa) this.a.B.get());
            case 1378:
                efz efzVar36 = this.a;
                return wtv.F(efzVar36.rC, (whu) efzVar36.rz.get());
            case 1379:
                return wpo.f(this.a.rC);
            case 1380:
                return wpo.g(this.a.rC);
            case 1381:
                return wpo.h(this.a.rC);
            case 1382:
                efz efzVar37 = this.a;
                return wtv.b(efzVar37.rC, efzVar37.bW());
            case 1383:
                efz efzVar38 = this.a;
                return new wyj(efzVar38.rC, efzVar38.rF);
            case 1384:
                efz efzVar39 = this.a;
                azrw azrwVar29 = efzVar39.sC;
                azrw azrwVar30 = efzVar39.sy;
                return new wwg(azrwVar29, azrwVar30);
            case 1385:
                return new wpv((ainy) this.a.fX.get());
            case 1386:
                efz efzVar40 = this.a;
                return wmq.n(efzVar40.sk, efzVar40.rQ, efzVar40.rO, efzVar40.sq, efzVar40.sr, efzVar40.sR, (ypa) efzVar40.B.get(), (whu) efzVar40.rz.get(), (aaea) efzVar40.K.get());
            case 1387:
                efz efzVar41 = this.a;
                return wtv.G(efzVar41.rC, (whu) efzVar41.rz.get());
            case 1388:
                return wpo.F((whu) this.a.rz.get());
            case 1389:
                return wor.b;
            case 1390:
                efz efzVar42 = this.a;
                return snd.e(efzVar42.rC, efzVar42.rV, efzVar42.sP, efzVar42.sZ, (Executor) efzVar42.i.get());
            case 1391:
                efz efzVar43 = this.a;
                return shr.h(efzVar43.b.a, (aivs) efzVar43.sX.get(), (aivq) efzVar43.sW.get(), (aypn) efzVar43.sY.get());
            case 1392:
                efz efzVar44 = this.a;
                return svf.f(efzVar44.b.a, efzVar44.sW, efzVar44.kp, (aifk) efzVar44.fS.get(), (Executor) efzVar44.f.get(), (Executor) efzVar44.i.get());
            case 1393:
                return xuq.b();
            case 1394:
                return ahal.G((ahzx) this.a.eQ.get());
            case 1395:
                efz efzVar45 = this.a;
                return new wtw(efzVar45.rC, efzVar45.rV, efzVar45.sS, efzVar45.sP, efzVar45.rO, efzVar45.tb, (Executor) efzVar45.i.get());
            case 1396:
                return new ajoy(this.a.jV, (char[]) null, (short[]) null);
            case 1397:
                efz efzVar46 = this.a;
                return h.h(efzVar46.rC, efzVar46.td, efzVar46.sg);
            case 1398:
                return new wxz(this.a.rC);
            case 1399:
                efz efzVar47 = this.a;
                azrw azrwVar31 = efzVar47.K;
                azrw azrwVar32 = efzVar47.rO;
                azrw azrwVar33 = efzVar47.sP;
                azrw azrwVar34 = efzVar47.rD;
                azrw azrwVar35 = efzVar47.tf;
                azrw azrwVar36 = efzVar47.tg;
                azrw azrwVar37 = efzVar47.ti;
                azrw azrwVar38 = efzVar47.rC;
                return new wue(azrwVar31, azrwVar32, azrwVar33, azrwVar34, azrwVar35, azrwVar36, azrwVar37, azrwVar38, azrwVar38, efzVar47.td, efzVar47.tj, efzVar47.sg, efzVar47.B, (Executor) efzVar47.aA.get(), (Executor) efzVar47.i.get(), (CopyOnWriteArrayList) efzVar47.tk.get(), (whu) efzVar47.rz.get(), efzVar47.tl, null, null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 1400:
                return wpo.d(this.a.hJ);
            case 1401:
                efz efzVar = this.a;
                return h.C((aypn) efzVar.eR.get(), (wxx) efzVar.sH.get(), (whu) efzVar.rz.get());
            case 1402:
                efz efzVar2 = this.a;
                return new agdo(efzVar2.th, efzVar2.gH, 0);
            case 1403:
                efz efzVar3 = this.a;
                return oux.m(efzVar3.lt, efzVar3.g);
            case 1404:
                efz efzVar4 = this.a;
                azrw azrwVar = efzVar4.rC;
                azrw azrwVar2 = efzVar4.sg;
                return new wyf(azrwVar, azrwVar2);
            case 1405:
                return szr.j();
            case 1406:
                efz efzVar5 = this.a;
                return h.e((Executor) efzVar5.aA.get(), (Executor) efzVar5.i.get());
            case 1407:
                return new ejt(this.a.rC);
            case 1408:
                efz efzVar6 = this.a;
                return new wud(efzVar6.rC, efzVar6.sP, efzVar6.to, efzVar6.su, efzVar6.tp, efzVar6.lO, (whu) efzVar6.rz.get(), null, null);
            case 1409:
                efz efzVar7 = this.a;
                return new wyw(efzVar7.si, efzVar7.su, efzVar7.se, (whu) efzVar7.rz.get(), null, null);
            case 1410:
                efz efzVar8 = this.a;
                return new ela(efzVar8.rC, (aoae) efzVar8.tr.get(), null, null, null, null, null);
            case 1411:
                return new aoae((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1412:
                return wpo.E((amrz) this.a.tP.get());
            case 1413:
                efz efzVar9 = this.a;
                azrw azrwVar3 = efzVar9.tA;
                azrw azrwVar4 = efzVar9.tB;
                azrw azrwVar5 = efzVar9.tC;
                azrw azrwVar6 = efzVar9.tD;
                azrw azrwVar7 = efzVar9.tE;
                azrw azrwVar8 = efzVar9.tF;
                azrw azrwVar9 = efzVar9.tL;
                azrw azrwVar10 = efzVar9.tM;
                azrw azrwVar11 = efzVar9.tN;
                azrw azrwVar12 = efzVar9.tO;
                amrw h = amrz.h();
                h.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar3);
                h.g(apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, azrwVar4);
                h.g(apae.SLOT_TYPE_FORECASTING, azrwVar5);
                h.g(apae.SLOT_TYPE_IN_PLAYER, azrwVar6);
                h.g(apae.SLOT_TYPE_LOCKSCREEN, azrwVar8);
                h.g(apae.SLOT_TYPE_FIXED_FOOTER, azrwVar7);
                h.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar9);
                h.g(apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, azrwVar10);
                h.g(apae.SLOT_TYPE_PLAYBACK_TRACKING, azrwVar11);
                h.g(apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, azrwVar12);
                return h.c();
            case 1414:
                efz efzVar10 = this.a;
                return snd.A(efzVar10.rC, efzVar10.ty, (Executor) efzVar10.f.get(), (Executor) efzVar10.i.get(), (whu) efzVar10.rz.get());
            case 1415:
                efz efzVar11 = this.a;
                ajoy ajoyVar = (ajoy) efzVar11.sA.get();
                wyo wyoVar = (wyo) efzVar11.tv.get();
                wys wysVar = (wys) efzVar11.tw.get();
                wym wymVar = (wym) efzVar11.sB.get();
                wyu wyuVar = (wyu) efzVar11.tx.get();
                return new wyn(ajoyVar, wyoVar, wysVar, wymVar, wyuVar, null, null, null, null);
            case 1416:
                return wup.j();
            case 1417:
                efz efzVar12 = this.a;
                return wtv.c((aaea) efzVar12.K.get(), (wym) efzVar12.sB.get());
            case 1418:
                return this.a.bn();
            case 1419:
                return this.a.bv();
            case 1420:
                efz efzVar13 = this.a;
                return new wsd(efzVar13.rC, efzVar13.ty, (aaea) efzVar13.K.get(), (Executor) efzVar13.f.get(), (Executor) efzVar13.i.get(), 0);
            case 1421:
                efz efzVar14 = this.a;
                azrw azrwVar13 = efzVar14.rC;
                ajoy ajoyVar2 = (ajoy) efzVar14.sA.get();
                azrw azrwVar14 = efzVar14.ty;
                return wmn.u(azrwVar13, ajoyVar2, azrwVar14, (shf) efzVar14.g.get());
            case 1422:
                efz efzVar15 = this.a;
                return oux.f(efzVar15.rC, efzVar15.ty);
            case 1423:
                efz efzVar16 = this.a;
                return new wsh(efzVar16.rC, efzVar16.ty, 1);
            case 1424:
                efz efzVar17 = this.a;
                return wtv.j(efzVar17.rC, efzVar17.ty);
            case 1425:
                efz efzVar18 = this.a;
                return new agds(efzVar18.cT, efzVar18.tG, efzVar18.hT, efzVar18.rC, efzVar18.ty, efzVar18.tI, efzVar18.sH, efzVar18.K, efzVar18.tJ, efzVar18.sO, efzVar18.tK, efzVar18.lt, efzVar18.hz, efzVar18.rU, efzVar18.iP, efzVar18.g, efzVar18.kS, (Executor) efzVar18.i.get(), (Executor) efzVar18.Q.get());
            case 1426:
                return this.a.bk();
            case 1427:
                return wup.k();
            case 1428:
                efz efzVar19 = this.a;
                return new aatv((aarm) efzVar19.er.get(), (ajoy) efzVar19.eV.get(), (afsy) efzVar19.au.get(), (ysl) efzVar19.fO.get(), (shf) efzVar19.g.get(), null, null, null);
            case 1429:
                efz efzVar20 = this.a;
                return snd.D((shf) efzVar20.g.get(), (ajoy) efzVar20.sA.get(), (wpm) efzVar20.tH.get(), efzVar20.iP, (whu) efzVar20.rz.get());
            case 1430:
                return wpo.b((aarr) this.a.hV.get());
            case 1431:
                efz efzVar21 = this.a;
                return new yfl(efzVar21.sy, efzVar21.sC, (short[]) null);
            case 1432:
                return new ajoy(this.a.gH, (short[]) null);
            case 1433:
                efz efzVar22 = this.a;
                return new wsd(efzVar22.rC, efzVar22.ty, (Executor) efzVar22.i.get(), (Executor) efzVar22.f.get(), (aaea) efzVar22.K.get(), 1);
            case 1434:
                efz efzVar23 = this.a;
                azrw azrwVar15 = efzVar23.rC;
                azrw azrwVar16 = efzVar23.ty;
                return new wsh(azrwVar15, azrwVar16, 3, null);
            case 1435:
                efz efzVar24 = this.a;
                return new ekp(efzVar24.rC, efzVar24.ty, (Executor) efzVar24.i.get(), (Executor) efzVar24.f.get());
            case 1436:
                efz efzVar25 = this.a;
                azrw azrwVar17 = efzVar25.sw;
                azrw azrwVar18 = efzVar25.rF;
                azrw azrwVar19 = efzVar25.sF;
                azrw azrwVar20 = efzVar25.sJ;
                azrw azrwVar21 = efzVar25.sK;
                azrw azrwVar22 = efzVar25.sL;
                azrw azrwVar23 = efzVar25.sM;
                azrw azrwVar24 = efzVar25.rE;
                azrw azrwVar25 = efzVar25.sH;
                azrw azrwVar26 = efzVar25.sI;
                azrw azrwVar27 = efzVar25.td;
                azrw azrwVar28 = efzVar25.tj;
                azrw azrwVar29 = efzVar25.tS;
                azrw azrwVar30 = efzVar25.tT;
                azrw azrwVar31 = efzVar25.sR;
                HashMap hashMap = new HashMap();
                whl.h(hashMap, azrwVar17, azrwVar18, azrwVar19, azrwVar20, azrwVar21, azrwVar22, azrwVar23, azrwVar24, azrwVar25, azrwVar26, azrwVar27, azrwVar28, azrwVar29, azrwVar31);
                hashMap.put(apah.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED, azrwVar30);
                hashMap.put(apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE, azrwVar30);
                hashMap.put(apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE, azrwVar30);
                return hashMap;
            case 1437:
                efz efzVar26 = this.a;
                azrw azrwVar32 = efzVar26.rC;
                azrw azrwVar33 = efzVar26.tR;
                azrw azrwVar34 = efzVar26.rF;
                return snd.B(azrwVar32, azrwVar33, azrwVar34, (whu) efzVar26.rz.get());
            case 1438:
                return wpo.G((whu) this.a.rz.get());
            case 1439:
                efz efzVar27 = this.a;
                return new ele(efzVar27.rC, (ekm) efzVar27.rB.get());
            case 1440:
                amsx w = amsx.w(apae.SLOT_TYPE_PLAYER_BYTES, apae.SLOT_TYPE_BELOW_PLAYER, apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, apae.SLOT_TYPE_IN_PLAYER, apae.SLOT_TYPE_LOCKSCREEN, apae.SLOT_TYPE_FIXED_FOOTER, apae.SLOT_TYPE_FORECASTING, apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, apae.SLOT_TYPE_IN_FEED, apae.SLOT_TYPE_ABOVE_FEED, apae.SLOT_TYPE_PAGE_TOP, apae.SLOT_TYPE_PLAYBACK_TRACKING, apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER);
                ayaw.k(w);
                return w;
            case 1441:
                efz efzVar28 = this.a;
                return new eld(efzVar28.sy, efzVar28.sC);
            case 1442:
                efz efzVar29 = this.a;
                return svf.e((woy) efzVar29.sk.get(), (wps) efzVar29.su.get(), (wxt) efzVar29.rF.get(), (wwb) efzVar29.tY.get(), (wvu) efzVar29.tZ.get(), (wyk) efzVar29.sR.get());
            case 1443:
                efz efzVar30 = this.a;
                return new wwb(efzVar30.sy, (wnz) efzVar30.sx.get(), efzVar30.tj, efzVar30.sC, (amsx) efzVar30.tV.get(), (aaea) efzVar30.K.get(), (aadw) efzVar30.D.get(), efzVar30.tX);
            case 1444:
                efz efzVar31 = this.a;
                return shr.g(efzVar31.sC, efzVar31.sy, efzVar31.rF, (Executor) efzVar31.i.get());
            case 1445:
                efz efzVar32 = this.a;
                return shr.f(efzVar32.sy, efzVar32.sC, (amsx) efzVar32.tV.get(), (aaea) efzVar32.K.get());
            case 1446:
                efz efzVar33 = this.a;
                return snd.d((woy) efzVar33.sk.get(), (wps) efzVar33.su.get(), (wxt) efzVar33.rF.get(), (wwb) efzVar33.tY.get(), (wyk) efzVar33.sR.get());
            case 1447:
                efz efzVar34 = this.a;
                return new ekc((ekm) efzVar34.rB.get(), efzVar34.sC, efzVar34.ty, efzVar34.rC, efzVar34.sS, efzVar34.ud, (Executor) efzVar34.i.get());
            case 1448:
                efz efzVar35 = this.a;
                return new wyw(efzVar35.sP, efzVar35.su, efzVar35.tp, (whu) efzVar35.rz.get(), null, null, null);
            case 1449:
                efz efzVar36 = this.a;
                return wvo.f((xln) efzVar36.tz.get(), (whu) efzVar36.rz.get(), (aadw) efzVar36.D.get(), efzVar36.b.a, efzVar36.iG(), efzVar36.iH(), efzVar36.iE(), efzVar36.iF(), efzVar36.iA(), (Set) efzVar36.ua.get(), (Set) efzVar36.ub.get(), efzVar36.iB());
            case 1450:
                efz efzVar37 = this.a;
                return new acqt(acrs.OVERLAY, (ajkn) efzVar37.ed.get(), (ypa) efzVar37.B.get(), (acre) efzVar37.fB.get(), (acrj) efzVar37.fC.get(), (ajun) efzVar37.fD.get(), efzVar37.b.a, (aaea) efzVar37.K.get(), (aadw) efzVar37.D.get(), efzVar37.fE, efzVar37.fy, null, null);
            case 1451:
                efz efzVar38 = this.a;
                return new lhd(efzVar38.uq, efzVar38.ur, (afsy) efzVar38.au.get());
            case 1452:
                efz efzVar39 = this.a;
                aaea aaeaVar = (aaea) efzVar39.K.get();
                return enq.H(aaeaVar, (SharedPreferences) efzVar39.z.get(), (akep) efzVar39.ul.get(), efzVar39.b.a, (afsy) efzVar39.au.get(), (wco) efzVar39.dc.get(), (ScheduledExecutorService) efzVar39.f.get(), (shf) efzVar39.g.get(), (lgw) efzVar39.um.get(), (akdz) efzVar39.nW.get(), (akec) efzVar39.nX.get(), (akdj) efzVar39.un.get(), efzVar39.gp(), (akeh) efzVar39.uo.get(), (lgy) efzVar39.up.get());
            case 1453:
                efz efzVar40 = this.a;
                return enq.K(efzVar40.uj, efzVar40.fN, (akey) efzVar40.nY.get(), (shf) efzVar40.g.get(), (axzg) efzVar40.uk.get());
            case 1454:
                efz efzVar41 = this.a;
                ysl b = ((ysn) efzVar41.fJ.get()).b(new cns(), ysm.a((yry) efzVar41.fK.get(), null), angq.a, null, "suggest");
                ayaw.k(b);
                return b;
            case 1455:
                efz efzVar42 = this.a;
                return new axzg((aadw) efzVar42.D.get(), (aaea) efzVar42.K.get());
            case 1456:
                return new lgw((SharedPreferences) this.a.z.get());
            case 1457:
                return new akdj(this.a.b.a);
            case 1458:
                efz efzVar43 = this.a;
                return new akdw((akdn) efzVar43.ml.get(), new akdx((akep) efzVar43.ul.get()), new akds((akdn) efzVar43.ml.get(), (akdr) efzVar43.mm.get()), (ScheduledExecutorService) efzVar43.f.get());
            case 1459:
                return enq.p();
            case 1460:
                return this.a.an();
            case 1461:
                efz efzVar44 = this.a;
                aaea aaeaVar2 = (aaea) efzVar44.K.get();
                return enq.I(aaeaVar2, (SharedPreferences) efzVar44.z.get(), (akep) efzVar44.ul.get(), efzVar44.b.a, (afsy) efzVar44.au.get(), (wco) efzVar44.dc.get(), (ScheduledExecutorService) efzVar44.f.get(), (shf) efzVar44.g.get(), (lgw) efzVar44.um.get(), (akdz) efzVar44.nW.get(), (akec) efzVar44.nX.get(), efzVar44.gp(), (akeh) efzVar44.uo.get(), (lgy) efzVar44.up.get());
            case 1462:
                qmy qmyVar = qmy.a;
                ayaw.k(qmyVar);
                return qmyVar;
            case 1463:
                efz efzVar45 = this.a;
                return new acuv((aoae) efzVar45.mk.get(), efzVar45.ai, null, null, null);
            case 1464:
                efz efzVar46 = this.a;
                udg udgVar = new udg();
                udgVar.a = (udh) efzVar46.qX.get();
                return udgVar;
            case 1465:
                efz efzVar47 = this.a;
                return new udx((ubr) efzVar47.qC.get(), (txq) efzVar47.qA.get(), (twx) efzVar47.pN.get(), (tzt) efzVar47.qL.get(), (tzh) efzVar47.qo.get());
            case 1466:
                efz efzVar48 = this.a;
                return new rwh();
            case 1467:
                efz efzVar49 = this.a;
                axqq.a(efzVar49.qL);
                efzVar49.ax();
                return new rwh();
            case 1468:
                efz efzVar50 = this.a;
                return new tyn(axqq.a(efzVar50.qn), axqq.a(efzVar50.qA), axqq.a(efzVar50.pN), axqq.a(efzVar50.qL), axqq.a(axqw.a));
            case 1469:
                return new tyo();
            case 1470:
                return this.a.aE();
            case 1471:
                efz efzVar51 = this.a;
                return new tyg((tzh) efzVar51.qo.get(), (udg) efzVar51.uu.get(), 1);
            case 1472:
                efz efzVar52 = this.a;
                return new tyd((tyf) efzVar52.uw.get(), (tzt) efzVar52.qL.get(), (ubh) efzVar52.qJ.get(), (tzh) efzVar52.qo.get(), (udg) efzVar52.uu.get(), (twx) efzVar52.pN.get(), (tzd) efzVar52.qZ.get(), (ubr) efzVar52.qC.get(), axqq.a(axqw.a), (ucb) efzVar52.qF.get(), efzVar52.ax(), (Lock) efzVar52.qG.get());
            case 1473:
                efz efzVar53 = this.a;
                return new tyf((twx) efzVar53.pN.get(), (ucj) efzVar53.pX.get());
            case 1474:
                efz efzVar54 = this.a;
                return new tyg((udg) efzVar54.uu.get(), (tzh) efzVar54.qo.get(), 0);
            case 1475:
                efz efzVar55 = this.a;
                return new tyh((twn) efzVar55.pO.get(), (udg) efzVar55.uu.get(), (udw) efzVar55.uv.get(), (uds) efzVar55.pS.get(), amvs.a, (tzh) efzVar55.qo.get(), (tzo) efzVar55.ux.get());
            case 1476:
                efz efzVar56 = this.a;
                return new tzp((uds) efzVar56.pS.get(), (twx) efzVar56.pN.get(), (txo) efzVar56.qM.get(), (ucb) efzVar56.qF.get(), (tzh) efzVar56.qo.get(), amvs.a);
            case 1477:
                efz efzVar57 = this.a;
                return new tyl((tzt) efzVar57.qL.get(), (twx) efzVar57.pN.get(), (txq) efzVar57.qA.get(), amvs.a);
            case 1478:
                efz efzVar58 = this.a;
                return new tyg((udg) efzVar58.uu.get(), (tzh) efzVar58.qo.get(), 2);
            case 1479:
                efz efzVar59 = this.a;
                return new ahhc(efzVar59.b.a, (ypa) efzVar59.B.get(), (aifs) efzVar59.gw.get(), (afgr) efzVar59.hF.get(), (afgr) efzVar59.hG.get(), efzVar59.uy, (axfg) efzVar59.hj.get(), null);
            case 1480:
                return new ahfz(this.a.b.a);
            case 1481:
                efz efzVar60 = this.a;
                return new ajlq(efzVar60.kb, new ajkn(axqq.a(efzVar60.cO)), ammv.j(efzVar60.kk), amlr.a);
            case 1482:
                return new amea(this.a.uA);
            case 1483:
                return new efd(this.a);
            case 1484:
                return this.a.kW();
            case 1485:
                return new aigt(this.a.b.a);
            case 1486:
                return new ajby((ScheduledExecutorService) this.a.f.get());
            case 1487:
                efz efzVar61 = this.a;
                return aijh.j((aarm) efzVar61.er.get(), (ajoy) efzVar61.eV.get(), (afsy) efzVar61.au.get(), (ysl) efzVar61.fO.get());
            case 1488:
                return ahal.B((ahzx) this.a.eQ.get());
            case 1489:
                return zjl.a();
            case 1490:
                efz efzVar62 = this.a;
                aixc g = aazr.g(axqq.a(efzVar62.fX), (aaoz) efzVar62.gc.get(), (shf) efzVar62.g.get(), (aypn) efzVar62.ok.get(), (aadw) efzVar62.D.get());
                g.w();
                return g;
            case 1491:
                return ahal.b(this.a.b.a);
            case 1492:
                return new ajbh((byte[]) null);
            case 1493:
                return this.a.ga();
            case 1494:
                return this.a.g();
            case 1495:
                efz efzVar63 = this.a;
                return new aikd(efzVar63.lP, (aadw) efzVar63.D.get(), (ajbh) efzVar63.uK.get(), efzVar63.jn, null);
            case 1496:
                efz efzVar64 = this.a;
                return new aikr(efzVar64.cO(), (aioc) efzVar64.fY.get(), (aypn) efzVar64.uN.get());
            case 1497:
                return afhy.g();
            case 1498:
                return this.a.il();
            case 1499:
                return afpv.g((aikm) this.a.uO.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        int i = this.b;
        switch (i) {
            case 200:
                uts c = utt.c();
                c.b(false);
                return c.a();
            case 201:
                return axyw.a.get().a(this.a.b.a);
            case 202:
                efz efzVar = this.a;
                upp aX = efzVar.aX();
                return new uto(aX, axqq.a(efzVar.ce), efzVar.cf, efzVar.ll(), null, null, null);
            case 203:
                utl utlVar = (utl) ((azrw) ammv.j(this.a.ca).e(umy.a)).get();
                ayaw.k(utlVar);
                return utlVar;
            case 204:
                return axyt.a.get().a(this.a.b.a);
            case 205:
                return new utm(amlr.a);
            case 206:
                efz efzVar2 = this.a;
                upp aX2 = efzVar2.aX();
                return new uru(aX2, efzVar2.b.a, (urt) efzVar2.ch.get(), (anic) efzVar2.bA.get(), axqq.a(efzVar2.ci), new ury(efzVar2.ci, efzVar2.b.a), (unq) efzVar2.bx.get(), efzVar2.cj, (Executor) efzVar2.bD.get());
            case 207:
                efz efzVar3 = this.a;
                return new urt((uok) efzVar3.bC.get(), (anic) efzVar3.bA.get());
            case 208:
                urk urkVar = new urk(null);
                urkVar.a = 3;
                urkVar.b = false;
                urkVar.c = amlr.a;
                urkVar.d = false;
                urkVar.f = true;
                urkVar.e = false;
                urkVar.g = 2;
                Integer num = urkVar.a;
                if (num != null && urkVar.b != null && urkVar.d != null && urkVar.e != null && urkVar.f != null) {
                    return new url(num.intValue(), urkVar.b.booleanValue(), urkVar.c, urkVar.d.booleanValue(), urkVar.e.booleanValue(), urkVar.f.booleanValue());
                }
                StringBuilder sb = new StringBuilder();
                if (urkVar.g == 0) {
                    sb.append(" enablement");
                }
                if (urkVar.a == null) {
                    sb.append(" rateLimitPerSecond");
                }
                if (urkVar.b == null) {
                    sb.append(" recordMetricPerProcess");
                }
                if (urkVar.d == null) {
                    sb.append(" forceGcBeforeRecordMemory");
                }
                if (urkVar.e == null) {
                    sb.append(" captureDebugMetrics");
                }
                if (urkVar.f == null) {
                    sb.append(" captureMemoryInfo");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            case 209:
                return axyh.a.get().a(this.a.b.a);
            case 210:
                efz efzVar4 = this.a;
                return new usz(efzVar4.aX(), (anic) efzVar4.bA.get(), (Executor) efzVar4.bD.get(), axqq.a(efzVar4.cl), efzVar4.cm);
            case 211:
                usk uskVar = new usk(null);
                return new usl(uskVar.a, uskVar.b);
            case 212:
                return axyn.a.get().b(this.a.b.a);
            case 213:
                return Boolean.valueOf(axyn.a.get().c(this.a.b.a));
            case 214:
                return Long.valueOf(axyn.a.get().a(this.a.b.a));
            case 215:
                return new uyo() { // from class: amez
                    @Override // defpackage.uyo
                    public final void a() {
                    }
                };
            case 216:
                return amsx.r(this.a.hR());
            case 217:
                efz efzVar5 = this.a;
                return new egm(efzVar5.e(), efzVar5.cw, efzVar5.V, efzVar5.dh, efzVar5.cN, (Executor) efzVar5.f.get(), efzVar5.ct, (yxx) efzVar5.k.get());
            case 218:
                efz efzVar6 = this.a;
                return new aadv(efzVar6.ct, (Executor) efzVar6.f.get(), (aads) efzVar6.cv.get());
            case 219:
                efz efzVar7 = this.a;
                return ytb.j(efzVar7.b.a, (String) efzVar7.cs.get());
            case 220:
                return "main";
            case 221:
                return new aads(this.a.cu);
            case 222:
                efz efzVar8 = this.a;
                Context context = efzVar8.b.a;
                anib anibVar = (anib) efzVar8.f.get();
                vfg vfgVar = (vfg) efzVar8.p.get();
                vda a = vdb.a(context);
                a.e("common");
                a.f("common_settings_bootstrap.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.e(aosf.a);
                a3.f(a2);
                vfk d = vfn.d(context, anibVar);
                d.c = efz.jZ();
                d.b();
                d.d("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count");
                d.e(fkm.n);
                a3.b(d.a());
                return new ywp(agcm.e(vfgVar.a(a3.a())), aosf.a);
            case 223:
                efz efzVar9 = this.a;
                emu emuVar = (emu) (((eni) efzVar9.cL.get()).a ? efzVar9.dg.get() : efzVar9.df.get());
                ayaw.k(emuVar);
                return emuVar;
            case 224:
                efz efzVar10 = this.a;
                yys yysVar = (yys) efzVar10.X.get();
                akpt akptVar = (akpt) efzVar10.cJ.get();
                int i2 = ems.f;
                return new eni(yysVar, akptVar, efzVar10.D, efzVar10.cK);
            case 225:
                efz efzVar11 = this.a;
                return new akpt((aktg) efzVar11.cx.get(), efzVar11.cz, efzVar11.cB, efzVar11.cE, efzVar11.cF, efzVar11.cH, efzVar11.cI);
            case 226:
                efz efzVar12 = this.a;
                return new aktg(efzVar12.b.a, (shf) efzVar12.g.get(), (ScheduledExecutorService) efzVar12.f.get(), (yyf) efzVar12.j.get(), (yxx) efzVar12.k.get(), Optional.of((zfh) efzVar12.e.get()));
            case 227:
                efz efzVar13 = this.a;
                return new akta((aktg) efzVar13.cx.get(), (akss) efzVar13.cy.get());
            case 228:
                return new akss((aktg) this.a.cx.get());
            case 229:
                efz efzVar14 = this.a;
                return new aktd((aktg) efzVar14.cx.get(), (akst) efzVar14.cA.get(), (yxx) efzVar14.k.get(), efzVar14.ay, efzVar14.Q);
            case 230:
                return new akst((aktg) this.a.cx.get());
            case 231:
                efz efzVar15 = this.a;
                return new akte((aktg) efzVar15.cx.get(), efzVar15.cD);
            case 232:
                efz efzVar16 = this.a;
                return new aktf((aktg) efzVar16.cx.get(), efzVar16.cC);
            case 233:
                efz efzVar17 = this.a;
                return new akqo(efzVar17.b.a, (ysy) efzVar17.as.get());
            case 234:
                return new NativeCrashDetectorV2((aktg) this.a.cx.get());
            case 235:
                efz efzVar18 = this.a;
                return new akrx(efzVar18.b.a, efzVar18.cG, efzVar18.aw, (anic) efzVar18.f.get(), (shf) efzVar18.g.get());
            case 236:
                return this.a.gw();
            case 237:
                return new akbc();
            case 238:
                return new ajzi();
            case 239:
                efz efzVar19 = this.a;
                return new emz((Executor) efzVar19.U.get(), (Executor) efzVar19.Q.get(), (Executor) efzVar19.f.get(), (ymp) efzVar19.V.get(), (yxx) efzVar19.k.get(), (eni) efzVar19.cL.get(), efzVar19.cJ, efzVar19.D, efzVar19.ct, efzVar19.cS, efzVar19.g, efzVar19.cV, efzVar19.B, efzVar19.au, efzVar19.dc, efzVar19.dd, efzVar19.cw, efzVar19.de, efzVar19.aZ);
            case 240:
                efz efzVar20 = this.a;
                boolean d2 = yjk.d(null);
                azrw azrwVar = efzVar20.cO;
                Context context2 = efzVar20.b.a;
                return new zfu(d2, azrwVar, (Executor) efzVar20.f.get(), (aloh) efzVar20.cR.get(), new aloh(efzVar20.b.a, (char[]) null), null, null, null);
            case 241:
                efz efzVar21 = this.a;
                return svf.h(null, (yth) efzVar21.cM.get(), efzVar21.b.a, (ynx) efzVar21.M.get(), (File) efzVar21.cN.get(), efzVar21.cQ);
            case 242:
                efz efzVar22 = this.a;
                return new yth((ynx) efzVar22.M.get(), efzVar22.b.a, (ExecutorService) efzVar22.f.get(), (ExecutorService) efzVar22.T.get());
            case 243:
                efz efzVar23 = this.a;
                return xhs.b(efzVar23.b.a, null, yjy.c((Executor) efzVar23.f.get()));
            case 244:
                efz efzVar24 = this.a;
                return ytd.e((Executor) efzVar24.f.get(), efzVar24.cP);
            case 245:
                return ytb.f((CronetEngine) this.a.cO.get());
            case 246:
                return new aloh(this.a.b.a, (char[]) null);
            case 247:
                return this.a.bo();
            case 248:
                wnh a4 = wni.a(zgx.c(this.a.b.a));
                a4.f(true);
                a4.b(true);
                return a4.a();
            case 249:
                return ote.i((aadw) this.a.D.get());
            case 250:
                efz efzVar25 = this.a;
                return wtv.d(efzVar25.b.a, (Executor) efzVar25.f.get());
            case 251:
                return oux.b(amlr.a, this.a.db);
            case 252:
                efz efzVar26 = this.a;
                return shr.G((aifh) efzVar26.cW.get(), efzVar26.b.a, efzVar26.kY(), (wkk) efzVar26.da.get());
            case 253:
                return ote.x((ypa) this.a.B.get());
            case 254:
                efz efzVar27 = this.a;
                AccountManager b = amda.b(efzVar27.b.a);
                wki wkiVar = (wki) efzVar27.cY.get();
                Set a5 = ((vzp) efzVar27.cZ.get()).a();
                ayaw.k(a5);
                return new wkk(b, wkiVar, a5, efzVar27.b.a);
            case PrivateKeyType.INVALID /* 255 */:
                return oux.c(amlr.a, this.a.cX);
            case 256:
                return new wki(this.a.kY(), null, null, null);
            case 257:
                return new eiz();
            case 258:
                return new ajoy(this.a.am, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
            case 259:
                return aaca.e((aabt) this.a.C.get());
            case 260:
                efz efzVar28 = this.a;
                azrw azrwVar2 = efzVar28.U;
                Executor executor = (Executor) efzVar28.Q.get();
                Executor executor2 = (Executor) efzVar28.f.get();
                return new enc(azrwVar2, executor, executor2, (yxx) efzVar28.k.get(), (eni) efzVar28.cL.get(), efzVar28.cJ, efzVar28.D, efzVar28.ct, efzVar28.cS, efzVar28.g, efzVar28.cV, efzVar28.B, efzVar28.au, efzVar28.dc, efzVar28.dd, efzVar28.cw, efzVar28.de, efzVar28.aZ);
            case 261:
                efz efzVar29 = this.a;
                anic anicVar = (anic) efzVar29.n.get();
                amcc amccVar = (amcc) efzVar29.G.get();
                bzm bzmVar = (bzm) efzVar29.mU.get();
                byk bykVar = new byk();
                bykVar.a = anicVar;
                bykVar.d = new amcz(amccVar);
                bykVar.c = anicVar;
                bykVar.b = bzmVar;
                return bykVar.a();
            case 262:
                efz efzVar30 = this.a;
                amsx t = amsx.t(new ouq(), new ylc(efzVar30.mS), new amcy(amrz.k("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker", efzVar30.mT), (amiu) efzVar30.bm.get()));
                bys bysVar = new bys();
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    bysVar.a.add((bzm) it.next());
                }
                return bysVar;
            case 263:
                return new ajoy(this.a.lG, (char[]) null, (short[]) null);
            case 264:
                return this.a.by();
            case 265:
                efz efzVar31 = this.a;
                azrw azrwVar3 = efzVar31.ka;
                azrw azrwVar4 = efzVar31.kr;
                azrw azrwVar5 = efzVar31.ks;
                azrw azrwVar6 = efzVar31.D;
                azrwVar6.getClass();
                aadw aadwVar = (aadw) azrwVar6.get();
                aadwVar.getClass();
                return new faf(azrwVar3, azrwVar4, azrwVar5, aadwVar);
            case 266:
                efz efzVar32 = this.a;
                aarm aarmVar = (aarm) efzVar32.er.get();
                ajoy ajoyVar = (ajoy) efzVar32.eV.get();
                afsy afsyVar = (afsy) efzVar32.au.get();
                ysl bI = efzVar32.bI();
                aadw aadwVar2 = (aadw) efzVar32.D.get();
                aaea aaeaVar = (aaea) efzVar32.K.get();
                amsv j = amsx.j(8);
                amvs amvsVar = amvs.a;
                ayaw.k(amvsVar);
                j.j(amvsVar);
                j.c(new jan(efzVar32.b.a));
                final izd izdVar = (izd) efzVar32.fx.get();
                j.c(new aaud() { // from class: jam
                    @Override // defpackage.aaud
                    public final void a(aauc aaucVar) {
                        for (auix auixVar : izd.this.c()) {
                            aaucVar.u.add(auixVar);
                        }
                    }
                });
                j.c((aaud) efzVar32.ii.get());
                j.c((aaud) efzVar32.f209io.get());
                j.c((aaud) efzVar32.iq.get());
                j.c((aaud) efzVar32.ir.get());
                j.c(efzVar32.dh());
                return new aaue(aarmVar, ajoyVar, afsyVar, bI, aadwVar2, aaeaVar, j.g(), new aaub((aarm) efzVar32.er.get(), efzVar32.bI(), efzVar32.iu()), (ypa) efzVar32.B.get(), (zfm) efzVar32.dw.get(), efzVar32.iu(), null, null, null);
            case 267:
                return aaca.C(this.a.ks());
            case 268:
                return ote.g((wco) this.a.dc.get());
            case 269:
                efz efzVar33 = this.a;
                amsv j2 = amsx.j(3);
                j2.j((Iterable) efzVar33.dl.get());
                j2.j((Iterable) efzVar33.f15do.get());
                j2.c((afvb) efzVar33.dp.get());
                return j2.g();
            case 270:
                return amsx.r(this.a.eC());
            case 271:
                efz efzVar34 = this.a;
                azrw azrwVar7 = efzVar34.x;
                azrw azrwVar8 = efzVar34.ak;
                afpt.b(efzVar34.eu());
                return new aaee(azrwVar7, azrwVar8);
            case 272:
                efz efzVar35 = this.a;
                return ytd.h((aaea) efzVar35.K.get(), efzVar35.dn);
            case 273:
                efz efzVar36 = this.a;
                return new aasg((aloh) efzVar36.dm.get(), (ScheduledExecutorService) efzVar36.f.get(), (shf) efzVar36.g.get(), (aaea) efzVar36.K.get(), null, null);
            case 274:
                return aaca.G(this.a.b.a);
            case 275:
                efz efzVar37 = this.a;
                return new afxk((SharedPreferences) efzVar37.z.get(), (afsy) efzVar37.au.get());
            case 276:
                efz efzVar38 = this.a;
                return amsx.u((aasa) efzVar38.de.get(), (aasa) efzVar38.dq.get(), (aasa) efzVar38.dt.get(), (aasa) efzVar38.du.get());
            case 277:
                efz efzVar39 = this.a;
                return new aasj((SharedPreferences) efzVar39.z.get(), (afsy) efzVar39.au.get());
            case 278:
                return aawj.b((aary) this.a.ds.get());
            case 279:
                return aaca.j((cnd) this.a.dr.get());
            case 280:
                return ytb.k((aabx) this.a.bb.get());
            case 281:
                return new aapq((ypa) this.a.B.get());
            case 282:
                return this.a.eu();
            case 283:
                efz efzVar40 = this.a;
                shf shfVar = (shf) efzVar40.g.get();
                return new zfm(shfVar, new zfn());
            case 284:
                return xuq.s();
            case 285:
                efz efzVar41 = this.a;
                return ytb.d(ammv.j(new fac((acpl) efzVar41.aw.get(), (ysy) efzVar41.as.get())));
            case 286:
                efz efzVar42 = this.a;
                Context context3 = efzVar42.b.a;
                return xhs.k(amsx.s((aaqy) efzVar42.dM.get(), (aaqy) efzVar42.ep.get()), (aaea) efzVar42.K.get());
            case 287:
                efz efzVar43 = this.a;
                return ytd.n((aakq) efzVar43.dL.get(), (aals) efzVar43.dA.get());
            case 288:
                efz efzVar44 = this.a;
                return shr.k((aahv) efzVar44.dB.get(), (aais) efzVar44.dJ.get(), (aakn) efzVar44.dK.get(), (aals) efzVar44.dA.get());
            case 289:
                efz efzVar45 = this.a;
                return d.l((afsy) efzVar45.au.get(), efzVar45.dx, (ypa) efzVar45.B.get(), efzVar45.dy, (aals) efzVar45.dA.get(), efzVar45.in(), (Executor) efzVar45.aA.get(), (whu) efzVar45.dC.get());
            case 290:
                efz efzVar46 = this.a;
                return new wij(axqq.a(efzVar46.au), axqq.a(efzVar46.au), (ypa) efzVar46.B.get(), (SharedPreferences) efzVar46.z.get(), (wgv) efzVar46.I.get(), (abep) efzVar46.x.get(), (shf) efzVar46.g.get(), (acpk) efzVar46.ax.get(), (aadw) efzVar46.D.get());
            case 291:
                return efz.jN();
            case 292:
                efz efzVar47 = this.a;
                Context context4 = efzVar47.b.a;
                return ytd.l(efzVar47.dz);
            case 293:
                return new aalr((shf) this.a.g.get());
            case 294:
                efz efzVar48 = this.a;
                return new aalp((shf) efzVar48.g.get(), (aaea) efzVar48.K.get());
            case 295:
                return aaca.I();
            case 296:
                return this.a.cn();
            case 297:
                return aaca.F(this.a.dE);
            case 298:
                efz efzVar49 = this.a;
                return new ajyw(efzVar49.by, efzVar49.f, efzVar49.dD, (short[]) null, (byte[]) null, (byte[]) null);
            case 299:
                return new aoae((boolean[]) null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.b;
        switch (i) {
            case 1900:
                efc efcVar = this.a.a;
                kal kalVar = kal.TRAVEL_BANNER;
                efz efzVar = efcVar.dm.c;
                kas kasVar = new kas(efzVar.ni, efzVar.dB, 4, (int[]) null);
                kal kalVar2 = kal.TEXIT_BANNER;
                efz efzVar2 = efcVar.dm.c;
                return new jzt(amrz.l(kalVar, kasVar, kalVar2, new kau(efzVar2.ni, efzVar2.g, efzVar2.dB, 2, (char[]) null)), (jvc) efcVar.bD.get());
            case 1901:
                efc efcVar2 = this.a.a;
                return new jzy(new jzs(efcVar2.dm.c.nB), (jvc) efcVar2.bD.get(), 1);
            case 1902:
                efc efcVar3 = this.a.a;
                return new kaf(efcVar3.Q(), (jvc) efcVar3.bD.get(), (aahv) efcVar3.dm.c.dB.get(), efcVar3.dm.c.D(), efcVar3.dm.c.E(), efcVar3.l(), (Executor) efcVar3.dm.c.f.get(), (axzf) efcVar3.bX.get(), null, null, null, null);
            case 1903:
                efz efzVar3 = this.a.a.dm.c;
                return new kas(efzVar3.ni, efzVar3.ku, 1, (byte[]) null);
            case 1904:
                return new kah(this.a.a.dm.c.ni, 7, (byte[][]) null);
            case 1905:
                return new kah(this.a.a.dm.c.ni, 1, (byte[]) null);
            case 1906:
                return new kah(this.a.a.dm.c.ni, 6, (float[]) null);
            case 1907:
                efc efcVar4 = this.a.a;
                return new kbs(efcVar4.Q(), (aahv) efcVar4.dm.c.dB.get(), efcVar4.dm.c.D(), (fjs) efcVar4.dm.c.kv.get(), (fjq) efcVar4.dm.c.mv.get(), (axzf) efcVar4.bX.get(), null, null, null, null);
            case 1908:
                efc efcVar5 = this.a.a;
                efz efzVar4 = efcVar5.dm.c;
                return new jzy(new jzv(efzVar4.by, efzVar4.dB), (jvc) efcVar5.bD.get(), 0);
            case 1909:
                efc efcVar6 = this.a.a;
                aahv aahvVar = (aahv) efcVar6.dm.c.dB.get();
                efz efzVar5 = efcVar6.dm.c;
                return new kbq(aahvVar, new jzw(efzVar5.by, efzVar5.nA), efcVar6.dm.c.D(), new kbr((aaea) efcVar6.dm.c.K.get(), (ysy) efcVar6.dm.c.as.get(), (jvc) efcVar6.bD.get(), (fjq) efcVar6.dm.c.mv.get(), (aahv) efcVar6.dm.c.dB.get(), (fjs) efcVar6.dm.c.kv.get(), (afsy) efcVar6.dm.c.au.get()), (Executor) efcVar6.dm.c.f.get(), (afsy) efcVar6.dm.c.au.get());
            case 1910:
                efz efzVar6 = this.a.a.dm.c;
                return new kaj(efzVar6.ni, efzVar6.K, efzVar6.as, efzVar6.kv);
            case 1911:
                return new kah(this.a.a.dm.c.nB, 2, (char[]) null);
            case 1912:
                efc efcVar7 = this.a.a;
                return new jyi(efcVar7.dm.c.ee, efcVar7.cw);
            case 1913:
                efz efzVar7 = this.a.a.dm.c;
                return new ajyw(efzVar7.kp, efzVar7.cK, efzVar7.ha, (char[]) null);
            case 1914:
                PackageManager c = enq.c(this.a.a.dm.c.b.a);
                ayaw.k(c);
                return c;
            case 1915:
                return enq.d(this.a.a.dm.c.b.a);
            case 1916:
                return new tru((ScheduledExecutorService) this.a.a.dm.c.f.get());
            case 1917:
                efc efcVar8 = this.a.a;
                ajoy ajoyVar = (ajoy) efcVar8.dm.c.eV.get();
                afsy afsyVar = (afsy) efcVar8.dm.c.au.get();
                ysl bI = efcVar8.dm.c.bI();
                aadw aadwVar = (aadw) efcVar8.dm.c.D.get();
                amsx p = amsx.p(enq.O((aaea) efcVar8.dm.c.K.get(), (axze) efcVar8.cB.get(), (lah) efcVar8.cD.get(), (izb) efcVar8.cE.get(), (ggn) efcVar8.dm.c.f209io.get()));
                aabx aabxVar = (aabx) efcVar8.dm.c.bb.get();
                ysl bI2 = efcVar8.dm.c.bI();
                aarm aarmVar = (aarm) efcVar8.dm.c.er.get();
                aapw cr = efcVar8.dm.c.cr();
                if (!aabxVar.g) {
                    cr = aapw.a;
                }
                return new abcb(ajoyVar, afsyVar, bI, aadwVar, p, new abby(aarmVar, bI2, cr), (ypa) efcVar8.dm.c.B.get(), null, null, null);
            case 1918:
                efc efcVar9 = this.a.a;
                return new axze((aaea) efcVar9.dm.c.K.get());
            case 1919:
                efc efcVar10 = this.a.a;
                azrw azrwVar = efcVar10.cC;
                efz efzVar8 = efcVar10.dm.c;
                return new lah(azrwVar, efzVar8.in, (aaea) efzVar8.K.get());
            case 1920:
                efc efcVar11 = this.a.a;
                return new lai((SharedPreferences) efcVar11.dm.c.z.get(), efcVar11.dm.c.as);
            case 1921:
                return new izb((aasy) this.a.a.dm.c.ip.get());
            case 1922:
                efc efcVar12 = this.a.a;
                return ahbn.p(((Boolean) efcVar12.dm.c.ec.get()).booleanValue(), axqq.a(efcVar12.dm.c.wU), axqq.a(efcVar12.dm.c.eg), axqq.a(efcVar12.dm.c.aA), axqq.a(efcVar12.dm.c.wV));
            case 1923:
                return ghe.i();
            case 1924:
                efz efzVar9 = this.a.a.dm.c;
                return whl.n(efzVar9.b.a, "premium_filter", "premium_filter_schema.pb", (vfg) efzVar9.p.get(), lae.a);
            case 1925:
                return new axzf((aadw) this.a.a.dm.c.D.get());
            case 1926:
                return new akmj();
            case 1927:
                return new akkz();
            case 1928:
                efc efcVar13 = this.a.a;
                return new weh((wgv) efcVar13.dm.c.I.get(), (wdd) efcVar13.dm.c.au.get(), (Executor) efcVar13.dm.c.f.get());
            case 1929:
                return new whl();
            case 1930:
                efc efcVar14 = this.a.a;
                return new xud(efcVar14.dm.c.b.a, (xsp) efcVar14.bK.get(), (Executor) efcVar14.dm.c.i.get(), (Executor) efcVar14.dm.c.f.get());
            case 1931:
                efc efcVar15 = this.a.a;
                efz efzVar10 = efcVar15.dm.c;
                Context context = efzVar10.b.a;
                anib anibVar = (anib) efzVar10.f.get();
                vfg vfgVar = (vfg) efcVar15.dm.c.p.get();
                vda a = vdb.a(context);
                a.e("comment");
                a.f("comment.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.f(a2);
                a3.e(awuo.a);
                vfk d = vfn.d(context, anibVar);
                d.c = efz.jZ();
                d.b();
                d.d("preview_tooltip_image_preview_tool");
                d.e(fkm.m);
                a3.b(d.a());
                return vfgVar.a(a3.a());
            case 1932:
                return new acfh();
            case 1933:
                efc efcVar16 = this.a.a;
                return new aays((aarm) efcVar16.dm.c.er.get(), (ajoy) efcVar16.dm.c.eV.get(), (afsy) efcVar16.dm.c.au.get(), (ysl) efcVar16.dm.c.fO.get(), null, null, null);
            case 1934:
                return new adyu();
            case 1935:
                return this.a.gD();
            case 1936:
                efc efcVar17 = this.a.a;
                return new abxp((aarm) efcVar17.dm.c.er.get(), (ajoy) efcVar17.dm.c.eV.get(), (afsy) efcVar17.dm.c.au.get(), (ysl) efcVar17.dm.c.fO.get(), (Executor) efcVar17.dm.c.f.get(), null, null, null);
            case 1937:
                return qfm.a(this.a.a.dm.c.b.a);
            case 1938:
                return false;
            case 1939:
                efc efcVar18 = this.a.a;
                efz efzVar11 = efcVar18.dm.c;
                Context context2 = efzVar11.b.a;
                anib anibVar2 = (anib) efzVar11.f.get();
                vfg vfgVar2 = (vfg) efcVar18.dm.c.p.get();
                vda a4 = vdb.a(context2);
                a4.e("mdx");
                a4.f("smart_remote.pb");
                Uri a5 = a4.a();
                vfk d2 = vfn.d(context2, anibVar2);
                d2.c = efz.jZ();
                d2.b();
                d2.d("MDx.SmartRemote.isDisconnectTipAlreadyShown", "MDx.SmartRemote.isPrivacyDialogShown");
                d2.e(adgt.c);
                vfn a6 = d2.a();
                vfe a7 = vff.a();
                a7.f(a5);
                a7.e(awvh.a);
                a7.b(a6);
                return vfgVar2.a(a7.a());
            case 1940:
                return new akmh((akmi) this.a.a.cW.get());
            case 1941:
                return new akmi();
            case 1942:
                return azrl.e().aT();
            case 1943:
                efc efcVar19 = this.a.a;
                efz efzVar12 = efcVar19.dm.c;
                Context context3 = efzVar12.b.a;
                anib anibVar3 = (anib) efzVar12.f.get();
                vfg vfgVar3 = (vfg) efcVar19.dm.c.p.get();
                vda a8 = vdb.a(context3);
                a8.e("edit");
                a8.f("camera.pb");
                Uri a9 = a8.a();
                vfk d3 = vfn.d(context3, anibVar3);
                d3.d("camera_facing");
                d3.b();
                d3.c = efz.jZ();
                d3.e(fkm.p);
                vfn a10 = d3.a();
                vfe a11 = vff.a();
                a11.e(zoh.a);
                a11.f(a9);
                a11.b(a10);
                return vfgVar3.a(a11.a());
            case 1944:
                efc efcVar20 = this.a.a;
                SharedPreferences sharedPreferences = (SharedPreferences) efcVar20.dm.c.z.get();
                wdd wddVar = (wdd) efcVar20.dm.c.au.get();
                wdm wdmVar = (wdm) efcVar20.dm.c.au.get();
                wco wcoVar = (wco) efcVar20.dm.c.dc.get();
                wkk wkkVar = (wkk) efcVar20.dm.c.da.get();
                wgv wgvVar = (wgv) efcVar20.dm.c.I.get();
                wiz wizVar = (wiz) efcVar20.dm.c.mr.get();
                efz efzVar13 = efcVar20.dm.c;
                return new vzu(sharedPreferences, wddVar, wdmVar, wcoVar, wkkVar, wgvVar, wizVar, efzVar13.ms, (ypa) efzVar13.B.get());
            case 1945:
                return this.a.a.am();
            case 1946:
                efc efcVar21 = this.a.a;
                efz efzVar14 = efcVar21.dm.c;
                Context context4 = efzVar14.b.a;
                aivq aivqVar = (aivq) efzVar14.js.get();
                aivo aivoVar = (aivo) efcVar21.dm.c.jk.get();
                aioc aiocVar = (aioc) efcVar21.dm.c.fY.get();
                efz efzVar15 = efcVar21.dm.c;
                return new aiki(context4, aivqVar, aivoVar, aiocVar.aH(), (aikd) efcVar21.dm.c.uM.get(), new aikl(efzVar15.b.a, efzVar15.uL, (aivq) efzVar15.js.get(), ((acxi) efcVar21.dm.c.bg.get()).e, efcVar21.dm.c.jo), (shf) efcVar21.dm.c.g.get(), (List) efcVar21.dc.get());
            case 1947:
                efc efcVar22 = this.a.a;
                List asList = Arrays.asList((aikm) efcVar22.dm.c.uO.get(), (aikk) efcVar22.dm.c.uP.get(), (aikm) efcVar22.dm.c.uQ.get(), (aikc) efcVar22.dm.c.uR.get());
                ayaw.k(asList);
                return asList;
            case 1948:
                efc efcVar23 = this.a.a;
                efz efzVar16 = efcVar23.dm.c;
                Context context5 = efzVar16.b.a;
                aivq aivqVar2 = (aivq) efzVar16.sW.get();
                aivo aivoVar2 = (aivo) efcVar23.dm.c.jk.get();
                aioc aiocVar2 = (aioc) efcVar23.dm.c.fY.get();
                List list = (List) efcVar23.df.get();
                efz efzVar17 = efcVar23.dm.c;
                return new aiki(context5, aivqVar2, aivoVar2, aiocVar2.aH(), (aikd) efcVar23.dm.c.uM.get(), new aikl(efzVar17.b.a, efzVar17.uL, (aivq) efzVar17.sW.get(), ((acxi) efcVar23.dm.c.bg.get()).e, efcVar23.dm.c.jo, (xhg) efcVar23.dg.get()), (shf) efcVar23.dm.c.g.get(), list);
            case 1949:
                efc efcVar24 = this.a.a;
                List asList2 = Arrays.asList((xhh) efcVar24.de.get(), (aikk) efcVar24.dm.c.uP.get(), (aikc) efcVar24.dm.c.uR.get());
                ayaw.k(asList2);
                return asList2;
            case 1950:
                xhf xhfVar = (xhf) this.a.a.dm.c.sZ.get();
                xhh xhhVar = new xhh(xhfVar);
                xhfVar.b.add(xhhVar);
                return xhhVar;
            case 1951:
                return new xhg(this.a.a.dm.c.sZ);
            case 1952:
                efc efcVar25 = this.a.a;
                return new adfg((aikk) efcVar25.dm.c.uP.get(), efcVar25.dm.c.sZ, 1);
            case 1953:
                efc efcVar26 = this.a.a;
                return new adfg((aikk) efcVar26.dm.c.uP.get(), efcVar26.dm.c.ja, 0);
            case 1954:
                aioe aJ = ((ahzx) this.a.a.dm.c.eQ.get()).a.aJ();
                ayaw.k(aJ);
                return aJ;
            case 1955:
                return this.a.iC();
            case 1956:
                efz efzVar18 = this.a.a.dm.c;
                return new agwg(efzVar18.b.a, (agvh) efzVar18.kF.get());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h() {
        int i = this.b;
        Boolean bool = false;
        final byte[] bArr = null;
        switch (i) {
            case 1500:
                efz efzVar = this.a;
                return afqe.l((aivq) efzVar.js.get(), (aivo) efzVar.jk.get());
            case 1501:
                return afpv.f((aikk) this.a.uP.get());
            case 1502:
                efz efzVar2 = this.a;
                return afqe.k((aivq) efzVar2.js.get(), (aivo) efzVar2.jk.get());
            case 1503:
                return afpv.s((aikm) this.a.uQ.get());
            case 1504:
                efz efzVar3 = this.a;
                return afqe.A((aivq) efzVar3.js.get(), (aivo) efzVar3.jk.get());
            case 1505:
                return afpv.e((aikc) this.a.uR.get());
            case 1506:
                return aifu.d((aivo) this.a.jk.get());
            case 1507:
                efz efzVar4 = this.a;
                return new aifh((ypa) efzVar4.B.get(), (aypn) efzVar4.sY.get(), (aifv) efzVar4.rX.get(), (aimw) efzVar4.uT.get(), (aypn) efzVar4.uU.get(), (aypn) efzVar4.uV.get());
            case 1508:
                return ahal.A((ahzx) this.a.eQ.get());
            case 1509:
                return ahal.C((ahzx) this.a.eQ.get());
            case 1510:
                return ahal.D((ahzx) this.a.eQ.get());
            case 1511:
                efz efzVar5 = this.a;
                wiz wizVar = (wiz) efzVar5.mr.get();
                ypa ypaVar = (ypa) efzVar5.B.get();
                afsy afsyVar = (afsy) efzVar5.au.get();
                return new wca(wizVar, ypaVar, afsyVar, new Object() { // from class: wjl
                });
            case 1512:
                return new wbs();
            case 1513:
                return new wbs();
            case 1514:
                return new aili((ywr) this.a.va.get());
            case 1515:
                efz efzVar6 = this.a;
                Context context = efzVar6.b.a;
                azrw azrwVar = efzVar6.p;
                azrw azrwVar2 = efzVar6.z;
                anib anibVar = (anib) efzVar6.f.get();
                vfg vfgVar = (vfg) azrwVar.get();
                vda a = vdb.a(context);
                a.e("player");
                a.f("playability_settings.pb");
                Uri a2 = a.a();
                ywu d = ywv.d(azrwVar2, anibVar);
                d.a = wgw.r;
                d.b(aidf.m);
                d.b = aidf.l;
                d.c = afrl.n;
                ywv a3 = d.a();
                vfe a4 = vff.a();
                a4.e(awwp.a);
                a4.f(a2);
                a4.b(a3);
                return new ywp(agcm.e(vfgVar.a(a4.a())), awwp.a);
            case 1516:
                efz efzVar7 = this.a;
                return afqe.g((acsy) efzVar7.ee.get(), (aifk) efzVar7.fS.get());
            case 1517:
                efz efzVar8 = this.a;
                return afqe.f((acsy) efzVar8.ee.get(), (aifk) efzVar8.fS.get());
            case 1518:
                return rwh.X(this.a.b.a);
            case 1519:
                return new aiwx();
            case 1520:
                ywr a5 = evx.a(this.a.vg);
                ayaw.k(a5);
                return a5;
            case 1521:
                efz efzVar9 = this.a;
                Context context2 = efzVar9.b.a;
                anib anibVar2 = (anib) efzVar9.f.get();
                vfg vfgVar2 = (vfg) efzVar9.p.get();
                ylr ylrVar = (ylr) efzVar9.v.get();
                final trp trpVar = (trp) efzVar9.hw();
                return ylrVar.a(whl.o(context2, efz.jZ(), anibVar2, vfgVar2, evx.a, evr.a(context2), evq.a, new vfl(bArr, bArr, bArr) { // from class: evu
                    @Override // defpackage.vfl
                    public final aooy a(vfm vfmVar, aooy aooyVar) {
                        final trp trpVar2 = trp.this;
                        fkj fkjVar = new fkj(vfmVar, 1);
                        final evv evvVar = new evv(vfmVar);
                        final fko fkoVar = new fko(vfmVar, 1);
                        amrw amrwVar = new amrw();
                        amrwVar.g(evr.SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG, new fkl(fkoVar, fkjVar, 1));
                        final byte[] bArr2 = null;
                        final byte[] bArr3 = null;
                        final byte[] bArr4 = null;
                        amrwVar.g(evr.BACKGROUND_AUDIO_POLICY, new zff(trpVar2, evvVar, bArr2, bArr3, bArr4) { // from class: evw
                            public final /* synthetic */ evv b;
                            public final /* synthetic */ trp c;

                            @Override // defpackage.zff
                            public final void a(Object obj, Object obj2) {
                                ammy ammyVar = ammy.this;
                                trp trpVar3 = this.c;
                                evv evvVar2 = this.b;
                                String str = (String) obj;
                                amsx amsxVar = evx.a;
                                if (ammyVar.a(str)) {
                                    evp l = trpVar3.l(evvVar2.a.d(str, null));
                                    aone aoneVar = (aone) obj2;
                                    aoneVar.copyOnWrite();
                                    evq evqVar = (evq) aoneVar.instance;
                                    evq evqVar2 = evq.a;
                                    evqVar.c = l.e;
                                    evqVar.b |= 1;
                                }
                            }
                        });
                        amsx amsxVar = evx.a;
                        aone createBuilder = evq.a.createBuilder();
                        whl.r(amsxVar, createBuilder, amrwVar.c());
                        return (evq) createBuilder.build();
                    }
                }), evq.a);
            case 1522:
                evp b = evx.b((trp) this.a.hw());
                ayaw.k(b);
                return b;
            case 1523:
                return azqy.ap().av();
            case 1524:
                return azqy.ap().av();
            case 1525:
                return this.a.u();
            case 1526:
                return new aoae(this.a.iC());
            case 1527:
                return new aiwu();
            case 1528:
                banw aw = ((ahzx) this.a.eQ.get()).a.aw();
                ayaw.k(aw);
                return aw;
            case 1529:
                banw ax = ((ahzx) this.a.eQ.get()).a.ax();
                ayaw.k(ax);
                return ax;
            case 1530:
                banw au = ((ahzx) this.a.eQ.get()).a.au();
                ayaw.k(au);
                return au;
            case 1531:
                banw av = ((ahzx) this.a.eQ.get()).a.av();
                ayaw.k(av);
                return av;
            case 1532:
                efz efzVar10 = this.a;
                return new aivs(efzVar10.b.a, efzVar10.js, efzVar10.kp, (aifk) efzVar10.fS.get(), (Executor) efzVar10.f.get(), (Executor) efzVar10.i.get());
            case 1533:
                fnv fnvVar = new fnv();
                fnvVar.a.add(new fnu(fnvVar));
                return fnvVar;
            case 1534:
                efz efzVar11 = this.a;
                aadw aadwVar = (aadw) efzVar11.D.get();
                return new axzf(aadwVar);
            case 1535:
                return new aoae((char[]) null, (byte[]) null, (char[]) null);
            case 1536:
                efz efzVar12 = this.a;
                return new iyz((Executor) efzVar12.f.get(), (aasy) efzVar12.ip.get());
            case 1537:
                return new mhe();
            case 1538:
                efz efzVar13 = this.a;
                aiek aiekVar = new aiek((aaea) efzVar13.K.get(), (ywr) efzVar13.ge.get());
                aiekVar.b();
                return aiekVar;
            case 1539:
                efz efzVar14 = this.a;
                final ahzi ahziVar = new ahzi((aifk) efzVar14.fS.get());
                new ayqw().d(((aioc) efzVar14.fY.get()).ab().Y(new ayrs() { // from class: ahzh
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ahzi ahziVar2 = ahzi.this;
                        ahel ahelVar = (ahel) obj;
                        ajbl a6 = ahelVar.a();
                        auic auicVar = aifk.d(ahziVar2.a.a).m;
                        if (auicVar == null) {
                            auicVar = auic.a;
                        }
                        if (!auicVar.b || a6 == null) {
                            return;
                        }
                        ahziVar2.b = ammv.i(ahelVar.a().d());
                    }
                }, ahwx.j));
                return ahziVar;
            case 1540:
                efz efzVar15 = this.a;
                aisj m = advr.m((anhy) efzVar15.lq.get(), (aifk) efzVar15.fS.get());
                m.b((aioc) efzVar15.fY.get());
                return m;
            case 1541:
                efz efzVar16 = this.a;
                ypa ypaVar2 = (ypa) efzVar16.B.get();
                abds abdsVar = (abds) efzVar16.lv.get();
                abdt abdtVar = (abdt) efzVar16.lu.get();
                return new aijg(ypaVar2, abdsVar, abdtVar);
            case 1542:
                return new ahbn();
            case 1543:
                return new agzs((shf) this.a.g.get());
            case 1544:
                efz efzVar17 = this.a;
                return new jqv(efzVar17.b.a, (agof) efzVar17.gH.get(), (aadw) efzVar17.D.get());
            case 1545:
                efz efzVar18 = this.a;
                return new jrd((jti) efzVar18.ni.get(), (aaea) efzVar18.K.get(), (aadw) efzVar18.D.get());
            case 1546:
                efz efzVar19 = this.a;
                return new jqt(efzVar19.b.a, (jti) efzVar19.ni.get(), afhy.j((ajkn) efzVar19.ed.get(), efzVar19.d()), (aadw) efzVar19.D.get());
            case 1547:
                efz efzVar20 = this.a;
                ion ionVar = (ion) efzVar20.vG.get();
                imn T = efzVar20.T();
                abig abigVar = (abig) efzVar20.vI.get();
                amnv gY = efzVar20.gY();
                axze axzeVar = (axze) efzVar20.vJ.get();
                aapf cp = efzVar20.cp();
                Executor executor = (Executor) efzVar20.f.get();
                ayqi a6 = azre.a();
                ayaw.k(a6);
                return new ing(ionVar, T, abigVar, gY, axzeVar, cp, executor, a6, (shf) efzVar20.g.get(), (ypa) efzVar20.B.get(), null, null, null);
            case 1548:
                efz efzVar21 = this.a;
                return new ion((aarm) efzVar21.er.get(), (ajoy) efzVar21.eV.get(), (afsy) efzVar21.au.get(), (ysl) efzVar21.iS.get(), (aadw) efzVar21.D.get(), null, null, null);
            case 1549:
                efz efzVar22 = this.a;
                eex eexVar = new eex(efzVar22.c);
                Object obj = (aioc) efzVar22.fY.get();
                aujs aujsVar = ((aaea) efzVar22.K.get()).a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                aujz aujzVar = aujsVar.d;
                if (aujzVar == null) {
                    aujzVar = aujz.a;
                }
                if (aujzVar.C) {
                    obj = eexVar.a();
                }
                ayaw.k(obj);
                return obj;
            case 1550:
                return new abig(null);
            case 1551:
                efz efzVar23 = this.a;
                return new axze((aaea) efzVar23.K.get());
            case 1552:
                return this.a.T();
            case 1553:
                return this.a.gY();
            case 1554:
                efz efzVar24 = this.a;
                return new aipw((shf) efzVar24.g.get(), (Executor) efzVar24.f.get(), (Handler) efzVar24.an.get(), (SecureRandom) efzVar24.ea.get(), (aaxn) efzVar24.vN.get(), efzVar24.ii(), (ahbv) efzVar24.bd.get(), (aifk) efzVar24.fS.get(), (acpl) efzVar24.aw.get());
            case 1555:
                efz efzVar25 = this.a;
                return new aaxn((aarm) efzVar25.er.get(), (ajoy) efzVar25.eV.get(), (afsy) efzVar25.au.get(), (ysl) efzVar25.fO.get(), null, null, null);
            case 1556:
                efz efzVar26 = this.a;
                return new aiqf((afuh) efzVar26.hz.get(), (ysy) efzVar26.as.get(), (afqj) efzVar26.hk.get(), ((wyz) efzVar26.eH.get()).a(), (Executor) efzVar26.f.get(), (ahbx) efzVar26.vP.get(), (acpl) efzVar26.aw.get(), (aaea) efzVar26.K.get(), wmr.h((aloh) efzVar26.sa.get()), null, null);
            case 1557:
                return this.a.bs();
            case 1558:
                return this.a.bW();
            case 1559:
                return ahal.d((afql) this.a.hx.get());
            case 1560:
                efz efzVar27 = this.a;
                return ahbj.e((zbw) efzVar27.av.get(), (ahbv) efzVar27.bd.get());
            case 1561:
                efz efzVar28 = this.a;
                return advr.k((aaea) efzVar28.K.get(), efzVar28.b.a, axqq.a(efzVar28.G));
            case 1562:
                efz efzVar29 = this.a;
                return new aldz((shf) efzVar29.g.get(), (ScheduledExecutorService) efzVar29.f.get(), (aaea) efzVar29.K.get(), (akwm) efzVar29.mD.get(), (axze) efzVar29.mF.get(), (akyb) efzVar29.mG.get(), (albz) efzVar29.mJ.get(), null, null, null);
            case 1563:
                efz efzVar30 = this.a;
                return new albx((akwb) efzVar30.vW.get(), (axze) efzVar30.mF.get(), null, null, null);
            case 1564:
                return new akwb(this.a.b.a);
            case 1565:
                efz efzVar31 = this.a;
                return new akxy((aarm) efzVar31.er.get(), (ajoy) efzVar31.eV.get(), (afsy) efzVar31.au.get(), (ysl) efzVar31.fN.get(), (aadw) efzVar31.D.get(), null, null, null);
            case 1566:
                efz efzVar32 = this.a;
                return new aaxn((aarm) efzVar32.er.get(), (ajoy) efzVar32.eV.get(), (afsy) efzVar32.au.get(), (ysl) efzVar32.fO.get(), (byte[]) null, (byte[]) null, (short[]) null, (byte[]) null);
            case 1567:
                return new alah(this.a.b.a);
            case 1568:
                efz efzVar33 = this.a;
                return new akxw(efzVar33.al, (shf) efzVar33.g.get(), (ScheduledExecutorService) efzVar33.f.get(), efzVar33.vY);
            case 1569:
                efz efzVar34 = this.a;
                return new abde((aarm) efzVar34.er.get(), (ajoy) efzVar34.eV.get(), (afsy) efzVar34.au.get(), (ysl) efzVar34.fO.get(), null, null, null, null);
            case 1570:
                efz efzVar35 = this.a;
                aarm aarmVar = (aarm) efzVar35.er.get();
                ajoy ajoyVar = (ajoy) efzVar35.eV.get();
                return new abbm(aarmVar, ajoyVar, (ysl) efzVar35.fN.get(), (aadw) efzVar35.D.get(), null, null, null);
            case 1571:
                efz efzVar36 = this.a;
                return new agek((SharedPreferences) efzVar36.z.get(), efzVar36.kw(), null);
            case 1572:
                efz efzVar37 = this.a;
                return new agpn((aisn) efzVar37.wg.get(), (Executor) efzVar37.f.get(), (ysy) efzVar37.as.get(), (agof) efzVar37.gH.get(), afvv.a((ylz) efzVar37.wf.get(), afuq.a((Executor) efzVar37.f.get(), new agra((zjl) efzVar37.uH.get())), (shf) efzVar37.g.get(), 7200000L));
            case 1573:
                efz efzVar38 = this.a;
                return new aisz((Executor) efzVar38.f.get(), (yrw) efzVar38.ke.get(), (zjl) efzVar38.uH.get(), (shf) efzVar38.g.get(), (ylz) efzVar38.wf.get());
            case 1574:
                return afhy.f();
            case 1575:
                efz efzVar39 = this.a;
                return ((wni) efzVar39.cT.get()).k ? new agdl() : new agdk((wqj) efzVar39.wi.get());
            case 1576:
                efz efzVar40 = this.a;
                return new wqj((shf) efzVar40.g.get(), (ajoy) efzVar40.sA.get(), (aarr) efzVar40.hV.get(), efzVar40.iP, null, null, null, null);
            case 1577:
                return new fma();
            case 1578:
                efz efzVar41 = this.a;
                axzg axzgVar = (axzg) efzVar41.kt.get();
                aalw aalwVar = (ltk) efzVar41.wo.get();
                aalw aalwVar2 = (lyw) efzVar41.wl.get();
                aqvj aqvjVar = axzgVar.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45357241L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45357241L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45357241L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                }
                if (true != bool.booleanValue()) {
                    aalwVar = aalwVar2;
                }
                ayaw.k(aalwVar);
                return aalwVar;
            case 1579:
                efz efzVar42 = this.a;
                return new ltk(efzVar42.b.a, efzVar42.F(), (lyw) efzVar42.wl.get(), (jmq) efzVar42.wn.get());
            case 1580:
                efz efzVar43 = this.a;
                return new lyw(efzVar43.b.a, efzVar43.gH, (fjs) efzVar43.kv.get(), (fiu) efzVar43.ku.get());
            case 1581:
                efz efzVar44 = this.a;
                return new jmq((jmu) efzVar44.wm.get(), new jne((jmz) efzVar44.hM(), (Executor) efzVar44.f.get(), 0), new jne((jmz) efzVar44.hM(), (Executor) efzVar44.f.get(), 1));
            case 1582:
                efz efzVar45 = this.a;
                return new jnc(efzVar45.fr(), (Executor) efzVar45.f.get());
            case 1583:
                return this.a.ap();
            case 1584:
                return this.a.r();
            case 1585:
                final Context context3 = this.a.b.a;
                return (zic) amlr.a.b(new amml() { // from class: ypq
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        zic zicVar = (zic) obj2;
                        return zic.a.equals(zicVar) ? yny.e(context3) : zicVar;
                    }
                }).d(new nju(context3, 11));
            case 1586:
                return new adpl(null);
            case 1587:
                efz efzVar46 = this.a;
                fbg fbgVar = new fbg((fay) efzVar46.nd.get(), efzVar46.nR, efzVar46.nS, (acsy) efzVar46.ee.get());
                aqvj aqvjVar2 = ((axzf) efzVar46.wt.get()).a.b().C;
                if (aqvjVar2 == null) {
                    aqvjVar2 = aqvj.a;
                }
                if (aqvjVar2.a(45352594L)) {
                    aoot aootVar2 = aqvjVar2.b;
                    if (!aootVar2.containsKey(45352594L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar2 = (aqvk) aootVar2.get(45352594L);
                    bool = Boolean.valueOf(aqvkVar2.b == 1 ? ((Boolean) aqvkVar2.c).booleanValue() : false);
                }
                return bool.booleanValue() ? fbgVar : new fbc();
            case 1588:
                efz efzVar47 = this.a;
                aadw aadwVar2 = (aadw) efzVar47.D.get();
                return new axzf(aadwVar2);
            case 1589:
                amil l = amjw.l("provideExtensionRegistry");
                try {
                    aomw b2 = aomw.b();
                    l.close();
                    ayaw.k(b2);
                    return b2;
                } finally {
                }
            case 1590:
                return this.a.ht();
            case 1591:
                return new amaq(this.a.gM());
            case 1592:
                efz efzVar48 = this.a;
                return new wkc(efzVar48.gM(), (alyl) efzVar48.hq(), efzVar48.gP(), (afsy) efzVar48.au.get(), (alzf) efzVar48.aV.get(), efzVar48.bj());
            case 1593:
                efz efzVar49 = this.a;
                return aash.k((aeie) efzVar49.iV.get(), (ypa) efzVar49.B.get(), (aioc) efzVar49.fY.get(), (aadw) efzVar49.D.get());
            case 1594:
                return new opn();
            case 1595:
                abbx abbxVar = (abbx) this.a.wz.get();
                abbxVar.getClass();
                return new gjh(abbxVar);
            case 1596:
                efz efzVar50 = this.a;
                return new abbx((cnd) efzVar50.ng.get(), (Executor) efzVar50.f.get(), (aarr) efzVar50.hV.get());
            case 1597:
                efz efzVar51 = this.a;
                return new axzg((aadw) efzVar51.D.get(), (aaea) efzVar51.K.get());
            case 1598:
                return this.a.kS();
            case 1599:
                efz efzVar52 = this.a;
                return new ahos((ahhc) efzVar52.uz.get(), (afht) efzVar52.gg.get(), efzVar52.fX, efzVar52.wD, new ahoy((ywr) efzVar52.wF.get()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object a() {
        amag amagVar;
        int i = this.b;
        switch (i) {
            case 0:
                return enq.h((abep) this.a.x.get());
            case 1:
                efz efzVar = this.a;
                return abev.a(efzVar.q, efzVar.w);
            case 2:
                efz efzVar2 = this.a;
                return whl.M(efzVar2.b.a, efz.jZ(), (anib) efzVar2.f.get(), (vfg) efzVar2.p.get());
            case 3:
                return wtv.h(amlr.a, (anic) this.a.n.get());
            case 4:
                efz efzVar3 = this.a;
                anic anicVar = (anic) efzVar3.m.get();
                ayaw.k(anicVar);
                efzVar3.jM();
                return h.b(anicVar, ammv.j(false), efz.jO());
            case 5:
                efz efzVar4 = this.a;
                return svf.c(amlr.a, (anic) efzVar4.d.get(), 10, sgf.h(ammv.j(Integer.valueOf(yjk.j((yxx) efzVar4.k.get())))), amlr.a, efzVar4.ay(), ammv.j((nbq) efzVar4.l.get()));
            case 6:
                return ote.c(efz.jO());
            case 7:
                efz efzVar5 = this.a;
                yxz j = shr.j(efzVar5.b.a, Optional.of((zfh) efzVar5.e.get()), efzVar5.f, (yyf) efzVar5.j.get());
                j.c();
                return j;
            case 8:
                return aarc.b;
            case 9:
                efz efzVar6 = this.a;
                yyf h = xhs.h(efzVar6.b.a, efzVar6.f, efzVar6.i);
                h.b();
                return h;
            case 10:
                return ote.d((shf) this.a.g.get());
            case 11:
                return ots.c();
            case 12:
                return new nbq();
            case 13:
                efz efzVar7 = this.a;
                return ytd.f((Executor) efzVar7.f.get(), (vcw) efzVar7.o.get());
            case 14:
                return whl.l(this.a.b.a);
            case 15:
                efz efzVar8 = this.a;
                return ((ylr) efzVar8.v.get()).b(efzVar8.r);
            case 16:
                efz efzVar9 = this.a;
                return whl.L(efzVar9.b.a, efz.jZ(), (anib) efzVar9.f.get(), (vfg) efzVar9.p.get());
            case 17:
                efz efzVar10 = this.a;
                return xhs.c((Executor) efzVar10.f.get(), (ylg) efzVar10.s.get(), (Runnable) efzVar10.u.get());
            case 18:
                return xuq.e();
            case 19:
                return xuq.f((Runnable) this.a.t.get());
            case 20:
                final Context context = this.a.b.a;
                return new Runnable() { // from class: end
                    @Override // java.lang.Runnable
                    public final void run() {
                        YouTubeBackupAgent.e(context);
                    }
                };
            case 21:
                return enq.e((iyu) this.a.ba.get());
            case 22:
                efz efzVar11 = this.a;
                return new iyu(efzVar11.b.a, (SharedPreferences) efzVar11.z.get(), efzVar11.A, axqq.a(efzVar11.H), efzVar11.aZ, efzVar11.x);
            case 23:
                return wtv.e(this.a.b.a, efz.jZ());
            case 24:
                armw u = enq.u();
                ayaw.k(u);
                return u;
            case 25:
                efz efzVar12 = this.a;
                return new acou(efzVar12.b.a, (aadw) efzVar12.D.get(), (ywh) efzVar12.E.get(), (shf) efzVar12.g.get(), (ScheduledExecutorService) efzVar12.f.get(), axqq.a(efzVar12.G));
            case 26:
                return aaca.c((aabt) this.a.C.get());
            case 27:
                efz efzVar13 = this.a;
                return new aabt((SharedPreferences) efzVar13.z.get(), (shf) efzVar13.g.get(), efzVar13.B, (yxx) efzVar13.k.get(), efzVar13.b.a);
            case 28:
                efz efzVar14 = this.a;
                return new ypa((Executor) efzVar14.i.get(), (shf) efzVar14.g.get());
            case 29:
                return new ywg(this.a.b.a);
            case 30:
                return ajix.f((Looper) this.a.F.get());
            case 31:
                return ote.b(0, amlr.a);
            case 32:
                efz efzVar15 = this.a;
                return new kcd(new kbx(efzVar15.b.a), efzVar15.b.a, (wdm) efzVar15.au.get());
            case 33:
                efz efzVar16 = this.a;
                Context context2 = efzVar16.b.a;
                return new wcx((SharedPreferences) efzVar16.z.get(), (wgv) efzVar16.I.get(), (yxx) efzVar16.k.get(), efzVar16.aX, (wcu) efzVar16.aY.get(), efzVar16.ax);
            case 34:
                efz efzVar17 = this.a;
                return svf.d(efzVar17.z, (aadw) efzVar17.D.get(), efzVar17.b.a, (anib) efzVar17.f.get(), (vfg) efzVar17.p.get(), efz.jZ());
            case 35:
                return aawj.c((acpl) this.a.aw.get());
            case 36:
                efz efzVar18 = this.a;
                Context context3 = efzVar18.b.a;
                Object obj = efzVar18.f208J.get();
                afrw afrwVar = (afrw) efzVar18.at.get();
                afsy afsyVar = (afsy) efzVar18.au.get();
                shf shfVar = (shf) efzVar18.g.get();
                zbw zbwVar = (zbw) efzVar18.av.get();
                ynn ynnVar = (ynn) efzVar18.Z.get();
                return wmq.c(obj, afrwVar, afsyVar, shfVar, zbwVar, ynnVar, Optional.empty());
            case 37:
                efz efzVar19 = this.a;
                return abev.d((aadw) efzVar19.D.get(), (shf) efzVar19.g.get());
            case 38:
                efz efzVar20 = this.a;
                afqd afqdVar = (afqd) efzVar20.N.get();
                afrz afrzVar = (afrz) efzVar20.ad.get();
                afrv afrvVar = (afrv) efzVar20.af.get();
                ylf ylfVar = (ylf) efzVar20.ai.get();
                return wmn.d(afqdVar, afrzVar, afrvVar, ylfVar, (shf) efzVar20.g.get(), (ysy) efzVar20.as.get());
            case 39:
                efz efzVar21 = this.a;
                return afqe.a((ynx) efzVar21.M.get(), efzVar21.b.a);
            case 40:
                return wzt.c((ynx) this.a.L.get());
            case 41:
                efz efzVar22 = this.a;
                return new aadx(efzVar22.D, efzVar22.K);
            case 42:
                return aaca.d((aabt) this.a.C.get());
            case 43:
                efz efzVar23 = this.a;
                afrz afrzVar2 = ((yxx) efzVar23.k.get()).f(yxx.S) == 1 ? (afrz) efzVar23.ac.get() : (afrz) efzVar23.aa.get();
                ayaw.k(afrzVar2);
                return afrzVar2;
            case 44:
                efz efzVar24 = this.a;
                afqd afqdVar2 = (afqd) efzVar24.N.get();
                afsc afscVar = (afsc) efzVar24.aa.get();
                afsd afsdVar = (afsd) efzVar24.ab.get();
                return aash.g(afqdVar2, afscVar, afsdVar);
            case 45:
                efz efzVar25 = this.a;
                return aash.h((afqd) efzVar25.N.get(), (shf) efzVar25.g.get(), (yoi) efzVar25.P.get(), (ynn) efzVar25.Z.get());
            case 46:
                efz efzVar26 = this.a;
                return advr.f(efzVar26.b.a, (String) efzVar26.O.get(), amlr.a);
            case 47:
                return "com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore";
            case 48:
                efz efzVar27 = this.a;
                yxx yxxVar = (yxx) efzVar27.k.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) efzVar27.f.get();
                Executor executor = (Executor) efzVar27.f.get();
                azrw azrwVar = efzVar27.Y;
                return snd.f(yxxVar, scheduledExecutorService, executor, azrwVar, azrwVar);
            case 49:
                efz efzVar28 = this.a;
                return xhs.f(efzVar28.iI(), efzVar28.b.a, efz.jO());
            case 50:
                efz efzVar29 = this.a;
                return new yys(efzVar29.f, efzVar29.Q, efzVar29.T, efzVar29.U, efzVar29.V, (shf) efzVar29.g.get(), (whl) efzVar29.W.get(), (yxx) efzVar29.k.get(), (nbq) efzVar29.l.get(), null, null, null);
            case 51:
                efz efzVar30 = this.a;
                return xhs.d(efzVar30.iI(), efzVar30.b.a, efz.jO());
            case 52:
                efz efzVar31 = this.a;
                return xhs.e(amsx.r((ynf) efzVar31.S.get()), efzVar31.b.a, efz.jO());
            case 53:
                efz efzVar32 = this.a;
                Context context4 = efzVar32.b.a;
                return wtv.i(efzVar32.R);
            case 54:
                return new ymt((Executor) this.a.i.get());
            case 55:
                return new ymu();
            case 56:
                Context context5 = this.a.b.a;
                return new ynh(2, new yna(8, "initCrit"));
            case 57:
                return new ymp(((yxx) this.a.k.get()).f(yxx.I));
            case 58:
                return new whl();
            case 59:
                return afhy.c();
            case 60:
                efz efzVar33 = this.a;
                ynx ynxVar = (ynx) efzVar33.M.get();
                amrz s = enq.s();
                ayaw.k(s);
                return new afrv(ynxVar, s, (ywr) efzVar33.ae.get());
            case 61:
                efz efzVar34 = this.a;
                return advr.j(efzVar34.b.a, (anib) efzVar34.f.get(), (vfg) efzVar34.p.get());
            case 62:
                efz efzVar35 = this.a;
                return wtv.g(efzVar35.ag, (yle) efzVar35.ah.get());
            case 63:
                return caj.h(this.a.b.a);
            case 64:
                return new yld();
            case 65:
                return afpv.d(this.a.aj);
            case 66:
                efz efzVar36 = this.a;
                return afqe.d(efzVar36.b.a, efzVar36.p);
            case 67:
                efz efzVar37 = this.a;
                yvu yvuVar = (yvu) efzVar37.am.get();
                ConnectivityManager j2 = efzVar37.j();
                azrw azrwVar2 = efzVar37.ar;
                return snd.g(yvuVar, j2, azrwVar2, efzVar37.ao.get());
            case 68:
                efz efzVar38 = this.a;
                return new yvt(efzVar38.j(), amdd.b(efzVar38.b.a), (zey) efzVar38.al.get());
            case 69:
                return ytb.h(this.a.b.a);
            case 70:
                efz efzVar39 = this.a;
                return shr.F(efzVar39.B, efzVar39.ao.get(), (axzg) efzVar39.ap.get(), (ayqi) efzVar39.aq.get());
            case 71:
                efz efzVar40 = this.a;
                return xhs.g(efzVar40.b.a, (ynx) efzVar40.M.get(), (Handler) efzVar40.an.get());
            case 72:
                return wzt.f(this.a.b.a);
            case 73:
                efz efzVar41 = this.a;
                return new axzg((aadw) efzVar41.D.get(), (aaea) efzVar41.K.get());
            case 74:
                return wzt.d((Executor) this.a.f.get());
            case 75:
                return new zbw((shf) this.a.g.get());
            case 76:
                efz efzVar42 = this.a;
                return new wjx((alxe) efzVar42.aT.get(), efzVar42.gM(), (alzf) efzVar42.aV.get(), (anib) efzVar42.aA.get(), (Executor) efzVar42.i.get());
            case 77:
                efz efzVar43 = this.a;
                return new alxi(new alwu(efzVar43.gM()), ammv.j(efzVar43.aW), (anic) efzVar43.h.get());
            case 78:
                efz efzVar44 = this.a;
                anib hb = efzVar44.hb();
                Context context6 = efzVar44.b.a;
                azrw azrwVar3 = efzVar44.ay;
                azrw azrwVar4 = efzVar44.n;
                azrw azrwVar5 = efzVar44.aA;
                vgz vgzVar = (vgz) efzVar44.aC.get();
                if (((Boolean) ((amna) ammv.j(ajbp.f())).a).booleanValue()) {
                    anib anibVar = (anib) azrwVar3.get();
                    amagVar = new amag(context6, anibVar, vgzVar);
                } else {
                    anib anibVar2 = (anib) azrwVar4.get();
                    amagVar = new amag(context6, anibVar2, vgzVar);
                }
                efzVar44.kg();
                amaj amajVar = new amaj(hb, amagVar);
                efzVar44.kg();
                efzVar44.hb();
                alzq alzqVar = new alzq();
                anib hb2 = efzVar44.hb();
                amfb a = amfc.a();
                a.a = "AccountData";
                a.b(amal.a);
                amae amaeVar = new amae(amajVar.b, amajVar);
                if (a.c == null) {
                    a.c = amru.f();
                }
                a.c.h(amaeVar);
                a.d = alzqVar;
                a.f = hb2;
                return efzVar44.gR().a(a.a(), (vcw) efzVar44.aB.get());
            case 79:
                efz efzVar45 = this.a;
                anic hc = efzVar45.hc();
                efzVar45.jM();
                return h.c(hc, ammv.j(false), efz.jO());
            case 80:
                efz efzVar46 = this.a;
                return shr.a(amlr.a, 11, (anic) efzVar46.d.get(), efzVar46.ay(), ammv.j((nbq) efzVar46.l.get()));
            case 81:
                efz efzVar47 = this.a;
                anic anicVar2 = (anic) efzVar47.az.get();
                ayaw.k(anicVar2);
                efzVar47.jM();
                return h.d(anicVar2, ammv.j(false), efz.jO());
            case 82:
                efz efzVar48 = this.a;
                return snd.c(amlr.a, (anic) efzVar48.d.get(), sgf.i(), 0, efzVar48.ay(), amlr.a, ammv.j((nbq) efzVar48.l.get()));
            case 83:
                efz efzVar49 = this.a;
                anib hb3 = efzVar49.hb();
                amfb a2 = amfc.a();
                a2.a = "TikTokAccountStoreMigration";
                a2.b(aman.a);
                a2.f = hb3;
                return efzVar49.gR().a(a2.a(), (vcw) efzVar49.aB.get());
            case 84:
                return new alra(this.a.b.a);
            case 85:
                Context context7 = this.a.b.a;
                slf.c();
                return new vcw(amru.r(vcz.q(context7).a()));
            case 86:
                efz efzVar50 = this.a;
                final amdi amdiVar = (amdi) efzVar50.aD.get();
                alyq alyqVar = new alyq() { // from class: alzl
                    @Override // defpackage.alyq
                    public final anhy a() {
                        amdi amdiVar2 = amdi.this;
                        anhy O = anaf.O(null);
                        amdiVar2.a(O);
                        return O;
                    }
                };
                final amgd amgdVar = (amgd) efzVar50.aS.get();
                return amsx.s(alyqVar, new alyq() { // from class: amgn
                    @Override // defpackage.alyq
                    public final anhy a() {
                        return amgd.this.d();
                    }
                });
            case 87:
                return new amdi(null);
            case 88:
                efz efzVar51 = this.a;
                return new amgd((shf) efzVar51.g.get(), efzVar51.b.a, (anib) efzVar51.n.get(), (anic) efzVar51.n.get(), (amba) efzVar51.aI.get(), ammv.j(efzVar51.gM()), (amgk) efzVar51.aJ.get(), amvs.a, amvs.a, amrz.m(amfh.ON_CHARGER, efzVar51.aL, amfh.ON_NETWORK_CONNECTED, efzVar51.aN, amfh.ON_NETWORK_UNMETERED, efzVar51.aP), new amha((amcp) efzVar51.aQ.get(), new amgv((shf) efzVar51.g.get(), (amgk) efzVar51.aJ.get(), new amgo(efzVar51.aR), (anib) efzVar51.n.get()), (shf) efzVar51.g.get(), (Executor) efzVar51.aA.get()));
            case 89:
                efz efzVar52 = this.a;
                Context context8 = efzVar52.b.a;
                PowerManager powerManager = (PowerManager) context8.getSystemService("power");
                ayaw.k(powerManager);
                anic anicVar3 = (anic) efzVar52.h.get();
                return new amba(context8, powerManager, anicVar3, amrz.k("main_process_service_key", efzVar52.aH), (anic) efzVar52.n.get(), (anic) efzVar52.ay.get(), efzVar52.be());
            case 90:
                Context context9 = this.a.b.a;
                return new ambb();
            case 91:
                efz efzVar53 = this.a;
                Context context10 = efzVar53.b.a;
                ambd ambdVar = (ambd) efzVar53.aF.get();
                Executor executor2 = (Executor) efzVar53.n.get();
                ayaw.k((NotificationManager) efzVar53.b.a.getSystemService("notification"));
                return new ambm(context10, ambdVar, executor2);
            case 92:
                return new ambd();
            case 93:
                return AndroidFuturesService.class;
            case 94:
                efz efzVar54 = this.a;
                return new amgk(efzVar54.b.a, (anib) efzVar54.n.get(), (shf) efzVar54.g.get());
            case 95:
                amfm amfmVar = (amfm) this.a.aK.get();
                ayaw.k(amfmVar);
                return amfmVar;
            case 96:
                return new amfm(this.a.b.a);
            case 97:
                amfn amfnVar = (amfn) this.a.aM.get();
                ayaw.k(amfnVar);
                return amfnVar;
            case 98:
                efz efzVar55 = this.a;
                return new amfn(efzVar55.b.a, efzVar55.j(), 1, null);
            case 99:
                amfn amfnVar2 = (amfn) this.a.aO.get();
                ayaw.k(amfnVar2);
                return amfnVar2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 1800:
                tib tibVar = tib.e;
                ayaw.k(tibVar);
                return tibVar;
            case 1801:
                tib tibVar2 = tib.b;
                ayaw.k(tibVar2);
                return tibVar2;
            case 1802:
                tib tibVar3 = tib.d;
                ayaw.k(tibVar3);
                return tibVar3;
            case 1803:
                tib tibVar4 = tib.g;
                ayaw.k(tibVar4);
                return tibVar4;
            case 1804:
                tib tibVar5 = tib.h;
                ayaw.k(tibVar5);
                return tibVar5;
            case 1805:
                return this.a.a.s();
            case 1806:
                tib tibVar6 = tib.f;
                ayaw.k(tibVar6);
                return tibVar6;
            case 1807:
                return new thp(amvo.b);
            case 1808:
                return ((tgn) this.a.a.aX.get()).a;
            case 1809:
                return new ifn();
            case 1810:
                efc efcVar = this.a.a;
                return new fuu((aknq) efcVar.dm.c.gk.get(), (afsy) efcVar.dm.c.au.get(), efcVar.dm.c.cF(), (agcm) efcVar.bb.get(), null, null, null);
            case 1811:
                return this.a.a.ac();
            case 1812:
                efz efzVar = this.a.a.dm.c;
                Context context = efzVar.b.a;
                vfg vfgVar = (vfg) efzVar.p.get();
                vda a = vdb.a(context);
                a.e("settings");
                a.f("settings.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.e(lqw.a);
                a3.f(a2);
                return vfgVar.a(a3.a());
            case 1813:
                return new akgl();
            case 1814:
                efz efzVar2 = this.a.a.dm.c;
                return whl.n(efzVar2.b.a, "datasavingsetting", "data_saving_setting_schema.pb", (vfg) efzVar2.p.get(), lox.a);
            case 1815:
                return new azos((Executor) this.a.a.dm.c.aA.get());
            case 1816:
                efc efcVar2 = this.a.a;
                return new axze((aaea) efcVar2.dm.c.K.get());
            case 1817:
                efc efcVar3 = this.a.a;
                aadw aadwVar = (aadw) efcVar3.dm.c.D.get();
                return new axzf(aadwVar);
            case 1818:
                efc efcVar4 = this.a.a;
                return new akpe((aarm) efcVar4.dm.c.er.get(), (ajoy) efcVar4.dm.c.eV.get(), (afsy) efcVar4.dm.c.au.get(), (ysl) efcVar4.dm.c.fN.get(), (Executor) efcVar4.dm.c.f.get(), null, null, null, null, null);
            case 1819:
                return this.a.a.G();
            case 1820:
                efz efzVar3 = this.a.a.dm.c;
                Context context2 = efzVar3.b.a;
                vfg vfgVar2 = (vfg) efzVar3.p.get();
                vda a4 = vdb.a(context2);
                a4.e("mdx");
                a4.f("autoconnect_prompt_record.pb");
                Uri a5 = a4.a();
                vfe a6 = vff.a();
                a6.f(a5);
                a6.e(awvd.a);
                return vfgVar2.a(a6.a());
            case 1821:
                return new adaf();
            case 1822:
                efc efcVar5 = this.a.a;
                return new MdxSmartRemoteDialListener((acys) efcVar5.dm.c.iJ.get(), (adlt) efcVar5.dm.c.ja.get(), (ypa) efcVar5.dm.c.B.get(), (acun) efcVar5.dm.c.iu.get());
            case 1823:
                efc efcVar6 = this.a.a;
                return new SuggestVideoStateSubscriber((shf) efcVar6.dm.c.g.get(), (ypa) efcVar6.dm.c.B.get(), (aioc) efcVar6.dm.c.fY.get(), (aadw) efcVar6.dm.c.D.get());
            case 1824:
                efz efzVar4 = this.a.a.dm.c;
                Context context3 = efzVar4.b.a;
                vfg vfgVar3 = (vfg) efzVar4.p.get();
                vda a7 = vdb.a(context3);
                a7.e("mdx");
                a7.f("mdx_tvsignin.pb");
                Uri a8 = a7.a();
                vfe a9 = vff.a();
                a9.f(a8);
                a9.e(awvi.a);
                return vfgVar3.a(a9.a());
            case 1825:
                efc efcVar7 = this.a.a;
                return new adst((yrw) efcVar7.dm.c.ix.get(), (anhy) efcVar7.dm.c.iG.get(), (anib) efcVar7.dm.c.ay.get());
            case 1826:
                return this.a.a.K();
            case 1827:
                efc efcVar8 = this.a.a;
                return new aaxn((aarm) efcVar8.dm.c.er.get(), (ajoy) efcVar8.dm.c.eV.get(), (afsy) efcVar8.dm.c.au.get(), (ysl) efcVar8.dm.c.fN.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1828:
                efz efzVar5 = this.a.a.dm.c;
                Context context4 = efzVar5.b.a;
                vfg vfgVar4 = (vfg) efzVar5.p.get();
                vda a10 = vdb.a(context4);
                a10.e("upload");
                a10.f("upload_storage.schema.pb");
                Uri a11 = a10.a();
                vfe a12 = vff.a();
                a12.e(alau.a);
                a12.f(a11);
                return vfgVar4.a(a12.a());
            case 1829:
                return new akoh();
            case 1830:
                efc efcVar9 = this.a.a;
                return new axzg((aadw) efcVar9.dm.c.D.get(), (aaea) efcVar9.dm.c.K.get());
            case 1831:
                return this.a.hx();
            case 1832:
                efc efcVar10 = this.a.a;
                efz efzVar6 = efcVar10.dm.c;
                azrw azrwVar = efzVar6.rr;
                aadw aadwVar2 = (aadw) efzVar6.D.get();
                efz efzVar7 = efcVar10.dm.c;
                return new enp(azrwVar, aadwVar2, efzVar7.aw, (Executor) efzVar7.f.get(), (ayqi) efcVar10.dm.c.aq.get(), efcVar10.dm.c.ct);
            case 1833:
                return this.a.a.P();
            case 1834:
            case 1835:
                return false;
            case 1836:
                efc efcVar11 = this.a.a;
                return new osq((ypa) efcVar11.dm.c.B.get(), (Handler) efcVar11.dm.c.an.get());
            case 1837:
                efc efcVar12 = this.a.a;
                return new ort((osq) efcVar12.by.get(), (ypa) efcVar12.dm.c.B.get(), (ysy) efcVar12.dm.c.as.get(), (ainy) efcVar12.dm.c.fX.get());
            case 1838:
                return new aolb(null);
            case 1839:
                efc efcVar13 = this.a.a;
                efz efzVar8 = efcVar13.dm.c;
                return lyl.b(efzVar8.b.a, efzVar8.p, (anib) efzVar8.f.get(), efz.jZ(), (ylr) efcVar13.dm.c.v.get());
            case 1840:
                efc efcVar14 = this.a.a;
                return new jvt((ysy) efcVar14.dm.c.as.get(), (shf) efcVar14.dm.c.g.get(), (fjs) efcVar14.dm.c.kv.get(), (fka) efcVar14.dm.c.gN.get(), efcVar14.dm.c.gH, efcVar14.z);
            case 1841:
                return this.a.a.d();
            case 1842:
                return this.a.a.e();
            case 1843:
                return this.a.a.j();
            case 1844:
                efc efcVar15 = this.a.a;
                return new aczi((adlt) efcVar15.dm.c.ja.get(), (sxd) efcVar15.dm.c.nx.get());
            case 1845:
                return this.a.a.m();
            case 1846:
                return szr.g();
            case 1847:
                efc efcVar16 = this.a.a;
                efz efzVar9 = efcVar16.dm.c;
                Context context5 = efzVar9.b.a;
                Executor executor = (Executor) efzVar9.f.get();
                vcw vcwVar = (vcw) efcVar16.dm.c.o.get();
                vfg vfgVar5 = (vfg) efcVar16.dm.c.p.get();
                amlr amlrVar = amlr.a;
                ammv j = ammv.j((shf) efcVar16.dm.c.g.get());
                trp trpVar = new trp(context5, (byte[]) null);
                tud tudVar = new tud(0);
                shf shfVar = (shf) j.e(new zhr(1));
                Handler handler = (Handler) amlrVar.d(gzp.f);
                vev a13 = vey.a();
                a13.c(context5);
                a13.b();
                a13.b = jom.q;
                a13.d = handler;
                vey a14 = a13.a();
                qmy qmyVar = qmy.a;
                return new tuz(context5, executor, "ObakeYt", vcwVar, vfgVar5, trpVar, tudVar, shfVar, a14, null);
            case 1848:
                efc efcVar17 = this.a.a;
                efz efzVar10 = efcVar17.dm.c;
                return new xun(efzVar10.b.a, (Executor) efzVar10.f.get(), (Executor) efcVar17.dm.c.i.get(), (xup) efcVar17.bI.get(), (afri) efcVar17.dm.c.yr.get());
            case 1849:
                efc efcVar18 = this.a.a;
                return new xup((wco) efcVar18.dm.c.dc.get(), (afsy) efcVar18.dm.c.au.get(), xuq.a());
            case 1850:
                efc efcVar19 = this.a.a;
                return new xtb(efcVar19.dm.c.b.a, (xsp) efcVar19.bK.get(), (Executor) efcVar19.dm.c.f.get(), (Executor) efcVar19.dm.c.i.get());
            case 1851:
                efz efzVar11 = this.a.a.dm.c;
                return new xsp(efzVar11.b.a, (afri) efzVar11.yr.get());
            case 1852:
                return new acsf();
            case 1853:
                return new aoae((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
            case 1854:
                return new aoae((short[]) null, (char[]) null);
            case 1855:
                return new unx(null);
            case 1856:
                return new yah();
            case 1857:
                return new yaq();
            case 1858:
                return new aoae((short[]) null, (byte[]) null);
            case 1859:
                return this.a.a.i();
            case 1860:
                return this.a.a.g();
            case 1861:
                return this.a.a.k();
            case 1862:
                efc efcVar20 = this.a.a;
                ysy ysyVar = (ysy) efcVar20.dm.c.as.get();
                fjm fjmVar = (fjm) efcVar20.dm.c.nM.get();
                agel agelVar = (agel) efcVar20.dm.c.lh.get();
                efz efzVar12 = efcVar20.dm.c;
                return new jwy(ysyVar, fjmVar, agelVar, efzVar12.gU, (agzr) efzVar12.gP.get(), 0);
            case 1863:
                return this.a.a.M();
            case 1864:
                return new trp(this.a.a.dm.c.b.a, (int[]) null);
            case 1865:
                efc efcVar21 = this.a.a;
                return new fjh((shf) efcVar21.dm.c.g.get(), (ypa) efcVar21.dm.c.B.get(), (ScheduledExecutorService) efcVar21.dm.c.f.get(), (Executor) efcVar21.dm.c.i.get());
            case 1866:
                return new mrd();
            case 1867:
                efc efcVar22 = this.a.a;
                efz efzVar13 = efcVar22.dm.c;
                Context context6 = efzVar13.b.a;
                aadw aadwVar3 = (aadw) efzVar13.D.get();
                efz efzVar14 = efcVar22.dm.c;
                Context context7 = efzVar14.b.a;
                return enq.Q(context6, aadwVar3, new akzk(), (axze) efcVar22.dm.c.mF.get());
            case 1868:
                return new akwg();
            case 1869:
                return new axzf((aadw) this.a.a.dm.c.D.get());
            case 1870:
                return this.a.a.N();
            case 1871:
                return new jyy(this.a.a.dm.c.ee);
            case 1872:
                return this.a.a.f();
            case 1873:
                return new jou();
            case 1874:
                efz efzVar15 = this.a;
                return new etv((aahv) efzVar15.dB.get(), efzVar15.t());
            case 1875:
                efz efzVar16 = this.a;
                aadw aadwVar4 = (aadw) efzVar16.D.get();
                return new axzf(aadwVar4);
            case 1876:
                return new yjj();
            case 1877:
                return this.a.a.a();
            case 1878:
                efc efcVar23 = this.a.a;
                aarm aarmVar = (aarm) efcVar23.dm.c.er.get();
                ajoy ajoyVar = (ajoy) efcVar23.dm.c.eV.get();
                return new abcv(aarmVar, ajoyVar, (ysl) efcVar23.dm.c.fN.get(), (aadw) efcVar23.dm.c.D.get(), (Executor) efcVar23.dm.c.f.get(), null, null, null);
            case 1879:
                return this.a.a.q();
            case 1880:
                efz efzVar17 = this.a.a.dm.c;
                Context context8 = efzVar17.b.a;
                vfg vfgVar6 = (vfg) efzVar17.p.get();
                vda a15 = vdb.a(context8);
                a15.e("shorts");
                a15.f("ShortsData.pb");
                Uri a16 = a15.a();
                vfe a17 = vff.a();
                a17.e(hqe.a);
                a17.f(a16);
                return vfgVar6.a(a17.a());
            case 1881:
                efc efcVar24 = this.a.a;
                return new abcs((aarm) efcVar24.dm.c.er.get(), (ajoy) efcVar24.dm.c.eV.get(), (afsy) efcVar24.dm.c.au.get(), (ysl) efcVar24.dm.c.fN.get(), null, null, null);
            case 1882:
                return new axze((aaea) this.a.a.dm.c.K.get(), (char[]) null);
            case 1883:
                efc efcVar25 = this.a.a;
                return new abdo((aarm) efcVar25.dm.c.er.get(), (ajoy) efcVar25.dm.c.eV.get(), (afsy) efcVar25.dm.c.au.get(), (ysl) efcVar25.dm.c.fO.get(), (aadw) efcVar25.dm.c.D.get(), null, null, null);
            case 1884:
                efc efcVar26 = this.a.a;
                return new axze((aaea) efcVar26.dm.c.K.get());
            case 1885:
                efz efzVar18 = this.a.a.dm.c;
                Context context9 = efzVar18.b.a;
                vfg vfgVar7 = (vfg) efzVar18.p.get();
                vda a18 = vdb.a(context9);
                a18.e("reeledu");
                a18.f("reeledu.pb");
                Uri a19 = a18.a();
                vfe a20 = vff.a();
                a20.e(iop.a);
                a20.f(a19);
                return vfgVar7.a(a20.a());
            case 1886:
                efc efcVar27 = this.a.a;
                return new imu((ing) efcVar27.dm.c.vK.get(), (aoae) efcVar27.dm.c.vu.get(), (ifn) efcVar27.aZ.get(), (shf) efcVar27.dm.c.g.get(), (Executor) efcVar27.dm.c.i.get(), (acsw) efcVar27.dm.c.ee.get(), (aeeo) efcVar27.dm.c.hJ.get(), efcVar27.dm.c.gY(), (aioc) efcVar27.dm.c.vH.get(), (aaqz) efcVar27.dm.c.eq.get(), (afsy) efcVar27.dm.c.au.get(), (gfw) efcVar27.ck.get(), null, null, null, null);
            case 1887:
                return ghe.q();
            case 1888:
                efz efzVar19 = this.a.a.dm.c;
                Context context10 = efzVar19.b.a;
                vfg vfgVar8 = (vfg) efzVar19.p.get();
                vda a21 = vdb.a(context10);
                a21.e("reelwatch");
                a21.f("reelwatch.pb");
                Uri a22 = a21.a();
                vfe a23 = vff.a();
                a23.e(ioq.a);
                a23.f(a22);
                return vfgVar8.a(a23.a());
            case 1889:
                return this.a.a.w();
            case 1890:
                return this.a.a.v();
            case 1891:
                efz efzVar20 = this.a.a.dm.c;
                Context context11 = efzVar20.b.a;
                ExecutorService executorService = (ExecutorService) efzVar20.f.get();
                final ukn uknVar = new ukn();
                uknVar.a = context11.getApplicationContext();
                uknVar.b = executorService;
                uknVar.a.getClass();
                if (uknVar.b == null) {
                    ExecutorService executorService2 = uknVar.c;
                    if (executorService2 == null) {
                        executorService2 = Executors.newCachedThreadPool((ThreadFactory) uknVar.g.get());
                    }
                    uknVar.b = executorService2;
                }
                if (uknVar.c == null) {
                    uknVar.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) uknVar.g.get());
                }
                return new ukt(uknVar.b, new amnv() { // from class: ukl
                    @Override // defpackage.amnv
                    public final Object get() {
                        final ukn uknVar2 = ukn.this;
                        final ujn ujnVar = new ujn(uknVar2.a, uknVar2.c);
                        amnv amnvVar = new amnv() { // from class: ukm
                            @Override // defpackage.amnv
                            public final Object get() {
                                ukn uknVar3 = ukn.this;
                                ujn ujnVar2 = ujnVar;
                                uku ukuVar = new uku();
                                ukuVar.a = uknVar3.a.getApplicationContext();
                                ukuVar.b = uknVar3.b;
                                ukuVar.c = ujnVar2;
                                ukuVar.a.getClass();
                                ukuVar.b.getClass();
                                ajbh ajbhVar = new ajbh((char[]) null, (byte[]) null);
                                ajbhVar.i = 641;
                                qip.ap(true, "Must provide valid client application ID!");
                                rna rnaVar = new rna(ajbhVar, null, null);
                                qob b = rnb.b(ukuVar.a, rnaVar);
                                rmx a24 = rnb.a(ukuVar.a, rnaVar);
                                qob c = rnb.c(ukuVar.a, rnaVar);
                                Context context12 = ukuVar.a;
                                return new umd(new ulx(context12, b, a24, c, new ukg(context12, ukuVar.b), ukuVar.b, qmy.a), 2, ukuVar.c, ukuVar.a.getPackageName());
                            }
                        };
                        if (uknVar2.d.h(uknVar2.a, 19621000) != 0) {
                            return amnvVar.get();
                        }
                        ukt uktVar = new ukt(uknVar2.b, amnvVar);
                        if (uknVar2.e == null) {
                            rme rmeVar = new rme(uknVar2.a);
                            vcy q = vcz.q(uknVar2.a);
                            q.b = rmeVar;
                            vcw vcwVar2 = new vcw(amru.r(q.a()));
                            vfh vfhVar = new vfh();
                            vfhVar.a = uknVar2.b;
                            vfhVar.b = vcwVar2;
                            vfhVar.b(vgb.a);
                            vfg a24 = vfhVar.a();
                            tuc tucVar = new tuc();
                            Context context12 = uknVar2.a;
                            context12.getClass();
                            tucVar.a = context12;
                            ExecutorService executorService3 = uknVar2.b;
                            executorService3.getClass();
                            tucVar.b = executorService3;
                            tucVar.d = vcwVar2;
                            tucVar.c = a24;
                            tucVar.e = "OneGoogle";
                            Context context13 = tucVar.a;
                            context13.getClass();
                            Executor executor2 = tucVar.b;
                            executor2.getClass();
                            vfg vfgVar9 = tucVar.c;
                            vfgVar9.getClass();
                            vcw vcwVar3 = tucVar.d;
                            vcwVar3.getClass();
                            String str = tucVar.e;
                            str.getClass();
                            trp trpVar2 = new trp(context13, (byte[]) null);
                            tud tudVar2 = new tud(1);
                            zhr zhrVar = new zhr(1);
                            HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                            handlerThread.start();
                            Handler handler2 = new Handler(handlerThread.getLooper());
                            vev a25 = vey.a();
                            a25.c(context13);
                            a25.b();
                            a25.b = jom.p;
                            a25.d = handler2;
                            uknVar2.e = new tuz(context13, executor2, str, vcwVar3, vfgVar9, trpVar2, tudVar2, zhrVar, a25.a(), null);
                        }
                        Context context14 = uknVar2.a;
                        return new uls(new umd(new ulg(context14, uknVar2.e, new ukg(context14, uknVar2.b), ujnVar, Build.VERSION.SDK_INT >= 26 ? new ulb(0) : new ulb(1)), 1, ujnVar, uknVar2.a.getPackageName()), uktVar);
                    }
                });
            case 1892:
                efc efcVar28 = this.a.a;
                return new tiq(efcVar28.aX, efcVar28.aY, efcVar28.cd);
            case 1893:
                efc efcVar29 = this.a.a;
                return new sgf();
            case 1894:
                efc efcVar30 = this.a.a;
                efz efzVar21 = efcVar30.dm.c;
                Context context12 = efzVar21.b.a;
                ExecutorService executorService3 = (ExecutorService) efzVar21.f.get();
                ugz ugzVar = (ugz) efcVar30.co.get();
                tip tipVar = (tip) efcVar30.cp.get();
                uij a24 = uik.a(context12, ugh.class);
                a24.d(ugzVar);
                a24.e(executorService3);
                a24.c = new ujd();
                a24.f(tipVar);
                return a24.a();
            case 1895:
                efz efzVar22 = this.a.a.dm.c;
                Context context13 = efzVar22.b.a;
                vfg vfgVar9 = (vfg) efzVar22.p.get();
                vda a25 = vdb.a(context13);
                a25.e("main_app_mdx");
                a25.f("main_app_mdx_tvsignin.pb");
                Uri a26 = a25.a();
                vfe a27 = vff.a();
                a27.f(a26);
                a27.e(awke.a);
                return vfgVar9.a(a27.a());
            case 1896:
                return this.a.a.o();
            case 1897:
                return new aoae((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1898:
                return this.a.a.h();
            case 1899:
                return this.a.a.ap();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i;
        Long l;
        int i2 = this.b;
        Uri[] uriArr = null;
        switch (i2) {
            case 1200:
                efz efzVar = this.a;
                ubu ubuVar = new ubu();
                ubuVar.a = efzVar.b.a;
                ubuVar.b = (twn) efzVar.pO.get();
                return ubuVar;
            case 1201:
                aone createBuilder = aokq.a.createBuilder();
                if (axsg.e() && (i = tyo.i(axsg.c().b)) != 0 && i != 1) {
                    aone createBuilder2 = aokp.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aokp aokpVar = (aokp) createBuilder2.instance;
                    aokpVar.b |= 1;
                    aokpVar.c = true;
                    createBuilder.copyOnWrite();
                    aokq aokqVar = (aokq) createBuilder.instance;
                    aokp aokpVar2 = (aokp) createBuilder2.build();
                    aokpVar2.getClass();
                    aokqVar.c = aokpVar2;
                    aokqVar.b |= 1;
                }
                aokq aokqVar2 = (aokq) createBuilder.build();
                ayaw.k(aokqVar2);
                return amsx.r(aokqVar2);
            case 1202:
                return new aloh(this.a.b.a, null, null, null);
            case 1203:
                return this.a.hL();
            case 1204:
                efz efzVar2 = this.a;
                return new uan((twn) efzVar2.pO.get(), (uaj) efzVar2.qe.get(), (uak) efzVar2.pV.get());
            case 1205:
                efz efzVar3 = this.a;
                return new tyo();
            case 1206:
                efz efzVar4 = this.a;
                return new uan((twn) efzVar4.pO.get(), (uaj) efzVar4.qe.get(), (uak) efzVar4.pV.get());
            case 1207:
                efz efzVar5 = this.a;
                return new tyo();
            case 1208:
                efz efzVar6 = this.a;
                return new uao((twn) efzVar6.pO.get(), (uaa) efzVar6.pQ.get(), (uak) efzVar6.pV.get());
            case 1209:
                efz efzVar7 = this.a;
                return new uaq((twn) efzVar7.pO.get(), (uak) efzVar7.pV.get());
            case 1210:
                efz efzVar8 = this.a;
                twn twnVar = (twn) efzVar8.pO.get();
                uaa uaaVar = (uaa) efzVar8.pQ.get();
                uaj uajVar = (uaj) efzVar8.qe.get();
                uak uakVar = (uak) efzVar8.pV.get();
                return new uar(twnVar, uaaVar, uajVar, uakVar, (tzh) efzVar8.qo.get());
            case 1211:
                return this.a.aJ();
            case 1212:
                return new pse();
            case 1213:
                return this.a.aH();
            case 1214:
                return new tyo();
            case 1215:
                return this.a.hP();
            case 1216:
                return this.a.hD();
            case 1217:
                return this.a.hA();
            case 1218:
                return this.a.hC();
            case 1219:
                efz efzVar9 = this.a;
                return new ubz(efzVar9.b.a, ammv.j((udb) efzVar9.qs.get()), (ubp) efzVar9.qz.get(), (txq) efzVar9.qA.get(), (ubo) efzVar9.qb.get(), (ubw) efzVar9.qw.get(), (tzh) efzVar9.qo.get(), (twn) efzVar9.pO.get(), amrz.k(1, (ucq) efzVar9.qB.get()), efzVar9.ax());
            case 1220:
                return new afyn(Optional.of(this.a.cl()), afhy.m(), null, null, null, null);
            case 1221:
                return new uby((ubt) this.a.qy.get());
            case 1222:
                efz efzVar10 = this.a;
                return new ubt(efzVar10.b.a, (twn) efzVar10.pO.get(), (tzl) efzVar10.qt.get(), (ubw) efzVar10.qw.get(), axqq.a(efzVar10.qx), (ubo) efzVar10.qb.get(), (tzh) efzVar10.qo.get());
            case 1223:
                return this.a.aK();
            case 1224:
                efz efzVar11 = this.a;
                return new ubw(efzVar11.b.a, (twn) efzVar11.pO.get(), ammv.j((uda) efzVar11.qv.get()));
            case 1225:
                return new afyk(this.a.qu);
            case 1226:
                return this.a.f();
            case 1227:
                return this.a.aL();
            case 1228:
                return this.a.jB();
            case 1229:
                return this.a.aD();
            case 1230:
                return this.a.aR();
            case 1231:
                return ammv.j((axze) this.a.qD.get());
            case 1232:
                return new axze((aaea) this.a.K.get());
            case 1233:
                efz efzVar12 = this.a;
                final ucb ucbVar = (ucb) efzVar12.qE.get();
                final shf ax = efzVar12.ax();
                return new ucb(new uca() { // from class: txh
                    @Override // defpackage.uca
                    public final Object a(String str) {
                        ucb ucbVar2 = ucb.this;
                        return new txn((ChimePerAccountRoomDatabase) ucbVar2.a(str), ax);
                    }
                });
            case 1234:
                final Context context = this.a.b.a;
                return new ucb(new uca() { // from class: txi
                    @Override // defpackage.uca
                    public final Object a(String str) {
                        Context context2 = context;
                        if (true == TextUtils.isEmpty(str)) {
                            str = "pseudonymous";
                        }
                        return (ChimePerAccountRoomDatabase) jq.f(context2, ChimePerAccountRoomDatabase.class, String.valueOf(str).concat("_room_notifications.db")).a();
                    }
                });
            case 1235:
                return new ReentrantLock();
            case 1236:
                efz efzVar13 = this.a;
                return new tzx((txa) efzVar13.pT.get(), (twx) efzVar13.pN.get(), (tzu) efzVar13.qH.get(), (uds) efzVar13.pS.get(), efzVar13.ax());
            case 1237:
                return this.a.aP();
            case 1238:
                efz efzVar14 = this.a;
                return amrz.l(1, (ubq) efzVar14.qK.get(), 2, new ubx((ubr) efzVar14.qC.get(), ammv.j((udb) efzVar14.qs.get()), (tzh) efzVar14.qo.get()));
            case 1239:
                return this.a.aQ();
            case 1240:
                return this.a.aC();
            case 1241:
                efz efzVar15 = this.a;
                return new ubj((tzt) efzVar15.qL.get(), (twx) efzVar15.pN.get(), (tzh) efzVar15.qo.get(), efzVar15.ax());
            case 1242:
                return this.a.hy();
            case 1243:
                efz efzVar16 = this.a;
                return new udj((twx) efzVar16.pN.get(), (ucj) efzVar16.pX.get(), efzVar16.ax(), ammv.j((afyo) efzVar16.qN.get()), (ubh) efzVar16.qJ.get());
            case 1244:
                return new afyo((acpz) this.a.gV.get());
            case 1245:
                efz efzVar17 = this.a;
                return new udi((twx) efzVar17.pN.get(), ammv.j((afyo) efzVar17.qN.get()));
            case 1246:
                efz efzVar18 = this.a;
                ubb ubbVar = new ubb((uah) efzVar18.qr.get(), (txo) efzVar18.qM.get());
                ubbVar.a = efzVar18.ip();
                return ubbVar;
            case 1247:
                efz efzVar19 = this.a;
                ubc ubcVar = new ubc((uah) efzVar19.qr.get());
                ubcVar.a = efzVar19.ip();
                return ubcVar;
            case 1248:
                efz efzVar20 = this.a;
                ubf ubfVar = new ubf((uah) efzVar20.qr.get());
                ubfVar.a = efzVar20.ip();
                return ubfVar;
            case 1249:
                return this.a.aM();
            case 1250:
                return this.a.aN();
            case 1251:
                return this.a.aO();
            case 1252:
                efz efzVar21 = this.a;
                ube ubeVar = new ube((uah) efzVar21.qr.get(), (txa) efzVar21.pT.get());
                ubeVar.a = efzVar21.ip();
                return ubeVar;
            case 1253:
                efz efzVar22 = this.a;
                uco ucoVar = new uco();
                ucoVar.a = efzVar22.b.a;
                return ucoVar;
            case 1254:
                efz efzVar23 = this.a;
                return new udk((uat) efzVar23.qI.get(), (twx) efzVar23.pN.get(), (tze) efzVar23.pR.get(), ammv.j((afyo) efzVar23.qN.get()));
            case 1255:
                return this.a.aI();
            case 1256:
                apwy b = ((aadw) this.a.D.get()).b();
                atej atejVar = b.k;
                if (atejVar == null) {
                    atejVar = atej.a;
                }
                apdm apdmVar = atejVar.p;
                if (apdmVar == null) {
                    apdmVar = apdm.a;
                }
                apdx a = yny.a(b);
                if (a.g.size() > 0) {
                    uriArr = new Uri[a.g.size()];
                    for (int i3 = 0; i3 < a.g.size(); i3++) {
                        uriArr[i3] = Uri.parse((String) a.g.get(i3));
                    }
                }
                if (uriArr == null) {
                    return yrx.a;
                }
                boolean z = apdmVar.f;
                return new yrx(uriArr);
            case 1257:
                return new lhe(axqq.a(this.a.rd));
            case 1258:
                akdp J2 = enq.J(this.a.mn);
                ayaw.k(J2);
                return J2;
            case 1259:
                efz efzVar24 = this.a;
                final lhc lhcVar = new lhc(efzVar24.rd, (akdn) efzVar24.ml.get());
                ((aaea) efzVar24.K.get()).a.Y(khe.l).B().ab((ayqi) efzVar24.aq.get()).ay(new ayrs() { // from class: lhb
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        boolean z2;
                        lhc lhcVar2 = lhc.this;
                        aunv aunvVar = (aunv) obj;
                        boolean z3 = lhcVar2.b;
                        boolean z4 = aunvVar.c;
                        boolean z5 = true;
                        if (z3 != z4) {
                            lhcVar2.b = z4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z6 = lhcVar2.c;
                        boolean z7 = aunvVar.e;
                        if (z6 != z7) {
                            lhcVar2.c = z7;
                            z2 = true;
                        }
                        String str = (String) lhcVar2.e.e().e("");
                        if (!lhcVar2.d.equals(aunvVar.d) && awxs.b(aunvVar.d, str)) {
                            lhcVar2.d = aunvVar.d;
                            if ((!lhcVar2.b || lhcVar2.c) && z5 && !aunvVar.d.isEmpty()) {
                                ((akdp) lhcVar2.a.get()).a();
                            }
                            return;
                        }
                        z5 = z2;
                        if (lhcVar2.b) {
                        }
                        ((akdp) lhcVar2.a.get()).a();
                    }
                }, ktf.f);
                return lhcVar;
            case 1260:
                efz efzVar25 = this.a;
                return new fup((aadw) efzVar25.D.get(), (fuj) efzVar25.ri.get());
            case 1261:
                efz efzVar26 = this.a;
                aadw aadwVar = (aadw) efzVar26.D.get();
                return enq.G(aadwVar, (fuo) efzVar26.rh.get());
            case 1262:
                efz efzVar27 = this.a;
                return new fhe();
            case 1263:
                efz efzVar28 = this.a;
                return new fuo(efzVar28.rg, (shf) efzVar28.g.get());
            case 1264:
                efz efzVar29 = this.a;
                Context context2 = efzVar29.b.a;
                anib anibVar = (anib) efzVar29.f.get();
                vfg vfgVar = (vfg) efzVar29.p.get();
                String[] strArr = fuh.a;
                vda a2 = vdb.a(context2);
                a2.e("restorecontext");
                a2.f("restore_context.pb");
                Uri a3 = a2.a();
                vfe a4 = vff.a();
                a4.e(fuk.a);
                a4.f(a3);
                vfk d = vfn.d(context2, anibVar);
                d.c = efz.jZ();
                d.b();
                d.d(fuh.a);
                d.e(fkm.d);
                a4.b(d.a());
                return new ywp(agcm.e(vfgVar.a(a4.a())), fuk.a);
            case 1265:
                return yxi.a(axqq.a(this.a.rk));
            case 1266:
                return this.a.is();
            case 1267:
                return this.a.ka();
            case 1268:
                return this.a.kb();
            case 1269:
                return this.a.cd();
            case 1270:
                return new akqh(axqq.a(this.a.ro));
            case 1271:
                azrw azrwVar = this.a.rn;
                int i4 = unf.b;
                ung ungVar = (ung) azrwVar.get();
                ayaw.k(ungVar);
                unf unfVar = new unf(ungVar);
                unf.b(new unc(unfVar));
                return unfVar;
            case 1272:
                efz efzVar30 = this.a;
                Context context3 = efzVar30.b.a;
                unq unqVar = (unq) efzVar30.bx.get();
                azrw azrwVar2 = efzVar30.cn;
                azrw azrwVar3 = efzVar30.bQ;
                azrw azrwVar4 = efzVar30.ck;
                return new unh(unqVar, azrwVar2, azrwVar3, azrwVar4, azrwVar4, efzVar30.bV, (ammr) efzVar30.bB.get(), null, null, null);
            case 1273:
                return this.a.aW();
            case 1274:
                return new ure();
            case 1275:
                return this.a.hK();
            case 1276:
                urh urhVar = new urh();
                urhVar.c = 1;
                urhVar.a = Long.valueOf(TimeUnit.MINUTES.toMillis(5L) + TimeUnit.SECONDS.toMillis(20L));
                urhVar.c = 2;
                if (urhVar.b == null) {
                    urhVar.b = amvs.a;
                }
                int i5 = urhVar.c;
                if (i5 != 0 && (l = urhVar.a) != null) {
                    return new uri(i5, l.longValue(), urhVar.b);
                }
                StringBuilder sb = new StringBuilder();
                if (urhVar.c == 0) {
                    sb.append(" enablement");
                }
                if (urhVar.a == null) {
                    sb.append(" debugMemoryServiceThrottleMs");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            case 1277:
                efz efzVar31 = this.a;
                ammv.j(efzVar31.bW);
                uou uouVar = uou.q() ? (uou) efzVar31.bZ.get() : new uou(null);
                ayaw.k(uouVar);
                return uouVar;
            case 1278:
                efz efzVar32 = this.a;
                ammv.j(efzVar32.ca);
                utm utmVar = (utm) efzVar32.cg.get();
                ayaw.k(utmVar);
                return utmVar;
            case 1279:
                return new uqq(null);
            case 1280:
                return this.a.bc();
            case 1281:
                return this.a.hZ();
            case 1282:
                return new akwg();
            case 1283:
                efz efzVar33 = this.a;
                return new enl(efzVar33.rr, (aadw) efzVar33.D.get(), efzVar33.aw, (Executor) efzVar33.f.get(), efzVar33.ct);
            case 1284:
                efz efzVar34 = this.a;
                return new qyk(efzVar34.b.a, (Executor) efzVar34.f.get());
            case 1285:
                efz efzVar35 = this.a;
                aaqg aaqgVar = new aaqg((ScheduledExecutorService) efzVar35.f.get(), (aaqd) efzVar35.rt.get(), efzVar35.ch(), (axzg) efzVar35.ap.get(), (axzg) efzVar35.fR.get(), (aftq) efzVar35.ee.get(), null, null, null);
                aaqgVar.a.a = aaqgVar;
                return aaqgVar;
            case 1286:
                return new aaqd();
            case 1287:
                efz efzVar36 = this.a;
                return new aiaw((aiaf) efzVar36.fW.get(), (aaqd) efzVar36.rt.get(), efzVar36.es());
            case 1288:
                return new abfg((abey) this.a.rv.get());
            case 1289:
                return this.a.cJ();
            case 1290:
                return new abfa((aaqg) this.a.ru.get());
            case 1291:
                return new abff();
            case 1292:
                efz efzVar37 = this.a;
                ehq ehqVar = new ehq();
                ehqVar.a = (ScheduledExecutorService) efzVar37.f.get();
                ehqVar.b = (ayqi) efzVar37.aq.get();
                ehqVar.c = (SharedPreferences) efzVar37.z.get();
                ehqVar.bv = (aadw) efzVar37.D.get();
                ehqVar.d = (eni) efzVar37.cL.get();
                ehqVar.e = (shf) efzVar37.g.get();
                ehqVar.f = efzVar37.e();
                ehqVar.g = (yxx) efzVar37.k.get();
                ehqVar.h = (aabt) efzVar37.C.get();
                ehqVar.i = (anhy) efzVar37.nR.get();
                ehqVar.j = efzVar37.nc;
                ehqVar.k = efzVar37.nP;
                ehqVar.l = efzVar37.mW;
                ehqVar.m = efzVar37.fP;
                ehqVar.n = efzVar37.ee;
                ehqVar.o = efzVar37.dU;
                ehqVar.p = efzVar37.rx;
                ehqVar.q = efzVar37.hC;
                ehqVar.r = efzVar37.to;
                ehqVar.s = efzVar37.y;
                ehqVar.t = efzVar37.bb;
                ehqVar.u = efzVar37.bc;
                ehqVar.v = efzVar37.bd;
                ehqVar.w = efzVar37.be;
                ehqVar.x = efzVar37.bf;
                ehqVar.y = efzVar37.bg;
                ehqVar.z = efzVar37.B;
                ehqVar.A = efzVar37.nT;
                ehqVar.B = efzVar37.nV;
                ehqVar.C = efzVar37.lF;
                ehqVar.D = efzVar37.nW;
                ehqVar.E = efzVar37.nX;
                ehqVar.F = efzVar37.ks;
                ehqVar.G = efzVar37.oa;
                ehqVar.H = efzVar37.oc;
                ehqVar.I = efzVar37.jn;
                ehqVar.f211J = efzVar37.og;
                ehqVar.K = efzVar37.mR;
                ehqVar.L = efzVar37.oj;
                ehqVar.M = efzVar37.jO;
                ehqVar.N = efzVar37.mw;
                ehqVar.O = efzVar37.oO;
                ehqVar.P = efzVar37.nA;
                ehqVar.Q = efzVar37.ku;
                ehqVar.R = efzVar37.oR;
                ehqVar.S = efzVar37.gs;
                ehqVar.T = efzVar37.on;
                ehqVar.U = efzVar37.lH;
                ehqVar.V = efzVar37.nb;
                ehqVar.W = efzVar37.oS;
                ehqVar.X = efzVar37.oT;
                ehqVar.Y = efzVar37.oU;
                ehqVar.Z = efzVar37.pb;
                ehqVar.aa = efzVar37.pc;
                ehqVar.ab = efzVar37.pp;
                ehqVar.ac = efzVar37.pD;
                ehqVar.ad = efzVar37.pF;
                ehqVar.ae = efzVar37.pE;
                ehqVar.af = efzVar37.ka;
                ehqVar.ag = efzVar37.eO;
                ehqVar.ah = efzVar37.ba;
                ehqVar.ai = efzVar37.lt;
                ehqVar.aj = efzVar37.eE;
                ehqVar.ak = efzVar37.pr;
                ehqVar.al = efzVar37.lD;
                ehqVar.am = efzVar37.ps;
                ehqVar.an = efzVar37.nd;
                ehqVar.ao = efzVar37.pw;
                ehqVar.ap = efzVar37.ai;
                ehqVar.aq = efzVar37.as;
                ehqVar.ar = efzVar37.gF;
                ehqVar.as = efzVar37.ne;
                ehqVar.at = efzVar37.ct;
                ehqVar.au = efzVar37.cw;
                ehqVar.av = efzVar37.pH;
                ehqVar.aw = efzVar37.hX;
                ehqVar.ax = efzVar37.aw;
                ehqVar.ay = efzVar37.od;
                ehqVar.az = efzVar37.oe;
                ehqVar.aA = efzVar37.pJ;
                ehqVar.aB = efzVar37.pK;
                ehqVar.aC = efzVar37.pM;
                ehqVar.aD = efzVar37.rb;
                ehqVar.aE = efzVar37.lm;
                ehqVar.aF = efzVar37.rp;
                ehqVar.aG = efzVar37.rq;
                ehqVar.aH = efzVar37.mX;
                ehqVar.aI = efzVar37.jl;
                ehqVar.aJ = efzVar37.aZ;
                ehqVar.aK = efzVar37.dd;
                ehqVar.aL = efzVar37.cS;
                ehqVar.aM = efzVar37.mY;
                ehqVar.aN = efzVar37.rm;
                ehqVar.aO = efzVar37.ia;
                ehqVar.aP = efzVar37.rs;
                ehqVar.aQ = efzVar37.rc;
                ehqVar.aR = efzVar37.cN;
                ehqVar.aS = efzVar37.ls;
                ehqVar.aT = efzVar37.pG;
                ehqVar.aU = efzVar37.fX;
                ehqVar.aV = efzVar37.rl;
                ehqVar.aW = efzVar37.i;
                ehqVar.aX = efzVar37.eZ;
                ehqVar.aY = efzVar37.nS;
                ehqVar.aZ = efzVar37.kr;
                ehqVar.ba = efzVar37.lC;
                ehqVar.bb = efzVar37.oJ;
                ehqVar.bc = efzVar37.oK;
                ehqVar.bd = efzVar37.re;
                ehqVar.be = efzVar37.rj;
                ehqVar.bf = axqq.a(efzVar37.nU);
                ehqVar.bg = axqq.a(efzVar37.hk);
                ehqVar.bh = axqq.a(efzVar37.nY);
                ehqVar.bi = axqq.a(efzVar37.nZ);
                ehqVar.bj = axqq.a(efzVar37.of);
                ehqVar.bk = axqq.a(efzVar37.fA);
                ehqVar.bl = axqq.a(efzVar37.oo);
                ehqVar.bm = axqq.a(efzVar37.op);
                ehqVar.bn = axqq.a(efzVar37.nh);
                ehqVar.bo = axqq.a(efzVar37.pq);
                ehqVar.bp = axqq.a(efzVar37.dr);
                axqq.a(efzVar37.p);
                ehqVar.bq = axqq.a(efzVar37.fN);
                ehqVar.br = efzVar37.ru;
                return ehqVar;
            case 1293:
                return this.a.fP();
            case 1294:
                return new ajoy(this.a.fB, (short[]) null, (byte[]) null);
            case 1295:
                efz efzVar38 = this.a;
                return new wwn(efzVar38.uf, amsx.s((wxb) efzVar38.rC.get(), (wxb) efzVar38.ug.get()), efzVar38.sg, (CopyOnWriteArrayList) efzVar38.tk.get());
            case 1296:
                efz efzVar39 = this.a;
                return new ejy(efzVar39.uc, efzVar39.ts, efzVar39.ue, efzVar39.tT, efzVar39.rM);
            case 1297:
                return this.a.bl();
            case 1298:
                return this.a.bm();
            case 1299:
                return szr.s();
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object j() {
        int i = this.b;
        switch (i) {
            case 1700:
                return this.a.a.ah();
            case 1701:
                efc efcVar = this.a.a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) efcVar.dm.c.f.get();
                aahv aahvVar = (aahv) efcVar.dm.c.dB.get();
                efz efzVar = efcVar.dm.c;
                final agto agtoVar = new agto(scheduledExecutorService, aahvVar, efzVar.gU, efcVar.y, efzVar.gH);
                agtoVar.b.c().g(avzf.class).ab(azre.b(agtoVar.a)).ax(new ayrs() { // from class: agtk
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        agto agtoVar2 = agto.this;
                        avzf avzfVar = (avzf) ((aakz) obj).c;
                        if (avzfVar != null) {
                            String videoId = avzfVar.getVideoId();
                            long longValue = avzfVar.getLastPlaybackPositionSeconds().longValue();
                            agsw m = ((agof) agtoVar2.e.get()).a().m();
                            agnv e = m.e(videoId);
                            if (e == null || e.h == longValue) {
                                return;
                            }
                            m.D(videoId, longValue);
                        }
                    }
                });
                return agtoVar;
            case 1702:
                efc efcVar2 = this.a.a;
                aarm aarmVar = (aarm) efcVar2.dm.c.er.get();
                ajoy ajoyVar = (ajoy) efcVar2.dm.c.eV.get();
                afsy afsyVar = (afsy) efcVar2.dm.c.au.get();
                ysl yslVar = (ysl) efcVar2.dm.c.fO.get();
                return new aaxn(aarmVar, ajoyVar, afsyVar, yslVar, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
            case 1703:
                return new amce();
            case 1704:
                efz efzVar2 = this.a;
                aadw aadwVar = (aadw) efzVar2.D.get();
                return new axzf(aadwVar);
            case 1705:
                return this.a.a.ak();
            case 1706:
                efc efcVar3 = this.a.a;
                return new aaxn((aarm) efcVar3.dm.c.er.get(), (ajoy) efcVar3.dm.c.eV.get(), (afsy) efcVar3.dm.c.au.get(), (ysl) efcVar3.dm.c.fN.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1707:
                efc efcVar4 = this.a.a;
                efz efzVar3 = efcVar4.dm.c;
                return new jvr(efzVar3.gG, efzVar3.gH, efcVar4.D, (Handler) efzVar3.an.get());
            case 1708:
                efc efcVar5 = this.a.a;
                return new jvo((jvl) efcVar5.dm.c.yd.get(), (Handler) efcVar5.dm.c.an.get());
            case 1709:
                efz efzVar4 = this.a;
                return new jvl((agzz) efzVar4.gG.get(), efzVar4.gH, efzVar4.kU, efzVar4.gI, efzVar4.hB, (shf) efzVar4.g.get(), (ExecutorService) efzVar4.f.get());
            case 1710:
                efc efcVar6 = this.a.a;
                return enq.x((aadw) efcVar6.dm.c.D.get(), (abaz) efcVar6.dm.c.mb.get());
            case 1711:
                return this.a.a.W();
            case 1712:
                efc efcVar7 = this.a.a;
                return new ahzs(axqq.a(efcVar7.dm.c.hW), axqq.a(efcVar7.dm.c.ye), 1, null);
            case 1713:
                return this.a.U();
            case 1714:
                return new fat(this.a.a.dm.c.kr);
            case 1715:
                efc efcVar8 = this.a.a;
                return new lgs((aarr) efcVar8.dm.c.hV.get(), (Executor) efcVar8.dm.c.f.get(), (Handler) efcVar8.dm.c.an.get());
            case 1716:
                return new eys();
            case 1717:
                return new akmq();
            case 1718:
                return this.a.a.L();
            case 1719:
                return new tfq(null, null);
            case 1720:
                return new yaq(null);
            case 1721:
                return new yap();
            case 1722:
                return ((azqw) this.a.yb.get()).y();
            case 1723:
                return this.a.a.ae();
            case 1724:
                return this.a.a.V();
            case 1725:
                efz efzVar5 = this.a;
                return new abal((ajoy) efzVar5.eV.get(), efzVar5.bI(), (afsy) efzVar5.au.get(), (aadw) efzVar5.D.get(), (aarm) efzVar5.er.get(), null, null, null);
            case 1726:
                return Build.VERSION.SDK_INT < 23 ? new wfw() : new wgb(this.a.a.dm.c.b.a);
            case 1727:
                return this.a.a.U();
            case 1728:
                efc efcVar9 = this.a.a;
                return new hrv((aaea) efcVar9.dm.c.K.get(), (axze) efcVar9.dm.c.my.get(), (axzg) efcVar9.dm.c.ap.get(), (axzg) efcVar9.dm.c.wC.get(), null, null, null, null, null);
            case CardboardDevice$DeviceParams.INTERNAL_FIELD_NUMBER /* 1729 */:
                return this.a.a.ai();
            case 1730:
                return new xuv((Executor) this.a.a.dm.c.i.get());
            case 1731:
                efc efcVar10 = this.a.a;
                Object akqrVar = efcVar10.dm.c.gw().f() == 2 ? (akqw) efcVar10.V.get() : new akqr();
                ayaw.k(akqrVar);
                return akqrVar;
            case 1732:
                efc efcVar11 = this.a.a;
                return new akqq(efcVar11.dm.c.gw(), (anic) efcVar11.dm.c.f.get());
            case 1733:
                return new amsj((char[]) null, (byte[]) null, (byte[]) null);
            case 1734:
                return new ajun((byte[]) null, (char[]) null);
            case 1735:
                efc efcVar12 = this.a.a;
                return new abde((aarm) efcVar12.dm.c.er.get(), (ajoy) efcVar12.dm.c.eV.get(), (afsy) efcVar12.dm.c.au.get(), (ysl) efcVar12.dm.c.fO.get(), null, null, null);
            case 1736:
                return new adyu();
            case 1737:
                efc efcVar13 = this.a.a;
                aarm aarmVar2 = (aarm) efcVar13.dm.c.er.get();
                ajoy ajoyVar2 = (ajoy) efcVar13.dm.c.eV.get();
                return new aasw(aarmVar2, ajoyVar2, (ysl) efcVar13.dm.c.fO.get(), null, null, null);
            case 1738:
                return this.a.a.ab();
            case 1739:
                return this.a.a.Z();
            case 1740:
                return this.a.a.an();
            case 1741:
                return this.a.a.Y();
            case 1742:
                return this.a.a.aq();
            case 1743:
                efc efcVar14 = this.a.a;
                return new aaxn((aarm) efcVar14.dm.c.er.get(), (ajoy) efcVar14.dm.c.eV.get(), (afsy) efcVar14.dm.c.au.get(), (ysl) efcVar14.dm.c.fO.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
            case 1744:
                return this.a.a.ao();
            case 1745:
                return this.a.a.al();
            case 1746:
                efc efcVar15 = this.a.a;
                return new abdl((aarm) efcVar15.dm.c.er.get(), (ajoy) efcVar15.dm.c.eV.get(), (afsy) efcVar15.dm.c.au.get(), (ysl) efcVar15.dm.c.fO.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1747:
                efc efcVar16 = this.a.a;
                return new abdl((aarm) efcVar16.dm.c.er.get(), (ajoy) efcVar16.dm.c.eV.get(), (afsy) efcVar16.dm.c.au.get(), (ysl) efcVar16.dm.c.fO.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1748:
                efc efcVar17 = this.a.a;
                efz efzVar6 = efcVar17.dm.c;
                Context context = efzVar6.b.a;
                azrw azrwVar = efzVar6.z;
                vfg vfgVar = (vfg) efzVar6.p.get();
                anib anibVar = (anib) efcVar17.dm.c.f.get();
                vda a = vdb.a(context);
                a.e("effectvisit");
                a.f("effectvisit.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.f(a2);
                a3.e(awuq.a);
                ywu d = ywv.d(azrwVar, anibVar);
                d.a = wgw.d;
                d.b(yml.l);
                d.b = yml.k;
                d.c = lyk.p;
                a3.b(d.a());
                return vfgVar.a(a3.a());
            case 1749:
                return this.a.a.F();
            case 1750:
                return this.a.a.aa();
            case 1751:
                efc efcVar18 = this.a.a;
                return new akpe((aarm) efcVar18.dm.c.er.get(), (ajoy) efcVar18.dm.c.eV.get(), (afsy) efcVar18.dm.c.au.get(), (ysl) efcVar18.dm.c.fO.get(), (Executor) efcVar18.dm.c.i.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1752:
                efz efzVar7 = this.a;
                return new axze((aaea) efzVar7.K.get());
            case 1753:
                return this.a.a.z();
            case 1754:
                efc efcVar19 = this.a.a;
                aarm aarmVar3 = (aarm) efcVar19.dm.c.er.get();
                ajoy ajoyVar3 = (ajoy) efcVar19.dm.c.eV.get();
                return aash.F(aarmVar3, ajoyVar3, (ysl) efcVar19.dm.c.fO.get());
            case 1755:
                efc efcVar20 = this.a.a;
                efz efzVar8 = efcVar20.dm.c;
                Context context2 = efzVar8.b.a;
                anib anibVar2 = (anib) efzVar8.f.get();
                efz efzVar9 = efcVar20.dm.c;
                azrw azrwVar2 = efzVar9.z;
                vfg vfgVar2 = (vfg) efzVar9.p.get();
                vda a4 = vdb.a(context2);
                a4.e("videoeffects");
                a4.f("videoeffects.pb");
                Uri a5 = a4.a();
                vfk d2 = vfn.d(context2, anibVar2);
                d2.d("TEXT_COLOR", "BACKGROUND_COLOR", "ALIGNMENT", "FONT_FAMILY");
                d2.b();
                String jZ = efz.jZ();
                d2.c = jZ;
                d2.e(fkm.e);
                vfn a6 = d2.a();
                vfk d3 = vfn.d(context2, anibVar2);
                d3.d("MOST_RECENT_PRESET_EFFECT_ID");
                d3.b();
                d3.c = jZ;
                d3.e(fkm.f);
                vfn a7 = d3.a();
                vfk d4 = vfn.d(context2, anibVar2);
                d4.d("recent_stickers");
                d4.b();
                d4.c = jZ;
                d4.e(fkm.g);
                vfn a8 = d4.a();
                vfk d5 = vfn.d(context2, anibVar2);
                d5.d("REEL_WELCOME_V2_ALREADY_SEEN");
                d5.b();
                d5.c = jZ;
                d5.e(fkm.h);
                vfn a9 = d5.a();
                ywu d6 = ywv.d(azrwVar2, anibVar2);
                d6.a = eri.u;
                d6.b(icu.d);
                d6.b = icu.c;
                d6.c = fkp.k;
                ywv a10 = d6.a();
                vfe a11 = vff.a();
                a11.e(idr.a);
                a11.b(a6);
                a11.b(a7);
                a11.b(a8);
                a11.b(a9);
                a11.b(a10);
                a11.f(a5);
                return vfgVar2.a(a11.a());
            case 1756:
                return new yjj();
            case 1757:
                return new yjj();
            case 1758:
                return this.a.a.B();
            case 1759:
                return new amsj((byte[]) null, (char[]) null, (byte[]) null);
            case 1760:
                return new aoae((byte[]) null, (byte[]) null, (byte[]) null);
            case 1761:
                return new yjj();
            case 1762:
                efc efcVar21 = this.a.a;
                return new aaxn((aarm) efcVar21.dm.c.er.get(), (ajoy) efcVar21.dm.c.eV.get(), (afsy) efcVar21.dm.c.au.get(), (ysl) efcVar21.dm.c.fO.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
            case 1763:
                return new akmq();
            case 1764:
                return ammv.j(this.a.az());
            case 1765:
                return new ajfd((yzm) this.a.a.dm.c.wT.get());
            case 1766:
                efc efcVar22 = this.a.a;
                return new aayb((aarm) efcVar22.dm.c.er.get(), (ajoy) efcVar22.dm.c.eV.get(), (ysl) efcVar22.dm.c.fN.get(), null, null, null);
            case 1767:
                return this.a.a.J();
            case 1768:
                return this.a.a.n();
            case 1769:
                Context context3 = this.a.a.dm.c.b.a;
                int i2 = ajgj.a;
                return false;
            case 1770:
                return ajgj.q((aadw) this.a.a.dm.c.D.get());
            case 1771:
                return ajgj.f((aaea) this.a.K.get());
            case 1772:
                return this.a.az();
            case 1773:
                efz efzVar10 = this.a;
                sxd sxdVar = (sxd) efzVar10.nx.get();
                Context context4 = efzVar10.b.a;
                return ajgj.u(sxdVar, context4, efzVar10.id());
            case 1774:
                efz efzVar11 = this.a;
                Context context5 = efzVar11.b.a;
                int i3 = ajgj.a;
                return false;
            case 1775:
                return ajgj.x(axqq.a(this.a.ek));
            case 1776:
                efz efzVar12 = this.a;
                Context context6 = efzVar12.b.a;
                return xuw.d((aadw) efzVar12.D.get()) ? new ffv(context6) : new ajjj(context6);
            case 1777:
                efz efzVar13 = this.a;
                return new akpe((aarm) efzVar13.er.get(), (ajoy) efzVar13.eV.get(), (afsy) efzVar13.au.get(), (ysl) efzVar13.fO.get(), (Executor) efzVar13.i.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1778:
                efz efzVar14 = this.a;
                aadw aadwVar2 = (aadw) efzVar14.D.get();
                return new axzf(aadwVar2);
            case 1779:
                return new wpe((wtu) this.a.rJ.get());
            case 1780:
                ajjz ajjzVar = (ajjz) this.a.kp.get();
                amrw h = amrz.h();
                h.g(zzz.SIMPLE_CARD, new aaak(ajjzVar));
                h.g(zzz.VIDEO_CARD, new aaad(ajjzVar, 2, (char[]) null));
                h.g(zzz.PLAYLIST_CARD, new aaad(ajjzVar, 0));
                h.g(zzz.COLLABORATOR_CARD, new aaad(ajjzVar, 1, (byte[]) null));
                h.g(zzz.SHOPPING_CARD, new aaah(ajjzVar));
                return new aabo(new EnumMap(h.c()));
            case 1781:
                efc efcVar23 = this.a.a;
                return new axze((aaea) efcVar23.dm.c.K.get());
            case 1782:
                efc efcVar24 = this.a.a;
                wiz wizVar = (wiz) efcVar24.dm.c.mr.get();
                wdd wddVar = (wdd) efcVar24.dm.c.au.get();
                wkk wkkVar = (wkk) efcVar24.dm.c.da.get();
                aatg aatgVar = (aatg) efcVar24.dm.c.mq.get();
                return new wjk(wizVar, wddVar, wkkVar, aatgVar, (ypa) efcVar24.dm.c.B.get());
            case 1783:
                return new wbs();
            case 1784:
                return this.a.a.x();
            case 1785:
                efc efcVar25 = this.a.a;
                return new isn((ghl) efcVar25.aJ.get(), (ayqi) efcVar25.dm.c.im.get(), (aahv) efcVar25.dm.c.dB.get(), (aadw) efcVar25.dm.c.D.get());
            case 1786:
                return this.a.a.b();
            case 1787:
                efc efcVar26 = this.a.a;
                return new isl((ghl) efcVar26.aJ.get(), (ayqi) efcVar26.dm.c.im.get(), (aahv) efcVar26.dm.c.dB.get(), (aadw) efcVar26.dm.c.D.get());
            case 1788:
                return new adyu();
            case 1789:
                efc efcVar27 = this.a.a;
                return new agcm(efcVar27.aN, efcVar27.am(), null, null, null);
            case 1790:
                efc efcVar28 = this.a.a;
                efz efzVar15 = efcVar28.dm.c;
                Context context7 = efzVar15.b.a;
                anib anibVar3 = (anib) efzVar15.f.get();
                vfg vfgVar3 = (vfg) efcVar28.dm.c.p.get();
                vda a12 = vdb.a(context7);
                a12.e("livecreation");
                a12.f("livecreation.pb");
                Uri a13 = a12.a();
                vfk d7 = vfn.d(context7, anibVar3);
                d7.d("SHARED_PREF_STREAM_CONFIG_KEY", "PREF_HAS_SEEN_ORIENTATION_TOOLTIP", "HAS_SEEN_SCREENCAST_TOOLTIP", "IS_FIRST_STREAM", "SHARED_PREF_PORTRAIT_COUNT_KEY", "SHARED_PREF_LS_TIMESTAMP_KEY");
                d7.b();
                d7.c = efz.jZ();
                d7.e(fkm.r);
                vfn a14 = d7.a();
                vfe a15 = vff.a();
                a15.e(aosc.a);
                a15.f(a13);
                a15.b(a14);
                return vfgVar3.a(a15.a());
            case 1791:
                return new tgn((aoae) this.a.a.aW.get(), null, null, null);
            case 1792:
                efc efcVar29 = this.a.a;
                amvs amvsVar = amvs.a;
                tgy tgyVar = (tgy) efcVar29.aV.get();
                amyi amyiVar = tik.a;
                amsv i4 = amsx.i();
                i4.j(amvsVar);
                i4.c(tgyVar.d);
                return new aoae((Set) i4.g());
            case 1793:
                return this.a.a.r();
            case 1794:
                return this.a.a.p();
            case 1795:
                efc efcVar30 = this.a.a;
                ths thsVar = new ths((til) efcVar30.aP.get(), (tfu) efcVar30.aQ.get(), new tie((thp) efcVar30.aR.get()));
                til tilVar = (til) efcVar30.aP.get();
                tfu tfuVar = (tfu) efcVar30.aQ.get();
                return amsx.s(thsVar, new thw(tilVar, tfuVar, new tig((thp) efcVar30.aS.get(), (thp) efcVar30.aT.get())));
            case 1796:
                return this.a.a.u();
            case 1797:
                efz efzVar16 = this.a.a.dm.c;
                return new tfu(efzVar16.b.a, (anib) efzVar16.f.get());
            case 1798:
                return this.a.a.t();
            case 1799:
                tib tibVar = tib.c;
                ayaw.k(tibVar);
                return tibVar;
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n() {
        int i = this.b;
        Boolean bool = false;
        switch (i) {
            case 300:
                efz efzVar = this.a;
                return new aaip((aadw) efzVar.D.get(), (acpk) efzVar.ax.get());
            case 301:
                efz efzVar2 = this.a;
                return amsx.u((aajb) efzVar2.dF.get(), (aajb) efzVar2.dG.get(), (aajb) efzVar2.dH.get(), (aajb) efzVar2.dI.get());
            case 302:
                return agkj.c();
            case 303:
                return agkj.a();
            case 304:
                return agkj.d();
            case 305:
                return agkj.b();
            case 306:
                efz efzVar3 = this.a;
                return ytd.m(efzVar3.dy, (aahv) efzVar3.dB.get());
            case 307:
                ajfm ajfmVar = (ajfm) this.a.el.get();
                int i2 = ajgj.a;
                ayaw.k(ajfmVar);
                return ajfmVar;
            case 308:
                efz efzVar4 = this.a;
                return aazr.A(axqq.a(efzVar4.dW), (aaea) efzVar4.K.get(), (syd) efzVar4.dY.get(), (aoae) efzVar4.dX.get(), axqq.a(efzVar4.eo));
            case 309:
                efz efzVar5 = this.a;
                return svf.b(ammv.j((Boolean) efzVar5.dP.get()), ammv.j((Boolean) efzVar5.dQ.get()), efzVar5.ic(), efzVar5.dR, ammv.j((Boolean) efzVar5.dV.get()), ammv.j(Integer.valueOf(efzVar5.b())));
            case 310:
                efz efzVar6 = this.a;
                Context context = efzVar6.b.a;
                int i3 = ajgj.a;
                return bool;
            case 311:
                Context context2 = this.a.b.a;
                return ajje.a;
            case 312:
                return ajix.e((vgz) this.a.dN.get());
            case 313:
                efz efzVar7 = this.a;
                return ahbn.f(efzVar7.b.a, (vfg) efzVar7.p.get());
            case 314:
                efz efzVar8 = this.a;
                Context context3 = efzVar8.b.a;
                int i4 = ajgj.a;
                return bool;
            case 315:
                efz efzVar9 = this.a;
                return shr.d(ammv.j((Boolean) efzVar9.dQ.get()), efzVar9.ic(), efzVar9.dS, efzVar9.b.a);
            case 316:
                efz efzVar10 = this.a;
                return shr.c(ammv.j((Boolean) efzVar10.dQ.get()), efzVar10.b.a, efzVar10.dR, ammv.j(efzVar10.az()));
            case 317:
                return Boolean.valueOf(ajgj.o((ajhe) this.a.dU.get()));
            case 318:
                return ajgj.d((ajgq) this.a.dT.get());
            case 319:
                efz efzVar11 = this.a;
                aadw aadwVar = (aadw) efzVar11.D.get();
                Context context4 = efzVar11.b.a;
                return aizl.h(ajgr.c(aadwVar));
            case 320:
                return ajgj.c(this.a.gj());
            case 321:
                return ajgj.z();
            case 322:
                efz efzVar12 = this.a;
                return ajfu.b((syd) efzVar12.dY.get(), (aaea) efzVar12.K.get(), (aadw) efzVar12.D.get(), axqq.a(efzVar12.ek), efzVar12.b.a, (ResourceLoaderDelegate) efzVar12.em.get(), axqq.a(efzVar12.en), ammv.j((Boolean) efzVar12.dP.get()));
            case 323:
                efz efzVar13 = this.a;
                return snd.b(((Boolean) efzVar13.ec.get()).booleanValue(), (tbt) efzVar13.eg.get(), axqq.a(efzVar13.ei), efzVar13.ej, amrz.m(arbf.class, ajix.c((aadw) efzVar13.D.get()), arbh.class, ajix.a((aaea) efzVar13.K.get()), asuc.class, ajix.d((acpl) efzVar13.aw.get())));
            case 324:
                efz efzVar14 = this.a;
                ajgq ajgqVar = (ajgq) efzVar14.dT.get();
                akto aktoVar = (akto) efzVar14.eb.get();
                Context context5 = efzVar14.b.a;
                return Boolean.valueOf(ahbn.q(ajgqVar, aktoVar));
            case 325:
                efz efzVar15 = this.a;
                return new aktm((ywr) efzVar15.dZ.get(), axqq.a(efzVar15.ea));
            case 326:
                efz efzVar16 = this.a;
                return akbc.y(efzVar16.b.a, (anib) efzVar16.f.get(), efz.jZ(), (vfg) efzVar16.p.get());
            case 327:
                return ytd.g((zfu) this.a.cS.get(), Optional.empty());
            case 328:
                efz efzVar17 = this.a;
                axpg a = axqq.a(efzVar17.ef);
                Context context6 = efzVar17.b.a;
                return aazr.h(a, ((Boolean) efzVar17.ec.get()).booleanValue(), (ajhe) efzVar17.dU.get());
            case 329:
                return new ajdo((acsy) this.a.ee.get());
            case 330:
                efz efzVar18 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) efzVar18.z.get();
                ajkn ajknVar = (ajkn) efzVar18.ed.get();
                shf shfVar = (shf) efzVar18.g.get();
                acpl acplVar = (acpl) efzVar18.aw.get();
                Executor executor = (Executor) efzVar18.f.get();
                Context context7 = efzVar18.b.a;
                return new acsw(sharedPreferences, ajknVar, shfVar, acplVar, executor, null);
            case 331:
                return new ajkn(axqq.a(this.a.ea), (byte[]) null);
            case 332:
                efz efzVar19 = this.a;
                return ajgj.y((aadw) efzVar19.D.get(), (axzf) efzVar19.eh.get());
            case 333:
                efz efzVar20 = this.a;
                aadw aadwVar2 = (aadw) efzVar20.D.get();
                return new axzf(aadwVar2);
            case 334:
                return ots.i();
            case 335:
                efz efzVar21 = this.a;
                return ajgm.c((ajfm) efzVar21.el.get(), (syd) efzVar21.dY.get());
            case 336:
                return ajgj.e();
            case 337:
                return new aaqt((shf) this.a.g.get());
            case 338:
                efz efzVar22 = this.a;
                return aash.D(efzVar22.hZ.get(), efzVar22.ib.get(), efzVar22.ic.get(), (ajbh) efzVar22.id.get());
            case 339:
                efz efzVar23 = this.a;
                return aash.c((SharedPreferences) efzVar23.z.get(), efzVar23.hY, efzVar23.ax, (Executor) efzVar23.f.get());
            case 340:
                efz efzVar24 = this.a;
                return new aaxw((aarm) efzVar24.er.get(), (ajoy) efzVar24.eV.get(), efzVar24.bI(), efzVar24.cr(), null, null, null);
            case 341:
                return ytb.E(this.a.eU);
            case 342:
                efz efzVar25 = this.a;
                amsv j = amsx.j(11);
                j.c(new afzl((afyt) efzVar25.eu.get(), efzVar25.b.a, (aaea) efzVar25.K.get()));
                j.c((aarz) efzVar25.ey.get());
                j.c((aarz) efzVar25.eB.get());
                Context context8 = efzVar25.b.a;
                j.c(new aaqw());
                j.c(new aari((afsy) efzVar25.au.get()));
                j.c((aarz) efzVar25.eF.get());
                j.c((aarz) efzVar25.eG.get());
                j.c((aarz) efzVar25.eI.get());
                j.j(efzVar25.it());
                j.c((aarz) efzVar25.eP.get());
                j.c((aarz) efzVar25.eT.get());
                return j.g();
            case 343:
                efz efzVar26 = this.a;
                return new fhy((agaf) efzVar26.et.get(), (shf) efzVar26.g.get(), (aaea) efzVar26.K.get());
            case 344:
                efz efzVar27 = this.a;
                return new agab((SharedPreferences) efzVar27.z.get(), (ywr) efzVar27.es.get(), (Executor) efzVar27.i.get());
            case 345:
                efz efzVar28 = this.a;
                Context context9 = efzVar28.b.a;
                azrw azrwVar = efzVar28.p;
                azrw azrwVar2 = efzVar28.z;
                anib anibVar = (anib) efzVar28.f.get();
                vfg vfgVar = (vfg) azrwVar.get();
                vda a2 = vdb.a(context9);
                a2.e("notification");
                a2.f("notification.pb");
                Uri a3 = a2.a();
                ywu d = ywv.d(azrwVar2, anibVar);
                d.a = wgw.k;
                d.b(afyf.d);
                d.b = afyf.c;
                d.c = afrl.c;
                ywv a4 = d.a();
                vfk d2 = vfn.d(context9, anibVar);
                d2.d("DeviceContextCache.KEY_PROTO", "DeviceContextCache.KEY_TIMESTAMP", "gcm_registration_id", "com.google.android.libraries.youtube.notification.pref.last_notification_registration_time", "pending_notification_registration", "com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled", "com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS", "com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled", "device_context_app_last_opened");
                d2.b();
                d2.c = efz.jZ();
                d2.e(adgt.f);
                vfn a5 = d2.a();
                vfe a6 = vff.a();
                a6.e(awwf.a);
                a6.f(a3);
                a6.b(a4);
                a6.b(a5);
                return new ywp(agcm.e(vfgVar.a(a6.a())), awwf.a);
            case 346:
                efz efzVar29 = this.a;
                return new akmy(efzVar29.ev, efzVar29.ex, (aadw) efzVar29.D.get());
            case 347:
                efz efzVar30 = this.a;
                return new amce((aadw) efzVar30.D.get(), efzVar30.b.a, (Executor) efzVar30.f.get(), (ScheduledExecutorService) efzVar30.f.get());
            case 348:
                efz efzVar31 = this.a;
                aypn aypnVar = (aypn) efzVar31.ew.get();
                ysy ysyVar = (ysy) efzVar31.as.get();
                return new aknb(aypnVar, ysyVar, (Executor) efzVar31.aA.get(), (ynx) efzVar31.M.get());
            case 349:
                aypn aypnVar2 = (aypn) ((yvw) this.a.cQ.get()).b.get();
                ayaw.k(aypnVar2);
                return aypnVar2;
            case 350:
                efz efzVar32 = this.a;
                Context context10 = efzVar32.b.a;
                return new iyv((gni) efzVar32.eA.get());
            case 351:
                efz efzVar33 = this.a;
                return new gnl(efzVar33.b.a, (ywr) efzVar33.ez.get());
            case 352:
                efz efzVar34 = this.a;
                return gnm.b(efzVar34.b.a, efzVar34.p, (anib) efzVar34.f.get(), efz.jZ());
            case 353:
                return new zjv((zju) this.a.eE.get());
            case 354:
                efz efzVar35 = this.a;
                return new zjr((ysy) efzVar35.as.get(), (Executor) efzVar35.f.get(), efzVar35.eD, (aaea) efzVar35.K.get(), efzVar35.b.a, new zjo((shf) efzVar35.g.get(), (acpl) efzVar35.aw.get()));
            case 355:
                efz efzVar36 = this.a;
                return new zjt((Executor) efzVar36.f.get(), (rlv) efzVar36.eC.get());
            case 356:
                return new rlq(this.a.b.a, new rlu());
            case 357:
                return aizl.f((ajfm) this.a.el.get());
            case 358:
                return new xli(this.a.eH);
            case 359:
                return new wyz((wza) this.a.cV.get());
            case 360:
                return new aamb((abep) this.a.x.get());
            case 361:
                efz efzVar37 = this.a;
                Context context11 = efzVar37.b.a;
                return aash.b(wmr.c((aaqo) efzVar37.eO.get()));
            case 362:
                efz efzVar38 = this.a;
                return aajo.i(efzVar38.b.a, aaby.c((aabx) efzVar38.bb.get()), amdc.b(efzVar38.b.a), (shf) efzVar38.g.get(), efzVar38.eK, efzVar38.eL, (aaea) efzVar38.K.get(), (aadw) efzVar38.D.get(), ((aabx) efzVar38.bb.get()).e, (ysy) efzVar38.as.get(), (amea) efzVar38.eM.get(), (axzf) efzVar38.eN.get(), (amcc) efzVar38.G.get());
            case 363:
                Context context12 = this.a.b.a;
                qmy qmyVar = qmy.a;
                return Integer.valueOf(qnm.a(context12));
            case 364:
                return new aasd(this.a.b.a);
            case 365:
                efz efzVar39 = this.a;
                azrw azrwVar3 = efzVar39.x;
                return new amea(azrwVar3, amvo.b);
            case 366:
                efz efzVar40 = this.a;
                aadw aadwVar3 = (aadw) efzVar40.D.get();
                return new axzf(aadwVar3);
            case 367:
                return new adak();
            case 368:
                efz efzVar41 = this.a;
                return new aiha((aypn) efzVar41.eR.get(), (aypn) efzVar41.eS.get());
            case 369:
                return ahal.F((ahzx) this.a.eQ.get());
            case 370:
                return ahal.L(new eeo(this.a.c));
            case 371:
                return ahal.H((ahzx) this.a.eQ.get());
            case 372:
                efz efzVar42 = this.a;
                return afqe.c((ysn) efzVar42.fJ.get(), (ysm) efzVar42.fM.get());
            case 373:
                efz efzVar43 = this.a;
                return advr.J(amlr.a, new ajyw(efzVar43.eW, efzVar43.eX, efzVar43.fu, (byte[]) null, (char[]) null, (byte[]) null), (ysn) efzVar43.fI.get());
            case 374:
                return afpv.M(this.a.f);
            case 375:
                return this.a.he();
            case 376:
                efz efzVar44 = this.a;
                afvy afwjVar = new afwj(efzVar44.aA, efzVar44.fs);
                afvy afweVar = new afwe(efzVar44.aA, efzVar44.ft, efzVar44.g);
                aqvj aqvjVar = ((axzf) efzVar44.eN.get()).a.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45358337L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45358337L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45358337L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                }
                if (true != bool.booleanValue()) {
                    afwjVar = afweVar;
                }
                return Optional.of(afwjVar);
            case 377:
                efz efzVar45 = this.a;
                return new afwc((ajoy) efzVar45.fp.get(), (NetworkRetryControllerProdContainerRegistrar) efzVar45.fr.get(), null, null, null);
            case 378:
                return new ajoy(this.a.fo, (short[]) null, (byte[]) null, (byte[]) null);
            case 379:
                efz efzVar46 = this.a;
                return new aagh((aagm) efzVar46.fl.get(), efzVar46.ej);
            case 380:
                efz efzVar47 = this.a;
                return new aagq(efzVar47.cf(), (syq) efzVar47.eo.get(), efzVar47.fm, efzVar47.fn);
            case 381:
                efz efzVar48 = this.a;
                return new axzg((aadw) efzVar48.D.get(), (aaea) efzVar48.K.get());
            case 382:
                efz efzVar49 = this.a;
                return snd.h(efzVar49.b.a, efzVar49.fj, efzVar49.o, efzVar49.fk, (anib) efzVar49.f.get());
            case 383:
                efz efzVar50 = this.a;
                return adwa.b(efzVar50.b.a, (anib) efzVar50.f.get(), (amru) efzVar50.fa.get(), aagd.c(efzVar50.fb, (vgz) efzVar50.fc.get(), efzVar50.ai), (vcw) efzVar50.o.get(), (ttw) efzVar50.fd.get(), ammv.j((ttu) efzVar50.fe.get()), (amnv) efzVar50.fg.get(), amlr.a, amlr.a, ammv.j((aafr) efzVar50.fh.get()), ammv.j((tme) efzVar50.fi.get()), (vfg) efzVar50.p.get(), amlr.a, ammv.j((tko) efzVar50.ff.get()));
            case 384:
                efz efzVar51 = this.a;
                return aaca.g(amsx.r(ytd.i((ynx) efzVar51.M.get(), efzVar51.eZ)));
            case 385:
                return this.a.cf();
            case 386:
                return Boolean.valueOf(this.a.jl());
            case 387:
                efz efzVar52 = this.a;
                return whl.K(efzVar52.b.a, (vfg) efzVar52.p.get());
            case 388:
                return aaca.h(this.a.b.a);
            case 389:
                efz efzVar53 = this.a;
                return ytd.j((shf) efzVar53.g.get(), (anib) efzVar53.f.get());
            case 390:
                efz efzVar54 = this.a;
                return rwh.bk(efzVar54.b.a, (ScheduledExecutorService) efzVar54.ay.get(), (vcw) efzVar54.o.get(), axqq.a(efzVar54.cO), amlr.a, ammv.j((ttu) efzVar54.fe.get()), (tko) efzVar54.ff.get());
            case 391:
                return aaca.H((axzf) this.a.eN.get());
            case 392:
                return aaca.f((acpk) this.a.ax.get());
            case 393:
                efz efzVar55 = this.a;
                return ytd.k(efzVar55.b.a, (tko) efzVar55.ff.get());
            case 394:
                return aaca.E((acpk) this.a.ax.get());
            case 395:
                return xuq.m();
            case 396:
                return new aagk((aagm) this.a.fl.get());
            case 397:
                return new aagr((aagm) this.a.fl.get());
            case 398:
                efz efzVar56 = this.a;
                Context context13 = efzVar56.b.a;
                return new NetworkRetryControllerProdContainerRegistrar(new ylv(new ajoy(efzVar56.fq, (byte[]) null, (char[]) null, (byte[]) null), null, null, null), new ylv(new ajoy(axqv.b(efzVar56.ea), (int[]) null, (byte[]) null), null, null), new yly(new advq(efzVar56.aA, efzVar56.g, (byte[]) null, (char[]) null), null, null), null);
            case 399:
                return ajbp.h();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        int i = this.b;
        switch (i) {
            case 700:
                efz efzVar = this.a;
                return new adcp(efzVar.b.a, (Executor) efzVar.i.get(), (anib) efzVar.f.get(), efzVar.ig(), efzVar.ju, efzVar.ja, efzVar.jy, efzVar.jz, ((SharedPreferences) efzVar.z.get()).getBoolean("EnableMediaRouteDescriptionInDialog", false));
            case 701:
                efz efzVar2 = this.a;
                return new adly(efzVar2.ja, ghe.i(), (shf) efzVar2.g.get());
            case 702:
                efz efzVar3 = this.a;
                return new addc(efzVar3.jc, axqq.a(efzVar3.ja));
            case 703:
                efz efzVar4 = this.a;
                return new adeg(efzVar4.m155if(), efzVar4.jl, efzVar4.dp());
            case 704:
                efz efzVar5 = this.a;
                return new adoz((shf) efzVar5.g.get(), axqq.a(efzVar5.jG), axqq.a(efzVar5.jj), axqq.a(efzVar5.jE), (acun) efzVar5.iu.get());
            case 705:
                return new adov((ywr) this.a.jF.get());
            case 706:
                return this.a.kH().a(aczu.d, abea.s, awvg.a);
            case 707:
                return new adlw((zbw) this.a.av.get(), Executors.newSingleThreadScheduledExecutor(new yna("mdxPresence")));
            case 708:
                return this.a.dq();
            case 709:
                efz efzVar6 = this.a;
                adiz adizVar = (adil) efzVar6.jJ.get();
                adiz adizVar2 = (adjg) efzVar6.jK.get();
                if (true == ((acxi) efzVar6.bg.get()).i) {
                    adizVar = adizVar2;
                }
                ayaw.k(adizVar);
                return adizVar;
            case 710:
                efz efzVar7 = this.a;
                return new adil((ypa) efzVar7.B.get(), (aioc) efzVar7.fY.get(), efzVar7.fX, efzVar7.hP, (adlt) efzVar7.ja.get());
            case 711:
                efz efzVar8 = this.a;
                return new adjg((ypa) efzVar8.B.get(), (aioc) efzVar8.fY.get(), efzVar8.fX, efzVar8.hP, (adlt) efzVar8.ja.get());
            case 712:
                return this.a.cU();
            case 713:
                return this.a.cW();
            case 714:
                efz efzVar9 = this.a;
                return new actu((ypa) efzVar9.B.get(), (afsy) efzVar9.au.get(), efzVar9.jL, efzVar9.jM, efzVar9.jN, efzVar9.as);
            case 715:
                return this.a.ev();
            case 716:
                return this.a.ih();
            case 717:
                return this.a.ib();
            case 718:
                return this.a.cV();
            case 719:
                return this.a.iJ();
            case 720:
                return Boolean.valueOf(enq.w((yxx) this.a.k.get()));
            case 721:
                return new ncf((byte[]) null);
            case 722:
                efz efzVar10 = this.a;
                return new adfp(efzVar10.b.a, efzVar10.ja);
            case 723:
                return this.a.dm();
            case 724:
                efz efzVar11 = this.a;
                adtk adtkVar = (adtk) efzVar11.jQ.get();
                shf shfVar = (shf) efzVar11.g.get();
                SharedPreferences sharedPreferences = (SharedPreferences) efzVar11.z.get();
                return new adtp(adtkVar, shfVar, sharedPreferences);
            case 725:
                efz efzVar12 = this.a;
                return new adtk(efzVar12.jP, (shf) efzVar12.g.get());
            case 726:
                efz efzVar13 = this.a;
                Context context = efzVar13.b.a;
                anib anibVar = (anib) efzVar13.f.get();
                vfg vfgVar = (vfg) efzVar13.p.get();
                vda a = vdb.a(context);
                a.e("mdx");
                a.f("mdx_profile.pb");
                Uri a2 = a.a();
                vfk d = vfn.d(context, anibVar);
                d.b();
                d.c = efz.jZ();
                d.d("user-stats-timestamp", "mdx-last-connection-timestamp", "mdx-profile-creation-timestamp", "mdx-connection-count", "cast-available-session-count");
                d.e(adgt.d);
                vfn a3 = d.a();
                vfe a4 = vff.a();
                a4.f(a2);
                a4.e(awvj.a);
                a4.b(a3);
                return new ywp(agcm.e(vfgVar.a(a4.a())), awvj.a);
            case 727:
                return this.a.dl();
            case 728:
                efz efzVar14 = this.a;
                ysl a5 = ((ysn) efzVar14.fJ.get()).a(new cns(), ysm.a(adyu.bS(5000, 10000), new afvk((afqn) efzVar14.fL.get(), (shf) efzVar14.g.get())), "mdx-insecure");
                a5.c();
                ayaw.k(a5);
                return a5;
            case 729:
                efz efzVar15 = this.a;
                return new adul((ypa) efzVar15.B.get(), (aihs) efzVar15.fV.get(), (aioc) efzVar15.fY.get(), (adui) efzVar15.jU.get());
            case 730:
                adui g = enq.g(this.a.jT);
                ayaw.k(g);
                return g;
            case 731:
                efz efzVar16 = this.a;
                adun adunVar = new adun();
                adunVar.a.g(adunVar.kI((aioc) efzVar16.fY.get()));
                return adunVar;
            case 732:
                return this.a.dg();
            case 733:
                return new adhy((vgz) this.a.jX.get());
            case 734:
                efz efzVar17 = this.a;
                Context context2 = efzVar17.b.a;
                anib anibVar2 = (anib) efzVar17.f.get();
                vfg vfgVar2 = (vfg) efzVar17.p.get();
                vda a6 = vdb.a(context2);
                a6.e("mdx");
                a6.f("manual_pairing_screens.pb");
                Uri a7 = a6.a();
                vfk d2 = vfn.d(context2, anibVar2);
                d2.c = efz.jZ();
                d2.b();
                d2.d("deviceIds", "screenIds", "screenNames");
                d2.e(fkm.u);
                vfn a8 = d2.a();
                vfe a9 = vff.a();
                a9.f(a7);
                a9.e(aose.a);
                a9.b(a8);
                return vfgVar2.a(a9.a());
            case 735:
                return this.a.dp();
            case 736:
                efz efzVar18 = this.a;
                return new iyw(efzVar18.ka, (Executor) efzVar18.f.get());
            case 737:
                efz efzVar19 = this.a;
                return new iyt(efzVar19.b.a, efzVar19.kp, (aadw) efzVar19.D.get());
            case 738:
                efz efzVar20 = this.a;
                ajjz o = enq.o(efzVar20.hd(), efzVar20.kn, efzVar20.ko);
                ayaw.k(o);
                return o;
            case 739:
                efz efzVar21 = this.a;
                return new ajla(efzVar21.b.a, efzVar21.km, efzVar21.kb, efzVar21.ha, efzVar21.eb);
            case 740:
                efz efzVar22 = this.a;
                ajjs ajjsVar = efzVar22.hd().b ? (ajjs) efzVar22.kc.get() : (ajjs) efzVar22.kl.get();
                ayaw.k(ajjsVar);
                return ajjsVar;
            case 741:
                efz efzVar23 = this.a;
                return new ajku(efzVar23.b.a, (Executor) efzVar23.f.get(), efzVar23.ha, efzVar23.kb, efzVar23.eb);
            case 742:
                return this.a.hd();
            case 743:
                return this.a.jK();
            case 744:
                return ytd.a(this.a.kd, amlr.a);
            case 745:
                return this.a.bE();
            case 746:
                return new ajlp(((dsm) this.a.kg.get()).c);
            case 747:
                efz efzVar24 = this.a;
                Context context3 = efzVar24.b.a;
                dsm dsmVar = (dsm) efzVar24.kf.get();
                int i2 = enq.a;
                ayaw.k(dsmVar);
                return dsmVar;
            case 748:
                efz efzVar25 = this.a;
                return enq.M(efzVar25.b.a, efzVar25.hd());
            case 749:
                efz efzVar26 = this.a;
                ajlu ajluVar = efzVar26.hd().l ? (ajlu) efzVar26.ki.get() : (ajlu) efzVar26.kj.get();
                ayaw.k(ajluVar);
                return ajluVar;
            case 750:
                efz efzVar27 = this.a;
                agmh agmhVar = new agmh((aais) efzVar27.dJ.get(), (afsy) efzVar27.au.get(), (ypa) efzVar27.B.get(), (Executor) efzVar27.f.get(), (aajb) efzVar27.dI.get(), (amce) efzVar27.ev.get(), efzVar27.hd().m, efzVar27.hd().n, new aolb(null), null);
                agmhVar.c.g(agmhVar);
                agmhVar.b();
                return agmhVar;
            case 751:
                return new agmf();
            case 752:
                efz efzVar28 = this.a;
                ajjs ajjsVar2 = (ajjs) efzVar28.km.get();
                apdb hd = efzVar28.hd();
                ajjv n = enq.n();
                ayaw.k(n);
                return new ajjp(ajjsVar2, hd, n, (aadw) efzVar28.D.get());
            case 753:
                efz efzVar29 = this.a;
                return new izs((aadw) efzVar29.D.get(), axqq.a(efzVar29.aw));
            case 754:
                return this.a.cr();
            case 755:
                return enq.E((ylf) this.a.ai.get());
            case 756:
                efz efzVar30 = this.a;
                Context context4 = efzVar30.b.a;
                afsy afsyVar = (afsy) efzVar30.au.get();
                shf shfVar2 = (shf) efzVar30.g.get();
                Executor executor = (Executor) efzVar30.f.get();
                fae x = efzVar30.x();
                faa faaVar = (faa) efzVar30.kw.get();
                aadr aadrVar = (aadr) efzVar30.cw.get();
                aarr aarrVar = (aarr) efzVar30.hV.get();
                return new fap(context4, afsyVar, shfVar2, executor, x, faaVar, aadrVar, aarrVar);
            case 757:
                efz efzVar31 = this.a;
                return new fjs(efzVar31.gG, efzVar31.gH, efzVar31.ks, (axzg) efzVar31.kt.get(), (ayqi) efzVar31.aq.get(), (afsy) efzVar31.au.get(), (aais) efzVar31.dJ.get(), efzVar31.D(), null, null);
            case 758:
                efz efzVar32 = this.a;
                return new axzg((aadw) efzVar32.D.get(), (aaea) efzVar32.K.get());
            case 759:
                return new fio((fiu) this.a.ku.get());
            case 760:
                return new fiu(this.a.B);
            case 761:
                return new faa((zfy) this.a.ct.get());
            case 762:
                return new aili((ywr) this.a.kx.get());
            case 763:
                efz efzVar33 = this.a;
                return fkr.a(efzVar33.b.a, efzVar33.p);
            case 764:
                efz efzVar34 = this.a;
                Object obj = (ageg) efzVar34.kz.get();
                Object obj2 = (agef) efzVar34.lA.get();
                if (true == ((agzr) efzVar34.gP.get()).b()) {
                    obj = obj2;
                }
                ayaw.k(obj);
                return obj;
            case 765:
                return new ageg(this.a.b.a, 1);
            case 766:
                return new agef((aguv) this.a.kE.get(), 1);
            case 767:
                efz efzVar35 = this.a;
                return new aguv((agvx) efzVar35.lz.get(), (agzr) efzVar35.gP.get());
            case 768:
                efz efzVar36 = this.a;
                Context context5 = efzVar36.b.a;
                Executor executor2 = (Executor) efzVar36.f.get();
                azrw azrwVar = efzVar36.gU;
                azrw azrwVar2 = efzVar36.gH;
                azrw azrwVar3 = efzVar36.lf;
                SharedPreferences sharedPreferences2 = (SharedPreferences) efzVar36.z.get();
                agus fC = efzVar36.fC();
                agmq agmqVar = (agmq) efzVar36.li.get();
                agtr agtrVar = (agtr) efzVar36.kB.get();
                Executor executor3 = (Executor) efzVar36.lj.get();
                agvp e = afhy.e(efzVar36.gH, (amnv) efzVar36.ga.get(), (shf) efzVar36.g.get(), efzVar36.gn, (ptk) efzVar36.gE.get(), ammv.j(efzVar36.ei()), amrz.n(5, efzVar36.lk, 4, efzVar36.lw, 3, efzVar36.lx, 2, efzVar36.ly), (adyl) efzVar36.gq.get(), (afhs) efzVar36.gg.get());
                agsd agsdVar = (agsd) efzVar36.gS.get();
                String canonicalName = ((agzr) efzVar36.gP.get()).e() ? OfflineKeepAliveService.class.getCanonicalName() : "DummyServicePath";
                ayaw.k(canonicalName);
                return new agvx(context5, executor2, azrwVar, azrwVar2, azrwVar3, sharedPreferences2, fC, agmqVar, agtrVar, executor3, e, agsdVar, canonicalName, (agoo) efzVar36.kA.get(), (agzr) efzVar36.gP.get());
            case 769:
                efz efzVar37 = this.a;
                Context context6 = efzVar37.b.a;
                shf shfVar3 = (shf) efzVar37.g.get();
                agoo agooVar = (agoo) efzVar37.kA.get();
                azrw azrwVar4 = efzVar37.gH;
                agom agomVar = (agom) efzVar37.kG.get();
                azrw azrwVar5 = efzVar37.kp;
                jqq jqqVar = (jqq) efzVar37.kH.get();
                ysy ysyVar = (ysy) efzVar37.as.get();
                return new jqp(context6, shfVar3, agooVar, azrwVar4, agomVar, azrwVar5, jqqVar, ysyVar, (jqr) efzVar37.kJ.get(), efzVar37.la, (agzr) efzVar37.gP.get());
            case 770:
                return new agoo(this.a.b.a);
            case 771:
                efz efzVar38 = this.a;
                return new agom((agoo) efzVar38.kA.get(), (agvh) efzVar38.kF.get(), (agzr) efzVar38.gP.get());
            case 772:
                efz efzVar39 = this.a;
                agvh agvhVar = ((agzr) efzVar39.gP.get()).b() ? (agvh) efzVar39.kE.get() : (agvh) efzVar39.kD.get();
                ayaw.k(agvhVar);
                return agvhVar;
            case 773:
                efz efzVar40 = this.a;
                return new agvd(efzVar40.b.a, (yne) efzVar40.kC.get());
            case 774:
                return new agvz(OfflineTransferService.class, (agtr) this.a.kB.get());
            case 775:
                return new agtr(axqq.a(this.a.gH));
            case 776:
                return new jqq(this.a.li(), evr.cb(), mcy.at(), null, null, null, null, null);
            case 777:
                return new fhe();
            case 778:
                return new jqr(this.a.cO());
            case 779:
                efz efzVar41 = this.a;
                return new agpd(efzVar41.lb, axqq.a(efzVar41.lc), efzVar41.ld, efzVar41.as, efzVar41.gf, efzVar41.dJ, (ypa) efzVar41.B.get(), (afsy) efzVar41.au.get(), efzVar41.le, (ScheduledExecutorService) efzVar41.f.get());
            case 780:
                efz efzVar42 = this.a;
                return new agoz(efzVar42.iq(), (shf) efzVar42.g.get());
            case 781:
                efz efzVar43 = this.a;
                return new jpb((aais) efzVar43.dJ.get(), efzVar43.kM, efzVar43.ai(), (aahd) efzVar43.iM.get(), efzVar43.E(), (agof) efzVar43.gH.get());
            case 782:
                efz efzVar44 = this.a;
                aarm aarmVar = (aarm) efzVar44.er.get();
                ajoy ajoyVar = (ajoy) efzVar44.eV.get();
                afsy afsyVar2 = (afsy) efzVar44.au.get();
                ysl yslVar = (ysl) efzVar44.fO.get();
                jtt jttVar = (jtt) efzVar44.kL.get();
                return new juc(aarmVar, ajoyVar, afsyVar2, yslVar, jttVar, null, null, null);
            case 783:
                efz efzVar45 = this.a;
                return new jtt(efzVar45.gI, (fka) efzVar45.gN.get(), (jup) efzVar45.gU.get(), (axzg) efzVar45.kK.get(), null, null, null, null);
            case 784:
                efz efzVar46 = this.a;
                return new axzg((aadw) efzVar46.D.get(), (aaea) efzVar46.K.get());
            case 785:
                efz efzVar47 = this.a;
                aadw aadwVar = (aadw) efzVar47.D.get();
                return new axzf(aadwVar);
            case 786:
                efz efzVar48 = this.a;
                return new agmj((agof) efzVar48.gH.get(), (agrn) efzVar48.kP.get());
            case 787:
                return this.a.ft();
            case 788:
                efz efzVar49 = this.a;
                return new agrl((agro) efzVar49.kQ.get(), (agrw) efzVar49.kR.get(), (shf) efzVar49.g.get(), (SharedPreferences) efzVar49.z.get(), (aaea) efzVar49.K.get(), (aghr) efzVar49.kS.get(), (ypa) efzVar49.B.get());
            case 789:
                efz efzVar50 = this.a;
                return new agdy(efzVar50.gH, (ScheduledExecutorService) efzVar50.f.get(), efzVar50.kP, (ylf) efzVar50.ai.get(), (agsg) efzVar50.gU.get(), (ypa) efzVar50.B.get());
            case 790:
                efz efzVar51 = this.a;
                return new agrw(efzVar51.b.a, (aarm) efzVar51.er.get(), (ajoy) efzVar51.eV.get(), (afsy) efzVar51.au.get(), (ysl) efzVar51.fO.get(), null, null, null);
            case 791:
                return new aghq((zfy) this.a.ct.get());
            case 792:
                efz efzVar52 = this.a;
                return new agrm((agro) efzVar52.kQ.get(), (agrw) efzVar52.kR.get(), (shf) efzVar52.g.get(), (SharedPreferences) efzVar52.z.get(), (aaea) efzVar52.K.get(), (aghr) efzVar52.kS.get(), (ypa) efzVar52.B.get());
            case 793:
                efz efzVar53 = this.a;
                return new agmk((agrq) efzVar53.kU.get(), (agsg) efzVar53.gU.get(), (agof) efzVar53.gH.get(), (agzz) efzVar53.gG.get(), (ypa) efzVar53.B.get());
            case 794:
                return new agrq((agrz) this.a.kT.get());
            case 795:
                efz efzVar54 = this.a;
                return new agrz((aarm) efzVar54.er.get(), (ajoy) efzVar54.eV.get(), (afsy) efzVar54.au.get(), (ysl) efzVar54.fO.get(), (aaea) efzVar54.K.get(), null, null, null);
            case 796:
                efz efzVar55 = this.a;
                return new jon((aais) efzVar55.dJ.get(), efzVar55.kV, efzVar55.kK);
            case 797:
                efz efzVar56 = this.a;
                return new jmm(efzVar56.kM, (jtt) efzVar56.kL.get(), (Executor) efzVar56.f.get(), efzVar56.ai(), (axzg) efzVar56.kt.get(), null, null);
            case 798:
                return new jol((aais) this.a.dJ.get());
            case 799:
                efz efzVar57 = this.a;
                return new agmi(efzVar57.gH, (aais) efzVar57.dJ.get(), (axzg) efzVar57.kt.get(), null, null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        adts adtsVar;
        int i = this.b;
        String str = "";
        switch (i) {
            case 600:
                return this.a.cv();
            case 601:
                return this.a.ct();
            case 602:
                efz efzVar = this.a;
                return new jgu(efzVar.b.a, (afyt) efzVar.eu.get());
            case 603:
                efz efzVar2 = this.a;
                azrw azrwVar = efzVar2.ju;
                azrw azrwVar2 = efzVar2.jl;
                bph bphVar = (bph) efzVar2.jm.get();
                azrw azrwVar3 = efzVar2.jY;
                Context context = efzVar2.b.a;
                Executor executor = (Executor) efzVar2.i.get();
                adlt adltVar = (adlt) efzVar2.ja.get();
                efzVar2.m154do();
                return new acxm(azrwVar, azrwVar2, bphVar, azrwVar3, executor, adltVar);
            case 604:
                return this.a.dB();
            case 605:
                return this.a.di();
            case 606:
                efz efzVar3 = this.a;
                ysc yscVar = (ysc) efzVar3.is.get();
                int i2 = ((acun) efzVar3.iu.get()).T;
                return yscVar.a(adyu.bR(i2 > 0 ? i2 : 3600));
            case 607:
                return this.a.bM();
            case 608:
                return this.a.bN();
            case 609:
                return this.a.cY();
            case 610:
                return this.a.kV();
            case 611:
                return this.a.kX();
            case 612:
                efz efzVar4 = this.a;
                ysn ysnVar = (ysn) efzVar4.fJ.get();
                afqn afqnVar = (afqn) efzVar4.fL.get();
                shf shfVar = (shf) efzVar4.g.get();
                int i3 = ((acun) efzVar4.iu.get()).T;
                ysl a = ysnVar.a(new cns(), ysm.a(adyu.bR(i3 > 0 ? i3 : 3600), new afvk(afqnVar, shfVar)), "mdx-dialcheck");
                a.c();
                ayaw.k(a);
                return a;
            case 613:
                efz efzVar5 = this.a;
                return new adtv(efzVar5.as, ((SharedPreferences) efzVar5.z.get()).getBoolean("MdxEnableFirstNetworkInterface", false), (SharedPreferences) efzVar5.z.get());
            case 614:
                return this.a.hT();
            case 615:
                efz efzVar6 = this.a;
                return new adib((yrw) efzVar6.ix.get(), (adhz) efzVar6.iz.get());
            case 616:
                return ((ysc) this.a.is.get()).a(adyu.bS(3000, 5000));
            case 617:
                efz efzVar7 = this.a;
                return new adhz(efzVar7.iy, efzVar7.ie(), efzVar7.b.a, (acun) efzVar7.iu.get());
            case 618:
                String string = ((SharedPreferences) this.a.z.get()).getString("MdxServerSelection", adts.e.name());
                try {
                    adtsVar = adts.a(string);
                } catch (IllegalArgumentException e) {
                    zga.f(adgr.a, String.format(Locale.US, "Bogus value in shared preferences for key %s value %s, returning default value.", "MdxServerSelection", string), e);
                    adtsVar = adts.e;
                }
                ayaw.k(adtsVar);
                return adtsVar;
            case 619:
                efz efzVar8 = this.a;
                return new adpe(axqq.a(efzVar8.ji), (ypa) efzVar8.B.get(), (shf) efzVar8.g.get(), axqq.a(efzVar8.jj), axqq.a(efzVar8.ee), axqq.a(efzVar8.jk), axqq.a(efzVar8.jE), axqq.a(efzVar8.jH), axqq.a(efzVar8.jG), axqq.a(efzVar8.jI), axqq.a(efzVar8.jS), (adak) efzVar8.eP.get(), (adtv) efzVar8.iw.get(), axqq.a(efzVar8.jg), amsx.r((adlr) efzVar8.jV.get()), (acwv) efzVar8.jW.get(), (acpz) efzVar8.gV.get(), (acun) efzVar8.iu.get(), (acxd) efzVar8.je.get(), (acyc) efzVar8.iI.get());
            case 620:
                return this.a.dD();
            case 621:
                efz efzVar9 = this.a;
                return new aiuy(efzVar9.b.a, (aipt) efzVar9.iB.get(), (aadw) efzVar9.D.get());
            case 622:
                efz efzVar10 = this.a;
                return aiog.A((axzg) efzVar10.ap.get(), (ywr) efzVar10.iA.get());
            case 623:
                efz efzVar11 = this.a;
                return aazr.f(efzVar11.b.a, efz.jZ(), (anib) efzVar11.f.get(), (vfg) efzVar11.p.get(), (ylr) efzVar11.v.get());
            case 624:
                return this.a.dk();
            case 625:
                efz efzVar12 = this.a;
                return new adid((yrw) efzVar12.iD.get(), (adhz) efzVar12.iz.get());
            case 626:
                efz efzVar13 = this.a;
                ysc yscVar2 = (ysc) efzVar13.is.get();
                int i4 = ((acun) efzVar13.iu.get()).V;
                return yscVar2.a(adyu.bR(i4 > 0 ? i4 : 8000));
            case 627:
                efz efzVar14 = this.a;
                ysc yscVar3 = (ysc) efzVar14.is.get();
                int i5 = ((acun) efzVar14.iu.get()).U;
                if (i5 <= 0) {
                    i5 = 35000;
                }
                return yscVar3.a(adyu.bR(i5));
            case 628:
                efz efzVar15 = this.a;
                return new adrp(new adrh((ypa) efzVar15.B.get(), (acsy) efzVar15.ee.get(), (acun) efzVar15.iu.get()), (adtv) efzVar15.iw.get(), (acpl) efzVar15.aw.get());
            case 629:
                efz efzVar16 = this.a;
                final SharedPreferences sharedPreferences = (SharedPreferences) efzVar16.z.get();
                final SecureRandom secureRandom = (SecureRandom) efzVar16.ea.get();
                aadw aadwVar = (aadw) efzVar16.D.get();
                final azrw azrwVar4 = efzVar16.iF;
                atfq atfqVar = aadwVar.b().o;
                if (atfqVar == null) {
                    atfqVar = atfq.a;
                }
                auie auieVar = atfqVar.g;
                if (auieVar == null) {
                    auieVar = auie.a;
                }
                boolean z = auieVar.c;
                String str2 = adgr.a;
                anhy P = z ? anaf.P(anfq.h(((vgz) azrwVar4.get()).a(), new amml() { // from class: adgq
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        SecureRandom secureRandom2 = secureRandom;
                        azrw azrwVar5 = azrwVar4;
                        awvf awvfVar = (awvf) obj;
                        if (awvfVar == null || awvfVar.c.isEmpty()) {
                            String bigInteger = new BigInteger(130, secureRandom2).toString(32);
                            ynm.m(((vgz) azrwVar5.get()).b(new wgs(bigInteger, 14), angq.a), abbr.s);
                            return bigInteger;
                        }
                        return awvfVar.c;
                    }
                }, angq.a)) : anaf.P(anfq.h(anht.q(anaf.O(sharedPreferences.getString("remote_id", ""))), new amml() { // from class: adgp
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        SecureRandom secureRandom2 = secureRandom;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        String str3 = (String) obj;
                        if (!ammx.e(str3)) {
                            return str3;
                        }
                        String bigInteger = new BigInteger(130, secureRandom2).toString(32);
                        sharedPreferences2.edit().putString("remote_id", bigInteger).apply();
                        ynm.m(anhv.a, abbr.t);
                        return bigInteger;
                    }
                }, angq.a));
                ayaw.k(P);
                return P;
            case 630:
                efz efzVar17 = this.a;
                Context context2 = efzVar17.b.a;
                anib anibVar = (anib) efzVar17.f.get();
                vfg vfgVar = (vfg) efzVar17.p.get();
                vda a2 = vdb.a(context2);
                a2.e("mdx");
                a2.f("remote.pb");
                Uri a3 = a2.a();
                vfk d = vfn.d(context2, anibVar);
                d.c = efz.jZ();
                d.b();
                d.d("remote_id");
                d.e(adgt.a);
                vfn a4 = d.a();
                vfe a5 = vff.a();
                a5.f(a3);
                a5.e(awvf.a);
                a5.b(a4);
                return vfgVar.a(a5.a());
            case 631:
                return this.a.dx();
            case 632:
                efz efzVar18 = this.a;
                ysc yscVar4 = (ysc) efzVar18.is.get();
                int i6 = ((acun) efzVar18.iu.get()).O;
                return yscVar4.a(adyu.bR(i6 > 0 ? i6 : 8000));
            case 633:
                return this.a.dj();
            case 634:
                String str3 = ((acxi) this.a.bg.get()).d;
                ayaw.k(str3);
                return str3;
            case 635:
                efz efzVar19 = this.a;
                return new aczb(((acun) efzVar19.iu.get()).g, efzVar19.ie());
            case 636:
                efz efzVar20 = this.a;
                return new acyc((vgz) efzVar20.iH.get(), (shf) efzVar20.g.get(), (acun) efzVar20.iu.get(), (acpl) efzVar20.aw.get());
            case 637:
                efz efzVar21 = this.a;
                Context context3 = efzVar21.b.a;
                anib anibVar2 = (anib) efzVar21.f.get();
                vfg vfgVar2 = (vfg) efzVar21.p.get();
                vda a6 = vdb.a(context3);
                a6.e("mdx");
                a6.f("device_management.pb");
                Uri a7 = a6.a();
                vfk d2 = vfn.d(context3, anibVar2);
                d2.c = efz.jZ();
                d2.b();
                d2.d("youtube.mdx:dial_devices");
                d2.e(new vfl() { // from class: adgs
                    @Override // defpackage.vfl
                    public final aooy a(vfm vfmVar, aooy aooyVar) {
                        String str4;
                        String str5 = "ts";
                        String str6 = "wifi";
                        String str7 = "";
                        String d3 = vfmVar.d("youtube.mdx:dial_devices", "[]");
                        aone builder = ((awva) aooyVar).toBuilder();
                        try {
                            JSONArray jSONArray = new JSONArray(d3);
                            int i7 = 0;
                            while (i7 < jSONArray.length()) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                                if (optJSONObject != null && optJSONObject.has(str6) && optJSONObject.optLong(str5, 0L) > 0) {
                                    String string2 = optJSONObject.getString(str6);
                                    JSONArray jSONArray2 = optJSONObject.getJSONArray("devices");
                                    int i8 = 0;
                                    while (i8 < jSONArray2.length()) {
                                        JSONObject jSONObject = jSONArray2.getJSONObject(i8);
                                        String optString = jSONObject.optString("id", str7);
                                        String optString2 = jSONObject.optString("manufacturer", str7);
                                        String optString3 = jSONObject.optString("model_name", str7);
                                        String optString4 = jSONObject.optString("name", str7);
                                        String optString5 = jSONObject.optString("ssid", str7);
                                        String optString6 = jSONObject.optString("mac", str7);
                                        String str8 = str6;
                                        String str9 = str7;
                                        int optInt = jSONObject.optInt("timeout", 0);
                                        boolean optBoolean = jSONObject.optBoolean("wol");
                                        JSONArray jSONArray3 = jSONArray;
                                        int i9 = i7;
                                        int i10 = i8;
                                        long optLong = jSONObject.optLong(str5, 0L);
                                        awux awuxVar = awux.a;
                                        optString.getClass();
                                        Map unmodifiableMap = Collections.unmodifiableMap(((awva) builder.instance).c);
                                        if (unmodifiableMap.containsKey(optString)) {
                                            awuxVar = (awux) unmodifiableMap.get(optString);
                                        }
                                        awuy awuyVar = awuxVar.d;
                                        if (awuyVar == null) {
                                            awuyVar = awuy.a;
                                        }
                                        awvc awvcVar = awuyVar.i;
                                        if (awvcVar == null) {
                                            awvcVar = awvc.a;
                                        }
                                        if (awvcVar.f > optLong) {
                                            str4 = str5;
                                        } else if (!optBoolean || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(optString6) || optLong <= 0) {
                                            str4 = str5;
                                            optString.getClass();
                                            builder.copyOnWrite();
                                            ((awva) builder.instance).a().remove(optString);
                                        } else {
                                            aone createBuilder = awux.a.createBuilder();
                                            createBuilder.copyOnWrite();
                                            awux awuxVar2 = (awux) createBuilder.instance;
                                            optString.getClass();
                                            awuxVar2.b |= 1;
                                            awuxVar2.c = optString;
                                            aone createBuilder2 = awuy.a.createBuilder();
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar2 = (awuy) createBuilder2.instance;
                                            optString2.getClass();
                                            str4 = str5;
                                            awuyVar2.b |= 1;
                                            awuyVar2.c = optString2;
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar3 = (awuy) createBuilder2.instance;
                                            optString3.getClass();
                                            awuyVar3.b |= 2;
                                            awuyVar3.d = optString3;
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar4 = (awuy) createBuilder2.instance;
                                            optString4.getClass();
                                            awuyVar4.b |= 4;
                                            awuyVar4.e = optString4;
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar5 = (awuy) createBuilder2.instance;
                                            optString4.getClass();
                                            awuyVar5.b |= 8;
                                            awuyVar5.f = optString4;
                                            aone createBuilder3 = awvc.a.createBuilder();
                                            createBuilder3.copyOnWrite();
                                            awvc awvcVar2 = (awvc) createBuilder3.instance;
                                            optString5.getClass();
                                            awvcVar2.b |= 1;
                                            awvcVar2.c = optString5;
                                            createBuilder3.copyOnWrite();
                                            awvc awvcVar3 = (awvc) createBuilder3.instance;
                                            optString6.getClass();
                                            awvcVar3.b |= 2;
                                            awvcVar3.d = optString6;
                                            long j = optInt;
                                            createBuilder3.copyOnWrite();
                                            awvc awvcVar4 = (awvc) createBuilder3.instance;
                                            awvcVar4.b |= 4;
                                            awvcVar4.e = j;
                                            createBuilder3.copyOnWrite();
                                            awvc awvcVar5 = (awvc) createBuilder3.instance;
                                            awvcVar5.b |= 8;
                                            awvcVar5.f = optLong;
                                            awvc awvcVar6 = (awvc) createBuilder3.build();
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar6 = (awuy) createBuilder2.instance;
                                            awvcVar6.getClass();
                                            awuyVar6.i = awvcVar6;
                                            awuyVar6.b |= 64;
                                            createBuilder2.copyOnWrite();
                                            awuy awuyVar7 = (awuy) createBuilder2.instance;
                                            awuyVar7.g = 2;
                                            awuyVar7.b |= 16;
                                            awuy awuyVar8 = (awuy) createBuilder2.build();
                                            createBuilder.copyOnWrite();
                                            awux awuxVar3 = (awux) createBuilder.instance;
                                            awuyVar8.getClass();
                                            awuxVar3.d = awuyVar8;
                                            awuxVar3.b |= 2;
                                            builder.bf(optString, (awux) createBuilder.build());
                                        }
                                        i8 = i10 + 1;
                                        str6 = str8;
                                        str7 = str9;
                                        jSONArray = jSONArray3;
                                        i7 = i9;
                                        str5 = str4;
                                    }
                                }
                                i7++;
                                str6 = str6;
                                str7 = str7;
                                jSONArray = jSONArray;
                                str5 = str5;
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            builder.clear();
                        }
                        return (awva) builder.build();
                    }
                });
                vfn a8 = d2.a();
                vfe a9 = vff.a();
                a9.f(a7);
                a9.e(awva.a);
                a9.b(a8);
                return vfgVar2.a(a9.a());
            case 638:
                return Boolean.valueOf(((SharedPreferences) this.a.z.get()).getBoolean("EnableSsdpResponseLogging", false));
            case 639:
                efz efzVar22 = this.a;
                return wtv.f(efzVar22.iK, ammv.j(efzVar22.I()));
            case 640:
                return this.a.bV();
            case 641:
                return this.a.aq();
            case 642:
                return this.a.M();
            case 643:
                return this.a.dz();
            case 644:
                return this.a.dd();
            case 645:
                return this.a.de();
            case 646:
                efz efzVar23 = this.a;
                afsy afsyVar = (afsy) efzVar23.au.get();
                aftj aftjVar = (aftj) efzVar23.dj.get();
                ypa ypaVar = (ypa) efzVar23.B.get();
                adtq adtqVar = new adtq(afsyVar, aftjVar, ypaVar, (shf) efzVar23.g.get(), (acun) efzVar23.iu.get());
                ypaVar.g(adtqVar);
                return adtqVar;
            case 647:
                efz efzVar24 = this.a;
                ysc yscVar5 = (ysc) efzVar24.is.get();
                int i7 = ((acun) efzVar24.iu.get()).R;
                if (i7 <= 0) {
                    i7 = 62000;
                }
                return yscVar5.a(adyu.bR(i7));
            case 648:
                efz efzVar25 = this.a;
                ysc yscVar6 = (ysc) efzVar25.is.get();
                int i8 = ((acun) efzVar25.iu.get()).Q;
                return yscVar6.a(adyu.bR(i8 > 0 ? i8 : 8000));
            case 649:
                efz efzVar26 = this.a;
                Map map = (Map) efzVar26.iO.get();
                adrp adrpVar = (adrp) efzVar26.iE.get();
                int c = efzVar26.c();
                HashMap hashMap = new HashMap(map);
                if (c == 1 && adrpVar.m()) {
                    try {
                        String g = adrpVar.g();
                        String str4 = adgr.a;
                        String.format("Adding %s: %s", "remoteControllerUrl", g);
                        hashMap.put("remoteControllerUrl", g);
                    } catch (IllegalArgumentException e2) {
                        zga.f(adgr.a, "Could not add local transport browser channel parameters", e2);
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                ayaw.k(unmodifiableMap);
                return unmodifiableMap;
            case 650:
                efz efzVar27 = this.a;
                acun acunVar = (acun) efzVar27.iu.get();
                Context context4 = efzVar27.b.a;
                String ie = efzVar27.ie();
                anhy anhyVar = (anhy) efzVar27.iG.get();
                acxi acxiVar = (acxi) efzVar27.bg.get();
                azrw azrwVar5 = efzVar27.eL;
                String str5 = (String) efzVar27.fv.get();
                azrw azrwVar6 = efzVar27.eH;
                String upperCase = Build.MANUFACTURER.toUpperCase(Locale.US);
                String str6 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 1 + String.valueOf(str6).length());
                sb.append(upperCase);
                sb.append(" ");
                sb.append(str6);
                String sb2 = sb.toString();
                String x = adyu.x(yjk.X(context4), zgx.c(context4), ie);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("device", "REMOTE_CONTROL");
                hashMap2.put("id", (String) ynm.g(anhyVar, 1L, TimeUnit.SECONDS, ""));
                hashMap2.put("name", sb2);
                hashMap2.put("app", x);
                hashMap2.put("mdx-version", "3");
                hashMap2.put("theme", ie);
                if (acunVar.w) {
                    try {
                        aasc aascVar = ((aasd) azrwVar5.get()).a;
                        String d3 = ((wyz) azrwVar6.get()).d();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_agent", str5);
                        jSONObject.put("window_width_points", aascVar != null ? aascVar.a : 0);
                        jSONObject.put("window_height_points", aascVar != null ? aascVar.b : 0);
                        jSONObject.put("os_name", "Android");
                        jSONObject.put("ms", d3);
                        hashMap2.put("deviceContext", jSONObject.toString());
                    } catch (JSONException e3) {
                        zga.f(adgr.a, "Error building 'deviceContext' data.", e3);
                    }
                }
                String bT = adyu.bT(acunVar, acxiVar);
                if (bT != null) {
                    hashMap2.put("capabilities", bT);
                }
                amsx amsxVar = acunVar.c;
                if (amsxVar != null && !amsxVar.isEmpty()) {
                    str = TextUtils.join(",", amsxVar);
                }
                hashMap2.put("experiments", str);
                Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                ayaw.k(unmodifiableMap2);
                return unmodifiableMap2;
            case 651:
                return this.a.bu();
            case 652:
                efz efzVar28 = this.a;
                return new agdn((ypa) efzVar28.B.get(), (aiij) efzVar28.iX.get(), (aijp) efzVar28.fT.get(), efzVar28.gH, efzVar28.iP, (aaea) efzVar28.K.get(), (agtd) efzVar28.iY.get(), (Executor) efzVar28.f.get(), (Executor) efzVar28.i.get(), amsx.r((aijo) efzVar28.fU.get()), efzVar28.bY(), (agzz) efzVar28.gG.get(), (agzr) efzVar28.gP.get());
            case 653:
                efz efzVar29 = this.a;
                ajoy ajoyVar = (ajoy) efzVar29.eV.get();
                aijp aijpVar = (aijp) efzVar29.fT.get();
                akpq akpqVar = new akpq(efzVar29.iP, efzVar29.iR, (short[]) null);
                ysl yslVar = (ysl) efzVar29.iS.get();
                shf shfVar2 = (shf) efzVar29.g.get();
                aelm dT = efzVar29.dT();
                return wmn.v(ajoyVar, aijpVar, akpqVar, yslVar, shfVar2, dT);
            case 654:
                return this.a.cp();
            case 655:
                return amsx.r((aapu) this.a.iQ.get());
            case 656:
                return szr.k();
            case 657:
                return this.a.bG();
            case 658:
                return this.a.dS();
            case 659:
                return new airs((airx) this.a.iT.get());
            case 660:
                return ahal.K((ahzx) this.a.eQ.get());
            case 661:
                efz efzVar30 = this.a;
                Executor executor2 = (Executor) efzVar30.f.get();
                atse hg = efzVar30.hg();
                Context context5 = efzVar30.b.a;
                return advr.b(executor2, hg);
            case 662:
                return this.a.hk();
            case 663:
                return this.a.dP();
            case 664:
                return this.a.hh();
            case 665:
                return new agtd((agth) this.a.gZ.get());
            case 666:
                return new adyu();
            case 667:
                efz efzVar31 = this.a;
                return new adkv(efzVar31.b.a, (zaw) efzVar31.iN.get());
            case 668:
                return this.a.df();
            case 669:
                return this.a.dA();
            case 670:
                efz efzVar32 = this.a;
                return new adda(efzVar32.dy(), (adyu) efzVar32.jb.get(), null, null);
            case 671:
                efz efzVar33 = this.a;
                return new adik(efzVar33.fX, (aioc) efzVar33.fY.get());
            case 672:
                efz efzVar34 = this.a;
                return new adjf(efzVar34.fX, (aioc) efzVar34.fY.get());
            case 673:
                return new jbz();
            case 674:
                return this.a.dy();
            case 675:
                efz efzVar35 = this.a;
                return new acxd((acpl) efzVar35.aw.get(), axqq.a(efzVar35.ja));
            case 676:
                efz efzVar36 = this.a;
                return new adcq(efzVar36.b.a, (acun) efzVar36.iu.get(), (Executor) efzVar36.f.get());
            case 677:
                return new adyu();
            case 678:
                efz efzVar37 = this.a;
                return new aczg((adtv) efzVar37.iw.get(), (acun) efzVar37.iu.get());
            case 679:
                efz efzVar38 = this.a;
                return new adkz((acpl) efzVar38.aw.get(), (acun) efzVar38.iu.get(), (anic) efzVar38.f.get(), (shf) efzVar38.g.get());
            case 680:
                return new adpl();
            case 681:
                return new adoo((acpl) this.a.aw.get());
            case 682:
                return this.a.ge();
            case 683:
                return this.a.dC();
            case 684:
                efz efzVar39 = this.a;
                azrw azrwVar7 = efzVar39.jl;
                bph bphVar2 = (bph) efzVar39.jm.get();
                addy addyVar = (addy) efzVar39.jD.get();
                ysy ysyVar = (ysy) efzVar39.as.get();
                acyg acygVar = (acyg) efzVar39.iv.get();
                ypa ypaVar2 = (ypa) efzVar39.B.get();
                return new adpi(azrwVar7, bphVar2, addyVar, ysyVar, acygVar, ypaVar2, (Executor) efzVar39.i.get(), (anib) efzVar39.f.get(), (adlj) efzVar39.ju.get(), (acun) efzVar39.iu.get());
            case 685:
                Context context6 = this.a.b.a;
                yjk.f();
                return bpw.b(context6);
            case 686:
                efz efzVar40 = this.a;
                String m155if = efzVar40.m155if();
                String ig = efzVar40.ig();
                bpg bpgVar = new bpg();
                bpgVar.c(ig);
                bpgVar.c("android.media.intent.category.LIVE_AUDIO");
                bpgVar.c(prh.r(m155if));
                bph a10 = bpgVar.a();
                ayaw.k(a10);
                return a10;
            case 687:
                efz efzVar41 = this.a;
                return new addy(axqq.a(efzVar41.jl), (ypa) efzVar41.B.get(), axqq.a(efzVar41.ja), axqq.a(efzVar41.jm), axqq.a(efzVar41.gw), axqq.a(efzVar41.jn), axqq.a(efzVar41.ju), axqq.a(efzVar41.jx), axqq.a(efzVar41.jB), axqq.a(efzVar41.jC), axqq.a(efzVar41.jc), axqq.a(efzVar41.jd), (adcq) efzVar41.jf.get());
            case 688:
                efz efzVar42 = this.a;
                return new aiwg(efzVar42.b.a, (Handler) efzVar42.an.get(), efzVar42.jr, (aivq) efzVar42.js.get(), efzVar42.jt, new aiwb(1));
            case 689:
                return this.a.P();
            case 690:
                efz efzVar43 = this.a;
                return afqe.h((aiwg) efzVar43.jn.get(), (Executor) efzVar43.i.get());
            case 691:
                return this.a.B();
            case 692:
                efz efzVar44 = this.a;
                return new abbu((aarm) efzVar44.er.get(), (ajoy) efzVar44.eV.get(), (afsy) efzVar44.au.get(), efzVar44.bI(), (ypa) efzVar44.B.get(), (abep) efzVar44.x.get(), null, null, null);
            case 693:
                return this.a.cA();
            case 694:
                return ahal.e((aioc) this.a.fY.get());
            case 695:
                efz efzVar45 = this.a;
                return enq.a(efzVar45.b.a, efzVar45.g());
            case 696:
                efz efzVar46 = this.a;
                adbx dp = efzVar46.dp();
                acpl acplVar = (acpl) efzVar46.aw.get();
                Context context7 = efzVar46.b.a;
                return new addu(dp, acplVar, (ysy) efzVar46.as.get(), (ypa) efzVar46.B.get(), (Executor) efzVar46.i.get(), (acun) efzVar46.iu.get(), (anib) efzVar46.f.get());
            case 697:
                String string2 = ((SharedPreferences) this.a.z.get()).getString("MdxDeviceAllowlist", "");
                ayaw.k(string2);
                return string2;
            case 698:
                efz efzVar47 = this.a;
                return new adee((Executor) efzVar47.i.get(), (anib) efzVar47.f.get(), efzVar47.m154do());
            case 699:
                efz efzVar48 = this.a;
                return new adce(axqq.a(efzVar48.jl), axqq.a(efzVar48.jm), axqq.a(efzVar48.jA));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        addf addfVar;
        int i = this.b;
        switch (i) {
            case 1600:
                Context context = this.a.b.a;
                if (yjj.b == null) {
                    yjj.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.sensor.gyroscope"));
                }
                return Boolean.valueOf(yjj.b.booleanValue());
            case 1601:
                ywr ywrVar = (ywr) this.a.wE.get();
                ayaw.k(ywrVar);
                return ywrVar;
            case 1602:
                efz efzVar = this.a;
                Context context2 = efzVar.b.a;
                anib anibVar = (anib) efzVar.f.get();
                vfg vfgVar = (vfg) efzVar.p.get();
                vfk d = vfn.d(context2, anibVar);
                d.b();
                d.c = efz.jZ();
                d.d("youtube.vr.selected_platform", "com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use");
                d.e(adgt.g);
                vfn a = d.a();
                vfe a2 = vff.a();
                a2.f(whl.s(context2, "player", "features/settings.pb"));
                a2.e(awwl.a);
                a2.b(a);
                return new ywp(agcm.e(vfgVar.a(a2.a())), awwl.a);
            case 1603:
                efz efzVar2 = this.a;
                return new aaxn((aarm) efzVar2.er.get(), (ajoy) efzVar2.eV.get(), (afsy) efzVar2.au.get(), (ysl) efzVar2.fO.get(), (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
            case 1604:
                efz efzVar3 = this.a;
                return new ffs((wcf) efzVar3.hM.get(), (afsy) efzVar3.au.get(), (akrh) efzVar3.wP.get(), efzVar3.wQ);
            case 1605:
                efz efzVar4 = this.a;
                return new akrh(efzVar4.wO, (Executor) efzVar4.i.get(), (anib) efzVar4.ay.get(), (aksl) efzVar4.ha.get());
            case 1606:
                efz efzVar5 = this.a;
                return amsx.w((akrj) efzVar5.wI.get(), (akrj) efzVar5.wJ.get(), (akrj) efzVar5.oa.get(), (akrj) efzVar5.wK.get(), (akrj) efzVar5.wL.get(), (akrj) efzVar5.wM.get(), (akrj) efzVar5.wN.get());
            case 1607:
                return new xzv(0);
            case 1608:
                aioc aiocVar = (aioc) this.a.fY.get();
                ffu ffuVar = new ffu();
                ffuVar.kI(aiocVar);
                return ffuVar;
            case 1609:
                return new jqe((jup) this.a.gU.get());
            case 1610:
                return new xzv(1);
            case 1611:
                efz efzVar6 = this.a;
                return new akzf((akwm) efzVar6.mD.get(), (aadw) efzVar6.D.get(), (afsy) efzVar6.au.get());
            case 1612:
                return new qwk(this.a.b.a);
            case 1613:
                efz efzVar7 = this.a;
                return new fhx(efzVar7.b.a, (Executor) efzVar7.i.get(), (agaf) efzVar7.et.get(), (afyt) efzVar7.eu.get());
            case 1614:
                efz efzVar8 = this.a;
                return new yzm(efzVar8.b.a, new ajfe((acpl) efzVar8.aw.get(), efzVar8.cO()));
            case 1615:
                return this.a.a.ag();
            case 1616:
                return new wcy();
            case 1617:
                efc efcVar = this.a.a;
                return new aaxn((aarm) efcVar.dm.c.er.get(), (ajoy) efcVar.dm.c.eV.get(), (afsy) efcVar.dm.c.au.get(), (ysl) efcVar.dm.c.fO.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1618:
                efc efcVar2 = this.a.a;
                return new aaxn((aarm) efcVar2.dm.c.er.get(), (ajoy) efcVar2.dm.c.eV.get(), (afsy) efcVar2.dm.c.au.get(), (ysl) efcVar2.dm.c.fO.get(), (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1619:
                return this.a.a.O();
            case 1620:
                efz efzVar9 = this.a;
                return ahbn.p(((Boolean) efzVar9.ec.get()).booleanValue(), axqq.a(efzVar9.wU), axqq.a(efzVar9.eg), axqq.a(efzVar9.aA), axqq.a(efzVar9.wV));
            case 1621:
                return new ahbn();
            case 1622:
                efz efzVar10 = this.a;
                ajgq ajgqVar = (ajgq) efzVar10.dT.get();
                Context context3 = efzVar10.b.a;
                return new ajfv(ajgqVar.a().j, new Random());
            case 1623:
                efz efzVar11 = this.a;
                return new axzg((aadw) efzVar11.D.get(), (aaea) efzVar11.K.get());
            case 1624:
                efz efzVar12 = this.a;
                aadw aadwVar = (aadw) efzVar12.D.get();
                return new axzf(aadwVar);
            case 1625:
                efz efzVar13 = this.a;
                return new fcv((acsy) efzVar13.ee.get(), (fay) efzVar13.nd.get(), (aifk) efzVar13.fS.get());
            case 1626:
                efz efzVar14 = this.a;
                return new kqr(efzVar14.am(), efzVar14.xa, (Executor) efzVar14.i.get(), (ahui) efzVar14.xc.get());
            case 1627:
                efz efzVar15 = this.a;
                Context context4 = efzVar15.b.a;
                vfg vfgVar2 = (vfg) efzVar15.p.get();
                vda a3 = vdb.a(context4);
                a3.e("accessibility");
                a3.f("accessibility.pb");
                Uri a4 = a3.a();
                vfe a5 = vff.a();
                a5.e(kqs.a);
                a5.f(a4);
                return vfgVar2.a(a5.a());
            case 1628:
                efz efzVar16 = this.a;
                Context context5 = efzVar16.b.a;
                return afqe.j(context5);
            case 1629:
                return aipa.d();
            case 1630:
                efz efzVar17 = this.a;
                return new aiee((ajjz) efzVar17.kp.get(), (Executor) efzVar17.i.get(), (ScheduledExecutorService) efzVar17.f.get(), (aifs) efzVar17.gw.get(), (aioc) efzVar17.fY.get(), (aaea) efzVar17.K.get(), (acsy) efzVar17.ee.get());
            case 1631:
                efz efzVar18 = this.a;
                aarm aarmVar = (aarm) efzVar18.er.get();
                ajoy ajoyVar = (ajoy) efzVar18.eV.get();
                afsy afsyVar = (afsy) efzVar18.au.get();
                ysl yslVar = (ysl) efzVar18.fO.get();
                Set emptySet = Collections.emptySet();
                ayaw.k(emptySet);
                return new aazg(aarmVar, ajoyVar, afsyVar, yslVar, amsx.p(emptySet), null, null, null);
            case 1632:
                efz efzVar19 = this.a;
                return new aazc((aarm) efzVar19.er.get(), (ajoy) efzVar19.eV.get(), (afsy) efzVar19.au.get(), (ysl) efzVar19.fN.get(), null, null, null);
            case 1633:
                return new ajsa();
            case 1634:
                return new abjk();
            case 1635:
                efz efzVar20 = this.a;
                return new ajsd((ajjz) efzVar20.kp.get(), (Executor) efzVar20.i.get());
            case 1636:
                return new eun();
            case 1637:
                return new abjr();
            case 1638:
                return new acpk((acpl) this.a.aw.get());
            case 1639:
                return new abjv();
            case 1640:
                return new adyu();
            case 1641:
                efz efzVar21 = this.a;
                return ahbn.p(((Boolean) efzVar21.ec.get()).booleanValue(), axqq.a(efzVar21.wU), axqq.a(efzVar21.eg), axqq.a(efzVar21.aA), axqq.a(efzVar21.wV));
            case 1642:
                efz efzVar22 = this.a;
                return new abdl((aarm) efzVar22.er.get(), (ajoy) efzVar22.eV.get(), (afsy) efzVar22.au.get(), (ysl) efzVar22.fO.get(), null, null, null);
            case 1643:
                return new aili((ywr) this.a.il.get());
            case 1644:
                return new aili((ywr) this.a.xs.get());
            case 1645:
                efz efzVar23 = this.a;
                Context context6 = efzVar23.b.a;
                anib anibVar2 = (anib) efzVar23.f.get();
                vfg vfgVar3 = (vfg) efzVar23.p.get();
                ylr ylrVar = (ylr) efzVar23.v.get();
                String[] strArr = lqv.a;
                vda a6 = vdb.a(context6);
                a6.e("settings");
                a6.f("back_up_settings.pb");
                Uri a7 = a6.a();
                vfk d2 = vfn.d(context6, anibVar2);
                d2.c = efz.jZ();
                d2.b();
                d2.d(lqv.a);
                d2.e(fkm.i);
                vfn a8 = d2.a();
                vfe a9 = vff.a();
                a9.e(lqv.a());
                a9.f(a7);
                a9.b(a8);
                return ylrVar.a(agcm.e(vfgVar3.a(a9.a())), lqv.a());
            case 1646:
                efz efzVar24 = this.a;
                final gla glaVar = new gla(efzVar24.b.a, efzVar24.xu, (Handler) efzVar24.an.get());
                glaVar.b = new Runnable() { // from class: gkz
                    @Override // java.lang.Runnable
                    public final void run() {
                        gla.this.b();
                    }
                };
                glaVar.c = (NotificationManager) glaVar.a.getSystemService("notification");
                return glaVar;
            case 1647:
                efz efzVar25 = this.a;
                return new gkx(efzVar25.b.a, (aaea) efzVar25.K.get(), efzVar25.xt);
            case 1648:
                efz efzVar26 = this.a;
                return new epb(efzVar26.aw, (aaea) efzVar26.K.get(), (aadw) efzVar26.D.get(), axqq.a(efzVar26.ih), axqq.a(efzVar26.f16if), (Handler) efzVar26.an.get(), (ayqi) efzVar26.im.get(), (Executor) efzVar26.f.get(), (shf) efzVar26.g.get());
            case 1649:
                efz efzVar27 = this.a;
                return new adfc(efzVar27.fX, (acxi) efzVar27.bg.get());
            case 1650:
                efz efzVar28 = this.a;
                azrw azrwVar = efzVar28.xz;
                asvu asvuVar = ((aadw) efzVar28.D.get()).b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                if (asvuVar.bv) {
                    addfVar = (addf) azrwVar.get();
                } else {
                    addfVar = addf.a;
                }
                ayaw.k(addfVar);
                return addfVar;
            case 1651:
                return new addj(0);
            case 1652:
                ghe.i();
                return new adyu();
            case 1653:
                return new mda();
            case 1654:
                return enq.N();
            case 1655:
                efz efzVar29 = this.a;
                Context context7 = efzVar29.b.a;
                azrw azrwVar2 = efzVar29.p;
                anib anibVar3 = (anib) efzVar29.f.get();
                return opm.b(context7, azrwVar2, anibVar3, efz.jZ(), (ylr) efzVar29.v.get());
            case 1656:
                return new akfz();
            case 1657:
                return enq.q((shf) this.a.g.get());
            case 1658:
                return new akai((ywr) this.a.xG.get());
            case 1659:
                efz efzVar30 = this.a;
                Context context8 = efzVar30.b.a;
                anib anibVar4 = (anib) efzVar30.f.get();
                vfg vfgVar4 = (vfg) efzVar30.p.get();
                vda a10 = vdb.a(context8);
                a10.e("rendering");
                a10.f("rendering_settings.pb");
                Uri a11 = a10.a();
                vfe a12 = vff.a();
                a12.e(aosh.a);
                a12.f(a11);
                vfk d3 = vfn.d(context8, anibVar4);
                d3.c = efz.jZ();
                d3.b();
                d3.d("permissions_requested");
                d3.e(adgt.i);
                a12.b(d3.a());
                return new ywp(agcm.e(vfgVar4.a(a12.a())), aosh.a);
            case 1660:
                aadw aadwVar2 = (aadw) this.a.D.get();
                apwy b = aadwVar2.b();
                if (b != null) {
                    asvu asvuVar2 = b.e;
                    if (asvuVar2 == null) {
                        asvuVar2 = asvu.a;
                    }
                    if (asvuVar2.bm) {
                        return new lkb(VoiceSearchActivityV2.class);
                    }
                }
                if (evr.be(aadwVar2)) {
                    return new lkb(VoiceSearchHalfPlateV0Activity.class);
                }
                return new lkb(VoiceSearchActivity.class);
            case 1661:
                return new mcy();
            case 1662:
                efz efzVar31 = this.a;
                return new lzp((aaea) efzVar31.K.get(), (axzg) efzVar31.ig.get(), efzVar31.b.a, (aais) efzVar31.dJ.get(), (aahv) efzVar31.dB.get(), (afsy) efzVar31.au.get(), (izt) efzVar31.xM.get(), (ywr) efzVar31.ez.get(), (gni) efzVar31.eA.get(), (ggs) efzVar31.lE.get(), (ajjz) efzVar31.kp.get(), null);
            case 1663:
                return this.a.Z();
            case 1664:
                efz efzVar32 = this.a;
                return enq.P((aarm) efzVar32.er.get(), (ajoy) efzVar32.eV.get(), (afsy) efzVar32.au.get(), (ysl) efzVar32.fO.get(), efzVar32.b.a);
            case 1665:
                return new aoae((int[]) null);
            case 1666:
                return new GuideControllerImpl$WatchWhileLifecycleObserver();
            case 1667:
                efz efzVar33 = this.a;
                aadw aadwVar3 = (aadw) efzVar33.D.get();
                return new axzf(aadwVar3);
            case 1668:
                efz efzVar34 = this.a;
                Context context9 = efzVar34.b.a;
                azrw azrwVar3 = efzVar34.p;
                anib anibVar5 = (anib) efzVar34.f.get();
                return mcx.b(context9, azrwVar3, anibVar5, efz.jZ(), (ylr) efzVar34.v.get());
            case 1669:
                efz efzVar35 = this.a;
                Context context10 = efzVar35.b.a;
                SharedPreferences sharedPreferences = (SharedPreferences) efzVar35.z.get();
                adko adkoVar = (adko) efzVar35.xP.get();
                acun acunVar = (acun) efzVar35.iu.get();
                amsx amsxVar = ((acun) efzVar35.iu.get()).e;
                ayaw.k(amsxVar);
                amsx amsxVar2 = ((acun) efzVar35.iu.get()).f;
                ayaw.k(amsxVar2);
                adbx dp = efzVar35.dp();
                adlt adltVar = (adlt) efzVar35.ja.get();
                shf shfVar = (shf) efzVar35.g.get();
                return new adju(sharedPreferences, adkoVar, acunVar, amsxVar, amsxVar2, dp, adltVar, shfVar, (acue) efzVar35.mj.get(), efzVar35.kI(), null);
            case 1670:
                efz efzVar36 = this.a;
                adko adkoVar2 = new adko(efzVar36.b.a, (ainy) efzVar36.fX.get(), efzVar36.dp(), efzVar36.jl, (bph) efzVar36.jm.get(), (addy) efzVar36.jD.get(), (adtp) efzVar36.jR.get(), (shf) efzVar36.g.get());
                ypa ypaVar = (ypa) efzVar36.B.get();
                aioc aiocVar2 = (aioc) efzVar36.fY.get();
                adkoVar2.n.kI(aiocVar2);
                adkoVar2.a.kI(aiocVar2);
                ypaVar.g(adkoVar2);
                return adkoVar2;
            case 1671:
                return new adyu();
            case 1672:
                efz efzVar37 = this.a;
                return new ahwy(1);
            case 1673:
                return ahal.I((ahzx) this.a.eQ.get());
            case 1674:
                efz efzVar38 = this.a;
                return whl.n(efzVar38.b.a, "renderingui", "frequency_cap_proto.pb", (vfg) efzVar38.p.get(), awwr.a);
            case 1675:
                efz efzVar39 = this.a;
                Context context11 = efzVar39.b.a;
                return ((ylr) efzVar39.v.get()).a(whl.o(context11, efz.jZ(), (anib) efzVar39.f.get(), (vfg) efzVar39.p.get(), oay.a, oba.b(context11), oaz.a, fkm.j), oaz.a);
            case 1676:
                return new ixl((axzg) this.a.it.get(), null, null, null);
            case 1677:
                efz efzVar40 = this.a;
                return new agzf((agsg) efzVar40.gU.get(), (agzx) efzVar40.kZ.get(), (Executor) efzVar40.i.get(), (anib) efzVar40.f.get(), (aaea) efzVar40.K.get());
            case 1678:
                efz efzVar41 = this.a;
                return new jvh((aili) efzVar41.ky.get(), efzVar41.gH, (ypa) efzVar41.B.get(), (agpd) efzVar41.la.get(), (agzr) efzVar41.gP.get(), null, null, null);
            case 1679:
                return new fav();
            case 1680:
                efc efcVar3 = this.a.a;
                ysy ysyVar = (ysy) efcVar3.dm.c.as.get();
                shf shfVar2 = (shf) efcVar3.dm.c.g.get();
                fka fkaVar = (fka) efcVar3.dm.c.gN.get();
                efz efzVar42 = efcVar3.dm.c;
                return new jsk(ysyVar, shfVar2, fkaVar, efzVar42.gH, efzVar42.kQ);
            case 1681:
                return this.a.fr();
            case 1682:
                return this.a.a.H();
            case 1683:
                return this.a.a.c();
            case 1684:
                efc efcVar4 = this.a.a;
                return new gwt((SecureRandom) efcVar4.dm.c.ea.get(), (vgz) efcVar4.i.get());
            case 1685:
                efz efzVar43 = this.a.a.dm.c;
                Context context12 = efzVar43.b.a;
                vfg vfgVar5 = (vfg) efzVar43.p.get();
                vda a13 = vdb.a(context12);
                a13.e("uri_flow_module");
                a13.f("uri_flow.pb");
                Uri a14 = a13.a();
                vfe a15 = vff.a();
                a15.f(a14);
                a15.e(aork.a);
                return vfgVar5.a(a15.a());
            case 1686:
                efz efzVar44 = this.a.a.dm.c;
                Context context13 = efzVar44.b.a;
                return new euv(efzVar44.ha, (wng) efzVar44.cU.get());
            case 1687:
                return this.a.a.C();
            case 1688:
                return azqy.ap().av();
            case 1689:
                return this.a.a.ad();
            case 1690:
                return this.a.a.D();
            case 1691:
                return this.a.a.y();
            case 1692:
                return new aloh(this.a.a.dm.c.b.a, (char[]) null);
            case 1693:
                return this.a.a.E();
            case 1694:
                return this.a.a.X();
            case 1695:
                return new acsh();
            case 1696:
                return this.a.a.A();
            case 1697:
                return this.a.a.af();
            case 1698:
                return this.a.a.aj();
            case 1699:
                efc efcVar5 = this.a.a;
                return new aaxn((aarm) efcVar5.dm.c.er.get(), (ajoy) efcVar5.dm.c.eV.get(), (afsy) efcVar5.dm.c.au.get(), (ysl) efcVar5.dm.c.fO.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case 1000:
                efz efzVar = this.a;
                return new aldn(efzVar.b.a, (akwm) efzVar.mD.get(), (akxh) efzVar.mI.get(), (akyb) efzVar.mG.get(), (ScheduledExecutorService) efzVar.f.get(), (axze) efzVar.mF.get(), (ylf) efzVar.ai.get(), (alep) efzVar.mC.get(), (albz) efzVar.mJ.get(), null, null, null);
            case 1001:
                efz efzVar2 = this.a;
                return new albz(amrz.n(1, new albn(1), 4, new albn(2), 3, new albn(0), 7, new albn(3)), (akyk) efzVar2.mE.get(), (akxh) efzVar2.mI.get(), (alcw) efzVar2.mH.get());
            case 1002:
                return new akzg(this.a.b.a);
            case 1003:
                return new akyo(this.a.b.a);
            case 1004:
                return this.a.gz();
            case 1005:
                efz efzVar3 = this.a;
                return new akts(axqq.a(efzVar3.mO), axqq.a(efzVar3.mP));
            case 1006:
                return new akym(this.a.b.a);
            case 1007:
                return this.a.cy();
            case 1008:
                return this.a.cz();
            case 1009:
                return this.a.cx();
            case 1010:
                return this.a.kN();
            case 1011:
                return aawj.G(this.a.ks());
            case 1012:
                return new aawm((aaxn) this.a.mQ.get(), null, null, null);
            case 1013:
                return this.a.kj();
            case 1014:
                return afpv.c((aful) this.a.hy.get());
            case 1015:
                return new amhb((amgy) this.a.aS.get());
            case 1016:
                efz efzVar4 = this.a;
                return new egg(efzVar4.dr, efzVar4.km, (akpt) efzVar4.cJ.get(), (eni) efzVar4.cL.get());
            case 1017:
                efz efzVar5 = this.a;
                ehb ehbVar = new ehb(efzVar5.b.a, (ajjt) efzVar5.mX.get(), efzVar5.jl, efzVar5.mY, (yxx) efzVar5.k.get());
                ehbVar.a = (ymp) efzVar5.V.get();
                ehbVar.c = efzVar5.nb;
                ehbVar.d = efzVar5.nc;
                ehbVar.e = efzVar5.nP;
                ehbVar.f = (anhy) efzVar5.nR.get();
                ehbVar.g = efzVar5.nS;
                ehbVar.h = efzVar5.B;
                ehbVar.i = efzVar5.nT;
                ehbVar.j = axqq.a(efzVar5.nU);
                ehbVar.k = axqq.a(efzVar5.hk);
                ehbVar.l = efzVar5.nV;
                ehbVar.m = efzVar5.lF;
                ehbVar.n = efzVar5.nW;
                ehbVar.o = efzVar5.nX;
                ehbVar.p = axqq.a(efzVar5.nY);
                ehbVar.q = axqq.a(efzVar5.nZ);
                ehbVar.r = efzVar5.kr;
                ehbVar.s = efzVar5.ks;
                ehbVar.t = efzVar5.lC;
                ehbVar.u = efzVar5.oa;
                ehbVar.v = efzVar5.oc;
                ehbVar.w = efzVar5.jn;
                ehbVar.x = efzVar5.od;
                ehbVar.y = efzVar5.oe;
                ehbVar.z = axqq.a(efzVar5.of);
                ehbVar.A = axqq.a(efzVar5.fA);
                ehbVar.B = efzVar5.og;
                ehbVar.C = efzVar5.mR;
                ehbVar.D = efzVar5.oj;
                ehbVar.E = efzVar5.jO;
                ehbVar.F = efzVar5.mw;
                ehbVar.G = efzVar5.gs;
                ehbVar.H = efzVar5.on;
                ehbVar.I = axqq.a(efzVar5.oo);
                ehbVar.f210J = axqq.a(efzVar5.op);
                ehbVar.K = axqq.a(efzVar5.oJ);
                ehbVar.L = efzVar5.oK;
                ehbVar.M = efzVar5.oO;
                ehbVar.N = efzVar5.nA;
                ehbVar.O = efzVar5.ku;
                ehbVar.P = efzVar5.oR;
                ehbVar.Q = axqq.a(efzVar5.fN);
                ehbVar.R = (advs) efzVar5.oS.get();
                ehbVar.S = (adwl) efzVar5.oT.get();
                ehbVar.T = (egd) efzVar5.oU.get();
                ehbVar.U = (acoy) efzVar5.pb.get();
                ehbVar.V = (akmx) efzVar5.pc.get();
                ehbVar.W = efzVar5.pp;
                ehbVar.X = axqq.a(efzVar5.pq);
                ehbVar.Y = efzVar5.ka;
                ehbVar.Z = efzVar5.eO;
                ehbVar.aa = efzVar5.ba;
                ehbVar.ab = efzVar5.lt;
                ehbVar.ac = efzVar5.eE;
                ehbVar.ad = efzVar5.pr;
                ehbVar.ae = efzVar5.ps;
                ehbVar.af = efzVar5.lD;
                ehbVar.ag = efzVar5.nd;
                ehbVar.ah = efzVar5.pt;
                ehbVar.ai = efzVar5.pu;
                ehbVar.aj = efzVar5.lH;
                ehbVar.ak = efzVar5.pw;
                ehbVar.al = axqq.a(efzVar5.dr);
                ehbVar.am = efzVar5.f;
                ehbVar.an = (ayqi) efzVar5.aq.get();
                ehbVar.ao = efzVar5.z;
                ehbVar.ap = efzVar5.ai;
                ehbVar.aq = efzVar5.as;
                ehbVar.ar = efzVar5.cN;
                ehbVar.as = efzVar5.gF;
                ehbVar.at = efzVar5.K;
                ehbVar.au = efzVar5.D;
                ehbVar.av = efzVar5.ne;
                ehbVar.aw = efzVar5.ct;
                ehbVar.ax = efzVar5.cw;
                ehbVar.ay = efzVar5.pD;
                ehbVar.az = efzVar5.pE;
                ehbVar.aA = efzVar5.pF;
                ehbVar.aB = efzVar5.ls;
                ehbVar.aC = efzVar5.pG;
                ehbVar.aD = efzVar5.fX;
                ehbVar.aE = efzVar5.pH;
                ehbVar.aF = efzVar5.hX;
                ehbVar.aG = efzVar5.aw;
                ehbVar.aH = efzVar5.g;
                ehbVar.aI = efzVar5.pJ;
                ehbVar.aJ = efzVar5.pK;
                ehbVar.aK = efzVar5.pM;
                ehbVar.aL = axqq.a(efzVar5.nh);
                axqq.a(efzVar5.p);
                ehbVar.aM = efzVar5.mW;
                ehbVar.aN = efzVar5.rb;
                ehbVar.aO = efzVar5.lm;
                ehbVar.aP = efzVar5.cL;
                ehbVar.aQ = efzVar5.rc;
                ehbVar.aR = efzVar5.T;
                ehbVar.aS = efzVar5.C;
                ehbVar.aT = efzVar5.eZ;
                ehbVar.aU = efzVar5.i;
                ehbVar.aV = efzVar5.re;
                ehbVar.aW = efzVar5.fP;
                ehbVar.aX = efzVar5.rj;
                ehbVar.aY = efzVar5.rl;
                ehbVar.aZ = (aacy) efzVar5.rm.get();
                ehbVar.ba = efzVar5.rp;
                ehbVar.bb = efzVar5.rs;
                ehbVar.bc = efzVar5.ru;
                return ehbVar;
            case 1018:
                return new ajjt(this.a.b.a);
            case 1019:
                return new akrc((aadw) this.a.D.get());
            case 1020:
                efz efzVar6 = this.a;
                return aazr.e((Executor) efzVar6.f.get(), efzVar6.mZ, efzVar6.ak, efzVar6.z, efzVar6.na);
            case 1021:
                return this.a.ey();
            case 1022:
                return aawj.m(this.a.eu());
            case 1023:
                return this.a.cS();
            case 1024:
                return this.a.cT();
            case 1025:
                return this.a.z();
            case 1026:
                return this.a.n();
            case 1027:
                return this.a.o();
            case 1028:
                return this.a.p();
            case 1029:
                return this.a.Y();
            case 1030:
                return this.a.A();
            case 1031:
                return this.a.aj();
            case 1032:
                efz efzVar7 = this.a;
                return new jum(efzVar7.ks, efzVar7.nf, efzVar7.D, axqq.a(efzVar7.nh), efzVar7.aw, efzVar7.kv, efzVar7.as);
            case 1033:
                return this.a.x();
            case 1034:
                return this.a.jJ();
            case 1035:
                return this.a.l();
            case 1036:
                efz efzVar8 = this.a;
                return new ajyw(efzVar8.kv, efzVar8.gH, efzVar8.ni, (short[]) null, (char[]) null, (byte[]) null);
            case 1037:
                return new jti((amsj) this.a.nO.get(), null);
            case 1038:
                efz efzVar9 = this.a;
                amrw i2 = amrz.i(25);
                i2.g(fav.J(agnv.class, aqdb.class), (jtc) efzVar9.nk.get());
                i2.g(fav.J(agni.class, aqbw.class), new jte(efzVar9.b.a));
                i2.g(fav.J(fjs.class, atdn.class), (jtc) efzVar9.nl.get());
                i2.g(fav.J(fjs.class, askh.class), (jtc) efzVar9.nm.get());
                i2.g(fav.J(agnv.class, atde.class), (jtc) efzVar9.nn.get());
                i2.g(fav.J(agnp.class, atde.class), (jtc) efzVar9.no.get());
                i2.g(fav.J(agni.class, atde.class), (jtc) efzVar9.np.get());
                i2.g(fav.J(agni.class, auov.class), new jth(efzVar9.b.a, efzVar9.gH, efzVar9.ni, efzVar9.K));
                i2.g(fav.J(agni.class, aubg.class), new jtg(efzVar9.b.a, (aaea) efzVar9.K.get(), efzVar9.gH, (axzg) efzVar9.ig.get(), null));
                i2.g(fav.J(agnv.class, audj.class), new jtn(efzVar9.b.a, efzVar9.ni));
                i2.g(fav.J(agnp.class, audj.class), (jtc) efzVar9.nq.get());
                i2.g(fav.J(fjs.class, apib.class), (jtc) efzVar9.nr.get());
                i2.g(fav.J(Void.class, aqcm.class), (jtc) efzVar9.ns.get());
                i2.g(fav.J(Void.class, avnb.class), (jtc) efzVar9.nt.get());
                i2.g(fav.J(agnp.class, auwd.class), (jtc) efzVar9.nu.get());
                i2.g(fav.J(awig.class, aqrf.class), (jtc) efzVar9.nD.get());
                i2.g(fav.J(awil.class, aqrf.class), (jtc) efzVar9.nE.get());
                i2.g(fav.J(asxd.class, aqrf.class), (jtc) efzVar9.nF.get());
                i2.g(fav.J(jhv.class, aubs.class), (jtc) efzVar9.nG.get());
                i2.g(fav.J(jht.class, aubw.class), (jtc) efzVar9.nH.get());
                i2.g(fav.J(jht.class, auwd.class), (jtc) efzVar9.nI.get());
                i2.g(fav.J(jht.class, atzr.class), (jtc) efzVar9.nJ.get());
                i2.g(fav.J(jht.class, asfc.class), (jtc) efzVar9.nK.get());
                i2.g(fav.J(agni.class, kyt.class), (jtc) efzVar9.nL.get());
                i2.g(fav.J(agnv.class, kyt.class), (jtc) efzVar9.nN.get());
                return new amsj(i2.c());
            case 1039:
                efz efzVar10 = this.a;
                return new jtl(efzVar10.b.a, efzVar10.ni, (axzf) efzVar10.nj.get(), (shf) efzVar10.g.get(), null, null, null, null);
            case 1040:
                return new axzf((aadw) this.a.D.get());
            case 1041:
                efz efzVar11 = this.a;
                return new jtk(efzVar11.gH, efzVar11.b.a);
            case 1042:
                efz efzVar12 = this.a;
                return new jtj(efzVar12.gH, (fjs) efzVar12.kv.get(), efzVar12.b.a);
            case 1043:
                return new jtm();
            case 1044:
                efz efzVar13 = this.a;
                return new jto(efzVar13.ni, efzVar13.gH);
            case 1045:
                return new jtf();
            case 1046:
                efz efzVar14 = this.a;
                return new jtp(efzVar14.ni, efzVar14.gH);
            case 1047:
                return new jta(this.a.b.a);
            case 1048:
                return new jtr(this.a.b.a);
            case 1049:
                return new jts(this.a.b.a);
            case 1050:
                return new jtq(this.a.b.a);
            case 1051:
                return this.a.ah();
            case 1052:
                return this.a.ae();
            case 1053:
                efz efzVar15 = this.a;
                aadw aadwVar = (aadw) efzVar15.D.get();
                return new axzf(aadwVar);
            case 1054:
                efz efzVar16 = this.a;
                aadw aadwVar2 = (aadw) efzVar16.D.get();
                return new axzf(aadwVar2);
            case 1055:
                return this.a.af();
            case 1056:
                efz efzVar17 = this.a;
                return new jnr(efzVar17.b.a, (anib) efzVar17.f.get(), new jnm((sxd) efzVar17.nx.get(), (gnf) efzVar17.ny.get(), (gni) efzVar17.eA.get(), (anib) efzVar17.f.get()), (aaqz) efzVar17.eq.get(), (afsy) efzVar17.au.get());
            case 1057:
                return this.a.cm();
            case 1058:
                return new gne((sxd) this.a.nx.get());
            case 1059:
                return new amsj((char[]) null, (byte[]) null);
            case 1060:
                return new jss((jng) this.a.nB.get());
            case 1061:
                return new jtb((jng) this.a.nB.get());
            case 1062:
                efz efzVar18 = this.a;
                return new jsu(efzVar18.b.a, (aaea) efzVar18.K.get(), efzVar18.ni);
            case 1063:
                return new jsw();
            case 1064:
                return new jsx(this.a.b.a);
            case 1065:
                return new jsv(this.a.b.a);
            case 1066:
                return new jsz(this.a.ni);
            case 1067:
                return new kyu(this.a.gH);
            case 1068:
                return new kyv(this.a.ag());
            case 1069:
                return new fjm();
            case 1070:
                return this.a.ak();
            case 1071:
                efz efzVar19 = this.a;
                final Context context = efzVar19.b.a;
                final ywr ywrVar = (ywr) efzVar19.nQ.get();
                anhy P = anaf.P(anfq.h(ywrVar.a(), new amml() { // from class: zgu
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        Context context2 = context;
                        ywr ywrVar2 = ywrVar;
                        String str = ((aosg) obj).c;
                        String c = zgx.c(context2.getApplicationContext());
                        boolean z = !c.equals(str);
                        if (z) {
                            ynm.m(ywrVar2.b(new wgs(c, 8)), lra.p);
                        }
                        return Boolean.valueOf(z);
                    }
                }, angq.a));
                ayaw.k(P);
                return P;
            case 1072:
                efz efzVar20 = this.a;
                Context context2 = efzVar20.b.a;
                anib anibVar = (anib) efzVar20.f.get();
                vfg vfgVar = (vfg) efzVar20.p.get();
                vda a = vdb.a(context2);
                a.e("common");
                a.f("common_settings.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.e(aosg.a);
                a3.f(a2);
                vfk d = vfn.d(context2, anibVar);
                d.c = efz.jZ();
                d.b();
                d.d("version");
                d.e(fkm.o);
                a3.b(d.a());
                return new ywp(agcm.e(vfgVar.a(a3.a())), aosg.a);
            case 1073:
                return Boolean.valueOf(((SharedPreferences) this.a.z.get()).getString("visitor_id", null) != null);
            case 1074:
                efz efzVar21 = this.a;
                return new afsm((Executor) efzVar21.f.get(), efzVar21.hz, axqq.a(efzVar21.hk), (ynx) efzVar21.M.get(), efzVar21.fG, amlr.a);
            case 1075:
                return this.a.cL();
            case 1076:
                efz efzVar22 = this.a;
                return ytd.o((Executor) efzVar22.f.get(), (afsm) efzVar22.nT.get());
            case 1077:
                return new akdz((shf) this.a.g.get());
            case 1078:
                return new akec();
            case 1079:
                return new akey((File) this.a.cN.get());
            case 1080:
                efz efzVar23 = this.a;
                return new WatchVideoIndexer(new gwv(new nht((afsy) efzVar23.au.get(), (wcf) efzVar23.hM.get()), null), (afzk) efzVar23.lH.get(), efzVar23.b.a, (ypa) efzVar23.B.get(), (aioc) efzVar23.fY.get(), (aadw) efzVar23.D.get());
            case 1081:
                return new akrk(this.a.B);
            case 1082:
                efz efzVar24 = this.a;
                return new akru(efzVar24.ob, efzVar24.D, efzVar24.aA, efzVar24.B);
            case 1083:
                return rnu.b(this.a.b.a);
            case 1084:
                return this.a.gs();
            case 1085:
                return this.a.gt();
            case 1086:
                return this.a.gr();
            case 1087:
                return this.a.kT();
            case 1088:
                efz efzVar25 = this.a;
                return amsx.s((few) efzVar25.oh.get(), (few) efzVar25.oi.get());
            case 1089:
                return new fev(new alep((shf) this.a.g.get()), null);
            case 1090:
                efz efzVar26 = this.a;
                return new fey(efzVar26.b.a, (shf) efzVar26.g.get());
            case 1091:
                efz efzVar27 = this.a;
                return new agdj(efzVar27.la, efzVar27.gH, efzVar27.ol, ammv.j((agrh) efzVar27.om.get()));
            case 1092:
                efz efzVar28 = this.a;
                return new agqa((agpd) efzVar28.la.get(), (shf) efzVar28.g.get(), (aypn) efzVar28.ok.get());
            case 1093:
                return ahal.E((ahzx) this.a.eQ.get());
            case 1094:
                efz efzVar29 = this.a;
                return new agrh((agof) efzVar29.gH.get(), (aypn) efzVar29.ok.get(), (ayqi) efzVar29.aq.get(), (axzg) efzVar29.gO.get(), null, null, null);
            case 1095:
                efz efzVar30 = this.a;
                return new hah((aahv) efzVar30.dB.get(), (aais) efzVar30.dJ.get(), (Executor) efzVar30.f.get());
            case 1096:
                efz efzVar31 = this.a;
                return new hbd((aahv) efzVar31.dB.get(), (afsy) efzVar31.au.get(), axqq.a(efzVar31.kp), (Executor) efzVar31.f.get(), efzVar31.B, efzVar31.D);
            case 1097:
                efz efzVar32 = this.a;
                return new jjo(efzVar32.oq, efzVar32.B, efzVar32.gH, efzVar32.dB, (Executor) efzVar32.f.get(), efzVar32.ee, efzVar32.ow, efzVar32.oE, efzVar32.oH, efzVar32.oI, efzVar32.aq);
            case 1098:
                return new azos(anaf.E((Executor) this.a.f.get()));
            case 1099:
                efz efzVar33 = this.a;
                return amsx.v((jhg) efzVar33.or.get(), (jhg) efzVar33.os.get(), (jhg) efzVar33.ot.get(), (jhg) efzVar33.ou.get(), (jhg) efzVar33.ov.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return m();
            case 3:
                return n();
            case 4:
                switch (i) {
                    case 400:
                        return this.a.hN();
                    case 401:
                        return this.a.bP();
                    case 402:
                        return this.a.bO();
                    case 403:
                        return ytd.d(this.a.b.a, amlr.a);
                    case 404:
                        return new zia((zhz) this.a.fw.get());
                    case 405:
                        return this.a.bZ();
                    case 406:
                        return this.a.bF();
                    case 407:
                        return this.a.gv();
                    case 408:
                        return this.a.cR();
                    case 409:
                        return this.a.cP();
                    case 410:
                        return this.a.V();
                    case 411:
                        return abfm.c();
                    case 412:
                        return this.a.cQ();
                    case 413:
                        return this.a.bQ();
                    case 414:
                        return this.a.cN();
                    case 415:
                        return abfm.e();
                    case 416:
                        return new ajun((char[]) null);
                    case 417:
                        return this.a.bT();
                    case 418:
                        return ajbp.k();
                    case 419:
                        return this.a.gu();
                    case 420:
                        return this.a.kx();
                    case 421:
                        return this.a.kZ();
                    case 422:
                        return this.a.iN();
                    case 423:
                        return efz.jY();
                    case 424:
                        return this.a.bL();
                    case 425:
                        return this.a.bJ();
                    case 426:
                        return xuq.d();
                    case 427:
                        return this.a.ex();
                    case 428:
                        return this.a.bH();
                    case 429:
                        return this.a.iD();
                    case 430:
                        return this.a.cq();
                    case 431:
                        return this.a.fQ();
                    case 432:
                        return this.a.fZ();
                    case 433:
                        return this.a.cs();
                    case 434:
                        return this.a.iw();
                    case 435:
                        return this.a.bw();
                    case 436:
                        return this.a.gi();
                    case 437:
                        return this.a.gh();
                    case 438:
                        return this.a.fU();
                    case 439:
                        return this.a.kF();
                    case 440:
                        return this.a.kQ();
                    case 441:
                        return this.a.gb();
                    case 442:
                        return this.a.fR();
                    case 443:
                        return this.a.fO();
                    case 444:
                        return this.a.fS();
                    case 445:
                        return this.a.fX();
                    case 446:
                        return this.a.gc();
                    case 447:
                        return this.a.gd();
                    case 448:
                        return this.a.dL();
                    case 449:
                        return this.a.dK();
                    case 450:
                        return this.a.dG();
                    case 451:
                        return this.a.hl();
                    case 452:
                        return new ansv(true);
                    case 453:
                        return new yjk();
                    case 454:
                        return this.a.kw();
                    case 455:
                        return this.a.ik();
                    case 456:
                        return this.a.co();
                    case 457:
                        return this.a.en();
                    case 458:
                        return this.a.iL();
                    case 459:
                        return this.a.kd();
                    case 460:
                        return this.a.bS();
                    case 461:
                        return this.a.er();
                    case 462:
                        return this.a.hi();
                    case 463:
                        return this.a.kD();
                    case 464:
                        return this.a.hJ();
                    case 465:
                        return this.a.iV();
                    case 466:
                        return this.a.hI();
                    case 467:
                        return this.a.dQ();
                    case 468:
                        return this.a.eo();
                    case 469:
                        return this.a.iW();
                    case 470:
                        return this.a.dU();
                    case 471:
                        return this.a.dV();
                    case 472:
                        return this.a.dW();
                    case 473:
                        return this.a.dX();
                    case 474:
                        return this.a.ea();
                    case 475:
                        return this.a.eg();
                    case 476:
                        return this.a.dY();
                    case 477:
                        return this.a.gT();
                    case 478:
                        return this.a.dZ();
                    case 479:
                        return this.a.gq();
                    case 480:
                        return ajbp.d();
                    case 481:
                        return this.a.el();
                    case 482:
                        return this.a.fd();
                    case 483:
                        return this.a.dI();
                    case 484:
                        return this.a.dH();
                    case 485:
                        return this.a.dR();
                    case 486:
                        return abfm.f();
                    case 487:
                        return new afhz();
                    case 488:
                        return this.a.dJ();
                    case 489:
                        return abfm.o();
                    case 490:
                        return this.a.ia();
                    case 491:
                        return this.a.dO();
                    case 492:
                        return aawj.k((aenf) this.a.gm.get());
                    case 493:
                        return this.a.eq();
                    case 494:
                        return this.a.ep();
                    case 495:
                        return this.a.ed();
                    case 496:
                        return this.a.fV();
                    case 497:
                        return this.a.dF();
                    case 498:
                        return afhy.l();
                    case 499:
                        return abfm.j();
                    default:
                        throw new AssertionError(i);
                }
            case 5:
                return o();
            case 6:
                return p();
            case 7:
                return q();
            case 8:
                switch (i) {
                    case 800:
                        return this.a.fj();
                    case 801:
                        return this.a.fM();
                    case 802:
                        return this.a.fY();
                    case 803:
                        return null;
                    case 804:
                        return this.a.kL();
                    case 805:
                        return this.a.kJ();
                    case 806:
                        return this.a.eD();
                    case 807:
                        return this.a.eb();
                    case 808:
                        return this.a.ek();
                    case 809:
                        return this.a.fh();
                    case 810:
                        return this.a.fi();
                    case 811:
                        return this.a.fK();
                    case 812:
                        return this.a.fk();
                    case 813:
                        return this.a.fq();
                    case 814:
                        return this.a.fp();
                    case 815:
                        return this.a.kP();
                    case 816:
                        return this.a.fu();
                    case 817:
                        return this.a.fz();
                    case 818:
                        return this.a.fA();
                    case 819:
                        return this.a.fy();
                    case 820:
                        return this.a.fe();
                    case 821:
                        return this.a.fF();
                    case 822:
                        return this.a.hj();
                    case 823:
                        return this.a.fB();
                    case 824:
                        return this.a.fE();
                    case 825:
                        return this.a.fD();
                    case 826:
                        return new agva();
                    case 827:
                        return this.a.hV();
                    case 828:
                        return new agvi();
                    case 829:
                        return new agvg();
                    case 830:
                        return azqv.aq(agul.INACTIVE);
                    case 831:
                        return this.a.fm();
                    case 832:
                        return this.a.iM();
                    case 833:
                        return new agwn(1);
                    case 834:
                        return this.a.fI();
                    case 835:
                        return this.a.fJ();
                    case 836:
                        return this.a.cH();
                    case 837:
                        return this.a.cI();
                    case 838:
                        return this.a.W();
                    case 839:
                        return this.a.at();
                    case 840:
                        return this.a.as();
                    case 841:
                        return this.a.L();
                    case 842:
                        return this.a.O();
                    case 843:
                        return this.a.lk();
                    case 844:
                        return this.a.kC();
                    case 845:
                        return this.a.N();
                    case 846:
                        return this.a.aw();
                    case 847:
                        return this.a.ar();
                    case 848:
                        return this.a.ha();
                    case 849:
                        return this.a.bq();
                    case 850:
                        return this.a.bp();
                    case 851:
                        return this.a.bR();
                    case 852:
                        return this.a.jD();
                    case 853:
                        return this.a.fW();
                    case 854:
                        return this.a.ij();
                    case 855:
                        return this.a.fG();
                    case 856:
                        return this.a.fH();
                    case 857:
                        return this.a.bA();
                    case 858:
                        return this.a.fc();
                    case 859:
                        return this.a.ko();
                    case 860:
                        return this.a.bz();
                    case 861:
                        return this.a.cg();
                    case 862:
                        return this.a.y();
                    case 863:
                        return this.a.cF();
                    case 864:
                        return this.a.ii();
                    case 865:
                        return this.a.ez();
                    case 866:
                        return this.a.hU();
                    case 867:
                        return this.a.C();
                    case 868:
                        return this.a.eG();
                    case 869:
                        return this.a.J();
                    case 870:
                        return this.a.eV();
                    case 871:
                        return this.a.eQ();
                    case 872:
                        return this.a.eU();
                    case 873:
                        return this.a.lc();
                    case 874:
                        return this.a.hX();
                    case 875:
                        return this.a.kO();
                    case 876:
                        return this.a.hO();
                    case 877:
                        return this.a.eO();
                    case 878:
                        return this.a.eM();
                    case 879:
                        return this.a.eN();
                    case 880:
                        FirebaseMessaging a = FirebaseMessaging.a();
                        ayaw.k(a);
                        return a;
                    case 881:
                        return new agar();
                    case 882:
                        return new yjk();
                    case 883:
                        return this.a.eR();
                    case 884:
                        return this.a.la();
                    case 885:
                        return this.a.ck();
                    case 886:
                        return this.a.cj();
                    case 887:
                        return this.a.ci();
                    case 888:
                        return this.a.R();
                    case 889:
                        return this.a.S();
                    case 890:
                        return new hbb();
                    case 891:
                        return this.a.cO();
                    case 892:
                        return this.a.kh();
                    case 893:
                        return this.a.w();
                    case 894:
                        return this.a.dn();
                    case 895:
                        return this.a.cZ();
                    case 896:
                        return this.a.da();
                    case 897:
                        return this.a.k();
                    case 898:
                        return this.a.hn();
                    case 899:
                        return this.a.ki();
                    default:
                        throw new AssertionError(i);
                }
            case 9:
                switch (i) {
                    case 900:
                        return this.a.km();
                    case 901:
                        return this.a.eP();
                    case 902:
                        return this.a.iv();
                    case 903:
                        return this.a.eE();
                    case 904:
                        return this.a.kl();
                    case 905:
                        return this.a.kk();
                    case 906:
                        return this.a.kq();
                    case 907:
                        return this.a.ca();
                    case 908:
                        return this.a.kE();
                    case 909:
                        return this.a.cc();
                    case 910:
                        return this.a.cb();
                    case 911:
                        return this.a.eT();
                    case 912:
                        return this.a.cC();
                    case 913:
                        return this.a.cB();
                    case 914:
                        return this.a.cl();
                    case 915:
                        return this.a.G();
                    case 916:
                        return this.a.gk();
                    case 917:
                        return this.a.v();
                    case 918:
                        return this.a.cD();
                    case 919:
                        return this.a.bx();
                    case 920:
                        return this.a.cw();
                    case 921:
                        return new adyu();
                    case 922:
                        return this.a.H();
                    case 923:
                        return this.a.cG();
                    case 924:
                        return this.a.bt();
                    case 925:
                        return this.a.eB();
                    case 926:
                        return this.a.cE();
                    case 927:
                        return this.a.jI();
                    case 928:
                        return this.a.eF();
                    case 929:
                        return new aear();
                    case 930:
                        return this.a.q();
                    case 931:
                        return this.a.Q();
                    case 932:
                        return this.a.eL();
                    case 933:
                        return this.a.le();
                    case 934:
                        return new afzf(this.a.as);
                    case 935:
                        return this.a.eH();
                    case 936:
                        return this.a.eI();
                    case 937:
                        return this.a.eK();
                    case 938:
                        return this.a.eJ();
                    case 939:
                        return this.a.dc();
                    case 940:
                        return this.a.lm();
                    case 941:
                        return this.a.dv();
                    case 942:
                        return this.a.dw();
                    case 943:
                        return this.a.hE();
                    case 944:
                        return this.a.jH();
                    case 945:
                        return Boolean.valueOf(this.a.jt());
                    case 946:
                        return this.a.db();
                    case 947:
                        return this.a.dt();
                    case 948:
                        return this.a.dr();
                    case 949:
                        return this.a.cX();
                    case 950:
                        return this.a.du();
                    case 951:
                        return this.a.eS();
                    case 952:
                        return this.a.gn();
                    case 953:
                        return this.a.gm();
                    case 954:
                        return this.a.gl();
                    case 955:
                        return this.a.go();
                    case 956:
                        return new akmq();
                    case 957:
                        return new wiw();
                    case 958:
                        return this.a.bf();
                    case 959:
                        return this.a.iz();
                    case 960:
                        return this.a.cK();
                    case 961:
                        return this.a.bi();
                    case 962:
                        return this.a.cu();
                    case 963:
                        return this.a.it();
                    case 964:
                        return this.a.kG();
                    case 965:
                        return this.a.hQ();
                    case 966:
                        return this.a.fa();
                    case 967:
                        return this.a.eZ();
                    case 968:
                        return this.a.kp();
                    case 969:
                        return this.a.fw();
                    case 970:
                        return this.a.fx();
                    case 971:
                        return this.a.kn();
                    case 972:
                        return this.a.ac();
                    case 973:
                        return this.a.kR();
                    case 974:
                        return this.a.eW();
                    case 975:
                        return this.a.aa();
                    case 976:
                        return this.a.ab();
                    case 977:
                        return this.a.al();
                    case 978:
                        return this.a.ad();
                    case 979:
                        return this.a.eY();
                    case 980:
                        return this.a.fn();
                    case 981:
                        return this.a.eX();
                    case 982:
                        return this.a.fo();
                    case 983:
                        return this.a.fb();
                    case 984:
                        return this.a.gy();
                    case 985:
                        return this.a.gA();
                    case 986:
                        return this.a.gB();
                    case 987:
                        return this.a.gC();
                    case 988:
                        return this.a.ld();
                    case 989:
                        return this.a.ku();
                    case 990:
                        return this.a.lb();
                    case 991:
                        return this.a.kt();
                    case 992:
                        return this.a.gE();
                    case 993:
                        return this.a.gK();
                    case 994:
                        return this.a.gH();
                    case 995:
                        return this.a.lf();
                    case 996:
                        return this.a.gG();
                    case 997:
                        return this.a.gJ();
                    case 998:
                        return this.a.gF();
                    case 999:
                        return this.a.gI();
                    default:
                        throw new AssertionError(i);
                }
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                return g();
            case 15:
                return h();
            case 16:
                return i();
            case 17:
                return j();
            case 18:
                return k();
            default:
                return l();
        }
    }

    private final Object o() {
        Object a;
        int i = this.b;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 500:
                efz efzVar = this.a;
                return svf.m(adwi.c((afhs) efzVar.gg.get(), (affs) efzVar.gB.get(), (affq) efzVar.gC.get()), (anic) efzVar.f.get(), (afhs) efzVar.gg.get(), (acsy) efzVar.ee.get(), (acpl) efzVar.aw.get(), (afsy) efzVar.au.get());
            case 501:
                return aawj.l(this.a.b.a);
            case 502:
                return abfm.k();
            case 503:
                return abfm.g();
            case 504:
                return this.a.ff();
            case 505:
                return this.a.bU();
            case 506:
                efz efzVar2 = this.a;
                return new agzz((SharedPreferences) efzVar2.z.get(), (afsy) efzVar2.au.get());
            case 507:
                efz efzVar3 = this.a;
                return new agrc((aaea) efzVar3.K.get(), efzVar3.gH, efzVar3.gW, (ScheduledExecutorService) efzVar3.f.get());
            case 508:
                return this.a.fl();
            case 509:
                efz efzVar4 = this.a;
                return new agsm((SharedPreferences) efzVar4.z.get(), (aadw) efzVar4.D.get(), (afsy) efzVar4.au.get(), efzVar4.gH);
            case 510:
                efz efzVar5 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) efzVar5.z.get();
                fka fkaVar = (fka) efzVar5.gN.get();
                aaea aaeaVar = (aaea) efzVar5.K.get();
                int intValue = efzVar5.ho().intValue();
                ysy ysyVar = (ysy) efzVar5.as.get();
                return new jup(sharedPreferences, fkaVar, aaeaVar, intValue, ysyVar, (agsd) efzVar5.gS.get(), (shf) efzVar5.g.get(), (axzf) efzVar5.gT.get(), null, null, null);
            case 511:
                efz efzVar6 = this.a;
                return new fka((ywr) efzVar6.gL.get(), (ywr) efzVar6.gM.get(), efzVar6.gK);
            case 512:
                efz efzVar7 = this.a;
                azrw azrwVar = efzVar7.gJ;
                azrw azrwVar2 = efzVar7.au;
                azrw azrwVar3 = efzVar7.gK;
                if (fkr.d((aadw) efzVar7.D.get())) {
                    a = (ywr) azrwVar3.get();
                } else {
                    zzw zzwVar = (zzw) azrwVar.get();
                    final afsy afsyVar = (afsy) azrwVar2.get();
                    a = zzwVar.a(new amml() { // from class: agse
                        @Override // defpackage.amml
                        public final Object apply(Object obj) {
                            if (i2 == 0) {
                                afsy afsyVar2 = afsyVar;
                                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                                aone createBuilder = awwj.a.createBuilder();
                                String d = afsyVar2.c().d();
                                if (!TextUtils.isEmpty(d)) {
                                    String L = yny.L("offline_auto_offline_time_%s", d);
                                    aone createBuilder2 = awwh.a.createBuilder();
                                    long j = sharedPreferences2.getLong(L, 0L);
                                    createBuilder2.copyOnWrite();
                                    awwh awwhVar = (awwh) createBuilder2.instance;
                                    awwhVar.b = 1 | awwhVar.b;
                                    awwhVar.c = j;
                                    createBuilder.by(d, (awwh) createBuilder2.build());
                                }
                                return (awwj) createBuilder.build();
                            }
                            afsy afsyVar3 = afsyVar;
                            SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                            amsx amsxVar = fkr.a;
                            aone createBuilder3 = fkg.a.createBuilder();
                            sharedPreferences3.getClass();
                            fkq fkqVar = new fkq(sharedPreferences3, 1);
                            sharedPreferences3.getClass();
                            fkq fkqVar2 = new fkq(sharedPreferences3, 2);
                            sharedPreferences3.getClass();
                            fkq fkqVar3 = new fkq(sharedPreferences3, 0);
                            sharedPreferences3.getClass();
                            fkr.f(createBuilder3, fkqVar, fkqVar2, fkqVar3, new fkn(sharedPreferences3));
                            String d2 = afsyVar3.c().d();
                            if (!TextUtils.isEmpty(d2)) {
                                String L2 = yny.L("offline_access_enabled%s", d2);
                                String L3 = yny.L("offline_access_updated_at%s", d2);
                                aone createBuilder4 = fkb.a.createBuilder();
                                boolean z = sharedPreferences3.getBoolean(L2, false);
                                createBuilder4.copyOnWrite();
                                fkb fkbVar = (fkb) createBuilder4.instance;
                                fkbVar.b = 1 | fkbVar.b;
                                fkbVar.c = z;
                                long j2 = sharedPreferences3.getLong(L3, 0L);
                                createBuilder4.copyOnWrite();
                                fkb fkbVar2 = (fkb) createBuilder4.instance;
                                fkbVar2.b |= 2;
                                fkbVar2.d = j2;
                                createBuilder3.i(d2, (fkb) createBuilder4.build());
                            }
                            return (fkg) createBuilder3.build();
                        }
                    }, fkp.a, fkg.a);
                }
                ayaw.k(a);
                return a;
            case 513:
                return this.a.kH();
            case 514:
                efz efzVar8 = this.a;
                return fkr.c(efzVar8.b.a, (anib) efzVar8.f.get(), efz.jZ(), (vfg) efzVar8.p.get(), efzVar8.z, (aadw) efzVar8.D.get());
            case 515:
                efz efzVar9 = this.a;
                azrw azrwVar4 = efzVar9.gJ;
                Context context = efzVar9.b.a;
                anib anibVar = (anib) efzVar9.f.get();
                vfg vfgVar = (vfg) efzVar9.p.get();
                azrw azrwVar5 = efzVar9.z;
                azrw azrwVar6 = efzVar9.v;
                if (!fkr.d((aadw) efzVar9.D.get())) {
                    return ((zzw) azrwVar4.get()).a(fjw.e, fkp.b, fke.a);
                }
                ylr ylrVar = (ylr) azrwVar6.get();
                vda a2 = vdb.a(context);
                a2.e("offline");
                a2.f("offlinemainbackedup.pb");
                Uri a3 = a2.a();
                vfe a4 = vff.a();
                a4.e(fke.a);
                a4.f(a3);
                vfk d = vfn.d(context, anibVar);
                d.c = efz.jZ();
                d.d((String[]) fkr.a.toArray(new String[fkr.a.size()]));
                d.e(fkm.b);
                a4.b(d.a());
                ywu d2 = ywv.d(azrwVar5, anibVar);
                d2.a = eri.l;
                d2.b(fjw.g);
                d2.b = fjw.f;
                d2.c = fkp.c;
                a4.b(d2.a());
                return ylrVar.a(agcm.e(vfgVar.a(a4.a())), fke.a);
            case 516:
                return this.a.fL();
            case 517:
                efz efzVar10 = this.a;
                return new axzg((aadw) efzVar10.D.get(), (aaea) efzVar10.K.get());
            case 518:
                efz efzVar11 = this.a;
                aadw aadwVar = (aadw) efzVar11.D.get();
                return new axzf(aadwVar);
            case 519:
                efz efzVar12 = this.a;
                return new agsd((ywr) efzVar12.gQ.get(), (ywr) efzVar12.gR.get());
            case 520:
                efz efzVar13 = this.a;
                Context context2 = efzVar13.b.a;
                vfg vfgVar2 = (vfg) efzVar13.p.get();
                vda a5 = vdb.a(context2);
                a5.e("offline");
                a5.f("offline_settings.schema.pb");
                Uri a6 = a5.a();
                vfe a7 = vff.a();
                a7.e(awwj.a);
                a7.f(a6);
                return new ywp(agcm.e(vfgVar2.a(a7.a())), awwj.a);
            case 521:
                efz efzVar14 = this.a;
                zzw kH = efzVar14.kH();
                final afsy afsyVar2 = (afsy) efzVar14.au.get();
                return kH.a(new amml() { // from class: agse
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        if (i3 == 0) {
                            afsy afsyVar22 = afsyVar2;
                            SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                            aone createBuilder = awwj.a.createBuilder();
                            String d3 = afsyVar22.c().d();
                            if (!TextUtils.isEmpty(d3)) {
                                String L = yny.L("offline_auto_offline_time_%s", d3);
                                aone createBuilder2 = awwh.a.createBuilder();
                                long j = sharedPreferences2.getLong(L, 0L);
                                createBuilder2.copyOnWrite();
                                awwh awwhVar = (awwh) createBuilder2.instance;
                                awwhVar.b = 1 | awwhVar.b;
                                awwhVar.c = j;
                                createBuilder.by(d3, (awwh) createBuilder2.build());
                            }
                            return (awwj) createBuilder.build();
                        }
                        afsy afsyVar3 = afsyVar2;
                        SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                        amsx amsxVar = fkr.a;
                        aone createBuilder3 = fkg.a.createBuilder();
                        sharedPreferences3.getClass();
                        fkq fkqVar = new fkq(sharedPreferences3, 1);
                        sharedPreferences3.getClass();
                        fkq fkqVar2 = new fkq(sharedPreferences3, 2);
                        sharedPreferences3.getClass();
                        fkq fkqVar3 = new fkq(sharedPreferences3, 0);
                        sharedPreferences3.getClass();
                        fkr.f(createBuilder3, fkqVar, fkqVar2, fkqVar3, new fkn(sharedPreferences3));
                        String d22 = afsyVar3.c().d();
                        if (!TextUtils.isEmpty(d22)) {
                            String L2 = yny.L("offline_access_enabled%s", d22);
                            String L3 = yny.L("offline_access_updated_at%s", d22);
                            aone createBuilder4 = fkb.a.createBuilder();
                            boolean z = sharedPreferences3.getBoolean(L2, false);
                            createBuilder4.copyOnWrite();
                            fkb fkbVar = (fkb) createBuilder4.instance;
                            fkbVar.b = 1 | fkbVar.b;
                            fkbVar.c = z;
                            long j2 = sharedPreferences3.getLong(L3, 0L);
                            createBuilder4.copyOnWrite();
                            fkb fkbVar2 = (fkb) createBuilder4.instance;
                            fkbVar2.b |= 2;
                            fkbVar2.d = j2;
                            createBuilder3.i(d22, (fkb) createBuilder4.build());
                        }
                        return (fkg) createBuilder3.build();
                    }
                }, afrl.h, awwj.a);
            case 522:
                return this.a.lg();
            case 523:
                return this.a.cM();
            case 524:
                efz efzVar15 = this.a;
                return new aghg((ypa) efzVar15.B.get(), (aaea) efzVar15.K.get(), (ScheduledExecutorService) efzVar15.f.get(), efzVar15.fX, efzVar15.gH, efzVar15.gZ, efzVar15.ha, efzVar15.gW);
            case 525:
                efz efzVar16 = this.a;
                return new agth((aadw) efzVar16.D.get(), efzVar16.gH, efzVar16.gX, efzVar16.gY);
            case 526:
                return this.a.fv();
            case 527:
                efz efzVar17 = this.a;
                return new agte((agof) efzVar17.gH.get(), (Key) efzVar17.gb.get());
            case 528:
                return this.a.gx();
            case 529:
                return new aksn((acpl) this.a.aw.get());
            case 530:
                efz efzVar18 = this.a;
                Context context3 = efzVar18.b.a;
                afhs afhsVar = (afhs) efzVar18.gg.get();
                aemd aemdVar = (aemd) efzVar18.hf.get();
                ysy ysyVar2 = (ysy) efzVar18.as.get();
                afix em = efzVar18.em();
                azrw azrwVar7 = efzVar18.hg;
                afkn et = efzVar18.et();
                String str = (String) efzVar18.fv.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) efzVar18.f.get();
                axpg a8 = axqq.a(efzVar18.G);
                aenf aenfVar = (aenf) efzVar18.gm.get();
                afhf afhfVar = (afhf) efzVar18.hh.get();
                aaoz aaozVar = (aaoz) efzVar18.gc.get();
                adyl adylVar = (adyl) efzVar18.gq.get();
                aeez dN = efzVar18.dN();
                ptk ptkVar = (ptk) efzVar18.gE.get();
                axfg axfgVar = (axfg) efzVar18.hj.get();
                aeqg aeqgVar = (aeqg) efzVar18.hn.get();
                shf shfVar = (shf) efzVar18.g.get();
                shf shfVar2 = (shf) efzVar18.ho.get();
                aehs aehsVar = (aehs) efzVar18.gv.get();
                affe affeVar = (affe) efzVar18.gj.get();
                afhw afhwVar = (afhw) efzVar18.hq.get();
                aejn aejnVar = (aejn) efzVar18.go.get();
                afcu afcuVar = (afcu) efzVar18.gA.get();
                aeet aeetVar = (aeet) efzVar18.hi.get();
                azrw azrwVar8 = efzVar18.hr;
                aexw aexwVar = (aexw) efzVar18.hs.get();
                afdq afdqVar = (afdq) efzVar18.ht.get();
                afeu ef = efzVar18.ef();
                aezm c = aezu.c((ysy) efzVar18.as.get(), efzVar18.ef(), (afhs) efzVar18.gg.get());
                return adwc.b(context3, afhsVar, aemdVar, ysyVar2, em, azrwVar7, et, str, scheduledExecutorService, a8, aenfVar, afhfVar, aaozVar, adylVar, dN, ptkVar, axfgVar, aeqgVar, shfVar, shfVar2, aehsVar, affeVar, afhwVar, aejnVar, afcuVar, aeetVar, azrwVar8, aexwVar, afdqVar, ef, c, (yss) efzVar18.hv.get(), (afgb) efzVar18.gD.get(), (adyj) efzVar18.gp.get(), (afgt) efzVar18.hI.get());
            case 531:
                return new ailw((ailv) this.a.he.get());
            case 532:
                efz efzVar19 = this.a;
                amrz l = amrz.l("/pudl", new agqw((shf) efzVar19.g.get(), (afhf) efzVar19.hb.get()), "/exocache", new ailr((afhf) efzVar19.hc.get()));
                boolean booleanValue = ((Boolean) efzVar19.hd.get()).booleanValue();
                try {
                    ailv ailvVar = new ailv(l, booleanValue);
                    ailvVar.e = new ServerSocket();
                    ailvVar.e.bind(new InetSocketAddress(ailvVar.d ? InetAddress.getByAddress("loopback", new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}) : InetAddress.getByAddress("loopback", new byte[]{Byte.MAX_VALUE, 0, 0, 1}), 0));
                    ailvVar.f = Executors.newSingleThreadExecutor(new yna("mediaReq"));
                    ailvVar.f.execute(new ails(ailvVar));
                    return ailvVar;
                } catch (Exception e) {
                    zga.d("Exception starting MediaServer", e);
                    return null;
                }
            case 533:
                efz efzVar20 = this.a;
                return afit.b((afit) efzVar20.gt.get(), afit.b(new agpw((agei) efzVar20.gr.get(), efzVar20.eh(), (afhz) efzVar20.gs.get(), (axzg) efzVar20.eY.get(), null, null), agtc.b));
            case 534:
                return this.a.ej();
            case 535:
                return this.a.gV();
            case 536:
                return false;
            case 537:
                aeph a9 = ((agof) this.a.gH.get()).a().a();
                ayaw.k(a9);
                return a9;
            case 538:
                efz efzVar21 = this.a;
                return abev.i((aaoz) efzVar21.gc.get(), efzVar21.em());
            case 539:
                return this.a.dM();
            case 540:
                return abfm.h();
            case 541:
                efz efzVar22 = this.a;
                return advr.d(efzVar22.ec(), efzVar22.eC(), (afvb) efzVar22.hm.get());
            case 542:
                return this.a.ew();
            case 543:
                return this.a.bY();
            case 544:
                efz efzVar23 = this.a;
                return oux.d(efzVar23.b.a, (afqb) efzVar23.dk.get());
            case 545:
                return this.a.hg();
            case 546:
                efz efzVar24 = this.a;
                return abev.m((aaea) efzVar24.K.get(), new zhr(0), (afjj) efzVar24.gd.get());
            case 547:
                return this.a.ho();
            case 548:
                return afhy.a();
            case 549:
                return rqe.a(this.a.b.a);
            case 550:
                return abfm.i();
            case 551:
                return this.a.ee();
            case 552:
                efz efzVar25 = this.a;
                aaea aaeaVar2 = (aaea) efzVar25.K.get();
                yss yssVar = (yss) efzVar25.hu.get();
                abev.j(aaeaVar2, yssVar);
                return yssVar;
            case 553:
                return wzt.g(this.a.bK());
            case 554:
                efz efzVar26 = this.a;
                return new afgt((shf) efzVar26.g.get(), (shf) efzVar26.ho.get(), efzVar26.b.a, (afqj) efzVar26.hk.get(), (aaea) efzVar26.K.get(), new afgw((afuh) efzVar26.hz.get(), (afqm) efzVar26.hA.get(), (ysy) efzVar26.as.get(), (zfe) efzVar26.hB.get(), (afqj) efzVar26.hk.get(), (afhz) efzVar26.gs.get(), (ScheduledExecutorService) efzVar26.f.get(), (Executor) efzVar26.f.get(), (afsy) efzVar26.au.get(), axqq.a(efzVar26.hD), axqq.a(efzVar26.hE), axqq.a(efzVar26.gx), (List) efzVar26.hH.get(), efzVar26.b.a, (adxx) efzVar26.ga.get(), (afhs) efzVar26.gg.get()));
            case 555:
                efz efzVar27 = this.a;
                return efzVar27.kz().a(efzVar27.iJ());
            case 556:
                return this.a.eA();
            case 557:
                return afpv.b((yoc) this.a.hw.get());
            case 558:
                return this.a.bD();
            case 559:
                return "keyValueByteStores";
            case 560:
                return new afqr((ynx) this.a.M.get());
            case 561:
                return ote.f((wco) this.a.dc.get());
            case 562:
                return new afuj((ylf) this.a.ai.get());
            case 563:
                return ahal.c((afql) this.a.hx.get());
            case 564:
                return this.a.bX();
            case 565:
                return this.a.gX();
            case 566:
                return aawj.f((aemv) this.a.hC.get());
            case 567:
                efz efzVar28 = this.a;
                return afqe.I((afgr) efzVar28.hF.get(), (afgr) efzVar28.hG.get());
            case 568:
                return abfm.l();
            case 569:
                return afhy.b();
            case 570:
                efz efzVar29 = this.a;
                return new WillAutonavInformer((ywr) efzVar29.hL.get(), (ypa) efzVar29.B.get(), (wcf) efzVar29.hM.get(), (afsy) efzVar29.au.get(), ammv.j(Boolean.valueOf(enq.D((aadw) efzVar29.D.get()))), (axzg) efzVar29.hN.get(), (yxx) efzVar29.k.get(), null, null);
            case 571:
                ywr ywrVar = (ywr) this.a.hK.get();
                ayaw.k(ywrVar);
                return ywrVar;
            case 572:
                return this.a.bC();
            case 573:
                return this.a.bg();
            case 574:
                efz efzVar30 = this.a;
                return new axzg((aadw) efzVar30.D.get(), (aaea) efzVar30.K.get());
            case 575:
                return this.a.fN();
            case 576:
                return afpv.D((ahzx) this.a.eQ.get());
            case 577:
                efz efzVar31 = this.a;
                return new keg((ywr) efzVar31.hL.get(), (ywr) efzVar31.hS.get(), (Executor) efzVar31.i.get(), (WillAutonavInformer) efzVar31.hO.get());
            case 578:
                efz efzVar32 = this.a;
                azrw azrwVar9 = efzVar32.hQ;
                azrw azrwVar10 = efzVar32.hR;
                atfq atfqVar = ((aadw) efzVar32.D.get()).b().o;
                if (atfqVar == null) {
                    atfqVar = atfq.a;
                }
                auie auieVar = atfqVar.g;
                if (auieVar == null) {
                    auieVar = auie.a;
                }
                ywr ywrVar2 = auieVar.d ? (ywr) azrwVar10.get() : (ywr) azrwVar9.get();
                ayaw.k(ywrVar2);
                return ywrVar2;
            case 579:
                zzw kH2 = this.a.kH();
                final fnx fnxVar = fnx.a;
                return kH2.a(new amml() { // from class: fnw
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        fnx fnxVar2 = fnx.this;
                        SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                        if (sharedPreferences2 == null) {
                            return fnxVar2;
                        }
                        aone createBuilder = fnx.a.createBuilder();
                        if (sharedPreferences2.contains(fav.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING)) {
                            int i4 = sharedPreferences2.getInt(fav.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, 1);
                            createBuilder.copyOnWrite();
                            fnx fnxVar3 = (fnx) createBuilder.instance;
                            fnxVar3.b = 1 | fnxVar3.b;
                            fnxVar3.c = i4;
                        }
                        return (fnx) createBuilder.build();
                    }
                }, fkp.e, fnxVar);
            case 580:
                return this.a.bB();
            case 581:
                efz efzVar33 = this.a;
                return new aarr(efzVar33.eq, (aaea) efzVar33.K.get(), (afsy) efzVar33.au.get());
            case 582:
                return this.a.fT();
            case 583:
                efz efzVar34 = this.a;
                return aazr.b((SharedPreferences) efzVar34.z.get(), efzVar34.hY, efzVar34.ax, (aacu) efzVar34.ia.get(), (Executor) efzVar34.f.get());
            case 584:
                return xuq.l();
            case 585:
                return abfm.a();
            case 586:
                return xuq.q();
            case 587:
                return this.a.X();
            case 588:
                return this.a.s();
            case 589:
                efz efzVar35 = this.a;
                return whl.n(efzVar35.b.a, "commonui", "bedtime_proto.pb", (vfg) efzVar35.p.get(), eok.a);
            case 590:
                efz efzVar36 = this.a;
                return whl.n(efzVar36.b.a, "commonui", "bedtime_setting_proto.pb", (vfg) efzVar36.p.get(), eom.a);
            case 591:
                efz efzVar37 = this.a;
                return new eqa(efzVar37.b.a, efzVar37.ie, (aadw) efzVar37.D.get(), (eni) efzVar37.cL.get(), (Executor) efzVar37.f.get(), (ayqi) efzVar37.aq.get());
            case 592:
                return new aloh(this.a.b.a, (byte[]) null, (byte[]) null);
            case 593:
                efz efzVar38 = this.a;
                return new axzg((aadw) efzVar38.D.get(), (aaea) efzVar38.K.get());
            case 594:
                return new ggn((gfy) this.a.in.get());
            case 595:
                efz efzVar39 = this.a;
                return new gfy((ypa) efzVar39.B.get(), (ysy) efzVar39.as.get(), (aaea) efzVar39.K.get(), (ywr) efzVar39.il.get(), (aypn) efzVar39.gf.get(), (Executor) efzVar39.i.get(), (ayqi) efzVar39.im.get(), (ayqi) efzVar39.aq.get());
            case 596:
                efz efzVar40 = this.a;
                azrw azrwVar11 = efzVar40.ij;
                azrw azrwVar12 = efzVar40.ik;
                aadw aadwVar2 = (aadw) efzVar40.D.get();
                String[] strArr = fod.a;
                atfq atfqVar2 = aadwVar2.b().o;
                if (atfqVar2 == null) {
                    atfqVar2 = atfq.a;
                }
                auie auieVar2 = atfqVar2.g;
                if (auieVar2 == null) {
                    auieVar2 = auie.a;
                }
                ywr ywrVar3 = auieVar2.d ? (ywr) azrwVar12.get() : (ywr) azrwVar11.get();
                ayaw.k(ywrVar3);
                return ywrVar3;
            case 597:
                efz efzVar41 = this.a;
                zzw kH3 = efzVar41.kH();
                final afsy afsyVar3 = (afsy) efzVar41.au.get();
                String[] strArr2 = fod.a;
                final fof fofVar = fof.a;
                return kH3.a(new amml() { // from class: foc
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        fof fofVar2 = fof.this;
                        afsy afsyVar4 = afsyVar3;
                        fny fnyVar = new fny((SharedPreferences) obj);
                        fof a10 = fod.a(fofVar2, fnyVar);
                        String g = evr.g("bollard_enabled", afsyVar4);
                        aone createBuilder = foa.a.createBuilder();
                        boolean z = true;
                        if (fnyVar.b(g)) {
                            boolean c2 = fnyVar.c(g);
                            createBuilder.copyOnWrite();
                            foa foaVar = (foa) createBuilder.instance;
                            foaVar.b |= 1;
                            foaVar.c = c2;
                        } else {
                            z = false;
                        }
                        String g2 = evr.g("bollard_frequency_mins", afsyVar4);
                        if (fnyVar.b(g2)) {
                            int a11 = fnyVar.a(g2, 0);
                            createBuilder.copyOnWrite();
                            foa foaVar2 = (foa) createBuilder.instance;
                            foaVar2.b |= 2;
                            foaVar2.d = a11;
                        } else if (!z) {
                            return a10;
                        }
                        aone builder = a10.toBuilder();
                        builder.j(afsyVar4.c().d(), (foa) createBuilder.build());
                        return (fof) builder.build();
                    }
                }, fkp.g, fofVar);
            case 598:
                efz efzVar42 = this.a;
                Context context4 = efzVar42.b.a;
                azrw azrwVar13 = efzVar42.z;
                anib anibVar2 = (anib) efzVar42.f.get();
                vfg vfgVar3 = (vfg) efzVar42.p.get();
                String[] strArr3 = fod.a;
                final fof fofVar2 = fof.a;
                vfk d3 = vfn.d(context4, anibVar2);
                d3.b();
                d3.c = efz.jZ();
                d3.d(fod.a);
                d3.e(new vfl() { // from class: fob
                    @Override // defpackage.vfl
                    public final aooy a(vfm vfmVar, aooy aooyVar) {
                        return fod.a(fof.this, new fny(vfmVar));
                    }
                });
                vfn a10 = d3.a();
                vfe a11 = vff.a();
                a11.f(whl.s(context4, "watch", "watchstorage.pb"));
                a11.e(fofVar2);
                a11.b(a10);
                ywu d4 = ywv.d(azrwVar13, anibVar2);
                d4.a = eri.q;
                d4.b(fjw.k);
                d4.b = fjw.j;
                d4.c = fkp.f;
                a11.b(d4.a());
                return new ywp(agcm.e(vfgVar3.a(a11.a())), fof.a);
            case 599:
                return new azos((Executor) this.a.i.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        alyx alyxVar;
        String str;
        String str2;
        Integer num;
        int i = this.b;
        boolean z = false;
        switch (i) {
            case 100:
                efz efzVar = this.a;
                return new amfn(efzVar.b.a, efzVar.j(), 0);
            case 101:
                efz efzVar2 = this.a;
                bzh bzhVar = (bzh) efzVar2.ag.get();
                amrz k = amrz.k(amhb.class, "com.google.apps.tiktok.sync.impl.workmanager.SyncWorker");
                return new amcx(bzhVar, k);
            case 102:
                return new SecureRandom();
            case 103:
                return new Random();
            case 104:
                efz efzVar3 = this.a;
                final alxe alxeVar = (alxe) efzVar3.aT.get();
                alyp alypVar = new alyp() { // from class: alwt
                    @Override // defpackage.alyp
                    public final anhy a(alyo alyoVar) {
                        alxe.this.e();
                        return anaf.O(null);
                    }
                };
                final amdi amdiVar = (amdi) efzVar3.aD.get();
                alyp alypVar2 = new alyp() { // from class: alzk
                    @Override // defpackage.alyp
                    public final anhy a(alyo alyoVar) {
                        amdi amdiVar2 = amdi.this;
                        anhy O = anaf.O(null);
                        amdiVar2.a(O);
                        return O;
                    }
                };
                final amgd amgdVar = (amgd) efzVar3.aS.get();
                return amsx.t(alypVar, alypVar2, new alyp() { // from class: amgm
                    @Override // defpackage.alyp
                    public final anhy a(alyo alyoVar) {
                        return amgd.this.d();
                    }
                });
            case 105:
                return this.a.gZ();
            case 106:
                return this.a.gN();
            case 107:
                return this.a.hs();
            case 108:
                efz efzVar4 = this.a;
                amrz n = amrz.n("youtube-delegated", new wkh((anib) efzVar4.f.get(), (wcx) efzVar4.au.get(), 1), "youtube-direct", new wkh((anib) efzVar4.f.get(), (wcx) efzVar4.au.get(), 0), "youtube-incognito", new wkh((anib) efzVar4.f.get(), (wcx) efzVar4.au.get(), 2), "pseudonymous", new amap());
                amsv i2 = amsx.i();
                for (Map.Entry entry : n.entrySet()) {
                    alyy alyyVar = new alyy();
                    String str3 = (String) entry.getKey();
                    if (str3 == null) {
                        throw new NullPointerException("Null type");
                    }
                    alyyVar.a = str3;
                    alyx alyxVar2 = (alyx) entry.getValue();
                    if (alyxVar2 == null) {
                        throw new NullPointerException("Null provider");
                    }
                    alyyVar.b = alyxVar2;
                    String str4 = alyyVar.a;
                    if (str4 == null || (alyxVar = alyyVar.b) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (alyyVar.a == null) {
                            sb.append(" type");
                        }
                        if (alyyVar.b == null) {
                            sb.append(" provider");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    i2.c(new alyz(str4, alyxVar));
                }
                amsx g = i2.g();
                ayaw.k(g);
                return amsx.p(g);
            case 109:
                return this.a.jG();
            case 110:
                return amsx.r(new alzm((amdi) this.a.aD.get()));
            case 111:
                efz efzVar5 = this.a;
                try {
                    PackageInfo packageInfo = efzVar5.h().getPackageInfo(efzVar5.b.a.getPackageName(), 0);
                    ayaw.k(packageInfo);
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Can't find our own package", e);
                }
            case 112:
                return this.a.hr();
            case 113:
                return this.a.bh();
            case 114:
                return enq.i(this.a.b.a);
            case 115:
                return enq.m();
            case 116:
                return enq.l();
            case 117:
                return enq.k();
            case 118:
                acxg a = acxi.a();
                a.a = new acxh();
                a.b = "cl";
                a.e(R.drawable.quantum_ic_cast_connected_white_24);
                a.b(true);
                a.d(1);
                a.a(true);
                a.c();
                acxh acxhVar = a.a;
                if (acxhVar != null && (str = a.b) != null && (str2 = a.c) != null && (num = a.d) != null && a.e != null && a.f != null && a.g != null && a.h != null && a.i != null && a.j != null) {
                    return new acxi(acxhVar, str, str2, num.intValue(), a.e.booleanValue(), a.f.intValue(), a.g.booleanValue(), a.h.booleanValue(), a.i, a.j.booleanValue());
                }
                StringBuilder sb3 = new StringBuilder();
                if (a.a == null) {
                    sb3.append(" castAppIdConfigs");
                }
                if (a.b == null) {
                    sb3.append(" theme");
                }
                if (a.c == null) {
                    sb3.append(" dialAppName");
                }
                if (a.d == null) {
                    sb3.append(" remoteNotificationIconResId");
                }
                if (a.e == null) {
                    sb3.append(" lockscreenAdSupported");
                }
                if (a.f == null) {
                    sb3.append(" multiUserSession");
                }
                if (a.g == null) {
                    sb3.append(" forceQueueingEnabled");
                }
                if (a.h == null) {
                    sb3.append(" mdxPlaybackQueueEnabled");
                }
                if (a.i == null) {
                    sb3.append(" castDataChannelNameSpace");
                }
                if (a.j == null) {
                    sb3.append(" mdxLoopModeEnabled");
                }
                String valueOf2 = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb4.append("Missing required properties:");
                sb4.append(valueOf2);
                throw new IllegalStateException(sb4.toString());
            case 119:
                Object obj = this.a.bj.get();
                amvs amvsVar = amvs.a;
                amjl amjlVar = amjl.REALTIME;
                ayaw.k(amjlVar);
                return new amiu((amja) obj, amvsVar, amjlVar);
            case 120:
                efz efzVar6 = this.a;
                Object obj2 = efzVar6.bi.get();
                shf shfVar = (shf) efzVar6.g.get();
                anic anicVar = (anic) efzVar6.aA.get();
                azrw azrwVar = efzVar6.bk;
                amjo amjoVar = (amjo) efzVar6.bl.get();
                amhu amhuVar = amhu.a;
                ayaw.k(amhuVar);
                return new amjc((amig) obj2, shfVar, anicVar, azrwVar, amjoVar, amhuVar);
            case 121:
                return new amig((ExecutorService) this.a.bh.get());
            case 122:
                efz efzVar7 = this.a;
                anic hc = efzVar7.hc();
                efzVar7.jM();
                return ((Boolean) ammv.j(false).e(false)).booleanValue() ? sgf.g(hc) : sif.a(hc);
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return amsx.r(this.a.hR());
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new amjo();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                efz efzVar8 = this.a;
                uyh uyhVar = uyh.STARTUP_LISTENERS;
                final uyg be = efzVar8.be();
                final amrz m = amrz.m("ActivityLifecycleCallbacks", efzVar8.bo, "FirmReferenceManager", efzVar8.bp, "AfterPackageReplaced", efzVar8.br);
                final amrz m2 = amrz.m("Set BlockableFutures failure mode", efzVar8.bs, "PrimesMetricServices", efzVar8.co, "PrngFixes", efzVar8.cp);
                return new dqp(amrz.m(uyhVar, new uyi() { // from class: uyp
                    @Override // defpackage.uyi
                    public final void a() {
                        uyg uygVar = uyg.this;
                        Map map = m2;
                        Map map2 = m;
                        amil l = amjw.l("Startup Listeners");
                        try {
                            if (!uygVar.a()) {
                                usr.c(map);
                            } else if (Math.random() < 0.5d) {
                                usr.c(map);
                                usr.c(map2);
                            } else {
                                usr.c(map2);
                                usr.c(map);
                            }
                            l.close();
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                }, uyh.LOGGING, new aoay(new aoax(axqw.a)), uyh.UNCAUGHT_EXCEPTION_HANDLER, new uyn(efzVar8.cq, (shf) efzVar8.g.get())));
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                efz efzVar9 = this.a;
                final Context context = efzVar9.b.a;
                amvs amvsVar2 = amvs.a;
                final azrw azrwVar2 = efzVar9.bn;
                final amiu amiuVar = (amiu) efzVar9.bm.get();
                amiuVar.getClass();
                final ammv j = ammv.j(new amml() { // from class: amiv
                    @Override // defpackage.amml
                    public final Object apply(Object obj3) {
                        return new amit(amiu.this, (Application.ActivityLifecycleCallbacks) obj3);
                    }
                });
                return new uyo() { // from class: uyj
                    @Override // defpackage.uyo
                    public final void a() {
                        Application application = (Application) context;
                        application.registerActivityLifecycleCallbacks(new uyk(application, azrwVar2, j));
                    }
                };
            case 127:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ((ambd) this.a.aF.get()).d;
                ayaw.k(activityLifecycleCallbacks);
                return amsx.r(activityLifecycleCallbacks);
            case 128:
                return new uzz(this.a.b.a);
            case 129:
                efz efzVar10 = this.a;
                return new amds(efzVar10.b.a, efzVar10.be(), efzVar10.bq, (anib) efzVar10.n.get(), axqq.a(efzVar10.aI), efzVar10.bm, efzVar10.aU);
            case 130:
                efz efzVar11 = this.a;
                final alyt gL = efzVar11.gL();
                amdo amdoVar = new amdo() { // from class: alza
                    @Override // defpackage.amdo
                    public final void a() {
                        final alyt alytVar = alyt.this;
                        anhy i3 = aney.i(alytVar.b.d(), Throwable.class, amjk.c(new anfz() { // from class: alys
                            @Override // defpackage.anfz
                            public final anhy a(Object obj3) {
                                alyt alytVar2 = alyt.this;
                                ((amxh) ((amxh) ((amxh) alyt.a.f()).h((Throwable) obj3)).i("com/google/apps/tiktok/account/data/AccountInvalidator", "lambda$invalidateAllAccountsInternal$1", 107, "AccountInvalidator.java")).q("Account sync failed");
                                return alytVar2.b.g.b(akpw.h, angq.a);
                            }
                        }), angq.a);
                        alytVar.b.c(i3);
                        amba.b(i3, "Failed account invalidation.", new Object[0]);
                    }
                };
                final Context context2 = efzVar11.b.a;
                return amsx.t(amdoVar, new amdo() { // from class: amey
                    @Override // defpackage.amdo
                    public final void a() {
                        Context context3 = context2;
                        try {
                            PackageInfo packageInfo2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                            if (Build.VERSION.SDK_INT >= 24 && packageInfo2.applicationInfo.targetSdkVersion >= 24) {
                                return;
                            }
                            try {
                                Os.chmod(packageInfo2.applicationInfo.dataDir, 448);
                            } catch (Exception e2) {
                                throw new IOException(e2);
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                    }
                }, new amgw(efzVar11.aS));
            case 131:
                sjc sjcVar = sjc.LOG_ERROR;
                ayaw.k(sjcVar);
                final ammv j2 = ammv.j(sjcVar);
                return new uyo() { // from class: sjb
                    @Override // defpackage.uyo
                    public final void a() {
                    }
                };
            case 132:
                efz efzVar12 = this.a;
                final azrw azrwVar3 = efzVar12.cn;
                final Context context3 = efzVar12.b.a;
                return new uyo() { // from class: upt
                    @Override // defpackage.uyo
                    public final void a() {
                        Context context4 = context3;
                        azrw azrwVar4 = azrwVar3;
                        Boolean bool = false;
                        if (bool.booleanValue() && uye.b()) {
                            String a2 = uye.a(context4);
                            if (a2 == null || !a2.endsWith(":primes_lifeboat")) {
                                Iterator it = ((Set) azrwVar4.get()).iterator();
                                while (it.hasNext()) {
                                    ((upq) it.next()).a();
                                }
                            }
                        }
                    }
                };
            case 133:
                efz efzVar13 = this.a;
                amsv j3 = amsx.j(11);
                Iterable r = Build.VERSION.SDK_INT >= 30 ? amsx.r((upq) efzVar13.bK.get()) : amvs.a;
                ayaw.k(r);
                j3.j(r);
                ammv.j(efzVar13.bL);
                Iterable r2 = uqq.b() ? amsx.r((upq) efzVar13.bM.get()) : amvs.a;
                ayaw.k(r2);
                j3.j(r2);
                amvs amvsVar3 = amvs.a;
                ayaw.k(amvsVar3);
                j3.j(amvsVar3);
                ammv.j(efzVar13.bO);
                j3.j(amsx.r((upq) efzVar13.bQ.get()));
                ammv.j(efzVar13.bR);
                j3.j(amsx.r((usi) efzVar13.bV.get()));
                amvs amvsVar4 = amvs.a;
                ayaw.k(amvsVar4);
                j3.j(amvsVar4);
                ammv.j(efzVar13.bW);
                Iterable r3 = uou.q() ? amsx.r((upq) efzVar13.bZ.get()) : amvs.a;
                ayaw.k(r3);
                j3.j(r3);
                ammv.j(efzVar13.ca);
                j3.j(amsx.r((upq) efzVar13.cg.get()));
                amvs amvsVar5 = amvs.a;
                ayaw.k(amvsVar5);
                j3.j(amvsVar5);
                j3.c((upq) efzVar13.ck.get());
                j3.c(efzVar13.hZ());
                return j3.g();
            case 134:
                return this.a.hv();
            case 135:
                return new upm(axqq.a(this.a.bv));
            case 136:
                efz efzVar14 = this.a;
                return amsx.s((uuq) efzVar14.bu.get(), new uul(efzVar14.b.a, amvs.a, amvs.a));
            case 137:
                efz efzVar15 = this.a;
                return new akqk((ypa) efzVar15.B.get(), (aktq) efzVar15.bt.get());
            case 138:
                efz efzVar16 = this.a;
                Context context4 = efzVar16.b.a;
                return new aktq((ynx) efzVar16.M.get());
            case 139:
                efz efzVar17 = this.a;
                return new ups(efzVar17.b.a, (String) efzVar17.bw.get());
            case 140:
                Context context5 = this.a.b.a;
                PackageManager packageManager = context5.getPackageManager();
                String packageName = context5.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    ((amxh) ((amxh) ((amxh) upu.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionName", 84, "PrimesCoreMetricDaggerModule.java")).s("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 141:
                return new unq();
            case 142:
                efz efzVar18 = this.a;
                return new uuf(efzVar18.by, efzVar18.bD, efzVar18.bH, efzVar18.bI);
            case 143:
                return this.a.b.a;
            case 144:
                return this.a.iK();
            case 145:
                return this.a.aS();
            case 146:
                unp unpVar = (unp) this.a.bz.get();
                sii jO = efz.jO();
                int i3 = unpVar.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i3, new unm(unpVar.a), new unk());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i3);
                anic a2 = jO.a(anaf.D(scheduledThreadPoolExecutor));
                ayaw.k(a2);
                return a2;
            case 147:
                uno unoVar = new uno();
                unoVar.a = 11;
                unoVar.b = 2;
                unoVar.c = true;
                Integer num2 = unoVar.a;
                if (num2 != null && unoVar.b != null && unoVar.c != null) {
                    unp unpVar2 = new unp(num2.intValue(), unoVar.b.intValue(), unoVar.c.booleanValue());
                    int i4 = unpVar2.b;
                    if (i4 > 0 && i4 <= 2) {
                        z = true;
                    }
                    amkq.P(z, "Thread pool size must be less than or equal to %s", 2);
                    return unpVar2;
                }
                StringBuilder sb5 = new StringBuilder();
                if (unoVar.a == null) {
                    sb5.append(" primesMetricExecutorPriority");
                }
                if (unoVar.b == null) {
                    sb5.append(" primesMetricExecutorPoolSize");
                }
                if (unoVar.c == null) {
                    sb5.append(" enableDeferredTasks");
                }
                String valueOf3 = String.valueOf(sb5);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                sb6.append("Missing required properties:");
                sb6.append(valueOf3);
                throw new IllegalStateException(sb6.toString());
            case 148:
                return this.a.aT();
            case 149:
                return this.a.aU();
            case 150:
                return this.a.hB();
            case 151:
                return this.a.kM();
            case 152:
                efz efzVar19 = this.a;
                return new uui((Random) efzVar19.bF.get(), (utx) efzVar19.bG.get(), (shf) efzVar19.bE.get());
            case 153:
                return new Random(((shf) this.a.bE.get()).d());
            case 154:
                return (shf) ammv.j((shf) this.a.g.get()).e(new zhr(1));
            case 155:
                return this.a.bd();
            case 156:
                return true;
            case 157:
                return amlr.a;
            case 158:
                return new unx();
            case 159:
                Object obj3 = new nju(this.a.b.a, 5).get();
                ayaw.k(obj3);
                return obj3;
            case 160:
                return new uqn(null);
            case 161:
                return Boolean.valueOf(this.a.jq());
            case 162:
                return this.a.iP();
            case 163:
                return this.a.aV();
            case 164:
                return this.a.hz();
            case 165:
                uot uotVar = (uot) ((azrw) ammv.j(this.a.bL).e(umy.b)).get();
                ayaw.k(uotVar);
                return uotVar;
            case 166:
                return this.a.iQ();
            case 167:
                return this.a.aZ();
            case 168:
                aigg aiggVar = new aigg();
                aiggVar.a = 10;
                aiggVar.b = 2;
                Integer num3 = aiggVar.a;
                if (num3 != null) {
                    return new urd(num3.intValue());
                }
                StringBuilder sb7 = new StringBuilder();
                if (aiggVar.b == 0) {
                    sb7.append(" enablement");
                }
                if (aiggVar.a == null) {
                    sb7.append(" rateLimitPerSecond");
                }
                String valueOf4 = String.valueOf(sb7);
                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                sb8.append("Missing required properties:");
                sb8.append(valueOf4);
                throw new IllegalStateException(sb8.toString());
            case 169:
                return this.a.hu();
            case 170:
                return Boolean.valueOf(this.a.jr());
            case 171:
                return new urc((shf) this.a.bE.get());
            case 172:
                return this.a.iR();
            case 173:
                return new upw((amob) this.a.bN.get());
            case 174:
                return new uni((shf) this.a.bE.get());
            case 175:
                return this.a.ba();
            case 176:
                return Boolean.valueOf(this.a.js());
            case 177:
                return this.a.aY();
            case 178:
                return this.a.hH();
            case 179:
                uqf uqfVar = (uqf) ((azrw) ammv.j(this.a.bO).e(umy.c)).get();
                ayaw.k(uqfVar);
                return uqfVar;
            case 180:
                return new NativeCrashHandlerImpl(ammv.j(this.a.bP));
            case 181:
                return Boolean.valueOf(this.a.jn());
            case 182:
                return Boolean.valueOf(axyb.a.get().a(this.a.b.a));
            case 183:
                return this.a.bb();
            case 184:
                return new akqn();
            case 185:
                efz efzVar20 = this.a;
                return new usi(efzVar20.aX(), efzVar20.b.a, (uok) efzVar20.bC.get(), (anic) efzVar20.bA.get(), axqq.a(efzVar20.bS), axqq.a(efzVar20.bT), efzVar20.bU, (Executor) efzVar20.bD.get());
            case 186:
                usb usbVar = (usb) ((azrw) ammv.j(this.a.bR).e(umy.d)).get();
                ayaw.k(usbVar);
                return usbVar;
            case 187:
                return new usd(this.a.bS);
            case 188:
                return this.a.iS();
            case 189:
                return this.a.hF();
            case 190:
                upx upxVar = new upx();
                upxVar.a = 2097152;
                upxVar.b = 30000;
                upxVar.c = 5000;
                upxVar.d = 1000;
                upxVar.e = Double.valueOf(5.0d);
                upxVar.f = 1;
                Integer num4 = upxVar.a;
                if (num4 != null && upxVar.b != null && upxVar.c != null && upxVar.d != null && upxVar.e != null) {
                    return new upy(num4.intValue(), upxVar.b.intValue(), upxVar.c.intValue(), upxVar.d.intValue(), upxVar.e.doubleValue());
                }
                StringBuilder sb9 = new StringBuilder();
                if (upxVar.f == 0) {
                    sb9.append(" enablement");
                }
                if (upxVar.a == null) {
                    sb9.append(" maxBufferSizeBytes");
                }
                if (upxVar.b == null) {
                    sb9.append(" sampleDurationMs");
                }
                if (upxVar.c == null) {
                    sb9.append(" sampleDurationSkewMs");
                }
                if (upxVar.d == null) {
                    sb9.append(" sampleFrequencyMicro");
                }
                if (upxVar.e == null) {
                    sb9.append(" samplesPerEpoch");
                }
                String valueOf5 = String.valueOf(sb9);
                StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf5).length() + 28);
                sb10.append("Missing required properties:");
                sb10.append(valueOf5);
                throw new IllegalStateException(sb10.toString());
            case 191:
                return this.a.iT();
            case 192:
                return this.a.hG();
            case 193:
                aktq aktqVar = (aktq) this.a.bt.get();
                utf c = utg.c();
                avdw avdwVar = aktqVar.get().e;
                if (avdwVar == null) {
                    avdwVar = avdw.a;
                }
                c.b(avdwVar.e);
                return c.a();
            case 194:
                efz efzVar21 = this.a;
                return new uti(efzVar21.aX(), efzVar21.b.a, (uok) efzVar21.bC.get(), (Executor) efzVar21.bD.get(), axqq.a(efzVar21.bX), new uty(efzVar21.b.a, (shf) efzVar21.bE.get(), efzVar21.bJ), efzVar21.bY);
            case 195:
                utg utgVar = (utg) ((azrw) ammv.j(this.a.bW).e(umy.e)).get();
                ayaw.k(utgVar);
                return utgVar;
            case 196:
                return this.a.iU();
            case 197:
                aktq aktqVar2 = (aktq) this.a.bt.get();
                utk c2 = utl.c();
                avdw avdwVar2 = aktqVar2.get().e;
                if (avdwVar2 == null) {
                    avdwVar2 = avdw.a;
                }
                c2.b(avdwVar2.o);
                return c2.a();
            case 198:
                efz efzVar22 = this.a;
                return new utv(efzVar22.aX(), (anic) efzVar22.bA.get(), axqq.a(efzVar22.cb), axqq.a(efzVar22.cc), efzVar22.cd, efzVar22.ll(), null, null, null);
            case 199:
                utp utpVar = new utp();
                utpVar.a = 10;
                utpVar.b = true;
                utpVar.d = new uqq(null);
                utpVar.c = 2;
                Integer num5 = utpVar.a;
                if (num5 != null && utpVar.d != null && utpVar.b != null) {
                    return new utq(num5.intValue(), utpVar.d, utpVar.b.booleanValue(), null, null);
                }
                StringBuilder sb11 = new StringBuilder();
                if (utpVar.c == 0) {
                    sb11.append(" enablement");
                }
                if (utpVar.a == null) {
                    sb11.append(" rateLimitPerSecond");
                }
                if (utpVar.d == null) {
                    sb11.append(" dynamicSampler");
                }
                if (utpVar.b == null) {
                    sb11.append(" recordTimerDuration");
                }
                String valueOf6 = String.valueOf(sb11);
                StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
                sb12.append("Missing required properties:");
                sb12.append(valueOf6);
                throw new IllegalStateException(sb12.toString());
            default:
                throw new AssertionError(i);
        }
    }
}
