package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aakx {
    public aakt a;
    public aakt b;
    private String c;
    private aaku d;
    private aaku e;
    private aaky f;

    public final void b(aaku aakuVar) {
        if (aakuVar == null) {
            throw new NullPointerException("Null currentMetadata");
        }
        this.e = aakuVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null entityKey");
        }
        this.c = str;
    }

    public final void d(aaku aakuVar) {
        if (aakuVar == null) {
            throw new NullPointerException("Null previousMetadata");
        }
        this.d = aakuVar;
    }

    public final void e(aaky aakyVar) {
        if (aakyVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.f = aakyVar;
    }

    public final aakz a() {
        aaku aakuVar;
        aaku aakuVar2;
        aaky aakyVar;
        aaku aakuVar3 = this.d;
        if (!(aakuVar3 == null ? amlr.a : ammv.j(aakuVar3)).h()) {
            d(aaku.a);
        }
        aaku aakuVar4 = this.e;
        if (!(aakuVar4 == null ? amlr.a : ammv.j(aakuVar4)).h()) {
            b(aaku.a);
        }
        aaky aakyVar2 = this.f;
        if (!(aakyVar2 == null ? amlr.a : ammv.j(aakyVar2)).h()) {
            e(aaky.UNKNOWN);
        }
        String str = this.c;
        if (str == null || (aakuVar = this.d) == null || (aakuVar2 = this.e) == null || (aakyVar = this.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" entityKey");
            }
            if (this.d == null) {
                sb.append(" previousMetadata");
            }
            if (this.e == null) {
                sb.append(" currentMetadata");
            }
            if (this.f == null) {
                sb.append(" reason");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        aakz aakzVar = new aakz(str, this.a, this.b, aakuVar, aakuVar2, aakyVar);
        aakt aaktVar = aakzVar.c;
        aakt aaktVar2 = aakzVar.b;
        if (aaktVar2 != null && aaktVar != null) {
            amkq.O(aaktVar2.getClass().equals(aaktVar.getClass()), "Both current and previous entity should be of the same Entity type");
            amkq.O(aaktVar2.d().equals(aaktVar.d()), "Both previous and current entities must have the same key");
        }
        if (aaktVar2 != null || aaktVar != null) {
            boolean z = true;
            if ((aaktVar2 == null || !aakzVar.a.equals(aaktVar2.d())) && (aaktVar == null || !aakzVar.a.equals(aaktVar.d()))) {
                z = false;
            }
            amkq.O(z, "The update's entityKey must match the current or previous entity's key (or both)");
        }
        return aakzVar;
    }
}
