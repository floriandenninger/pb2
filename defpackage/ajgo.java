package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajgo extends ResourceLoaderDelegate {
    private final ajfm a;
    private final syd b;

    public ajgo(ajfm ajfmVar, syd sydVar) {
        this.a = ajfmVar;
        this.b = sydVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            syd sydVar = this.b;
            String valueOf = String.valueOf(str);
            sydVar.b(32, valueOf.length() != 0 ? "ELMCache: Error caching resource due to unknown reason: ".concat(valueOf) : new String("ELMCache: Error caching resource due to unknown reason: "));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (status.getCode() == Status.Code.RESOURCE_EXHAUSTED) {
            syd sydVar2 = this.b;
            String name = status.getCode().name();
            String description = status.getDescription();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 107 + String.valueOf(name).length() + String.valueOf(description).length());
            sb.append("ELMCache: Resource was not cached because the cache filled up while writing. Identifier: ");
            sb.append(str);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            sydVar2.b(34, sb.toString());
            return;
        }
        syd sydVar3 = this.b;
        String name2 = status.getCode().name();
        String description2 = status.getDescription();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 67 + String.valueOf(name2).length() + String.valueOf(description2).length());
        sb2.append("ELMCache: Error caching resource due to failure: ");
        sb2.append(str);
        sb2.append(". Error details: ");
        sb2.append(name2);
        sb2.append(" ");
        sb2.append(description2);
        sydVar3.b(32, sb2.toString());
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onMissingCacheDependency(String str) {
        syd sydVar = this.b;
        String valueOf = String.valueOf(str);
        sydVar.b(32, valueOf.length() != 0 ? "ELMCache: The following resource is missing during caching: ".concat(valueOf) : new String("ELMCache: The following resource is missing during caching: "));
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceCachePrepared(String str, Status status) {
        if (status.f()) {
            return;
        }
        syd sydVar = this.b;
        String name = status.getCode().name();
        String description = status.getDescription();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(name).length() + String.valueOf(description).length());
        sb.append("ELMCache: Error preparing resource for caching: ");
        sb.append(str);
        sb.append(". Error details: ");
        sb.append(name);
        sb.append(" ");
        sb.append(description);
        sydVar.b(32, sb.toString());
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        ayph f;
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            syd sydVar = this.b;
            String valueOf = String.valueOf(str);
            sydVar.b(32, valueOf.length() != 0 ? "Error loading resource due to unknown reason: ".concat(valueOf) : new String("Error loading resource due to unknown reason: "));
            return;
        }
        if (ordinal == 1) {
            this.a.f.add(str);
            final ajfm ajfmVar = this.a;
            if (!ajfmVar.d() || !ajfmVar.e()) {
                f = ayph.f();
            } else {
                f = ayph.t(new ayrm() { // from class: ajfk
                    @Override // defpackage.ayrm
                    public final void a() {
                        ajfm.this.c().cacheResources();
                    }
                });
            }
            f.E(azre.a()).Q();
            return;
        }
        if (ordinal != 2) {
            return;
        }
        syd sydVar2 = this.b;
        String name = status.getCode().name();
        String description = status.getDescription();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(name).length() + String.valueOf(description).length());
        sb.append("Error loading resource due to failure: ");
        sb.append(str);
        sb.append(". Error details: ");
        sb.append(name);
        sb.append(" ");
        sb.append(description);
        sydVar2.b(32, sb.toString());
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onServingContextUpdated(byte[] bArr) {
        this.a.g.set(aomf.x(bArr));
    }
}
