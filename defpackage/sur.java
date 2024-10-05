package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sur implements szj {
    private static final aomw f;
    private static final awoj g;
    private static final awoj h;
    public final azrw a;
    public final Context b;
    public final boolean c;
    public final azrw d;
    public final azrw e;

    static {
        aomw c = aomw.c();
        c.e(awqf.b);
        f = c;
        aone createBuilder = awoj.a.createBuilder();
        createBuilder.copyOnWrite();
        awoj awojVar = (awoj) createBuilder.instance;
        awojVar.b = 8;
        awojVar.c = 0;
        g = (awoj) createBuilder.build();
        aone createBuilder2 = awoj.a.createBuilder();
        createBuilder2.copyOnWrite();
        awoj awojVar2 = (awoj) createBuilder2.instance;
        awojVar2.b = 8;
        awojVar2.c = 1;
        h = (awoj) createBuilder2.build();
    }

    public sur(Context context, ammv ammvVar, ammv ammvVar2, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.b = context;
        this.c = ((Boolean) ammvVar.e(false)).booleanValue();
        this.a = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        if (((Boolean) ammvVar2.e(false)).booleanValue()) {
            azrwVar.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(byte[] bArr) {
        try {
            return ((awqf) ((awpz) aonm.parseFrom(awpz.a, bArr, f)).pX(awqf.b)).d;
        } catch (aoob unused) {
            return "Unknown template";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer b(Context context, syv syvVar) {
        try {
            if (syvVar.c) {
                aone createBuilder = awoi.a.createBuilder((awoi) aonm.parseFrom(awoi.a, syvVar.f(), aomw.a()));
                createBuilder.bb("/system/orientation", context.getResources().getConfiguration().orientation == 2 ? g : h);
                aong aongVar = (aong) awog.a.createBuilder();
                aongVar.e(awoi.b, (awoi) createBuilder.build());
                return ByteBuffer.wrap(((awog) aongVar.build()).toByteArray());
            }
            return syvVar.e();
        } catch (aoob e) {
            throw new syf("Failed to deserialize Model", e);
        }
    }

    @Override // defpackage.szj
    public final szi c(byte[] bArr, aoam aoamVar, String str) {
        return new suq(this, bArr, aoamVar, str);
    }
}
