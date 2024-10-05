package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abel extends aaru {
    public final List a;
    public String b;
    public String c;
    public String d;
    public String s;
    public byte[] t;
    public byte[] u;
    public long v;
    public asrh w;
    public CharSequence x;
    public int y;

    public abel(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/handle_transaction", ajoyVar, afsxVar, null, null, null);
        this.b = "";
        this.c = "";
        this.d = "";
        this.s = "";
        this.t = aaef.a;
        this.u = aaef.a;
        this.v = -1L;
        this.w = asrh.a;
        this.x = "";
        this.y = 1;
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if ((r0.b & 2) != 0) goto L17;
     */
    @Override // defpackage.aaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            aone r0 = r5.a()
            aonm r0 = r0.build()
            asfm r0 = (defpackage.asfm) r0
            java.lang.String r1 = r0.d
            defpackage.zhq.m(r1)
            int r1 = r5.y
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L2f
            r4 = 2
            if (r1 != r4) goto L30
            avit r0 = r0.j
            if (r0 != 0) goto L1e
            avit r0 = defpackage.avit.a
        L1e:
            avir r0 = r0.c
            if (r0 != 0) goto L24
            avir r0 = defpackage.avir.a
        L24:
            apmu r0 = r0.c
            if (r0 != 0) goto L2a
            apmu r0 = defpackage.apmu.a
        L2a:
            int r0 = r0.b
            r0 = r0 & r4
            if (r0 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            defpackage.amkq.N(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abel.c():void");
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfm.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        asfm asfmVar = (asfm) createBuilder.instance;
        str.getClass();
        asfmVar.b |= 2;
        asfmVar.d = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        asfm asfmVar2 = (asfm) createBuilder.instance;
        str2.getClass();
        asfmVar2.b |= 4;
        asfmVar2.e = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        asfm asfmVar3 = (asfm) createBuilder.instance;
        str3.getClass();
        asfmVar3.b |= 8;
        asfmVar3.f = str3;
        String str4 = this.s;
        createBuilder.copyOnWrite();
        asfm asfmVar4 = (asfm) createBuilder.instance;
        str4.getClass();
        asfmVar4.b |= 16;
        asfmVar4.g = str4;
        aomf x = aomf.x(this.t);
        createBuilder.copyOnWrite();
        asfm asfmVar5 = (asfm) createBuilder.instance;
        asfmVar5.b |= 32;
        asfmVar5.h = x;
        aomf x2 = aomf.x(this.u);
        createBuilder.copyOnWrite();
        asfm asfmVar6 = (asfm) createBuilder.instance;
        asfmVar6.b |= 64;
        asfmVar6.i = x2;
        if (!this.a.isEmpty()) {
            List list = this.a;
            createBuilder.copyOnWrite();
            asfm asfmVar7 = (asfm) createBuilder.instance;
            aony aonyVar = asfmVar7.k;
            if (!aonyVar.c()) {
                asfmVar7.k = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) asfmVar7.k);
        }
        if (this.v != -1) {
            aone createBuilder2 = attd.a.createBuilder();
            long j = this.v;
            createBuilder2.copyOnWrite();
            attd attdVar = (attd) createBuilder2.instance;
            attdVar.b |= 1;
            attdVar.e = j;
            aone createBuilder3 = apmu.a.createBuilder();
            long j2 = this.v;
            createBuilder3.copyOnWrite();
            apmu apmuVar = (apmu) createBuilder3.instance;
            apmuVar.b |= 2;
            apmuVar.f = j2;
            if (this.w.c.size() > 0) {
                asrh asrhVar = this.w;
                createBuilder2.copyOnWrite();
                attd attdVar2 = (attd) createBuilder2.instance;
                asrhVar.getClass();
                attdVar2.d = asrhVar;
                attdVar2.c = 3;
                asrh asrhVar2 = this.w;
                createBuilder3.copyOnWrite();
                apmu apmuVar2 = (apmu) createBuilder3.instance;
                asrhVar2.getClass();
                apmuVar2.d = asrhVar2;
                apmuVar2.c = 4;
            }
            if (!TextUtils.isEmpty(this.x)) {
                String charSequence = this.x.toString();
                createBuilder2.copyOnWrite();
                attd attdVar3 = (attd) createBuilder2.instance;
                charSequence.getClass();
                attdVar3.c = 2;
                attdVar3.d = charSequence;
                String charSequence2 = this.x.toString();
                createBuilder3.copyOnWrite();
                apmu apmuVar3 = (apmu) createBuilder3.instance;
                charSequence2.getClass();
                apmuVar3.c = 3;
                apmuVar3.d = charSequence2;
            }
            aone createBuilder4 = avit.a.createBuilder();
            createBuilder4.copyOnWrite();
            avit avitVar = (avit) createBuilder4.instance;
            attd attdVar4 = (attd) createBuilder2.build();
            attdVar4.getClass();
            avitVar.e = attdVar4;
            avitVar.b |= 4;
            aone createBuilder5 = avir.a.createBuilder();
            createBuilder5.copyOnWrite();
            avir avirVar = (avir) createBuilder5.instance;
            apmu apmuVar4 = (apmu) createBuilder3.build();
            apmuVar4.getClass();
            avirVar.c = apmuVar4;
            avirVar.b |= 1;
            createBuilder4.copyOnWrite();
            avit avitVar2 = (avit) createBuilder4.instance;
            avir avirVar2 = (avir) createBuilder5.build();
            avirVar2.getClass();
            avitVar2.c = avirVar2;
            avitVar2.b |= 1;
            createBuilder.copyOnWrite();
            asfm asfmVar8 = (asfm) createBuilder.instance;
            avit avitVar3 = (avit) createBuilder4.build();
            avitVar3.getClass();
            asfmVar8.j = avitVar3;
            asfmVar8.b |= 256;
        }
        return createBuilder;
    }
}
