package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arno extends aonm implements aooz {
    public static final arno a;
    private static volatile aopf h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        arno arnoVar = new arno();
        a = arnoVar;
        aonm.registerDefaultInstance(arno.class, arnoVar);
    }

    private arno() {
    }

    public static /* synthetic */ void a(arno arnoVar) {
        arnoVar.i |= 1;
        arnoVar.b = true;
    }

    public static /* synthetic */ void b(arno arnoVar) {
        arnoVar.i |= 2;
        arnoVar.c = true;
    }

    public static /* synthetic */ void c(arno arnoVar) {
        arnoVar.i |= 4;
        arnoVar.d = true;
    }

    public static /* synthetic */ void d(arno arnoVar) {
        arnoVar.i |= 8;
        arnoVar.e = true;
    }

    public static /* synthetic */ void e(arno arnoVar) {
        arnoVar.i |= 16;
        arnoVar.f = true;
    }

    public static /* synthetic */ void f(arno arnoVar) {
        arnoVar.i |= 32;
        arnoVar.g = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006ဇ\u0001", new Object[]{"i", "b", "d", "e", "f", "g", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new arno();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arno.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
