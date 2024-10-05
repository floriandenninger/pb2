package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxz implements Effect.NativeLoadCallback {
    final /* synthetic */ zuh a;

    public awxz(zuh zuhVar) {
        this.a = zuhVar;
    }

    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        Effect effect = j != 0 ? new Effect(j) : null;
        zuh zuhVar = this.a;
        zum zumVar = zuhVar.a;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = zuhVar.b;
        String str2 = zuhVar.c;
        if (effect == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(str).length());
            sb.append("Error creating Effect ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            zga.b(sb.toString());
            return;
        }
        zumVar.l.b++;
        zumVar.e();
        filterMapTable$FilterDescriptor.d = effect.c;
        filterMapTable$FilterDescriptor.d();
        zumVar.h.put(amkq.d(filterMapTable$FilterDescriptor.a), effect);
        synchronized (zumVar.j) {
            zsi zsiVar = zumVar.k;
            if (zsiVar != null) {
                zsiVar.b();
            }
        }
    }
}
