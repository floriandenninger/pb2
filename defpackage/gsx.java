package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gsx implements adlr {
    final /* synthetic */ apxf a;
    final /* synthetic */ Map b;
    final /* synthetic */ long c;
    final /* synthetic */ gsy d;

    public gsx(gsy gsyVar, apxf apxfVar, Map map, long j) {
        this.d = gsyVar;
        this.a = apxfVar;
        this.b = map;
        this.c = j;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        gsy gsyVar = this.d;
        adlr adlrVar = gsyVar.d;
        if (adlrVar != null) {
            gsyVar.a.k(adlrVar);
        }
        this.d.b(this.a, this.b, this.c);
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }
}
