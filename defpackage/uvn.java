package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvn extends uvr {
    final /* synthetic */ uvo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvn(uvp uvpVar, String str, Object obj, boolean z, uvo uvoVar) {
        super(uvpVar, str, obj, z);
        this.a = uvoVar;
    }

    @Override // defpackage.uvr
    public final Object a(Object obj) {
        try {
            return this.a.a(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + str.length());
            sb.append("Invalid byte[] value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
