package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uas implements uak {
    private final Context a;
    private final uaa b;

    public uas(Context context, uaa uaaVar) {
        this.a = context;
        this.b = uaaVar;
    }

    private static long d(Context context) {
        long j = -1;
        try {
            long h = rsb.h(context.getContentResolver(), -1L);
            if (h != -1) {
                return h;
            }
            try {
                tzk.b("TargetCreatorHelperImpl", "Failed to get android ID.", new Object[0]);
                return h;
            } catch (SecurityException e) {
                e = e;
                j = h;
                tzk.c("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new Object[0]);
                return j;
            }
        } catch (SecurityException e2) {
            e = e2;
        }
    }

    private static long e(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
    }

    @Override // defpackage.uak
    public final aoia a() {
        aone createBuilder = aoia.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aoia aoiaVar = (aoia) createBuilder.instance;
        packageName.getClass();
        aoiaVar.b |= 4;
        aoiaVar.e = packageName;
        aone createBuilder2 = aohj.a.createBuilder();
        String packageName2 = this.a.getApplicationContext().getPackageName();
        createBuilder2.copyOnWrite();
        aohj aohjVar = (aohj) createBuilder2.instance;
        packageName2.getClass();
        aohjVar.b |= 8;
        aohjVar.e = packageName2;
        String a = this.b.a();
        if (!TextUtils.isEmpty(a)) {
            createBuilder2.copyOnWrite();
            aohj aohjVar2 = (aohj) createBuilder2.instance;
            a.getClass();
            aohjVar2.b |= 1;
            aohjVar2.c = a;
        }
        long d = d(this.a);
        if (d != -1) {
            createBuilder2.copyOnWrite();
            aohj aohjVar3 = (aohj) createBuilder2.instance;
            aohjVar3.b |= 4;
            aohjVar3.d = d;
        }
        long e = e(this.a);
        if (e != -1) {
            createBuilder2.copyOnWrite();
            aohj aohjVar4 = (aohj) createBuilder2.instance;
            aohjVar4.b |= 16;
            aohjVar4.f = e;
        }
        aone createBuilder3 = aohz.a.createBuilder();
        createBuilder3.copyOnWrite();
        aohz aohzVar = (aohz) createBuilder3.instance;
        aohzVar.c = 3;
        aohzVar.b |= 1;
        aone createBuilder4 = aohf.a.createBuilder();
        aohj aohjVar5 = (aohj) createBuilder2.build();
        createBuilder4.copyOnWrite();
        aohf aohfVar = (aohf) createBuilder4.instance;
        aohjVar5.getClass();
        aohfVar.c = aohjVar5;
        aohfVar.b = 2;
        aohf aohfVar2 = (aohf) createBuilder4.build();
        createBuilder3.copyOnWrite();
        aohz aohzVar2 = (aohz) createBuilder3.instance;
        aohfVar2.getClass();
        aohzVar2.d = aohfVar2;
        aohzVar2.b = 2 | aohzVar2.b;
        aohz aohzVar3 = (aohz) createBuilder3.build();
        createBuilder.copyOnWrite();
        aoia aoiaVar2 = (aoia) createBuilder.instance;
        aohzVar3.getClass();
        aoiaVar2.d = aohzVar3;
        aoiaVar2.c = 1;
        return (aoia) createBuilder.build();
    }

    @Override // defpackage.uak
    public final aojt b() {
        aone createBuilder = aoip.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aoip aoipVar = (aoip) createBuilder.instance;
        packageName.getClass();
        aoipVar.b |= 8;
        aoipVar.e = packageName;
        String b = this.b.b();
        createBuilder.copyOnWrite();
        aoip aoipVar2 = (aoip) createBuilder.instance;
        b.getClass();
        aoipVar2.b |= 1;
        aoipVar2.c = b;
        long d = d(this.a);
        if (d != -1) {
            createBuilder.copyOnWrite();
            aoip aoipVar3 = (aoip) createBuilder.instance;
            aoipVar3.b |= 4;
            aoipVar3.d = d;
        }
        long e = e(this.a);
        if (e != -1) {
            createBuilder.copyOnWrite();
            aoip aoipVar4 = (aoip) createBuilder.instance;
            aoipVar4.b |= 16;
            aoipVar4.f = e;
        }
        aone createBuilder2 = aojt.a.createBuilder();
        createBuilder2.copyOnWrite();
        aojt aojtVar = (aojt) createBuilder2.instance;
        aojtVar.c = 3;
        aojtVar.b |= 1;
        aone createBuilder3 = aoim.a.createBuilder();
        aoip aoipVar5 = (aoip) createBuilder.build();
        createBuilder3.copyOnWrite();
        aoim aoimVar = (aoim) createBuilder3.instance;
        aoipVar5.getClass();
        aoimVar.c = aoipVar5;
        aoimVar.b = 1;
        aoim aoimVar2 = (aoim) createBuilder3.build();
        createBuilder2.copyOnWrite();
        aojt aojtVar2 = (aojt) createBuilder2.instance;
        aoimVar2.getClass();
        aojtVar2.d = aoimVar2;
        aojtVar2.b |= 2;
        return (aojt) createBuilder2.build();
    }

    @Override // defpackage.uak
    public final aoju c() {
        aone createBuilder = aoju.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aoju aojuVar = (aoju) createBuilder.instance;
        packageName.getClass();
        aojuVar.b |= 4;
        aojuVar.e = packageName;
        aojt b = b();
        createBuilder.copyOnWrite();
        aoju aojuVar2 = (aoju) createBuilder.instance;
        b.getClass();
        aojuVar2.d = b;
        aojuVar2.c = 1;
        return (aoju) createBuilder.build();
    }
}
