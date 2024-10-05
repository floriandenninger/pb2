package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Base64;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.WindowManager;
import android.widget.Button;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import j$.net.URLDecoder;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adyu {

    @Backup
    public static final String LIMIT_MOBILE_DATA_USAGE = "limit_mobile_data_usage";
    private static afjt a;
    public static adyu b;
    private static afju c;
    private static adyu d;
    private static adyu e;
    private static adyu f;
    private static adyu g;
    private static adyu h;

    public adyu() {
    }

    public adyu(avlx avlxVar) {
        avlxVar.getClass();
    }

    public static boolean A(cnq cnqVar) {
        cnh cnhVar;
        if (cnqVar instanceof aftt) {
            return true;
        }
        if (cnqVar instanceof cng) {
            cnhVar = ((cng) cnqVar).b;
        } else {
            cnhVar = cnqVar instanceof cno ? ((cno) cnqVar).b : null;
        }
        if (cnhVar == null) {
            return false;
        }
        int i = cnhVar.a;
        return i == 400 || i == 403;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? "ERROR" : "WARNING";
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "ad";
            case 2:
                return "crash";
            case 3:
                return "creator";
            case 4:
                return "embeddedplayer";
            case 5:
                return "innertube";
            case 6:
                return "media";
            case 7:
                return "notification";
            case 8:
                return "onesie";
            case 9:
                return "upload";
            case 10:
                return "player";
            case 11:
                return "payment";
            case 12:
                return "logging";
            case 13:
                return "music";
            case 14:
                return "kids";
            case 15:
                return "reactr";
            case 16:
                return "imagemanager";
            case 17:
                return "unplugged";
            case 18:
                return "initialization";
            case 19:
                return "streamingstats";
            case 20:
                return "lite";
            case 21:
                return "mdx";
            case 22:
                return "offlinep2p";
            case 23:
                return "elements";
            case 24:
                return "reels";
            case 25:
                return "main";
            case 26:
                return "location";
            case 27:
                return "system_health";
            case 28:
                return "offline";
            case 29:
                return "livecreation";
            case 30:
                return "entities";
            case 31:
                return "livechat";
            case 32:
                return "youtube_assistant";
            case 33:
                return "youtube_suggest";
            case 34:
                return "account";
            default:
                return "channel";
        }
    }

    public static String D(afsg afsgVar, afsy afsyVar) {
        String str = afsgVar.a;
        return (!TextUtils.isEmpty(str) || afsyVar.c().g() || afsgVar.b) ? str : afsyVar.g();
    }

    public static aypy E(sxd sxdVar, String str) {
        return sxdVar.a(str).ak(1L).M(afly.f);
    }

    public static aypy F(sxd sxdVar, String str) {
        return sxdVar.a(str).L(aflz.c).Y(afly.e).ak(1L).M(afly.g);
    }

    public static boolean G(List list, List list2) {
        return !list.equals(list2);
    }

    public static int H(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 1) {
                return 6;
            }
            if (hashSet.contains(str)) {
                i = 5;
            } else {
                hashSet.add(str);
            }
        }
        return i;
    }

    public static aypy I(sxd sxdVar, String str) {
        return sxdVar.a(str).L(aflz.a).ak(1L).Y(afly.a).M(afly.c);
    }

    public static String J(long j, Context context) {
        return DateUtils.formatDateTime(context, j, 65557);
    }

    public static /* synthetic */ String K(int i) {
        switch (i) {
            case 1:
                return "INVALID";
            case 2:
                return "MEDIA_CODEC";
            case 3:
                return "MEDIA_CODEC_HARDWARE_ONLY";
            case 4:
                return "LIBVPX";
            case 5:
                return "LIBOPUS";
            case 6:
                return "LIBOPUS_AMBISONICS";
            case 7:
                return "MEDIA_CODEC_VORBIS_AMBISONICS";
            case 8:
                return "LIBGAV1";
            default:
                return "null";
        }
    }

    public static baa L(String str, boolean z, Set set, Set set2, int i) {
        if (c == null) {
            c = new afju();
        }
        return (baa) c.a(str, z, set, set2, i);
    }

    public static oxf M(String str, boolean z, Set set, Set set2, int i) {
        if (a == null) {
            a = new afjt();
        }
        return (oxf) a.a(str, z, set, set2, i);
    }

    public static long N(FormatStreamModel formatStreamModel, PlayerConfigModel playerConfigModel) {
        return O(formatStreamModel, playerConfigModel, 2, 6);
    }

    public static long O(FormatStreamModel formatStreamModel, PlayerConfigModel playerConfigModel, int i, int i2) {
        if (!formatStreamModel.J() && playerConfigModel.ag() && playerConfigModel.V().contains(Integer.valueOf(i2))) {
            long K = playerConfigModel.K();
            if (K == Long.MAX_VALUE) {
                return 0L;
            }
            if (formatStreamModel.P() && (i == 2 || i == 10000)) {
                if (formatStreamModel.f + (formatStreamModel.d() > 240 ? 128000 : 48000) > K) {
                    return K / 8;
                }
            }
            aqif aqifVar = playerConfigModel.c.z;
            if (aqifVar == null) {
                aqifVar = aqif.b;
            }
            if (aqifVar.i) {
                return K / 8;
            }
        }
        return 0L;
    }

    public static void P(afjf afjfVar) {
        afjfVar.aP(new adyy());
    }

    public static void Q(afjf afjfVar, long j, long j2) {
        adyx adyxVar = new adyx();
        adyxVar.i(j - j2);
        afjfVar.aP(adyxVar);
        adyw adywVar = new adyw();
        adywVar.i(j);
        afjfVar.aP(adywVar);
    }

    public static void R(afjf afjfVar) {
        afjfVar.aP(new adyz());
    }

    public static void S(afjf afjfVar) {
        afjfVar.aP(new adza());
    }

    public static void T(afjf afjfVar) {
        afjfVar.aQ(new adzf());
    }

    public static void U(afjf afjfVar) {
        afjfVar.aQ(new adzg());
    }

    public static void V(afjf afjfVar, boolean z) {
        if (z) {
            afjfVar.aQ(new adzk());
        } else {
            afjfVar.aQ(new adzm());
        }
    }

    public static void W(afjf afjfVar) {
        afjfVar.aQ(new adzo());
    }

    public static void X(afjf afjfVar) {
        afjfVar.aQ(new adzp());
    }

    public static void Y(afjf afjfVar) {
        afjfVar.aQ(new adzq());
    }

    public static void Z(afjf afjfVar) {
        afjfVar.aQ(new adzr());
    }

    public static void aA(afjf afjfVar) {
        afjfVar.aQ(new aeav());
    }

    public static void aB(afjf afjfVar) {
        afjfVar.aQ(new aeaw());
    }

    public static void aC(afjf afjfVar) {
        afjfVar.aQ(new aeax());
    }

    public static void aD(afjf afjfVar) {
        afjfVar.aQ(new aeay());
    }

    public static void aE(afjf afjfVar) {
        afjfVar.aP(new aeaz());
    }

    public static void aF(afjf afjfVar) {
        afjfVar.aQ(new aeba());
    }

    public static void aG(afjf afjfVar) {
        afjfVar.aQ(new aebb());
    }

    public static void aH(afjf afjfVar) {
        afjfVar.aQ(new aebc());
    }

    public static void aI(afjf afjfVar) {
        afjfVar.aP(new aebd());
    }

    public static void aJ(afjf afjfVar) {
        afjfVar.aQ(new aebe());
    }

    public static void aK(afjf afjfVar) {
        afjfVar.aQ(new aebf());
    }

    public static void aL(afjf afjfVar) {
        afjfVar.aQ(new aebh());
    }

    public static void aM(afjf afjfVar) {
        afjfVar.aP(new aebi());
    }

    public static void aN(afjf afjfVar) {
        afjfVar.aQ(new aebj());
    }

    public static void aO(afjf afjfVar) {
        afjfVar.aQ(new adzb(null));
    }

    public static void aP(afjf afjfVar) {
        afjfVar.aQ(new aebl());
    }

    public static void aQ(afjf afjfVar) {
        afjfVar.aQ(new aebm());
    }

    public static void aR(afjf afjfVar) {
        afjfVar.aQ(new aebn());
    }

    public static void aS(afjf afjfVar) {
        afjfVar.aQ(new aebp());
    }

    public static void aT(afjf afjfVar) {
        afjfVar.aQ(new aebq());
    }

    public static void aU(afjf afjfVar) {
        afjfVar.aQ(new aebr());
    }

    public static void aV(afjf afjfVar) {
        afjfVar.aQ(new aebs());
    }

    public static void aW(afjf afjfVar) {
        afjfVar.aQ(new aebt());
    }

    public static void aX(afjf afjfVar, String str) {
        afjfVar.aQ(new aebu(str));
    }

    public static void aY(afjf afjfVar) {
        afjfVar.aQ(new aebv());
    }

    public static void aZ(afjf afjfVar) {
        afjfVar.aQ(new aebw());
    }

    public static void aa(afjf afjfVar) {
        afjfVar.aQ(new adzw());
    }

    public static void ab(afjf afjfVar) {
        afjfVar.aQ(new adzx());
    }

    public static void ac(afjf afjfVar) {
        afjfVar.aQ(new adzy());
    }

    public static void ad(afjf afjfVar) {
        afjfVar.aQ(new adzz());
    }

    public static void ae(afjf afjfVar) {
        afjfVar.aQ(new aeaa());
    }

    public static void af(afjf afjfVar) {
        afjfVar.aQ(new aeab());
    }

    public static void ag(afjf afjfVar) {
        afjfVar.aQ(new aeac());
    }

    public static void ah(afjf afjfVar) {
        afjfVar.aQ(new aead());
    }

    public static void ai(afjf afjfVar) {
        afjfVar.aQ(new aeae());
    }

    public static void aj(afjf afjfVar) {
        afjfVar.aQ(new aeaf());
    }

    public static void ak(afjf afjfVar) {
        afjfVar.aQ(new aeag());
    }

    public static void al(afjf afjfVar) {
        afjfVar.aQ(new aeah());
    }

    public static void am(afjf afjfVar) {
        afjfVar.aQ(new aeai());
    }

    public static void an(afjf afjfVar) {
        afjfVar.aQ(new aeaj());
    }

    public static void ao(afjf afjfVar) {
        afjfVar.aQ(new aeak());
    }

    public static void ap(afjf afjfVar) {
        afjfVar.aQ(new aeal());
    }

    public static void aq(afjf afjfVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                afjfVar.aQ(new aecq());
                return;
            } else {
                afjfVar.aQ(new aecp());
                return;
            }
        }
        if (z2) {
            afjfVar.aQ(new adzi());
        } else {
            afjfVar.aQ(new adzh());
        }
    }

    public static void ar(afjf afjfVar, long j) {
        aeam aeamVar = new aeam();
        aeamVar.i(j);
        afjfVar.aQ(aeamVar);
    }

    public static void as(afjf afjfVar) {
        afjfVar.aQ(new aean());
    }

    public static void at(afjf afjfVar, boolean z) {
        if (z) {
            afjfVar.aQ(new aecr());
        } else {
            afjfVar.aQ(new adzj());
        }
    }

    public static void au(afjf afjfVar) {
        afjfVar.aQ(new aeao());
    }

    public static void av(afjf afjfVar) {
        afjfVar.aP(new adyw(null));
    }

    public static void aw(afjf afjfVar) {
        afjfVar.aQ(new aeap());
    }

    public static void ax(afjf afjfVar) {
        afjfVar.aQ(new aeaq());
    }

    public static void ay(afjf afjfVar) {
        afjfVar.aQ(new aeat());
    }

    public static void az(afjf afjfVar) {
        afjfVar.aQ(new aeau());
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "GAMMA22" : "HLG" : "PQ";
    }

    public static void bA(afjf afjfVar) {
        afjfVar.aQ(new aedj());
    }

    public static void bB(afjf afjfVar) {
        afjfVar.aQ(new aedk());
    }

    public static void bC(afjf afjfVar) {
        afjfVar.aQ(new aedl());
    }

    public static void bD(afjf afjfVar) {
        afjfVar.aQ(new aedm());
    }

    public static void bE(afjf afjfVar, int i) {
        afjfVar.aQ(new adzs(i));
    }

    public static void bF(afjf afjfVar, int i) {
        afjfVar.aQ(new adzt(i));
    }

    public static afir bG(FormatStreamModel formatStreamModel) {
        return bH(formatStreamModel.e());
    }

    public static afir bH(int i) {
        Set r = aaoq.r();
        Integer valueOf = Integer.valueOf(i);
        if (!r.contains(valueOf) || aaoq.q().contains(valueOf)) {
            return afir.NO_FALLBACK;
        }
        if (aaoq.h().contains(valueOf)) {
            return afir.DRM;
        }
        if (aaoq.n().contains(valueOf)) {
            return afir.VP9;
        }
        if (aaoq.m().contains(valueOf)) {
            return afir.H264;
        }
        return afir.NO_FALLBACK;
    }

    public static int bJ(boolean z, int i) {
        if (z) {
            return 0;
        }
        return i;
    }

    public static int bK(boolean z, int i) {
        if (z) {
            return i;
        }
        return 0;
    }

    public static String bL(boolean z) {
        return true != z ? "0" : "1";
    }

    public static String bM(String str) {
        return str != null ? str.replaceAll("[&:,]", "_") : "";
    }

    public static boolean bN(int i, int i2) {
        return (i & i2) > 0;
    }

    public static String bO(int i) {
        if (i == 1) {
            return "i";
        }
        if (i == 2) {
            return "m";
        }
        if (i == 3) {
            return "a";
        }
        switch (i) {
            case 10000:
                return "s";
            case 10001:
                return "r";
            case 10002:
                return "v";
            case 10003:
                return "c";
            default:
                return null;
        }
    }

    public static boolean bP(int i) {
        if (i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 10000:
                case 10001:
                case 10002:
                case 10003:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static adga bQ(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adga adgaVar = (adga) it.next();
            if (adgaVar.g().equals(str)) {
                return adgaVar;
            }
        }
        return null;
    }

    public static yry bR(int i) {
        yqx a2 = yry.a();
        a2.d(i);
        a2.c(false);
        return a2.a();
    }

    public static yry bS(int i, int i2) {
        yqx a2 = yry.a();
        a2.b(i);
        a2.d(i2);
        a2.c(false);
        return a2.a();
    }

    public static String bT(acun acunVar, acxi acxiVar) {
        HashSet hashSet;
        amsx amsxVar = acunVar.b;
        if (amsxVar == null || amsxVar.isEmpty()) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(amsxVar);
        }
        if (!acunVar.h) {
            hashSet.remove("ska");
        }
        if (acxiVar.h) {
            hashSet.add("que");
        }
        if (acxiVar.k) {
            hashSet.add("mlm");
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(",", hashSet);
    }

    public static boolean bW(String str) {
        return !str.equals("cl");
    }

    public static /* synthetic */ String bX(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DISABLED" : "ENABLED" : "UNSUPPORTED";
    }

    public static /* synthetic */ String bY(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "BLUETOOTH" : "CAST" : "DIAL" : "CLOUD";
    }

    public static Intent bZ(Context context, boolean z) {
        Intent className = new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity");
        className.putExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", z);
        return className;
    }

    public static void ba(afjf afjfVar) {
        afjfVar.aQ(new aebx());
    }

    public static void bb(afjf afjfVar) {
        afjfVar.aQ(new aeby());
    }

    public static void bc(afjf afjfVar) {
        afjfVar.aQ(new aeca());
    }

    public static void bd(afjf afjfVar) {
        afjfVar.aQ(new aecb());
    }

    public static void be(afjf afjfVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                afjfVar.aQ(new aect());
                return;
            } else {
                afjfVar.aQ(new aecv());
                return;
            }
        }
        if (z2) {
            afjfVar.aQ(new adzl());
        } else {
            afjfVar.aQ(new adzn());
        }
    }

    public static void bf(afjf afjfVar, long j, long j2) {
        aecd aecdVar = new aecd();
        aecdVar.i(j);
        afjfVar.aP(aecdVar);
        aecc aeccVar = new aecc();
        aeccVar.i(j2);
        afjfVar.aP(aeccVar);
    }

    public static void bg(afjf afjfVar) {
        afjfVar.aP(new aecg());
    }

    public static void bh(afjf afjfVar, long j, long j2) {
        aecf aecfVar = new aecf();
        aecfVar.i(j - j2);
        afjfVar.aP(aecfVar);
        aece aeceVar = new aece();
        aeceVar.i(j);
        afjfVar.aP(aeceVar);
    }

    public static void bi(afjf afjfVar) {
        afjfVar.aP(new aech());
    }

    public static void bj(afjf afjfVar) {
        afjfVar.aP(new aeci());
    }

    public static void bk(afjf afjfVar) {
        afjfVar.aQ(new aecn());
    }

    public static void bl(afjf afjfVar) {
        afjfVar.aQ(new aeco());
    }

    public static void bm(afjf afjfVar, boolean z) {
        if (z) {
            afjfVar.aQ(new aecs());
        } else {
            afjfVar.aQ(new aecu());
        }
    }

    public static void bn(afjf afjfVar) {
        afjfVar.aQ(new aecw());
    }

    public static void bo(afjf afjfVar) {
        afjfVar.aQ(new aecx());
    }

    public static void bp(afjf afjfVar) {
        afjfVar.aQ(new aecy());
    }

    public static void bq(afjf afjfVar) {
        afjfVar.aQ(new aecz());
    }

    public static void br(afjf afjfVar) {
        afjfVar.aQ(new aeda());
    }

    public static void bs(afjf afjfVar) {
        afjfVar.aQ(new aedb());
    }

    public static void bt(afjf afjfVar) {
        afjfVar.aQ(new aedc());
    }

    public static void bu(afjf afjfVar) {
        afjfVar.aQ(new aedd());
    }

    public static void bv(afjf afjfVar) {
        afjfVar.aQ(new aede());
    }

    public static void bw(afjf afjfVar) {
        afjfVar.aQ(new aedf());
    }

    public static void bx(afjf afjfVar) {
        afjfVar.aQ(new aedg());
    }

    public static void by(afjf afjfVar) {
        afjfVar.aQ(new aedh());
    }

    public static void bz(afjf afjfVar) {
        afjfVar.aQ(new aedi());
    }

    public static apdv c(apwy apwyVar) {
        apdx d2 = d(apwyVar);
        if (d2 != null && (d2.b & 4) != 0) {
            apdu apduVar = d2.d;
            if (apduVar == null) {
                apduVar = apdu.a;
            }
            if ((apduVar.b & 2) != 0) {
                apdu apduVar2 = d2.d;
                if (apduVar2 == null) {
                    apduVar2 = apdu.a;
                }
                apdv apdvVar = apduVar2.d;
                return apdvVar == null ? apdv.a : apdvVar;
            }
        }
        return null;
    }

    public static void cA(int i, DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Expected AMF type ");
        sb.append(i);
        sb.append(", got: ");
        sb.append((int) readByte);
        throw new ProtocolException(sb.toString());
    }

    public static void cB(Bundle bundle, int i) {
        amkq.E(i > 0);
        bundle.putInt("extras-key-min-bitrate", i);
    }

    public static acas cC(Context context, MediaFormat mediaFormat, acaf acafVar, Bundle bundle) {
        mediaFormat.getClass();
        if (!cQ(mediaFormat)) {
            Log.e("VideoEncoderFactory", "Not a video format");
            return null;
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("extras-key-enable-cbr", false)) {
            mediaFormat.setInteger("bitrate-mode", 2);
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean("extras-key-enable-bitrate-bounce", false)) {
                    z = true;
                }
            } catch (Exception e2) {
                Log.e("VideoEncoderFactory", "Could not create video encoder", e2);
                return null;
            }
        }
        return new acas(context, mediaFormat, acafVar, z);
    }

    public static void cD(Bundle bundle) {
        bundle.putBoolean("extras-key-enable-cbr", true);
    }

    public static void cE() {
        if (d == null) {
            d = new adyu();
        }
    }

    public static abzy cF(acap acapVar, acas acasVar, int i, int i2, abzz abzzVar, Handler handler) {
        try {
            return new abzy(acapVar, acasVar, i, i2, abzzVar, handler);
        } catch (Exception e2) {
            Log.e("FrcFactory", "Could not create FRC", e2);
            return null;
        }
    }

    public static void cG() {
        if (e == null) {
            e = new adyu();
        }
    }

    public static void cH() {
        if (f == null) {
            f = new adyu();
        }
    }

    public static abzn cI(MediaFormat mediaFormat, abzo abzoVar, acaf acafVar) {
        mediaFormat.getClass();
        if (!cO(mediaFormat)) {
            Log.e("AudioEncoderFactory", "Not an audio format");
            return null;
        }
        try {
            return new abzn(mediaFormat, abzoVar, acafVar);
        } catch (Exception e2) {
            Log.e("AudioEncoderFactory", "Could not create audio encoder", e2);
            return null;
        }
    }

    public static void cJ() {
        if (g == null) {
            g = new adyu();
        }
    }

    public static abzl cK(acra acraVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17) {
        ((aasw) azrwVar.get()).getClass();
        abdl abdlVar = (abdl) azrwVar2.get();
        abdlVar.getClass();
        abdl abdlVar2 = (abdl) azrwVar3.get();
        abdlVar2.getClass();
        aaxn aaxnVar = (aaxn) azrwVar4.get();
        aaxnVar.getClass();
        aaxn aaxnVar2 = (aaxn) azrwVar5.get();
        aaxnVar2.getClass();
        aaxn aaxnVar3 = (aaxn) azrwVar6.get();
        aaxnVar3.getClass();
        aaxn aaxnVar4 = (aaxn) azrwVar7.get();
        aaxnVar4.getClass();
        aaxn aaxnVar5 = (aaxn) azrwVar8.get();
        aaxnVar5.getClass();
        aaxn aaxnVar6 = (aaxn) azrwVar9.get();
        aaxnVar6.getClass();
        abde abdeVar = (abde) azrwVar10.get();
        abdeVar.getClass();
        abdl abdlVar3 = (abdl) azrwVar11.get();
        abdlVar3.getClass();
        abdl abdlVar4 = (abdl) azrwVar12.get();
        abdlVar4.getClass();
        aaxn aaxnVar7 = (aaxn) azrwVar13.get();
        aaxnVar7.getClass();
        Handler handler = (Handler) azrwVar14.get();
        handler.getClass();
        Executor executor = (Executor) azrwVar15.get();
        executor.getClass();
        Executor executor2 = (Executor) azrwVar16.get();
        executor2.getClass();
        shf shfVar = (shf) azrwVar17.get();
        shfVar.getClass();
        return new abzl(acraVar, abdlVar, abdlVar2, aaxnVar, aaxnVar2, aaxnVar3, aaxnVar4, aaxnVar5, aaxnVar6, abdeVar, abdlVar3, abdlVar4, aaxnVar7, handler, executor, executor2, shfVar, null, null, null, null, null);
    }

    public static aooy cL(ObjectInputStream objectInputStream, aooy aooyVar, Class cls) {
        int readInt = objectInputStream.readInt();
        if (readInt <= 0) {
            if (readInt != 0) {
                return null;
            }
            return aooyVar;
        }
        try {
            byte[] bArr = new byte[readInt];
            objectInputStream.readFully(bArr);
            return (aooy) cls.cast(aooyVar.toBuilder().mergeFrom(bArr, aomw.b()).build());
        } catch (aoob e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void cM(ObjectOutputStream objectOutputStream, aooy aooyVar) {
        int serializedSize = aooyVar == null ? -1 : aooyVar.getSerializedSize();
        objectOutputStream.writeInt(serializedSize);
        if (serializedSize > 0) {
            aooyVar.writeTo(objectOutputStream);
        }
    }

    public static String cN(Context context, String str, long j, Map map) {
        String str2;
        String str3;
        String packageName = context.getPackageName();
        try {
            str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "unknown";
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("manufacturer", Build.MANUFACTURER).appendQueryParameter("model", Build.MODEL).appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("protocol", str).appendQueryParameter("speedTestBitsPerSecond", Long.toString(j));
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        SparseBooleanArray sparseBooleanArray = abvo.a;
        context.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String valueOf = String.valueOf(builder.build().getQuery());
        String concat = valueOf.length() != 0 ? "extras?".concat(valueOf) : new String("extras?");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                str3 = activeNetworkInfo.getTypeName();
            } else if (type == 0) {
                str3 = activeNetworkInfo.getSubtypeName();
            }
            return TextUtils.join(":", Arrays.asList(packageName, str2, str3, concat));
        }
        str3 = "UNKNOWN";
        return TextUtils.join(":", Arrays.asList(packageName, str2, str3, concat));
    }

    public static boolean cO(MediaFormat mediaFormat) {
        String string;
        return (mediaFormat == null || (string = mediaFormat.getString("mime")) == null || !string.startsWith("audio/")) ? false : true;
    }

    public static boolean cP(int i) {
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return false;
            default:
                switch (i) {
                    case 28:
                    case 29:
                    case 30:
                        return false;
                    default:
                        return true;
                }
        }
    }

    public static boolean cQ(MediaFormat mediaFormat) {
        String string;
        return (mediaFormat == null || (string = mediaFormat.getString("mime")) == null || !string.startsWith("video/")) ? false : true;
    }

    public static acaf cR(Context context, Uri uri, String str, abzz abzzVar, boolean z, boolean z2, int i, long j) {
        String scheme = uri.getScheme();
        try {
            if ("file".equals(scheme)) {
                return new abzw(uri.getPath(), z2);
            }
            if ("rtmp".equals(scheme)) {
                return new acbr(context, uri, str, abzzVar, z, z2, i, j);
            }
            String valueOf = String.valueOf(scheme);
            Log.e("MediaMuxFactory", valueOf.length() != 0 ? "Unknown capture scheme: ".concat(valueOf) : new String("Unknown capture scheme: "));
            return null;
        } catch (Exception e2) {
            Log.e("MediaMuxFactory", "Could not create media mux", e2);
            return null;
        }
    }

    public static void cS(Bundle bundle, int i) {
        bundle.putInt("KEY_ADAPTIVE_BITRATE_ALGORITHM", i - 1);
    }

    public static String cT(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                sb.append(readLine);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Resources.NotFoundException e2) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Shader resource not found: ");
            sb2.append(i);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (IOException e3) {
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Error on loading shader: ");
            sb3.append(i);
            throw new RuntimeException(sb3.toString(), e3);
        }
    }

    public static absg cU(Context context, int i) {
        return new absg(cT(context, R.raw.simple_vert), cT(context, i));
    }

    public static void cV(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": EGL error 0x");
        sb.append(hexString);
        String sb2 = sb.toString();
        zga.b(sb2);
        throw new abqz(sb2);
    }

    public static void cW(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": glError 0x");
        sb.append(hexString);
        String sb2 = sb.toString();
        zga.b(sb2);
        throw new abqz(sb2);
    }

    public static void cX(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Unable to locate '");
        sb.append(str);
        sb.append("' in program");
        throw new abqz(sb.toString());
    }

    public static boolean cY(asra asraVar) {
        return (asraVar == null || asraVar.d.size() == 0 || (((asrc) asraVar.d.get(0)).b & 1) == 0) ? false : true;
    }

    public static void cZ(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i) {
        da(context, spannableStringBuilder, charSequence, i, false);
    }

    public static void ca(Context context, Class cls, int i) {
        cb(context, cls, i, null);
    }

    public static void cb(Context context, Class cls, int i, Bundle bundle) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        intent.putExtra("com.google.android.libraries.youtube.mdx.common.newIndex", i);
        intent.putExtra("com.google.android.libraries.youtube.mdx.common.data", bundle);
        context.startActivity(intent);
    }

    public static /* synthetic */ String cc(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "AUTHENTICATE_USER_ERROR" : "INVALID_LOUNGE_TOKEN" : "EXPIRED_LOUNGE_TOKEN" : "MISSING_LOUNGE_TOKEN";
    }

    public static void cd(aqyg aqygVar, acra acraVar) {
        if (aqygVar == null || aqygVar.c.size() <= 0) {
            return;
        }
        int size = aqygVar.c.size();
        for (int i = 0; i < size; i++) {
            aqyi aqyiVar = (aqyi) aqygVar.c.get(i);
            if ((aqyiVar.b & 1024) != 0) {
                asuh asuhVar = aqyiVar.n;
                if (asuhVar == null) {
                    asuhVar = asuh.b;
                }
                acraVar.u(new acqx(asuhVar.d), null);
            }
        }
    }

    @Deprecated
    public static acsa ce(awav awavVar) {
        return new acsa(awavVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [aomf] */
    public static asuh cf(aooy aooyVar) {
        aomf aomfVar;
        if (aooyVar == 0) {
            return null;
        }
        amkq.F(true, "fieldNumber must be > 0");
        aomk O = aomk.O(aooyVar.toByteArray());
        while (!O.E()) {
            try {
                int n = O.n();
                int a2 = aoqp.a(n);
                int b2 = aoqp.b(n);
                if (a2 != 999 || b2 != 2) {
                    O.G(n);
                } else {
                    aooyVar = O.x();
                    aomfVar = aooyVar;
                    break;
                }
            } catch (IOException unused) {
                String valueOf = String.valueOf(aooyVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Error while getting field 999 from ");
                sb.append(valueOf);
                zga.l(sb.toString());
            }
        }
        aomfVar = null;
        if (aomfVar == null) {
            return null;
        }
        try {
            return (asuh) aonm.parseFrom(asuh.b, aomfVar, aomw.b());
        } catch (aoob unused2) {
            return null;
        }
    }

    public static asht cg(apxf apxfVar, aonk aonkVar) {
        if (apxfVar == null) {
            return null;
        }
        apxg apxgVar = apxfVar.e;
        if (apxgVar == null) {
            apxgVar = apxg.a;
        }
        if (!apxgVar.pY(aonkVar)) {
            return null;
        }
        apxg apxgVar2 = apxfVar.e;
        if (apxgVar2 == null) {
            apxgVar2 = apxg.a;
        }
        return (asht) apxgVar2.pX(aonkVar);
    }

    public static void ch(acrr acrrVar, acsa acsaVar, asht ashtVar) {
        if (acsaVar == null) {
            zga.l("null VE container encountered in logShown");
        } else {
            acrrVar.d(acsaVar, ashtVar);
        }
    }

    public static void ci(acre acreVar, InteractionLoggingScreen interactionLoggingScreen, int i, acsa acsaVar, asht ashtVar) {
        String str;
        if (acsaVar == null) {
            zga.l("null VE container encountered in logGesture");
            return;
        }
        awav awavVar = acsaVar.a;
        if (acreVar.n(interactionLoggingScreen, awavVar)) {
            awav a2 = acre.a(awavVar);
            aone createBuilder = asgr.a.createBuilder();
            String str2 = interactionLoggingScreen.a;
            createBuilder.copyOnWrite();
            asgr asgrVar = (asgr) createBuilder.instance;
            str2.getClass();
            asgrVar.b |= 1;
            asgrVar.c = str2;
            createBuilder.copyOnWrite();
            asgr asgrVar2 = (asgr) createBuilder.instance;
            asgrVar2.f = i - 1;
            asgrVar2.b |= 8;
            createBuilder.copyOnWrite();
            asgr asgrVar3 = (asgr) createBuilder.instance;
            a2.getClass();
            asgrVar3.d = a2;
            asgrVar3.b |= 2;
            if (ashtVar != null && !ashtVar.equals(asht.a)) {
                createBuilder.copyOnWrite();
                asgr asgrVar4 = (asgr) createBuilder.instance;
                asgrVar4.e = ashtVar;
                asgrVar4.b |= 4;
            }
            asgr asgrVar5 = (asgr) createBuilder.build();
            arpn a3 = arpp.a();
            a3.copyOnWrite();
            ((arpp) a3.instance).ed(asgrVar5);
            acreVar.d((arpp) a3.build(), interactionLoggingScreen);
            acrh acrhVar = acreVar.e;
            if (acrhVar.f()) {
                return;
            }
            HashMap hashMap = new HashMap();
            awav awavVar2 = asgrVar5.d;
            if (awavVar2 == null) {
                awavVar2 = awav.a;
            }
            hashMap.put("client.params.ve", acrh.j(awavVar2));
            if ((asgrVar5.b & 1) == 0 || asgrVar5.c.isEmpty()) {
                awav awavVar3 = asgrVar5.d;
                if (awavVar3 == null) {
                    awavVar3 = awav.a;
                }
                String valueOf = String.valueOf(acrh.j(awavVar3));
                str = "INTERACTIONLOGGINGBUG->CLICK_MISSING_CSN";
                acrh.l("INTERACTIONLOGGINGBUG->CLICK_MISSING_CSN", valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
            } else if (!acrhVar.a.containsKey(asgrVar5.c)) {
                awav awavVar4 = asgrVar5.d;
                if (awavVar4 == null) {
                    awavVar4 = awav.a;
                }
                String valueOf2 = String.valueOf(acrh.j(awavVar4));
                str = "INTERACTIONLOGGINGBUG->CLICK_UNRESOLVED_CSN";
                acrh.l("INTERACTIONLOGGINGBUG->CLICK_UNRESOLVED_CSN", valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
            } else {
                acrg acrgVar = (acrg) acrhVar.a.get(asgrVar5.c);
                awav awavVar5 = asgrVar5.d;
                if (awavVar5 == null) {
                    awavVar5 = awav.a;
                }
                acrhVar.m("CLICK", acrgVar, awavVar5, hashMap);
                boolean z = acrhVar.b;
            }
            afsi.f(str, hashMap);
            boolean z2 = acrhVar.b;
        }
    }

    public static String ck(aadw aadwVar) {
        apwy b2 = aadwVar.b();
        if (b2 == null) {
            return "https://www.youtube.com/csi_204";
        }
        atej atejVar = b2.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aqht aqhtVar = atejVar.t;
        if (aqhtVar == null) {
            aqhtVar = aqht.a;
        }
        asus asusVar = aqhtVar.b;
        if (asusVar == null) {
            asusVar = asus.a;
        }
        if (asusVar.c.isEmpty()) {
            return "https://www.youtube.com/csi_204";
        }
        atej atejVar2 = b2.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        aqht aqhtVar2 = atejVar2.t;
        if (aqhtVar2 == null) {
            aqhtVar2 = aqht.a;
        }
        asus asusVar2 = aqhtVar2.b;
        if (asusVar2 == null) {
            asusVar2 = asus.a;
        }
        return asusVar2.c;
    }

    public static List cl(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            acls aclsVar = null;
            if (str != null) {
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                urlQuerySanitizer.parseQuery(str);
                String value = urlQuerySanitizer.getValue("prefix");
                String value2 = urlQuerySanitizer.getValue("type");
                String value3 = urlQuerySanitizer.getValue("codec");
                if (value == null || value2 == null || value3 == null) {
                    zga.m("EncoderSupportUtil", "Unexpected null value in supported encoder string.");
                } else {
                    axio a2 = acls.a(value3);
                    if (a2 == null) {
                        zga.m("EncoderSupportUtil", value3.length() != 0 ? "Unexpected codec type: ".concat(value3) : new String("Unexpected codec type: "));
                    } else {
                        try {
                            int parseInt = Integer.parseInt(value2);
                            if (parseInt >= -1 && parseInt <= 2) {
                                aclsVar = new acls(value, parseInt, a2);
                            }
                            StringBuilder sb = new StringBuilder(36);
                            sb.append("Unexpected encoder type: ");
                            sb.append(parseInt);
                            zga.m("EncoderSupportUtil", sb.toString());
                        } catch (NumberFormatException unused) {
                            zga.m("EncoderSupportUtil", value2.length() != 0 ? "Failed to parse encoder support type integer: ".concat(value2) : new String("Failed to parse encoder support type integer: "));
                        }
                    }
                }
            }
            if (aclsVar != null) {
                arrayList.add(aclsVar);
            }
        }
        return arrayList;
    }

    public static apxf cn(ajun ajunVar, InteractionLoggingScreen interactionLoggingScreen, apxf apxfVar) {
        aone builder;
        if (apxfVar == null) {
            return null;
        }
        if (interactionLoggingScreen == null) {
            zga.l("Failed to set parent screen");
            return apxfVar;
        }
        if (!apxfVar.pY(atmb.b)) {
            builder = atmc.a.createBuilder();
        } else {
            builder = ((atmc) apxfVar.pX(atmb.b)).toBuilder();
        }
        if (((atmc) builder.instance).c.isEmpty()) {
            String str = interactionLoggingScreen.a;
            builder.copyOnWrite();
            atmc atmcVar = (atmc) builder.instance;
            str.getClass();
            atmcVar.b |= 1;
            atmcVar.c = str;
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.e(atmb.b, (atmc) builder.build());
        apxf apxfVar2 = (apxf) aongVar.build();
        String str2 = ((atmc) builder.instance).c;
        String n = ajun.n(apxfVar2);
        if (n != null) {
            ajunVar.a.put(n, str2);
        }
        return apxfVar2;
    }

    public static int co(int i) {
        return i - 1;
    }

    public static Uri cp(Intent intent) {
        Uri parse;
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER");
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER");
        if (parcelableExtra == null || !(parcelableExtra instanceof Uri)) {
            parse = stringExtra != null ? Uri.parse(stringExtra) : null;
        } else {
            parse = (Uri) parcelableExtra;
        }
        if (parse == null || !"android-app".equals(parse.getScheme()) || TextUtils.isEmpty(parse.getPath())) {
            return null;
        }
        return parse;
    }

    public static boolean cq(Intent intent) {
        return (intent == null || cp(intent) == null) ? false : true;
    }

    public static void cr(LiveCreationActivity liveCreationActivity, Object obj) {
        liveCreationActivity.W = (abrn) obj;
    }

    public static Intent cs(Context context, int i, atfw atfwVar, String str, aqyg aqygVar, boolean z) {
        Intent putExtra = new Intent(context, (Class<?>) LiveCreationActivity.class).addFlags(268435456).putExtra("statusCode", i).putExtra("didStream", z);
        if (atfwVar != null) {
            putExtra.putExtra("endScreenRenderer", atfwVar.toByteArray());
        }
        if (str != null) {
            putExtra.putExtra("errorMessage", str);
        }
        if (aqygVar != null) {
            putExtra.putExtra("errorMessageFormatted", aqygVar.toByteArray());
        }
        return putExtra;
    }

    public static WindowManager.LayoutParams ct() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 262312, -3);
        layoutParams.gravity = 83;
        return layoutParams;
    }

    public static boolean cu(Context context) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (ScreencastHostService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean cv() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static void cw(Context context) {
        context.getClass();
        context.getApplicationContext().startService(ScreencastHostService.c(context));
    }

    public static double cx(DataInputStream dataInputStream) {
        cA(0, dataInputStream);
        return dataInputStream.readDouble();
    }

    public static Object cy(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte == 0) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (readByte == 5) {
            return null;
        }
        if (readByte == 8) {
            dataInputStream.readInt();
            return cz(dataInputStream);
        }
        if (readByte == 2) {
            return dataInputStream.readUTF();
        }
        if (readByte == 3) {
            return cz(dataInputStream);
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unsupported AMF type: ");
        sb.append((int) readByte);
        throw new ProtocolException(sb.toString());
    }

    public static Map cz(DataInputStream dataInputStream) {
        HashMap hashMap = new HashMap();
        while (true) {
            String readUTF = dataInputStream.readUTF();
            if (readUTF.length() != 0) {
                hashMap.put(readUTF, cy(dataInputStream));
            } else {
                cA(9, dataInputStream);
                return hashMap;
            }
        }
    }

    public static apdx d(apwy apwyVar) {
        if (apwyVar != null) {
            apdn apdnVar = apwyVar.d;
            if (apdnVar == null) {
                apdnVar = apdn.a;
            }
            apdp apdpVar = apdnVar.c;
            if (apdpVar == null) {
                apdpVar = apdp.a;
            }
            if ((apdpVar.b & 1) != 0) {
                apdn apdnVar2 = apwyVar.d;
                if (apdnVar2 == null) {
                    apdnVar2 = apdn.a;
                }
                apdp apdpVar2 = apdnVar2.c;
                if (apdpVar2 == null) {
                    apdpVar2 = apdp.a;
                }
                apdx apdxVar = apdpVar2.c;
                return apdxVar == null ? apdx.a : apdxVar;
            }
        }
        return null;
    }

    public static anhy dA(anhy anhyVar, amml ammlVar) {
        return anfq.h(anhyVar, ammlVar, angq.a);
    }

    public static abck dB(apug apugVar) {
        abcj abcjVar = new abcj();
        abcjVar.a = Boolean.valueOf(apugVar.i);
        abcjVar.b = Boolean.valueOf(apugVar.j);
        abcjVar.c = Boolean.valueOf(apugVar.f);
        abcjVar.d = Boolean.valueOf(apugVar.h);
        abcjVar.e = Boolean.valueOf(apugVar.g);
        abcjVar.f = amru.o(new aonw(apugVar.k, apug.a));
        Boolean bool = abcjVar.a;
        if (bool == null || abcjVar.b == null || abcjVar.c == null || abcjVar.d == null || abcjVar.e == null || abcjVar.f == null) {
            StringBuilder sb = new StringBuilder();
            if (abcjVar.a == null) {
                sb.append(" isCrossDeviceOfflineEnabled");
            }
            if (abcjVar.b == null) {
                sb.append(" isFullHdFormatOptionAvailable");
            }
            if (abcjVar.c == null) {
                sb.append(" isRecommendationsEnabled");
            }
            if (abcjVar.d == null) {
                sb.append(" isDownloadQualityEnabled");
            }
            if (abcjVar.e == null) {
                sb.append(" shouldDisplaySmartDownloads");
            }
            if (abcjVar.f == null) {
                sb.append(" downloadQualityFormats");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new abck(bool.booleanValue(), abcjVar.b.booleanValue(), abcjVar.c.booleanValue(), abcjVar.d.booleanValue(), abcjVar.e.booleanValue(), abcjVar.f);
    }

    public static List dC(asbd asbdVar, List list) {
        aonm aonmVar;
        aupv aupvVar;
        aqrf aqrfVar;
        aupr auprVar;
        apuq apuqVar;
        apup apupVar;
        apur apurVar;
        apug apugVar;
        apuh apuhVar;
        apul apulVar;
        apun apunVar;
        apui apuiVar;
        apuj apujVar;
        apuo apuoVar;
        aomf aomfVar;
        aupv aupvVar2;
        ArrayList arrayList = new ArrayList();
        if (asbdVar == null) {
            return arrayList;
        }
        int i = asbdVar.b;
        if (i == 88478200) {
            apug apugVar2 = (apug) asbdVar.c;
            if (apugVar2.e) {
                arrayList.add(dB(apugVar2));
            }
            if (apugVar2.d) {
                arrayList.add(new abcd());
            }
        } else {
            if (i == 61520386) {
                aonmVar = (aupx) asbdVar.c;
            } else if (i == 66930374) {
                aonmVar = (aupv) asbdVar.c;
            } else if (i == 153515154) {
                aonmVar = (aqrf) asbdVar.c;
            } else if (i == 85446662) {
                aonmVar = (aupl) asbdVar.c;
            } else if (i == 155905127) {
                aonmVar = (arau) asbdVar.c;
            } else if (i == 93763033) {
                aonmVar = (aupr) asbdVar.c;
            } else if (i == 94214034) {
                aonmVar = (apuq) asbdVar.c;
            } else if (i == 173548507) {
                aonmVar = (apup) asbdVar.c;
            } else if (i == 144484052) {
                aonmVar = (apur) asbdVar.c;
            } else if (i == 88478200) {
                aonmVar = (apug) asbdVar.c;
            } else if (i == 124189785) {
                aonmVar = (apuh) asbdVar.c;
            } else if (i == 203803278) {
                aonmVar = (apul) asbdVar.c;
            } else if (i == 230577543) {
                aonmVar = (apun) asbdVar.c;
            } else if (i == 324886099) {
                aonmVar = (apui) asbdVar.c;
            } else if (i == 359641852) {
                aonmVar = (apuj) asbdVar.c;
            } else if (i == 369870935) {
                aonmVar = (apuo) asbdVar.c;
                i = 369870935;
            } else {
                aonmVar = null;
            }
            if (aonmVar != null) {
                if (i == 66930374) {
                    aupvVar = (aupv) asbdVar.c;
                } else {
                    aupvVar = aupv.a;
                }
                if ((aupvVar.b & 64) != 0) {
                    if (asbdVar.b == 66930374) {
                        aupvVar2 = (aupv) asbdVar.c;
                    } else {
                        aupvVar2 = aupv.a;
                    }
                    aomfVar = aupvVar2.f;
                } else {
                    if (asbdVar.b == 153515154) {
                        aqrfVar = (aqrf) asbdVar.c;
                    } else {
                        aqrfVar = aqrf.a;
                    }
                    if ((aqrfVar.b & 8) == 0) {
                        if (asbdVar.b == 93763033) {
                            auprVar = (aupr) asbdVar.c;
                        } else {
                            auprVar = aupr.a;
                        }
                        if ((auprVar.b & 8) == 0) {
                            if (asbdVar.b == 94214034) {
                                apuqVar = (apuq) asbdVar.c;
                            } else {
                                apuqVar = apuq.a;
                            }
                            if ((apuqVar.b & 16) == 0) {
                                if (asbdVar.b == 173548507) {
                                    apupVar = (apup) asbdVar.c;
                                } else {
                                    apupVar = apup.a;
                                }
                                if ((apupVar.b & 16) == 0) {
                                    if (asbdVar.b == 144484052) {
                                        apurVar = (apur) asbdVar.c;
                                    } else {
                                        apurVar = apur.a;
                                    }
                                    if ((apurVar.b & 8) == 0) {
                                        if (asbdVar.b == 88478200) {
                                            apugVar = (apug) asbdVar.c;
                                        } else {
                                            apugVar = apug.b;
                                        }
                                        if ((apugVar.c & 512) == 0) {
                                            if (asbdVar.b == 124189785) {
                                                apuhVar = (apuh) asbdVar.c;
                                            } else {
                                                apuhVar = apuh.a;
                                            }
                                            if ((apuhVar.b & 8) == 0) {
                                                if (asbdVar.b == 203803278) {
                                                    apulVar = (apul) asbdVar.c;
                                                } else {
                                                    apulVar = apul.a;
                                                }
                                                if ((apulVar.b & 4) == 0) {
                                                    if (asbdVar.b == 230577543) {
                                                        apunVar = (apun) asbdVar.c;
                                                    } else {
                                                        apunVar = apun.a;
                                                    }
                                                    if ((apunVar.b & 8) == 0) {
                                                        if (asbdVar.b == 324886099) {
                                                            apuiVar = (apui) asbdVar.c;
                                                        } else {
                                                            apuiVar = apui.a;
                                                        }
                                                        if ((apuiVar.b & 8) == 0) {
                                                            if (asbdVar.b == 359641852) {
                                                                apujVar = (apuj) asbdVar.c;
                                                            } else {
                                                                apujVar = apuj.a;
                                                            }
                                                            if ((apujVar.b & 16) == 0) {
                                                                if (asbdVar.b == 369870935) {
                                                                    apuoVar = (apuo) asbdVar.c;
                                                                } else {
                                                                    apuoVar = apuo.a;
                                                                }
                                                                if ((apuoVar.b & 16) == 0) {
                                                                    aomfVar = aomf.b;
                                                                } else {
                                                                    aomfVar = (asbdVar.b == 369870935 ? (apuo) asbdVar.c : apuo.a).e;
                                                                }
                                                            } else {
                                                                aomfVar = (asbdVar.b == 359641852 ? (apuj) asbdVar.c : apuj.a).e;
                                                            }
                                                        } else {
                                                            aomfVar = (asbdVar.b == 324886099 ? (apui) asbdVar.c : apui.a).e;
                                                        }
                                                    } else {
                                                        aomfVar = (asbdVar.b == 230577543 ? (apun) asbdVar.c : apun.a).c;
                                                    }
                                                } else {
                                                    aomfVar = (asbdVar.b == 203803278 ? (apul) asbdVar.c : apul.a).c;
                                                }
                                            } else {
                                                aomfVar = (asbdVar.b == 124189785 ? (apuh) asbdVar.c : apuh.a).c;
                                            }
                                        } else {
                                            aomfVar = (asbdVar.b == 88478200 ? (apug) asbdVar.c : apug.b).l;
                                        }
                                    } else {
                                        aomfVar = (asbdVar.b == 144484052 ? (apur) asbdVar.c : apur.a).e;
                                    }
                                } else {
                                    aomfVar = (asbdVar.b == 173548507 ? (apup) asbdVar.c : apup.a).e;
                                }
                            } else {
                                aomfVar = (asbdVar.b == 94214034 ? (apuq) asbdVar.c : apuq.a).f;
                            }
                        } else {
                            aomfVar = (asbdVar.b == 93763033 ? (aupr) asbdVar.c : aupr.a).e;
                        }
                    } else {
                        aomfVar = (asbdVar.b == 153515154 ? (aqrf) asbdVar.c : aqrf.a).e;
                    }
                }
                if (list != null && !aomfVar.H()) {
                    list.add(aomfVar.I());
                }
                arrayList.add(aonmVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dD(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            aueg auegVar = (aueg) it.next();
            if (!auegVar.c.isEmpty() && (auegVar.b & 2) != 0) {
                argf argfVar = auegVar.d;
                if (argfVar == null) {
                    argfVar = argf.a;
                }
                if (dF(argfVar.c) && dF(argfVar.e) && dF(argfVar.d) && dF(argfVar.f)) {
                }
            }
            return false;
        }
        return true;
    }

    public static adyu dE() {
        if (h == null) {
            h = new adyu();
        }
        return h;
    }

    private static boolean dF(double d2) {
        return d2 >= 0.0d && d2 <= 1.0d;
    }

    public static void da(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, boolean z) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        if (i != 0) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), length, charSequence.length() + length, (true != z ? 0 : 65536) | 33);
        }
    }

    public static void db(SpannableStringBuilder spannableStringBuilder, float f2) {
        char[] cArr = new char[1];
        Arrays.fill(cArr, 0, 1, ' ');
        spannableStringBuilder.append((CharSequence) new String(cArr));
        if (f2 != 0.0f) {
            dc(spannableStringBuilder, 1, new ScaleXSpan(f2));
        }
    }

    public static void dc(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }

    public static bv dd(apxf apxfVar, asrh asrhVar, SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        abkm abkmVar = new abkm();
        abkmVar.af(de(apxfVar, asrhVar, supportedPickerPanelWrapper));
        return abkmVar;
    }

    public static Bundle de(apxf apxfVar, asrh asrhVar, SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        Bundle bundle = new Bundle();
        if (apxfVar != null) {
            bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
            if (asrhVar != null) {
                bundle.putByteArray("ARG_CHAT_MESSAGE", asrhVar.toByteArray());
            }
        }
        if (supportedPickerPanelWrapper != null) {
            bundle.putParcelable("picker_panel", supportedPickerPanelWrapper);
        }
        return bundle;
    }

    public static abht df(abge abgeVar, acra acraVar, acqz acqzVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15) {
        ((Context) azrwVar.get()).getClass();
        aazg aazgVar = (aazg) azrwVar2.get();
        aazgVar.getClass();
        aazc aazcVar = (aazc) azrwVar3.get();
        aazcVar.getClass();
        afzq afzqVar = (afzq) azrwVar4.get();
        afzqVar.getClass();
        ypa ypaVar = (ypa) azrwVar5.get();
        ypaVar.getClass();
        ainy ainyVar = (ainy) azrwVar6.get();
        ainyVar.getClass();
        zaw zawVar = (zaw) azrwVar7.get();
        zawVar.getClass();
        Handler handler = (Handler) azrwVar8.get();
        handler.getClass();
        ajsa ajsaVar = (ajsa) azrwVar9.get();
        ajsaVar.getClass();
        abjk abjkVar = (abjk) azrwVar10.get();
        abjkVar.getClass();
        abhf abhfVar = (abhf) azrwVar11.get();
        abhfVar.getClass();
        abia abiaVar = (abia) azrwVar12.get();
        abiaVar.getClass();
        ((ajfh) azrwVar13.get()).getClass();
        aahv aahvVar = (aahv) azrwVar14.get();
        aahvVar.getClass();
        axze axzeVar = (axze) azrwVar15.get();
        axzeVar.getClass();
        abgeVar.getClass();
        acqzVar.getClass();
        return new abht(aazgVar, aazcVar, afzqVar, ypaVar, ainyVar, zawVar, handler, ajsaVar, abjkVar, abhfVar, abiaVar, aahvVar, axzeVar, abgeVar, acraVar, acqzVar, null, null, null, null);
    }

    public static List dg(String str) {
        aone createBuilder = aovr.a.createBuilder();
        createBuilder.copyOnWrite();
        aovr aovrVar = (aovr) createBuilder.instance;
        aovrVar.b |= 1;
        aovrVar.c = str;
        aovr aovrVar2 = (aovr) createBuilder.build();
        aone createBuilder2 = aovq.a.createBuilder();
        createBuilder2.copyOnWrite();
        aovq aovqVar = (aovq) createBuilder2.instance;
        aovrVar2.getClass();
        aovqVar.c = aovrVar2;
        aovqVar.b |= 1;
        return Arrays.asList((aovq) createBuilder2.build());
    }

    public static Uri dh(aubs aubsVar) {
        if (aubsVar.s.isEmpty()) {
            return null;
        }
        return Uri.parse(aubsVar.s);
    }

    public static List di(aubs aubsVar) {
        ArrayList arrayList = new ArrayList();
        for (aubx aubxVar : aubsVar.v) {
            int i = aubxVar.b;
            if ((i & 1) != 0) {
                atmt atmtVar = aubxVar.c;
                if (atmtVar == null) {
                    atmtVar = atmt.a;
                }
                arrayList.add(ahbj.o(atmtVar));
            } else if ((i & 4) != 0) {
                aufe aufeVar = aubxVar.e;
                if (aufeVar == null) {
                    aufeVar = aufe.a;
                }
                arrayList.add(ahbj.o(aufeVar));
            } else if ((i & 2) != 0) {
                atmv atmvVar = aubxVar.d;
                if (atmvVar == null) {
                    atmvVar = atmv.a;
                }
                arrayList.add(ahbj.o(atmvVar));
            } else if ((i & 8) != 0) {
                aulm aulmVar = aubxVar.f;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                arrayList.add(ahbj.o(aulmVar));
            }
        }
        return arrayList;
    }

    public static aomf dj(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            return atdbVar.f;
        }
        if ((i & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            return atdeVar.g;
        }
        if ((i & 16) != 0) {
            atcw atcwVar = atdaVar.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            return atcwVar.f;
        }
        if ((i & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            return atcxVar.f;
        }
        if ((i & 8) != 0) {
            atdk atdkVar = atdaVar.f;
            if (atdkVar == null) {
                atdkVar = atdk.a;
            }
            return atdkVar.j;
        }
        if ((i & 1024) == 0) {
            return aomf.b;
        }
        avpw avpwVar = atdaVar.m;
        if (avpwVar == null) {
            avpwVar = avpw.a;
        }
        return avpwVar.g;
    }

    public static apxf dk(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            if ((atdbVar.b & 4) == 0) {
                return null;
            }
            atdb atdbVar2 = atdaVar.c;
            if (atdbVar2 == null) {
                atdbVar2 = atdb.a;
            }
            apxf apxfVar = atdbVar2.e;
            return apxfVar == null ? apxf.a : apxfVar;
        }
        if ((i & 16) == 0) {
            if ((i & 1024) == 0) {
                return null;
            }
            avpw avpwVar = atdaVar.m;
            if (avpwVar == null) {
                avpwVar = avpw.a;
            }
            apxf apxfVar2 = avpwVar.f;
            return apxfVar2 == null ? apxf.a : apxfVar2;
        }
        atcw atcwVar = atdaVar.g;
        if (atcwVar == null) {
            atcwVar = atcw.a;
        }
        if ((atcwVar.b & 4) == 0) {
            return null;
        }
        atcw atcwVar2 = atdaVar.g;
        if (atcwVar2 == null) {
            atcwVar2 = atcw.a;
        }
        apxf apxfVar3 = atcwVar2.e;
        return apxfVar3 == null ? apxf.a : apxfVar3;
    }

    public static apxf dl(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            if ((atdeVar.b & 8) == 0) {
                return null;
            }
            atde atdeVar2 = atdaVar.d;
            if (atdeVar2 == null) {
                atdeVar2 = atde.a;
            }
            apxf apxfVar = atdeVar2.e;
            return apxfVar == null ? apxf.a : apxfVar;
        }
        if ((i & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            if ((atcxVar.b & 4) == 0) {
                return null;
            }
            atcx atcxVar2 = atdaVar.h;
            if (atcxVar2 == null) {
                atcxVar2 = atcx.a;
            }
            apxf apxfVar2 = atcxVar2.e;
            return apxfVar2 == null ? apxf.a : apxfVar2;
        }
        if ((i & 8) != 0) {
            atdk atdkVar = atdaVar.f;
            if (atdkVar == null) {
                atdkVar = atdk.a;
            }
            if (atdkVar.i) {
                atdk atdkVar2 = atdaVar.f;
                if (atdkVar2 == null) {
                    atdkVar2 = atdk.a;
                }
                if ((atdkVar2.b & 128) == 0) {
                    return null;
                }
                atdk atdkVar3 = atdaVar.f;
                if (atdkVar3 == null) {
                    atdkVar3 = atdk.a;
                }
                apxf apxfVar3 = atdkVar3.h;
                return apxfVar3 == null ? apxf.a : apxfVar3;
            }
            atdk atdkVar4 = atdaVar.f;
            if (atdkVar4 == null) {
                atdkVar4 = atdk.a;
            }
            if ((atdkVar4.b & 8) != 0) {
                atdk atdkVar5 = atdaVar.f;
                if (atdkVar5 == null) {
                    atdkVar5 = atdk.a;
                }
                apxf apxfVar4 = atdkVar5.e;
                return apxfVar4 == null ? apxf.a : apxfVar4;
            }
        }
        return null;
    }

    public static arfs dm(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            arfs arfsVar = atdbVar.d;
            return arfsVar == null ? arfs.a : arfsVar;
        }
        if ((i & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            arfs arfsVar2 = atdeVar.d;
            return arfsVar2 == null ? arfs.a : arfsVar2;
        }
        if ((i & 16) != 0) {
            atcw atcwVar = atdaVar.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            arfs arfsVar3 = atcwVar.d;
            return arfsVar3 == null ? arfs.a : arfsVar3;
        }
        if ((i & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            arfs arfsVar4 = atcxVar.d;
            return arfsVar4 == null ? arfs.a : arfsVar4;
        }
        if ((i & 8) == 0) {
            avpw avpwVar = atdaVar.m;
            if (avpwVar == null) {
                avpwVar = avpw.a;
            }
            if (avpwVar.c != 2) {
                return null;
            }
            avpw avpwVar2 = atdaVar.m;
            if (avpwVar2 == null) {
                avpwVar2 = avpw.a;
            }
            if (avpwVar2.c == 2) {
                return (arfs) avpwVar2.d;
            }
            return arfs.a;
        }
        atdk atdkVar = atdaVar.f;
        if (atdkVar == null) {
            atdkVar = atdk.a;
        }
        if (atdkVar.i) {
            atdk atdkVar2 = atdaVar.f;
            if (atdkVar2 == null) {
                atdkVar2 = atdk.a;
            }
            arfs arfsVar5 = atdkVar2.g;
            return arfsVar5 == null ? arfs.a : arfsVar5;
        }
        atdk atdkVar3 = atdaVar.f;
        if (atdkVar3 == null) {
            atdkVar3 = atdk.a;
        }
        arfs arfsVar6 = atdkVar3.d;
        return arfsVar6 == null ? arfs.a : arfsVar6;
    }

    public static arfs dn(atda atdaVar) {
        if ((atdaVar.b & 1) == 0) {
            return null;
        }
        atdb atdbVar = atdaVar.c;
        if (atdbVar == null) {
            atdbVar = atdb.a;
        }
        arfs arfsVar = atdbVar.j;
        return arfsVar == null ? arfs.a : arfsVar;
    }

    /* renamed from: do */
    public static CharSequence m0do(atda atdaVar) {
        int i = atdaVar.b;
        aqyg aqygVar = null;
        if ((i & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            if ((atdbVar.b & 1) != 0) {
                atdb atdbVar2 = atdaVar.c;
                if (atdbVar2 == null) {
                    atdbVar2 = atdb.a;
                }
                aqygVar = atdbVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        if ((i & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            if ((atdeVar.b & 1) != 0) {
                atde atdeVar2 = atdaVar.d;
                if (atdeVar2 == null) {
                    atdeVar2 = atde.a;
                }
                aqygVar = atdeVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        if ((i & 16) != 0) {
            atcw atcwVar = atdaVar.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            if ((atcwVar.b & 1) != 0) {
                atcw atcwVar2 = atdaVar.g;
                if (atcwVar2 == null) {
                    atcwVar2 = atcw.a;
                }
                aqygVar = atcwVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        if ((i & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            if ((atcxVar.b & 1) != 0) {
                atcx atcxVar2 = atdaVar.h;
                if (atcxVar2 == null) {
                    atcxVar2 = atcx.a;
                }
                aqygVar = atcxVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        if ((i & 8) == 0) {
            if ((i & 1024) != 0) {
                avpw avpwVar = atdaVar.m;
                if (avpwVar == null) {
                    avpwVar = avpw.a;
                }
                if ((avpwVar.b & 8) != 0) {
                    avpw avpwVar2 = atdaVar.m;
                    if (avpwVar2 == null) {
                        avpwVar2 = avpw.a;
                    }
                    aqygVar = avpwVar2.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                }
                return ajcq.b(aqygVar);
            }
            if ((i & 512) == 0) {
                return null;
            }
            atdg atdgVar = atdaVar.l;
            if (atdgVar == null) {
                atdgVar = atdg.a;
            }
            if ((atdgVar.b & 1) != 0) {
                atdg atdgVar2 = atdaVar.l;
                if (atdgVar2 == null) {
                    atdgVar2 = atdg.a;
                }
                aqygVar = atdgVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        atdk atdkVar = atdaVar.f;
        if (atdkVar == null) {
            atdkVar = atdk.a;
        }
        if (!atdkVar.i) {
            atdk atdkVar2 = atdaVar.f;
            if (atdkVar2 == null) {
                atdkVar2 = atdk.a;
            }
            if ((atdkVar2.b & 1) != 0) {
                atdk atdkVar3 = atdaVar.f;
                if (atdkVar3 == null) {
                    atdkVar3 = atdk.a;
                }
                aqygVar = atdkVar3.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            }
            return ajcq.b(aqygVar);
        }
        atdk atdkVar4 = atdaVar.f;
        if (atdkVar4 == null) {
            atdkVar4 = atdk.a;
        }
        if ((atdkVar4.b & 16) != 0) {
            atdk atdkVar5 = atdaVar.f;
            if (atdkVar5 == null) {
                atdkVar5 = atdk.a;
            }
            aqygVar = atdkVar5.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        return ajcq.b(aqygVar);
    }

    public static int dp(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            int co = anaf.co(atdbVar.i);
            if (co == 0) {
                return 1;
            }
            return co;
        }
        if ((i & 2) == 0) {
            return 1;
        }
        atde atdeVar = atdaVar.d;
        if (atdeVar == null) {
            atdeVar = atde.a;
        }
        int co2 = anaf.co(atdeVar.i);
        if (co2 == 0) {
            return 1;
        }
        return co2;
    }

    public static void dq(aone aoneVar, apxf apxfVar) {
        atda atdaVar = (atda) aoneVar.instance;
        int i = atdaVar.b;
        if ((i & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            aone builder = atdeVar.toBuilder();
            builder.copyOnWrite();
            atde atdeVar2 = (atde) builder.instance;
            apxfVar.getClass();
            atdeVar2.e = apxfVar;
            atdeVar2.b |= 8;
            aoneVar.copyOnWrite();
            atda atdaVar2 = (atda) aoneVar.instance;
            atde atdeVar3 = (atde) builder.build();
            atdeVar3.getClass();
            atdaVar2.d = atdeVar3;
            atdaVar2.b |= 2;
            return;
        }
        if ((i & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            aone builder2 = atcxVar.toBuilder();
            builder2.copyOnWrite();
            atcx atcxVar2 = (atcx) builder2.instance;
            apxfVar.getClass();
            atcxVar2.e = apxfVar;
            atcxVar2.b |= 4;
            aoneVar.copyOnWrite();
            atda atdaVar3 = (atda) aoneVar.instance;
            atcx atcxVar3 = (atcx) builder2.build();
            atcxVar3.getClass();
            atdaVar3.h = atcxVar3;
            atdaVar3.b |= 32;
            return;
        }
        if ((i & 8) != 0) {
            aone createBuilder = atdk.a.createBuilder();
            atdk atdkVar = ((atda) aoneVar.instance).f;
            if (atdkVar == null) {
                atdkVar = atdk.a;
            }
            if (!atdkVar.i) {
                createBuilder.copyOnWrite();
                atdk atdkVar2 = (atdk) createBuilder.instance;
                apxfVar.getClass();
                atdkVar2.e = apxfVar;
                atdkVar2.b |= 8;
            } else {
                createBuilder.copyOnWrite();
                atdk atdkVar3 = (atdk) createBuilder.instance;
                apxfVar.getClass();
                atdkVar3.h = apxfVar;
                atdkVar3.b |= 128;
            }
            aoneVar.copyOnWrite();
            atda atdaVar4 = (atda) aoneVar.instance;
            atdk atdkVar4 = (atdk) createBuilder.build();
            atdkVar4.getClass();
            atdaVar4.f = atdkVar4;
            atdaVar4.b |= 8;
        }
    }

    public static CharSequence dr(asni asniVar) {
        asno b2 = asno.b(asniVar.d);
        if (b2 == null) {
            b2 = asno.LIKE;
        }
        aqyg aqygVar = null;
        if (b2 != asno.DISLIKE) {
            if ((asniVar.b & 256) != 0 && (aqygVar = asniVar.j) == null) {
                aqygVar = aqyg.a;
            }
            return ajcq.b(aqygVar);
        }
        if ((asniVar.b & 1024) != 0 && (aqygVar = asniVar.m) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public static CharSequence ds(asni asniVar) {
        asno b2 = asno.b(asniVar.d);
        if (b2 == null) {
            b2 = asno.LIKE;
        }
        aqyg aqygVar = null;
        if (b2 != asno.LIKE) {
            if ((asniVar.b & 8) != 0 && (aqygVar = asniVar.f) == null) {
                aqygVar = aqyg.a;
            }
            return ajcq.b(aqygVar);
        }
        if ((asniVar.b & 32) != 0 && (aqygVar = asniVar.h) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public static asno dt(aong aongVar) {
        if (!aongVar.pY(asnh.b) || !((Boolean) aongVar.pX(asnh.b)).booleanValue()) {
            aonk aonkVar = asnh.c;
            asno b2 = asno.b(((asni) aongVar.instance).d);
            if (b2 == null) {
                b2 = asno.LIKE;
            }
            aongVar.e(aonkVar, b2);
            aongVar.e(asnh.b, true);
        }
        return (asno) aongVar.pX(asnh.c);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [aooy, java.lang.Object] */
    public static aooy du(String str, aopf aopfVar) {
        try {
            return aopfVar.n(Base64.decode(str, 8), aomw.b());
        } catch (aoob unused) {
            return null;
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
            sb.append("Unable to decode ");
            sb.append(str);
            sb.append(".");
            afsi.c(2, 5, sb.toString(), e2);
            return null;
        }
    }

    public static aooy dv(String str, aopf aopfVar) {
        aopfVar.getClass();
        if (str == null) {
            return null;
        }
        return du(dw(str), aopfVar);
    }

    public static String dw(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            afsi.c(2, 5, "Apparently UTF-8 is no longer a supported encoding", e2);
            return str;
        }
    }

    public static int dx() {
        return ((int) Runtime.getRuntime().totalMemory()) / 16;
    }

    public static cnc dy(byte[] bArr, Map map, arnd arndVar) {
        if (bArr == null || arndVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(arndVar.e);
        cnc cncVar = new cnc();
        cncVar.a = bArr;
        cncVar.f = currentTimeMillis;
        cncVar.e = currentTimeMillis;
        cncVar.c = 0L;
        if (map == null) {
            map = Collections.emptyMap();
        }
        cncVar.g = map;
        return cncVar;
    }

    public static Uri dz(Context context) {
        return whl.s(context, "innertube", "innertube_backedup.pb");
    }

    public static Executor e(int i, Executor executor) {
        afki.a(executor);
        int i2 = i - 1;
        if (i2 == 2) {
            return new ync(4, new yna(6, "mediaCronetResp"));
        }
        if (i2 != 3) {
            return i2 != 4 ? executor : new ync(4, new yna(0, "mediaCronetResp"));
        }
        return new ync(4, new yna(3, "mediaCronetResp"));
    }

    public static ammv f(Uri uri, ammv ammvVar) {
        if (!j(uri)) {
            return amlr.a;
        }
        String h2 = h(uri);
        String g2 = g(uri);
        afki.a(h2);
        afki.a(g2);
        if (ammvVar.h()) {
            return ammv.j(((String) ammvVar.c()).replace("{fvip}", h2).replace("{mn}", g2).concat(".").concat("googlevideo.com"));
        }
        return ammv.j(String.format("r%s---%s.%s", h2, g2, "googlevideo.com"));
    }

    public static String g(Uri uri) {
        List h2;
        String queryParameter = uri.getQueryParameter("mn");
        if (TextUtils.isEmpty(queryParameter) || (h2 = amnm.b(',').h(queryParameter)) == null || h2.size() <= 1) {
            return null;
        }
        return (String) h2.get(1);
    }

    public static String h(Uri uri) {
        return uri.getQueryParameter("fvip");
    }

    public static boolean i(Uri uri, Uri uri2) {
        return uri != null && uri2 != null && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath()) && TextUtils.equals(uri.getQueryParameter("signature"), uri2.getQueryParameter("signature")) && TextUtils.equals(uri.getQueryParameter("sig"), uri2.getQueryParameter("sig")) && TextUtils.equals(uri.getQueryParameter("lsig"), uri2.getQueryParameter("lsig"));
    }

    public static boolean j(Uri uri) {
        String authority = uri.getAuthority();
        return (TextUtils.isEmpty(authority) || !authority.endsWith("googlevideo.com") || TextUtils.isEmpty(h(uri)) || TextUtils.isEmpty(g(uri))) ? false : true;
    }

    public static aels k(atr atrVar, ScheduledExecutorService scheduledExecutorService, aeln aelnVar) {
        afki.a(atrVar);
        afki.a(scheduledExecutorService);
        aels aelsVar = new aels(aelnVar);
        aelsVar.a = new aefw(atrVar, scheduledExecutorService, aelsVar);
        return aelsVar;
    }

    public static aelb l(aelc aelcVar) {
        return new aekx(aelcVar);
    }

    public static boolean m(aejw aejwVar, shf shfVar) {
        return aejwVar != null && shfVar.d() - aejwVar.a < 30000;
    }

    public static aejb n() {
        return new aeja();
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "BT709" : "DCIP3" : "BT2020";
    }

    public static long p(String str) {
        return Long.parseLong(str.substring(str.lastIndexOf(46) + 1));
    }

    public static String q(String str, String str2, long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append(".");
        sb.append(j);
        return sb.toString();
    }

    public static String r(String str, int i, String str2, long j) {
        return q(str, ozv.b(i, str2), j);
    }

    public static String s(String str) {
        if (str == null) {
            afsi.e(1, 6, "null cacheKey in getFormatId.", 0.01d);
            return "";
        }
        int indexOf = str.indexOf(46);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(46, i);
        if (indexOf < 0 || indexOf2 < 0) {
            afsi.e(1, 6, str.length() != 0 ? "Invalid formatId in cacheKey: ".concat(str) : new String("Invalid formatId in cacheKey: "), 0.01d);
            return "";
        }
        return str.substring(i, indexOf2);
    }

    public static String t(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(46)) < 0) {
            String valueOf = String.valueOf(str);
            afsi.e(1, 6, valueOf.length() != 0 ? "Invalid videoId in cacheKey: ".concat(valueOf) : new String("Invalid videoId in cacheKey: "), 0.01d);
            return "";
        }
        return str.substring(0, indexOf);
    }

    public static atsg u(aaea aaeaVar) {
        arfd a2 = aaeaVar.a();
        if (a2 == null) {
            return null;
        }
        atcl atclVar = a2.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atsh atshVar = atclVar.d;
        if (atshVar == null) {
            atshVar = atsh.a;
        }
        if ((atshVar.b & 128) == 0) {
            return null;
        }
        atcl atclVar2 = a2.i;
        if (atclVar2 == null) {
            atclVar2 = atcl.a;
        }
        atsh atshVar2 = atclVar2.d;
        if (atshVar2 == null) {
            atshVar2 = atsh.a;
        }
        atsg atsgVar = atshVar2.h;
        return atsgVar == null ? atsg.a : atsgVar;
    }

    public static atse v(aadw aadwVar) {
        apwy b2 = aadwVar.b();
        if (b2 == null) {
            return null;
        }
        atej atejVar = b2.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        if ((atejVar.b & 1073741824) == 0) {
            return null;
        }
        atej atejVar2 = b2.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        atse atseVar = atejVar2.s;
        return atseVar == null ? atse.b : atseVar;
    }

    public static void w(yrw yrwVar, ysk yskVar, adtu adtuVar) {
        yso ysoVar;
        yso ysoVar2;
        yso ysoVar3;
        yjk.e();
        ysq ysqVar = null;
        try {
            try {
                ysqVar = yrwVar.a(yskVar);
                adtuVar.i(ysqVar);
                if (ysqVar == null || (ysoVar3 = ysqVar.d) == null) {
                    return;
                }
                try {
                    ysoVar3.f();
                } catch (IOException unused) {
                }
            } catch (IOException e2) {
                adtuVar.a(e2);
                if (ysqVar == null || (ysoVar2 = ysqVar.d) == null) {
                    return;
                }
                try {
                    ysoVar2.f();
                } catch (IOException unused2) {
                }
            }
        } catch (Throwable th) {
            if (ysqVar != null && (ysoVar = ysqVar.d) != null) {
                try {
                    ysoVar.f();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static String x(boolean z, String str, String str2) {
        String str3;
        Object[] objArr = new Object[3];
        if (bW(str2)) {
            str3 = str2.length() != 0 ? ".".concat(str2) : new String(".");
        } else {
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = true != z ? "phone" : "tablet";
        objArr[2] = str;
        return String.format("android%s-%s-%s", objArr);
    }

    public static Intent y(Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity");
    }

    public static atr z(String str, advq advqVar, Executor executor, aenf aenfVar, atse atseVar, axzg axzgVar) {
        int i;
        int i2;
        int i3 = (atseVar == null || (i2 = atseVar.k) <= 0) ? 8000 : i2;
        int i4 = (atseVar == null || (i = atseVar.l) <= 0) ? 8000 : i;
        boolean z = true;
        if (atseVar != null && !atseVar.j) {
            z = false;
        }
        CronetEngine a2 = advqVar.a(z);
        if (a2 != null) {
            aty b2 = aear.b(a2, executor, atr.a, i3, i4, false, ((Boolean) axzgVar.a.a.Y(axzd.a).B().aC(false)).booleanValue());
            if (aenfVar != null) {
                b2.b(aenfVar);
            }
            return b2;
        }
        ati atiVar = new ati();
        atiVar.b = str;
        atiVar.c = i3;
        atiVar.d = i4;
        return atiVar.a();
    }

    public boolean a() {
        return true;
    }

    public final synchronized void bI() {
    }

    public adyu(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        azrwVar.getClass();
        azrwVar2.getClass();
        azrwVar3.getClass();
        azrwVar4.getClass();
    }

    public static void cm(Context context, Button button, int i) {
        Integer valueOf;
        int i2 = i - 1;
        Integer num = null;
        if (i2 == 2) {
            num = Integer.valueOf(R.drawable.lc_button_style_primary);
            valueOf = Integer.valueOf(R.color.lc_button_style_primary_text);
        } else if (i2 == 3) {
            num = Integer.valueOf(R.drawable.lc_button_style_destructive);
            valueOf = Integer.valueOf(R.color.lc_button_style_destructive_text);
        } else if (i2 == 13) {
            num = Integer.valueOf(R.drawable.lc_button_style_light_text);
            valueOf = Integer.valueOf(R.color.lc_button_style_blue_text);
        } else if (i2 != 15) {
            valueOf = null;
        } else {
            num = Integer.valueOf(R.drawable.lc_button_style_light_text);
            valueOf = Integer.valueOf(R.color.lc_button_style_light_text_text);
        }
        if (num != null) {
            button.setBackground(aii.a(context, num.intValue()));
            button.setTextColor(aih.d(context, valueOf.intValue()));
        }
    }

    public static void cj(acpm acpmVar, acpa acpaVar, arps arpsVar, afsx afsxVar) {
        aony<arpt> aonyVar = arpsVar.c;
        if (aonyVar != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (arpt arptVar : aonyVar) {
                if (arptVar != null) {
                    aquq aquqVar = arptVar.b;
                    if (aquqVar == null) {
                        aquqVar = aquq.a;
                    }
                    if (!aquqVar.c) {
                        long c2 = arptVar.c <= 0 ? Long.MAX_VALUE : acpmVar.b.c() + TimeUnit.MINUTES.toMillis(arptVar.c);
                        aquq aquqVar2 = arptVar.b;
                        if (aquqVar2 == null) {
                            aquqVar2 = aquq.a;
                        }
                        arpo a2 = arpo.a(aquqVar2.b);
                        if (a2 != null) {
                            concurrentHashMap.put(a2, Long.valueOf(c2));
                        }
                    }
                }
            }
            acpmVar.g = concurrentHashMap;
        }
        if (acpmVar.a()) {
            String str = arpsVar.d;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            acpaVar.c(afsxVar);
            acpaVar.a.edit().putString(acpa.e(afsxVar), str).apply();
        }
    }
}
