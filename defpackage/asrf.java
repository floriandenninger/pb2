package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrf extends aonm implements aooz {
    public static final asrf a;
    private static volatile aopf i;
    public int b;
    public arfs c;
    public aqyg d;
    public aulq e;
    public apxf f;
    private byte j = 2;
    public aony g = emptyProtobufList();
    public aony h = emptyProtobufList();

    static {
        asrf asrfVar = new asrf();
        a = asrfVar;
        aonm.registerDefaultInstance(asrf.class, asrfVar);
    }

    private asrf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0006\u0001ᐉ\u0001\u0002Л\u0003Л\u0004ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "d", "g", asre.class, "h", asrg.class, "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asrf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (asrf.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
