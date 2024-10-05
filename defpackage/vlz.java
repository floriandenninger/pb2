package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlz extends vlx {
    private static final amxj a = amxj.l("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl");
    private final qlm b;
    private final aoet c;
    private final Context d;

    public vlz(Context context, qlm qlmVar, aoet aoetVar) {
        this.d = context;
        this.b = qlmVar;
        this.c = aoetVar;
    }

    private final void e(aoeu aoeuVar) {
        baar baarVar = new baar(1);
        qli b = this.b.b(new vly(aoeuVar));
        b.m = sky.a(this.d, baarVar);
        ((amxh) ((amxh) a.c()).i("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl", "logObakeExtension", 55, "ObakeLoggerImpl.java")).s("extension=%s", aoeuVar);
        b.b();
    }

    private final aone f() {
        aone createBuilder = aoeu.a.createBuilder();
        aoet aoetVar = this.c;
        createBuilder.copyOnWrite();
        aoeu aoeuVar = (aoeu) createBuilder.instance;
        aoeuVar.c = aoetVar;
        aoeuVar.b |= 1;
        return createBuilder;
    }

    @Override // defpackage.vlx
    public final void a(aofb aofbVar) {
        aone f = f();
        aone createBuilder = aoev.a.createBuilder();
        aone createBuilder2 = aofa.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofa aofaVar = (aofa) createBuilder2.instance;
        aofaVar.c = 2;
        aofaVar.b |= 1;
        createBuilder2.copyOnWrite();
        aofa aofaVar2 = (aofa) createBuilder2.instance;
        aofbVar.getClass();
        aofaVar2.f = aofbVar;
        aofaVar2.b |= 8;
        createBuilder.copyOnWrite();
        aoev aoevVar = (aoev) createBuilder.instance;
        aofa aofaVar3 = (aofa) createBuilder2.build();
        aofaVar3.getClass();
        aoevVar.c = aofaVar3;
        aoevVar.b |= 1;
        f.copyOnWrite();
        aoeu aoeuVar = (aoeu) f.instance;
        aoev aoevVar2 = (aoev) createBuilder.build();
        aoeu aoeuVar2 = aoeu.a;
        aoevVar2.getClass();
        aoeuVar.d = aoevVar2;
        aoeuVar.b |= 2;
        e((aoeu) f.build());
    }

    @Override // defpackage.vlx
    public final void b(aofc aofcVar) {
        aone f = f();
        aone createBuilder = aoev.a.createBuilder();
        aone createBuilder2 = aofa.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofa aofaVar = (aofa) createBuilder2.instance;
        aofaVar.c = 3;
        aofaVar.b |= 1;
        createBuilder2.copyOnWrite();
        aofa aofaVar2 = (aofa) createBuilder2.instance;
        aofcVar.getClass();
        aofaVar2.g = aofcVar;
        aofaVar2.b |= 16;
        createBuilder.copyOnWrite();
        aoev aoevVar = (aoev) createBuilder.instance;
        aofa aofaVar3 = (aofa) createBuilder2.build();
        aofaVar3.getClass();
        aoevVar.c = aofaVar3;
        aoevVar.b |= 1;
        f.copyOnWrite();
        aoeu aoeuVar = (aoeu) f.instance;
        aoev aoevVar2 = (aoev) createBuilder.build();
        aoeu aoeuVar2 = aoeu.a;
        aoevVar2.getClass();
        aoeuVar.d = aoevVar2;
        aoeuVar.b |= 2;
        e((aoeu) f.build());
    }

    @Override // defpackage.vlx
    public final void c(aofh aofhVar) {
        aofj aofjVar = aofhVar.d;
        if (aofjVar == null) {
            aofjVar = aofj.a;
        }
        if ((aofjVar.b & 1) != 0) {
            aone f = f();
            aone createBuilder = aoev.a.createBuilder();
            aone createBuilder2 = aofa.a.createBuilder();
            createBuilder2.copyOnWrite();
            aofa aofaVar = (aofa) createBuilder2.instance;
            aofaVar.c = 1;
            aofaVar.b |= 1;
            createBuilder2.copyOnWrite();
            aofa aofaVar2 = (aofa) createBuilder2.instance;
            aofhVar.getClass();
            aofaVar2.e = aofhVar;
            aofaVar2.b |= 4;
            createBuilder.copyOnWrite();
            aoev aoevVar = (aoev) createBuilder.instance;
            aofa aofaVar3 = (aofa) createBuilder2.build();
            aofaVar3.getClass();
            aoevVar.c = aofaVar3;
            aoevVar.b = 1 | aoevVar.b;
            f.copyOnWrite();
            aoeu aoeuVar = (aoeu) f.instance;
            aoev aoevVar2 = (aoev) createBuilder.build();
            aoeu aoeuVar2 = aoeu.a;
            aoevVar2.getClass();
            aoeuVar.d = aoevVar2;
            aoeuVar.b |= 2;
            e((aoeu) f.build());
            return;
        }
        throw new IllegalArgumentException("OperationEntries require an OperationSummary with a set EntryType.");
    }

    @Override // defpackage.vlx
    public final void d(aofi aofiVar) {
        aone f = f();
        aone createBuilder = aoev.a.createBuilder();
        aone createBuilder2 = aofa.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofa aofaVar = (aofa) createBuilder2.instance;
        aofaVar.c = 4;
        aofaVar.b |= 1;
        createBuilder2.copyOnWrite();
        aofa aofaVar2 = (aofa) createBuilder2.instance;
        aofiVar.getClass();
        aofaVar2.d = aofiVar;
        aofaVar2.b |= 2;
        createBuilder.copyOnWrite();
        aoev aoevVar = (aoev) createBuilder.instance;
        aofa aofaVar3 = (aofa) createBuilder2.build();
        aofaVar3.getClass();
        aoevVar.c = aofaVar3;
        aoevVar.b |= 1;
        f.copyOnWrite();
        aoeu aoeuVar = (aoeu) f.instance;
        aoev aoevVar2 = (aoev) createBuilder.build();
        aoeu aoeuVar2 = aoeu.a;
        aoevVar2.getClass();
        aoeuVar.d = aoevVar2;
        aoeuVar.b |= 2;
        e((aoeu) f.build());
    }
}
