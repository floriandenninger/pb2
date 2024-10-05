package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uac implements tzz {
    @Override // defpackage.tzz
    public final antc a(Context context) {
        antc antcVar;
        synchronized (antc.a) {
            antcVar = null;
            if (!antc.b.containsKey("[DEFAULT]")) {
                Resources resources = context.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                String am = qip.am("google_app_id", resources, resourcePackageName);
                antg antgVar = TextUtils.isEmpty(am) ? null : new antg(am, qip.am("google_api_key", resources, resourcePackageName), qip.am("firebase_database_url", resources, resourcePackageName), qip.am("ga_trackingId", resources, resourcePackageName), qip.am("gcm_defaultSenderId", resources, resourcePackageName), qip.am("google_storage_bucket", resources, resourcePackageName), qip.am("project_id", resources, resourcePackageName));
                if (antgVar == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    antcVar = antc.c(context, antgVar);
                }
            } else {
                antcVar = antc.b();
            }
        }
        return antcVar;
    }

    @Override // defpackage.tzz
    public final FirebaseInstanceId b(antc antcVar) {
        return FirebaseInstanceId.getInstance(antcVar);
    }

    @Override // defpackage.tzz
    public final antc c(Context context, antg antgVar) {
        String str;
        try {
            return antc.d(context, antgVar, "CHIME_ANDROID_SDK");
        } catch (IllegalStateException unused) {
            synchronized (antc.a) {
                antc antcVar = (antc) antc.b.get("CHIME_ANDROID_SDK");
                if (antcVar != null) {
                    return antcVar;
                }
                ArrayList arrayList = new ArrayList();
                synchronized (antc.a) {
                    Iterator it = antc.b.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((antc) it.next()).g());
                    }
                    Collections.sort(arrayList);
                    if (arrayList.isEmpty()) {
                        str = "";
                    } else {
                        String valueOf = String.valueOf(TextUtils.join(", ", arrayList));
                        str = valueOf.length() != 0 ? "Available app names: ".concat(valueOf) : new String("Available app names: ");
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                }
            }
        }
    }
}
