package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uvl extends uvr {
    public uvl(uvp uvpVar, String str, Double d) {
        super(uvpVar, str, d, true);
    }

    @Override // defpackage.uvr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
