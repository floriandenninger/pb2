package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uap implements uaj {
    private static final amsx a = amsx.s(aoic.SHOWN, aoic.SHOWN_FORCED);
    private final Context b;
    private final twn c;
    private final ubo d;
    private final yfl e;
    private final aloh f;

    static {
        amsx.v(aoic.ACTION_CLICK, aoic.CLICKED, aoic.DISMISSED, aoic.SHOWN, aoic.SHOWN_FORCED);
    }

    public uap(Context context, twn twnVar, ubo uboVar, yfl yflVar, aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = context;
        this.c = twnVar;
        this.d = uboVar;
        this.e = yflVar;
        this.f = alohVar;
    }

    private final String c() {
        try {
            String str = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName;
            return !TextUtils.isEmpty(str) ? str : "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            tzk.c("RenderContextHelperImpl", e, "Failed to get app version.", new Object[0]);
            return "unknown";
        }
    }

    private final String d() {
        try {
            return rsb.c(this.b.getContentResolver(), "device_country");
        } catch (SecurityException e) {
            tzk.c("RenderContextHelperImpl", e, "Exception reading GServices 'device_country' key.", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.uaj
    public final aoht a(aoic aoicVar) {
        aone createBuilder = aohs.a.createBuilder();
        float f = this.b.getResources().getDisplayMetrics().density;
        createBuilder.copyOnWrite();
        aohs aohsVar = (aohs) createBuilder.instance;
        aohsVar.b |= 1;
        aohsVar.c = f;
        String c = c();
        createBuilder.copyOnWrite();
        aohs aohsVar2 = (aohs) createBuilder.instance;
        c.getClass();
        aohsVar2.b |= 8;
        aohsVar2.f = c;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        aohs aohsVar3 = (aohs) createBuilder.instance;
        aohsVar3.b |= 128;
        aohsVar3.j = i;
        createBuilder.copyOnWrite();
        aohs aohsVar4 = (aohs) createBuilder.instance;
        int i2 = 3;
        aohsVar4.d = 3;
        aohsVar4.b |= 2;
        String num = Integer.toString(397934269);
        createBuilder.copyOnWrite();
        aohs aohsVar5 = (aohs) createBuilder.instance;
        num.getClass();
        aohsVar5.b |= 4;
        aohsVar5.e = num;
        int i3 = (this.b.getResources().getConfiguration().uiMode & 48) == 32 ? 3 : 2;
        createBuilder.copyOnWrite();
        aohs aohsVar6 = (aohs) createBuilder.instance;
        aohsVar6.q = i3 - 1;
        aohsVar6.b |= 8192;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            createBuilder.copyOnWrite();
            aohs aohsVar7 = (aohs) createBuilder.instance;
            str.getClass();
            aohsVar7.b |= 16;
            aohsVar7.g = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            createBuilder.copyOnWrite();
            aohs aohsVar8 = (aohs) createBuilder.instance;
            str2.getClass();
            aohsVar8.b = 32 | aohsVar8.b;
            aohsVar8.h = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            createBuilder.copyOnWrite();
            aohs aohsVar9 = (aohs) createBuilder.instance;
            str3.getClass();
            aohsVar9.b |= 64;
            aohsVar9.i = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            createBuilder.copyOnWrite();
            aohs aohsVar10 = (aohs) createBuilder.instance;
            str4.getClass();
            aohsVar10.b |= 256;
            aohsVar10.k = str4;
        }
        Iterator it = this.d.c().iterator();
        while (it.hasNext()) {
            aogz a2 = ((ubl) it.next()).a();
            createBuilder.copyOnWrite();
            aohs aohsVar11 = (aohs) createBuilder.instance;
            a2.getClass();
            aony aonyVar = aohsVar11.l;
            if (!aonyVar.c()) {
                aohsVar11.l = aonm.mutableCopy(aonyVar);
            }
            aohsVar11.l.add(a2);
        }
        Iterator it2 = this.d.b().iterator();
        while (it2.hasNext()) {
            aogy a3 = ((ubn) it2.next()).a();
            createBuilder.copyOnWrite();
            aohs aohsVar12 = (aohs) createBuilder.instance;
            a3.getClass();
            aony aonyVar2 = aohsVar12.m;
            if (!aonyVar2.c()) {
                aohsVar12.m = aonm.mutableCopy(aonyVar2);
            }
            aohsVar12.m.add(a3);
        }
        int i4 = true != eg.a(this.b).g() ? 3 : 2;
        createBuilder.copyOnWrite();
        aohs aohsVar13 = (aohs) createBuilder.instance;
        aohsVar13.n = i4 - 1;
        aohsVar13.b |= 1024;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            aohs aohsVar14 = (aohs) createBuilder.instance;
            d.getClass();
            aohsVar14.b |= 2048;
            aohsVar14.o = d;
        }
        aone createBuilder2 = aohr.a.createBuilder();
        if (a.contains(aoicVar)) {
            ammv j = this.f.j();
            if (j.h()) {
                int ordinal = ((uai) j.c()).ordinal();
                if (ordinal == 0) {
                    i2 = 2;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 4;
                    } else {
                        if (ordinal != 3) {
                            throw new AssertionError("Invalid enum value.");
                        }
                        i2 = 5;
                    }
                }
                createBuilder2.copyOnWrite();
                aohr aohrVar = (aohr) createBuilder2.instance;
                aohrVar.c = i2 - 1;
                aohrVar.b |= 8;
            }
        }
        aohr aohrVar2 = (aohr) createBuilder2.build();
        createBuilder.copyOnWrite();
        aohs aohsVar15 = (aohs) createBuilder.instance;
        aohrVar2.getClass();
        aohsVar15.p = aohrVar2;
        aohsVar15.b |= 4096;
        aone createBuilder3 = aoht.a.createBuilder();
        String e = e();
        createBuilder3.copyOnWrite();
        aoht aohtVar = (aoht) createBuilder3.instance;
        e.getClass();
        aohtVar.b |= 1;
        aohtVar.e = e;
        String id = TimeZone.getDefault().getID();
        createBuilder3.copyOnWrite();
        aoht aohtVar2 = (aoht) createBuilder3.instance;
        id.getClass();
        aohtVar2.c = 4;
        aohtVar2.d = id;
        createBuilder3.copyOnWrite();
        aoht aohtVar3 = (aoht) createBuilder3.instance;
        aohs aohsVar16 = (aohs) createBuilder.build();
        aohsVar16.getClass();
        aohtVar3.f = aohsVar16;
        aohtVar3.b |= 8;
        return (aoht) createBuilder3.build();
    }

    @Override // defpackage.uaj
    public final aojr b() {
        aokk aokkVar;
        aone createBuilder = aojq.a.createBuilder();
        float f = this.b.getResources().getDisplayMetrics().density;
        createBuilder.copyOnWrite();
        aojq aojqVar = (aojq) createBuilder.instance;
        aojqVar.b |= 1;
        aojqVar.c = f;
        String c = c();
        createBuilder.copyOnWrite();
        aojq aojqVar2 = (aojq) createBuilder.instance;
        c.getClass();
        aojqVar2.b |= 8;
        aojqVar2.f = c;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        aojq aojqVar3 = (aojq) createBuilder.instance;
        aojqVar3.b |= 128;
        aojqVar3.j = i;
        String str = this.c.e;
        createBuilder.copyOnWrite();
        aojq aojqVar4 = (aojq) createBuilder.instance;
        str.getClass();
        aojqVar4.b |= 512;
        aojqVar4.l = str;
        createBuilder.copyOnWrite();
        aojq aojqVar5 = (aojq) createBuilder.instance;
        aojqVar5.d = 3;
        aojqVar5.b |= 2;
        String num = Integer.toString(397934269);
        createBuilder.copyOnWrite();
        aojq aojqVar6 = (aojq) createBuilder.instance;
        num.getClass();
        aojqVar6.b |= 4;
        aojqVar6.e = num;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str2 = Build.VERSION.RELEASE;
            createBuilder.copyOnWrite();
            aojq aojqVar7 = (aojq) createBuilder.instance;
            str2.getClass();
            aojqVar7.b |= 16;
            aojqVar7.g = str2;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str3 = Build.ID;
            createBuilder.copyOnWrite();
            aojq aojqVar8 = (aojq) createBuilder.instance;
            str3.getClass();
            aojqVar8.b |= 32;
            aojqVar8.h = str3;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str4 = Build.MODEL;
            createBuilder.copyOnWrite();
            aojq aojqVar9 = (aojq) createBuilder.instance;
            str4.getClass();
            aojqVar9.b |= 64;
            aojqVar9.i = str4;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str5 = Build.MANUFACTURER;
            createBuilder.copyOnWrite();
            aojq aojqVar10 = (aojq) createBuilder.instance;
            str5.getClass();
            aojqVar10.b |= 256;
            aojqVar10.k = str5;
        }
        for (ubl ublVar : this.d.c()) {
            aone createBuilder2 = aojo.a.createBuilder();
            String str6 = ublVar.a;
            createBuilder2.copyOnWrite();
            aojo aojoVar = (aojo) createBuilder2.instance;
            str6.getClass();
            aojoVar.b |= 1;
            aojoVar.c = str6;
            int i2 = ublVar.c;
            int i3 = i2 - 1;
            uai uaiVar = uai.FILTER_ALL;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 1 : 2 : 5 : 4 : 3;
            createBuilder2.copyOnWrite();
            aojo aojoVar2 = (aojo) createBuilder2.instance;
            aojoVar2.e = i4 - 1;
            aojoVar2.b |= 4;
            if (!TextUtils.isEmpty(ublVar.b)) {
                String str7 = ublVar.b;
                createBuilder2.copyOnWrite();
                aojo aojoVar3 = (aojo) createBuilder2.instance;
                str7.getClass();
                aojoVar3.b |= 2;
                aojoVar3.d = str7;
            }
            aojo aojoVar4 = (aojo) createBuilder2.build();
            createBuilder.copyOnWrite();
            aojq aojqVar11 = (aojq) createBuilder.instance;
            aojoVar4.getClass();
            aony aonyVar = aojqVar11.m;
            if (!aonyVar.c()) {
                aojqVar11.m = aonm.mutableCopy(aonyVar);
            }
            aojqVar11.m.add(aojoVar4);
        }
        for (ubn ubnVar : this.d.b()) {
            aone createBuilder3 = aojp.a.createBuilder();
            String str8 = ubnVar.a;
            createBuilder3.copyOnWrite();
            aojp aojpVar = (aojp) createBuilder3.instance;
            str8.getClass();
            aojpVar.b |= 1;
            aojpVar.c = str8;
            int i5 = true != ubnVar.b ? 2 : 3;
            createBuilder3.copyOnWrite();
            aojp aojpVar2 = (aojp) createBuilder3.instance;
            aojpVar2.d = i5 - 1;
            aojpVar2.b |= 2;
            aojp aojpVar3 = (aojp) createBuilder3.build();
            createBuilder.copyOnWrite();
            aojq aojqVar12 = (aojq) createBuilder.instance;
            aojpVar3.getClass();
            aony aonyVar2 = aojqVar12.n;
            if (!aonyVar2.c()) {
                aojqVar12.n = aonm.mutableCopy(aonyVar2);
            }
            aojqVar12.n.add(aojpVar3);
        }
        int i6 = true == eg.a(this.b).g() ? 2 : 3;
        createBuilder.copyOnWrite();
        aojq aojqVar13 = (aojq) createBuilder.instance;
        aojqVar13.o = i6 - 1;
        aojqVar13.b |= 1024;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            aojq aojqVar14 = (aojq) createBuilder.instance;
            d.getClass();
            aojqVar14.b |= 2048;
            aojqVar14.p = d;
        }
        Set set = (Set) ((axqs) this.e.b).a;
        if (set.isEmpty()) {
            aokkVar = aokk.a;
        } else {
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((aogw) it.next()).f));
            }
            aone createBuilder4 = aokk.a.createBuilder();
            Iterator it2 = arrayList.iterator();
            int i7 = 1;
            while (it2.hasNext()) {
                i7 = Math.max((((Integer) it2.next()).intValue() / 64) + 1, i7);
            }
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(Collections.nCopies(i7, 0L));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                int intValue = ((Integer) it3.next()).intValue();
                int i8 = intValue / 64;
                arrayList2.set(i8, Long.valueOf((1 << (intValue % 64)) | ((Long) arrayList2.get(i8)).longValue()));
            }
            createBuilder4.copyOnWrite();
            aokk aokkVar2 = (aokk) createBuilder4.instance;
            aonx aonxVar = aokkVar2.b;
            if (!aonxVar.c()) {
                aokkVar2.b = aonm.mutableCopy(aonxVar);
            }
            aolo.addAll((Iterable) arrayList2, (List) aokkVar2.b);
            aokkVar = (aokk) createBuilder4.build();
        }
        createBuilder.copyOnWrite();
        aojq aojqVar15 = (aojq) createBuilder.instance;
        aokkVar.getClass();
        aojqVar15.q = aokkVar;
        aojqVar15.b |= 4096;
        yfl yflVar = this.e;
        aone createBuilder5 = aokq.a.createBuilder();
        if (axsg.f()) {
            aone createBuilder6 = aokp.a.createBuilder();
            createBuilder6.copyOnWrite();
            aokp aokpVar = (aokp) createBuilder6.instance;
            aokpVar.b = 2 | aokpVar.b;
            aokpVar.d = true;
            createBuilder5.copyOnWrite();
            aokq aokqVar = (aokq) createBuilder5.instance;
            aokp aokpVar2 = (aokp) createBuilder6.build();
            aokpVar2.getClass();
            aokqVar.c = aokpVar2;
            aokqVar.b |= 1;
        }
        Iterator it4 = ((Set) yflVar.a.get()).iterator();
        while (it4.hasNext()) {
            createBuilder5.mergeFrom((aonm) it4.next());
        }
        aokq aokqVar2 = (aokq) createBuilder5.build();
        createBuilder.copyOnWrite();
        aojq aojqVar16 = (aojq) createBuilder.instance;
        aokqVar2.getClass();
        aojqVar16.r = aokqVar2;
        aojqVar16.b |= 8192;
        aone createBuilder7 = aojr.a.createBuilder();
        String e = e();
        createBuilder7.copyOnWrite();
        aojr aojrVar = (aojr) createBuilder7.instance;
        e.getClass();
        aojrVar.b = 1 | aojrVar.b;
        aojrVar.c = e;
        String id = TimeZone.getDefault().getID();
        createBuilder7.copyOnWrite();
        aojr aojrVar2 = (aojr) createBuilder7.instance;
        id.getClass();
        aojrVar2.b |= 8;
        aojrVar2.d = id;
        aojq aojqVar17 = (aojq) createBuilder.build();
        createBuilder7.copyOnWrite();
        aojr aojrVar3 = (aojr) createBuilder7.instance;
        aojqVar17.getClass();
        aojrVar3.e = aojqVar17;
        aojrVar3.b |= 32;
        return (aojr) createBuilder7.build();
    }

    private final String e() {
        return tyo.l() ? this.b.getResources().getConfiguration().getLocales().get(0).toLanguageTag() : this.b.getResources().getConfiguration().locale.toLanguageTag();
    }
}
