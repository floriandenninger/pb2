package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibt implements aibg {
    public final azrw a;
    public WeakReference b;
    private final azrw c;
    private final Set d;

    public aibt(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.d = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // defpackage.aibg
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d.isEmpty()) {
            d((fnt) obj, new aibs(this), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b() {
        Object obj = new Object();
        this.d.add(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj) {
        this.d.remove(obj);
    }

    public final void d(fnt fntVar, aibs aibsVar, boolean z) {
        PlaybackStartDescriptor a;
        ainy ainyVar = (ainy) this.a.get();
        ainl ainlVar = (ainl) this.c.get();
        if (fntVar == null) {
            if (ainyVar.n() != null) {
                ainyVar.D();
                return;
            }
            return;
        }
        if (aibsVar != null) {
            if (((ainy) aibsVar.a.a.get()).d()) {
                a = fntVar.a();
            } else {
                aifz e = fntVar.a().e();
                e.b(true);
                a = e.a();
            }
        } else {
            a = fntVar.a();
        }
        if (z) {
            ainyVar.D();
        } else if (ainyVar.M(a)) {
            return;
        }
        ainlVar.d(a);
    }
}
