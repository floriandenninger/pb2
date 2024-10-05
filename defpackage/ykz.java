package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykz {
    public final Activity a;
    public final ykk b;

    public ykz(Activity activity, ykk ykkVar) {
        this.a = activity;
        this.b = ykkVar;
    }

    public final boolean a(Intent intent, int i, ykj ykjVar) {
        if (this.b.a(i)) {
            return false;
        }
        ykk ykkVar = this.b;
        if (ykkVar.a == null) {
            ykkVar.a = new SparseArray();
        }
        ykkVar.a.put(i, ykjVar);
        try {
            this.a.startActivityForResult(intent, i, null);
            return true;
        } catch (Exception unused) {
            whu.K(this.a, R.string.error_processing_link, 0);
            return false;
        }
    }
}
