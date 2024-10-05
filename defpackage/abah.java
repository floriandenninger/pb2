package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abah extends aaru {
    public final ArrayList a;
    public final aone b;
    private atnt c;

    public abah(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification_registration/set_registration", ajoyVar, afsxVar, null, null, null);
        this.c = atnt.a;
        this.a = new ArrayList();
        this.b = atns.a.createBuilder();
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        yjk.e();
        aone createBuilder = arwd.a.createBuilder();
        aone builder = this.c.toBuilder();
        aone aoneVar = this.b;
        aoneVar.copyOnWrite();
        atns atnsVar = (atns) aoneVar.instance;
        atns atnsVar2 = atns.a;
        atnsVar.g = atns.emptyProtobufList();
        ArrayList arrayList = this.a;
        aoneVar.copyOnWrite();
        atns atnsVar3 = (atns) aoneVar.instance;
        aony aonyVar = atnsVar3.g;
        if (!aonyVar.c()) {
            atnsVar3.g = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) atnsVar3.g);
        builder.copyOnWrite();
        atnt atntVar = (atnt) builder.instance;
        atns atnsVar4 = (atns) aoneVar.build();
        atnsVar4.getClass();
        atntVar.c = atnsVar4;
        atntVar.b = 1;
        atnt atntVar2 = (atnt) builder.build();
        this.c = atntVar2;
        createBuilder.copyOnWrite();
        arwd arwdVar = (arwd) createBuilder.instance;
        atntVar2.getClass();
        arwdVar.d = atntVar2;
        arwdVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(1 == (((atns) this.b.instance).b & 1));
    }
}
