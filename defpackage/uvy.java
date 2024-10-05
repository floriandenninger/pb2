package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvy {
    private final qob a;

    public uvy(qob qobVar) {
        this.a = qobVar;
    }

    private static anhy c(rpt rptVar) {
        return aney.i(rwh.Y(rptVar), qnx.class, ufj.d, angq.a);
    }

    public final anhy a(String str) {
        str.getClass();
        return c(this.a.D(str));
    }

    public final anhy b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return c(this.a.E(str, str2).b(angq.a, new rox() { // from class: uvx
            @Override // defpackage.rox
            public final Object a(rpt rptVar) {
                uvv uvvVar;
                Configurations configurations = (Configurations) rptVar.g();
                aone createBuilder = uvu.a.createBuilder();
                String str3 = configurations.a;
                createBuilder.copyOnWrite();
                uvu uvuVar = (uvu) createBuilder.instance;
                str3.getClass();
                uvuVar.b |= 1;
                uvuVar.c = str3;
                String str4 = configurations.c;
                createBuilder.copyOnWrite();
                uvu uvuVar2 = (uvu) createBuilder.instance;
                str4.getClass();
                uvuVar2.b |= 4;
                uvuVar2.e = str4;
                boolean z = configurations.f;
                createBuilder.copyOnWrite();
                uvu uvuVar3 = (uvu) createBuilder.instance;
                uvuVar3.b |= 8;
                uvuVar3.h = z;
                long j = configurations.g;
                createBuilder.copyOnWrite();
                uvu uvuVar4 = (uvu) createBuilder.instance;
                uvuVar4.b |= 16;
                uvuVar4.i = j;
                byte[] bArr = configurations.b;
                int i = 2;
                if (bArr != null) {
                    aomf x = aomf.x(bArr);
                    createBuilder.copyOnWrite();
                    uvu uvuVar5 = (uvu) createBuilder.instance;
                    uvuVar5.b |= 2;
                    uvuVar5.d = x;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Configuration configuration = configurationArr[i2];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        Flag flag = flagArr[i3];
                        int i4 = flag.g;
                        if (i4 == 1) {
                            aone createBuilder2 = uvv.a.createBuilder();
                            String str5 = flag.a;
                            createBuilder2.copyOnWrite();
                            uvv uvvVar2 = (uvv) createBuilder2.instance;
                            str5.getClass();
                            uvvVar2.b |= 1;
                            uvvVar2.e = str5;
                            if (flag.g == 1) {
                                long j2 = flag.b;
                                createBuilder2.copyOnWrite();
                                uvv uvvVar3 = (uvv) createBuilder2.instance;
                                uvvVar3.c = 1;
                                uvvVar3.d = Long.valueOf(j2);
                                uvvVar = (uvv) createBuilder2.build();
                            } else {
                                throw new IllegalArgumentException("Not a long type");
                            }
                        } else if (i4 == i) {
                            aone createBuilder3 = uvv.a.createBuilder();
                            String str6 = flag.a;
                            createBuilder3.copyOnWrite();
                            uvv uvvVar4 = (uvv) createBuilder3.instance;
                            str6.getClass();
                            uvvVar4.b |= 1;
                            uvvVar4.e = str6;
                            if (flag.g == 2) {
                                boolean z2 = flag.c;
                                createBuilder3.copyOnWrite();
                                uvv uvvVar5 = (uvv) createBuilder3.instance;
                                uvvVar5.c = 2;
                                uvvVar5.d = Boolean.valueOf(z2);
                                uvvVar = (uvv) createBuilder3.build();
                            } else {
                                throw new IllegalArgumentException("Not a boolean type");
                            }
                        } else if (i4 == 3) {
                            aone createBuilder4 = uvv.a.createBuilder();
                            String str7 = flag.a;
                            createBuilder4.copyOnWrite();
                            uvv uvvVar6 = (uvv) createBuilder4.instance;
                            str7.getClass();
                            uvvVar6.b |= 1;
                            uvvVar6.e = str7;
                            if (flag.g == 3) {
                                double d = flag.d;
                                createBuilder4.copyOnWrite();
                                uvv uvvVar7 = (uvv) createBuilder4.instance;
                                uvvVar7.c = 3;
                                uvvVar7.d = Double.valueOf(d);
                                uvvVar = (uvv) createBuilder4.build();
                            } else {
                                throw new IllegalArgumentException("Not a double type");
                            }
                        } else if (i4 == 4) {
                            aone createBuilder5 = uvv.a.createBuilder();
                            String str8 = flag.a;
                            createBuilder5.copyOnWrite();
                            uvv uvvVar8 = (uvv) createBuilder5.instance;
                            str8.getClass();
                            uvvVar8.b |= 1;
                            uvvVar8.e = str8;
                            if (flag.g == 4) {
                                String str9 = flag.e;
                                qip.an(str9);
                                createBuilder5.copyOnWrite();
                                uvv uvvVar9 = (uvv) createBuilder5.instance;
                                uvvVar9.c = 4;
                                uvvVar9.d = str9;
                                uvvVar = (uvv) createBuilder5.build();
                            } else {
                                throw new IllegalArgumentException("Not a String type");
                            }
                        } else if (i4 == 5) {
                            aone createBuilder6 = uvv.a.createBuilder();
                            String str10 = flag.a;
                            createBuilder6.copyOnWrite();
                            uvv uvvVar10 = (uvv) createBuilder6.instance;
                            str10.getClass();
                            uvvVar10.b |= 1;
                            uvvVar10.e = str10;
                            if (flag.g == 5) {
                                aomf x2 = aomf.x((byte[]) qip.an(flag.f));
                                createBuilder6.copyOnWrite();
                                uvv uvvVar11 = (uvv) createBuilder6.instance;
                                uvvVar11.c = 5;
                                uvvVar11.d = x2;
                                uvvVar = (uvv) createBuilder6.build();
                            } else {
                                throw new IllegalArgumentException("Not a bytes type");
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Unrecognized flag type: ");
                            sb.append(i4);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        createBuilder.copyOnWrite();
                        uvu uvuVar6 = (uvu) createBuilder.instance;
                        uvvVar.getClass();
                        aony aonyVar = uvuVar6.f;
                        if (!aonyVar.c()) {
                            uvuVar6.f = aonm.mutableCopy(aonyVar);
                        }
                        uvuVar6.f.add(uvvVar);
                        i3++;
                        i = 2;
                    }
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str11 : strArr) {
                            createBuilder.copyOnWrite();
                            uvu uvuVar7 = (uvu) createBuilder.instance;
                            str11.getClass();
                            aony aonyVar2 = uvuVar7.g;
                            if (!aonyVar2.c()) {
                                uvuVar7.g = aonm.mutableCopy(aonyVar2);
                            }
                            uvuVar7.g.add(str11);
                        }
                    }
                    i2++;
                    i = 2;
                }
                return (uvu) createBuilder.build();
            }
        }));
    }
}
