package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import j$.util.function.Consumer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcu {
    public final afeo a;
    private final ysy d;
    private final afkg e;
    private final shf f;
    private final afkn g;
    private final adxl h;
    private final aenf i;
    private final afjv j;
    private final Context k;
    private final affa l;
    private final zbw m;
    private final aypn n;
    private PowerManager o;
    private PlayerConfigModel q;
    private Consumer s;
    private final afhs u;
    private final adyu v;
    public aesa b = aesa.a;
    public int c = -1;
    private long p = -9223372036854775807L;
    private aomf r = null;
    private final ayqw t = new ayqw();

    public afcu(ysy ysyVar, shf shfVar, afkn afknVar, afhs afhsVar, afkg afkgVar, adxl adxlVar, aenf aenfVar, adyu adyuVar, Context context, affa affaVar, zbw zbwVar, aypn aypnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = ysyVar;
        this.u = afhsVar;
        this.e = afkgVar;
        this.f = shfVar;
        this.g = afknVar;
        this.h = adxlVar;
        this.i = aenfVar;
        this.v = adyuVar;
        this.j = afhsVar.i;
        this.k = context;
        this.l = affaVar;
        this.m = zbwVar;
        this.a = new afeo(shfVar);
        this.n = aypnVar;
    }

    public static int k(int i) {
        if (i == 1) {
            return 11;
        }
        if (i != 2) {
            return i != 3 ? 1 : 31;
        }
        return 21;
    }

    private final aone l(PlayerConfigModel playerConfigModel) {
        aone createBuilder = ovg.a.createBuilder();
        aqjw f = this.d.f();
        createBuilder.copyOnWrite();
        ovg ovgVar = (ovg) createBuilder.instance;
        ovgVar.f = f.B;
        ovgVar.b |= 8;
        afkf g = this.e.g(2);
        long c = this.f.c();
        long j = g.e;
        if (j != -1) {
            int i = g.d;
            createBuilder.copyOnWrite();
            ovg ovgVar2 = (ovg) createBuilder.instance;
            ovgVar2.b = 2 | ovgVar2.b;
            ovgVar2.d = i;
            int i2 = g.b;
            createBuilder.copyOnWrite();
            ovg ovgVar3 = (ovg) createBuilder.instance;
            ovgVar3.b |= 4;
            ovgVar3.e = i2;
            createBuilder.copyOnWrite();
            ovg ovgVar4 = (ovg) createBuilder.instance;
            ovgVar4.b |= 1;
            ovgVar4.c = c - j;
        }
        afkm afkmVar = (afkm) this.g.get();
        int i3 = afkmVar.c;
        if (i3 > 0 && afkmVar.d > 0) {
            createBuilder.copyOnWrite();
            ovg ovgVar5 = (ovg) createBuilder.instance;
            ovgVar5.b |= 16;
            ovgVar5.g = i3;
            int i4 = afkmVar.d;
            createBuilder.copyOnWrite();
            ovg ovgVar6 = (ovg) createBuilder.instance;
            ovgVar6.b |= 32;
            ovgVar6.h = i4;
            boolean z = afkmVar.b;
            createBuilder.copyOnWrite();
            ovg ovgVar7 = (ovg) createBuilder.instance;
            ovgVar7.b |= 256;
            ovgVar7.k = z;
        }
        List V = playerConfigModel.V();
        if (!V.isEmpty() && V.contains(Integer.valueOf(this.d.a()))) {
            long K = playerConfigModel.K() / 8;
            if (K != -1) {
                createBuilder.copyOnWrite();
                ovg ovgVar8 = (ovg) createBuilder.instance;
                ovgVar8.b |= 64;
                ovgVar8.i = K;
                if (playerConfigModel.ag()) {
                    createBuilder.copyOnWrite();
                    ovg ovgVar9 = (ovg) createBuilder.instance;
                    ovgVar9.b |= 268435456;
                    ovgVar9.z = (int) K;
                }
            }
        }
        atwo a = this.h.a();
        if (a != atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN) {
            createBuilder.copyOnWrite();
            ovg ovgVar10 = (ovg) createBuilder.instance;
            ovgVar10.p = a.n;
            ovgVar10.b |= 8192;
        }
        aenk j2 = this.i.j();
        if (j2.c == 1) {
            long j3 = j2.b;
            createBuilder.copyOnWrite();
            ovg ovgVar11 = (ovg) createBuilder.instance;
            ovgVar11.b |= 512;
            ovgVar11.l = j3 / 8;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = (PowerManager) this.k.getSystemService("power");
            }
            PowerManager powerManager = this.o;
            if (powerManager != null) {
                boolean isPowerSaveMode = powerManager.isPowerSaveMode();
                createBuilder.copyOnWrite();
                ovg ovgVar12 = (ovg) createBuilder.instance;
                ovgVar12.b |= 65536;
                ovgVar12.s = isPowerSaveMode;
            }
            if (this.p != -9223372036854775807L) {
                long d = this.f.d() - this.p;
                createBuilder.copyOnWrite();
                ovg ovgVar13 = (ovg) createBuilder.instance;
                ovgVar13.b |= 32768;
                ovgVar13.r = d;
            }
        }
        if (this.u.r().s) {
            ovn ovnVar = (ovn) this.l.b().get();
            createBuilder.copyOnWrite();
            ovg ovgVar14 = (ovg) createBuilder.instance;
            ovnVar.getClass();
            ovgVar14.x = ovnVar;
            ovgVar14.b |= 8388608;
        }
        long a2 = this.m.a();
        if (a2 != -1) {
            createBuilder.copyOnWrite();
            ovg ovgVar15 = (ovg) createBuilder.instance;
            ovgVar15.b |= 16777216;
            ovgVar15.y = a2;
        }
        int i5 = this.c;
        createBuilder.copyOnWrite();
        ovg ovgVar16 = (ovg) createBuilder.instance;
        ovgVar16.b |= 524288;
        ovgVar16.u = i5;
        return createBuilder;
    }

    public final ovg a(PlayerConfigModel playerConfigModel, boolean z, long j, String str) {
        aone l = l(playerConfigModel);
        Long l2 = str == null ? null : (Long) this.a.b.c(str);
        if (l2 != null) {
            long d = this.f.d();
            long longValue = l2.longValue();
            l.copyOnWrite();
            ovg ovgVar = (ovg) l.instance;
            ovg ovgVar2 = ovg.a;
            ovgVar.b |= 2097152;
            ovgVar.v = d - longValue;
        }
        if (j != -9223372036854775807L) {
            l.copyOnWrite();
            ovg ovgVar3 = (ovg) l.instance;
            ovg ovgVar4 = ovg.a;
            ovgVar3.b |= 16384;
            ovgVar3.q = j;
        }
        if (z) {
            int i = this.e.g(2).b;
            l.copyOnWrite();
            ovg ovgVar5 = (ovg) l.instance;
            ovg ovgVar6 = ovg.a;
            ovgVar5.b |= 128;
            ovgVar5.j = i;
        }
        if (this.e.f()) {
            avzr b = this.e.b(str);
            l.copyOnWrite();
            ovg ovgVar7 = (ovg) l.instance;
            ovg ovgVar8 = ovg.a;
            ovgVar7.o = b.e;
            ovgVar7.b |= 4096;
        }
        return (ovg) l.build();
    }

    public final ovg b(PlayerConfigModel playerConfigModel, int i, int i2, boolean z, int i3, String str, ammv ammvVar) {
        aone l = l(playerConfigModel);
        if (ammvVar.h()) {
            afkm afkmVar = (afkm) ammvVar.c();
            int i4 = afkmVar.d;
            l.copyOnWrite();
            ovg ovgVar = (ovg) l.instance;
            ovg ovgVar2 = ovg.a;
            ovgVar.b |= 32;
            ovgVar.h = i4;
            int i5 = afkmVar.c;
            l.copyOnWrite();
            ovg ovgVar3 = (ovg) l.instance;
            ovgVar3.b |= 16;
            ovgVar3.g = i5;
            boolean z2 = afkmVar.b;
            l.copyOnWrite();
            ovg ovgVar4 = (ovg) l.instance;
            ovgVar4.b |= 256;
            ovgVar4.k = z2;
        }
        if (this.u.q().t) {
            l.copyOnWrite();
            ovg ovgVar5 = (ovg) l.instance;
            ovg ovgVar6 = ovg.a;
            ovgVar5.m = k(i) - 1;
            ovgVar5.b |= 1024;
            l.copyOnWrite();
            ovg ovgVar7 = (ovg) l.instance;
            ovgVar7.n = k(i2) - 1;
            ovgVar7.b |= 2048;
        }
        if (z) {
            l.copyOnWrite();
            ovg ovgVar8 = (ovg) l.instance;
            ovg ovgVar9 = ovg.a;
            ovgVar8.b |= 128;
            ovgVar8.j = i3;
        }
        if (this.e.f()) {
            avzr b = this.e.b(str);
            l.copyOnWrite();
            ovg ovgVar10 = (ovg) l.instance;
            ovg ovgVar11 = ovg.a;
            ovgVar10.o = b.e;
            ovgVar10.b |= 4096;
        }
        if (this.u.o().H) {
            this.v.bI();
            l.copyOnWrite();
            ovg ovgVar12 = (ovg) l.instance;
            ovg ovgVar13 = ovg.a;
            ovgVar12.b |= 4194304;
            ovgVar12.w = false;
        }
        if (this.u.o().f93J || this.u.o().G) {
            boolean i6 = this.j.a.i();
            boolean q = this.j.a.q();
            aqjw f = this.d.f();
            int i7 = 2;
            if (i6 && !q) {
                i7 = 3;
            }
            l.copyOnWrite();
            ovg ovgVar14 = (ovg) l.instance;
            int i8 = i7 - 1;
            ovg ovgVar15 = ovg.a;
            ovgVar14.t = i8;
            ovgVar14.b |= 131072;
            String name = f.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 40);
            sb.append("ncn.");
            sb.append(i6);
            sb.append(";ntu.");
            sb.append(q);
            sb.append(";nms.");
            sb.append(i8);
            sb.append(";dnt.");
            sb.append(name);
            this.b.f("nms", sb.toString());
        }
        return (ovg) l.build();
    }

    public final synchronized PlayerConfigModel c() {
        return this.q;
    }

    public final synchronized aomf d() {
        return this.r;
    }

    public final synchronized void e() {
        this.t.c();
        this.s = null;
    }

    public final synchronized void f() {
        this.p = this.f.d();
    }

    public final synchronized void g(Consumer consumer) {
        if (this.s == null) {
            this.t.d(this.n.n().X(new ayrs() { // from class: afct
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    afcu.this.j();
                }
            }));
        }
        this.s = consumer;
    }

    public final synchronized void h(aomf aomfVar) {
        this.r = aomfVar;
    }

    public final synchronized void i(PlayerConfigModel playerConfigModel) {
        this.q = playerConfigModel;
    }

    public final synchronized void j() {
        Consumer consumer = this.s;
        if (consumer != null) {
            consumer.accept(adup.ABR_STATE_CHANGE_NETWORK_CONNECTION_TYPE);
        }
    }
}
