package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class khm implements khl {
    private final atxl a;

    public khm(atxl atxlVar) {
        this.a = atxlVar;
    }

    @Override // defpackage.khl
    public atxg a() {
        atxg a = atxh.a();
        atxl atxlVar = this.a;
        a.copyOnWrite();
        ((atxh) a.instance).k(atxlVar);
        return a;
    }
}
