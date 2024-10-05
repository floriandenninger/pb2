package youtube.client.blocks.runtime.java;

import defpackage.ammr;
import defpackage.anfq;
import defpackage.angq;
import defpackage.anhy;
import defpackage.aomf;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.awkj;
import defpackage.awkm;
import defpackage.awkn;
import defpackage.awkp;
import defpackage.awkq;
import defpackage.awkt;
import defpackage.awku;
import defpackage.awkw;
import defpackage.awlc;
import defpackage.awld;
import defpackage.awli;
import defpackage.awlj;
import defpackage.awlk;
import defpackage.awll;
import defpackage.awlo;
import defpackage.awlp;
import defpackage.awlq;
import defpackage.awlr;
import defpackage.awma;
import defpackage.awmb;
import defpackage.awmd;
import defpackage.awme;
import defpackage.awmf;
import defpackage.barx;
import defpackage.bary;
import defpackage.barz;
import defpackage.basa;
import defpackage.ufj;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class EntrypointRouter {
    private EntrypointRouter() {
    }

    public static anhy routeAsyncEntrypoint(byte[] bArr) {
        awkj awkjVar;
        awkw awkwVar;
        awlk awlkVar = (awlk) aonm.parseFrom(awlk.a, bArr, aomw.b());
        int i = awlkVar.b;
        int i2 = i != 0 ? i != 1 ? i != 4 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            if (i == 1) {
                awkjVar = (awkj) awlkVar.c;
            } else {
                awkjVar = awkj.a;
            }
            barx a = JavaRuntime.a.a(awkjVar.b);
            if (a == null) {
                throw new IllegalArgumentException("Instance not found in callSync entrypoint.");
            }
            return anfq.i(anfq.i(a.a(awkjVar.c, awkjVar.d.I()), ufj.p, angq.a), ufj.n, angq.a);
        }
        if (i3 == 1) {
            if (i == 4) {
                awkwVar = (awkw) awlkVar.c;
            } else {
                awkwVar = awkw.a;
            }
            barx a2 = JavaRuntime.a.a(awkwVar.b);
            if (a2 == null) {
                throw new IllegalArgumentException("Instance not found in callSync entrypoint.");
            }
            aone createBuilder = awmf.a.createBuilder();
            String str = awkwVar.d;
            createBuilder.copyOnWrite();
            awmf awmfVar = (awmf) createBuilder.instance;
            str.getClass();
            awmfVar.b = 1 | awmfVar.b;
            awmfVar.c = str;
            awmf awmfVar2 = (awmf) createBuilder.build();
            int i4 = awkwVar.c;
            awmfVar2.toByteArray();
            return anfq.i(anfq.i(a2.f(i4), ufj.q, angq.a), ufj.o, angq.a);
        }
        throw new IllegalArgumentException("Entrypoint had an unknown type.");
    }

    public static byte[] routeSyncEntrypoint(byte[] bArr) {
        int i;
        awlc awlcVar;
        awkt awktVar;
        awli awliVar;
        awkm awkmVar;
        awkp awkpVar;
        awlo awloVar;
        awlq awlqVar;
        awma awmaVar;
        awll awllVar = (awll) aonm.parseFrom(awll.a, bArr, aomw.b());
        int i2 = awllVar.b;
        switch (i2) {
            case 0:
                i = 9;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
            case 5:
            default:
                i = 0;
                break;
            case 4:
                i = 3;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 5;
                break;
            case 8:
                i = 6;
                break;
            case 9:
                i = 7;
                break;
            case 10:
                i = 8;
                break;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                if (i2 == 1) {
                    awlcVar = (awlc) awllVar.c;
                } else {
                    awlcVar = awlc.a;
                }
                JavaRuntime javaRuntime = JavaRuntime.a;
                int i4 = awlcVar.d;
                String str = awlcVar.e;
                String str2 = awlcVar.b;
                Integer valueOf = Integer.valueOf(awlcVar.c);
                Map map = (Map) javaRuntime.c.get(Integer.valueOf(i4));
                if (map == null) {
                    StringBuilder sb = new StringBuilder(65);
                    sb.append("No instances with container id: ");
                    sb.append(i4);
                    sb.append(" have been registered.");
                    throw new IllegalArgumentException(sb.toString());
                }
                bary baryVar = (bary) map.get(valueOf);
                if (baryVar == null) {
                    String valueOf2 = String.valueOf(valueOf);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                    sb2.append("No instances with type id: ");
                    sb2.append(valueOf2);
                    sb2.append(" have been registered.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                javaRuntime.b.put(str2, baryVar.a());
                return awld.a.toByteArray();
            case 1:
                if (i2 == 2) {
                    awktVar = (awkt) awllVar.c;
                } else {
                    awktVar = awkt.a;
                }
                barx a = JavaRuntime.a.a(awktVar.b);
                if (a == null) {
                    throw new IllegalArgumentException("Instance not found in callSync entrypoint.");
                }
                byte[] d = a.d(awktVar.c, awktVar.d.I());
                aone createBuilder = awku.a.createBuilder();
                aomf x = aomf.x(d);
                createBuilder.copyOnWrite();
                awku awkuVar = (awku) createBuilder.instance;
                awkuVar.b |= 1;
                awkuVar.c = x;
                return ((awku) createBuilder.build()).toByteArray();
            case 2:
                if (i2 == 4) {
                    awliVar = (awli) awllVar.c;
                } else {
                    awliVar = awli.a;
                }
                if (JavaRuntime.a.a(awliVar.b) != null) {
                    JavaRuntime javaRuntime2 = JavaRuntime.a;
                    String str3 = awliVar.b;
                    javaRuntime2.a(str3).c();
                    javaRuntime2.b.remove(str3);
                    return awlj.a.toByteArray();
                }
                throw new IllegalArgumentException("Instance not found in dispose entrypoint.");
            case 3:
                if (i2 == 6) {
                    awkmVar = (awkm) awllVar.c;
                } else {
                    awkmVar = awkm.a;
                }
                barx a2 = JavaRuntime.a.a(awkmVar.b);
                if (a2 == null) {
                    throw new IllegalArgumentException("Instance not found in callReadableStream entrypoint.");
                }
                aone createBuilder2 = awmd.a.createBuilder();
                String str4 = awkmVar.d;
                createBuilder2.copyOnWrite();
                awmd awmdVar = (awmd) createBuilder2.instance;
                str4.getClass();
                awmdVar.b |= 1;
                awmdVar.c = str4;
                aomf aomfVar = awkmVar.e;
                createBuilder2.copyOnWrite();
                awmd awmdVar2 = (awmd) createBuilder2.instance;
                aomfVar.getClass();
                awmdVar2.b |= 2;
                awmdVar2.d = aomfVar;
                a2.b(awkmVar.c, ((awmd) createBuilder2.build()).toByteArray());
                return awkn.a.toByteArray();
            case 4:
                if (i2 == 7) {
                    awkpVar = (awkp) awllVar.c;
                } else {
                    awkpVar = awkp.a;
                }
                barx a3 = JavaRuntime.a.a(awkpVar.b);
                if (a3 == null) {
                    throw new IllegalArgumentException("Instance not found in callReadableWritableStream entrypoint.");
                }
                aone createBuilder3 = awme.a.createBuilder();
                String str5 = awkpVar.d;
                createBuilder3.copyOnWrite();
                awme awmeVar = (awme) createBuilder3.instance;
                str5.getClass();
                awmeVar.b |= 1;
                awmeVar.c = str5;
                String str6 = awkpVar.e;
                createBuilder3.copyOnWrite();
                awme awmeVar2 = (awme) createBuilder3.instance;
                str6.getClass();
                awmeVar2.b |= 2;
                awmeVar2.d = str6;
                awme awmeVar3 = (awme) createBuilder3.build();
                int i5 = awkpVar.c;
                awmeVar3.toByteArray();
                a3.e(i5);
                return awkq.a.toByteArray();
            case 5:
                if (i2 == 8) {
                    awloVar = (awlo) awllVar.c;
                } else {
                    awloVar = awlo.a;
                }
                barz a4 = basa.a.a(awloVar.b);
                if (a4 == null) {
                    String str7 = awloVar.b;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 42);
                    sb3.append("Java reader not found for stream with ID ");
                    sb3.append(str7);
                    sb3.append(".");
                    throw new IllegalArgumentException(sb3.toString());
                }
                a4.onStreamData(awloVar.c.I());
                return awlp.a.toByteArray();
            case 6:
                if (i2 == 9) {
                    awlqVar = (awlq) awllVar.c;
                } else {
                    awlqVar = awlq.a;
                }
                barz a5 = basa.a.a(awlqVar.b);
                if (a5 == null) {
                    String str8 = awlqVar.b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str8).length() + 42);
                    sb4.append("Java reader not found for stream with ID ");
                    sb4.append(str8);
                    sb4.append(".");
                    throw new IllegalArgumentException(sb4.toString());
                }
                a5.onStreamFinished();
                return awlr.a.toByteArray();
            case 7:
                if (i2 == 10) {
                    awmaVar = (awma) awllVar.c;
                } else {
                    awmaVar = awma.a;
                }
                ammr ammrVar = (ammr) basa.a.c.get(awmaVar.b);
                if (ammrVar != null) {
                    basa basaVar = basa.a;
                    String str9 = ammrVar.b;
                    basaVar.b.remove(str9);
                    basaVar.c.remove(str9);
                    return awmb.a.toByteArray();
                }
                String str10 = awmaVar.b;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str10).length() + 42);
                sb5.append("Java writer not found for stream with ID ");
                sb5.append(str10);
                sb5.append(".");
                throw new IllegalArgumentException(sb5.toString());
            default:
                throw new IllegalArgumentException("Entrypoint had an unknown type.");
        }
    }
}
