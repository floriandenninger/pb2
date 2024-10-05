package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imr implements afwx {
    public final long a;
    public final shf b;
    public final Map c;
    public boolean d;
    private final String e;
    private final amnv f;
    private final haj g;
    private final ing h;
    private final Executor i;
    private final acsw j;
    private final aioc k;
    private final aeeo l;
    private final aaqz m;
    private final afsy n;
    private final aoae o;

    public imr(String str, long j, aoae aoaeVar, amnv amnvVar, shf shfVar, haj hajVar, ing ingVar, Executor executor, acsw acswVar, aioc aiocVar, aeeo aeeoVar, aaqz aaqzVar, afsy afsyVar, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = str;
        this.a = j;
        this.o = aoaeVar;
        this.f = amnvVar;
        this.b = shfVar;
        this.g = hajVar;
        this.h = ingVar;
        this.i = executor;
        this.j = acswVar;
        this.k = aiocVar;
        this.l = aeeoVar;
        this.m = aaqzVar;
        this.n = afsyVar;
        this.c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(long j, apxf apxfVar, ine ineVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2) {
        Object obj = this.f.get();
        imt imtVar = new imt(j, apxfVar, ineVar, i, i2, i3, z, z2, z3, obj != null && ((aujz) obj).r, this.e, j2, this.b, this.i, this.j, this.k, this.h, this.o, this.f, this.l, this.m, this.n, null, null, null, null);
        this.c.put(Integer.valueOf(i), imtVar);
        this.h.d(apxfVar, this.e, true, imu.e((aujz) this.f.get(), ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).d), false, imtVar);
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.d) {
            return;
        }
        aoae aoaeVar = this.o;
        String str = this.e;
        ArrayList J2 = aoaeVar.J();
        int size = J2.size();
        for (int i = 0; i < size; i++) {
            ((imv) J2.get(i)).bn(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        aujz aujzVar;
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        final ine ineVar = (ine) obj;
        if (this.d) {
            return;
        }
        arsd arsdVar = ineVar.a;
        Object obj2 = this.f.get();
        aujz aujzVar2 = (aujz) obj2;
        if (!imu.f(aujzVar2)) {
            aryr aryrVar = arsdVar.e;
            if (aryrVar == null) {
                aryrVar = aryr.a;
            }
            if ((aryrVar.c & 64) != 0) {
                aryr aryrVar2 = arsdVar.e;
                if (aryrVar2 == null) {
                    aryrVar2 = aryr.a;
                }
                if (aryrVar2.m.size() > 0 || (obj2 != null && aujzVar2.u)) {
                    aaqz aaqzVar = this.m;
                    afsx c = this.n.c();
                    aryr aryrVar3 = arsdVar.e;
                    if (aryrVar3 == null) {
                        aryrVar3 = aryr.a;
                    }
                    aqzg aqzgVar = aryrVar3.K;
                    if (aqzgVar == null) {
                        aqzgVar = aqzg.a;
                    }
                    aryr aryrVar4 = arsdVar.e;
                    if (aryrVar4 == null) {
                        aryrVar4 = aryr.a;
                    }
                    arnd arndVar = aryrVar4.d;
                    if (arndVar == null) {
                        arndVar = arnd.a;
                    }
                    aaqzVar.a(c, aqzgVar, arndVar);
                }
            }
        }
        aoae aoaeVar = this.o;
        long j = this.a;
        boolean z5 = ineVar.c;
        ArrayList J2 = aoaeVar.J();
        int size = J2.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((imv) J2.get(i6)).aU(j, arsdVar, z5);
        }
        boolean z6 = obj2 != null && aujzVar2.i;
        if (obj2 != null) {
            int i7 = aujzVar2.c;
            int i8 = aujzVar2.d;
            i = anaf.bj(aujzVar2.e);
            if (i == 0) {
                i = 1;
            }
            z = aujzVar2.h;
            i4 = i7;
            i2 = i8;
            i3 = aujzVar2.n ? 1 : 0;
        } else {
            i = 4;
            z = false;
            i2 = 5;
            i3 = 0;
            i4 = 3;
        }
        int i9 = i - 1;
        int i10 = (i9 == 2 || i9 == 3) ? 1 : 0;
        final long d = this.b.d();
        if (i2 <= 0 || (arsdVar.b & 8) == 0) {
            aujzVar = aujzVar2;
            z2 = z6;
        } else {
            long j2 = this.a;
            apxf apxfVar = arsdVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            apxf apxfVar2 = apxfVar;
            if (z) {
                aujq b = aujq.b(arsdVar.j);
                if (b == null) {
                    b = aujq.REEL_LOOP_BEHAVIOR_UNKNOWN;
                }
                if (b != aujq.REEL_LOOP_BEHAVIOR_REPEAT) {
                    z4 = true;
                    aujzVar = aujzVar2;
                    z2 = z6;
                    d(j2, apxfVar2, ineVar, 0, i2, i10, z4, false, z6, d);
                }
            }
            z4 = false;
            aujzVar = aujzVar2;
            z2 = z6;
            d(j2, apxfVar2, ineVar, 0, i2, i10, z4, false, z6, d);
        }
        if (i4 > 0 && (arsdVar.b & 16) != 0) {
            long j3 = this.a;
            apxf apxfVar3 = arsdVar.g;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            d(j3, apxfVar3, ineVar, 1, i4, 0, false, false, z2, d);
        }
        if (obj2 != null && aujzVar.D) {
            int i11 = ((arsdVar.b & 8) != 0 ? 1 : 0) ^ 1;
            imu.d(this.g, this.a, 2, new imp(this, ineVar, i11 & i10, i11 & i3, z2));
            imu.d(this.g, this.a, 3, new imq(this, ineVar, z2));
            return;
        }
        boolean z7 = z2;
        Optional b2 = imu.b(this.g, this.a, 2);
        if (b2.isPresent()) {
            int i12 = ((arsdVar.b & 8) != 0 ? 1 : 0) ^ 1;
            boolean z8 = i12 & i3;
            z3 = z7;
            i5 = 3;
            d(this.a, (apxf) b2.get(), ineVar, 2, 1, i12 & i10, z8, z8, z7, d);
        } else {
            z3 = z7;
            i5 = 3;
        }
        final boolean z9 = z3;
        imu.b(this.g, this.a, i5).ifPresent(new Consumer() { // from class: imo
            @Override // j$.util.function.Consumer
            public final void accept(Object obj3) {
                imr imrVar = imr.this;
                ine ineVar2 = ineVar;
                boolean z10 = z9;
                long j4 = d;
                imrVar.d(imrVar.a, (apxf) obj3, ineVar2, 3, 1, 0, false, false, z10, j4);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
