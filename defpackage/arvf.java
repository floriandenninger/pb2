package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arvf extends aonm implements aooz {
    public static final arvf a;
    private static volatile aopf h;
    public int b;
    public double c;
    public double d;
    public String e = "";
    public String f = "";
    public int g = 1;

    static {
        arvf arvfVar = new arvf();
        a = arvfVar;
        aonm.registerDefaultInstance(arvf.class, arvfVar);
    }

    private arvf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", asaq.m});
            case NEW_MUTABLE_INSTANCE:
                return new arvf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arvf.class) {
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
