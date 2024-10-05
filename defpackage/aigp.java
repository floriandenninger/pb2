package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigp extends aifx {
    public static final apxf f(String str, String str2, int i, float f) {
        return (apxf) m(str, str2, i, f, null, null).build();
    }

    public static final int g(awdp awdpVar) {
        return ahbx.e(awdpVar.f, awdpVar.e);
    }

    public static final aong m(String str, String str2, int i, float f, String str3, String str4) {
        aone createBuilder = awdp.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            awdp awdpVar = (awdp) createBuilder.instance;
            str.getClass();
            awdpVar.b |= 1;
            awdpVar.d = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            awdp awdpVar2 = (awdp) createBuilder.instance;
            str2.getClass();
            awdpVar2.b |= 2;
            awdpVar2.e = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            createBuilder.copyOnWrite();
            awdp awdpVar3 = (awdp) createBuilder.instance;
            str3.getClass();
            awdpVar3.b |= 512;
            awdpVar3.l = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            createBuilder.copyOnWrite();
            awdp awdpVar4 = (awdp) createBuilder.instance;
            str4.getClass();
            awdpVar4.b |= 16;
            awdpVar4.g = str4;
        }
        createBuilder.copyOnWrite();
        awdp awdpVar5 = (awdp) createBuilder.instance;
        awdpVar5.b |= 4;
        awdpVar5.f = i;
        createBuilder.copyOnWrite();
        awdp awdpVar6 = (awdp) createBuilder.instance;
        awdpVar6.b |= 128;
        awdpVar6.j = f;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) createBuilder.build());
        return aongVar;
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ owi a(Object obj) {
        awdp awdpVar = (awdp) obj;
        aone createBuilder = owi.a.createBuilder();
        String str = awdpVar.d;
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        str.getClass();
        owiVar.b |= 1;
        owiVar.c = str;
        String str2 = awdpVar.e;
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        str2.getClass();
        owiVar2.b |= 2;
        owiVar2.e = str2;
        int g = g(awdpVar);
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 4;
        owiVar3.f = g;
        String str3 = awdpVar.g;
        createBuilder.copyOnWrite();
        owi owiVar4 = (owi) createBuilder.instance;
        str3.getClass();
        owiVar4.b |= 8;
        owiVar4.g = str3;
        String str4 = awdpVar.l;
        createBuilder.copyOnWrite();
        owi owiVar5 = (owi) createBuilder.instance;
        str4.getClass();
        owiVar5.b |= 512;
        owiVar5.m = str4;
        boolean z = awdpVar.h;
        createBuilder.copyOnWrite();
        owi owiVar6 = (owi) createBuilder.instance;
        owiVar6.b |= 64;
        owiVar6.j = z;
        boolean z2 = awdpVar.i;
        createBuilder.copyOnWrite();
        owi owiVar7 = (owi) createBuilder.instance;
        owiVar7.b |= 128;
        owiVar7.k = z2;
        createBuilder.copyOnWrite();
        owi owiVar8 = (owi) createBuilder.instance;
        owiVar8.b |= 32;
        owiVar8.i = false;
        long millis = TimeUnit.SECONDS.toMillis(awdpVar.j);
        createBuilder.copyOnWrite();
        owi owiVar9 = (owi) createBuilder.instance;
        owiVar9.b |= 256;
        owiVar9.l = millis;
        if ((awdpVar.b & 16384) != 0) {
            atsn atsnVar = awdpVar.o;
            if (atsnVar == null) {
                atsnVar = atsn.a;
            }
            if ((atsnVar.b & 2) != 0) {
                atsn atsnVar2 = awdpVar.o;
                if (atsnVar2 == null) {
                    atsnVar2 = atsn.a;
                }
                atsl atslVar = atsnVar2.d;
                if (atslVar == null) {
                    atslVar = atsl.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar10 = (owi) createBuilder.instance;
                atslVar.getClass();
                owiVar10.s = atslVar;
                owiVar10.b |= 262144;
            }
            atsn atsnVar3 = awdpVar.o;
            if (atsnVar3 == null) {
                atsnVar3 = atsn.a;
            }
            if ((atsnVar3.b & 1) != 0) {
                atsn atsnVar4 = awdpVar.o;
                if (atsnVar4 == null) {
                    atsnVar4 = atsn.a;
                }
                atsk atskVar = atsnVar4.c;
                if (atskVar == null) {
                    atskVar = atsk.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar11 = (owi) createBuilder.instance;
                atskVar.getClass();
                owiVar11.r = atskVar;
                owiVar11.b |= 65536;
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(awdpVar.r).entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) entry.getValue();
            str5.getClass();
            str6.getClass();
            createBuilder.copyOnWrite();
            owi owiVar12 = (owi) createBuilder.instance;
            aoot aootVar = owiVar12.x;
            if (!aootVar.b) {
                owiVar12.x = aootVar.a();
            }
            owiVar12.x.put(str5, str6);
        }
        int i = awdpVar.b;
        if ((i & 67108864) != 0) {
            int bS = anaf.bS(awdpVar.u);
            int i2 = bS != 0 ? bS : 1;
            createBuilder.copyOnWrite();
            owi owiVar13 = (owi) createBuilder.instance;
            owiVar13.y = i2 - 1;
            owiVar13.b = 67108864 | owiVar13.b;
        } else if ((i & 16777216) != 0 && awdpVar.s) {
            createBuilder.copyOnWrite();
            owi owiVar14 = (owi) createBuilder.instance;
            owiVar14.y = 2;
            owiVar14.b = 67108864 | owiVar14.b;
        }
        if ((awdpVar.b & 536870912) != 0) {
            awdk awdkVar = awdpVar.w;
            if (awdkVar == null) {
                awdkVar = awdk.a;
            }
            createBuilder.copyOnWrite();
            owi owiVar15 = (owi) createBuilder.instance;
            awdkVar.getClass();
            owiVar15.A = awdkVar;
            owiVar15.b |= 268435456;
        }
        if ((awdpVar.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            aomf aomfVar = awdpVar.x;
            createBuilder.copyOnWrite();
            owi owiVar16 = (owi) createBuilder.instance;
            aomfVar.getClass();
            owiVar16.b = 536870912 | owiVar16.b;
            owiVar16.B = aomfVar;
        }
        return (owi) createBuilder.build();
    }

    @Override // defpackage.aiga
    public final aomu b() {
        return WatchEndpointOuterClass.watchEndpoint;
    }

    @Override // defpackage.aifx
    public final /* synthetic */ String c(Object obj) {
        return ((awdp) obj).e;
    }

    @Override // defpackage.aifx
    public final /* synthetic */ String d(Object obj) {
        return ((awdp) obj).d;
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        awdp awdpVar = (awdp) obj;
        awdp awdpVar2 = (awdp) obj2;
        if (amkq.b(awdpVar, awdpVar2)) {
            return true;
        }
        String str = awdpVar.e;
        int g = g(awdpVar);
        String str2 = awdpVar2.e;
        int g2 = g(awdpVar2);
        if (!TextUtils.equals(str, str2)) {
            return false;
        }
        if (TextUtils.equals("", str) || Math.abs(g - g2) <= 1) {
            return TextUtils.equals(awdpVar.d, awdpVar2.d);
        }
        return false;
    }
}
