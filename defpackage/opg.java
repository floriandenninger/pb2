package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opg implements zfi {
    public final /* synthetic */ opk a;
    public final /* synthetic */ zfi b;
    private final /* synthetic */ int c;

    public /* synthetic */ opg(opk opkVar, zfi zfiVar, int i) {
        this.c = i;
        this.a = opkVar;
        this.b = zfiVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.c == 0) {
            opo opoVar = (opo) obj;
            this.b.a(Boolean.valueOf((this.a.d < 3 || opoVar == null || opoVar.c) ? false : true));
        } else {
            opk opkVar = this.a;
            opo opoVar2 = (opo) obj;
            this.b.a(Boolean.valueOf((opkVar.d < 6 || opoVar2 == null || opoVar2.e == 0 || opoVar2.d || opkVar.a.c() < opoVar2.e + TimeUnit.HOURS.toMillis(24L)) ? false : true));
        }
    }
}
