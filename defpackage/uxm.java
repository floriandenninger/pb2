package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uxm implements Runnable {
    public final /* synthetic */ anhy a;
    public final /* synthetic */ uwl b;
    private final /* synthetic */ int c;

    public /* synthetic */ uxm(uwl uwlVar, anhy anhyVar, int i) {
        this.c = i;
        this.b = uwlVar;
        this.a = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            uwl uwlVar = this.b;
            try {
                anaf.W(this.a);
                return;
            } catch (Exception e) {
                String str = uwlVar.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
                sb.append("Failed to store account on flag read for: ");
                sb.append(str);
                sb.append(" which may lead to stale flags.");
                Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
                return;
            }
        }
        this.b.e(this.a);
    }
}
