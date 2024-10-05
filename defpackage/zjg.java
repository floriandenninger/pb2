package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zjg extends Exception implements zfz {
    public zjg(String str) {
        super(str);
    }

    @Override // defpackage.zfz
    public zfl a(Context context) {
        return zfl.a(context, R.string.common_error_response, new Object[0]);
    }

    public zjg(Throwable th, byte[] bArr) {
        super("Failed to convert URI", th);
    }

    public zjg(Throwable th) {
        super(th);
    }
}
