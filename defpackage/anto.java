package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anto {
    private static WeakReference b;
    final anud a;

    public anto() {
    }

    public final void b(antv... antvVarArr) {
        try {
            Thing[] thingArr = new Thing[1];
            System.arraycopy(antvVarArr, 0, thingArr, 0, 1);
            c(new MutateRequest(1, thingArr, null, null, null, null, null));
        } catch (ArrayStoreException unused) {
            rqr.b(new ants("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public final void c(MutateRequest mutateRequest) {
        boolean isEmpty;
        anud anudVar = this.a;
        anuc anucVar = new anuc(anudVar, mutateRequest);
        anucVar.b.a.m(anudVar, anudVar);
        synchronized (anudVar.b) {
            isEmpty = anudVar.b.isEmpty();
            anudVar.b.add(anucVar);
        }
        if (isEmpty) {
            anucVar.a();
        }
    }

    public anto(Context context) {
        this.a = new anud(new qob(context, null));
    }

    public static synchronized anto a(Context context) {
        synchronized (anto.class) {
            WeakReference weakReference = b;
            anto antoVar = weakReference == null ? null : (anto) weakReference.get();
            if (antoVar != null) {
                return antoVar;
            }
            anto antoVar2 = new anto(context.getApplicationContext());
            b = new WeakReference(antoVar2);
            return antoVar2;
        }
    }
}
