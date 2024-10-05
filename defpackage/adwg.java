package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwg implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;

    public adwg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
    }

    public static adwg a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11) {
        return new adwg(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11);
    }

    public static amml c(final Context context, final String str, Object obj, final Executor executor, final aenf aenfVar, atse atseVar, final aaea aaeaVar, final aehs aehsVar, Object obj2, final aefy aefyVar, final axzg axzgVar) {
        final advq advqVar = (advq) obj;
        final adxh adxhVar = (adxh) obj2;
        final atse atseVar2 = atseVar != null ? atseVar : atse.b;
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        return new amml(context, str, advqVar, executor, aenfVar, atseVar2, axzgVar, aaeaVar, aehsVar, adxhVar, aefyVar, bArr, bArr2) { // from class: advt
            public final /* synthetic */ Context a;
            public final /* synthetic */ String b;
            public final /* synthetic */ advq c;
            public final /* synthetic */ Executor d;
            public final /* synthetic */ aenf e;
            public final /* synthetic */ atse f;
            public final /* synthetic */ aaea g;
            public final /* synthetic */ aehs h;
            public final /* synthetic */ adxh i;
            public final /* synthetic */ aefy j;
            public final /* synthetic */ axzg k;

            @Override // defpackage.amml
            public final Object apply(Object obj3) {
                return new atk(this.b, this.c, this.d, this.e, this.f, this.k, this.g, (String) obj3, this.h, this.i, this.j, null, null);
            }
        };
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final amml get() {
        return c((Context) ((axqs) this.a).a, (String) this.b.get(), this.c.get(), (Executor) this.d.get(), (aenf) this.e.get(), ((adwe) this.f).get(), (aaea) this.g.get(), (aehs) this.h.get(), this.i.get(), (aefy) this.j.get(), (axzg) this.k.get());
    }
}
