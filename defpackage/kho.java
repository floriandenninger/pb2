package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class kho implements khl {
    private static final khm a = new khm(atxl.PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION);
    private final atxk b;

    public kho(atxk atxkVar) {
        this.b = atxkVar;
    }

    @Override // defpackage.khl
    public atxg a() {
        atxg a2 = a.a();
        atxk atxkVar = this.b;
        a2.copyOnWrite();
        ((atxh) a2.instance).j(atxkVar);
        return a2;
    }
}
