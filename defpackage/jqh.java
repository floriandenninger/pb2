package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jqh implements ykl {
    final /* synthetic */ jqi a;

    public jqh(jqi jqiVar) {
        this.a = jqiVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        agni agniVar = (agni) obj2;
        if (agniVar == null || this.a.aj.isCancelled()) {
            return;
        }
        jqi jqiVar = this.a;
        jqiVar.ai = agniVar.a.b;
        jqiVar.aq = null;
        ((fzb) jqiVar.ae.get()).j();
        jqi jqiVar2 = this.a;
        jlr jlrVar = jqiVar2.ak;
        CharSequence charSequence = jqiVar2.ai;
        ajom ajomVar = jlrVar.r;
        if (ajomVar != null) {
            ajomVar.oB(new ajok(), new fzr(charSequence));
        }
    }
}
