package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class anyv implements oww {
    private final /* synthetic */ int c;
    public static final /* synthetic */ anyv b = new anyv(1);
    public static final /* synthetic */ anyv a = new anyv(0);

    private /* synthetic */ anyv(int i) {
        this.c = i;
    }

    @Override // defpackage.oww
    public final Object a(Object obj) {
        anvw anvwVar;
        anvn anvnVar;
        if (this.c == 0) {
            aoac aoacVar = (aoac) obj;
            anvz anvzVar = dvb.a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                anvwVar = new anvw(byteArrayOutputStream, anvzVar.a, anvzVar.b, anvzVar.c);
                anvnVar = (anvn) anvwVar.c.get(aoacVar.getClass());
            } catch (IOException unused) {
            }
            if (anvnVar != null) {
                anvnVar.a(aoacVar, anvwVar);
                return byteArrayOutputStream.toByteArray();
            }
            String valueOf = String.valueOf(aoacVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("No encoder for ");
            sb.append(valueOf);
            throw new anvk(sb.toString());
        }
        return ((andl) obj).toByteArray();
    }
}
