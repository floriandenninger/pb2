package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abag extends aaru {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public int s;
    public long t;
    public long u;
    public int v;
    private List w;

    public abag(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification/send_device_context", ajoyVar, afsxVar, null, null, null);
        this.v = 1;
        m(aaef.b);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arow.a.createBuilder();
        aone createBuilder2 = arov.a.createBuilder();
        boolean z = this.a;
        createBuilder2.copyOnWrite();
        arov arovVar = (arov) createBuilder2.instance;
        arovVar.b |= 1;
        arovVar.c = z;
        boolean z2 = this.b;
        createBuilder2.copyOnWrite();
        arov arovVar2 = (arov) createBuilder2.instance;
        arovVar2.b |= 4;
        arovVar2.e = z2;
        int i = this.c;
        createBuilder2.copyOnWrite();
        arov arovVar3 = (arov) createBuilder2.instance;
        arovVar3.b |= 2;
        arovVar3.d = i;
        createBuilder2.copyOnWrite();
        arov arovVar4 = (arov) createBuilder2.instance;
        arovVar4.b |= 16;
        arovVar4.f = false;
        int i2 = this.d;
        createBuilder2.copyOnWrite();
        arov arovVar5 = (arov) createBuilder2.instance;
        arovVar5.b |= 32;
        arovVar5.g = i2;
        int i3 = this.s;
        createBuilder2.copyOnWrite();
        arov arovVar6 = (arov) createBuilder2.instance;
        arovVar6.b |= 64;
        arovVar6.h = i3;
        long j = this.u;
        createBuilder2.copyOnWrite();
        arov arovVar7 = (arov) createBuilder2.instance;
        arovVar7.b |= 1024;
        arovVar7.i = j;
        long j2 = this.t;
        createBuilder2.copyOnWrite();
        arov arovVar8 = (arov) createBuilder2.instance;
        arovVar8.b |= 2048;
        arovVar8.j = j2;
        int i4 = this.v;
        createBuilder2.copyOnWrite();
        arov arovVar9 = (arov) createBuilder2.instance;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        arovVar9.k = i5;
        arovVar9.b |= 4096;
        List list = this.w;
        if (list != null) {
            createBuilder2.copyOnWrite();
            arov arovVar10 = (arov) createBuilder2.instance;
            aony aonyVar = arovVar10.l;
            if (!aonyVar.c()) {
                arovVar10.l = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) arovVar10.l);
        }
        createBuilder.copyOnWrite();
        arow arowVar = (arow) createBuilder.instance;
        arov arovVar11 = (arov) createBuilder2.build();
        arovVar11.getClass();
        arowVar.d = arovVar11;
        arowVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }

    public final void d(int i, int i2) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        aone createBuilder = arou.a.createBuilder();
        createBuilder.copyOnWrite();
        arou arouVar = (arou) createBuilder.instance;
        arouVar.b |= 1;
        arouVar.c = i;
        createBuilder.copyOnWrite();
        arou arouVar2 = (arou) createBuilder.instance;
        arouVar2.b |= 2;
        arouVar2.d = i2;
        this.w.add((arou) createBuilder.build());
    }
}
