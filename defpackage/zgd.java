package defpackage;

import android.os.Looper;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zgd implements amnv, azrw {
    static final Object c = new Object();
    static final Map d = new HashMap();
    private final zhw a;
    private String b;
    final String e;
    volatile Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zgd(String str) {
        this(str, zhv.a);
        zhq.m(str);
    }

    public static zgd b(String str, amnv amnvVar) {
        return new zgc(str, amnvVar);
    }

    private static String d(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private static String e(zgd zgdVar) {
        zgdVar.a.a("Lazy:getGenericTypeName");
        String str = zgdVar.e;
        if (str != null) {
            return str;
        }
        Type genericSuperclass = zgdVar.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return f((ParameterizedType) genericSuperclass);
        }
        if (genericSuperclass instanceof Class) {
            return ((Class) genericSuperclass).getSimpleName();
        }
        return d(genericSuperclass.toString());
    }

    private static String f(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class) {
            return ((Class) type).getSimpleName();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            String d2 = d(parameterizedType2.getRawType().toString());
            String f = f(parameterizedType2);
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 2 + String.valueOf(f).length());
            sb.append(d2);
            sb.append("<");
            sb.append(f);
            sb.append(">");
            return sb.toString();
        }
        if (type instanceof GenericArrayType) {
            return String.valueOf(((GenericArrayType) type).getGenericComponentType().toString()).concat("[]");
        }
        return d(type.toString());
    }

    private static String g(zgd zgdVar) {
        String str = zgdVar.b;
        if (str != null) {
            return str;
        }
        synchronized (zgdVar) {
            String str2 = zgdVar.b;
            if (str2 != null) {
                return str2;
            }
            String e = e(zgdVar);
            Map map = d;
            synchronized (map) {
                Integer num = (Integer) map.get(e);
                int intValue = num == null ? 1 : num.intValue() + 1;
                map.put(e, Integer.valueOf(intValue));
                if (intValue > 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 11);
                    sb.append(e);
                    sb.append(intValue);
                    e = sb.toString();
                }
                zgdVar.b = e;
            }
            return e;
        }
    }

    private static String h(String str, zgd zgdVar) {
        String g = g(zgdVar);
        Thread currentThread = Thread.currentThread();
        if (currentThread == Looper.getMainLooper().getThread()) {
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(g).length());
            sb.append(str);
            sb.append(":");
            sb.append(g);
            return sb.toString();
        }
        long id = currentThread.getId();
        StringBuilder sb2 = new StringBuilder(str.length() + 23 + String.valueOf(g).length());
        sb2.append(str);
        sb2.append("[");
        sb2.append(id);
        sb2.append("]:");
        sb2.append(g);
        return sb2.toString();
    }

    protected abstract Object a();

    public final void c(Executor executor) {
        executor.execute(new Runnable() { // from class: zgb
            @Override // java.lang.Runnable
            public final void run() {
                zgd.this.get();
            }
        });
    }

    @Override // defpackage.amnv
    public final Object get() {
        Object obj = this.f;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f;
                if (obj == obj2) {
                    this.a.a(h("Lazy.create", this));
                    obj = a();
                    this.f = obj;
                }
            }
        }
        this.a.a(h("Lazy.get", this));
        return obj;
    }

    public zgd(String str, zhw zhwVar) {
        this.f = c;
        this.e = str;
        zhwVar.getClass();
        this.a = zhwVar;
    }
}
