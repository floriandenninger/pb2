package defpackage;

import android.os.Process;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ymz implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ yna b;

    public ymz(yna ynaVar, Runnable runnable) {
        this.b = ynaVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name;
        int i;
        Process.setThreadPriority(this.b.a);
        Thread currentThread = Thread.currentThread();
        String str = this.b.b;
        String str2 = null;
        if (currentThread != null && !TextUtils.isEmpty(str) && (name = currentThread.getName()) != null) {
            int indexOf = name.indexOf("-thread-");
            if (name.startsWith("pool-") && indexOf >= 0 && (i = indexOf + 8) < name.length()) {
                String substring = name.substring(5, indexOf);
                String substring2 = name.substring(i);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(substring).length() + String.valueOf(substring2).length());
                sb.append(str);
                sb.append(substring);
                sb.append("-");
                sb.append(substring2);
                str2 = sb.toString();
            }
        }
        if (str2 != null) {
            currentThread.setName(str2);
        }
        this.a.run();
    }
}
