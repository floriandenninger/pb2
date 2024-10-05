package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uvk extends uvr {
    public uvk(uvp uvpVar, String str, Boolean bool) {
        super(uvpVar, str, bool, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uvr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (rsb.c.matcher(obj).matches()) {
            return true;
        }
        if (!rsb.d.matcher(obj).matches()) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 28 + str.length());
            sb.append("Invalid boolean value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
        return false;
    }
}
