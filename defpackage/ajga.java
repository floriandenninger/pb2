package defpackage;

import com.google.android.libraries.elements.interfaces.CachePurgeReason;
import com.google.android.libraries.elements.interfaces.CacheStrategyDelegate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajga extends CacheStrategyDelegate {
    private final syd a;

    public ajga(syd sydVar) {
        this.a = sydVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final void onCacheFull(long j, long j2) {
        syd sydVar = this.a;
        StringBuilder sb = new StringBuilder(101);
        sb.append("ELMCache: SRS cache is full.\nCurrent cache size: ");
        sb.append(j);
        sb.append("\nCache cap: ");
        sb.append(j2);
        sydVar.b(34, sb.toString());
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final void onCacheInvalid(String str) {
        syd sydVar = this.a;
        String valueOf = String.valueOf(str);
        sydVar.b(34, valueOf.length() != 0 ? "ELMCache: SRS cache is invalid. Error details: ".concat(valueOf) : new String("ELMCache: SRS cache is invalid. Error details: "));
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final void onCachePurged(CachePurgeReason cachePurgeReason) {
        String str;
        CachePurgeReason cachePurgeReason2 = CachePurgeReason.MISSING_BYTES;
        int ordinal = cachePurgeReason.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal == 3) {
            str = "Cache is invalid.";
        } else if (ordinal == 4) {
            return;
        } else {
            str = "Unknown";
        }
        this.a.b(34, str.length() != 0 ? "ELMCache: SRS cache is purged due to error: ".concat(str) : new String("ELMCache: SRS cache is purged due to error: "));
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final void onErrorReadingResource(String str) {
        syd sydVar = this.a;
        String valueOf = String.valueOf(str);
        sydVar.b(34, valueOf.length() != 0 ? "ELMCache: Error reading resource: ".concat(valueOf) : new String("ELMCache: Error reading resource: "));
    }
}
