package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class llc {
    private final agaf a;
    private final cnd b;
    private final afsy c;
    private final SparseArray d;
    private final SparseArray e;

    public llc(cnd cndVar, agaf agafVar, afsy afsyVar) {
        this.b = cndVar;
        this.a = agafVar;
        this.c = afsyVar;
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.e = new SparseArray();
        sparseArray.put(20, "video_notifications_enabled");
        sparseArray.put(36, "com.google.android.libraries.youtube.notification.pref.notification_sound_enabled");
    }

    public final String a(int i) {
        String str = (String) this.d.get(i);
        if (str != null) {
            return str;
        }
        String str2 = (String) this.e.get(i);
        if (str2 != null) {
            return yny.L(str2, this.c.c().d());
        }
        return null;
    }

    public final void b(int i) {
        if (i == 20) {
            aear.B(this.a);
        } else if (i == 9) {
            this.b.b();
        }
    }
}
