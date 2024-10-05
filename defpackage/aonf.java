package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aonf extends aolq {
    private final aonm a;

    public aonf(aonm aonmVar) {
        this.a = aonmVar;
    }

    @Override // defpackage.aolq
    public final /* bridge */ /* synthetic */ aooy f(byte[] bArr, int i, int i2, aomw aomwVar) {
        return aonm.parsePartialFrom(this.a, bArr, i, i2, aomwVar);
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object q(aomk aomkVar, aomw aomwVar) {
        return aonm.parsePartialFrom(this.a, aomkVar, aomwVar);
    }
}
