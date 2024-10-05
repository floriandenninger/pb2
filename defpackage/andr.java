package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andr extends aonm implements aooz {
    public static final andr a;
    private static volatile aopf b;
    private int c;
    private andq d;
    private int f;
    private andu g;
    private byte h = 2;
    private String e = "";

    static {
        andr andrVar = new andr();
        a = andrVar;
        aonm.registerDefaultInstance(andr.class, andrVar);
    }

    private andr() {
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new andr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (andr.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
