package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.apps.tiktok.account.AccountId;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amea {
    public final Map a;
    public final azrw b;

    public amea(azrw azrwVar, Map map) {
        this.b = azrwVar;
        this.a = map;
    }

    public amea(azrw azrwVar, byte[] bArr) {
        this.a = new HashMap();
        this.b = azrwVar;
    }

    private static String d(afsx afsxVar) {
        String b = afsxVar.b();
        return TextUtils.isEmpty(b) ? "default.entitystore" : b.concat(".entitystore");
    }

    public final Object a(AccountId accountId) {
        Object obj;
        synchronized (this.a) {
            if (!this.a.containsKey(accountId)) {
                this.a.put(accountId, new ehy(((efd) this.b.get()).a));
            }
            obj = this.a.get(accountId);
        }
        return obj;
    }

    public final synchronized vhj b(afsx afsxVar, vik vikVar) {
        final String d = d(afsxVar);
        vhj vhjVar = (vhj) this.a.get(d);
        if (vhjVar != null) {
            return vhjVar;
        }
        ajyw ajywVar = (ajyw) this.b.get();
        Context context = (Context) ajywVar.a.get();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ajywVar.b.get();
        scheduledExecutorService.getClass();
        aoae aoaeVar = (aoae) ajywVar.c.get();
        aoaeVar.getClass();
        vhj vhjVar2 = new vhj(new vid(context, scheduledExecutorService, aoaeVar, new anfy() { // from class: vhk
            @Override // defpackage.anfy
            public final anhy a() {
                return anaf.O(d);
            }
        }, vikVar, null, null));
        this.a.put(d, vhjVar2);
        return vhjVar2;
    }

    public final void c(Context context, afsx afsxVar) {
        String d = d(afsxVar);
        final aajg aajgVar = new aajg(d, 0);
        File parentFile = context.getDatabasePath("ignore").getParentFile();
        parentFile.getClass();
        parentFile.listFiles(new FileFilter() { // from class: aajf
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                if (!aajgVar.accept(file)) {
                    return false;
                }
                file.delete();
                return false;
            }
        });
        synchronized (this) {
            vhj vhjVar = (vhj) this.a.get(d);
            if (vhjVar != null) {
                vhjVar.a.onLowMemory();
            }
        }
    }

    public amea(azrw azrwVar) {
        this.a = new HashMap();
        this.b = azrwVar;
    }
}
