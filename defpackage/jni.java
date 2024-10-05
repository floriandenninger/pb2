package defpackage;

import android.content.Context;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jni {
    private final Context a;
    private final azrw b;
    private final jnr c;

    public jni(Context context, azrw azrwVar, jnr jnrVar) {
        this.a = context;
        this.b = azrwVar;
        this.c = jnrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv a(int i, aomu aomuVar, Object obj) {
        this.c.b(new jnh(0));
        try {
            awos awosVar = (awos) aonm.parseFrom(awos.a, this.a.getResources().openRawResource(i), aomw.b());
            awqd awqdVar = awosVar.c;
            if (awqdVar == null) {
                awqdVar = awqd.a;
            }
            awob awobVar = (awob) awqdVar.pX(awob.b);
            aone builder = awosVar.toBuilder();
            awqd awqdVar2 = awosVar.c;
            if (awqdVar2 == null) {
                awqdVar2 = awqd.a;
            }
            aong aongVar = (aong) awqdVar2.toBuilder();
            aonk aonkVar = awob.b;
            aone builder2 = awobVar.toBuilder();
            awog awogVar = awobVar.e;
            if (awogVar == null) {
                awogVar = awog.a;
            }
            aong aongVar2 = (aong) awogVar.toBuilder();
            aongVar2.e(aomuVar, obj);
            builder2.copyOnWrite();
            awob awobVar2 = (awob) builder2.instance;
            awog awogVar2 = (awog) aongVar2.build();
            awogVar2.getClass();
            awobVar2.e = awogVar2;
            awobVar2.c |= 8;
            aongVar.e(aonkVar, (awob) builder2.build());
            builder.copyOnWrite();
            awos awosVar2 = (awos) builder.instance;
            awqd awqdVar3 = (awqd) aongVar.build();
            awqdVar3.getClass();
            awosVar2.c = awqdVar3;
            awosVar2.b |= 1;
            return ammv.j((awos) builder.build());
        } catch (IOException e) {
            zga.d("Could not load persisted element blueprint", e);
            return amlr.a;
        }
    }

    public final ammv b(int i, aomu aomuVar, Object obj) {
        return a(i, aomuVar, obj).b(icu.o);
    }

    public final void c() {
        ((ypa) this.b.get()).g(this.c);
    }
}
