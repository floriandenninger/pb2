package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahbj {
    public static void A(ajbl ajblVar, int i) {
        ajblVar.p().k = i;
    }

    public static boolean B(ajbl ajblVar) {
        PlayerResponseModel c = ajblVar.c();
        return c != null && c.c().ax();
    }

    public static boolean C(ajbl ajblVar) {
        PlayerResponseModel c = ajblVar.c();
        VideoStreamingData videoStreamingData = c == null ? null : c.c;
        return videoStreamingData != null && videoStreamingData.B();
    }

    public static boolean D(ajbl ajblVar) {
        return ajblVar.p().k == 9;
    }

    public static boolean E(aifs aifsVar, PlayerResponseModel playerResponseModel) {
        return aifsVar.j && !ahbn.c(playerResponseModel);
    }

    public static boolean F(ajbl ajblVar) {
        PlaybackStartDescriptor g = ajblVar.g();
        PlayerResponseModel c = ajblVar.c();
        VideoStreamingData videoStreamingData = c != null ? c.c : null;
        return (g == null || !g.t() || videoStreamingData == null || videoStreamingData.t()) ? false : true;
    }

    public static int[] G() {
        return new int[]{16777217, 16777216, 1, 16711681, 16776961, 65281, 65536, 256, 16711936};
    }

    public static List H(PlayerResponseModel playerResponseModel, int i) {
        SubtitleTrack a;
        ArrayList arrayList = new ArrayList();
        for (FormatStreamModel formatStreamModel : playerResponseModel.c.n) {
            if (formatStreamModel.e() == i) {
                aiuh m = SubtitleTrack.m();
                String str = formatStreamModel.b;
                if (str != null) {
                    m.j(str);
                }
                if (formatStreamModel.s().isEmpty()) {
                    String displayName = new Locale("en").getDisplayName(Locale.getDefault());
                    m.e("en");
                    m.k(".en");
                    m.i("");
                    m.b = displayName;
                    m.f(displayName);
                    m.h("");
                    m.b(formatStreamModel.e());
                    m.g(formatStreamModel.e);
                    a = m.a();
                } else {
                    m.e(formatStreamModel.s());
                    apnq apnqVar = formatStreamModel.a.B;
                    if (apnqVar == null) {
                        apnqVar = apnq.a;
                    }
                    m.k(apnqVar.c);
                    m.i("");
                    m.b = formatStreamModel.r();
                    m.f(new Locale(formatStreamModel.s()).getDisplayName(Locale.getDefault()));
                    m.h(formatStreamModel.r());
                    m.b(formatStreamModel.e());
                    m.g(formatStreamModel.e);
                    a = m.a();
                }
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public static dsm I(aemv aemvVar, PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null || playerResponseModel.c == null || playerResponseModel.c() == null) {
            return aemv.h;
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        PlayerConfigModel c = playerResponseModel.c();
        afec afecVar = aemvVar.c;
        afki.a(videoStreamingData);
        afki.a(c);
        return new dsm(afecVar.c(videoStreamingData, c));
    }

    public static apmg a(atzm atzmVar) {
        if (atzmVar == null) {
            return null;
        }
        atzj atzjVar = atzmVar.g;
        if (atzjVar == null) {
            atzjVar = atzj.a;
        }
        if ((atzjVar.b & 1) == 0) {
            return null;
        }
        atzj atzjVar2 = atzmVar.g;
        if (atzjVar2 == null) {
            atzjVar2 = atzj.a;
        }
        apmg apmgVar = atzjVar2.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    public static apmg b(atzm atzmVar) {
        if (atzmVar == null) {
            return null;
        }
        atzp atzpVar = atzmVar.i;
        if (atzpVar == null) {
            atzpVar = atzp.a;
        }
        if ((atzpVar.b & 1) == 0) {
            return null;
        }
        atzp atzpVar2 = atzmVar.i;
        if (atzpVar2 == null) {
            atzpVar2 = atzp.a;
        }
        apmg apmgVar = atzpVar2.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    public static String c(FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            return "N/A";
        }
        String t = formatStreamModel.t();
        int indexOf = t.indexOf("codecs=\"") + 8;
        int min = Math.min(t.indexOf("\"", indexOf + 1), indexOf + 4);
        StringBuilder sb = new StringBuilder(formatStreamModel.e);
        if (indexOf >= 8 && min >= 0) {
            sb.append(' ');
            sb.append((CharSequence) t, indexOf, min);
        }
        if (formatStreamModel.P()) {
            sb.append(' ');
            sb.append(formatStreamModel.i());
            sb.append('x');
            sb.append(formatStreamModel.d());
            int c = formatStreamModel.c();
            if (c > 0) {
                sb.append('@');
                sb.append(c);
            }
        }
        if (formatStreamModel.L()) {
            sb.append(" otf");
        }
        return sb.toString();
    }

    public static boolean d(long j, long j2) {
        return j2 + (-15000) <= j;
    }

    public static zbw e(zbw zbwVar, ahbv ahbvVar) {
        if (ahbvVar.h) {
            return zbwVar;
        }
        return null;
    }

    public static aelm f(ahbv ahbvVar, aelk aelkVar) {
        if (ahbvVar.a) {
            return aelkVar;
        }
        return null;
    }

    public static /* synthetic */ int g(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public static arwv h(arwx arwxVar, String str) {
        if (arwxVar == null) {
            return null;
        }
        for (arwy arwyVar : arwxVar.c) {
            arwv arwvVar = arwyVar.b;
            if (arwvVar == null) {
                arwvVar = arwv.a;
            }
            if (arwvVar.b.equals(str)) {
                arwv arwvVar2 = arwyVar.b;
                return arwvVar2 == null ? arwv.a : arwvVar2;
            }
        }
        return null;
    }

    public static atqa i(arxa arxaVar, String str) {
        for (atqb atqbVar : arxaVar.d) {
            atqa atqaVar = atqbVar.b;
            if (atqaVar == null) {
                atqaVar = atqa.a;
            }
            if (atqaVar.c.equals(str)) {
                atqa atqaVar2 = atqbVar.b;
                return atqaVar2 == null ? atqa.a : atqaVar2;
            }
        }
        return null;
    }

    public static avgg j(avgg avggVar, List list) {
        aami aamiVar = new aami(avggVar);
        HashSet<aamh> hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamh c = aamiVar.c(((Integer) it.next()).intValue());
            if (c != null) {
                hashSet.add(c);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aamh aamhVar : hashSet) {
            aone createBuilder = avgf.a.createBuilder();
            int i = aamhVar.a;
            createBuilder.copyOnWrite();
            avgf avgfVar = (avgf) createBuilder.instance;
            avgfVar.b |= 2;
            avgfVar.d = i;
            int i2 = aamhVar.b;
            createBuilder.copyOnWrite();
            avgf avgfVar2 = (avgf) createBuilder.instance;
            avgfVar2.b |= 4;
            avgfVar2.e = i2;
            String uri = aamhVar.a().toString();
            createBuilder.copyOnWrite();
            avgf avgfVar3 = (avgf) createBuilder.instance;
            uri.getClass();
            avgfVar3.b |= 1;
            avgfVar3.c = uri;
            arrayList.add((avgf) createBuilder.build());
        }
        Collections.sort(arrayList, unt.q);
        aong aongVar = (aong) avgg.a.createBuilder();
        aongVar.copyOnWrite();
        avgg avggVar2 = (avgg) aongVar.instance;
        avggVar2.a();
        aolo.addAll((Iterable) arrayList, (List) avggVar2.c);
        return (avgg) aongVar.build();
    }

    public static void k(atsb atsbVar, acra acraVar, String str, String str2, atrx atrxVar, boolean z, agno agnoVar, atol atolVar) {
        if (acraVar == null) {
            return;
        }
        amkq.E(TextUtils.isEmpty(str) != TextUtils.isEmpty(str2));
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashx.a.createBuilder();
        createBuilder2.copyOnWrite();
        ashx ashxVar = (ashx) createBuilder2.instance;
        ashxVar.c = atrxVar.k;
        ashxVar.b |= 1;
        createBuilder2.copyOnWrite();
        ashx ashxVar2 = (ashx) createBuilder2.instance;
        ashxVar2.b |= 2;
        ashxVar2.d = z;
        agno agnoVar2 = agno.OFFLINE_IMMEDIATELY;
        if (agnoVar.ordinal() == 0) {
            createBuilder2.copyOnWrite();
            ashx ashxVar3 = (ashx) createBuilder2.instance;
            ashxVar3.e = 1;
            ashxVar3.b |= 4;
        } else {
            createBuilder2.copyOnWrite();
            ashx ashxVar4 = (ashx) createBuilder2.instance;
            ashxVar4.e = 0;
            ashxVar4.b |= 4;
        }
        if (!TextUtils.isEmpty(str)) {
            createBuilder2.copyOnWrite();
            ashx ashxVar5 = (ashx) createBuilder2.instance;
            ashxVar5.f = 1;
            ashxVar5.b |= 8;
            createBuilder2.copyOnWrite();
            ashx ashxVar6 = (ashx) createBuilder2.instance;
            str.getClass();
            ashxVar6.b |= 16;
            ashxVar6.g = str;
        } else if (!TextUtils.isEmpty(str2)) {
            createBuilder2.copyOnWrite();
            ashx ashxVar7 = (ashx) createBuilder2.instance;
            ashxVar7.f = 2;
            ashxVar7.b |= 8;
            createBuilder2.copyOnWrite();
            ashx ashxVar8 = (ashx) createBuilder2.instance;
            str2.getClass();
            ashxVar8.b |= 16;
            ashxVar8.g = str2;
        }
        if (atolVar != null) {
            createBuilder2.copyOnWrite();
            ashx ashxVar9 = (ashx) createBuilder2.instance;
            ashxVar9.h = atolVar.f;
            ashxVar9.b |= 32;
        }
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashx ashxVar10 = (ashx) createBuilder2.build();
        ashxVar10.getClass();
        ashtVar.h = ashxVar10;
        ashtVar.b |= 16;
        if ((atsbVar.b & 128) == 0 || atsbVar.i.d() <= 0) {
            if (true == TextUtils.isEmpty(str)) {
                str = str2;
            }
            acraVar.I(3, adyu.ce(acraVar.i(str, acsb.c(7111))), (asht) createBuilder.build());
            return;
        }
        acraVar.I(3, new acqx(atsbVar.i), (asht) createBuilder.build());
    }

    public static void l(atsb atsbVar, acra acraVar) {
        acraVar.u(new acqx(atsbVar.i), null);
    }

    public static aooy m(aulq aulqVar) {
        if (aulqVar != null && !aulqVar.equals(aulqVar.getDefaultInstanceForType())) {
            try {
                return (aooy) aulqVar.pX(aomw.b().d(aulq.a, amkq.cK(aulqVar)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object n(aulq aulqVar, aomu aomuVar) {
        if (aulqVar == null || !aulqVar.pY(aomuVar)) {
            return null;
        }
        return aulqVar.pX(aomuVar);
    }

    public static ajce o(Object obj) {
        String str;
        String str2;
        boolean z = false;
        byte[] bArr = new byte[0];
        ajcd ajcdVar = ajcd.UNKNOWN;
        if (obj instanceof atmt) {
            atmt atmtVar = (atmt) obj;
            str2 = atmtVar.e;
            if ((atmtVar.b & 4) != 0) {
                bArr = atmtVar.f.I();
            }
            ajcdVar = ajcd.NEXT;
        } else if (obj instanceof atmv) {
            atmv atmvVar = (atmv) obj;
            str2 = atmvVar.c;
            if ((atmvVar.b & 2) != 0) {
                bArr = atmvVar.d.I();
            }
            ajcdVar = ajcd.NEXT_RADIO;
        } else if (obj instanceof aufe) {
            aufe aufeVar = (aufe) obj;
            str2 = aufeVar.c;
            if ((aufeVar.b & 2) != 0) {
                bArr = aufeVar.d.I();
            }
            ajcdVar = ajcd.PREVIOUS;
        } else if (obj instanceof aulm) {
            aulm aulmVar = (aulm) obj;
            str2 = aulmVar.d;
            if ((aulmVar.c & 16) != 0) {
                bArr = aulmVar.f.I();
            }
            ajcdVar = ajcd.RELOAD;
            z = aulmVar.e;
        } else if (obj instanceof avgs) {
            avgs avgsVar = (avgs) obj;
            str2 = avgsVar.d;
            if ((avgsVar.b & 4) != 0) {
                bArr = avgsVar.e.I();
            }
            ajcdVar = ajcd.TIMED;
        } else if (obj instanceof aovl) {
            aovl aovlVar = (aovl) obj;
            str2 = aovlVar.d;
            if ((aovlVar.b & 4) != 0) {
                bArr = aovlVar.c.I();
            }
            ajcdVar = ajcd.ADDITIONAL_ACCOUNT;
        } else if (obj instanceof asjj) {
            asjj asjjVar = (asjj) obj;
            str2 = asjjVar.e;
            if ((asjjVar.b & 64) != 0) {
                bArr = asjjVar.f.I();
            }
            ajcdVar = ajcd.INVALIDATION;
        } else {
            if (obj instanceof atsd) {
                atsd atsdVar = (atsd) obj;
                str = atsdVar.c;
                if ((atsdVar.b & 2) != 0) {
                    bArr = atsdVar.d.I();
                }
            } else if (obj instanceof auah) {
                auah auahVar = (auah) obj;
                str = auahVar.c;
                if ((auahVar.b & 2) != 0) {
                    bArr = auahVar.d.I();
                }
            } else {
                if (!(obj instanceof asrd)) {
                    return null;
                }
                asrd asrdVar = (asrd) obj;
                str = asrdVar.d;
                if ((asrdVar.b & 4) != 0) {
                    bArr = asrdVar.e.I();
                }
            }
            str2 = str;
        }
        ajcg ajcgVar = new ajcg();
        obj.getClass();
        ajcgVar.d = obj;
        ajcgVar.b = bArr;
        ajcdVar.getClass();
        ajcgVar.c = ajcdVar;
        ajcgVar.a = str2;
        ajcgVar.e = z;
        String str3 = ajcgVar.c == null ? " type" : "";
        if (ajcgVar.d == null) {
            str3 = str3.concat(" continuation");
        }
        if (!str3.isEmpty()) {
            String valueOf = String.valueOf(str3);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ajch(ajcgVar.a, ajcgVar.b, ajcgVar.c, ajcgVar.d, ajcgVar.e);
    }

    public static Object p(ajce ajceVar, Class cls) {
        if (!(ajceVar instanceof ajch)) {
            return null;
        }
        ajch ajchVar = (ajch) ajceVar;
        if (cls.isAssignableFrom(ajchVar.c.getClass())) {
            return ajchVar.c;
        }
        return null;
    }

    public static PlayerResponseModel q(ajbl ajblVar) {
        return ajblVar.p().c;
    }

    public static PlaybackStartDescriptor r(ajbl ajblVar) {
        return ajblVar.p().a;
    }

    public static aigd s(ajbl ajblVar) {
        return ajblVar.p().b;
    }

    public static void t(int i, int i2, aryi aryiVar, acpl acplVar) {
        aone createBuilder = ardx.a.createBuilder();
        createBuilder.copyOnWrite();
        ardx ardxVar = (ardx) createBuilder.instance;
        ardxVar.c = i - 1;
        ardxVar.b |= 1;
        createBuilder.copyOnWrite();
        ardx ardxVar2 = (ardx) createBuilder.instance;
        ardxVar2.d = i2 - 1;
        ardxVar2.b |= 2;
        if (aryiVar != null) {
            aomf aomfVar = aryiVar.p;
            createBuilder.copyOnWrite();
            ardx ardxVar3 = (ardx) createBuilder.instance;
            aomfVar.getClass();
            ardxVar3.b |= 4;
            ardxVar3.e = aomfVar;
        }
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cG((ardx) createBuilder.build());
        acplVar.c((arpp) a.build());
    }

    public static int u(ajbl ajblVar) {
        if (ajblVar != null) {
            return ajblVar.p().k;
        }
        return 4;
    }

    public static long v(ajbl ajblVar) {
        return ajblVar.p().h;
    }

    public static long w(ajbl ajblVar) {
        return ajblVar.p().e;
    }

    public static long x(aemv aemvVar) {
        return Math.max(aemvVar.i().b, 0L);
    }

    public static void y(ajbl ajblVar, long j) {
        ajblVar.p().h = j;
    }

    public static void z(ajbl ajblVar, long j) {
        ajblVar.p().e = j;
    }
}
