package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfu implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;

    public ajfu(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
    }

    public static ajfu a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8) {
        return new ajfu(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8);
    }

    public static ajft b(syd sydVar, aaea aaeaVar, aadw aadwVar, axpg axpgVar, Context context, ResourceLoaderDelegate resourceLoaderDelegate, axpg axpgVar2, ammv ammvVar) {
        return new ajft(sydVar, aaeaVar, aadwVar, axpgVar, context, resourceLoaderDelegate, axpgVar2, ammvVar);
    }

    @Override // defpackage.azrw
    public final /* bridge */ /* synthetic */ Object get() {
        return b((syd) this.a.get(), (aaea) this.b.get(), (aadw) this.c.get(), axqq.a(this.d), (Context) ((axqs) this.e).a, (ResourceLoaderDelegate) this.f.get(), axqq.a(this.g), (ammv) this.h.get());
    }
}
