package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgj extends aef {
    final /* synthetic */ rgm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgj(rgm rgmVar) {
        super(20);
        this.a = rgmVar;
    }

    @Override // defpackage.aef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        String str = (String) obj;
        qip.ax(str);
        rgm rgmVar = this.a;
        rgmVar.V();
        qip.ax(str);
        axvz.b();
        if (!rgmVar.J().o(rfd.at) || !rgmVar.g(str)) {
            return null;
        }
        if (!rgmVar.b.containsKey(str) || rgmVar.b.get(str) == null) {
            rgmVar.d(str);
        } else {
            rgmVar.e(str, (rku) rgmVar.b.get(str));
        }
        return (dxh) rgmVar.d.e().get(str);
    }
}
