package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jld implements ykl {
    final /* synthetic */ jle a;

    public jld(jle jleVar) {
        this.a = jleVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Collection collection = (Collection) obj2;
        Future future = this.a.c;
        if (future == null || future.isCancelled()) {
            this.a.c = null;
        } else {
            final jle jleVar = this.a;
            jleVar.a.execute(new Runnable() { // from class: jlc
                @Override // java.lang.Runnable
                public final void run() {
                    apxf apxfVar;
                    auar auarVar;
                    aqbw aqbwVar;
                    aqbw aqbwVar2;
                    jle jleVar2 = jle.this;
                    Collection<agni> collection2 = collection;
                    if (jleVar2.b.isEmpty()) {
                        return;
                    }
                    amru o = amru.o(jleVar2.b);
                    int size = o.size();
                    int i = 0;
                    while (i < size) {
                        lse lseVar = ((lsd) o.get(i)).a;
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        HashSet hashSet2 = new HashSet();
                        HashSet ao = amkq.ao(lseVar.g.g);
                        ArrayList arrayList = new ArrayList();
                        for (apuz apuzVar : lseVar.g.e) {
                            if (apuzVar.b == 48602820) {
                                aqbwVar = (aqbw) apuzVar.c;
                            } else {
                                aqbwVar = aqbw.a;
                            }
                            aqbt aqbtVar = aqbwVar.k;
                            if (aqbtVar == null) {
                                aqbtVar = aqbt.a;
                            }
                            if (aqbtVar.b == 135739232) {
                                if (apuzVar.b == 48602820) {
                                    aqbwVar2 = (aqbw) apuzVar.c;
                                } else {
                                    aqbwVar2 = aqbw.a;
                                }
                                arrayList.add(aqbwVar2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            aqbt aqbtVar2 = ((aqbw) it.next()).k;
                            if (aqbtVar2 == null) {
                                aqbtVar2 = aqbt.a;
                            }
                            if (aqbtVar2.b == 135739232) {
                                auarVar = (auar) aqbtVar2.c;
                            } else {
                                auarVar = auar.a;
                            }
                            hashSet.add(auarVar.c);
                        }
                        for (agni agniVar : collection2) {
                            String str = agniVar.a.a;
                            jti jtiVar = (jti) lseVar.b.get();
                            agniVar.getClass();
                            amru amruVar = o;
                            aqbw aqbwVar3 = (aqbw) jtiVar.g(agni.class, aqbw.class, agniVar, null);
                            if (hashSet.contains(str)) {
                                hashMap.put(str, aqbwVar3);
                            } else if (!ao.contains(str)) {
                                hashSet2.add(aqbwVar3);
                            }
                            o = amruVar;
                        }
                        amru amruVar2 = o;
                        if (((fjs) lseVar.c.get()).h()) {
                            ajng r = lseVar.d.r();
                            for (int i2 = 0; i2 < r.a(); i2++) {
                                Object c = r.c(i2);
                                if (c instanceof aqbw) {
                                    aqbw aqbwVar4 = (aqbw) c;
                                    if (aqbwVar4.c == 4) {
                                        apxfVar = (apxf) aqbwVar4.d;
                                    } else {
                                        apxfVar = apxf.a;
                                    }
                                    if (fia.b(apxfVar)) {
                                        break;
                                    }
                                }
                                if (r.c(i2) instanceof apuv) {
                                    break;
                                }
                            }
                            Context context = lseVar.a;
                            aone createBuilder = aqbw.a.createBuilder();
                            aqyg g = ajcq.g(context.getString(R.string.offline_videos_title));
                            createBuilder.copyOnWrite();
                            aqbw aqbwVar5 = (aqbw) createBuilder.instance;
                            g.getClass();
                            aqbwVar5.g = g;
                            aqbwVar5.b |= 1;
                            apxf apxfVar2 = fia.a;
                            createBuilder.copyOnWrite();
                            aqbw aqbwVar6 = (aqbw) createBuilder.instance;
                            apxfVar2.getClass();
                            aqbwVar6.d = apxfVar2;
                            aqbwVar6.c = 4;
                            aone createBuilder2 = aqbt.a.createBuilder();
                            aone createBuilder3 = auar.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            auar auarVar2 = (auar) createBuilder3.instance;
                            auarVar2.b |= 1;
                            auarVar2.c = "PPSV";
                            createBuilder2.copyOnWrite();
                            aqbt aqbtVar3 = (aqbt) createBuilder2.instance;
                            auar auarVar3 = (auar) createBuilder3.build();
                            auarVar3.getClass();
                            aqbtVar3.c = auarVar3;
                            aqbtVar3.b = 135739232;
                            createBuilder.copyOnWrite();
                            aqbw aqbwVar7 = (aqbw) createBuilder.instance;
                            aqbt aqbtVar4 = (aqbt) createBuilder2.build();
                            aqbtVar4.getClass();
                            aqbwVar7.k = aqbtVar4;
                            aqbwVar7.b |= 32768;
                            aone createBuilder4 = aqbu.a.createBuilder();
                            aone createBuilder5 = aqbz.a.createBuilder();
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(Long.MAX_VALUE);
                            createBuilder5.copyOnWrite();
                            aqbz aqbzVar = (aqbz) createBuilder5.instance;
                            aqbzVar.b |= 1;
                            aqbzVar.c = seconds;
                            createBuilder4.copyOnWrite();
                            aqbu aqbuVar = (aqbu) createBuilder4.instance;
                            aqbz aqbzVar2 = (aqbz) createBuilder5.build();
                            aqbzVar2.getClass();
                            aqbuVar.c = aqbzVar2;
                            aqbuVar.b = 135744618;
                            createBuilder.copyOnWrite();
                            aqbw aqbwVar8 = (aqbw) createBuilder.instance;
                            aqbu aqbuVar2 = (aqbu) createBuilder4.build();
                            aqbuVar2.getClass();
                            aqbwVar8.l = aqbuVar2;
                            aqbwVar8.b |= 65536;
                            aone createBuilder6 = aqby.a.createBuilder();
                            aone createBuilder7 = arfu.a.createBuilder();
                            aong aongVar = (aong) arfs.a.createBuilder();
                            arfr arfrVar = arfr.OFFLINE_DOWNLOAD;
                            aongVar.copyOnWrite();
                            arfs arfsVar = (arfs) aongVar.instance;
                            arfsVar.c = arfrVar.pV;
                            arfsVar.b |= 1;
                            createBuilder7.copyOnWrite();
                            arfu arfuVar = (arfu) createBuilder7.instance;
                            arfs arfsVar2 = (arfs) aongVar.build();
                            arfsVar2.getClass();
                            arfuVar.c = arfsVar2;
                            arfuVar.b |= 1;
                            createBuilder6.copyOnWrite();
                            aqby aqbyVar = (aqby) createBuilder6.instance;
                            arfu arfuVar2 = (arfu) createBuilder7.build();
                            arfuVar2.getClass();
                            aqbyVar.f = arfuVar2;
                            aqbyVar.b |= 128;
                            createBuilder.copyOnWrite();
                            aqbw aqbwVar9 = (aqbw) createBuilder.instance;
                            aqby aqbyVar2 = (aqby) createBuilder6.build();
                            aqbyVar2.getClass();
                            aqbwVar9.i = aqbyVar2;
                            aqbwVar9.b |= 32;
                            hashSet2.add((aqbw) createBuilder.build());
                        }
                        ArrayList arrayList2 = new ArrayList(hashSet2);
                        Collections.sort(arrayList2, lseVar.h);
                        ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size());
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i3 >= arrayList.size() && i4 >= arrayList2.size()) {
                                break;
                            }
                            aqbw aqbwVar10 = (aqbw) lse.d(arrayList, i3);
                            aqbw aqbwVar11 = (aqbw) lse.d(arrayList2, i4);
                            if (aqbwVar10 == null) {
                                arrayList3.add(aqbwVar11);
                            } else {
                                if (aqbwVar11 == null) {
                                    arrayList3.add(lse.c(aqbwVar10, hashMap));
                                } else if (lseVar.h.a(aqbwVar10, aqbwVar11) <= 0) {
                                    arrayList3.add(lse.c(aqbwVar10, hashMap));
                                } else {
                                    arrayList3.add(aqbwVar11);
                                }
                                i3++;
                            }
                            i4++;
                        }
                        int i5 = lseVar.f ? lseVar.g.f + 1 : lseVar.g.f;
                        int i6 = 0;
                        while (true) {
                            if (i5 < lseVar.e.size() || i6 < arrayList3.size()) {
                                Object obj3 = i5 < lseVar.e.size() ? lseVar.e.get(i5) : null;
                                aqbw aqbwVar12 = (aqbw) lse.d(arrayList3, i6);
                                if (obj3 != null) {
                                    if (obj3 instanceof aqbw) {
                                        aqbt aqbtVar5 = ((aqbw) obj3).k;
                                        if (aqbtVar5 == null) {
                                            aqbtVar5 = aqbt.a;
                                        }
                                        if (aqbtVar5.b == 135739232) {
                                        }
                                    }
                                    i5++;
                                }
                                if (obj3 == null) {
                                    lseVar.e.add(aqbwVar12);
                                } else if (aqbwVar12 == null) {
                                    lseVar.e.remove(i5);
                                } else if (!obj3.equals(aqbwVar12)) {
                                    lseVar.e.n(i5, aqbwVar12);
                                }
                                i5++;
                                i6++;
                            }
                        }
                        lseVar.l();
                        i++;
                        o = amruVar2;
                    }
                }
            });
        }
    }
}
