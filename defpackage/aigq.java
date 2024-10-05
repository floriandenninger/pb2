package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigq extends aifx {
    public static final String f(awdz awdzVar) {
        return (awdzVar.b & 1) != 0 ? awdzVar.c : "";
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ owi a(Object obj) {
        awdz awdzVar = (awdz) obj;
        aone createBuilder = owi.a.createBuilder();
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        owiVar.b |= 1;
        owiVar.c = "";
        String f = f(awdzVar);
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        f.getClass();
        owiVar2.b |= 2;
        owiVar2.e = f;
        int i = awdzVar.d;
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 4;
        owiVar3.f = i;
        String str = awdzVar.e;
        createBuilder.copyOnWrite();
        owi owiVar4 = (owi) createBuilder.instance;
        str.getClass();
        owiVar4.b |= 8;
        owiVar4.g = str;
        createBuilder.copyOnWrite();
        owi owiVar5 = (owi) createBuilder.instance;
        owiVar5.b |= 512;
        owiVar5.m = "";
        createBuilder.copyOnWrite();
        owi owiVar6 = (owi) createBuilder.instance;
        owiVar6.b |= 64;
        owiVar6.j = false;
        createBuilder.copyOnWrite();
        owi owiVar7 = (owi) createBuilder.instance;
        owiVar7.b |= 32;
        owiVar7.i = false;
        createBuilder.copyOnWrite();
        owi owiVar8 = (owi) createBuilder.instance;
        owiVar8.b |= 256;
        owiVar8.l = 0L;
        return (owi) createBuilder.build();
    }

    @Override // defpackage.aiga
    public final aomu b() {
        return WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return f((awdz) obj);
    }

    @Override // defpackage.aifx
    public final /* synthetic */ String d(Object obj) {
        return "";
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        awdz awdzVar = (awdz) obj;
        awdz awdzVar2 = (awdz) obj2;
        if (amkq.b(awdzVar, awdzVar2)) {
            return true;
        }
        return TextUtils.equals(f(awdzVar), f(awdzVar2)) && Math.abs(awdzVar.d - awdzVar2.d) <= 1;
    }
}
