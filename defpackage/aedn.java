package defpackage;

import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public /* synthetic */ class aedn {
    public aedn() {
    }

    public aedn(agik agikVar) {
        agikVar.getClass();
    }

    public static apxf A(String str, String str2, int i, String str3, aomf aomfVar) {
        aone createBuilder = atrr.a.createBuilder();
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atrr atrrVar = (atrr) createBuilder.instance;
            str2.getClass();
            atrrVar.b |= 1;
            atrrVar.c = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atrr atrrVar2 = (atrr) createBuilder.instance;
            str.getClass();
            atrrVar2.b |= 2;
            atrrVar2.d = str;
        }
        if (i != -1) {
            createBuilder.copyOnWrite();
            atrr atrrVar3 = (atrr) createBuilder.instance;
            atrrVar3.b |= 4;
            atrrVar3.e = i;
        }
        if (!TextUtils.isEmpty(str3)) {
            createBuilder.copyOnWrite();
            atrr atrrVar4 = (atrr) createBuilder.instance;
            str3.getClass();
            atrrVar4.b |= 8;
            atrrVar4.f = str3;
        }
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atrs.a, (atrr) createBuilder.build());
        if (aomfVar != null && !aomfVar.H()) {
            aongVar.copyOnWrite();
            apxf apxfVar = (apxf) aongVar.instance;
            apxfVar.b |= 1;
            apxfVar.c = aomfVar;
        }
        return (apxf) aongVar.build();
    }

    public static aulq B(String str, boolean z) {
        aong aongVar = (aong) auvr.a.createBuilder();
        if (z) {
            aongVar.copyOnWrite();
            auvr auvrVar = (auvr) aongVar.instance;
            auvrVar.b |= 1;
            auvrVar.c = true;
        } else {
            aongVar.copyOnWrite();
            auvr auvrVar2 = (auvr) aongVar.instance;
            auvrVar2.b |= 2;
            auvrVar2.d = true;
        }
        String f = aalt.f(62, str);
        aongVar.copyOnWrite();
        auvr auvrVar3 = (auvr) aongVar.instance;
        f.getClass();
        auvrVar3.b |= 16;
        auvrVar3.f = f;
        aone createBuilder = apmh.a.createBuilder();
        aone createBuilder2 = apmp.a.createBuilder();
        aong aongVar2 = (aong) arfs.a.createBuilder();
        arfr arfrVar = z ? arfr.LIKE : arfr.DISLIKE;
        aongVar2.copyOnWrite();
        arfs arfsVar = (arfs) aongVar2.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        createBuilder2.copyOnWrite();
        apmp apmpVar = (apmp) createBuilder2.instance;
        arfs arfsVar2 = (arfs) aongVar2.build();
        arfsVar2.getClass();
        apmpVar.g = arfsVar2;
        apmpVar.b |= 32;
        aong aongVar3 = (aong) arfs.a.createBuilder();
        arfr arfrVar2 = z ? arfr.LIKE_SELECTED : arfr.DISLIKE_SELECTED;
        aongVar3.copyOnWrite();
        arfs arfsVar3 = (arfs) aongVar3.instance;
        arfsVar3.c = arfrVar2.pV;
        arfsVar3.b = 1 | arfsVar3.b;
        createBuilder2.copyOnWrite();
        apmp apmpVar2 = (apmp) createBuilder2.instance;
        arfs arfsVar4 = (arfs) aongVar3.build();
        arfsVar4.getClass();
        apmpVar2.m = arfsVar4;
        apmpVar2.b |= 2048;
        apxf y = y(str, z ? asno.LIKE : asno.DISLIKE);
        createBuilder2.copyOnWrite();
        apmp apmpVar3 = (apmp) createBuilder2.instance;
        y.getClass();
        apmpVar3.k = y;
        apmpVar3.b |= 512;
        apxf y2 = y(str, asno.INDIFFERENT);
        createBuilder2.copyOnWrite();
        apmp apmpVar4 = (apmp) createBuilder2.instance;
        y2.getClass();
        apmpVar4.p = y2;
        apmpVar4.b |= 16384;
        createBuilder.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder.instance;
        apmp apmpVar5 = (apmp) createBuilder2.build();
        apmpVar5.getClass();
        apmhVar.d = apmpVar5;
        apmhVar.b |= 2;
        aongVar.copyOnWrite();
        auvr auvrVar4 = (auvr) aongVar.instance;
        apmh apmhVar2 = (apmh) createBuilder.build();
        apmhVar2.getClass();
        auvrVar4.g = apmhVar2;
        auvrVar4.b |= 32;
        aong aongVar4 = (aong) aulq.a.createBuilder();
        aongVar4.e(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer, (auvr) aongVar.build());
        return (aulq) aongVar4.build();
    }

    public static Uri C(ailv ailvVar, String str, int i, String str2, long j, long j2, long j3) {
        if (ailvVar == null) {
            return null;
        }
        ailt a = ailvVar.a("/pudl", str, i, str2, j, j2);
        a.c("e", j3);
        return a.a();
    }

    public static PlayerResponseModel D(PlayerResponseModel playerResponseModel, aapf aapfVar, FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2) {
        aone aoneVar;
        long j = playerResponseModel.b;
        aryv aryvVar = playerResponseModel.a.h;
        if (aryvVar == null) {
            aryvVar = aryv.a;
        }
        long j2 = aryvVar.c;
        aong aongVar = (aong) playerResponseModel.a.toBuilder();
        aryr aryrVar = (aryr) aongVar.instance;
        if ((aryrVar.b & 16) != 0) {
            aryv aryvVar2 = aryrVar.h;
            if (aryvVar2 == null) {
                aryvVar2 = aryv.a;
            }
            aoneVar = aryvVar2.toBuilder();
        } else {
            aoneVar = null;
        }
        if (aoneVar != null) {
            long max = Math.max(0L, j2);
            aoneVar.copyOnWrite();
            aryv aryvVar3 = (aryv) aoneVar.instance;
            aryvVar3.b |= 1;
            aryvVar3.c = max;
            SparseArray V = V(Collections.unmodifiableList(aryvVar3.e));
            if (formatStreamModel != null) {
                if (!formatStreamModel.A()) {
                    SparseArray V2 = V(Collections.unmodifiableList(((aryv) aoneVar.instance).d));
                    V2.put(formatStreamModel.e(), formatStreamModel.a);
                    aoneVar.copyOnWrite();
                    ((aryv) aoneVar.instance).d = aryv.emptyProtobufList();
                    aoneVar.ao(W(V2));
                } else {
                    V.put(formatStreamModel.e(), formatStreamModel.a);
                }
            }
            if (formatStreamModel2 != null) {
                V.put(formatStreamModel2.e(), formatStreamModel2.a);
            }
            aoneVar.copyOnWrite();
            ((aryv) aoneVar.instance).e = aryv.emptyProtobufList();
            aoneVar.an(W(V));
            aryv aryvVar4 = (aryv) aoneVar.build();
            aongVar.copyOnWrite();
            aryr aryrVar2 = (aryr) aongVar.instance;
            aryvVar4.getClass();
            aryrVar2.h = aryvVar4;
            aryrVar2.b |= 16;
        }
        return new PlayerResponseModel((aryr) aongVar.build(), j, PlayerResponseModel.d(aapfVar, (aryr) aongVar.build(), j));
    }

    public static PlayerResponseModel E(PlayerResponseModel playerResponseModel, aapf aapfVar, FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, long j, long j2, boolean z) {
        aone aoneVar;
        aong aongVar = (aong) playerResponseModel.a.toBuilder();
        aryr aryrVar = (aryr) aongVar.instance;
        if ((aryrVar.b & 16) != 0) {
            aryv aryvVar = aryrVar.h;
            if (aryvVar == null) {
                aryvVar = aryv.a;
            }
            aoneVar = aryvVar.toBuilder();
        } else {
            aoneVar = null;
        }
        if (aoneVar != null) {
            long max = Math.max(0L, j2);
            aoneVar.copyOnWrite();
            aryv aryvVar2 = (aryv) aoneVar.instance;
            aryv aryvVar3 = aryv.a;
            aryvVar2.b |= 1;
            aryvVar2.c = max;
            if (!z) {
                aoneVar.copyOnWrite();
                aryv aryvVar4 = (aryv) aoneVar.instance;
                aryvVar4.b &= -3;
                aryvVar4.g = aryv.a.g;
                aoneVar.copyOnWrite();
                aryv aryvVar5 = (aryv) aoneVar.instance;
                aryvVar5.b &= -5;
                aryvVar5.h = aryv.a.h;
            }
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            if (formatStreamModel != null) {
                if (formatStreamModel.A()) {
                    sparseArray.put(formatStreamModel.e(), formatStreamModel.a);
                } else {
                    sparseArray2.put(formatStreamModel.e(), formatStreamModel.a);
                }
            } else if (z) {
                int size = ((aryv) aoneVar.instance).e.size();
                for (int i = 0; i < size; i++) {
                    aqxz al = aoneVar.al(i);
                    if (aaov.d(al.f)) {
                        sparseArray.put(al.d, al);
                    }
                }
                int size2 = ((aryv) aoneVar.instance).d.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aqxz aqxzVar = (aqxz) ((aryv) aoneVar.instance).d.get(i2);
                    sparseArray2.put(aqxzVar.d, aqxzVar);
                }
            }
            if (formatStreamModel2 != null) {
                sparseArray.put(formatStreamModel2.e(), formatStreamModel2.a);
            } else if (z) {
                int size3 = ((aryv) aoneVar.instance).e.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    aqxz al2 = aoneVar.al(i3);
                    if (aaov.c(al2.f)) {
                        sparseArray.put(al2.d, al2);
                    }
                }
            }
            aoneVar.copyOnWrite();
            ((aryv) aoneVar.instance).e = aryv.emptyProtobufList();
            aoneVar.an(W(sparseArray));
            aoneVar.copyOnWrite();
            ((aryv) aoneVar.instance).d = aryv.emptyProtobufList();
            aoneVar.ao(W(sparseArray2));
            aryv aryvVar6 = (aryv) aoneVar.build();
            aongVar.copyOnWrite();
            aryr aryrVar2 = (aryr) aongVar.instance;
            aryvVar6.getClass();
            aryrVar2.h = aryvVar6;
            aryrVar2.b |= 16;
        }
        return new PlayerResponseModel((aryr) aongVar.build(), j, PlayerResponseModel.d(aapfVar, (aryr) aongVar.build(), j));
    }

    public static anhy F(anhy anhyVar, final Set set, final anfz anfzVar, Executor executor) {
        return aney.i(anhyVar, Exception.class, new anfz() { // from class: agqd
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                Set set2 = set;
                anfz anfzVar2 = anfzVar;
                Exception exc = (Exception) obj;
                exc.getClass();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(exc)) {
                        return anfzVar2.a(exc);
                    }
                }
                afsi.c(1, 28, "Encountered unexpected exception during fallback", exc);
                throw exc;
            }
        }, executor);
    }

    public static anhy G(anhy anhyVar, int i, ScheduledExecutorService scheduledExecutorService) {
        return anfq.h(anhyVar, new fnz(i, 8), scheduledExecutorService);
    }

    public static anhy H(String str, anhy anhyVar, anhy anhyVar2, long j, amsx amsxVar, ScheduledExecutorService scheduledExecutorService, agmu agmuVar, ammy ammyVar, int i) {
        amru G = anaf.G(amru.s(anhyVar, anhyVar2));
        anhy V = anaf.V(anaf.P(G(anhyVar, 0, scheduledExecutorService)), j, TimeUnit.MILLISECONDS, scheduledExecutorService);
        amsv amsvVar = new amsv();
        amsvVar.j(amsxVar);
        amsvVar.c(TimeoutException.class);
        anhy F = F(V, amsvVar.g(), new agqb(G, scheduledExecutorService, amsxVar, anhyVar, 0), scheduledExecutorService);
        anaf.Y(F, new agqe(ammyVar, agmuVar, str, i, anhyVar2, angq.a), angq.a);
        return anfq.h(F, afyf.m, angq.a);
    }

    public static int I(int i) {
        int i2 = (i & 8) != 0 ? 2 : 0;
        if ((i & 2) != 0) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            i2 |= 16;
        }
        if ((i & 384) != 0) {
            i2 |= 64;
        }
        return (i & 4096) != 0 ? i2 | 256 : i2;
    }

    public static boolean J(agmx agmxVar) {
        int f = agtw.f(agmxVar);
        return (f == 3 || f == 4) && !TextUtils.isEmpty(agtw.t(agmxVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static aone K(agnz agnzVar) {
        aone createBuilder = atqv.a.createBuilder();
        long j = agnzVar.d;
        createBuilder.copyOnWrite();
        atqv atqvVar = (atqv) createBuilder.instance;
        atqvVar.b |= 256;
        atqvVar.k = j / 1024;
        long j2 = agnzVar.e;
        createBuilder.copyOnWrite();
        atqv atqvVar2 = (atqv) createBuilder.instance;
        atqvVar2.b |= 1024;
        atqvVar2.m = j2 / 1024;
        int i = 3;
        boolean z = agtw.f(agnzVar.f) == 3;
        createBuilder.copyOnWrite();
        atqv atqvVar3 = (atqv) createBuilder.instance;
        atqvVar3.b |= 32768;
        atqvVar3.q = z;
        boolean ab = agtw.ab(agnzVar.f);
        createBuilder.copyOnWrite();
        atqv atqvVar4 = (atqv) createBuilder.instance;
        atqvVar4.b |= 33554432;
        atqvVar4.w = ab;
        atrx b = ahab.b(agtw.d(agnzVar.f));
        createBuilder.copyOnWrite();
        atqv atqvVar5 = (atqv) createBuilder.instance;
        atqvVar5.t = b.k;
        atqvVar5.b |= 1048576;
        int am = agtw.am(agnzVar.f);
        createBuilder.copyOnWrite();
        atqv atqvVar6 = (atqv) createBuilder.instance;
        int i2 = am - 1;
        if (am == 0) {
            throw null;
        }
        atqvVar6.u = i2;
        atqvVar6.b |= 2097152;
        int i3 = true != agtw.af(agnzVar.f) ? 2 : 3;
        createBuilder.copyOnWrite();
        atqv atqvVar7 = (atqv) createBuilder.instance;
        atqvVar7.r = i3 - 1;
        atqvVar7.b |= 65536;
        switch (agtw.f(agnzVar.f)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            default:
                zga.b("Unrecognized offline transfer type, defaulting to unknown.");
                i = 1;
                break;
        }
        createBuilder.copyOnWrite();
        atqv atqvVar8 = (atqv) createBuilder.instance;
        atqvVar8.x = i - 1;
        atqvVar8.c |= 2;
        String t = agtw.t(agnzVar.f);
        createBuilder.copyOnWrite();
        atqv atqvVar9 = (atqv) createBuilder.instance;
        atqvVar9.b = 1 | atqvVar9.b;
        atqvVar9.d = t;
        String s = agtw.s(agnzVar.f);
        if (s != null) {
            createBuilder.copyOnWrite();
            atqv atqvVar10 = (atqv) createBuilder.instance;
            atqvVar10.b |= 2;
            atqvVar10.e = s;
        }
        String q = agtw.q(agnzVar.f);
        if (q != null) {
            createBuilder.copyOnWrite();
            atqv atqvVar11 = (atqv) createBuilder.instance;
            atqvVar11.b |= 4;
            atqvVar11.f = q;
        }
        String o = agtw.o(agnzVar.f);
        if (o != null) {
            createBuilder.copyOnWrite();
            atqv atqvVar12 = (atqv) createBuilder.instance;
            atqvVar12.b |= 524288;
            atqvVar12.s = o;
        }
        byte[] ak = agtw.ak(agnzVar.f);
        if (ak != null) {
            aomf x = aomf.x(ak);
            createBuilder.copyOnWrite();
            atqv atqvVar13 = (atqv) createBuilder.instance;
            atqvVar13.c |= 32;
            atqvVar13.z = x;
        }
        return createBuilder;
    }

    public static PlayerResponseModel L(Cursor cursor, int i) {
        PlayerResponseModel h;
        if (cursor.isNull(i) || (h = PlayerResponseModel.h(cursor.getBlob(i), 0L)) == null) {
            return null;
        }
        return h;
    }

    public static Collection M(List list, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agnp agnpVar = (agnp) it.next();
            hashMap.put(agnpVar.f(), agnpVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hashMap.remove(((agnp) it2.next()).f());
        }
        return hashMap.values();
    }

    public static List N(Cursor cursor, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(Q(cursor, i, i2, i3));
        }
        return arrayList;
    }

    public static agnp O(Cursor cursor, agmm agmmVar, agid agidVar, int i, int i2, int i3, int i4, int i5) {
        agnb agnbVar = null;
        if (!cursor.isNull(i) || i5 < 0) {
            String string = cursor.getString(i);
            aone createBuilder = atqx.a.createBuilder();
            try {
                createBuilder.mergeFrom(cursor.getBlob(i2), aomw.b());
            } catch (aoob e) {
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 34);
                sb.append("Error loading proto for videoId=[");
                sb.append(string);
                sb.append("]");
                zga.d(sb.toString(), e);
                createBuilder = atqx.a.createBuilder();
                createBuilder.copyOnWrite();
                atqx atqxVar = (atqx) createBuilder.instance;
                string.getClass();
                atqxVar.b |= 1;
                atqxVar.c = string;
            }
            boolean g = yoj.g(cursor, i3, false);
            aami aamiVar = new aami();
            atqx atqxVar2 = (atqx) createBuilder.instance;
            if ((atqxVar2.b & 2) != 0) {
                avgg avggVar = atqxVar2.d;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                aamiVar = agmmVar.d(string, new aami(avggVar));
            }
            String string2 = cursor.getString(i4);
            if (string2 != null && agidVar != null) {
                agnbVar = agidVar.b(string2);
            }
            if (agnbVar == null) {
                atot atotVar = ((atqx) createBuilder.instance).e;
                if (atotVar == null) {
                    atotVar = atot.a;
                }
                agnbVar = agnb.a(atotVar);
            }
            return new agnp((atqx) createBuilder.build(), g, aamiVar, agnbVar);
        }
        String string3 = cursor.getString(i5);
        aone createBuilder2 = atqx.a.createBuilder();
        createBuilder2.copyOnWrite();
        atqx atqxVar3 = (atqx) createBuilder2.instance;
        string3.getClass();
        atqxVar3.b |= 1;
        atqxVar3.c = string3;
        return new agnp((atqx) createBuilder2.build(), true, null, null);
    }

    public static List P(Cursor cursor, agmm agmmVar, agid agidVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(O(cursor, agmmVar, agidVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }

    public static bagd Q(Cursor cursor, int i, int i2, int i3) {
        return new bagd(cursor.getString(i), cursor.getInt(i2), cursor.getInt(i3), null);
    }

    public static agng R(Cursor cursor, agmm agmmVar, agid agidVar, int i, int i2, int i3, int i4, int i5) {
        atqa atqaVar;
        String string = cursor.getString(i);
        try {
            atqaVar = (atqa) aonm.parseFrom(atqa.a, cursor.getBlob(i2), aomw.b());
        } catch (aoob e) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 37);
            sb.append("Error loading proto for playlistId=[");
            sb.append(string);
            sb.append("]");
            zga.d(sb.toString(), e);
            aone createBuilder = atqa.a.createBuilder();
            createBuilder.copyOnWrite();
            atqa atqaVar2 = (atqa) createBuilder.instance;
            string.getClass();
            atqaVar2.b |= 1;
            atqaVar2.c = string;
            atqaVar = (atqa) createBuilder.build();
        }
        boolean g = yoj.g(cursor, i3, false);
        int i6 = cursor.getInt(i4);
        String string2 = cursor.getString(i5);
        atot atotVar = null;
        agnb b = (string2 == null || agidVar == null) ? null : agidVar.b(string2);
        if (b == null) {
            if ((atqaVar.b & 4) != 0 && (atotVar = atqaVar.e) == null) {
                atotVar = atot.a;
            }
            b = agnb.a(atotVar);
        }
        aami aamiVar = new aami();
        avgg y = agmm.y(atqaVar);
        if (y != null) {
            aamiVar = agmmVar.c(string, new aami(y));
        }
        return agng.c(atqaVar, g, i6, aamiVar, b);
    }

    public static List S(Cursor cursor, agmm agmmVar, agid agidVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(R(cursor, agmmVar, agidVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }

    public static agne T(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String string = cursor.getString(i);
        int i9 = cursor.getInt(i2);
        String string2 = cursor.getString(i3);
        int i10 = cursor.getInt(i4);
        int i11 = cursor.getInt(i5);
        byte[] blob = cursor.getBlob(i6);
        byte[] blob2 = cursor.getBlob(i7);
        boolean g = yoj.g(cursor, i8, true);
        agnd agndVar = new agnd();
        agndVar.a = string;
        agndVar.b = i9;
        agndVar.c = string2;
        agndVar.d = i10;
        agndVar.e = i11;
        agndVar.f = blob;
        agndVar.g = blob2;
        agndVar.h = g;
        return agndVar.a();
    }

    public static agnb U(Cursor cursor, agmm agmmVar, int i, int i2) {
        String string = cursor.getString(i);
        aone createBuilder = atot.a.createBuilder();
        try {
            createBuilder.mergeFrom(cursor.getBlob(i2), aomw.b());
            aami aamiVar = new aami();
            atos atosVar = ((atot) createBuilder.instance).c;
            if (atosVar == null) {
                atosVar = atos.a;
            }
            if ((atosVar.b & 2) != 0) {
                atos atosVar2 = ((atot) createBuilder.instance).c;
                if (atosVar2 == null) {
                    atosVar2 = atos.a;
                }
                avgg avggVar = atosVar2.d;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                aamiVar = new aami(avggVar);
                aami a = agmmVar.a(string, aamiVar);
                if (!a.a.isEmpty()) {
                    aamiVar = a;
                }
            }
            return agnb.b((atot) createBuilder.build(), aamiVar);
        } catch (aoob e) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 36);
            sb.append("Error loading proto for channelId=[");
            sb.append(string);
            sb.append("]");
            zga.d(sb.toString(), e);
            return null;
        }
    }

    private static SparseArray V(List list) {
        SparseArray sparseArray = new SparseArray();
        for (aqxz aqxzVar : amkq.aT(list)) {
            sparseArray.put(aqxzVar.d, aqxzVar);
        }
        return sparseArray;
    }

    private static List W(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((aqxz) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public static int a(byte b) {
        if ((b & 128) == 0) {
            return 1;
        }
        if ((b & 64) == 0) {
            return 2;
        }
        if ((b & 32) == 0) {
            return 3;
        }
        return (b & 16) == 0 ? 4 : 5;
    }

    public static Integer b(ByteBuffer byteBuffer) {
        int a;
        if (byteBuffer.remaining() == 0 || byteBuffer.remaining() < (a = a(byteBuffer.get(byteBuffer.position())))) {
            return null;
        }
        int i = byteBuffer.get() & 255;
        if (a == 1) {
            return Integer.valueOf(i);
        }
        if (a == 2) {
            return Integer.valueOf(((byteBuffer.get() & 255) << 6) | (i & 63));
        }
        if (a == 3) {
            return Integer.valueOf(((((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255)) << 5) | (i & 31));
        }
        if (a == 4) {
            return Integer.valueOf(((((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8))) << 4) | (i & 15));
        }
        return Integer.valueOf(((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16));
    }

    public static bih c(String str, Set set, aewr aewrVar) {
        if (amkq.e("audio/mp4", str) || amkq.e("video/mp4", str) || amkq.e("text/mp4", str)) {
            return new bkt(new ArrayList(), new aews(set, aewrVar));
        }
        if (amkq.e("video/x-vnd.on2.vp9", str) || amkq.e("audio/webm", str) || amkq.e("video/webm", str)) {
            return new aewi(new aewt(set, aewrVar));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "ManifestlessExtractorFactory does not support MimeType ".concat(valueOf) : new String("ManifestlessExtractorFactory does not support MimeType "));
    }

    public static void g(aesk aeskVar, boolean z, long j) {
        afki.a(aeskVar.i());
        afki.a(aeskVar.j());
        afki.a(aeskVar.n());
        afki.a(aeskVar.k());
        afki.a(aeskVar.h());
        afki.c(!z || aeskVar.b() == null || (aeskVar.b() instanceof afky), "MediaView must be null or an implementation of ExtendedMediaView");
        afki.c(j > 0 || j == -1, String.format(Locale.US, "TransitionPositionsMs: %d must be greater than 0 or UNKNOWN", Long.valueOf(j)));
        afki.b((aeskVar.o(8) && aeskVar.o(16)) ? false : true);
    }

    public static boolean h(aesk aeskVar, int i) {
        return (aeskVar.f() & i) != 0;
    }

    public static double i(double d) {
        double d2 = (((((((((((4.30638E-5d * d) + 2.765672E-4d) * d) + 1.520143E-4d) * d) + 0.0092705272d) * d) + 0.0422820123d) * d) + 0.0705230784d) * d) + 1.0d;
        double d3 = d2 * d2;
        double d4 = d3 * d3;
        double d5 = d4 * d4;
        return 1.0d - (1.0d / (d5 * d5));
    }

    public static double j(double d) {
        double d2;
        double d3;
        double d4 = -Math.log1p((-d) * d);
        if (d4 < 5.0d) {
            double d5 = d4 - 2.5d;
            d2 = ((((((((((((((2.81022636E-8d * d5) + 3.43273939E-7d) * d5) - 3.5233877E-6d) * d5) - 4.39150654E-6d) * d5) + 2.1858087E-4d) * d5) - 0.00125372503d) * d5) - 0.00417768164d) * d5) + 0.246640727d) * d5;
            d3 = 1.50140941d;
        } else {
            double sqrt = Math.sqrt(d4) - 3.0d;
            d2 = (((((((((((((((-2.00214257E-4d) * sqrt) + 1.00950558E-4d) * sqrt) + 0.00134934322d) * sqrt) - 0.00367342844d) * sqrt) + 0.00573950773d) * sqrt) - 0.0076224613d) * sqrt) + 0.00943887047d) * sqrt) + 1.00167406d) * sqrt;
            d3 = 2.83297682d;
        }
        return (d2 + d3) * d;
    }

    public static ate k(afhf afhfVar) {
        return afhfVar.a();
    }

    public static float l(float f) {
        return Math.min(1.0f, (float) Math.pow(10.0d, (-f) / 20.0f));
    }

    public static float m(PlayerConfigModel playerConfigModel, float f) {
        return (playerConfigModel != null && playerConfigModel.ah()) ? n(f, playerConfigModel.c()) : f;
    }

    public static float n(float f, float f2) {
        return yjk.y(f * f2, 0.0f, 1.0f);
    }

    public static zhy o(Uri uri, String str, String str2, String str3, afqj afqjVar, awdi awdiVar, PlayerConfigModel playerConfigModel) {
        zhy b = zhy.b(uri);
        b.h("event", "streamingstats");
        b.h("cpn", str);
        b.h("ns", "yt");
        if (!TextUtils.isEmpty(str2)) {
            b.h("cotn", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            b.h("docid", str3);
        }
        if (awdiVar != null && (awdiVar.b & 1) != 0) {
            b.e(awdiVar.c);
        }
        if (playerConfigModel.aj()) {
            b.h("dai", "ss");
        } else if (playerConfigModel.ax()) {
            b.h("dai", "cs");
        }
        afqjVar.c(b);
        return b;
    }

    public static int p(int i) {
        return i - 1;
    }

    public static afih q(long j, Throwable th, boolean z, afih afihVar) {
        cnq cnqVar = (cnq) th;
        if (cnqVar.b != null) {
            String str = true != z ? "info." : "info.provisioning.";
            afif afifVar = afif.DRM;
            int i = cnqVar.b.a;
            StringBuilder sb = new StringBuilder(str.length() + 11);
            sb.append(str);
            sb.append(i);
            afih afihVar2 = new afih(afifVar, "net.badstatus", j, sb.toString());
            afihVar2.f();
            return afihVar2;
        }
        if (th instanceof cnp) {
            afih afihVar3 = new afih(afif.DRM, "net.timeout", j, true != z ? null : "info.provisioning");
            afihVar3.f();
            return afihVar3;
        }
        if (!(th instanceof cng)) {
            return afihVar;
        }
        afih afihVar4 = new afih(afif.DRM, "net.connect", j, true != z ? null : "info.provisioning");
        afihVar4.f();
        return afihVar4;
    }

    public static String r(MediaCodec.CodecException codecException) {
        return codecException.getDiagnosticInfo().replace("android.media.MediaCodec", "MC");
    }

    public static String s(Surface surface) {
        return surface == null ? "null" : surface.isValid() ? "valid" : "invalid";
    }

    public static afel t(PlayerConfigModel playerConfigModel) {
        return new afek(playerConfigModel.z());
    }

    public static afel u(PlayerConfigModel playerConfigModel, aenf aenfVar) {
        int i;
        int i2;
        aquz aquzVar = playerConfigModel.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int ca = anaf.ca(aquzVar.r);
        int i3 = 1;
        if (ca == 0 || ca == 1) {
            i3 = 2;
        } else {
            aquz aquzVar2 = playerConfigModel.c.e;
            if (aquzVar2 == null) {
                aquzVar2 = aquz.b;
            }
            int ca2 = anaf.ca(aquzVar2.r);
            if (ca2 != 0) {
                i3 = ca2;
            }
        }
        if (i3 - 1 == 2) {
            aquz aquzVar3 = playerConfigModel.c.e;
            if (aquzVar3 == null) {
                aquzVar3 = aquz.b;
            }
            if (aquzVar3.t != 0) {
                aquz aquzVar4 = playerConfigModel.c.e;
                if (aquzVar4 == null) {
                    aquzVar4 = aquz.b;
                }
                i = aquzVar4.t;
            } else {
                i = 11000;
            }
            aquz aquzVar5 = playerConfigModel.c.e;
            if (aquzVar5 == null) {
                aquzVar5 = aquz.b;
            }
            if (aquzVar5.u != 0) {
                aquz aquzVar6 = playerConfigModel.c.e;
                if (aquzVar6 == null) {
                    aquzVar6 = aquz.b;
                }
                i2 = aquzVar6.u;
            } else {
                i2 = 10000;
            }
            return new afej(i, i2, playerConfigModel.A(), aenfVar);
        }
        return new afek(playerConfigModel.A());
    }

    public static boolean v(int i, int i2) {
        return (i & i2) != 0;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "RESTORE";
            case 2:
                return "ADD_TRANSFER";
            case 3:
                return "REMOVE_TRANSFER";
            case 4:
                return "PING";
            case 5:
                return "RESYNC_TRANSFER";
            case 6:
                return "SIZE";
            case 7:
                return "PROGRESS";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR_RETRYABLE";
            case 10:
                return "ERROR_FATAL";
            case 11:
                return "RETRY";
            case 12:
                return "PAUSE_RUNNING_TRANSFERS";
            case 13:
                return "ERROR_PAUSE_TRANSFER";
            case 14:
                return "QUIT";
            case 15:
                return "WATCH_NEXT_COMPLETED";
            case 16:
                return "PAUSE_RUNNING_AND_PENDING_TRANSFERS";
            case 17:
                return "UPDATE_TRANSFER_OUTPUT_EXTRAS";
            case 18:
                return "STREAM_TRANSFER_STARTED";
            case 19:
                return "PAUSE_TRANSFER";
            case 20:
                return "RESUME_TRANSFER";
            case 21:
                return "SET_DOWNLOAD_NETWORK_PREFERENCE";
            default:
                return "null";
        }
    }

    public static int x(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        String lowerCase2 = str2.toLowerCase(Locale.getDefault());
        String lowerCase3 = str3.toLowerCase(Locale.getDefault());
        if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase)) {
            return 3;
        }
        String[] split = lowerCase.split("\\s+");
        int i = 0;
        for (String str4 : split) {
            if (lowerCase2.contains(str4) || lowerCase3.contains(str4)) {
                i++;
            }
        }
        int length = split.length;
        if (i == length) {
            return 2;
        }
        return (i < (length >> 1) || i <= 0) ? 0 : 1;
    }

    public static apxf y(String str, asno asnoVar) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
        aone createBuilder = LikeEndpointOuterClass$LikeEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) createBuilder.instance;
        likeEndpointOuterClass$LikeEndpoint.e = asnoVar.e;
        likeEndpointOuterClass$LikeEndpoint.b |= 1;
        aone createBuilder2 = asnp.a.createBuilder();
        createBuilder2.copyOnWrite();
        asnp asnpVar = (asnp) createBuilder2.instance;
        str.getClass();
        asnpVar.b |= 1;
        asnpVar.c = str;
        createBuilder.copyOnWrite();
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = (LikeEndpointOuterClass$LikeEndpoint) createBuilder.instance;
        asnp asnpVar2 = (asnp) createBuilder2.build();
        asnpVar2.getClass();
        likeEndpointOuterClass$LikeEndpoint2.f = asnpVar2;
        likeEndpointOuterClass$LikeEndpoint2.b |= 2;
        aongVar.e(aonkVar, (LikeEndpointOuterClass$LikeEndpoint) createBuilder.build());
        return (apxf) aongVar.build();
    }

    public static apxf z(String str, agnp agnpVar, int i, String str2, byte[] bArr) {
        agnpVar.getClass();
        return A(str, agnpVar.f(), i, str2, bArr != null ? aomf.x(bArr) : aomf.b);
    }

    public aezf d(String str, PlayerConfigModel playerConfigModel, aeru aeruVar, VideoStreamingData videoStreamingData, int i) {
        return null;
    }

    public void e(afky afkyVar) {
    }

    public void f(avl avlVar) {
    }
}
