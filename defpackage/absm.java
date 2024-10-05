package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class absm {
    private static final amru d = amru.t(2, 4, 3);
    public final SparseArray a;
    public final HashMap b;
    public absl c;
    private final absl e;
    private final Handler f;
    private int g;

    public absm(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = new SparseArray();
        this.b = new HashMap();
        this.f = handler;
        String string = context.getResources().getString(R.string.lc_default_stream_status_unknown_text);
        this.e = new absl(-1, string == null ? null : new SpannedString(string), null);
        c();
    }

    private final void e() {
        for (Runnable runnable : this.b.values()) {
            if (this.f.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.f.post(runnable);
            }
        }
    }

    private final void f() {
        absl abslVar = null;
        absl abslVar2 = null;
        int i = 0;
        while (true) {
            if (i < this.a.size()) {
                absl abslVar3 = (absl) this.a.valueAt(i);
                if (!TextUtils.isEmpty(abslVar3.b)) {
                    int i2 = abslVar3.a;
                    if (d.contains(Integer.valueOf(i2))) {
                        abslVar = abslVar3;
                        break;
                    } else if (i2 == 1) {
                        if (abslVar == null) {
                            abslVar = abslVar3;
                        }
                    } else if (i2 == 0 && abslVar2 == null) {
                        abslVar2 = abslVar3;
                    }
                }
                i++;
            } else if (abslVar == null) {
                abslVar = abslVar2 == null ? this.e : abslVar2;
            }
        }
        this.c = abslVar;
    }

    public final int a() {
        int i = this.g;
        this.g = i + 1;
        this.a.put(i, new absl(i, null, new absk(this, i)));
        return i;
    }

    public final void b(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < this.g) {
                absl abslVar = (absl) this.a.get(i2);
                abslVar.a = -1;
                abslVar.b = null;
            }
        }
        f();
        e();
    }

    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            this.f.removeCallbacks(((absl) this.a.valueAt(i)).c);
        }
        this.a.clear();
        this.b.clear();
        this.c = this.e;
    }

    public final void d(int i, int i2, String str, boolean z) {
        SpannedString spannedString = str == null ? null : new SpannedString(str);
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.g) {
            z2 = true;
        }
        int i3 = this.g;
        StringBuilder sb = new StringBuilder(60);
        sb.append("statusSource (");
        sb.append(i2);
        sb.append(") must be between 0 and ");
        sb.append(i3);
        amkq.F(z2, sb.toString());
        absl abslVar = (absl) this.a.get(i2);
        if (abslVar == null) {
            StringBuilder sb2 = new StringBuilder(58);
            sb2.append("Trying to set status for a nonexistent source: ");
            sb2.append(i2);
            Log.w("CaptureHealthManager", sb2.toString());
            return;
        }
        abslVar.a = i;
        abslVar.b = spannedString;
        Runnable runnable = abslVar.c;
        this.f.removeCallbacks(runnable);
        if (z) {
            this.f.postDelayed(runnable, 4500L);
        }
        f();
        e();
    }
}
