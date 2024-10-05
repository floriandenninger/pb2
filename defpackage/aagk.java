package defpackage;

import com.google.android.libraries.elements.interfaces.MissingResourceHandler;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourceType;
import com.youtube.android.libraries.elements.StatusOr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagk extends MissingResourceHandler {
    private final aagm a;

    public aagk(aagm aagmVar) {
        this.a = aagmVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.MissingResourceHandler
    public final StatusOr getResources(ArrayList arrayList) {
        ResourceType resourceType;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (this.a.d(str)) {
                try {
                    aagl b = this.a.b(str);
                    awmr awmrVar = b.b;
                    String str2 = awmrVar.b;
                    int H = awxr.H(awmrVar.d);
                    if (H == 0) {
                        H = 1;
                    }
                    int i2 = H - 1;
                    if (i2 == 1) {
                        resourceType = ResourceType.EML_TEMPLATE;
                    } else if (i2 == 2) {
                        resourceType = ResourceType.JAVASCRIPT_MODULE;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                            String str3 = H != 1 ? H != 2 ? H != 3 ? H != 4 ? "RESOURCE_TYPE_BLOCKS_CONTAINER_MANIFEST" : "RESOURCE_TYPE_CERTIFICATE" : "RESOURCE_TYPE_JAVASCRIPT_MODULE" : "RESOURCE_TYPE_EML_TEMPLATE" : "RESOURCE_TYPE_UNKNOWN";
                            throw new IllegalArgumentException(str3.length() != 0 ? "Unsupported resource type: ".concat(str3) : new String("Unsupported resource type: "));
                        }
                        resourceType = ResourceType.BLOCKS_CONTAINER_MANIFEST;
                    } else {
                        resourceType = ResourceType.CERTIFICATE;
                    }
                    ResourceType resourceType2 = resourceType;
                    ArrayList arrayList3 = new ArrayList(b.b.e);
                    int H2 = awxr.H(b.b.d);
                    try {
                        arrayList2.add(new ResourceEntry(new ResourceMetadata(str2, resourceType2, null, arrayList3, (H2 != 0 ? H2 : 1) == 3 ? "datapush" : null), (byte[]) b.a.f(b.b.c).get()));
                    } catch (InterruptedException e) {
                        e = e;
                        throw new IOException(e);
                    } catch (ExecutionException e2) {
                        e = e2;
                        throw new IOException(e);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return StatusOr.fromValue(arrayList2);
    }
}
