package defpackage;

import j$.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wxu implements ToLongFunction {
    private final /* synthetic */ int c;
    public static final /* synthetic */ wxu b = new wxu(1);
    public static final /* synthetic */ wxu a = new wxu(0);

    private /* synthetic */ wxu(int i) {
        this.c = i;
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return this.c != 0 ? ((auyr) obj).d : ((xfl) obj).d.a;
    }
}
