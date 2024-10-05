package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kvr implements ayrv {
    public final /* synthetic */ aakv a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ kvr(aakv aakvVar, String str, int i) {
        this.c = i;
        this.a = aakvVar;
        this.b = str;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            aakv aakvVar = this.a;
            String str = this.b;
            List<String> list = (List) obj;
            int i2 = kvs.a;
            aaio c = ((aaih) aakvVar).c();
            str.getClass();
            amkq.O(!str.isEmpty(), "key cannot be empty");
            aone createBuilder = athx.a.createBuilder();
            createBuilder.copyOnWrite();
            athx athxVar = (athx) createBuilder.instance;
            athxVar.b = 1 | athxVar.b;
            athxVar.c = str;
            athu athuVar = new athu(createBuilder);
            if (list != null && !list.isEmpty()) {
                for (String str2 : list) {
                    aone aoneVar = athuVar.a;
                    aoneVar.copyOnWrite();
                    athx athxVar2 = (athx) aoneVar.instance;
                    str2.getClass();
                    aony aonyVar = athxVar2.d;
                    if (!aonyVar.c()) {
                        athxVar2.d = aonm.mutableCopy(aonyVar);
                    }
                    athxVar2.d.add(str2);
                }
            }
            c.k(athuVar);
            return c.b();
        }
        if (i == 1) {
            aakv aakvVar2 = this.a;
            String str3 = this.b;
            aalc c2 = aakvVar2.c();
            awis e = ((awiu) obj).e();
            aone createBuilder2 = awiv.a.createBuilder();
            String o = fhe.o(str3);
            createBuilder2.copyOnWrite();
            awiv awivVar = (awiv) createBuilder2.instance;
            o.getClass();
            awivVar.b = 3;
            awivVar.c = o;
            e.d((awiv) createBuilder2.build());
            c2.d(e.a(aakvVar2));
            return c2.b();
        }
        if (i == 2) {
            aakv aakvVar3 = this.a;
            String str4 = this.b;
            aaio c3 = ((aaih) aakvVar3).c();
            aumt e2 = ((aumv) obj).e();
            String[] strArr = {str4};
            for (int i3 = 0; i3 <= 0; i3++) {
                e2.a.aK(strArr[i3]);
            }
            c3.d(e2.c());
            return c3.b();
        }
        aakv aakvVar4 = this.a;
        String str5 = this.b;
        aaio c4 = ((aaih) aakvVar4).c();
        aumt e3 = ((aumv) obj).e();
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(str5));
        List<String> unmodifiableList = Collections.unmodifiableList(((aumw) e3.a.instance).d);
        aone aoneVar2 = e3.a;
        aoneVar2.copyOnWrite();
        ((aumw) aoneVar2.instance).d = aonm.emptyProtobufList();
        for (String str6 : unmodifiableList) {
            if (!linkedHashSet.contains(str6)) {
                e3.a.aK(str6);
            }
        }
        c4.d(e3.c());
        return c4.b();
    }
}
