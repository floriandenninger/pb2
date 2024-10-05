package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kvi extends zgd {
    final /* synthetic */ agqv a;
    final /* synthetic */ agrd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvi(agqv agqvVar, agrd agrdVar) {
        super("offlinePlaybackRequester");
        this.a = agqvVar;
        this.b = agrdVar;
    }

    @Override // defpackage.zgd
    protected final /* bridge */ /* synthetic */ Object a() {
        return new agpj(this.a, this.b);
    }
}
