package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anvw implements anvo {
    public static final anvm a;
    public static final anvm b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final anvn e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final anvn h;
    private final aocz i = new aocz();

    static {
        anvl a2 = anvm.a("key");
        anvr a3 = anvr.a();
        a3.a = 1;
        a2.b(a3.b());
        a = a2.a();
        anvl a4 = anvm.a("value");
        anvr a5 = anvr.a();
        a5.a = 2;
        a4.b(a5.b());
        b = a4.a();
        e = anvx.b;
    }

    public anvw(OutputStream outputStream, Map map, Map map2, anvn anvnVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = anvnVar;
    }

    private static int g(anvm anvmVar) {
        anvv anvvVar = (anvv) anvmVar.b(anvv.class);
        if (anvvVar != null) {
            return anvvVar.a();
        }
        throw new anvk("Field has no @Protobuf config");
    }

    private static anvv h(anvm anvmVar) {
        anvv anvvVar = (anvv) anvmVar.b(anvv.class);
        if (anvvVar != null) {
            return anvvVar;
        }
        throw new anvk("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    private final void k(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    private final void l(anvn anvnVar, anvm anvmVar, Object obj, boolean z) {
        anvs anvsVar = new anvs();
        try {
            OutputStream outputStream = this.f;
            this.f = anvsVar;
            try {
                anvnVar.a(obj, this);
                this.f = outputStream;
                long j = anvsVar.a;
                anvsVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(anvmVar) << 3) | 2);
                k(j);
                anvnVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                anvsVar.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    @Override // defpackage.anvo
    public final /* bridge */ /* synthetic */ void a(anvm anvmVar, long j) {
        d(anvmVar, j, true);
    }

    @Override // defpackage.anvo
    public final void b(anvm anvmVar, Object obj) {
        f(anvmVar, obj, true);
    }

    final void c(anvm anvmVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        anvv h = h(anvmVar);
        anvu anvuVar = anvu.DEFAULT;
        int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            j(h.a() << 3);
            j(i);
        } else if (ordinal == 1) {
            j(h.a() << 3);
            j((i + i) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            j((h.a() << 3) | 5);
            this.f.write(i(4).putInt(i).array());
        }
    }

    final void d(anvm anvmVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        anvv h = h(anvmVar);
        anvu anvuVar = anvu.DEFAULT;
        int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            j(h.a() << 3);
            k(j);
        } else if (ordinal == 1) {
            j(h.a() << 3);
            k((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            j((h.a() << 3) | 1);
            this.f.write(i(8).putLong(j).array());
        }
    }

    public final void e(anvm anvmVar, int i) {
        c(anvmVar, i, true);
    }

    final void f(anvm anvmVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((g(anvmVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            j(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(anvmVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(e, anvmVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            j((g(anvmVar) << 3) | 1);
            this.f.write(i(8).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            j((g(anvmVar) << 3) | 5);
            this.f.write(i(4).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(anvmVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(anvmVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((g(anvmVar) << 3) | 2);
            j(bArr.length);
            this.f.write(bArr);
            return;
        }
        anvn anvnVar = (anvn) this.c.get(obj.getClass());
        if (anvnVar != null) {
            l(anvnVar, anvmVar, obj, z);
            return;
        }
        anvp anvpVar = (anvp) this.g.get(obj.getClass());
        if (anvpVar != null) {
            anvpVar.a(obj, this.i);
            return;
        }
        if (obj instanceof anvt) {
            e(anvmVar, ((anvt) obj).a());
        } else if (obj instanceof Enum) {
            e(anvmVar, ((Enum) obj).ordinal());
        } else {
            l(this.h, anvmVar, obj, z);
        }
    }
}
