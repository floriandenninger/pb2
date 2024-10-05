package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpo {
    public final String a;
    public final List b;

    public akpo(String str) {
        this.b = new ArrayList();
        this.a = str;
    }

    public akpo(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final aomf a(Object obj) {
        byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(obj);
        this.b.add(nativeRetainObjectReference);
        return aomf.x(nativeRetainObjectReference);
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            NativeSupport.nativeReleaseObjectReference((byte[]) it.next());
        }
        this.b.clear();
    }
}
