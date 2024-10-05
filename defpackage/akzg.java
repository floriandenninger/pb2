package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzg {
    public final Context a;
    public Bitmap b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] g = null;
    public int f = -1;

    public akzg(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(dy dyVar, int i) {
        boolean z;
        String str;
        String string = this.a.getResources().getString(R.string.upload_notification_uploading_paused);
        if (TextUtils.equals(string, this.c)) {
            z = false;
        } else {
            this.c = string;
            dyVar.k(string);
            z = true;
        }
        if (i != 0) {
            str = this.a.getResources().getString(i == 1 ? R.string.upload_notification_waiting_wifi : R.string.upload_notification_waiting_network);
        } else {
            str = "";
        }
        if (!TextUtils.equals(str, this.d)) {
            this.d = str;
            dyVar.j(str);
            z = true;
        }
        if (this.f != -2) {
            this.f = -2;
            dyVar.q(0, 0, true);
            z = true;
        }
        if (TextUtils.equals(this.e, "")) {
            return z;
        }
        this.e = "";
        dyVar.i("");
        return true;
    }
}
