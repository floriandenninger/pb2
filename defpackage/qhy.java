package defpackage;

import com.google.android.gms.cast.SessionState;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhy {
    public static final qkw a = new qkw("TransferController");
    public final Set b = new HashSet();
    public int c = 0;
    public qgw d;
    public SettableFuture e;
    public SessionState f;

    public final void a() {
        qfy a2;
        qgw qgwVar = this.d;
        if (qgwVar == null || (a2 = qgwVar.a()) == null) {
            return;
        }
        a2.e = null;
    }
}
