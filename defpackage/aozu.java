package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozu extends aonm implements aooz {
    public static final aozu a;
    private static volatile aopf d;
    public int b;
    public atdh c;
    private apmg e;
    private aozt f;
    private byte g = 2;

    static {
        aozu aozuVar = new aozu();
        a = aozuVar;
        aonm.registerDefaultInstance(aozu.class, aozuVar);
    }

    private aozu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueb11ἑ\uf543㭚\u0003\u0000\u0000\u0003\ueb11ἑᐉ\u0000\ue97d✹ᐉ\u0002\uf543㭚ᐉ\u0001", new Object[]{"b", "e", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aozu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aozu.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
