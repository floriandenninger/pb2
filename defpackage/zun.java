package defpackage;

import com.google.research.xeno.effect.AssetManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zun {
    public final AssetManager.FetchCallback a;
    public final Set b;
    public final Map c = new HashMap();

    public zun(AssetManager.FetchCallback fetchCallback, Set set) {
        this.a = fetchCallback;
        this.b = new HashSet(set);
    }
}
