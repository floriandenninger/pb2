package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tni implements amml {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ tni(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                this.a.addAll((List) obj);
                return null;
            case 1:
                List list = this.a;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    list.add(uri);
                }
                return null;
            case 2:
                return this.a;
            case 3:
                List<tld> list2 = this.a;
                aone builder = ((tlb) obj).toBuilder();
                for (tld tldVar : list2) {
                    String str = tldVar.c;
                    String str2 = tldVar.d;
                    int i = tsx.a;
                    builder.y(rwh.aI(tldVar));
                }
                return (tlb) builder.build();
            case 4:
                List list3 = this.a;
                tlb tlbVar = (tlb) obj;
                aone builder2 = tlbVar.toBuilder();
                for (Map.Entry entry : Collections.unmodifiableMap(tlbVar.b).entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        list3.add(Pair.create(rwh.aG(str3), (tkv) entry.getValue()));
                    } catch (ttk e) {
                        builder2.y(str3);
                        String valueOf = String.valueOf(str3);
                        tsx.j(e, valueOf.length() != 0 ? "Failed to deserialized file group key: ".concat(valueOf) : new String("Failed to deserialized file group key: "));
                    }
                }
                return (tlb) builder2.build();
            case 5:
                List list4 = this.a;
                aone builder3 = ((tlb) obj).toBuilder();
                builder3.copyOnWrite();
                tlb tlbVar2 = (tlb) builder3.instance;
                aony aonyVar = tlbVar2.d;
                if (!aonyVar.c()) {
                    tlbVar2.d = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) list4, (List) tlbVar2.d);
                return (tlb) builder3.build();
            case 6:
                return this.a;
            case 7:
                List list5 = this.a;
                aone builder4 = ((awuq) obj).toBuilder();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    builder4.be(zoy.e((String) it.next()), 1);
                }
                return (awuq) builder4.build();
            default:
                List list6 = this.a;
                aone builder5 = ((awvr) obj).toBuilder();
                aone createBuilder = afil.a.createBuilder();
                createBuilder.copyOnWrite();
                afil afilVar = (afil) createBuilder.instance;
                aony aonyVar2 = afilVar.b;
                if (!aonyVar2.c()) {
                    afilVar.b = aonm.mutableCopy(aonyVar2);
                }
                aolo.addAll((Iterable) list6, (List) afilVar.b);
                afil afilVar2 = (afil) createBuilder.build();
                builder5.copyOnWrite();
                awvr awvrVar = (awvr) builder5.instance;
                afilVar2.getClass();
                awvrVar.e = afilVar2;
                awvrVar.b |= 2;
                return (awvr) builder5.build();
        }
    }
}
