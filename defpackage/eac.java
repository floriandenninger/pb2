package defpackage;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eac {
    public static final ConditionVariable a = new ConditionVariable();
    protected static volatile qxz b = null;
    public static volatile Random c = null;
    public final ebe d;
    protected volatile Boolean e;

    public eac(ebe ebeVar) {
        this.d = ebeVar;
        ebeVar.b.execute(new eab(this));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            a.block();
            if (!this.e.booleanValue() || b == null) {
                return;
            }
            dvf a2 = dvi.a();
            String packageName = this.d.a.getPackageName();
            a2.copyOnWrite();
            ((dvi) a2.instance).j(packageName);
            a2.copyOnWrite();
            ((dvi) a2.instance).o(j);
            if (str != null) {
                a2.copyOnWrite();
                ((dvi) a2.instance).k(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                a2.copyOnWrite();
                ((dvi) a2.instance).p(stringWriter2);
                String name = exc.getClass().getName();
                a2.copyOnWrite();
                ((dvi) a2.instance).m(name);
            }
            qxy a3 = b.a(((dvi) a2.build()).toByteArray());
            a3.b = i;
            if (i2 != -1) {
                a3.a = i2;
            }
            a3.a();
        } catch (Exception unused) {
        }
    }

    public final void b(int i, long j, String str) {
        a(i, -1, j, str, null);
    }
}
