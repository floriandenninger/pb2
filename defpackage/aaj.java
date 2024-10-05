package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import defpackage.aah;
import defpackage.aaj;
import defpackage.aod;
import defpackage.aok;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaj {
    final /* synthetic */ zv h;
    public Random a = new Random();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    private final Map i = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient Map e = new HashMap();
    public final Map f = new HashMap();
    public final Bundle g = new Bundle();

    public aaj(zv zvVar) {
        this.h = zvVar;
    }

    private final void g(String str) {
        if (((Integer) this.c.get(str)) != null) {
            return;
        }
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.b.containsKey(Integer.valueOf(i))) {
                nextInt = this.a.nextInt(2147418112);
            } else {
                c(i, str);
                return;
            }
        }
    }

    public final aae a(String str, aam aamVar, aac aacVar) {
        g(str);
        this.e.put(str, new aah(aacVar, aamVar));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            aacVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.g.getParcelable(str);
        if (activityResult != null) {
            this.g.remove(str);
            aacVar.a(aamVar.b(activityResult.a, activityResult.b));
        }
        return new aag(this, str, aamVar);
    }

    public final aae b(final String str, aok aokVar, final aam aamVar, final aac aacVar) {
        aof lifecycle = aokVar.getLifecycle();
        if (lifecycle.a().a(aoe.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + aokVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        aai aaiVar = (aai) this.i.get(str);
        if (aaiVar == null) {
            aaiVar = new aai(lifecycle);
        }
        aoi aoiVar = new aoi() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // defpackage.aoi
            public final void a(aok aokVar2, aod aodVar) {
                if (aod.ON_START.equals(aodVar)) {
                    aaj.this.e.put(str, new aah(aacVar, aamVar));
                    if (aaj.this.f.containsKey(str)) {
                        Object obj = aaj.this.f.get(str);
                        aaj.this.f.remove(str);
                        aacVar.a(obj);
                    }
                    ActivityResult activityResult = (ActivityResult) aaj.this.g.getParcelable(str);
                    if (activityResult != null) {
                        aaj.this.g.remove(str);
                        aacVar.a(aamVar.b(activityResult.a, activityResult.b));
                        return;
                    }
                    return;
                }
                if (aod.ON_STOP.equals(aodVar)) {
                    aaj.this.e.remove(str);
                } else if (aod.ON_DESTROY.equals(aodVar)) {
                    aaj.this.d(str);
                }
            }
        };
        aaiVar.a.b(aoiVar);
        aaiVar.b.add(aoiVar);
        this.i.put(str, aaiVar);
        return new aaf(this, str, aamVar);
    }

    public final void c(int i, String str) {
        Map map = this.b;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.c.put(str, valueOf);
    }

    public final void d(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.getParcelable(str));
            this.g.remove(str);
        }
        aai aaiVar = (aai) this.i.get(str);
        if (aaiVar != null) {
            ArrayList arrayList = aaiVar.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aaiVar.a.c((aoi) arrayList.get(i));
            }
            aaiVar.b.clear();
            this.i.remove(str);
        }
    }

    public final boolean e(int i, int i2, Intent intent) {
        aac aacVar;
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.d.remove(str);
        aah aahVar = (aah) this.e.get(str);
        if (aahVar == null || (aacVar = aahVar.a) == null) {
            this.f.remove(str);
            this.g.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        aacVar.a(aahVar.b.b(i2, intent));
        return true;
    }

    public final void f(int i, aam aamVar, Object obj) {
        Bundle bundle;
        zv zvVar = this.h;
        clu c = aamVar.c(zvVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new zs(this, i, c, null));
            return;
        }
        Intent a = aamVar.a(zvVar, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(zvVar.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            aih.i(zvVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            zvVar.startActivityForResult(a, i, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            zvVar.startIntentSenderForResult(intentSenderRequest.a, i, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new zt(this, i, e));
        }
    }

    public aaj() {
    }
}
