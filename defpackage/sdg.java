package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class sdg implements scx {
    private final /* synthetic */ int d;
    public static final /* synthetic */ sdg c = new sdg(2);
    public static final /* synthetic */ sdg b = new sdg(1);
    public static final /* synthetic */ sdg a = new sdg(0);

    private /* synthetic */ sdg(int i) {
        this.d = i;
    }

    @Override // defpackage.scx
    public final Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? new sdi((RuntimeJni) obj) : obj;
        }
        return new sde((ExperienceJni) obj);
    }
}
