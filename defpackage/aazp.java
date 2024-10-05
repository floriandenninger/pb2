package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazp extends aaru {
    public String a;
    public long b;
    public aqjm c;
    public List d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aazp(ajoy ajoyVar, afsx afsxVar, String str, boolean z, boolean z2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("log_event", ajoyVar, afsxVar, 1, z, str, Boolean.valueOf(z2), null, null, null);
        this.a = "";
        this.b = 0L;
        this.d = new ArrayList();
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!d());
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    @Override // defpackage.aaru
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = arpr.a.createBuilder();
        createBuilder.aj(this.d);
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        arpr arprVar = (arpr) createBuilder.instance;
        arprVar.b |= 2;
        arprVar.d = currentTimeMillis;
        aone createBuilder2 = arpv.a.createBuilder();
        long j = this.b;
        if (j != 0) {
            createBuilder2.copyOnWrite();
            arpv arpvVar = (arpv) createBuilder2.instance;
            arpvVar.b |= 2;
            arpvVar.d = j;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder2.copyOnWrite();
            arpv arpvVar2 = (arpv) createBuilder2.instance;
            str.getClass();
            arpvVar2.b |= 1;
            arpvVar2.c = str;
        }
        createBuilder.copyOnWrite();
        arpr arprVar2 = (arpr) createBuilder.instance;
        arpv arpvVar3 = (arpv) createBuilder2.build();
        arpvVar3.getClass();
        arprVar2.e = arpvVar3;
        arprVar2.b |= 4;
        aqjm aqjmVar = this.c;
        if (aqjmVar != null) {
            createBuilder.copyOnWrite();
            arpr arprVar3 = (arpr) createBuilder.instance;
            arprVar3.g = aqjmVar.f;
            arprVar3.b |= 32;
        }
        return createBuilder;
    }
}
