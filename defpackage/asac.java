package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asac extends aonm implements aooz {
    public static final asac a;
    private static volatile aopf e;
    public arnd b;
    private int f;
    private aulq g;
    private aota h;
    private aqzg i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public aomf d = aomf.b;

    static {
        asac asacVar = new asac();
        a = asacVar;
        aonm.registerDefaultInstance(asac.class, asacVar);
    }

    private asac() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0001̉ᐉ\u0004", new Object[]{"f", "b", "c", asaj.class, "h", "d", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asac();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asac.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
