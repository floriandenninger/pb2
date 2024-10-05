package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitr implements aitq {
    private final zfi b;
    private final zjl a = new zjl(Collections.emptyMap());
    private final ajun c = ahbx.w();

    public aitr(zfi zfiVar) {
        this.b = zfiVar;
    }

    @Override // defpackage.aitq
    public final void a(aitt aittVar, pth pthVar, long j, int i) {
        aittVar.b(j);
        try {
            try {
                aiua a = ((aiub) this.a.b(new ywb(ByteBuffer.wrap(pthVar.a, pthVar.b, i)), this.c)).a();
                pthVar.G(pthVar.b + pthVar.a());
                if (j == 0) {
                    aittVar.a(aiua.a(this.b, j));
                    return;
                }
                zfi zfiVar = this.b;
                ArrayList arrayList = new ArrayList();
                if (!a.a.isEmpty()) {
                    int i2 = 0;
                    while (i2 < a.a.size() - 1) {
                        int i3 = i2 + 1;
                        arrayList.add(new aity(((Long) a.a.get(i2)).longValue() + j, ((Long) a.a.get(i3)).longValue() + j, a.b(((Long) a.a.get(i2)).longValue()), zfiVar));
                        i2 = i3;
                    }
                }
                aittVar.a(arrayList);
            } catch (IOException | zji unused) {
                aittVar.a(aiua.a(this.b, j));
                pthVar.G(pthVar.b + pthVar.a());
            }
        } catch (Throwable th) {
            pthVar.G(pthVar.b + pthVar.a());
            throw th;
        }
    }
}
