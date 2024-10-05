package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazx extends aaru {
    public String a;
    public String[] b;
    public boolean c;
    public int d;

    public aazx(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification/modify_channel_preference", ajoyVar, afsxVar, null, null, null);
        this.b = new String[0];
        this.d = 1;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arwm.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arwm arwmVar = (arwm) createBuilder.instance;
        str.getClass();
        arwmVar.b |= 2;
        arwmVar.d = str;
        List asList = Arrays.asList(this.b);
        createBuilder.copyOnWrite();
        arwm arwmVar2 = (arwm) createBuilder.instance;
        aony aonyVar = arwmVar2.e;
        if (!aonyVar.c()) {
            arwmVar2.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) asList, (List) arwmVar2.e);
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arwm arwmVar3 = (arwm) createBuilder.instance;
        arwmVar3.b |= 4;
        arwmVar3.f = z;
        int i = this.d;
        createBuilder.copyOnWrite();
        arwm arwmVar4 = (arwm) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        arwmVar4.g = i2;
        arwmVar4.b |= 8;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }
}
