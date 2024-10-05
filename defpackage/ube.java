package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ube extends ubd {
    private final uah b;
    private final txa c;

    public ube(uah uahVar, txa txaVar) {
        this.b = uahVar;
        this.c = txaVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        uag a;
        aojl aojlVar;
        twe tweVar;
        aoio aoioVar;
        twh twhVar;
        String str;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1;
        List b = this.c.b(string, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            try {
                aojlVar = (aojl) ((aone) aojl.a.createBuilder().mergeFrom(((twz) it.next()).b)).build();
                tweVar = new twe();
                aoioVar = aojlVar.c;
                if (aoioVar == null) {
                    aoioVar = aoio.a;
                }
                twhVar = new twh();
                str = aoioVar.c;
            } catch (aoob e) {
                tzk.c("SetUserPreferenceHandler", e, "Failed to parse PreferenceEntry from ChimeTaskData", new Object[0]);
            }
            if (str != null) {
                twhVar.a = str;
                if (!aoioVar.d.isEmpty()) {
                    twhVar.b = aoioVar.d;
                }
                String str2 = twhVar.a;
                if (str2 == null) {
                    throw new IllegalStateException("Missing required properties: key");
                }
                tweVar.a = new twi(str2, twhVar.b);
                int g = aocz.g(aojlVar.d);
                if (g == 0) {
                    g = 1;
                }
                int i = g - 1;
                int i2 = 2;
                if (i == 1) {
                    i2 = 3;
                } else if (i != 2) {
                    i2 = 1;
                }
                tweVar.b = i2;
                twi twiVar = tweVar.a;
                if (twiVar != null) {
                    twg twgVar = new twg(twiVar, i2);
                    linkedHashMap.put(twgVar.a, twgVar);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (tweVar.a == null) {
                        sb.append(" preferenceKey");
                    }
                    if (tweVar.b == 0) {
                        sb.append(" preference");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (arrayList.isEmpty()) {
            uaf c = uag.c();
            c.c = new IllegalArgumentException("No preferences to set.");
            c.b(false);
            a = c.a();
        } else {
            uah uahVar = this.b;
            twf twfVar = new twf();
            twfVar.a = arrayList;
            List list = twfVar.a;
            if (list == null) {
                throw new IllegalStateException("Missing required properties: preferenceEntries");
            }
            a = uahVar.g(string, new twj(list), z, aokoVar);
        }
        if (!a.b() || !a.d) {
            this.c.d(string, b);
        }
        return a;
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "SetUserPrereferenceCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_SET_USER_PREFERENCE";
    }
}
