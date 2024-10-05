package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afiy {
    public final ate a;
    private final pow b;
    private aeix c;
    private aege d;
    private final afcs e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public afiy(android.content.Context r24, final java.lang.String r25, final defpackage.advq r26, final defpackage.aaea r27, final java.util.concurrent.Executor r28, defpackage.att[] r29, defpackage.att[] r30, defpackage.adxh r31, defpackage.aehs r32, defpackage.azrw r33, defpackage.afit r34, defpackage.aeeh r35, defpackage.aedn r36, java.util.concurrent.ScheduledExecutorService r37, defpackage.shf r38, defpackage.aejn r39, defpackage.ysy r40, defpackage.aefy r41, final int r42, boolean r43, final defpackage.afhs r44, defpackage.afcu r45, defpackage.afeu r46, defpackage.adyu r47, final defpackage.ysw r48, defpackage.afeq r49, defpackage.afiw r50, defpackage.ajoy r51, byte[] r52, byte[] r53, byte[] r54, byte[] r55, byte[] r56) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afiy.<init>(android.content.Context, java.lang.String, advq, aaea, java.util.concurrent.Executor, att[], att[], adxh, aehs, azrw, afit, aeeh, aedn, java.util.concurrent.ScheduledExecutorService, shf, aejn, ysy, aefy, int, boolean, afhs, afcu, afeu, adyu, ysw, afeq, afiw, ajoy, byte[], byte[], byte[], byte[], byte[]):void");
    }

    public static afhf a(afix afixVar, amnv amnvVar, amnv amnvVar2, boolean z, int i) {
        return new afiu(afixVar, amnvVar, amnvVar2, z, i);
    }

    public static pow c(PlayerConfigModel playerConfigModel, aaea aaeaVar, atr atrVar, att[] attVarArr, aefy aefyVar, int i) {
        int n;
        arfd a = aaeaVar.a();
        if (a != null) {
            atcl atclVar = a.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            aqvb aqvbVar = atclVar.h;
            if (aqvbVar == null) {
                aqvbVar = aqvb.b;
            }
            if (aqvbVar.d) {
                atrVar = aefyVar.a(atrVar);
            }
        }
        if (i == 2) {
            aquz aquzVar = playerConfigModel.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            n = aquzVar.aS;
        } else {
            n = playerConfigModel.n();
        }
        pow powVar = new pow(atrVar, n, -1L);
        f(powVar, attVarArr);
        return powVar;
    }

    public static atr d(afhs afhsVar, String str, PlayerConfigModel playerConfigModel, advq advqVar, Executor executor, boolean z) {
        CronetEngine a;
        if (!afhsVar.am() || (a = advqVar.a(afhsVar.o().s)) == null) {
            int m = playerConfigModel.m();
            int o = playerConfigModel.o();
            ati atiVar = new ati();
            atiVar.b = str;
            atiVar.a = atr.a;
            atiVar.c = m;
            atiVar.d = o;
            atiVar.e = z;
            return atiVar.a();
        }
        return aear.b(a, executor, atr.a, playerConfigModel.m(), playerConfigModel.o(), true, z);
    }

    private static afhi e(afhi afhiVar, azrw azrwVar) {
        return new adva(azrwVar, afhiVar);
    }

    private static void f(ate ateVar, att[] attVarArr) {
        if (attVarArr == null) {
            return;
        }
        for (att attVar : attVarArr) {
            ateVar.b(attVar);
        }
    }

    public final void b(PlayerConfigModel playerConfigModel, aelf aelfVar, aesa aesaVar) {
        this.b.b = playerConfigModel.n();
        aeix aeixVar = this.c;
        if (aeixVar != null) {
            aeixVar.a.set(aelfVar);
        }
        aege aegeVar = this.d;
        if (aegeVar != null) {
            aegeVar.f = aesaVar;
        }
    }

    public afiy() {
    }
}
