package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inj extends aifx {
    public static final String f(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.e : "";
    }

    public static final String g(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 2) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.d : "";
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ owi a(Object obj) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj;
        aone createBuilder = owi.a.createBuilder();
        String g = g(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        g.getClass();
        owiVar.b |= 1;
        owiVar.c = g;
        String f = f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        f.getClass();
        owiVar2.b |= 2;
        owiVar2.e = f;
        int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 4;
        owiVar3.f = i;
        createBuilder.copyOnWrite();
        owi owiVar4 = (owi) createBuilder.instance;
        owiVar4.b |= 8;
        owiVar4.g = "";
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.g;
        createBuilder.copyOnWrite();
        owi owiVar5 = (owi) createBuilder.instance;
        str.getClass();
        owiVar5.b |= 512;
        owiVar5.m = str;
        createBuilder.copyOnWrite();
        owi owiVar6 = (owi) createBuilder.instance;
        owiVar6.b |= 256;
        owiVar6.l = 0L;
        createBuilder.copyOnWrite();
        owi owiVar7 = (owi) createBuilder.instance;
        owiVar7.b |= 2048;
        owiVar7.o = true;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 1024) != 0) {
            atsn atsnVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
            if (atsnVar == null) {
                atsnVar = atsn.a;
            }
            if ((atsnVar.b & 2) != 0) {
                atsn atsnVar2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
                if (atsnVar2 == null) {
                    atsnVar2 = atsn.a;
                }
                atsl atslVar = atsnVar2.d;
                if (atslVar == null) {
                    atslVar = atsl.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar8 = (owi) createBuilder.instance;
                atslVar.getClass();
                owiVar8.s = atslVar;
                owiVar8.b |= 262144;
            }
            atsn atsnVar3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
            if (atsnVar3 == null) {
                atsnVar3 = atsn.a;
            }
            if ((atsnVar3.b & 1) != 0) {
                atsn atsnVar4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
                if (atsnVar4 == null) {
                    atsnVar4 = atsn.a;
                }
                atsk atskVar = atsnVar4.c;
                if (atskVar == null) {
                    atskVar = atsk.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar9 = (owi) createBuilder.instance;
                atskVar.getClass();
                owiVar9.r = atskVar;
                owiVar9.b |= 65536;
            }
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 4194304) != 0) {
            awdk awdkVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.v;
            if (awdkVar == null) {
                awdkVar = awdk.a;
            }
            createBuilder.copyOnWrite();
            owi owiVar10 = (owi) createBuilder.instance;
            awdkVar.getClass();
            owiVar10.A = awdkVar;
            owiVar10.b |= 268435456;
        }
        return (owi) createBuilder.build();
    }

    @Override // defpackage.aiga
    public final aomu b() {
        return ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return f((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj);
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return g((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj);
    }

    @Override // defpackage.aifx
    public final /* synthetic */ boolean e(Object obj, Object obj2) {
        return amkq.b((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj2);
    }
}
