package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzw extends aonm implements aooz {
    public static final akzw a;
    private static volatile aopf h;
    public int b;
    public int e;
    public akzu g;
    public String c = "";
    public String d = "";
    public aony f = aonm.emptyProtobufList();

    static {
        akzw akzwVar = new akzw();
        a = akzwVar;
        aonm.registerDefaultInstance(akzw.class, akzwVar);
    }

    private akzw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u001a\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", akzv.b(), "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new akzw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (akzw.class) {
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
