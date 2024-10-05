package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjy {
    private static final int c = d.c("DEFAULT");
    public final LruCache a;
    public barr b;
    private final LruCache d;
    private final Context e;
    private final Integer f;

    public sjy(Context context, int i, LruCache lruCache, LruCache lruCache2) {
        this.e = context;
        this.f = Integer.valueOf(i);
        this.d = lruCache;
        this.a = lruCache2;
    }

    private static Map e(List list, amru amruVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= amruVar.size()) {
                throw new sjx(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", num, Integer.valueOf(amruVar.size())));
            }
            barl barlVar = (barl) amruVar.get(num.intValue());
            Integer valueOf = Integer.valueOf((barlVar.b & 2) != 0 ? barlVar.d : c);
            aone builder = barlVar.toBuilder();
            builder.copyOnWrite();
            barl barlVar2 = (barl) builder.instance;
            barlVar2.b &= -3;
            barlVar2.d = 0;
            hashMap.put(valueOf, (barl) builder.build());
        }
        return hashMap;
    }

    public final baro a(int i) {
        LruCache lruCache = this.d;
        Integer valueOf = Integer.valueOf(i);
        baro baroVar = (baro) lruCache.get(valueOf);
        if (baroVar == null) {
            if (this.b == null) {
                this.b = c();
            }
            baroVar = (baro) Collections.unmodifiableMap(this.b.b).get(valueOf);
            if (baroVar != null) {
                this.d.put(valueOf, baroVar);
            }
        }
        return baroVar;
    }

    public final baro b(int i) {
        baro a = a(i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }

    public final barr c() {
        bark barkVar;
        Context context = this.e;
        if (context != null) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(this.f.intValue());
                try {
                    aomk M = aomk.M(openRawResource);
                    aone createBuilder = barr.a.createBuilder();
                    createBuilder.mo24mergeFrom(M, aomw.a());
                    barr barrVar = (barr) createBuilder.build();
                    aony aonyVar = barrVar.d;
                    aonu aonuVar = barrVar.e;
                    if (aonyVar.size() != aonuVar.size()) {
                        throw new sjx(String.format("ProtoHashNamesList[%d] and MessagesList[%d] must have same size", Integer.valueOf(aonuVar.size()), Integer.valueOf(aonyVar.size())));
                    }
                    HashMap hashMap = new HashMap();
                    amru o = amru.o(barrVar.f);
                    Iterator it = aonuVar.iterator();
                    Iterator it2 = aonyVar.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Integer num = (Integer) it.next();
                        baro baroVar = (baro) it2.next();
                        Map e = e(baroVar.f, o);
                        aonu aonuVar2 = baroVar.g;
                        aonx aonxVar = baroVar.h;
                        if (aonuVar2.size() != aonxVar.size()) {
                            throw new sjx(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(aonxVar.size()), Integer.valueOf(aonuVar2.size())));
                        }
                        HashMap hashMap2 = new HashMap();
                        Iterator it3 = aonuVar2.iterator();
                        Iterator it4 = aonxVar.iterator();
                        while (it4.hasNext() && it3.hasNext()) {
                            Long l = (Long) it4.next();
                            Map e2 = e(amru.r((Integer) it3.next()), o);
                            aone createBuilder2 = bark.a.createBuilder();
                            createBuilder2.cg(e2);
                            hashMap2.put(l, (bark) createBuilder2.build());
                        }
                        aony aonyVar2 = baroVar.d;
                        aonx aonxVar2 = baroVar.e;
                        if (aonyVar2.size() != aonxVar2.size()) {
                            throw new sjx(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(aonxVar2.size()), Integer.valueOf(aonyVar2.size())));
                        }
                        Iterator it5 = aonxVar2.iterator();
                        Iterator it6 = aonyVar2.iterator();
                        while (it5.hasNext() && it6.hasNext()) {
                            Long l2 = (Long) it5.next();
                            bark barkVar2 = (bark) it6.next();
                            Map e3 = e(barkVar2.e, o);
                            if (hashMap2.containsKey(l2)) {
                                aone builder = barkVar2.toBuilder();
                                builder.mergeFrom((aonm) hashMap2.get(l2));
                                barkVar = (bark) builder.build();
                            } else {
                                aone builder2 = barkVar2.toBuilder();
                                builder2.cg(e3);
                                builder2.copyOnWrite();
                                ((bark) builder2.instance).e = bark.emptyIntList();
                                barkVar = (bark) builder2.build();
                            }
                            hashMap2.put(l2, barkVar);
                        }
                        aone builder3 = baroVar.toBuilder();
                        builder3.copyOnWrite();
                        baro baroVar2 = (baro) builder3.instance;
                        aoot aootVar = baroVar2.b;
                        if (!aootVar.b) {
                            baroVar2.b = aootVar.a();
                        }
                        baroVar2.b.putAll(e);
                        builder3.copyOnWrite();
                        ((baro) builder3.instance).f = baro.emptyIntList();
                        builder3.copyOnWrite();
                        baro baroVar3 = (baro) builder3.instance;
                        aoot aootVar2 = baroVar3.c;
                        if (!aootVar2.b) {
                            baroVar3.c = aootVar2.a();
                        }
                        baroVar3.c.putAll(hashMap2);
                        builder3.copyOnWrite();
                        ((baro) builder3.instance).e = baro.emptyLongList();
                        builder3.copyOnWrite();
                        ((baro) builder3.instance).d = baro.emptyProtobufList();
                        builder3.copyOnWrite();
                        ((baro) builder3.instance).g = baro.emptyIntList();
                        builder3.copyOnWrite();
                        ((baro) builder3.instance).h = baro.emptyLongList();
                        hashMap.put(num, (baro) builder3.build());
                    }
                    aone createBuilder3 = barr.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    barr barrVar2 = (barr) createBuilder3.instance;
                    aoot aootVar3 = barrVar2.b;
                    if (!aootVar3.b) {
                        barrVar2.b = aootVar3.a();
                    }
                    barrVar2.b.putAll(hashMap);
                    Map unmodifiableMap = Collections.unmodifiableMap(barrVar.c);
                    createBuilder3.copyOnWrite();
                    barr barrVar3 = (barr) createBuilder3.instance;
                    aoot aootVar4 = barrVar3.c;
                    if (!aootVar4.b) {
                        barrVar3.c = aootVar4.a();
                    }
                    barrVar3.c.putAll(unmodifiableMap);
                    barr barrVar4 = (barr) createBuilder3.build();
                    if (openRawResource != null) {
                        openRawResource.close();
                    }
                    return barrVar4;
                } catch (Throwable th) {
                    if (openRawResource != null) {
                        try {
                            openRawResource.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException e4) {
                throw new IOException(e4);
            }
        }
        throw new IOException("No context to load resource from");
    }

    public final boolean d(int i) {
        return a(i) != null;
    }
}
