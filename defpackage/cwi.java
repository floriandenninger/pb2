package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwi implements cvz {
    private final cvz a;
    private final Resources b;

    public cwi(Resources resources, cvz cvzVar) {
        this.b = resources;
        this.a = cvzVar;
    }

    private final Uri c(Integer num) {
        try {
            String resourcePackageName = this.b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.b.getResourceEntryName(num.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(valueOf);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri c = c((Integer) obj);
        if (c == null) {
            return null;
        }
        return this.a.a(c, i, i2, cqnVar);
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
