package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayy extends aaru {
    public byte[] a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean s;
    public boolean t;
    private final Set u;

    public aayy(ajoy ajoyVar, afsx afsxVar, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/get_live_chat", ajoyVar, afsxVar, null, null, null);
        this.a = new byte[0];
        this.b = "";
        this.u = set;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aruk.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            aruk arukVar = (aruk) createBuilder.instance;
            str.getClass();
            arukVar.b |= 4;
            arukVar.e = str;
        } else {
            byte[] bArr = this.a;
            if (bArr != null && bArr.length > 0) {
                aomf x = aomf.x(bArr);
                createBuilder.copyOnWrite();
                aruk arukVar2 = (aruk) createBuilder.instance;
                arukVar2.b |= 2;
                arukVar2.d = x;
            }
        }
        if (this.c) {
            createBuilder.copyOnWrite();
            aruk arukVar3 = (aruk) createBuilder.instance;
            arukVar3.b |= 32;
            arukVar3.g = true;
        }
        if (this.d) {
            createBuilder.copyOnWrite();
            aruk arukVar4 = (aruk) createBuilder.instance;
            arukVar4.b |= 64;
            arukVar4.h = true;
        }
        if (this.s) {
            createBuilder.copyOnWrite();
            aruk arukVar5 = (aruk) createBuilder.instance;
            arukVar5.b |= 4096;
            arukVar5.i = true;
        }
        if (this.t) {
            createBuilder.copyOnWrite();
            aruk arukVar6 = (aruk) createBuilder.instance;
            arukVar6.b |= 16;
            arukVar6.f = true;
        }
        Set set = this.u;
        if (set != null && !set.isEmpty()) {
            for (aayx aayxVar : this.u) {
                if (aayxVar != null) {
                    aayxVar.a();
                }
            }
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
