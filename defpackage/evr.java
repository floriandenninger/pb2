package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class evr {

    @Backup
    public static final String BACKGROUND_AUDIO_POLICY = "background_audio_policy";

    @Backup
    public static final String SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG = "show_background_playback_settings_dialog";

    public static ammv A(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.h & 8192) == 0) {
            return amlr.a;
        }
        aswb aswbVar2 = a.e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return ammv.j(aswbVar2.bf);
    }

    public static String B(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null || (a.b & 64) == 0) {
            return "embeddedassistant.googleapis.com";
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.aT;
    }

    public static String C(aaea aaeaVar, Context context) {
        arfd a = aaeaVar.a();
        aqbc aqbcVar = a.r;
        if (aqbcVar == null) {
            aqbcVar = aqbc.b;
        }
        if (aqbcVar.c.isEmpty()) {
            return context.getString(R.string.unlimited_brand_name_premium);
        }
        aqbc aqbcVar2 = a.r;
        if (aqbcVar2 == null) {
            aqbcVar2 = aqbc.b;
        }
        return aqbcVar2.c;
    }

    public static boolean D(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.F;
    }

    public static boolean E(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.f116J;
    }

    public static boolean F(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.ba;
    }

    public static boolean G(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.aj;
    }

    public static boolean H(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.E;
    }

    public static boolean I(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.w;
    }

    public static boolean J(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.A;
    }

    public static boolean K(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.ab;
    }

    public static boolean L(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.aQ;
    }

    public static boolean M(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.X;
    }

    public static boolean N(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.y;
    }

    public static boolean O(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bd;
    }

    public static boolean P(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.r;
    }

    public static boolean Q(aaea aaeaVar) {
        asuj asujVar = aaeaVar.a().m;
        if (asujVar == null) {
            asujVar = asuj.a;
        }
        asiu asiuVar = asujVar.c;
        if (asiuVar == null) {
            asiuVar = asiu.a;
        }
        return asiuVar.h;
    }

    public static boolean R(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bh;
    }

    public static boolean S(aaea aaeaVar) {
        atcl atclVar = aaeaVar.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        return atcmVar.b;
    }

    public static boolean T(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.aR;
    }

    public static boolean U(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.ai;
    }

    public static boolean V(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bs;
    }

    public static boolean W(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bw;
    }

    public static boolean X(ysy ysyVar, aaea aaeaVar) {
        if (!ysyVar.n()) {
            return false;
        }
        avuj avujVar = aaeaVar.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        return (avujVar.b & 1) == 0 || avujVar.u;
    }

    public static boolean Y(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.au;
    }

    public static boolean Z(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bn;
    }

    public static Uri a(Context context) {
        return whl.s(context, "backgroundsettings", "backgroundsettings.pb");
    }

    public static boolean aA(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aB;
    }

    public static boolean aB(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aw;
    }

    public static boolean aC(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bs;
    }

    public static boolean aD(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cw;
    }

    public static boolean aE(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aL;
    }

    public static boolean aF(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aK;
    }

    public static boolean aG(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aY;
    }

    public static boolean aH(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.D;
    }

    public static boolean aI(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bT;
    }

    public static boolean aJ(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aH;
    }

    public static boolean aK(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ad;
    }

    public static boolean aL(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bV;
    }

    public static boolean aM(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aA;
    }

    public static boolean aN(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.Q;
    }

    public static boolean aO(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ao;
    }

    public static boolean aP(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.h;
    }

    public static boolean aQ(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aE;
    }

    public static boolean aR(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aO;
    }

    public static boolean aS(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.x;
    }

    public static boolean aT(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ai;
    }

    public static boolean aU(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cC;
    }

    public static boolean aV(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.A;
    }

    public static boolean aW(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cy;
    }

    public static boolean aX(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cx;
    }

    public static boolean aY(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bj;
    }

    public static boolean aZ(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cN;
    }

    public static boolean aa(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.v;
    }

    public static boolean ab(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bp;
    }

    public static boolean ac(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.x;
    }

    public static boolean ad(aaea aaeaVar) {
        atcl atclVar = aaeaVar.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        return atcmVar.i;
    }

    public static boolean ae(arfd arfdVar) {
        aswb aswbVar = arfdVar.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bt;
    }

    public static boolean af(arfd arfdVar) {
        aswb aswbVar = arfdVar.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bv;
    }

    public static boolean ag(arfd arfdVar) {
        aswb aswbVar = arfdVar.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bu;
    }

    public static float ah(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        awan awanVar = asvuVar.v;
        if (awanVar == null) {
            awanVar = awan.a;
        }
        if ((awanVar.b & 2) == 0) {
            return 2.0f;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        awan awanVar2 = asvuVar2.v;
        if (awanVar2 == null) {
            awanVar2 = awan.a;
        }
        return awanVar2.d;
    }

    public static int ai(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aX;
    }

    public static int aj(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.w <= 0) {
            return 2400;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        return asvuVar2.w;
    }

    public static int ak(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.k;
    }

    public static ammv al(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if ((asvuVar.g & 524288) == 0) {
            return amlr.a;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        return ammv.j(asvuVar2.bG);
    }

    public static apeq am(aadw aadwVar) {
        apwy b = aadwVar.b();
        avdj avdjVar = b.u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        if ((avdjVar.b & 8) == 0) {
            return null;
        }
        avdj avdjVar2 = b.u;
        if (avdjVar2 == null) {
            avdjVar2 = avdj.a;
        }
        apeq apeqVar = avdjVar2.e;
        return apeqVar == null ? apeq.a : apeqVar;
    }

    public static String an(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if ((asvuVar.d & 1048576) == 0) {
            return null;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        return asvuVar2.R;
    }

    public static boolean ao(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null || (b.b & 262144) == 0) {
            return false;
        }
        atfq atfqVar = b.o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        return atfqVar.s;
    }

    public static boolean ap(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cB;
    }

    public static boolean aq(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bN;
    }

    public static boolean ar(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bp;
    }

    public static boolean as(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return "always_show_entry_point".equals(asvuVar.bK) || at(aadwVar);
    }

    public static boolean at(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return "conditionally_show_entry_point".equals(asvuVar.bK);
    }

    public static boolean au(aadw aadwVar) {
        atyg atygVar = aadwVar.b().v;
        if (atygVar == null) {
            atygVar = atyg.a;
        }
        return atygVar.e;
    }

    public static boolean av(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aI;
    }

    public static boolean aw(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.al;
    }

    public static boolean ax(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.am;
    }

    public static boolean ay(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ar;
    }

    public static boolean az(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bQ;
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 23 || context.checkCallingOrSelfPermission("android.permission.READ_CONTACTS") == 0;
    }

    public static boolean bA() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static final String bB(Object obj) {
        if (obj instanceof apmg) {
            return ((apmg) obj).k;
        }
        if (obj instanceof aqbs) {
            return ((aqbs) obj).l;
        }
        if (obj instanceof ardg) {
            ardg ardgVar = (ardg) obj;
            if ((ardgVar.b & 262144) != 0) {
                return ardgVar.c;
            }
            return null;
        }
        if (obj instanceof asph) {
            return ((asph) obj).c;
        }
        if (obj instanceof asot) {
            return ((asot) obj).g;
        }
        if (obj instanceof asop) {
            return ((asop) obj).e;
        }
        if (obj instanceof asqf) {
            return ((asqf) obj).i;
        }
        if (obj instanceof atdc) {
            return ((atdc) obj).g;
        }
        if (obj instanceof atvw) {
            return ((atvw) obj).d;
        }
        if (obj instanceof atvt) {
            return ((atvt) obj).d;
        }
        if (obj instanceof auzj) {
            return ((auzj) obj).s;
        }
        if (obj instanceof aveh) {
            return ((aveh) obj).l;
        }
        if (obj instanceof apmp) {
            return ((apmp) obj).t;
        }
        if (obj instanceof avhy) {
            return ((avhy) obj).d;
        }
        if (obj instanceof aths) {
            aths athsVar = (aths) obj;
            if ((athsVar.b & 4096) != 0) {
                return athsVar.j;
            }
        }
        return null;
    }

    public static boolean bC(ywr ywrVar) {
        return !((gnh) ywrVar.c()).h;
    }

    public static final jpq bD(ywr ywrVar, ayrv ayrvVar) {
        ywrVar.getClass();
        ayrvVar.getClass();
        return new jpq(ywrVar, ayrvVar);
    }

    public static aoxl bE(String str) {
        String b = fhe.b(str);
        b.getClass();
        amkq.O(!b.isEmpty(), "key cannot be empty");
        aone createBuilder = aoxn.a.createBuilder();
        createBuilder.copyOnWrite();
        aoxn aoxnVar = (aoxn) createBuilder.instance;
        aoxnVar.c |= 1;
        aoxnVar.d = b;
        aoxl aoxlVar = new aoxl(createBuilder);
        String x = fhe.x(str);
        aone aoneVar = aoxlVar.a;
        aoneVar.copyOnWrite();
        aoxn aoxnVar2 = (aoxn) aoneVar.instance;
        x.getClass();
        aoxnVar2.c |= 2;
        aoxnVar2.e = x;
        return aoxlVar;
    }

    public static aqmg bF(String str, avxt avxtVar, float f, float f2) {
        aone createBuilder = aqmf.a.createBuilder();
        createBuilder.copyOnWrite();
        aqmf aqmfVar = (aqmf) createBuilder.instance;
        aqmfVar.b = 2;
        aqmfVar.c = str;
        aqmg d = aqmh.d(fhe.e((aqmf) createBuilder.build()));
        d.d(avxtVar);
        if (f2 > 0.0f) {
            d.ak(Float.valueOf(f));
            d.c(Float.valueOf(f2));
        }
        return d;
    }

    public static aucv bG(avgg avggVar) {
        aone createBuilder = aucu.a.createBuilder();
        if (avggVar != null) {
            createBuilder.copyOnWrite();
            aucu aucuVar = (aucu) createBuilder.instance;
            aucuVar.c = avggVar;
            aucuVar.b |= 1;
        }
        aone createBuilder2 = aucv.a.createBuilder();
        aucu aucuVar2 = (aucu) createBuilder.build();
        createBuilder2.copyOnWrite();
        aucv aucvVar = (aucv) createBuilder2.instance;
        aucuVar2.getClass();
        aucvVar.c = aucuVar2;
        aucvVar.b = 2;
        return (aucv) createBuilder2.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static avjq bH(String str, avjo avjoVar, amru amruVar, ammv ammvVar) {
        String x = fhe.x(str);
        x.getClass();
        amkq.O(!x.isEmpty(), "key cannot be empty");
        aone createBuilder = avjt.a.createBuilder();
        createBuilder.copyOnWrite();
        avjt avjtVar = (avjt) createBuilder.instance;
        avjtVar.c |= 1;
        avjtVar.d = x;
        avjq avjqVar = new avjq(createBuilder);
        avjqVar.d(avjoVar);
        if (amruVar != null && !amruVar.isEmpty()) {
            amxe it = amruVar.iterator();
            while (it.hasNext()) {
                auyr auyrVar = (auyr) it.next();
                aone aoneVar = avjqVar.a;
                aoneVar.copyOnWrite();
                avjt avjtVar2 = (avjt) aoneVar.instance;
                auyrVar.getClass();
                aony aonyVar = avjtVar2.f;
                if (!aonyVar.c()) {
                    avjtVar2.f = aonm.mutableCopy(aonyVar);
                }
                avjtVar2.f.add(auyrVar);
            }
        }
        if (ammvVar.h()) {
            avjqVar.c((avjp) ammvVar.c());
        }
        return avjqVar;
    }

    public static avzd bI(String str, long j) {
        String A = fhe.A(str);
        A.getClass();
        amkq.O(!A.isEmpty(), "key cannot be empty");
        aone createBuilder = avzg.a.createBuilder();
        createBuilder.copyOnWrite();
        avzg avzgVar = (avzg) createBuilder.instance;
        avzgVar.c |= 1;
        avzgVar.d = A;
        avzd avzdVar = new avzd(createBuilder);
        aone aoneVar = avzdVar.a;
        aoneVar.copyOnWrite();
        avzg avzgVar2 = (avzg) aoneVar.instance;
        str.getClass();
        avzgVar2.c |= 2;
        avzgVar2.e = str;
        Long valueOf = Long.valueOf(j);
        aone aoneVar2 = avzdVar.a;
        long longValue = valueOf.longValue();
        aoneVar2.copyOnWrite();
        avzg avzgVar3 = (avzg) aoneVar2.instance;
        avzgVar3.c |= 4;
        avzgVar3.f = longValue;
        return avzdVar;
    }

    public static awia bJ(agnb agnbVar) {
        awia d = awib.d(fhe.c(agnbVar.a));
        String str = agnbVar.a;
        aone aoneVar = d.a;
        aoneVar.copyOnWrite();
        awid awidVar = (awid) aoneVar.instance;
        awid awidVar2 = awid.a;
        awidVar.c |= 4;
        awidVar.e = str;
        String str2 = agnbVar.b;
        aone aoneVar2 = d.a;
        aoneVar2.copyOnWrite();
        awid awidVar3 = (awid) aoneVar2.instance;
        str2.getClass();
        awidVar3.c |= 8;
        awidVar3.f = str2;
        avgg e = agnbVar.c.e();
        aone aoneVar3 = d.a;
        aoneVar3.copyOnWrite();
        awid awidVar4 = (awid) aoneVar3.instance;
        e.getClass();
        awidVar4.g = e;
        awidVar4.c |= 16;
        return d;
    }

    public static awij bK(String str, long j) {
        String h = fhe.h(str);
        h.getClass();
        amkq.O(!h.isEmpty(), "key cannot be empty");
        aone createBuilder = awim.a.createBuilder();
        createBuilder.copyOnWrite();
        awim awimVar = (awim) createBuilder.instance;
        awimVar.c |= 1;
        awimVar.d = h;
        awij awijVar = new awij(createBuilder);
        Long valueOf = Long.valueOf(j);
        aone aoneVar = awijVar.a;
        long longValue = valueOf.longValue();
        aoneVar.copyOnWrite();
        awim awimVar2 = (awim) aoneVar.instance;
        awimVar2.c |= 32;
        awimVar2.h = longValue;
        String y = fhe.y(str);
        aone aoneVar2 = awijVar.a;
        aoneVar2.copyOnWrite();
        awim awimVar3 = (awim) aoneVar2.instance;
        y.getClass();
        awimVar3.c |= 4;
        awimVar3.e = y;
        String q = fhe.q(str);
        aone aoneVar3 = awijVar.a;
        aoneVar3.copyOnWrite();
        awim awimVar4 = (awim) aoneVar3.instance;
        q.getClass();
        awimVar4.c |= 16;
        awimVar4.g = q;
        String s = fhe.s(str);
        aone aoneVar4 = awijVar.a;
        aoneVar4.copyOnWrite();
        awim awimVar5 = (awim) aoneVar4.instance;
        s.getClass();
        awimVar5.c |= 8;
        awimVar5.f = s;
        return awijVar;
    }

    public static awjg bL(String str, String str2) {
        String u = fhe.u(str, str2);
        u.getClass();
        amkq.O(!u.isEmpty(), "key cannot be empty");
        aone createBuilder = awjj.a.createBuilder();
        createBuilder.copyOnWrite();
        awjj awjjVar = (awjj) createBuilder.instance;
        awjjVar.c |= 1;
        awjjVar.d = u;
        awjg awjgVar = new awjg(createBuilder);
        String y = fhe.y(str2);
        aone aoneVar = awjgVar.a;
        aoneVar.copyOnWrite();
        awjj awjjVar2 = (awjj) aoneVar.instance;
        y.getClass();
        awjjVar2.c |= 4;
        awjjVar2.e = y;
        return awjgVar;
    }

    public static awjn bM(agnp agnpVar, boolean z) {
        String f = agnpVar.f();
        avgg d = agnpVar.d();
        aone createBuilder = awjm.a.createBuilder();
        String i = agnpVar.i();
        createBuilder.copyOnWrite();
        awjm awjmVar = (awjm) createBuilder.instance;
        i.getClass();
        awjmVar.b |= 1;
        awjmVar.c = i;
        awjn d2 = awjo.d(fhe.y(f));
        String A = fhe.A(f);
        aone aoneVar = d2.a;
        aoneVar.copyOnWrite();
        awjq awjqVar = (awjq) aoneVar.instance;
        awjq awjqVar2 = awjq.a;
        A.getClass();
        awjqVar.c |= 8192;
        awjqVar.p = A;
        aone aoneVar2 = d2.a;
        aoneVar2.copyOnWrite();
        awjq awjqVar3 = (awjq) aoneVar2.instance;
        f.getClass();
        awjqVar3.c |= 4;
        awjqVar3.e = f;
        String j = agnpVar.j();
        aone aoneVar3 = d2.a;
        aoneVar3.copyOnWrite();
        awjq awjqVar4 = (awjq) aoneVar3.instance;
        j.getClass();
        awjqVar4.c |= 16;
        awjqVar4.g = j;
        Long valueOf = Long.valueOf(agnpVar.b());
        aone aoneVar4 = d2.a;
        long longValue = valueOf.longValue();
        aoneVar4.copyOnWrite();
        awjq awjqVar5 = (awjq) aoneVar4.instance;
        awjqVar5.c |= 1024;
        awjqVar5.m = longValue;
        Long valueOf2 = Long.valueOf(agnpVar.d.getTime());
        aone aoneVar5 = d2.a;
        long longValue2 = valueOf2.longValue();
        aoneVar5.copyOnWrite();
        awjq awjqVar6 = (awjq) aoneVar5.instance;
        awjqVar6.c |= 32;
        awjqVar6.h = longValue2;
        Integer valueOf3 = Integer.valueOf((int) agnpVar.a());
        aone aoneVar6 = d2.a;
        int intValue = valueOf3.intValue();
        aoneVar6.copyOnWrite();
        awjq awjqVar7 = (awjq) aoneVar6.instance;
        awjqVar7.c |= 64;
        awjqVar7.i = intValue;
        if (d == null) {
            d = avgg.a;
        }
        aone aoneVar7 = d2.a;
        aoneVar7.copyOnWrite();
        awjq awjqVar8 = (awjq) aoneVar7.instance;
        d.getClass();
        awjqVar8.j = d;
        awjqVar8.c |= 128;
        agnb agnbVar = agnpVar.a;
        if (agnbVar != null) {
            String c = fhe.c(agnbVar.a);
            aone aoneVar8 = d2.a;
            aoneVar8.copyOnWrite();
            awjq awjqVar9 = (awjq) aoneVar8.instance;
            c.getClass();
            awjqVar9.c |= 8;
            awjqVar9.f = c;
        }
        if (z) {
            String e = agnpVar.e();
            createBuilder.copyOnWrite();
            awjm awjmVar2 = (awjm) createBuilder.instance;
            e.getClass();
            awjmVar2.b |= 4;
            awjmVar2.e = e;
            String h = agnpVar.h();
            createBuilder.copyOnWrite();
            awjm awjmVar3 = (awjm) createBuilder.instance;
            h.getClass();
            awjmVar3.b |= 2;
            awjmVar3.d = h;
        }
        aone aoneVar9 = d2.a;
        aoneVar9.copyOnWrite();
        awjq awjqVar10 = (awjq) aoneVar9.instance;
        awjm awjmVar4 = (awjm) createBuilder.build();
        awjmVar4.getClass();
        awjqVar10.q = awjmVar4;
        awjqVar10.c |= 16384;
        return d2;
    }

    public static void bN(aalc aalcVar, String str) {
        aalcVar.b().q(new joi(str, 1)).C().Q();
    }

    public static void bO(aalc aalcVar, String str) {
        aalcVar.c().q(new joi(str, 0)).C().Q();
    }

    public static jmt bP(asxs asxsVar) {
        return new jms(asxsVar);
    }

    public static jmt bQ(awil awilVar) {
        return new jmr(awilVar);
    }

    public static final Animator bR(View view, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new jmh(view, 0));
        return ofObject;
    }

    public static void bS(aalc aalcVar, amsx amsxVar) {
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k((whu) listIterator.next());
        }
    }

    public static void bT(aalc aalcVar, Map map, agni agniVar, amml ammlVar, jhx jhxVar) {
        String str = agniVar.a.a;
        Set set = (Set) map.get(str);
        HashSet hashSet = new HashSet(agniVar.b);
        if (set != null) {
            amwe al = amkq.al(set, hashSet);
            if (jhxVar != null) {
                jhxVar.a(al);
            }
            bS(aalcVar, (amsx) ammlVar.apply(amkq.al(hashSet, set)));
        } else {
            bS(aalcVar, (amsx) ammlVar.apply(hashSet));
        }
        map.put(str, hashSet);
    }

    public static amsx bU(Map map, String str) {
        amsv i = amsx.i();
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (arxs arxsVar : ((arxt) it.next()).b) {
                    if (!arxsVar.d.isEmpty()) {
                        i.c(arxsVar.d);
                    }
                }
            }
        }
        return i.g();
    }

    public static jbp bV(aqts aqtsVar) {
        auov auovVar;
        aqtu aqtuVar;
        jbp jbpVar = null;
        if ((aqtsVar.c & 16) != 0) {
            aqtq aqtqVar = aqtsVar.g;
            if (aqtqVar == null) {
                aqtqVar = aqtq.a;
            }
            if (aqtqVar.b == 49399797) {
                auovVar = (auov) aqtqVar.c;
            } else {
                auovVar = auov.a;
            }
            if (auovVar.d.size() != 0) {
                askd askdVar = ((auoy) auovVar.d.get(0)).j;
                if (askdVar == null) {
                    askdVar = askd.a;
                }
                if (askdVar.e.size() != 0 && (((askg) askdVar.e.get(0)).g & 268435456) != 0) {
                    asra asraVar = ((askg) askdVar.e.get(0)).at;
                    if (asraVar == null) {
                        asraVar = asra.a;
                    }
                    aqtr aqtrVar = aqtsVar.f;
                    if (aqtrVar == null) {
                        aqtrVar = aqtr.a;
                    }
                    if (aqtrVar.b == 138681548) {
                        aqtr aqtrVar2 = aqtsVar.f;
                        if (aqtrVar2 == null) {
                            aqtrVar2 = aqtr.a;
                        }
                        if (aqtrVar2.b == 138681548) {
                            aqtuVar = (aqtu) aqtrVar2.c;
                        } else {
                            aqtuVar = aqtu.a;
                        }
                        jbpVar = new jbp(aqtuVar, asraVar);
                    }
                }
            }
        }
        return jbpVar;
    }

    public static int bW(apxf apxfVar, aaea aaeaVar) {
        if (apxfVar == null) {
            return 1;
        }
        String T = whu.T(apxfVar);
        if (T != null) {
            aswb aswbVar = aaeaVar.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.k.contains(T)) {
                return 4;
            }
            aswb aswbVar2 = aaeaVar.a().e;
            if (aswbVar2 == null) {
                aswbVar2 = aswb.a;
            }
            if (aswbVar2.l.contains(T)) {
                return 3;
            }
        }
        aplv aplvVar = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).g;
        if (aplvVar == null) {
            aplvVar = aplv.a;
        }
        aplu apluVar = aplvVar.b;
        if (apluVar == null) {
            apluVar = aplu.a;
        }
        int aO = anaf.aO(apluVar.b);
        if (aO == 0) {
            return 1;
        }
        return aO;
    }

    public static void bX(acra acraVar, String str) {
        InteractionLoggingScreen c = acraVar.c();
        if (c != null) {
            c.c();
            int i = c.f;
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashm.a.createBuilder();
            createBuilder2.copyOnWrite();
            ashm ashmVar = (ashm) createBuilder2.instance;
            str.getClass();
            ashmVar.b |= 1;
            ashmVar.c = str;
            createBuilder2.copyOnWrite();
            ashm ashmVar2 = (ashm) createBuilder2.instance;
            ashmVar2.b |= 2;
            ashmVar2.d = i;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashm ashmVar3 = (ashm) createBuilder2.build();
            ashmVar3.getClass();
            ashtVar.l = ashmVar3;
            ashtVar.b |= 16384;
            asht ashtVar2 = (asht) createBuilder.build();
            awav i2 = acraVar.i(new Object(), acsb.c(22811));
            acraVar.D(adyu.ce(i2));
            acraVar.u(adyu.ce(i2), ashtVar2);
        }
    }

    public static auci bY(aucn aucnVar) {
        if (aucnVar == null) {
            return null;
        }
        for (auco aucoVar : aucnVar.d) {
            if ((aucoVar.b & 8) != 0) {
                auci auciVar = aucoVar.d;
                return auciVar == null ? auci.a : auciVar;
            }
        }
        return null;
    }

    public static aucj bZ(aucn aucnVar) {
        if (aucnVar == null) {
            return null;
        }
        for (auco aucoVar : aucnVar.d) {
            if ((aucoVar.b & 4) != 0) {
                aucj aucjVar = aucoVar.c;
                return aucjVar == null ? aucj.a : aucjVar;
            }
        }
        return null;
    }

    public static boolean ba(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.X;
    }

    public static boolean bb(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aa;
    }

    public static boolean bc(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        awan awanVar = asvuVar.v;
        if (awanVar == null) {
            awanVar = awan.a;
        }
        if ((awanVar.b & 1) == 0) {
            return true;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        awan awanVar2 = asvuVar2.v;
        if (awanVar2 == null) {
            awanVar2 = awan.a;
        }
        return awanVar2.c;
    }

    public static boolean bd(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bY;
    }

    public static boolean be(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return false;
        }
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.by;
    }

    public static boolean bf(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        awbp awbpVar = asvuVar.G;
        if (awbpVar == null) {
            awbpVar = awbp.a;
        }
        return awbpVar.b;
    }

    public static boolean bg(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ab;
    }

    public static boolean bh(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.bv;
    }

    public static boolean bi(aadw aadwVar) {
        avdj avdjVar = aadwVar.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        return avdjVar.f;
    }

    public static boolean bj(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ay;
    }

    public static boolean bk(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.ci;
    }

    public static int bl(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if ((a.b & 64) == 0) {
            return 2;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        int dK = amkq.dK(aswbVar.C);
        if (dK == 0) {
            return 1;
        }
        return dK;
    }

    public static int bm(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if ((a.b & 64) == 0) {
            return 2;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        int dJ = amkq.dJ(aswbVar.B);
        if (dJ == 0) {
            return 1;
        }
        return dJ;
    }

    public static int bn(aadw aadwVar) {
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        awan awanVar = asvuVar.v;
        if (awanVar == null) {
            awanVar = awan.a;
        }
        if ((awanVar.b & 128) == 0) {
            return 2;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        awan awanVar2 = asvuVar2.v;
        if (awanVar2 == null) {
            awanVar2 = awan.a;
        }
        int U = awxr.U(awanVar2.g);
        if (U == 0) {
            return 1;
        }
        return U;
    }

    public static final gol bp(Object obj) {
        gog cc = cc(obj);
        float f = cc.o;
        switch (cc.ordinal()) {
            case 1:
                return (gol) obj;
            case 2:
                return new gol((arhz) obj);
            case 3:
                return new gol((jah) obj);
            case 4:
                if (cd(obj)) {
                    return new gol((arih) obj);
                }
                return null;
            case 5:
                return new gol((auhx) obj);
            case 6:
                return new gol(((nia) obj).a);
            case 7:
                return new gol((aqjc) obj);
            case 8:
                return new gol((mge) obj);
            case 9:
                return new gol((mgf) obj);
            case 10:
                return new gol((auhe) obj);
            case 11:
                return new gol((auhd) obj);
            case 12:
                return new gol((auhk) obj);
            case 13:
                return new gol((auhl) obj);
            default:
                return null;
        }
    }

    public static final arhw bq(arhz arhzVar) {
        if (arhzVar == null) {
            return null;
        }
        arhx arhxVar = arhzVar.g;
        if (arhxVar == null) {
            arhxVar = arhx.a;
        }
        if ((arhxVar.b & 1) == 0) {
            return null;
        }
        arhx arhxVar2 = arhzVar.g;
        if (arhxVar2 == null) {
            arhxVar2 = arhx.a;
        }
        arhw arhwVar = arhxVar2.c;
        return arhwVar == null ? arhw.a : arhwVar;
    }

    public static final boolean br(Object obj) {
        return cc(obj) != gog.NONE;
    }

    public static apxf bs(apxf apxfVar) {
        if (apxfVar == null) {
            return null;
        }
        if (apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            return apxfVar;
        }
        if (apxfVar.pY(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
            for (apxf apxfVar2 : ((CommandExecutorCommandOuterClass$CommandExecutorCommand) apxfVar.pX(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b) {
                if (apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint)) {
                    return apxfVar2;
                }
            }
        }
        return null;
    }

    public static boolean bt(gof gofVar) {
        return gofVar.l() == 5;
    }

    public static boolean bu(gof gofVar) {
        return gofVar.l() == 4;
    }

    public static boolean bv(gof gofVar, gof gofVar2) {
        apxf b;
        if (gofVar2 == null) {
            return false;
        }
        apxf c = gofVar.c() != null ? gofVar.c() : gofVar.b();
        if (gofVar2.c() != null) {
            b = gofVar2.c();
        } else {
            b = gofVar2.b();
        }
        apxf bs = bs(c);
        apxf bs2 = bs(b);
        if (bs == null || bs2 == null) {
            return TextUtils.equals(gofVar.f(), gofVar2.f());
        }
        return aigb.d(bs, bs2);
    }

    public static void bw(gof gofVar) {
        if (gofVar.j()) {
            return;
        }
        gofVar.i();
    }

    public static boolean bx(float f, float f2) {
        return Math.abs(f - f2) < 0.005f;
    }

    public static boolean by(float f, float f2) {
        return !bx(f, f2) && f < f2;
    }

    public static boolean bz(float f) {
        return !bx(f, 1.777f) && f > 1.777f;
    }

    public static String c(String str) {
        return str.length() != 0 ? "UC".concat(str) : new String("UC");
    }

    public static final PaneDescriptor ca(String str) {
        Bundle a = PaneDescriptor.a();
        a.putString("playlist_id", str);
        return new PaneDescriptor(iwr.class, a);
    }

    public static lkb cb() {
        return new lkb(jqi.class);
    }

    private static final gog cc(Object obj) {
        aqjc aqjcVar;
        if (obj instanceof gol) {
            return gog.AUTOPLAYABLE;
        }
        if (obj instanceof arhz) {
            return gog.INLINE_PLAYBACK;
        }
        if (obj instanceof jah) {
            return gog.INLINE_PLAYBACK_VIDEO_FEED;
        }
        if (!(obj instanceof auhx)) {
            if (obj instanceof nia) {
                for (apok apokVar : ((nia) obj).a.c) {
                    if (apokVar.b == 144881215) {
                        aqjcVar = (aqjc) apokVar.c;
                    } else {
                        aqjcVar = aqjc.a;
                    }
                    if (aqjcVar.c == 18) {
                        return gog.CAROUSEL_PLAYABLE;
                    }
                }
            }
            if (obj instanceof aqjc) {
                return gog.DEFAULT_PROMO_PANEL;
            }
            if (obj instanceof mge) {
                return gog.DISCOVERY_ACTION_VIDEO_PLAYABLE;
            }
            if (obj instanceof mgf) {
                return gog.DISCOVERY_APP_VIDEO_PLAYABLE;
            }
            if (obj instanceof auhe) {
                return gog.PROMOTED_SPARKLES_TEXT_CTD_HOME_THEMED_CTA_HIGHLIGHTABLE;
            }
            if (obj instanceof auhd) {
                return gog.PROMOTED_SPARKLES_TEXT_CTD_HOME_THEMED_CTA_COMPACT_HIGHLIGHTABLE;
            }
            if (obj instanceof auhk) {
                return gog.PROMOTED_SPARKLES_TEXT_HOME_THEMED_CTA_HIGHLIGHTABLE;
            }
            if (obj instanceof auhl) {
                return gog.PROMOTED_SPARKLES_TEXT_HOME_THEMED_LARGE_SQUARE_CTA_HIGHLIGHTABLE;
            }
            if (cd(obj)) {
                return gog.INLINE_SURVEY_PLAYABLE;
            }
            return gog.NONE;
        }
        return gog.PROMOTED_VIDEO_PLAYABLE;
    }

    private static boolean cd(Object obj) {
        if (obj instanceof arih) {
            arig arigVar = ((arih) obj).h;
            if (arigVar == null) {
                arigVar = arig.a;
            }
            if (arigVar.b == 83537025) {
                return true;
            }
        }
        return false;
    }

    public static String d(String str) {
        if (str == null || !e(str)) {
            return null;
        }
        return str.substring(2);
    }

    public static boolean e(String str) {
        if (str != null) {
            return str.startsWith("VLPL") || str.startsWith("VLLL") || "VLWL".equals(str);
        }
        return false;
    }

    public static String g(String str, afsy afsyVar) {
        return h(str, afsyVar.c().d());
    }

    public static String h(String str, String str2) {
        return String.format(Locale.US, str.length() != 0 ? "%s:".concat(str) : new String("%s:"), str2);
    }

    public static boolean i(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith("bollard_enabled");
    }

    public static Uri j(Context context) {
        return whl.s(context, "watch", "backupwatchstorage.pb");
    }

    public static fnp k(aivf aivfVar) {
        return new fnk(aivfVar);
    }

    public static fnp l(aivf aivfVar) {
        return new fnm(aivfVar);
    }

    public static fnp m(aivf aivfVar) {
        return new fni(aivfVar);
    }

    public static fnp n(aivf aivfVar) {
        return new fnj(aivfVar);
    }

    public static int o(long j, long j2, int i, int i2) {
        return i + ((int) (i2 * (((float) yjk.z(j, 0L, j2)) / ((float) j2))));
    }

    public static void p(Canvas canvas, Rect rect, Paint paint, Paint paint2, List list, amvf amvfVar, int i) {
        amxc d = amxc.d();
        d.a(amvf.d(Integer.valueOf(rect.left), Integer.valueOf(rect.right)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.b((amvf) it.next());
        }
        for (amvf amvfVar2 : d.c()) {
            if (amvfVar == null || !amvfVar.j(amvfVar2)) {
                canvas.drawRect(((Integer) amvfVar2.g()).intValue(), rect.top, ((Integer) amvfVar2.h()).intValue(), rect.bottom, paint);
            } else {
                float f = i / 2.0f;
                canvas.drawRect(((Integer) amvfVar2.g()).intValue(), rect.top - f, ((Integer) amvfVar2.h()).intValue(), rect.bottom + f, paint2);
            }
        }
    }

    public static float q(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if ((a.b & 64) == 0) {
            return 0.7f;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.D;
    }

    public static int r(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.c & 2) == 0) {
            return 1024;
        }
        aswb aswbVar2 = a.e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return aswbVar2.G;
    }

    public static int s(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.q;
    }

    public static int t(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.b & 2) == 0) {
            return 500;
        }
        aswb aswbVar2 = a.e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return aswbVar2.p;
    }

    public static int u(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.d & 134217728) != 0) {
            return aswbVar.Y;
        }
        return -1;
    }

    public static int v(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.n;
    }

    public static int w(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.bq;
    }

    public static int x(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.h & 2048) != 0) {
            return aswbVar.be;
        }
        return -1;
    }

    public static ammv y(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.g & 536870912) == 0) {
            return amlr.a;
        }
        aswb aswbVar2 = a.e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return ammv.j(aswbVar2.aP);
    }

    public static ammv z(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.c & 2097152) == 0) {
            return amlr.a;
        }
        aswb aswbVar2 = a.e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        return ammv.j(aswbVar2.L);
    }

    public static byte[] bo(apxf apxfVar) {
        return (apxfVar == null || (apxfVar.b & 1) == 0) ? aaef.b : apxfVar.c.I();
    }
}
