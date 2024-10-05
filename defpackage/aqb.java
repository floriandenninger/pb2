package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.social.licenses.License;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqb extends aqi implements Runnable {
    public boolean a;
    final /* synthetic */ aqc b;

    public aqb(aqc aqcVar) {
        this.b = aqcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqi
    public final Object a() {
        try {
            aqc aqcVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] split = uye.e(aqcVar.f.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                int indexOf = str.indexOf(32);
                String[] split2 = str.substring(0, indexOf).split(":");
                boolean z = split2.length == 2 && indexOf > 0;
                String valueOf = String.valueOf(str);
                amkq.O(z, valueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(valueOf) : new String("Invalid license meta-data line:\n"));
                arrayList.add(new License(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return Collections.unmodifiableList(new ArrayList(treeSet));
        } catch (ait e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqi
    public final void b(Object obj) {
        aqc aqcVar = this.b;
        if (aqcVar.a != this) {
            aqcVar.c(this);
        } else {
            if (aqcVar.h) {
                return;
            }
            SystemClock.uptimeMillis();
            aqcVar.a = null;
            aqcVar.b((List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqi
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
