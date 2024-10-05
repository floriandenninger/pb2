package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agec implements ylb {
    private final azrw a;
    private final azrw b;

    public agec(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        int i;
        agsn agsnVar;
        aonm build;
        agmr agmrVar = (agmr) this.a.get();
        atph atphVar = agmrVar.d.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        atqn atqnVar = atphVar.c;
        if (atqnVar == null) {
            atqnVar = atqn.a;
        }
        if (!atqnVar.b) {
            return 0;
        }
        agsn a = ((agof) agmrVar.g.get()).a();
        if ("NO_OP_STORE_TAG".equals(a.q())) {
            return 0;
        }
        boolean z = (a.m().j().isEmpty() && a.i().j().isEmpty()) ? false : true;
        String K = yny.K("offline_client_state_should_log_%s", a.q());
        if (!z) {
            if (!agmrVar.c.getBoolean(K, false)) {
                return 0;
            }
            agmrVar.c.edit().putBoolean(K, false).apply();
        } else {
            agmrVar.c.edit().putBoolean(K, true).apply();
        }
        Collection<agnv> j = a.m().j();
        Collection j2 = a.i().j();
        HashMap hashMap = new HashMap();
        long j3 = 0;
        long j4 = 0;
        for (agnv agnvVar : j) {
            hashMap.put(agnvVar.m(), agnvVar);
            long j5 = agnvVar.f;
            if (j5 > j3) {
                j3 = j5;
            }
            long j6 = agnvVar.g;
            if (j6 > j4) {
                j4 = j6;
            }
        }
        aone createBuilder = atou.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            agnv agnvVar2 = (agnv) it.next();
            aone createBuilder2 = atow.a.createBuilder();
            String m = agnvVar2.m();
            createBuilder2.copyOnWrite();
            atow atowVar = (atow) createBuilder2.instance;
            m.getClass();
            Iterator it2 = it;
            atowVar.b |= 1;
            atowVar.c = m;
            agnq agnqVar = agnq.DELETED;
            switch (agnvVar2.i()) {
                case DELETED:
                    i = 7;
                    break;
                case PLAYABLE:
                    i = 2;
                    break;
                case CANDIDATE:
                    i = 18;
                    break;
                case TRANSFER_IN_PROGRESS:
                case TRANSFER_WAITING_IN_QUEUE:
                case OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE:
                    i = 3;
                    break;
                case TRANSFER_PENDING_USER_APPROVAL:
                case TRANSFER_PENDING_NETWORK:
                case TRANSFER_PENDING_WIFI:
                case TRANSFER_PENDING_TOOTHFAIRY:
                case TRANSFER_PENDING_STORAGE:
                    i = 10;
                    break;
                case TRANSFER_PAUSED:
                    i = 4;
                    break;
                case ERROR_PENDING_PLAYABILITY_ACTION:
                    i = 17;
                    break;
                case ERROR_STREAMS_MISSING:
                    i = 11;
                    break;
                case ERROR_STREAMS_OUT_OF_DATE:
                    i = 13;
                    break;
                case ERROR_NOT_PLAYABLE:
                    i = 5;
                    break;
                case ERROR_POLICY:
                    i = 8;
                    break;
                case ERROR_EXPIRED:
                case ERROR_EXPIRED_RENTAL:
                    i = 9;
                    break;
                case ERROR_NETWORK:
                    i = 15;
                    break;
                case ERROR_DISK:
                case ERROR_DISK_SD_CARD:
                    i = 14;
                    break;
                case ERROR_GENERIC:
                    i = 6;
                    break;
                default:
                    i = 1;
                    break;
            }
            createBuilder2.copyOnWrite();
            atow atowVar2 = (atow) createBuilder2.instance;
            int i2 = i - 1;
            atowVar2.d = i2;
            atowVar2.b |= 2;
            int bX = anaf.bX(i2);
            if (bX != 0 && bX == 10) {
                boolean E = agnvVar2.E();
                int i3 = E;
                if (agnvVar2.D()) {
                    agnz agnzVar = agnvVar2.o;
                    i3 = E;
                    if (agnzVar != null) {
                        i3 = (E ? 1 : 0) | aedn.I(agnzVar.c);
                    }
                }
                createBuilder2.copyOnWrite();
                atow atowVar3 = (atow) createBuilder2.instance;
                atowVar3.b |= 4;
                atowVar3.e = i3;
            }
            long d = agnvVar2.d();
            createBuilder2.copyOnWrite();
            atow atowVar4 = (atow) createBuilder2.instance;
            atowVar4.b |= 8;
            atowVar4.f = d;
            long e = agnvVar2.e();
            createBuilder2.copyOnWrite();
            atow atowVar5 = (atow) createBuilder2.instance;
            atowVar5.b |= 16;
            atowVar5.g = e;
            atrx atrxVar = agnvVar2.b;
            createBuilder2.copyOnWrite();
            atow atowVar6 = (atow) createBuilder2.instance;
            atowVar6.h = atrxVar.k;
            atowVar6.b |= 32;
            int b = agnvVar2.m.b();
            createBuilder2.copyOnWrite();
            atow atowVar7 = (atow) createBuilder2.instance;
            atowVar7.i = b - 1;
            atowVar7.b |= 64;
            long j7 = agnvVar2.f;
            createBuilder2.copyOnWrite();
            atow atowVar8 = (atow) createBuilder2.instance;
            atowVar8.b |= 128;
            atowVar8.j = j7;
            agnu agnuVar = agnvVar2.j;
            if (agnuVar != null) {
                long j8 = agnuVar.d;
                createBuilder2.copyOnWrite();
                atow atowVar9 = (atow) createBuilder2.instance;
                agsnVar = a;
                atowVar9.b |= 256;
                atowVar9.k = j8;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(agnuVar.b() - agnuVar.e.c());
                createBuilder2.copyOnWrite();
                atow atowVar10 = (atow) createBuilder2.instance;
                atowVar10.b |= 512;
                atowVar10.l = seconds;
            } else {
                agsnVar = a;
            }
            long j9 = agnvVar2.g;
            createBuilder2.copyOnWrite();
            atow atowVar11 = (atow) createBuilder2.instance;
            atowVar11.b |= 32768;
            atowVar11.n = j9;
            boolean z2 = (agnvVar2.e || agnvVar2.s()) ? false : true;
            createBuilder2.copyOnWrite();
            atow atowVar12 = (atow) createBuilder2.instance;
            atowVar12.b |= 2048;
            atowVar12.m = z2;
            boolean a2 = agnvVar2.a();
            createBuilder2.copyOnWrite();
            atow atowVar13 = (atow) createBuilder2.instance;
            atowVar13.b |= 65536;
            atowVar13.o = a2;
            agnn agnnVar = agnvVar2.n;
            boolean z3 = agnnVar != null && agnnVar.g;
            createBuilder2.copyOnWrite();
            atow atowVar14 = (atow) createBuilder2.instance;
            atowVar14.b |= 131072;
            atowVar14.p = !z3;
            agnn agnnVar2 = agnvVar2.n;
            String str = agnnVar2 == null ? null : agnnVar2.f;
            aone createBuilder3 = auyh.a.createBuilder();
            createBuilder3.copyOnWrite();
            auyh auyhVar = (auyh) createBuilder3.instance;
            auyhVar.d = 0;
            auyhVar.b |= 2;
            if (TextUtils.isEmpty(str)) {
                build = createBuilder3.build();
            } else {
                List h = amnm.b(';').h(str);
                if (h.size() != 2) {
                    build = createBuilder3.build();
                } else if (((String) h.get(0)).length() < 2) {
                    build = createBuilder3.build();
                } else {
                    String substring = ((String) h.get(0)).substring(((String) h.get(0)).length() - 2);
                    if (((String) h.get(1)).length() <= 0) {
                        build = createBuilder3.build();
                    } else {
                        String substring2 = ((String) h.get(1)).substring(((String) h.get(1)).length() - 1);
                        try {
                            int parseInt = Integer.parseInt(substring, 16);
                            createBuilder3.copyOnWrite();
                            auyh auyhVar2 = (auyh) createBuilder3.instance;
                            auyhVar2.b |= 1;
                            auyhVar2.c = parseInt;
                            int parseInt2 = Integer.parseInt(substring2);
                            if (parseInt2 == 1) {
                                createBuilder3.copyOnWrite();
                                auyh auyhVar3 = (auyh) createBuilder3.instance;
                                auyhVar3.d = 1;
                                auyhVar3.b |= 2;
                            } else if (parseInt2 == 2) {
                                createBuilder3.copyOnWrite();
                                auyh auyhVar4 = (auyh) createBuilder3.instance;
                                auyhVar4.d = 2;
                                auyhVar4.b = 2 | auyhVar4.b;
                            } else if (parseInt2 != 3) {
                                createBuilder3.copyOnWrite();
                                auyh auyhVar5 = (auyh) createBuilder3.instance;
                                auyhVar5.d = 0;
                                auyhVar5.b |= 2;
                            } else {
                                createBuilder3.copyOnWrite();
                                auyh auyhVar6 = (auyh) createBuilder3.instance;
                                auyhVar6.d = 3;
                                auyhVar6.b |= 2;
                            }
                            build = createBuilder3.build();
                        } catch (NumberFormatException unused) {
                            build = createBuilder3.build();
                        }
                    }
                }
            }
            auyh auyhVar7 = (auyh) build;
            createBuilder2.copyOnWrite();
            atow atowVar15 = (atow) createBuilder2.instance;
            auyhVar7.getClass();
            atowVar15.q = auyhVar7;
            atowVar15.b |= 262144;
            arrayList.add((atow) createBuilder2.build());
            it = it2;
            a = agsnVar;
        }
        agsn agsnVar2 = a;
        createBuilder.copyOnWrite();
        atou atouVar = (atou) createBuilder.instance;
        aony aonyVar = atouVar.c;
        if (!aonyVar.c()) {
            atouVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) atouVar.c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = j2.iterator();
        while (it3.hasNext()) {
            agni agniVar = (agni) it3.next();
            aone createBuilder4 = atov.a.createBuilder();
            String str2 = agniVar.a.a;
            createBuilder4.copyOnWrite();
            atov atovVar = (atov) createBuilder4.instance;
            atovVar.b |= 1;
            atovVar.c = str2;
            List list = agniVar.b;
            createBuilder4.copyOnWrite();
            atov atovVar2 = (atov) createBuilder4.instance;
            aony aonyVar2 = atovVar2.d;
            if (!aonyVar2.c()) {
                atovVar2.d = aonm.mutableCopy(aonyVar2);
            }
            aolo.addAll((Iterable) list, (List) atovVar2.d);
            int size = agniVar.b.size();
            createBuilder4.copyOnWrite();
            atov atovVar3 = (atov) createBuilder4.instance;
            atovVar3.b |= 2;
            atovVar3.e = size;
            Iterator it4 = agniVar.b.iterator();
            Iterator it5 = it3;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (it4.hasNext()) {
                Iterator it6 = it4;
                if (((agnv) hashMap.get((String) it4.next())) != null) {
                    agnq agnqVar2 = agnq.DELETED;
                    switch (r5.i()) {
                        case PLAYABLE:
                            i5++;
                            break;
                        case TRANSFER_IN_PROGRESS:
                        case TRANSFER_WAITING_IN_QUEUE:
                        case TRANSFER_PENDING_USER_APPROVAL:
                        case TRANSFER_PENDING_NETWORK:
                        case TRANSFER_PENDING_WIFI:
                        case TRANSFER_PENDING_TOOTHFAIRY:
                        case TRANSFER_PENDING_STORAGE:
                        case TRANSFER_PAUSED:
                        case OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE:
                        case ERROR_PENDING_PLAYABILITY_ACTION:
                            i8++;
                            break;
                        case ERROR_STREAMS_MISSING:
                        case ERROR_STREAMS_OUT_OF_DATE:
                        case ERROR_EXPIRED:
                        case ERROR_EXPIRED_RENTAL:
                        case ERROR_NETWORK:
                        case ERROR_DISK:
                        case ERROR_DISK_SD_CARD:
                        case ERROR_GENERIC:
                            i6++;
                            break;
                        case ERROR_NOT_PLAYABLE:
                        case ERROR_POLICY:
                            i7++;
                            break;
                    }
                    it4 = it6;
                }
                i4++;
                it4 = it6;
            }
            createBuilder4.copyOnWrite();
            atov atovVar4 = (atov) createBuilder4.instance;
            atovVar4.b |= 4;
            atovVar4.f = i5;
            createBuilder4.copyOnWrite();
            atov atovVar5 = (atov) createBuilder4.instance;
            atovVar5.b |= 8;
            atovVar5.g = i6;
            createBuilder4.copyOnWrite();
            atov atovVar6 = (atov) createBuilder4.instance;
            atovVar6.b |= 16;
            atovVar6.h = i8;
            createBuilder4.copyOnWrite();
            atov atovVar7 = (atov) createBuilder4.instance;
            atovVar7.b |= 32;
            atovVar7.i = i7;
            createBuilder4.copyOnWrite();
            atov atovVar8 = (atov) createBuilder4.instance;
            atovVar8.b |= 64;
            atovVar8.j = i4;
            atrx atrxVar2 = agniVar.c;
            createBuilder4.copyOnWrite();
            atov atovVar9 = (atov) createBuilder4.instance;
            atovVar9.k = atrxVar2.k;
            atovVar9.b |= 128;
            int i9 = agniVar.g;
            createBuilder4.copyOnWrite();
            atov atovVar10 = (atov) createBuilder4.instance;
            atovVar10.m = i9 - 1;
            atovVar10.b |= 1024;
            long j10 = agniVar.f;
            createBuilder4.copyOnWrite();
            atov atovVar11 = (atov) createBuilder4.instance;
            atovVar11.b |= 512;
            atovVar11.l = j10;
            arrayList2.add((atov) createBuilder4.build());
            it3 = it5;
            hashMap = hashMap;
        }
        createBuilder.copyOnWrite();
        atou atouVar2 = (atou) createBuilder.instance;
        aony aonyVar3 = atouVar2.d;
        if (!aonyVar3.c()) {
            atouVar2.d = aonm.mutableCopy(aonyVar3);
        }
        aolo.addAll((Iterable) arrayList2, (List) atouVar2.d);
        long b2 = agmrVar.e.b();
        createBuilder.copyOnWrite();
        atou atouVar3 = (atou) createBuilder.instance;
        atouVar3.b |= 1;
        atouVar3.e = b2;
        createBuilder.copyOnWrite();
        atou atouVar4 = (atou) createBuilder.instance;
        atouVar4.b |= 4;
        atouVar4.f = j4;
        createBuilder.copyOnWrite();
        atou atouVar5 = (atou) createBuilder.instance;
        atouVar5.b |= 8;
        atouVar5.g = j3;
        long j11 = agmrVar.c.getLong(yny.L("%s_offline_download_success", agsnVar2.q()), 0L);
        createBuilder.copyOnWrite();
        atou atouVar6 = (atou) createBuilder.instance;
        atouVar6.b |= 16;
        atouVar6.h = j11;
        boolean b3 = agmrVar.a.b();
        createBuilder.copyOnWrite();
        atou atouVar7 = (atou) createBuilder.instance;
        atouVar7.b |= 32;
        atouVar7.i = b3;
        aqjw f = agmrVar.b.f();
        createBuilder.copyOnWrite();
        atou atouVar8 = (atou) createBuilder.instance;
        atouVar8.j = f.B;
        atouVar8.b |= 64;
        if (agmrVar.a.a() != -1.0f) {
            float a3 = agmrVar.a.a();
            createBuilder.copyOnWrite();
            atou atouVar9 = (atou) createBuilder.instance;
            atouVar9.b |= 128;
            atouVar9.k = (int) (a3 * 100.0f);
        }
        createBuilder.copyOnWrite();
        atou atouVar10 = (atou) createBuilder.instance;
        atouVar10.b |= 256;
        atouVar10.l = false;
        ((agmu) agmrVar.f.get()).a((atou) createBuilder.build());
        ((agms) this.b.get()).a();
        return 0;
    }
}
