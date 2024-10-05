package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abco extends aaru {
    private SetSettingEndpointOuterClass$SetSettingEndpoint a;

    public abco(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("account/set_setting", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asba.a.createBuilder();
        String str = this.a.e;
        createBuilder.copyOnWrite();
        asba asbaVar = (asba) createBuilder.instance;
        str.getClass();
        asbaVar.b |= 2;
        asbaVar.d = str;
        aone createBuilder2 = asbc.a.createBuilder();
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = this.a;
        int i = setSettingEndpointOuterClass$SetSettingEndpoint.c;
        if (i == 3) {
            boolean booleanValue = ((Boolean) setSettingEndpointOuterClass$SetSettingEndpoint.d).booleanValue();
            createBuilder2.copyOnWrite();
            asbc asbcVar = (asbc) createBuilder2.instance;
            asbcVar.b = 2 | asbcVar.b;
            asbcVar.d = booleanValue;
        } else if (i == 4) {
            long longValue = ((Long) setSettingEndpointOuterClass$SetSettingEndpoint.d).longValue();
            createBuilder2.copyOnWrite();
            asbc asbcVar2 = (asbc) createBuilder2.instance;
            asbcVar2.b |= 4;
            asbcVar2.e = longValue;
        } else if (i == 2) {
            String str2 = (String) setSettingEndpointOuterClass$SetSettingEndpoint.d;
            createBuilder2.copyOnWrite();
            asbc asbcVar3 = (asbc) createBuilder2.instance;
            str2.getClass();
            asbcVar3.b |= 1;
            asbcVar3.c = str2;
        }
        createBuilder.copyOnWrite();
        asba asbaVar2 = (asba) createBuilder.instance;
        asbc asbcVar4 = (asbc) createBuilder2.build();
        asbcVar4.getClass();
        asbaVar2.e = asbcVar4;
        asbaVar2.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a.e);
    }

    public final void d(SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint) {
        setSettingEndpointOuterClass$SetSettingEndpoint.getClass();
        this.a = setSettingEndpointOuterClass$SetSettingEndpoint;
    }
}
