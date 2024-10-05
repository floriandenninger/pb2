package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnx implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ tkv b;
    private final /* synthetic */ int c;

    public /* synthetic */ tnx(tov tovVar, tkv tkvVar, int i) {
        this.c = i;
        this.a = tovVar;
        this.b = tkvVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        long c;
        int i = this.c;
        if (i == 0) {
            tov tovVar = this.a;
            tsx.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", this.b.d);
            tovVar.c.a((trg) obj, "Shared file not found in getFileGroupDownloadStatus", new Object[0]);
            return anaf.O(tlc.NONE);
        }
        int i2 = 1;
        if (i == 1) {
            tov tovVar2 = this.a;
            tkv tkvVar = this.b;
            tkv tkvVar2 = (tkv) obj;
            if (tkvVar2 == null || !tov.q(tkvVar, tkvVar2)) {
                c = tovVar2.f.c();
            } else {
                tku tkuVar = tkvVar2.c;
                if (tkuVar == null) {
                    tkuVar = tku.a;
                }
                c = tkuVar.d;
            }
            tku tkuVar2 = tkvVar.c;
            if (tkuVar2 == null) {
                tkuVar2 = tku.a;
            }
            aone builder = tkuVar2.toBuilder();
            builder.copyOnWrite();
            tku tkuVar3 = (tku) builder.instance;
            tkuVar3.b = 2 | tkuVar3.b;
            tkuVar3.d = c;
            tku tkuVar4 = (tku) builder.build();
            aone builder2 = tkvVar.toBuilder();
            builder2.copyOnWrite();
            tkv tkvVar3 = (tkv) builder2.instance;
            tkuVar4.getClass();
            tkvVar3.c = tkuVar4;
            tkvVar3.b |= 1;
            return anaf.O((tkv) builder2.build());
        }
        if (i != 2) {
            tov tovVar3 = this.a;
            tkv tkvVar4 = this.b;
            tov.u(1009, tovVar3.b, tkvVar4);
            aone createBuilder = andw.a.createBuilder();
            String str = tkvVar4.e;
            createBuilder.copyOnWrite();
            andw andwVar = (andw) createBuilder.instance;
            str.getClass();
            andwVar.b |= 4;
            andwVar.e = str;
            String str2 = tkvVar4.d;
            createBuilder.copyOnWrite();
            andw andwVar2 = (andw) createBuilder.instance;
            str2.getClass();
            andwVar2.b |= 1;
            andwVar2.c = str2;
            int i3 = tkvVar4.f;
            createBuilder.copyOnWrite();
            andw andwVar3 = (andw) createBuilder.instance;
            andwVar3.b |= 2;
            andwVar3.d = i3;
            int size = tkvVar4.n.size();
            createBuilder.copyOnWrite();
            andw andwVar4 = (andw) createBuilder.instance;
            andwVar4.b |= 8;
            andwVar4.f = size;
            long j = tkvVar4.r;
            createBuilder.copyOnWrite();
            andw andwVar5 = (andw) createBuilder.instance;
            andwVar5.b |= 32;
            andwVar5.h = j;
            String str3 = tkvVar4.s;
            createBuilder.copyOnWrite();
            andw andwVar6 = (andw) createBuilder.instance;
            str3.getClass();
            andwVar6.b |= 64;
            andwVar6.i = str3;
            andw andwVar7 = (andw) createBuilder.build();
            tku tkuVar5 = tkvVar4.c;
            if (tkuVar5 == null) {
                tkuVar5 = tku.a;
            }
            if (tkuVar5.g == 0) {
                int i4 = tsx.a;
            } else {
                long j2 = tkuVar5.d;
                long j3 = tkuVar5.f;
                long j4 = tkuVar5.e;
                aone createBuilder2 = anea.a.createBuilder();
                int i5 = tkuVar5.g;
                createBuilder2.copyOnWrite();
                anea aneaVar = (anea) createBuilder2.instance;
                aneaVar.b = 1 | aneaVar.b;
                aneaVar.c = i5;
                createBuilder2.copyOnWrite();
                anea aneaVar2 = (anea) createBuilder2.instance;
                aneaVar2.b = 2 | aneaVar2.b;
                aneaVar2.d = j4 - j3;
                createBuilder2.copyOnWrite();
                anea aneaVar3 = (anea) createBuilder2.instance;
                aneaVar3.b |= 4;
                aneaVar3.e = j4 - j2;
                tovVar3.b.b(andwVar7, (anea) createBuilder2.build());
            }
            return anaf.O(tot.DOWNLOADED);
        }
        tov tovVar4 = this.a;
        tkv tkvVar5 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return anhv.a;
        }
        return aney.i(anht.q(tovVar4.c(tkvVar5)), tkl.class, new tnq(tkvVar5, i2), tovVar4.h);
    }
}
