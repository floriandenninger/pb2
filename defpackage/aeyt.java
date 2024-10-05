package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyt implements affi {
    final /* synthetic */ affp a;
    final /* synthetic */ aeyk b;
    final /* synthetic */ aeyl c;

    public aeyt(affp affpVar, aeyk aeykVar, aeyl aeylVar) {
        this.a = affpVar;
        this.b = aeykVar;
        this.c = aeylVar;
    }

    @Override // defpackage.affi
    public final aefc a(aefb aefbVar) {
        affp affpVar = this.a;
        String str = aefbVar.b;
        aeyk aeykVar = this.b;
        aeyl aeylVar = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("new MediaParsersListenerNativeHandler(");
        sb.append(str);
        sb.append(")");
        afjh a = affpVar.a(sb.toString().getBytes());
        if (a == null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
            sb2.append("Instance \"");
            sb2.append(str);
            sb2.append("\" is not valid.");
            throw new IllegalArgumentException(sb2.toString());
        }
        aeys aeysVar = new aeys(new affj(a, null), aeylVar, aeykVar);
        aeye aeyeVar = this.b.b;
        aeys aeysVar2 = aeyeVar.c;
        if (aeysVar2 != null) {
            afes afesVar = new afes(4);
            afesVar.b = "MediaParsers Initialize Already Called.";
            afesVar.b("c", "initalreadycalled");
            aeysVar2.a(afesVar.a());
        } else {
            aeyeVar.c = aeysVar;
        }
        return aefc.a;
    }

    @Override // defpackage.affi
    public final aefi b(aefh aefhVar) {
        afet a;
        aeye aeyeVar = this.b.b;
        ajcb ajcbVar = aefhVar.b;
        if (ajcbVar == null) {
            ajcbVar = ajcb.a;
        }
        String str = aefhVar.c;
        ByteBuffer wrap = ByteBuffer.wrap(aefhVar.d.I());
        long j = aefhVar.e;
        int i = aefhVar.f;
        afki.a(aeyeVar.c);
        try {
            aeyd aeydVar = (aeyd) aeyeVar.b.get(ajcbVar);
            if (aeydVar == null) {
                aeydVar = new aeyd(aeyeVar, ajcbVar, str);
                aeyeVar.b.put(ajcbVar, aeydVar);
            }
            aeydVar.e = -9223372036854775807L;
            aeydVar.f = -9223372036854775807L;
            aeydVar.g = 0L;
            aeydVar.d = i;
            long j2 = aeydVar.c;
            if (j2 == -1 || j != j2 + 1) {
                aeydVar.b.f(0L, 0L);
            }
            int position = wrap.position();
            try {
                aeydVar.b.a(wrap, j);
                if (wrap.position() - position > 0) {
                    aeydVar.c = (j + r4) - 1;
                }
                afki.d(!wrap.hasRemaining());
                aeys aeysVar = aeyeVar.c;
                long j3 = aeydVar.e;
                long j4 = aeydVar.f;
                long j5 = aeydVar.g;
                affj affjVar = aeysVar.a;
                aone createBuilder = aefd.a.createBuilder();
                createBuilder.copyOnWrite();
                aefd aefdVar = (aefd) createBuilder.instance;
                ajcbVar.getClass();
                aefdVar.c = ajcbVar;
                aefdVar.b |= 1;
                double b = aeyc.b(j3);
                createBuilder.copyOnWrite();
                aefd aefdVar2 = (aefd) createBuilder.instance;
                aefdVar2.b |= 2;
                aefdVar2.d = b;
                double b2 = aeyc.b(j4);
                createBuilder.copyOnWrite();
                aefd aefdVar3 = (aefd) createBuilder.instance;
                aefdVar3.b |= 4;
                aefdVar3.e = b2;
                double b3 = aeyc.b(j5);
                createBuilder.copyOnWrite();
                aefd aefdVar4 = (aefd) createBuilder.instance;
                aefdVar4.b |= 8;
                aefdVar4.f = b3;
                try {
                } catch (aoob e) {
                    throw new RuntimeException("Unexpected protobuf error", e);
                }
            } catch (pnr e2) {
                afes afesVar = new afes(3);
                int i2 = aeydVar.a.c;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Parser error for itag ");
                sb.append(i2);
                afesVar.b = sb.toString();
                afesVar.a = e2;
                afesVar.c(aeydVar.a.c);
                throw afesVar.a();
            }
        } catch (Exception e3) {
            aeyeVar.b.remove(ajcbVar);
            if (e3 instanceof afet) {
                a = (afet) e3;
            } else {
                afes afesVar2 = new afes(4);
                int i3 = ajcbVar.c;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Unexpected error while parsing itag ");
                sb2.append(i3);
                afesVar2.b = sb2.toString();
                afesVar2.a = e3;
                afesVar2.b("c", "pushmedia");
                afesVar2.c(ajcbVar.c);
                a = afesVar2.a();
            }
            aeyeVar.c.a(a);
        }
        return aefi.a;
    }

    @Override // defpackage.affi
    public final aefg c() {
        return aefg.a;
    }
}
