package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihn implements ypd {
    public final shf b;
    public acsx c;
    public long d;
    public boolean e;
    private final iml g;
    private final acsw h;
    private String i;
    public final Object a = new Object();
    public int f = 1;

    public ihn(iml imlVar, acsw acswVar, shf shfVar) {
        this.g = imlVar;
        this.h = acswVar;
        this.b = shfVar;
    }

    public static int i(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (etx.ab(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            return 4;
        }
        return etx.ai(reelWatchEndpointOuterClass$ReelWatchEndpoint) ? 3 : 2;
    }

    public final Optional a() {
        return Optional.ofNullable(this.c);
    }

    public final void b() {
        synchronized (this.a) {
            acsx acsxVar = this.c;
            if (acsxVar != null) {
                iml imlVar = this.g;
                synchronized (imlVar.b) {
                    Iterator it = imlVar.b.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == acsxVar) {
                            it.remove();
                        }
                    }
                }
                this.c = null;
                this.i = null;
                this.f = 1;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.a) {
            acsx acsxVar = this.c;
            if (acsxVar != null) {
                acsxVar.c(str);
            }
        }
    }

    public final void d(String str, long j) {
        if (j > 0) {
            synchronized (this.a) {
                acsx acsxVar = this.c;
                if (acsxVar != null) {
                    acsxVar.d(str, j);
                }
            }
        }
    }

    public final void e(String str) {
        synchronized (this.a) {
            if (this.c != null && ammx.e(this.i) && str != null) {
                this.i = str;
            }
        }
    }

    public final void g(String str, long j) {
        synchronized (this.a) {
            if (this.c != null && h(str)) {
                if (j != 0) {
                    this.c.d("r_vtc", j);
                } else {
                    this.c.c("r_vtc");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        if (this.c == null) {
            return false;
        }
        String str2 = this.i;
        return str2 == null || str2.equals(str);
    }

    public final void j(int i, int i2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, acsx acsxVar, long j) {
        acsx acsxVar2;
        if (this.c != null) {
            synchronized (this.a) {
                acsx acsxVar3 = this.c;
                if (acsxVar3 != null && !this.e) {
                    acsxVar3.c("aa");
                    this.e = true;
                }
            }
            b();
        }
        long c = j == 0 ? this.b.c() : j;
        if (acsxVar == null) {
            acsxVar2 = this.h.d(asmn.LATENCY_ACTION_REEL_WATCH);
            acsxVar2.f(c);
        } else {
            acsxVar2 = acsxVar;
        }
        aone createBuilder = asmd.a.createBuilder();
        if (i == 1) {
            createBuilder.copyOnWrite();
            asmd asmdVar = (asmd) createBuilder.instance;
            asmdVar.d = 5;
            asmdVar.b |= 8;
        } else if (i == 2) {
            createBuilder.copyOnWrite();
            asmd asmdVar2 = (asmd) createBuilder.instance;
            asmdVar2.d = 4;
            asmdVar2.b |= 8;
        } else if (i == 3) {
            createBuilder.copyOnWrite();
            asmd asmdVar3 = (asmd) createBuilder.instance;
            asmdVar3.d = 10;
            asmdVar3.b |= 8;
        } else if (i == 4) {
            createBuilder.copyOnWrite();
            asmd asmdVar4 = (asmd) createBuilder.instance;
            asmdVar4.d = 9;
            asmdVar4.b |= 8;
        } else if (i == 5) {
            createBuilder.copyOnWrite();
            asmd asmdVar5 = (asmd) createBuilder.instance;
            asmdVar5.d = 2;
            asmdVar5.b |= 8;
        } else {
            createBuilder.copyOnWrite();
            asmd asmdVar6 = (asmd) createBuilder.instance;
            asmdVar6.d = 1;
            asmdVar6.b |= 8;
        }
        int bd = anaf.bd(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
        if (bd == 0) {
            bd = 1;
        }
        this.f = i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        aone createBuilder2 = asmi.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmi asmiVar = (asmi) createBuilder2.instance;
        asmiVar.c = i2 - 1;
        asmiVar.b |= 1;
        int i3 = this.f;
        createBuilder2.copyOnWrite();
        asmi asmiVar2 = (asmi) createBuilder2.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        asmiVar2.f = i4;
        asmiVar2.b |= 8;
        createBuilder2.copyOnWrite();
        asmi asmiVar3 = (asmi) createBuilder2.instance;
        asmiVar3.g = bd - 1;
        asmiVar3.b |= 16;
        createBuilder2.copyOnWrite();
        asmi asmiVar4 = (asmi) createBuilder2.instance;
        asmiVar4.d = 1;
        asmiVar4.b |= 2;
        createBuilder2.copyOnWrite();
        asmi asmiVar5 = (asmi) createBuilder2.instance;
        asmiVar5.e = 0;
        asmiVar5.b |= 4;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 33554432) != 0) {
            int be = anaf.be(reelWatchEndpointOuterClass$ReelWatchEndpoint.x);
            if (be == 0) {
                be = 1;
            }
            createBuilder2.copyOnWrite();
            asmi asmiVar6 = (asmi) createBuilder2.instance;
            asmiVar6.h = be - 1;
            asmiVar6.b |= 32;
        }
        aone createBuilder3 = asmb.a.createBuilder();
        createBuilder3.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder3.instance;
        asmi asmiVar7 = (asmi) createBuilder2.build();
        asmiVar7.getClass();
        asmbVar.y = asmiVar7;
        asmbVar.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        createBuilder3.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder3.instance;
        asmd asmdVar7 = (asmd) createBuilder.build();
        asmdVar7.getClass();
        asmbVar2.w = asmdVar7;
        asmbVar2.c |= 524288;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            long j2 = this.d;
            if (j2 > 0) {
                long j3 = c - j2;
                if (j3 < 2147483647L) {
                    createBuilder3.copyOnWrite();
                    asmb asmbVar3 = (asmb) createBuilder3.instance;
                    asmbVar3.b |= 8388608;
                    asmbVar3.o = (int) j3;
                }
            }
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 134217728) != 0) {
            aone createBuilder4 = asmh.a.createBuilder();
            String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.z;
            createBuilder4.copyOnWrite();
            asmh asmhVar = (asmh) createBuilder4.instance;
            str.getClass();
            asmhVar.b = 1 | asmhVar.b;
            asmhVar.c = str;
            createBuilder3.copyOnWrite();
            asmb asmbVar4 = (asmb) createBuilder3.instance;
            asmh asmhVar2 = (asmh) createBuilder4.build();
            asmhVar2.getClass();
            asmbVar4.A = asmhVar2;
            asmbVar4.d |= 128;
        }
        acsxVar2.a((asmb) createBuilder3.build());
        synchronized (this.a) {
            this.c = acsxVar2;
            this.e = false;
            this.d = c;
        }
    }

    public final void k(int i, int i2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, acsx acsxVar, long j) {
        j(i, i2, reelWatchEndpointOuterClass$ReelWatchEndpoint, acsxVar, j);
        e(reelWatchEndpointOuterClass$ReelWatchEndpoint.d);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            ahef ahefVar = (ahef) obj;
            synchronized (this.a) {
                if (this.c != null && !TextUtils.isEmpty(ahefVar.e())) {
                    aone createBuilder = asmb.a.createBuilder();
                    String e = ahefVar.e();
                    createBuilder.copyOnWrite();
                    asmb asmbVar = (asmb) createBuilder.instance;
                    e.getClass();
                    asmbVar.b |= 2048;
                    asmbVar.k = e;
                    this.c.a((asmb) createBuilder.build());
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
