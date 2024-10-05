package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazm extends aaru {
    public static final SparseIntArray a = new agbw(null, null, null);
    public String b;
    public String c;
    public int d;
    public int s;

    public aazm(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/create_ingestion", ajoyVar, afsxVar, null, null, null);
        this.d = 10003;
        this.s = 0;
        k();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = arnx.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            arnx arnxVar = (arnx) createBuilder.instance;
            str.getClass();
            arnxVar.b |= 4;
            arnxVar.e = str;
        }
        aone createBuilder2 = arnz.a.createBuilder();
        if (this.s == 1) {
            createBuilder2.copyOnWrite();
            arnz arnzVar = (arnz) createBuilder2.instance;
            arnzVar.d = 4;
            arnzVar.b |= 64;
        } else {
            createBuilder2.copyOnWrite();
            arnz arnzVar2 = (arnz) createBuilder2.instance;
            arnzVar2.d = 1;
            arnzVar2.b |= 64;
        }
        int i = this.d;
        createBuilder2.copyOnWrite();
        arnz arnzVar3 = (arnz) createBuilder2.instance;
        arnzVar3.b = 1 | arnzVar3.b;
        arnzVar3.c = i;
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            createBuilder2.copyOnWrite();
            arnz arnzVar4 = (arnz) createBuilder2.instance;
            str2.getClass();
            arnzVar4.b |= 128;
            arnzVar4.e = str2;
        }
        if (TextUtils.isEmpty(null)) {
            arnz arnzVar5 = (arnz) createBuilder2.build();
            createBuilder.copyOnWrite();
            arnx arnxVar2 = (arnx) createBuilder.instance;
            arnzVar5.getClass();
            arnxVar2.d = arnzVar5;
            arnxVar2.b |= 2;
            return createBuilder;
        }
        createBuilder2.copyOnWrite();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
